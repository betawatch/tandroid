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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wz1 extends View {
    public p09 E;
    public final float[] F;
    public boolean G;
    public long H;
    public final Paint I;
    public long J;
    public final /* synthetic */ ChatActivityEnterView K;
    public float a;
    public boolean b;
    public boolean c;
    public final p09 d;
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
    public wz1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.K = chatActivityEnterView;
        this.h = -1L;
        this.F = new float[3];
        this.H = -1L;
        this.I = new Paint(1);
        p09 p09Var = new p09(R.raw.chat_audio_record_delete_2, gm.L(28.0f), gm.L(28.0f), false, null);
        this.d = p09Var;
        p09Var.p0 = true;
        f();
    }

    public static float a(long j) {
        return (((float) Math.cos(((j % 1300) / 1300.0f) * 3.141592653589793d * 2.0d)) * 0.5f) + 0.5f;
    }

    public final void b() {
        this.c = true;
        this.J = SystemClock.uptimeMillis();
        p09 p09Var = this.d;
        p09Var.O(true, 0.0f);
        if (this.b) {
            p09Var.start();
        }
    }

    public final void c() {
        ChatActivityEnterView chatActivityEnterView = this.K;
        chatActivityEnterView.m4.setColor(chatActivityEnterView.F0(cmb.Zf));
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
        return mlb.B(i, 2.0f, 3.0f, 12.0f * i * i);
    }

    public final void f() {
        int i = cmb.Zf;
        int i2 = ChatActivityEnterView.z7;
        ChatActivityEnterView chatActivityEnterView = this.K;
        int F0 = chatActivityEnterView.F0(i);
        int F02 = chatActivityEnterView.F0(cmb.Ie);
        int F03 = chatActivityEnterView.F0(cmb.Uf);
        chatActivityEnterView.m4.setColor(F0);
        p09 p09Var = this.d;
        p09Var.a0 = true;
        p09Var.L(F03, "Cup Red");
        p09Var.L(F03, "Box Red");
        p09Var.L(F03, "Cup Grey");
        p09Var.L(F03, "Box Grey");
        p09Var.L(F03, "Box_Grey 2");
        p09Var.L(F03, "Line 1");
        p09Var.L(F03, "Line 2");
        p09Var.L(F03, "Line 3");
        p09Var.L(F02, "Line 1 Dup");
        p09Var.L(F02, "Line 2 Dup");
        p09Var.L(F02, "Line 3 Dup");
        p09Var.j();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        p09Var.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final p09 g() {
        if (this.E == null) {
            p09 p09Var = new p09(R.raw.chat_audio_record_delete_outline, gm.L(28.0f), gm.L(28.0f), false, null);
            this.E = p09Var;
            p09Var.E(true);
            this.E.p0 = false;
            int i = cmb.Uf;
            int i2 = ChatActivityEnterView.z7;
            int F0 = this.K.F0(i);
            p09 p09Var2 = this.E;
            p09Var2.a0 = true;
            p09Var2.L(F0, "Cup Grey");
            this.E.L(F0, "Box_Grey 2");
            this.E.L(F0, "Box Grey");
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
        p09 p09Var = this.d;
        if (z) {
            p09Var.start();
        }
        p09Var.M(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        p09 p09Var = this.d;
        p09Var.stop();
        p09Var.M(null);
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
        Paint paint = chatActivityEnterView.m4;
        if (this.n) {
            float min = Math.min(1.0f, (SystemClock.uptimeMillis() - this.r) / 240.0f);
            float f3 = this.y;
            int i = ChatActivityEnterView.z7;
            float interpolation = d53.i.getInterpolation(Utilities.i(f3 / 0.6f, 1.0f, 0.0f));
            float L2 = 1.0f - ChatActivityEnterView.L2(0.05f, 0.55f, f3);
            float[] fArr = this.F;
            fArr[0] = L2;
            fArr[1] = gm.R1(1.0f, 0.55f, interpolation);
            fArr[2] = interpolation * 20.0f;
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            p09 g = g();
            float f4 = this.x;
            g.O(true, (f4 > 0.0f ? (Math.min(1.0f, f4) * 14.0f) + 30.0f : this.w * 8.0f) / 52.0f);
            g.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            canvas.save();
            float f5 = fArr[1];
            canvas.scale(f5, f5, measuredWidth, measuredHeight);
            canvas.rotate(fArr[2], measuredWidth, measuredHeight);
            canvas.rotate(e(), measuredWidth, gm.L(12.0f) + measuredHeight);
            float min2 = Math.min(1.0f, 1.8f * min);
            float L22 = 1.0f - ChatActivityEnterView.L2(0.25f, 0.85f, min);
            float interpolation2 = d53.g.getInterpolation(min);
            if (L22 > 0.0f) {
                c = 0;
                paint.setColor(on2.f(min2, chatActivityEnterView.F0(cmb.Zf), chatActivityEnterView.F0(cmb.Uf)));
                paint.setAlpha((int) (L22 * 255.0f * fArr[0]));
                canvas.drawCircle(measuredWidth, (gm.L(2.0f) * interpolation2) + measuredHeight, gm.R1(this.s, gm.L(1.5f), interpolation2), paint);
            } else {
                c = 0;
            }
            float L23 = ChatActivityEnterView.L2(0.05f, 0.6f, min) * fArr[c];
            if (L23 > 0.0f && g.p()) {
                float i2 = Utilities.i(min, 1.0f, 0.0f) - 1.0f;
                float R1 = gm.R1(0.45f, 1.0f, b10.w(i2, 1.1f, i2, (2.1f * i2 * i2 * i2) + 1.0f));
                canvas.save();
                canvas.scale(R1, R1, measuredWidth, measuredHeight + gm.L(2.0f));
                g.setAlpha((int) (L23 * 255.0f));
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
            p09 g2 = g();
            g2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            g2.setAlpha(nm7.d4);
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
        p09 p09Var = this.d;
        if (z2) {
            p09Var.setAlpha((int) (f2 * 255.0f));
            p09Var.draw(canvas);
            if (f2 < f) {
                invalidate();
            }
        }
        if (!this.c || f2 < f || !p09Var.p()) {
            boolean z3 = this.c;
            float f6 = z3 ? 1.0f : this.a;
            float f7 = (z3 && p09Var.p()) ? 1.0f - f2 : 1.0f;
            if (f7 <= 0.0f) {
                if (this.f) {
                    return;
                }
                invalidate();
                return;
            }
            canvas.save();
            float R12 = gm.R1(0.4f, 1.0f, f7);
            canvas.scale(R12, R12, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            float measuredWidth2 = getMeasuredWidth() / 2.0f;
            float measuredHeight2 = getMeasuredHeight() / 2.0f;
            float R13 = gm.R1(0.85f, 1.0f, f6) * gm.L(5.0f);
            if (this.c) {
                paint.setColor(on2.f(Math.min(1.0f, f2 * 2.5f), chatActivityEnterView.F0(cmb.Zf), chatActivityEnterView.F0(cmb.Uf)));
            }
            int color = paint.getColor();
            Paint paint2 = this.I;
            paint2.setColor(color);
            paint2.setAlpha((int) (40.8f * f6 * f7));
            canvas.drawCircle(measuredWidth2, measuredHeight2, gm.R1(1.35f, 1.75f, f6) * R13, paint2);
            paint.setAlpha((int) (gm.R1(0.6f, 1.0f, f6) * 255.0f * f7));
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
