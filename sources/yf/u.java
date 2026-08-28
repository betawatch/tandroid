package yf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u implements xf.u {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ xs0 c;

    public u(xs0 xs0Var, Bitmap bitmap) {
        this.c = xs0Var;
        this.b = bitmap;
    }

    @Override // xf.u
    public final void a() {
        this.a = true;
    }

    @Override // xf.u
    public final void b(Canvas canvas) {
        b0 b0Var = this.c.S0;
        Matrix matrix = b0Var.getMatrix();
        canvas.save();
        canvas.translate(b0Var.getX(), b0Var.getY());
        canvas.concat(matrix);
        float width = b0Var.getWidth();
        Bitmap bitmap = this.b;
        canvas.scale(width / bitmap.getWidth(), b0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // xf.u
    public final boolean c() {
        return this.a;
    }

    @Override // xf.u
    public final void d() {
        this.a = false;
    }

    @Override // xf.u
    public final View e() {
        return this.c;
    }

    @Override // xf.u
    public final FrameLayout f() {
        return this.c.a1;
    }

    @Override // xf.u
    public final boolean g() {
        return this.b != null;
    }

    @Override // xf.u
    public final void h(int i9) {
        xs0 xs0Var = this.c;
        xs0Var.w0(false);
        xf.s0 s0Var = xs0Var.R1;
        s0Var.h(i9, true);
        s0Var.g();
        xs0Var.setNewColor(i9);
        i0 i0Var = xs0Var.C1;
        i0Var.setSelectedColorIndex(s0Var.d());
        i0Var.getAdapter().l();
    }
}
