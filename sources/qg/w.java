package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class w implements pg.u {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ au0 c;

    public w(au0 au0Var, Bitmap bitmap) {
        this.c = au0Var;
        this.b = bitmap;
    }

    @Override // pg.u
    public final void a() {
        this.a = true;
    }

    @Override // pg.u
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

    @Override // pg.u
    public final boolean c() {
        return this.a;
    }

    @Override // pg.u
    public final void d() {
        this.a = false;
    }

    @Override // pg.u
    public final View e() {
        return this.c;
    }

    @Override // pg.u
    public final FrameLayout f() {
        return this.c.e1;
    }

    @Override // pg.u
    public final boolean g() {
        return this.b != null;
    }

    @Override // pg.u
    public final void h(int i10) {
        au0 au0Var = this.c;
        au0Var.x0(false);
        pg.s0 s0Var = au0Var.V1;
        s0Var.h(i10, true);
        s0Var.g();
        au0Var.setNewColor(i10);
        l0 l0Var = au0Var.G1;
        l0Var.setSelectedColorIndex(s0Var.d());
        l0Var.getAdapter().l();
    }
}
