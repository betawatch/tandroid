package zh;

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
import bi.ud;
import org.telegram.messenger.d20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class b1 extends a5.h {
    public my0 c;
    public my0 d;
    public final v5 e;
    public final Path f;
    public final Path h;
    public final Paint n;
    public final Paint r;
    public final float s;
    public ud w;
    public boolean x;
    public int y;

    public b1(View view) {
        super(view);
        this.e = new v5(new wg.a0(this, 7), 320L, wq.h, 0);
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
        ((Paint) this.b).setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f10, final boolean z9) {
        d20 d20Var = new d20() { // from class: zh.a1
            @Override // org.telegram.messenger.d20
            public final Object a(Object obj) {
                Float f11 = (Float) obj;
                return Float.valueOf(z9 ? 48.0f - f11.floatValue() : f11.floatValue());
            }
        };
        path.rewind();
        float f11 = f10 * 24.5f;
        path.moveTo(rf.b.e((Float) d20Var.a(Float.valueOf(46.83f)), f10), org.telegram.messenger.g0.L(f11));
        path.lineTo(rf.b.e((Float) d20Var.a(Float.valueOf(23.5f)), f10), org.telegram.messenger.g0.L(1.17f * f10));
        path.cubicTo(rf.b.e((Float) d20Var.a(Float.valueOf(22.75f)), f10), org.telegram.messenger.g0.L(0.42f * f10), rf.b.e((Float) d20Var.a(Float.valueOf(21.73f)), f10), 0.0f, rf.b.e((Float) d20Var.a(Float.valueOf(20.68f)), f10), 0.0f);
        float f12 = f10 * 0.05f;
        path.cubicTo(rf.b.e((Float) d20Var.a(Float.valueOf(19.62f)), f10), 0.0f, rf.b.e((Float) d20Var.a(Float.valueOf(2.73f)), f10), org.telegram.messenger.g0.L(f12), rf.b.e((Float) d20Var.a(Float.valueOf(1.55f)), f10), org.telegram.messenger.g0.L(f12));
        path.cubicTo(rf.b.e((Float) d20Var.a(Float.valueOf(0.36f)), f10), org.telegram.messenger.g0.L(f12), rf.b.e((Float) d20Var.a(Float.valueOf(-0.23f)), f10), org.telegram.messenger.g0.L(1.4885f * f10), rf.b.e((Float) d20Var.a(Float.valueOf(0.6f)), f10), org.telegram.messenger.g0.L(2.32f * f10));
        path.lineTo(rf.b.e((Float) d20Var.a(Float.valueOf(45.72f)), f10), org.telegram.messenger.g0.L(47.44f * f10));
        float e10 = rf.b.e((Float) d20Var.a(Float.valueOf(46.56f)), f10);
        float L = org.telegram.messenger.g0.L(48.28f * f10);
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(e10, L, rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(47.68f * f10), rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(46.5f * f10));
        path.cubicTo(rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(45.31f * f10), rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(28.38f * f10), rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(27.32f * f10));
        path.cubicTo(rf.b.e((Float) d20Var.a(valueOf), f10), org.telegram.messenger.g0.L(26.26f * f10), rf.b.e((Float) d20Var.a(Float.valueOf(47.5f)), f10), org.telegram.messenger.g0.L(25.24f * f10), rf.b.e((Float) d20Var.a(Float.valueOf(46.82f)), f10), org.telegram.messenger.g0.L(f11));
        path.close();
    }

    public final void c(Canvas canvas, my0 my0Var, float f10) {
        canvas.save();
        canvas.translate(f10, f10);
        float width = (getBounds().width() / 2.0f) + org.telegram.messenger.g0.L(this.x ? -7.0f : 6.0f);
        float height = (getBounds().height() / 2.0f) - org.telegram.messenger.g0.L(this.x ? 5.0f : 6.0f);
        canvas.rotate(this.x ? -45.0f : 45.0f, width, height);
        float min = Math.min(1.0f, org.telegram.messenger.g0.L(40.0f) / my0Var.c);
        canvas.scale(min, min, width, height);
        my0Var.c(width - (my0Var.k() / 2.0f), height + org.telegram.messenger.g0.L(1.0f), 1.0f, this.y, canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - org.telegram.messenger.g0.L(48.0f), getBounds().top);
        Paint paint = this.r;
        int alpha = paint.getAlpha();
        Path path = this.f;
        if (alpha > 0) {
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.b);
        ud udVar = this.w;
        float f10 = this.s;
        if (udVar != null) {
            float f11 = f10 * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), null);
            this.w.f(0, 0, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f));
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
            v5 v5Var = this.e;
            float e10 = v5Var.e(false, 1.0f);
            if (!v5Var.i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d == null || !v5Var.i) {
                c(canvas2, this.c, 0.0f);
            } else {
                canvas2.clipPath(path);
                float L = org.telegram.messenger.g0.L(f10 * 64.0f);
                c(canvas2, this.d, L * e10);
                c(canvas2, this.c, (1.0f - e10) * (-L));
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z9, boolean z10) {
        Paint paint = (Paint) this.b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
        } else {
            boolean z11 = this.x ? !z9 : z9;
            paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{m6.b(z11 ? 0.07f : 0.05f, (z11 ? -0.15f : -0.1f) - (z10 ? 0.125f : 0.0f), stargiftattributebackdrop.center_color | (-16777216)), m6.b(z11 ? 0.07f : 0.05f, (z11 ? -0.15f : -0.1f) - (z10 ? 0.125f : 0.0f), stargiftattributebackdrop.edge_color | (-16777216))}, new float[]{z11 ? 1.0f : 0.0f, z11 ? 0.0f : 1.0f}, Shader.TileMode.CLAMP));
        }
    }

    public final void f(int i7, CharSequence charSequence, boolean z9) {
        this.d = null;
        this.e.e(true, 1.0f);
        this.c = new my0(charSequence, i7, z9 ? org.telegram.messenger.g0.o() : null);
        invalidateSelf();
    }

    public final void g(int i7, String str) {
        my0 my0Var = this.c;
        if (my0Var == null) {
            f(i7, str, true);
        } else {
            if (TextUtils.equals(my0Var.j(), str)) {
                return;
            }
            this.d = this.c;
            this.c = new my0(str, i7, org.telegram.messenger.g0.o());
            this.e.e(true, 0.0f);
            invalidateSelf();
        }
    }
}
