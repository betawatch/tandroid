package qh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h4 implements dg.y {
    public boolean a;
    public final /* synthetic */ dg.e1 b;
    public final /* synthetic */ e9 c;

    public h4(e9 e9Var, dg.e1 e1Var) {
        this.c = e9Var;
        this.b = e1Var;
    }

    @Override // dg.y
    public final void a() {
        this.a = true;
    }

    @Override // dg.y
    public final void b(Canvas canvas) {
        r4 r4Var = this.c.L0;
        Matrix matrix = r4Var.getMatrix();
        canvas.save();
        canvas.translate(r4Var.getX(), r4Var.getY());
        canvas.concat(matrix);
        r4Var.getWidth();
        throw null;
    }

    @Override // dg.y
    public final boolean c() {
        return this.a;
    }

    @Override // dg.y
    public final void d() {
        this.a = false;
    }

    @Override // dg.y
    public final View e() {
        return this.c;
    }

    @Override // dg.y
    public final FrameLayout f() {
        return this.c.S0;
    }

    @Override // dg.y
    public final boolean g() {
        return false;
    }

    @Override // dg.y
    public final void h(int i10) {
        e9 e9Var = this.c;
        e9Var.I0(false);
        dg.e1 e1Var = this.b;
        e1Var.h(i10, true);
        e1Var.g();
        e9Var.setNewColor(i10);
        g4 g4Var = e9Var.t1;
        g4Var.setSelectedColorIndex(e1Var.d());
        g4Var.getAdapter().l();
    }
}
