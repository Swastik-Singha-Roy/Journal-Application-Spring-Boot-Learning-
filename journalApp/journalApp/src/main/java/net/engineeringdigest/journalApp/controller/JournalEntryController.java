package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/journal") //add a mapping to this whole class
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>(); //Long is the id

    /*Methods inside a controller class should
     be public so that they can be accessed and invoked
     by the Spring Framework or External HTTP Requests
     */

    @GetMapping() // endpoint becomes "localhost:8080/journal GET"
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping // endpoint becomes "localhost:8080/journal GET"
    public boolean createEntry(@RequestBody JournalEntry myEntry) { //Request body takes data from request and converts it into a java object
        journalEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId) { //setting up end point for a specific entry
        return journalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId) { //deleting entry by id
        return journalEntries.remove(myId);
    }

    //update entry
    @PutMapping("id/{myId}")
    public JournalEntry updateJournalById(@PathVariable Long myId, @RequestBody JournalEntry myEntry) {
        return journalEntries.put(myId, myEntry);
    }

}
