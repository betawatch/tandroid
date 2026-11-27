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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class t0 extends ReplacementSpan {
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public t0() {
        this.a = (byte) 0;
        this.b = new Paint(1);
        pkb pkbVar = new pkb("x50", 13.0f, hl.n1("fonts/num.otf"));
        this.c = pkbVar;
        pkbVar.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                float f2 = (i3 + i5) / 2.0f;
                RectF rectF = hl.P;
                rectF.set(f, f2 - hl.L(7.66f), ((pkb) obj2).c + f + hl.L(6.66f), hl.L(7.66f) + f2);
                canvas.saveLayerAlpha(rectF, jn7.d4, 31);
                Paint paint2 = (Paint) obj;
                paint2.setColor(paint.getColor());
                canvas.drawRoundRect(rectF, hl.L(5.0f), hl.L(5.0f), paint2);
                ((pkb) obj2).c(f + hl.L(3.33f), f2, 1.0f, -1, canvas);
                canvas.restore();
                break;
            case 1:
                float N = hl.N(14.66f);
                float f3 = (i3 + i5) / 2.0f;
                RectF rectF2 = hl.P;
                float f4 = N / 2.0f;
                rectF2.set(f, f3 - f4, ((int) (((pkb) obj2).c + hl.L(10.0f))) + f, f4 + f3);
                Paint paint3 = (Paint) obj;
                int i6 = aob.z6;
                paint3.setColor(aob.p1(0.15f, aob.w0(null, i6, false)));
                canvas.drawRoundRect(rectF2, hl.L(4.0f), hl.L(4.0f), paint3);
                ((pkb) obj2).c(f + hl.L(5.0f), f3, Utilities.i((paint.getAlpha() << 1) / 255.0f, 1.0f, 0.0f), aob.w0(null, i6, false), canvas);
                break;
            default:
                k43 k43Var = (k43) obj;
                canvas.save();
                canvas.translate(f + hl.L(4.0f), i4 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i7 = 0; i7 < 3; i7++) {
                    float min = Math.min(1.0f, (((i7 * 250) + uptimeMillis) % 750) / 667.0f);
                    canvas.drawCircle(hl.N((k43Var.getInterpolation(min) * 16.0f) + 1.667f), hl.L(3.0f), hl.N((min <= 0.425f ? k43Var.getInterpolation(min / 0.425f) : 1.0f - k43Var.getInterpolation((min - 0.425f) / 0.575f)) * 2.0f), paint);
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
                return (int) (((pkb) this.c).c + hl.L(6.66f));
            case 1:
                return (int) (((pkb) this.c).c + hl.L(10.0f));
            default:
                return hl.L(20.0f);
        }
    }

    public t0(int i) {
        this.a = (byte) 1;
        this.b = new Paint(1);
        this.c = new pkb(ob6.G(i, "BusinessRepliesMore", new Object[0]), 9.33f, hl.o());
    }

    public t0(View[] viewArr) {
        this.a = (byte) 2;
        this.b = new k43(0.33d, 0.0d, 0.67d, 1.0d);
        this.c = viewArr;
    }
}
