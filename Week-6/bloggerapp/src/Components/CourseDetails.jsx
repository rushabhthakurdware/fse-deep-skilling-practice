function CourseDetails(){

const courses=[

{
id:1,
name:"Java Full Stack"
},

{
id:2,
name:"React Development"
},

{
id:3,
name:"AWS Cloud"
}

];


return(

<div>

<h2>
Course Details
</h2>


{
courses.map((course)=>(

<p key={course.id}>
{course.name}
</p>

))

}


</div>

)

}


export default CourseDetails;