package designPrincipal.second;

import designPrincipal.first.Player;

public class Result {


    private final boolean isDraw;
    private final designPrincipal.first.Player winner;

    public Result(boolean isDraw, designPrincipal.first.Player winner) {
        this.isDraw = isDraw;
        this.winner = winner;
    }

    public boolean isDraw() {
        return isDraw;
    }

    public Player getWinner() {
        return winner;
    }
}
