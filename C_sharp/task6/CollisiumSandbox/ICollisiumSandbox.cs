namespace GameStuff;
using GameStuff.Cards;

public interface ICollisiumSandbox
{
  void AskPlayers(IPlayer p1, IPlayer p2,IDeckShuffler shuffler, Card[] deck, int id);
}