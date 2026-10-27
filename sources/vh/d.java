package vh;

import ag.h0;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import s4.n0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d extends n0 {
    public final h0 a = new h0(2);
    public final /* synthetic */ u6 b;
    public final /* synthetic */ f c;

    public d(f fVar, u6 u6Var) {
        this.c = fVar;
        this.b = u6Var;
    }

    @Override // s4.n0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.g0.getTranslationY()) + ((int) fVar.X.f));
        int w02 = y6.w0(y6.h5, this.b);
        h0 h0Var = this.a;
        h0Var.b(w02);
        h0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        h0Var.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
