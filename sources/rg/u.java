package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.gt0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class u implements qg.v {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ gt0 c;

    public u(gt0 gt0Var, Bitmap bitmap) {
        this.c = gt0Var;
        this.b = bitmap;
    }

    @Override // qg.v
    public final void a() {
        this.a = true;
    }

    @Override // qg.v
    public final void b(Canvas canvas) {
        b0 b0Var = this.c.W0;
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

    @Override // qg.v
    public final boolean c() {
        return this.a;
    }

    @Override // qg.v
    public final void d() {
        this.a = false;
    }

    @Override // qg.v
    public final View e() {
        return this.c;
    }

    @Override // qg.v
    public final FrameLayout f() {
        return this.c.e1;
    }

    @Override // qg.v
    public final boolean g() {
        return this.b != null;
    }

    @Override // qg.v
    public final void h(int i10) {
        gt0 gt0Var = this.c;
        gt0Var.x0(false);
        qg.v0 v0Var = gt0Var.V1;
        v0Var.h(i10, true);
        v0Var.g();
        gt0Var.setNewColor(i10);
        i0 i0Var = gt0Var.G1;
        i0Var.setSelectedColorIndex(v0Var.d());
        i0Var.getAdapter().l();
    }
}
