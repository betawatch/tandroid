package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import s4.n0;
import yf.y;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class d extends n0 {
    public final y a = new y(2);
    public final /* synthetic */ d6 b;
    public final /* synthetic */ f c;

    public d(f fVar, d6 d6Var) {
        this.c = fVar;
        this.b = d6Var;
    }

    @Override // s4.n0
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.g0.getTranslationY()) + ((int) fVar.X.e));
        int v02 = h6.v0(h6.h5, this.b);
        y yVar = this.a;
        yVar.b(v02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
