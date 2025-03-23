package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.services.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/journal") //add a mapping to this whole class
public class JournalEntryControllerV2 {


    @Autowired
    private JournalEntryService journalEntryService;



    /*Methods inside a controller class should
     be public so that they can be accessed and invoked
     by the Spring Framework or External HTTP Requests
     */

    @GetMapping // endpoint becomes "localhost:8080/journal GET"
    public List<JournalEntry> getAll() {
        return journalEntryService.getAll();
    }

    @PostMapping // endpoint becomes "localhost:8080/journal GET"
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry) { //Request body takes data from request and converts it into a java object
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myId) { //setting up end point for a specific entry
        //return JournalEntryService.findByID(myId).orElse(null);
        return journalEntryService.findById(myId).orElse(null);


    }

    @DeleteMapping("id/{myId}")
    public boolean deleteJournalEntryById(@PathVariable ObjectId myId) { //deleting entry by id
        journalEntryService.deleteById(myId);
        return true;
    }

    //update entry
    @PutMapping("id/{myId}")
    public JournalEntry updateJournalById(@PathVariable ObjectId myId, @RequestBody JournalEntry newEntry) {
        JournalEntry old = journalEntryService.findById(myId).orElse(null);
        if (old != null) {
            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;
    }

}































