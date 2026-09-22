package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        au0Var.w0(false);
        pg.u0 u0Var = au0Var.V1;
        u0Var.h(i10, true);
        u0Var.g();
        au0Var.setNewColor(i10);
        k0 k0Var = au0Var.G1;
        k0Var.setSelectedColorIndex(u0Var.d());
        k0Var.getAdapter().l();
    }
}
