package zf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u implements yf.u {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ ys0 c;

    public u(ys0 ys0Var, Bitmap bitmap) {
        this.c = ys0Var;
        this.b = bitmap;
    }

    @Override // yf.u
    public final void a() {
        this.a = true;
    }

    @Override // yf.u
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

    @Override // yf.u
    public final boolean c() {
        return this.a;
    }

    @Override // yf.u
    public final void d() {
        this.a = false;
    }

    @Override // yf.u
    public final View e() {
        return this.c;
    }

    @Override // yf.u
    public final FrameLayout f() {
        return this.c.a1;
    }

    @Override // yf.u
    public final boolean g() {
        return this.b != null;
    }

    @Override // yf.u
    public final void h(int i10) {
        ys0 ys0Var = this.c;
        ys0Var.w0(false);
        yf.r0 r0Var = ys0Var.R1;
        r0Var.h(i10, true);
        r0Var.g();
        ys0Var.setNewColor(i10);
        i0 i0Var = ys0Var.C1;
        i0Var.setSelectedColorIndex(r0Var.d());
        i0Var.getAdapter().l();
    }
}
