package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.c0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import v4.m0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e extends m0 {
    public final c0 a = new c0(2);
    public final /* synthetic */ f6 b;
    public final /* synthetic */ g c;

    public e(g gVar, f6 f6Var) {
        this.c = gVar;
        this.b = f6Var;
    }

    @Override // v4.m0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.c;
        int max = Math.max(0, g0.L(80.0f) + ((int) gVar.Y1.getTranslationY()) + ((int) gVar.P1.f));
        int w02 = k6.w0(k6.h5, this.b);
        c0 c0Var = this.a;
        c0Var.b(w02);
        c0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        c0Var.draw(canvas);
        gVar.e1();
        gVar.f1();
    }
}
