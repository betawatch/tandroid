// default package

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
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class rx4 extends jq2 {
    public uib c;
    public uib d;
    public final ln e;
    public final Path f;
    public final Path h;
    public final Paint n;
    public final Paint r;
    public final float s;
    public yxa w;
    public boolean x;
    public int y;

    public rx4(View view, float f) {
        super(view);
        this.e = new ln(new qn4(this, (byte) 10), 320L, d53.h, 0);
        Path path = new Path();
        this.f = path;
        this.h = new Path();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.y = -1;
        this.s = f;
        d(path, f, false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ((Paint) this.b).setColor(-698031);
        ((Paint) this.b).setPathEffect(new CornerPathEffect(gm.L(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f, final boolean z) {
        rac racVar = new rac() { // from class: qx4
            @Override // rac
            public final Object a(Object obj) {
                Float f2 = (Float) obj;
                return Float.valueOf(z ? 48.0f - f2.floatValue() : f2.floatValue());
            }
        };
        path.rewind();
        float f2 = f * 24.5f;
        path.moveTo(td4.i((Float) racVar.a(Float.valueOf(46.83f)), f), gm.L(f2));
        path.lineTo(td4.i((Float) racVar.a(Float.valueOf(23.5f)), f), gm.L(1.17f * f));
        path.cubicTo(td4.i((Float) racVar.a(Float.valueOf(22.75f)), f), gm.L(0.42f * f), td4.i((Float) racVar.a(Float.valueOf(21.73f)), f), 0.0f, td4.i((Float) racVar.a(Float.valueOf(20.68f)), f), 0.0f);
        float f3 = f * 0.05f;
        path.cubicTo(td4.i((Float) racVar.a(Float.valueOf(19.62f)), f), 0.0f, td4.i((Float) racVar.a(Float.valueOf(2.73f)), f), gm.L(f3), td4.i((Float) racVar.a(Float.valueOf(1.55f)), f), gm.L(f3));
        path.cubicTo(td4.i((Float) racVar.a(Float.valueOf(0.36f)), f), gm.L(f3), td4.i((Float) racVar.a(Float.valueOf(-0.23f)), f), gm.L(1.4885f * f), td4.i((Float) racVar.a(Float.valueOf(0.6f)), f), gm.L(2.32f * f));
        path.lineTo(td4.i((Float) racVar.a(Float.valueOf(45.72f)), f), gm.L(47.44f * f));
        float i = td4.i((Float) racVar.a(Float.valueOf(46.56f)), f);
        float L = gm.L(48.28f * f);
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(i, L, td4.i((Float) racVar.a(valueOf), f), gm.L(47.68f * f), td4.i((Float) racVar.a(valueOf), f), gm.L(46.5f * f));
        path.cubicTo(td4.i((Float) racVar.a(valueOf), f), gm.L(45.31f * f), td4.i((Float) racVar.a(valueOf), f), gm.L(28.38f * f), td4.i((Float) racVar.a(valueOf), f), gm.L(27.32f * f));
        path.cubicTo(td4.i((Float) racVar.a(valueOf), f), gm.L(26.26f * f), td4.i((Float) racVar.a(Float.valueOf(47.5f)), f), gm.L(25.24f * f), td4.i((Float) racVar.a(Float.valueOf(46.82f)), f), gm.L(f2));
        path.close();
    }

    public final void c(Canvas canvas, uib uibVar, float f) {
        canvas.save();
        canvas.translate(f, f);
        float width = (getBounds().width() / 2.0f) + gm.L(this.x ? -7.0f : 6.0f);
        float height = (getBounds().height() / 2.0f) - gm.L(this.x ? 5.0f : 6.0f);
        canvas.rotate(this.x ? -45.0f : 45.0f, width, height);
        float min = Math.min(1.0f, gm.L(40.0f) / uibVar.c);
        canvas.scale(min, min, width, height);
        uibVar.c(width - (uibVar.j() / 2.0f), height + gm.L(1.0f), 1.0f, this.y, canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - gm.L(48.0f), getBounds().top);
        Paint paint = this.r;
        int alpha = paint.getAlpha();
        Path path = this.f;
        if (alpha > 0) {
            paint.setStrokeWidth(gm.L(1.33f) << 1);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.b);
        yxa yxaVar = this.w;
        float f = this.s;
        if (yxaVar != null) {
            float f2 = f * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, gm.L(f2), gm.L(f2), null);
            this.w.f(0, 0, gm.L(48.0f), gm.L(48.0f));
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
            ln lnVar = this.e;
            float e = lnVar.e(false, 1.0f);
            if (!lnVar.i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d == null || !lnVar.i) {
                c(canvas2, this.c, 0.0f);
            } else {
                canvas2.clipPath(path);
                float L = gm.L(f * 64.0f);
                c(canvas2, this.d, L * e);
                c(canvas2, this.c, (1.0f - e) * (-L));
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z, boolean z2) {
        float f;
        float f2;
        Paint paint = (Paint) this.b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
            return;
        }
        boolean z3 = this.x ? !z : z;
        float L = gm.L(48.0f);
        float L2 = gm.L(48.0f);
        int i = stargiftattributebackdrop.center_color | (-16777216);
        float f3 = -0.1f;
        float f4 = 0.05f;
        if (z3) {
            f = -0.15f;
            f2 = 0.07f;
        } else {
            f = -0.1f;
            f2 = 0.05f;
        }
        float f5 = 0.0f;
        int a = cmb.a(f2, f - (z2 ? 0.125f : 0.0f), i);
        int i2 = stargiftattributebackdrop.edge_color | (-16777216);
        if (z3) {
            f3 = -0.15f;
            f4 = 0.07f;
        }
        int[] iArr = {a, cmb.a(f4, f3 - (z2 ? 0.125f : 0.0f), i2)};
        float f6 = 1.0f;
        if (!z3) {
            f5 = 1.0f;
            f6 = 0.0f;
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, L, L2, iArr, new float[]{f6, f5}, Shader.TileMode.CLAMP));
    }

    public final void f(int i) {
        Paint paint = (Paint) this.b;
        paint.setShader(null);
        paint.setColor(i);
    }

    public final void g(int i, String str, boolean z) {
        this.d = null;
        this.e.e(true, 1.0f);
        this.c = new uib(str, i, z ? gm.o() : null);
        invalidateSelf();
    }

    public final void h(int i, String str) {
        uib uibVar = this.c;
        if (uibVar == null) {
            g(i, str, true);
        } else {
            if (TextUtils.equals(uibVar.i(), str)) {
                return;
            }
            this.d = this.c;
            this.c = new uib(str, i, gm.o());
            this.e.e(true, 0.0f);
            invalidateSelf();
        }
    }
}
