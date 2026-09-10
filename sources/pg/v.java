package pg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v implements og.v {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ zt0 c;

    public v(zt0 zt0Var, Bitmap bitmap) {
        this.c = zt0Var;
        this.b = bitmap;
    }

    @Override // og.v
    public final void a() {
        this.a = true;
    }

    @Override // og.v
    public final void b(Canvas canvas) {
        c0 c0Var = this.c.W0;
        Matrix matrix = c0Var.getMatrix();
        canvas.save();
        canvas.translate(c0Var.getX(), c0Var.getY());
        canvas.concat(matrix);
        float width = c0Var.getWidth();
        Bitmap bitmap = this.b;
        canvas.scale(width / bitmap.getWidth(), c0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // og.v
    public final boolean c() {
        return this.a;
    }

    @Override // og.v
    public final void d() {
        this.a = false;
    }

    @Override // og.v
    public final View e() {
        return this.c;
    }

    @Override // og.v
    public final FrameLayout f() {
        return this.c.e1;
    }

    @Override // og.v
    public final boolean g() {
        return this.b != null;
    }

    @Override // og.v
    public final void h(int i10) {
        zt0 zt0Var = this.c;
        zt0Var.w0(false);
        og.x0 x0Var = zt0Var.V1;
        x0Var.h(i10, true);
        x0Var.g();
        zt0Var.setNewColor(i10);
        j0 j0Var = zt0Var.G1;
        j0Var.setSelectedColorIndex(x0Var.d());
        j0Var.getAdapter().l();
    }
}
