package ph;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t5;
import rh.s8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class f1 extends gq {
    public qz0 c;
    public qz0 d;
    public final t5 e;
    public final Path f;
    public final Path h;
    public final Paint n;
    public final Paint r;
    public final float s;
    public s8 w;
    public boolean x;
    public int y;

    public f1(View view) {
        super(view);
        this.e = new t5(new w5(this, 28), 320L, gr.h, 0);
        Path path = new Path();
        this.f = path;
        this.h = new Path();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.y = -1;
        this.s = 1.0f;
        d(path, 1.0f, false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ((Paint) this.b).setColor(-698031);
        ((Paint) this.b).setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f7, final boolean z10) {
        r20 r20Var = new r20() { // from class: ph.e1
            @Override // org.telegram.messenger.r20
            public final Object a(Object obj) {
                Float f10 = (Float) obj;
                return Float.valueOf(z10 ? 48.0f - f10.floatValue() : f10.floatValue());
            }
        };
        path.rewind();
        float f10 = f7 * 24.5f;
        path.moveTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(46.83f)), f7), org.telegram.messenger.i0.L(f10));
        path.lineTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(23.5f)), f7), org.telegram.messenger.i0.L(1.17f * f7));
        path.cubicTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(22.75f)), f7), org.telegram.messenger.i0.L(0.42f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(21.73f)), f7), 0.0f, org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(20.68f)), f7), 0.0f);
        float f11 = f7 * 0.05f;
        path.cubicTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(19.62f)), f7), 0.0f, org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(2.73f)), f7), org.telegram.messenger.i0.L(f11), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(1.55f)), f7), org.telegram.messenger.i0.L(f11));
        path.cubicTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(0.36f)), f7), org.telegram.messenger.i0.L(f11), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(-0.23f)), f7), org.telegram.messenger.i0.L(1.4885f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(0.6f)), f7), org.telegram.messenger.i0.L(2.32f * f7));
        path.lineTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(45.72f)), f7), org.telegram.messenger.i0.L(47.44f * f7));
        float g10 = org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(46.56f)), f7);
        float L = org.telegram.messenger.i0.L(48.28f * f7);
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(g10, L, org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(47.68f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(46.5f * f7));
        path.cubicTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(45.31f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(28.38f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(27.32f * f7));
        path.cubicTo(org.telegram.ui.Cells.f1.g((Float) r20Var.a(valueOf), f7), org.telegram.messenger.i0.L(26.26f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(47.5f)), f7), org.telegram.messenger.i0.L(25.24f * f7), org.telegram.ui.Cells.f1.g((Float) r20Var.a(Float.valueOf(46.82f)), f7), org.telegram.messenger.i0.L(f10));
        path.close();
    }

    public final void c(Canvas canvas, qz0 qz0Var, float f7) {
        canvas.save();
        canvas.translate(f7, f7);
        float width = (getBounds().width() / 2.0f) + org.telegram.messenger.i0.L(this.x ? -7.0f : 6.0f);
        float height = (getBounds().height() / 2.0f) - org.telegram.messenger.i0.L(this.x ? 5.0f : 6.0f);
        canvas.rotate(this.x ? -45.0f : 45.0f, width, height);
        float min = Math.min(1.0f, org.telegram.messenger.i0.L(40.0f) / qz0Var.c);
        canvas.scale(min, min, width, height);
        qz0Var.c(width - (qz0Var.k() / 2.0f), height + org.telegram.messenger.i0.L(1.0f), 1.0f, this.y, canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - org.telegram.messenger.i0.L(48.0f), getBounds().top);
        Paint paint = this.r;
        int alpha = paint.getAlpha();
        Path path = this.f;
        if (alpha > 0) {
            paint.setStrokeWidth(org.telegram.messenger.i0.L(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.b);
        s8 s8Var = this.w;
        float f7 = this.s;
        if (s8Var != null) {
            float f10 = f7 * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), null);
            this.w.f(0, 0, org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f));
            this.w.d();
            this.w.a(canvas2, -1);
            Path path2 = this.h;
            path2.set(path);
            path2.toggleInverseFillType();
            canvas2.drawPath(path2, this.n);
            canvas2.restore();
            invalidateSelf();
        } else {
            canvas2 = canvas;
        }
        if (this.c != null) {
            t5 t5Var = this.e;
            float e = t5Var.e(false, 1.0f);
            if (!t5Var.i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d == null || !t5Var.i) {
                c(canvas2, this.c, 0.0f);
            } else {
                canvas2.clipPath(path);
                float L = org.telegram.messenger.i0.L(f7 * 64.0f);
                c(canvas2, this.d, L * e);
                c(canvas2, this.c, (1.0f - e) * (-L));
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10, boolean z11) {
        Paint paint = (Paint) this.b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
        } else {
            boolean z12 = this.x ? !z10 : z10;
            paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f), new int[]{t6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.center_color | (-16777216)), t6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.edge_color | (-16777216))}, new float[]{z12 ? 1.0f : 0.0f, z12 ? 0.0f : 1.0f}, Shader.TileMode.CLAMP));
        }
    }

    public final void f(int i10, CharSequence charSequence, boolean z10) {
        this.d = null;
        this.e.e(true, 1.0f);
        this.c = new qz0(charSequence, i10, z10 ? org.telegram.messenger.i0.o() : null);
        invalidateSelf();
    }

    public final void g(int i10, String str) {
        qz0 qz0Var = this.c;
        if (qz0Var == null) {
            f(i10, str, true);
        } else {
            if (TextUtils.equals(qz0Var.j(), str)) {
                return;
            }
            this.d = this.c;
            this.c = new qz0(str, i10, org.telegram.messenger.i0.o());
            this.e.e(true, 0.0f);
            invalidateSelf();
        }
    }
}
