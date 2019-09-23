package com.Controller;

//import com.Bean.Book;
//import com.Service.ReadingListRep;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/")
//public class ReadinglistController {
//    private ReadingListRep readingListRep;
//
//    @Autowired
//    public ReadinglistController(ReadingListRep readingListRep) {
//        this.readingListRep = readingListRep;
//    }
//
//    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
//    public String readersBooks(@PathVariable("reader") String reader, Model model) {
//
//        List<Book> readingList = readingListRep.findByReader(reader);
//        if (readingList != null) {
//            model.addAttribute("books", readingList);
//        }
//        return "readingList";
//    }
//
//    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
//    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
//        book.setReader(reader);
//        readingListRep.save(book);
//        return "redirect:/{reader}";
//    }
//
//}


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

}