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
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        journalEntries.put(myEntry.getId(), myEntry);
        return true;
    }

}
