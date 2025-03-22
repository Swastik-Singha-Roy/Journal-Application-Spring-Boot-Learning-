package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal") //add a mapping to this whole class
public class JournalEntryControllerV2 {


    /*Methods inside a controller class should
     be public so that they can be accessed and invoked
     by the Spring Framework or External HTTP Requests
     */

    @GetMapping() // endpoint becomes "localhost:8080/journal GET"
    public List<JournalEntry> getAll() {

        return null;
    }

    @PostMapping // endpoint becomes "localhost:8080/journal GET"
    public boolean createEntry(@RequestBody JournalEntry myEntry) { //Request body takes data from request and converts it into a java object
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId) { //setting up end point for a specific entry

        return null;

    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId) { //deleting entry by id

        return null;
    }

    //update entry
    @PutMapping("id/{myId}")
    public JournalEntry updateJournalById(@PathVariable Long myId, @RequestBody JournalEntry myEntry) {

        return null;
    }

}































