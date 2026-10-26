package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.nt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w implements rg.v {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ nt0 c;

    public w(nt0 nt0Var, Bitmap bitmap) {
        this.c = nt0Var;
        this.b = bitmap;
    }

    @Override // rg.v
    public final void a() {
        this.a = true;
    }

    @Override // rg.v
    public final void b(Canvas canvas) {
        d0 d0Var = this.c.L0;
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
        nt0 nt0Var = this.c;
        nt0Var.v0(false);
        rg.s0 s0Var = nt0Var.K1;
        s0Var.h(i10, true);
        s0Var.g();
        nt0Var.setNewColor(i10);
        k0 k0Var = nt0Var.v1;
        k0Var.setSelectedColorIndex(s0Var.d());
        k0Var.getAdapter().l();
    }
}
