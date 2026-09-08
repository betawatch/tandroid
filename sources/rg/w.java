package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class w implements qg.u {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ zt0 c;

    public w(zt0 zt0Var, Bitmap bitmap) {
        this.c = zt0Var;
        this.b = bitmap;
    }

    @Override // qg.u
    public final void a() {
        this.a = true;
    }

    @Override // qg.u
    public final void b(Canvas canvas) {
        e0 e0Var = this.c.W0;
        Matrix matrix = e0Var.getMatrix();
        canvas.save();
        canvas.translate(e0Var.getX(), e0Var.getY());
        canvas.concat(matrix);
        float width = e0Var.getWidth();
        Bitmap bitmap = this.b;
        canvas.scale(width / bitmap.getWidth(), e0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // qg.u
    public final boolean c() {
        return this.a;
    }

    @Override // qg.u
    public final void d() {
        this.a = false;
    }

    @Override // qg.u
    public final View e() {
        return this.c;
    }

    @Override // qg.u
    public final FrameLayout f() {
        return this.c.e1;
    }

    @Override // qg.u
    public final boolean g() {
        return this.b != null;
    }

    @Override // qg.u
    public final void h(int i10) {
        zt0 zt0Var = this.c;
        zt0Var.w0(false);
        qg.s0 s0Var = zt0Var.V1;
        s0Var.h(i10, true);
        s0Var.g();
        zt0Var.setNewColor(i10);
        l0 l0Var = zt0Var.G1;
        l0Var.setSelectedColorIndex(s0Var.d());
        l0Var.getAdapter().l();
    }
}
