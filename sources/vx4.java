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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class vx4 extends rp2 {
    public pkb c;
    public pkb d;
    public final mm e;
    public final Path f;
    public final Path h;
    public final Paint n;
    public final Paint r;
    public final float s;
    public yza w;
    public boolean x;
    public int y;

    public vx4(View view, float f) {
        super(view);
        this.e = new mm(new rj4(this, (byte) 17), 320L, k43.h, 0);
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
        ((Paint) this.b).setPathEffect(new CornerPathEffect(hl.L(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f, final boolean z) {
        qcc qccVar = new qcc() { // from class: ux4
            @Override // qcc
            public final Object a(Object obj) {
                Float f2 = (Float) obj;
                return Float.valueOf(z ? 48.0f - f2.floatValue() : f2.floatValue());
            }
        };
        path.rewind();
        float f2 = f * 24.5f;
        path.moveTo(qd4.i((Float) qccVar.a(Float.valueOf(46.83f)), f), hl.L(f2));
        path.lineTo(qd4.i((Float) qccVar.a(Float.valueOf(23.5f)), f), hl.L(1.17f * f));
        path.cubicTo(qd4.i((Float) qccVar.a(Float.valueOf(22.75f)), f), hl.L(0.42f * f), qd4.i((Float) qccVar.a(Float.valueOf(21.73f)), f), 0.0f, qd4.i((Float) qccVar.a(Float.valueOf(20.68f)), f), 0.0f);
        float f3 = f * 0.05f;
        path.cubicTo(qd4.i((Float) qccVar.a(Float.valueOf(19.62f)), f), 0.0f, qd4.i((Float) qccVar.a(Float.valueOf(2.73f)), f), hl.L(f3), qd4.i((Float) qccVar.a(Float.valueOf(1.55f)), f), hl.L(f3));
        path.cubicTo(qd4.i((Float) qccVar.a(Float.valueOf(0.36f)), f), hl.L(f3), qd4.i((Float) qccVar.a(Float.valueOf(-0.23f)), f), hl.L(1.4885f * f), qd4.i((Float) qccVar.a(Float.valueOf(0.6f)), f), hl.L(2.32f * f));
        path.lineTo(qd4.i((Float) qccVar.a(Float.valueOf(45.72f)), f), hl.L(47.44f * f));
        float i = qd4.i((Float) qccVar.a(Float.valueOf(46.56f)), f);
        float L = hl.L(48.28f * f);
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(i, L, qd4.i((Float) qccVar.a(valueOf), f), hl.L(47.68f * f), qd4.i((Float) qccVar.a(valueOf), f), hl.L(46.5f * f));
        path.cubicTo(qd4.i((Float) qccVar.a(valueOf), f), hl.L(45.31f * f), qd4.i((Float) qccVar.a(valueOf), f), hl.L(28.38f * f), qd4.i((Float) qccVar.a(valueOf), f), hl.L(27.32f * f));
        path.cubicTo(qd4.i((Float) qccVar.a(valueOf), f), hl.L(26.26f * f), qd4.i((Float) qccVar.a(Float.valueOf(47.5f)), f), hl.L(25.24f * f), qd4.i((Float) qccVar.a(Float.valueOf(46.82f)), f), hl.L(f2));
        path.close();
    }

    public final void c(Canvas canvas, pkb pkbVar, float f) {
        canvas.save();
        canvas.translate(f, f);
        float width = (getBounds().width() / 2.0f) + hl.L(this.x ? -7.0f : 6.0f);
        float height = (getBounds().height() / 2.0f) - hl.L(this.x ? 5.0f : 6.0f);
        canvas.rotate(this.x ? -45.0f : 45.0f, width, height);
        float min = Math.min(1.0f, hl.L(40.0f) / pkbVar.c);
        canvas.scale(min, min, width, height);
        pkbVar.c(width - (pkbVar.j() / 2.0f), height + hl.L(1.0f), 1.0f, this.y, canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - hl.L(48.0f), getBounds().top);
        Paint paint = this.r;
        int alpha = paint.getAlpha();
        Path path = this.f;
        if (alpha > 0) {
            paint.setStrokeWidth(hl.L(1.33f) << 1);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.b);
        yza yzaVar = this.w;
        float f = this.s;
        if (yzaVar != null) {
            float f2 = f * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, hl.L(f2), hl.L(f2), null);
            this.w.f(0, 0, hl.L(48.0f), hl.L(48.0f));
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
            mm mmVar = this.e;
            float e = mmVar.e(false, 1.0f);
            if (!mmVar.i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d == null || !mmVar.i) {
                c(canvas2, this.c, 0.0f);
            } else {
                canvas2.clipPath(path);
                float L = hl.L(f * 64.0f);
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
        float L = hl.L(48.0f);
        float L2 = hl.L(48.0f);
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
        int a = aob.a(f2, f - (z2 ? 0.125f : 0.0f), i);
        int i2 = stargiftattributebackdrop.edge_color | (-16777216);
        if (z3) {
            f3 = -0.15f;
            f4 = 0.07f;
        }
        int[] iArr = {a, aob.a(f4, f3 - (z2 ? 0.125f : 0.0f), i2)};
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
        this.c = new pkb(str, i, z ? hl.o() : null);
        invalidateSelf();
    }

    public final void h(int i, String str) {
        pkb pkbVar = this.c;
        if (pkbVar == null) {
            g(i, str, true);
        } else {
            if (TextUtils.equals(pkbVar.i(), str)) {
                return;
            }
            this.d = this.c;
            this.c = new pkb(str, i, hl.o());
            this.e.e(true, 0.0f);
            invalidateSelf();
        }
    }
}
