package uh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import s4.m0;
import zf.z;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class d extends m0 {
    public final z a = new z(2);
    public final /* synthetic */ c6 b;
    public final /* synthetic */ f c;

    public d(f fVar, c6 c6Var) {
        this.c = fVar;
        this.b = c6Var;
    }

    @Override // s4.m0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.g0.getTranslationY()) + ((int) fVar.X.e));
        int w02 = g6.w0(g6.h5, this.b);
        z zVar = this.a;
        zVar.b(w02);
        zVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        zVar.draw(canvas);
        fVar.R();
        fVar.S();
    }
}
