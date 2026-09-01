package qh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class i4 implements dg.y {
    public boolean a;
    public final /* synthetic */ dg.e1 b;
    public final /* synthetic */ f9 c;

    public i4(f9 f9Var, dg.e1 e1Var) {
        this.c = f9Var;
        this.b = e1Var;
    }

    @Override // dg.y
    public final void a() {
        this.a = true;
    }

    @Override // dg.y
    public final void b(Canvas canvas) {
        s4 s4Var = this.c.L0;
        Matrix matrix = s4Var.getMatrix();
        canvas.save();
        canvas.translate(s4Var.getX(), s4Var.getY());
        canvas.concat(matrix);
        s4Var.getWidth();
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
        f9 f9Var = this.c;
        f9Var.I0(false);
        dg.e1 e1Var = this.b;
        e1Var.h(i10, true);
        e1Var.g();
        f9Var.setNewColor(i10);
        h4 h4Var = f9Var.t1;
        h4Var.setSelectedColorIndex(e1Var.d());
        h4Var.getAdapter().l();
    }
}
