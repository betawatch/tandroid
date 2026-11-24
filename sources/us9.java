// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class us9 extends View {
    public ts9 a;
    public final lm b;
    public final il0 c;
    public h19 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ vs9 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us9(vs9 vs9Var, Context context) {
        super(context);
        this.s = vs9Var;
        this.b = new lm(this, 0L, 260L, s33.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        ote.a(this);
        kl0 kl0Var = vs9Var.w;
        if (kl0Var != null) {
            il0 c = kl0Var.c(this, null, false);
            c.p(vs9Var.x);
            c.u(gl.L(5.0f));
            c.s = false;
            gl0 gl0Var = c.h0;
            if (gl0Var != null) {
                gl0Var.g(false);
            }
            ug8.r(c, gl.L(6.0f), 4.0f);
            this.c = c;
        }
    }

    public final void a(boolean z, boolean z2) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        ts9 ts9Var = this.a;
        if (ts9Var != null) {
            ts9Var.o = z;
            lm lmVar = this.b;
            if (z2) {
                ts9Var.h = ts9Var.M;
                ts9Var.f = ts9Var.N;
                ts9Var.g = ts9Var.O;
                lmVar.e(true, 0.0f);
            } else {
                lmVar.e(true, 1.0f);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r) {
            return;
        }
        ts9 ts9Var = this.a;
        if (ts9Var != null) {
            ts9Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            ts9 ts9Var = this.a;
            if (ts9Var != null) {
                ts9Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        vs9 vs9Var = this.s;
        Paint paint = vs9Var.y;
        int width = (getWidth() - this.a.z) / 2;
        int height = getHeight();
        ts9 ts9Var = this.a;
        int i = ts9Var.A;
        int i2 = (height - i) / 2;
        il0 il0Var = this.c;
        if (il0Var != null) {
            Rect rect = gl.Q;
            rect.set(width, i2, ts9Var.z + width, i + i2);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                i19.h(rectF2, rectF, path);
            }
            rect.inset(-gl.L(4.0f), -gl.L(4.0f));
            rect.right = gl.L(1.0f) + rect.right;
            il0Var.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            il0Var.draw(canvas);
            wjb wjbVar = vs9Var.c;
            paint.setColor((wjbVar == null ? !bkb.I.o() : !wjbVar.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i2, this.b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int L = gl.L(8.67f);
        ts9 ts9Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L + (ts9Var != null ? ts9Var.z : gl.L(44.33f)), TLObject.FLAG_30), i2);
    }
}
