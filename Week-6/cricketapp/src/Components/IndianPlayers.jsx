const IndianPlayers = () =>{
    const team = [
    "Rohit",
    "Virat",
    "Gill",
    "Rahul",
    "Pant",
    "Hardik"
  ];

  const oddPlayers = team.filter((_, index) => index % 2 === 0);
  const evenPlayers = team.filter((_, index) => index % 2 !== 0);

  return (
    <>
        <h2>Odd Players</h2>
            {oddPlayers.map((player, index) => (
                <p key={index}>{player}</p>
            ))}
            <p>These are the odd players:</p>

        <h2>Even Players</h2>
            <p>These are the even players:</p>
            {evenPlayers.map((player, index) => (
            <p key={index}>{player}</p>
            ))}

        
    </>
  );
}
export default IndianPlayers;