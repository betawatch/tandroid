// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zy1 extends View {
    public b29 E;
    public final float[] F;
    public boolean G;
    public long H;
    public final Paint I;
    public long J;
    public final /* synthetic */ ChatActivityEnterView K;
    public float a;
    public boolean b;
    public boolean c;
    public final b29 d;
    public boolean e;
    public boolean f;
    public long h;
    public boolean n;
    public long r;
    public float s;
    public float w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.K = chatActivityEnterView;
        this.h = -1L;
        this.F = new float[3];
        this.H = -1L;
        this.I = new Paint(1);
        b29 b29Var = new b29(R.raw.chat_audio_record_delete_2, hl.L(28.0f), hl.L(28.0f), false, null);
        this.d = b29Var;
        b29Var.p0 = true;
        f();
    }

    public static float a(long j) {
        return (((float) Math.cos(((j % 1300) / 1300.0f) * 3.141592653589793d * 2.0d)) * 0.5f) + 0.5f;
    }

    public final void b() {
        this.c = true;
        this.J = SystemClock.uptimeMillis();
        b29 b29Var = this.d;
        b29Var.O(true, 0.0f);
        if (this.b) {
            b29Var.start();
        }
    }

    public final void c() {
        ChatActivityEnterView chatActivityEnterView = this.K;
        chatActivityEnterView.l4.setColor(chatActivityEnterView.J0(aob.ag));
        this.a = 1.0f;
        System.currentTimeMillis();
        this.H = -1L;
        this.h = -1L;
        this.c = false;
        this.d.stop();
        this.n = false;
        this.y = 0.0f;
        this.x = 0.0f;
        this.w = 0.0f;
        invalidate();
    }

    public final void d(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        if (z) {
            g();
        }
        invalidate();
    }

    public final float e() {
        float i = (1.0f - Utilities.i(this.x / 0.8f, 1.0f, 0.0f)) * this.w;
        return xnb.B(i, 2.0f, 3.0f, 12.0f * i * i);
    }

    public final void f() {
        int i = aob.ag;
        int i2 = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.K;
        int J0 = chatActivityEnterView.J0(i);
        int J02 = chatActivityEnterView.J0(aob.Je);
        int J03 = chatActivityEnterView.J0(aob.Vf);
        chatActivityEnterView.l4.setColor(J0);
        b29 b29Var = this.d;
        b29Var.a0 = true;
        b29Var.L(J03, "Cup Red");
        b29Var.L(J03, "Box Red");
        b29Var.L(J03, "Cup Grey");
        b29Var.L(J03, "Box Grey");
        b29Var.L(J03, "Box_Grey 2");
        b29Var.L(J03, "Line 1");
        b29Var.L(J03, "Line 2");
        b29Var.L(J03, "Line 3");
        b29Var.L(J02, "Line 1 Dup");
        b29Var.L(J02, "Line 2 Dup");
        b29Var.L(J02, "Line 3 Dup");
        b29Var.j();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        b29Var.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final b29 g() {
        if (this.E == null) {
            b29 b29Var = new b29(R.raw.chat_audio_record_delete_outline, hl.L(28.0f), hl.L(28.0f), false, null);
            this.E = b29Var;
            b29Var.E(true);
            this.E.p0 = false;
            int i = aob.Vf;
            int i2 = ChatActivityEnterView.X7;
            int J0 = this.K.J0(i);
            b29 b29Var2 = this.E;
            b29Var2.a0 = true;
            b29Var2.L(J0, "Cup Grey");
            this.E.L(J0, "Box_Grey 2");
            this.E.L(J0, "Box Grey");
            this.E.j();
            this.E.M(this);
            this.E.O(true, 0.0f);
        }
        return this.E;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = true;
        boolean z = this.c;
        b29 b29Var = this.d;
        if (z) {
            b29Var.start();
        }
        b29Var.M(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        b29 b29Var = this.d;
        b29Var.stop();
        b29Var.M(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0198, code lost:
    
        if (r9 < 0) goto L33;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        long j;
        char c;
        ChatActivityEnterView chatActivityEnterView = this.K;
        Paint paint = chatActivityEnterView.l4;
        if (this.n) {
            float min = Math.min(1.0f, (SystemClock.uptimeMillis() - this.r) / 240.0f);
            float f3 = this.y;
            int i = ChatActivityEnterView.X7;
            float interpolation = k43.i.getInterpolation(Utilities.i(f3 / 0.6f, 1.0f, 0.0f));
            float V2 = 1.0f - ChatActivityEnterView.V2(0.05f, 0.55f, f3);
            float[] fArr = this.F;
            fArr[0] = V2;
            fArr[1] = hl.R1(1.0f, 0.55f, interpolation);
            fArr[2] = interpolation * 20.0f;
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            b29 g = g();
            float f4 = this.x;
            g.O(true, (f4 > 0.0f ? (Math.min(1.0f, f4) * 14.0f) + 30.0f : this.w * 8.0f) / 52.0f);
            g.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            canvas.save();
            float f5 = fArr[1];
            canvas.scale(f5, f5, measuredWidth, measuredHeight);
            canvas.rotate(fArr[2], measuredWidth, measuredHeight);
            canvas.rotate(e(), measuredWidth, hl.L(12.0f) + measuredHeight);
            float min2 = Math.min(1.0f, 1.8f * min);
            float V22 = 1.0f - ChatActivityEnterView.V2(0.25f, 0.85f, min);
            float interpolation2 = k43.g.getInterpolation(min);
            if (V22 > 0.0f) {
                c = 0;
                paint.setColor(vm2.f(min2, chatActivityEnterView.J0(aob.ag), chatActivityEnterView.J0(aob.Vf)));
                paint.setAlpha((int) (V22 * 255.0f * fArr[0]));
                canvas.drawCircle(measuredWidth, (hl.L(2.0f) * interpolation2) + measuredHeight, hl.R1(this.s, hl.L(1.5f), interpolation2), paint);
            } else {
                c = 0;
            }
            float V23 = ChatActivityEnterView.V2(0.05f, 0.6f, min) * fArr[c];
            if (V23 > 0.0f && g.p()) {
                float i2 = Utilities.i(min, 1.0f, 0.0f) - 1.0f;
                float R1 = hl.R1(0.45f, 1.0f, c00.x(i2, 1.1f, i2, (2.1f * i2 * i2 * i2) + 1.0f));
                canvas.save();
                canvas.scale(R1, R1, measuredWidth, measuredHeight + hl.L(2.0f));
                g.setAlpha((int) (V23 * 255.0f));
                g.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            if (min < 1.0f || !g.p()) {
                invalidate();
                return;
            }
            return;
        }
        if (this.G) {
            b29 g2 = g();
            g2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            g2.setAlpha(jn7.d4);
            g2.draw(canvas);
            return;
        }
        if (!this.f) {
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean z = this.e;
            if (!z) {
                j = this.H;
            }
            this.H = uptimeMillis;
            j = uptimeMillis;
            this.a = (z || this.c) ? 1.0f : a(uptimeMillis - j);
        }
        if (this.c) {
            f = 1.0f;
            f2 = Math.min(1.0f, (SystemClock.uptimeMillis() - this.J) / 160.0f);
        } else {
            f = 1.0f;
            f2 = 0.0f;
        }
        boolean z2 = this.c;
        b29 b29Var = this.d;
        if (z2) {
            b29Var.setAlpha((int) (f2 * 255.0f));
            b29Var.draw(canvas);
            if (f2 < f) {
                invalidate();
            }
        }
        if (!this.c || f2 < f || !b29Var.p()) {
            boolean z3 = this.c;
            float f6 = z3 ? 1.0f : this.a;
            float f7 = (z3 && b29Var.p()) ? 1.0f - f2 : 1.0f;
            if (f7 <= 0.0f) {
                if (this.f) {
                    return;
                }
                invalidate();
                return;
            }
            canvas.save();
            float R12 = hl.R1(0.4f, 1.0f, f7);
            canvas.scale(R12, R12, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            float measuredWidth2 = getMeasuredWidth() / 2.0f;
            float measuredHeight2 = getMeasuredHeight() / 2.0f;
            float R13 = hl.R1(0.85f, 1.0f, f6) * hl.L(5.0f);
            if (this.c) {
                paint.setColor(vm2.f(Math.min(1.0f, f2 * 2.5f), chatActivityEnterView.J0(aob.ag), chatActivityEnterView.J0(aob.Vf)));
            }
            int color = paint.getColor();
            Paint paint2 = this.I;
            paint2.setColor(color);
            paint2.setAlpha((int) (40.8f * f6 * f7));
            canvas.drawCircle(measuredWidth2, measuredHeight2, hl.R1(1.35f, 1.75f, f6) * R13, paint2);
            paint.setAlpha((int) (hl.R1(0.6f, 1.0f, f6) * 255.0f * f7));
            canvas.drawCircle(measuredWidth2, measuredHeight2, R13, paint);
            canvas.restore();
        }
        if (this.f) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
