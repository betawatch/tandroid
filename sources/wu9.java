// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wu9 extends View {
    public vu9 a;
    public final ln b;
    public final im0 c;
    public k39 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final /* synthetic */ xu9 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu9(xu9 xu9Var, Context context) {
        super(context);
        this.s = xu9Var;
        this.b = new ln(this, 0L, 260L, d53.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        rve.a(this);
        km0 km0Var = xu9Var.w;
        if (km0Var != null) {
            im0 c = km0Var.c(this, null, false);
            c.p(xu9Var.x);
            c.u(gm.L(5.0f));
            c.s = false;
            gm0 gm0Var = c.h0;
            if (gm0Var != null) {
                gm0Var.g(false);
            }
            wi8.r(c, gm.L(6.0f), 4.0f);
            this.c = c;
        }
    }

    public final void a(boolean z, boolean z2) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        vu9 vu9Var = this.a;
        if (vu9Var != null) {
            vu9Var.o = z;
            ln lnVar = this.b;
            if (z2) {
                vu9Var.h = vu9Var.M;
                vu9Var.f = vu9Var.N;
                vu9Var.g = vu9Var.O;
                lnVar.e(true, 0.0f);
            } else {
                lnVar.e(true, 1.0f);
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
        vu9 vu9Var = this.a;
        if (vu9Var != null) {
            vu9Var.a();
        }
        this.r = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            vu9 vu9Var = this.a;
            if (vu9Var != null) {
                vu9Var.b();
            }
            this.r = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        xu9 xu9Var = this.s;
        Paint paint = xu9Var.y;
        int width = (getWidth() - this.a.z) / 2;
        int height = getHeight();
        vu9 vu9Var = this.a;
        int i = vu9Var.A;
        int i2 = (height - i) / 2;
        im0 im0Var = this.c;
        if (im0Var != null) {
            Rect rect = gm.Q;
            rect.set(width, i2, vu9Var.z + width, i + i2);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                l39.h(rectF2, rectF, path);
            }
            rect.inset(-gm.L(4.0f), -gm.L(4.0f));
            rect.right = gm.L(1.0f) + rect.right;
            im0Var.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            im0Var.draw(canvas);
            ylb ylbVar = xu9Var.c;
            paint.setColor((ylbVar == null ? !cmb.I.o() : !ylbVar.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i2, this.b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int L = gm.L(8.67f);
        vu9 vu9Var = this.a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L + (vu9Var != null ? vu9Var.z : gm.L(44.33f)), TLObject.FLAG_30), i2);
    }
}
