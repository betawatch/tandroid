package ph;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class i4 implements cg.y {
    public boolean a;
    public final /* synthetic */ cg.f1 b;
    public final /* synthetic */ h9 c;

    public i4(h9 h9Var, cg.f1 f1Var) {
        this.c = h9Var;
        this.b = f1Var;
    }

    @Override // cg.y
    public final void a() {
        this.a = true;
    }

    @Override // cg.y
    public final void b(Canvas canvas) {
        s4 s4Var = this.c.L0;
        Matrix matrix = s4Var.getMatrix();
        canvas.save();
        canvas.translate(s4Var.getX(), s4Var.getY());
        canvas.concat(matrix);
        s4Var.getWidth();
        throw null;
    }

    @Override // cg.y
    public final boolean c() {
        return this.a;
    }

    @Override // cg.y
    public final void d() {
        this.a = false;
    }

    @Override // cg.y
    public final View e() {
        return this.c;
    }

    @Override // cg.y
    public final FrameLayout f() {
        return this.c.S0;
    }

    @Override // cg.y
    public final boolean g() {
        return false;
    }

    @Override // cg.y
    public final void h(int i10) {
        h9 h9Var = this.c;
        h9Var.I0(false);
        cg.f1 f1Var = this.b;
        f1Var.h(i10, true);
        f1Var.g();
        h9Var.setNewColor(i10);
        h4 h4Var = h9Var.t1;
        h4Var.setSelectedColorIndex(f1Var.d());
        h4Var.getAdapter().l();
    }
}
