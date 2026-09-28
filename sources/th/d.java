package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import s4.n0;
import yf.y;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
