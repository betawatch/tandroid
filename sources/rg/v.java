package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.jt0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class v implements qg.v {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ jt0 c;

    public v(jt0 jt0Var, Bitmap bitmap) {
        this.c = jt0Var;
        this.b = bitmap;
    }

    @Override // qg.v
    public final void a() {
        this.a = true;
    }

    @Override // qg.v
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
        jt0 jt0Var = this.c;
        jt0Var.w0(false);
        qg.u0 u0Var = jt0Var.V1;
        u0Var.h(i10, true);
        u0Var.g();
        jt0Var.setNewColor(i10);
        j0 j0Var = jt0Var.G1;
        j0Var.setSelectedColorIndex(u0Var.d());
        j0Var.getAdapter().l();
    }
}
