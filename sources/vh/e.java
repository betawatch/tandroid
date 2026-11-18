package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.d0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import v4.o0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e extends o0 {
    public final d0 a = new d0(2);
    public final /* synthetic */ i6 b;
    public final /* synthetic */ g c;

    public e(g gVar, i6 i6Var) {
        this.c = gVar;
        this.b = i6Var;
    }

    @Override // v4.o0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.c;
        int max = Math.max(0, g0.L(80.0f) + ((int) gVar.c2.getTranslationY()) + ((int) gVar.T1.f));
        int w02 = n6.w0(n6.h5, this.b);
        d0 d0Var = this.a;
        d0Var.b(w02);
        d0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        d0Var.draw(canvas);
        gVar.f1();
        gVar.g1();
    }
}
