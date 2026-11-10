package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.c0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import v4.m0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e extends m0 {
    public final c0 a = new c0(2);
    public final /* synthetic */ h6 b;
    public final /* synthetic */ g c;

    public e(g gVar, h6 h6Var) {
        this.c = gVar;
        this.b = h6Var;
    }

    @Override // v4.m0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.c;
        int max = Math.max(0, g0.L(80.0f) + ((int) gVar.b2.getTranslationY()) + ((int) gVar.S1.f));
        int w02 = m6.w0(m6.h5, this.b);
        c0 c0Var = this.a;
        c0Var.b(w02);
        c0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        c0Var.draw(canvas);
        gVar.e1();
        gVar.f1();
    }
}
