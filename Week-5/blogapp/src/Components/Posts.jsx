import  React from 'react'
import{Component}from 'react'
import Post from './Post.js'
class Posts extends Component{
    constructor(props){

    super(props);

    this.state = {
        posts : []
    };
}

loadPosts = () => {
    fetch("https://jsonplaceholder.typicode.com/posts")
    .then((response) => response.json())
    .then((data)=>{

        let posts = data.map((post)=>{
            return new Post(post.id,post.title,post.body)
        });

        this.setState({
            posts : posts
        })
    })
}

componentDidMount(){
    this.loadPosts();
}

componentDidCatch(error){

alert(error);

}

render(){
    return(
        <div>
            <h1>Blog Posts</h1>
            {
                this.state.posts.map((post)=>{
                    <div key={post.id}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                    </div>
                })
            }
        </div>
    )
}

}
export default Posts;