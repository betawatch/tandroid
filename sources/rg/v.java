package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.gu0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class v implements qg.u {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ gu0 c;

    public v(gu0 gu0Var, Bitmap bitmap) {
        this.c = gu0Var;
        this.b = bitmap;
    }

    @Override // qg.u
    public final void a() {
        this.a = true;
    }

    @Override // qg.u
    public final void b(Canvas canvas) {
        d0 d0Var = this.c.W0;
        Matrix matrix = d0Var.getMatrix();
        canvas.save();
        canvas.translate(d0Var.getX(), d0Var.getY());
        canvas.concat(matrix);
        float width = d0Var.getWidth();
        Bitmap bitmap = this.b;
        canvas.scale(width / bitmap.getWidth(), d0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
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
        gu0 gu0Var = this.c;
        gu0Var.x0(false);
        qg.s0 s0Var = gu0Var.V1;
        s0Var.h(i10, true);
        s0Var.g();
        gu0Var.setNewColor(i10);
        k0 k0Var = gu0Var.G1;
        k0Var.setSelectedColorIndex(s0Var.d());
        k0Var.getAdapter().l();
    }
}
