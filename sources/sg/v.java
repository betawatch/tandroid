package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.pt0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v implements rg.v {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ pt0 c;

    public v(pt0 pt0Var, Bitmap bitmap) {
        this.c = pt0Var;
        this.b = bitmap;
    }

    @Override // rg.v
    public final void a() {
        this.a = true;
    }

    @Override // rg.v
    public final void b(Canvas canvas) {
        c0 c0Var = this.c.L0;
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

    @Override // rg.v
    public final boolean c() {
        return this.a;
    }

    @Override // rg.v
    public final void d() {
        this.a = false;
    }

    @Override // rg.v
    public final View e() {
        return this.c;
    }

    @Override // rg.v
    public final FrameLayout f() {
        return this.c.T0;
    }

    @Override // rg.v
    public final boolean g() {
        return this.b != null;
    }

    @Override // rg.v
    public final void h(int i10) {
        pt0 pt0Var = this.c;
        pt0Var.v0(false);
        rg.s0 s0Var = pt0Var.K1;
        s0Var.h(i10, true);
        s0Var.g();
        pt0Var.setNewColor(i10);
        j0 j0Var = pt0Var.v1;
        j0Var.setSelectedColorIndex(s0Var.d());
        j0Var.getAdapter().l();
    }
}
