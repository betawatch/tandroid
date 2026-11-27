// default package

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class py2 extends p79 {
    public final n15 a = new n15(2);
    public final /* synthetic */ vnb b;
    public final /* synthetic */ ry2 c;

    public py2(ry2 ry2Var, vnb vnbVar) {
        this.c = ry2Var;
        this.b = vnbVar;
    }

    @Override // p79
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        ry2 ry2Var = this.c;
        int max = Math.max(0, hl.L(80.0f) + ((int) ry2Var.b2.getTranslationY()) + ((int) ry2Var.S1.f));
        int v0 = aob.v0(aob.h5, this.b);
        n15 n15Var = this.a;
        n15Var.b(v0);
        n15Var.setBounds(0, max, recyclerView.getWidth(), hl.L(8.0f) + max);
        n15Var.draw(canvas);
        ry2Var.Z0();
        ry2Var.a1();
    }
}
