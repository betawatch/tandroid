// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s0 extends ReplacementSpan {
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public s0() {
        this.a = (byte) 0;
        this.b = new Paint(1);
        uib uibVar = new uib("x50", 13.0f, gm.n1("fonts/num.otf"));
        this.c = uibVar;
        uibVar.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                float f2 = (i3 + i5) / 2.0f;
                RectF rectF = gm.P;
                rectF.set(f, f2 - gm.L(7.66f), ((uib) obj2).c + f + gm.L(6.66f), gm.L(7.66f) + f2);
                canvas.saveLayerAlpha(rectF, nm7.d4, 31);
                Paint paint2 = (Paint) obj;
                paint2.setColor(paint.getColor());
                canvas.drawRoundRect(rectF, gm.L(5.0f), gm.L(5.0f), paint2);
                ((uib) obj2).c(f + gm.L(3.33f), f2, 1.0f, -1, canvas);
                canvas.restore();
                break;
            case 1:
                float N = gm.N(14.66f);
                float f3 = (i3 + i5) / 2.0f;
                RectF rectF2 = gm.P;
                float f4 = N / 2.0f;
                rectF2.set(f, f3 - f4, ((int) (((uib) obj2).c + gm.L(10.0f))) + f, f4 + f3);
                Paint paint3 = (Paint) obj;
                int i6 = cmb.y6;
                paint3.setColor(cmb.p1(0.15f, cmb.w0(null, i6, false)));
                canvas.drawRoundRect(rectF2, gm.L(4.0f), gm.L(4.0f), paint3);
                ((uib) obj2).c(f + gm.L(5.0f), f3, Utilities.i((paint.getAlpha() << 1) / 255.0f, 1.0f, 0.0f), cmb.w0(null, i6, false), canvas);
                break;
            default:
                d53 d53Var = (d53) obj;
                canvas.save();
                canvas.translate(f + gm.L(4.0f), i4 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i7 = 0; i7 < 3; i7++) {
                    float min = Math.min(1.0f, (((i7 * 250) + uptimeMillis) % 750) / 667.0f);
                    canvas.drawCircle(gm.N((d53Var.getInterpolation(min) * 16.0f) + 1.667f), gm.L(3.0f), gm.N((min <= 0.425f ? d53Var.getInterpolation(min / 0.425f) : 1.0f - d53Var.getInterpolation((min - 0.425f) / 0.575f)) * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) obj2) {
                    view.invalidate();
                }
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return (int) (((uib) this.c).c + gm.L(6.66f));
            case 1:
                return (int) (((uib) this.c).c + gm.L(10.0f));
            default:
                return gm.L(20.0f);
        }
    }

    public s0(int i) {
        this.a = (byte) 1;
        this.b = new Paint(1);
        this.c = new uib(jb6.G(i, "BusinessRepliesMore", new Object[0]), 9.33f, gm.o());
    }

    public s0(View[] viewArr) {
        this.a = (byte) 2;
        this.b = new d53(0.33d, 0.0d, 0.67d, 1.0d);
        this.c = viewArr;
    }
}
