package gui.renderers;

import org.junit.Test;

import javax.swing.*;

import static builders.PawnBuilder.aPawn;
import static gui.renderers.PieceRenderer.PIECE_BLACK;
import static gui.renderers.PieceRenderer.PIECE_WHITE;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class PawnRendererTest {

    JButton button = new JButton();

    @Test public void
    buttonVisitSetsTextToP() {
        button.setText( "some text" );
        new PawnRenderer( aPawn().build() ).visit( button );
        assertThat( button.getText(), equalTo( "P") );
    }
    
    @Test public void
    buttonVisitSetsForegroundToWhiteForAWhitePawn() {
        button.setForeground( PIECE_BLACK);
        new PawnRenderer( aPawn().white().build() ).visit( button );
        assertThat( button.getForeground(), equalTo( PIECE_WHITE ));
    }

    @Test public void
    buttonVisitSetsForegroundToBlackForABlackPawn() {
        button.setForeground( PIECE_WHITE);
        new PawnRenderer( aPawn().black().build() ).visit( button );
        assertThat( button.getForeground(), equalTo( PIECE_BLACK ));
    }
    
}