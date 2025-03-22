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

        return null;

    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable ObjectId myId) { //deleting entry by id

        return null;
    }

    //update entry
    @PutMapping("id/{myId}")
    public JournalEntry updateJournalById(@PathVariable ObjectId myId, @RequestBody JournalEntry myEntry) {

        return null;
    }

}































