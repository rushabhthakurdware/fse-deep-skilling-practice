const players = [
  { name: "Rohit", score: 95 },
  { name: "Virat", score: 88 },
  { name: "Gill", score: 72 },
  { name: "Hardik", score: 65 },
  { name: "Surya", score: 91 },
  { name: "Rahul", score: 68 },
  { name: "Pant", score: 76 },
  { name: "Jadeja", score: 80 },
  { name: "Bumrah", score: 55 },
  { name: "Shami", score: 61 },
  { name: "Siraj", score: 49 }
];

const ListOfPlayers = ()=>{
    const below70 = players.filter(player => player.score < 70);
    return(
        <>
            <h2>All Players</h2>
            {players.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
      ))}
            <h2>Players with Score Below 70</h2>
            <p>These players have a score below 70:</p>
            {below70.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
      ))}
        </>
    )
}

export default ListOfPlayers;