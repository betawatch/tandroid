package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.c0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import v4.n0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f extends n0 {
    public final c0 a = new c0(2);
    public final /* synthetic */ e6 b;
    public final /* synthetic */ h c;

    public f(h hVar, e6 e6Var) {
        this.c = hVar;
        this.b = e6Var;
    }

    @Override // v4.n0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        h hVar = this.c;
        int max = Math.max(0, g0.L(80.0f) + ((int) hVar.c2.getTranslationY()) + ((int) hVar.T1.f));
        int w02 = j6.w0(j6.h5, this.b);
        c0 c0Var = this.a;
        c0Var.b(w02);
        c0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        c0Var.draw(canvas);
        hVar.e1();
        hVar.f1();
    }
}
