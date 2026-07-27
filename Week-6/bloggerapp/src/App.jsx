import {useState} from "react";

import BookDetails from "./Components/BookDetails";

import BlogDetails from "./Components/BlogDetails";

import CourseDetails from "./Components/CourseDetails";


function App(){


const [type,setType]=useState("book");



let component;



// Element variable

if(type==="book"){

component=<BookDetails/>

}

else if(type==="blog"){

component=<BlogDetails/>

}

else{

component=<CourseDetails/>

}



return(

<div>


<h1>
Blogger App
</h1>



<button
onClick={()=>setType("book")}
>
Books
</button>



<button
onClick={()=>setType("blog")}
>
Blogs
</button>



<button
onClick={()=>setType("course")}
>
Courses
</button>



<hr/>


{component}



</div>

)

}


export default App;