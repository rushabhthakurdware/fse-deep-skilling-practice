function BlogDetails(){

const blogs=[

{
id:1,
title:"React Introduction",
writer:"John"
},

{
id:2,
title:"Spring Boot Tutorial",
writer:"Mike"
}

];


return(

<div>

<h2>
Blog Details
</h2>


{
blogs.map((blog)=>(

<div key={blog.id}>

<h3>
{blog.title}
</h3>


<p>
Writer : {blog.writer}
</p>


</div>

))

}


</div>

)

}


export default BlogDetails;