package xh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.w4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p {
    public final RectF a = new RectF();
    public final t5 b;
    public final t5 c;
    public final t5 d;
    public final t5 e;
    public final w4 f;
    public final w4 g;
    public final t5 h;
    public final t5 i;
    public final dc j;
    public final Paint k;
    public final e6 l;
    public int m;
    public final org.telegram.ui.Cells.y n;
    public final kp o;
    public final org.telegram.ui.Components.voip.g p;

    public p(r rVar) {
        gr grVar = gr.h;
        this.b = new t5(rVar, 0L, 320L, grVar);
        this.c = new t5(rVar, 0L, 320L, grVar);
        this.d = new t5(rVar, 0L, 320L, grVar);
        this.e = new t5(rVar, 0L, 320L, grVar);
        this.f = new w4(rVar, 320L, grVar, 0);
        this.g = new w4(rVar, 320L, grVar, 0);
        this.h = new t5(rVar, 0L, 320L, grVar);
        this.i = new t5(rVar, 0L, 320L, grVar);
        this.j = new dc(rVar);
        this.k = new Paint(1);
        e6 e6Var = new e6(true, false, true);
        this.l = e6Var;
        org.telegram.ui.Cells.y a02 = t6.a0(0, 9, 9);
        this.n = a02;
        kp kpVar = new kp(-1);
        this.o = kpVar;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.p = gVar;
        e6Var.b = 17;
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.M = org.telegram.messenger.i0.q.x * 4;
        e6Var.q(true);
        e6Var.setCallback(rVar);
        kpVar.setCallback(rVar);
        a02.setCallback(rVar);
        gVar.l = true;
        gVar.m = 2.0f;
    }
}
