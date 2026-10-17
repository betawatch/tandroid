package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.it0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class u implements qg.v {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ it0 c;

    public u(it0 it0Var, Bitmap bitmap) {
        this.c = it0Var;
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
        it0 it0Var = this.c;
        it0Var.x0(false);
        qg.u0 u0Var = it0Var.V1;
        u0Var.h(i10, true);
        u0Var.g();
        it0Var.setNewColor(i10);
        i0 i0Var = it0Var.G1;
        i0Var.setSelectedColorIndex(u0Var.d());
        i0Var.getAdapter().l();
    }
}
