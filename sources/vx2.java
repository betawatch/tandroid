// default package

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vx2 extends c49 {
    public final jz4 a = new jz4(2);
    public final /* synthetic */ wjb b;
    public final /* synthetic */ xx2 c;

    public vx2(xx2 xx2Var, wjb wjbVar) {
        this.c = xx2Var;
        this.b = wjbVar;
    }

    @Override // c49
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        xx2 xx2Var = this.c;
        int max = Math.max(0, gl.L(80.0f) + ((int) xx2Var.b2.getTranslationY()) + ((int) xx2Var.S1.f));
        int v0 = bkb.v0(bkb.g5, this.b);
        jz4 jz4Var = this.a;
        jz4Var.b(v0);
        jz4Var.setBounds(0, max, recyclerView.getWidth(), gl.L(8.0f) + max);
        jz4Var.draw(canvas);
        xx2Var.Y0();
        xx2Var.Z0();
    }
}
