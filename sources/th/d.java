package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import s4.n0;
import yf.z;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class d extends n0 {
    public final z a = new z(2);
    public final /* synthetic */ e6 b;
    public final /* synthetic */ f c;

    public d(f fVar, e6 e6Var) {
        this.c = fVar;
        this.b = e6Var;
    }

    @Override // s4.n0
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.g0.getTranslationY()) + ((int) fVar.X.e));
        int v02 = j6.v0(j6.h5, this.b);
        z zVar = this.a;
        zVar.b(v02);
        zVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        zVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
