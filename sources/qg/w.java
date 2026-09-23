package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.tt0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class w implements pg.u {
    public boolean a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ tt0 c;

    public w(tt0 tt0Var, Bitmap bitmap) {
        this.c = tt0Var;
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
        tt0 tt0Var = this.c;
        tt0Var.x0(false);
        pg.t0 t0Var = tt0Var.V1;
        t0Var.h(i10, true);
        t0Var.g();
        tt0Var.setNewColor(i10);
        l0 l0Var = tt0Var.G1;
        l0Var.setSelectedColorIndex(t0Var.d());
        l0Var.getAdapter().l();
    }
}
