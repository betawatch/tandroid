package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.d0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import v4.o0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class e extends o0 {
    public final d0 a = new d0(2);
    public final /* synthetic */ h6 b;
    public final /* synthetic */ g c;

    public e(g gVar, h6 h6Var) {
        this.c = gVar;
        this.b = h6Var;
    }

    @Override // v4.o0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.c;
        int max = Math.max(0, g0.L(80.0f) + ((int) gVar.c2.getTranslationY()) + ((int) gVar.T1.f));
        int w02 = m6.w0(m6.h5, this.b);
        d0 d0Var = this.a;
        d0Var.b(w02);
        d0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        d0Var.draw(canvas);
        gVar.f1();
        gVar.g1();
    }
}
