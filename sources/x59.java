// default package

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class x59 extends View {
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public final RectF E;
    public final RectF E0;
    public final RectF F;
    public float[] F0;
    public final RectF G;
    public final mva G0;
    public final Path H;
    public final mva H0;
    public final RectF I;
    public final int[] I0;
    public final RectF J;
    public final float[][] J0;
    public final RectF K;
    public final Paint K0;
    public int L;
    public int L0;
    public byte[] M;
    public float[] M0;
    public final Path N;
    public float[] N0;
    public final mm O;
    public int O0;
    public final mm P;
    public byte[] P0;
    public final RectF Q;
    public long Q0;
    public float R;
    public Bitmap R0;
    public boolean S;
    public int S0;
    public boolean T;
    public long T0;
    public boolean U;
    public hx1 U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public final Paint W0;
    public boolean X0;
    public boolean Y0;
    public float Z0;
    public final vnb a;
    public boolean a0;
    public boolean a1;
    public final Paint b;
    public boolean b0;
    public boolean b1;
    public final Paint c;
    public float c0;
    public int c1;
    public final Paint d;
    public boolean d0;
    public float d1;
    public final Paint e;
    public w59 e0;
    public boolean e1;
    public final mf8 f;
    public final RectF f0;
    public final RectF g0;
    public final hn h;
    public final RectF h0;
    public final Paint i0;
    public final Paint j0;
    public final Paint k0;
    public final Paint l0;
    public final mm m0;
    public kfc n;
    public final mm n0;
    public final mm o0;
    public boolean p0;
    public float q0;
    public float r;
    public float r0;
    public float s;
    public float s0;
    public final Path t0;
    public Path u0;
    public final Paint v0;
    public float w;
    public final float[] w0;
    public boolean x;
    public final mm x0;
    public final v59 y;
    public final mm y0;
    public final mm z0;

    public x59(Context context, vnb vnbVar) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.s = 0.0f;
        this.w = 1.0f;
        this.x = false;
        this.y = new v59(this, (byte) 0);
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.N = new Path();
        k43 k43Var = k43.h;
        this.O = new mm(this, 0L, 340L, k43Var);
        this.P = new mm(this, 0L, 340L, k43Var);
        this.Q = new RectF();
        this.R = -1.0f;
        this.S = true;
        this.f0 = new RectF();
        this.g0 = new RectF();
        this.h0 = new RectF();
        this.i0 = new Paint(1);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Paint(1);
        this.m0 = new mm(this, 0L, 340L, k43Var);
        this.n0 = new mm(this, 0L, 220L, k43Var);
        this.o0 = new mm(this, 0L, 260L, k43Var);
        this.s0 = 1.0f;
        this.t0 = new Path();
        this.v0 = new Paint(1);
        this.w0 = new float[8];
        this.x0 = new mm(this, 0L, 160L, k43.g);
        this.y0 = new mm(this, 0L, 260L, k43Var);
        this.z0 = new mm(this, 0L, 200L, k43Var);
        this.E0 = new RectF();
        new Paint(1);
        this.F0 = new float[0];
        this.G0 = new mva(2400);
        this.H0 = new mva(2200);
        this.I0 = new int[6];
        this.J0 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 6, 0);
        this.K0 = new Paint(1);
        this.L0 = 625341585;
        this.M0 = new float[0];
        this.N0 = new float[0];
        this.O0 = -1;
        this.W0 = new Paint(2);
        this.c1 = -1;
        this.a = vnbVar;
        mf8 mf8Var = new mf8(12);
        this.f = mf8Var;
        mf8Var.f = this;
        mf8Var.setCallback(this);
        hn hnVar = new hn(false, false, false);
        this.h = hnVar;
        hnVar.n(0.5f, 200L, k43Var);
        hnVar.setCallback(this);
        hnVar.w(hl.L(12.0f));
        hnVar.x(hl.o());
        hnVar.N = hl.q.x;
    }

    public static float c(int i) {
        int i2 = i * (-1640531535);
        int i3 = (i2 ^ (i2 >>> 15)) * (-2048144777);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477379);
        return ((i4 ^ (i4 >>> 16)) >>> 8) / 1.6777216E7f;
    }

    public final void a(Canvas canvas, RectF rectF, float f) {
        Paint paint;
        Paint paint2;
        hn hnVar;
        mf8 mf8Var;
        Paint paint3;
        int i;
        byte b;
        byte b2;
        int i2;
        int i3;
        byte b3;
        float i4;
        if (this.d0) {
            b(canvas, rectF, f);
            return;
        }
        int i5 = aob.bg;
        vnb vnbVar = this.a;
        int v0 = aob.v0(i5, vnbVar);
        Paint paint4 = this.b;
        paint4.setColor(v0);
        int v02 = aob.v0(aob.cg, vnbVar);
        Paint paint5 = this.c;
        paint5.setColor(v02);
        int i6 = aob.Zf;
        int v03 = aob.v0(i6, vnbVar);
        hn hnVar2 = this.h;
        hnVar2.u(v03);
        int v04 = aob.v0(aob.Xf, vnbVar);
        mf8 mf8Var2 = this.f;
        mf8Var2.a.setColor(v04);
        int v05 = aob.v0(aob.Yf, vnbVar);
        Paint paint6 = this.d;
        paint6.setColor(v05);
        int v06 = aob.v0(i6, vnbVar);
        Paint paint7 = this.e;
        paint7.setColor(v06);
        int R1 = (int) hl.R1(rectF.left + hl.L(11.33f), rectF.right - hl.L(11.33f), Utilities.l(this.s));
        int R12 = (int) hl.R1(rectF.left + hl.L(11.33f), rectF.right - hl.L(11.33f), Utilities.l(this.w));
        int measuredWidth = getMeasuredWidth() - hl.L(27.0f);
        int i7 = this.L;
        Path path = this.N;
        if (i7 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            hnVar = hnVar2;
            mf8Var = mf8Var2;
            paint3 = paint7;
            i = R12;
        } else {
            int L = measuredWidth / hl.L(3.0f);
            int L2 = hl.L(2.0f);
            paint = paint5;
            int L3 = hl.L(12.0f);
            paint2 = paint4;
            byte b4 = Byte.MAX_VALUE;
            hnVar = hnVar2;
            byte b5 = Byte.MIN_VALUE;
            mf8Var = mf8Var2;
            int i8 = 0;
            while (true) {
                paint3 = paint7;
                if (i8 >= L) {
                    break;
                }
                byte[] bArr = this.M;
                if (bArr == null) {
                    i3 = i8;
                    i2 = R12;
                    b3 = 0;
                } else {
                    i2 = R12;
                    i3 = i8;
                    b3 = bArr[(int) ((i8 / L) * bArr.length)];
                }
                b4 = (byte) Math.min((int) b4, (int) b3);
                b5 = (byte) Math.max((int) b5, (int) b3);
                i8 = i3 + 1;
                paint7 = paint3;
                R12 = i2;
            }
            i = R12;
            path.rewind();
            int i9 = 0;
            while (i9 < L) {
                byte[] bArr2 = this.M;
                if (bArr2 == null) {
                    b = b4;
                    b2 = 0;
                } else {
                    b = b4;
                    b2 = bArr2[(int) ((i9 / L) * bArr2.length)];
                }
                float U1 = hl.U1(Utilities.l((b2 - b) / (b5 - b)), L2, L3);
                float L4 = hl.L(3.0f) * i9;
                RectF rectF2 = hl.P;
                rectF2.set(L4, (-U1) / 2.0f, hl.L(2.0f) + L4, U1 / 2.0f);
                path.addRoundRect(rectF2, hl.L(1.0f), hl.L(1.0f), Path.Direction.CW);
                i9++;
                b4 = b;
                L = L;
                L2 = L2;
            }
            this.L = measuredWidth;
        }
        canvas.save();
        Path path2 = this.H;
        path2.rewind();
        path2.addRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint8 = paint;
        canvas.drawRect(rectF.left, rectF.top, R1 - hl.L(1.33f), rectF.bottom, paint8);
        canvas.drawRect(hl.L(1.33f) + i, rectF.top, rectF.right, rectF.bottom, paint8);
        canvas.save();
        canvas.translate(rectF.left + hl.L(14.0f), rectF.centerY());
        int i10 = aob.Yf;
        paint6.setColor(aob.p1(0.3f, aob.v0(i10, vnbVar)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f2 = R1;
        float f3 = i;
        canvas.drawRect(f2, rectF.top, f3, rectF.bottom, paint2);
        if (this.a0) {
            i4 = this.c0;
        } else {
            i4 = Utilities.i(this.n != null ? r3.S() / this.n.U() : 1.0f, this.w, this.s);
        }
        float i11 = Utilities.i(hl.R1(rectF.left + hl.L(13.0f), rectF.right - hl.L(14.0f), i4), f3, f2);
        if (i11 < f3) {
            canvas.save();
            canvas.clipRect(i11, rectF.top, f3, rectF.bottom);
            canvas.translate(rectF.left + hl.L(14.0f), rectF.centerY());
            if (!this.x || i4 >= this.s || this.a0) {
                paint6.setColor(aob.v0(i10, vnbVar));
            } else {
                paint6.setColor(aob.v0(aob.Zf, vnbVar));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (i11 > f2) {
            canvas.save();
            canvas.clipRect(f2, rectF.top, i11, rectF.bottom);
            canvas.translate(rectF.left + hl.L(14.0f), rectF.centerY());
            if (g() || this.x || this.a0) {
                paint6.setColor(aob.v0(aob.Zf, vnbVar));
            } else {
                paint6.setColor(aob.v0(i10, vnbVar));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float L5 = R1 - hl.L(7.0f);
        float centerY = rectF.centerY() - hl.L(5.33f);
        float L6 = R1 - hl.L(5.33f);
        float centerY2 = rectF.centerY() + hl.L(5.33f);
        RectF rectF3 = this.G;
        rectF3.set(L5, centerY, L6, centerY2);
        Paint paint9 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint9);
        rectF3.set(hl.L(5.33f) + i, rectF.centerY() - hl.L(5.33f), hl.L(7.0f) + i, rectF.centerY() + hl.L(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint9);
        this.J.set(R1 - hl.L(24.0f), 0.0f, hl.L(6.0f) + R1, getHeight());
        this.K.set(i - hl.L(6.0f), 0.0f, hl.L(24.0f) + i, getHeight());
        float d = this.P.d(!this.a0);
        if (d > 0.0f) {
            float c = (int) (hnVar.c() + hl.L(30.0f));
            float d2 = this.O.d(c <= ((float) ((i - R1) - hl.L(8.0f))));
            float R13 = hl.R1(hl.L(24.0f), c, d2);
            float f4 = R1 + i;
            float f5 = (f4 - R13) / 2.0f;
            float L7 = hl.L(20.0f) / 2.0f;
            float centerY3 = rectF.centerY() - L7;
            float f6 = (f4 + R13) / 2.0f;
            float centerY4 = rectF.centerY() + L7;
            RectF rectF4 = this.F;
            rectF4.set(f5, centerY3, f6, centerY4);
            int alpha = paint8.getAlpha();
            paint8.setAlpha((int) (alpha * d));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint8);
            paint8.setAlpha(alpha);
            RectF rectF5 = this.I;
            rectF5.set(rectF4);
            rectF5.inset(-hl.L(6.0f), -hl.L(6.0f));
            canvas.save();
            int L8 = hl.L(12.0f);
            canvas.translate(hl.R1(rectF4.centerX() - (L8 / 2.0f), rectF4.left + hl.L(6.0f), d2), rectF4.centerY());
            mf8 mf8Var3 = mf8Var;
            mf8Var3.setBounds(0, (-L8) / 2, L8, L8 / 2);
            mf8Var3.g = (int) (d * 255.0f);
            mf8Var3.draw(canvas);
            canvas.restore();
            if (d2 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + hl.L(21.66f), rectF4.centerY() - hl.L(1.0f));
                hn hnVar3 = hnVar;
                hnVar3.setBounds(-1, -1, 1, 1);
                hnVar3.C = (int) (d2 * 255.0f * d);
                hnVar3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x060f A[EDGE_INSN: B:131:0x060f->B:132:0x060f BREAK  A[LOOP:0: B:73:0x042c->B:120:0x05fc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0651 A[LOOP:2: B:133:0x064a->B:135:0x0651, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x065a A[EDGE_INSN: B:136:0x065a->B:137:0x065a BREAK  A[LOOP:2: B:133:0x064a->B:135:0x0651], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0437  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, RectF rectF, float f) {
        mm mmVar;
        float f2;
        float min;
        float f3;
        float f4;
        float f5;
        byte b;
        byte b2;
        int i;
        byte b3;
        RectF rectF2;
        int i2;
        float f6;
        float f7;
        float f8;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        mva mvaVar;
        float pow;
        int i4;
        int[] iArr;
        float f9;
        int i5;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        Paint paint;
        int i6;
        int i7;
        char c;
        int i8;
        int i9;
        float d;
        float[] fArr;
        float f14;
        float f15;
        Paint paint2;
        int i10;
        float f16;
        int i11;
        float f17;
        float f18;
        float[] fArr2;
        int i12;
        boolean z4;
        float f19;
        boolean z5;
        float f20;
        int i13;
        boolean z6;
        float f21;
        float f22;
        float max;
        float l;
        AnimatorSet animatorSet;
        if (this.V0) {
            return;
        }
        if (this.R0 != null) {
            float uptimeMillis = (SystemClock.uptimeMillis() - this.T0) / 760.0f;
            int width = this.R0.getWidth();
            float l2 = 1.0f - Utilities.l(uptimeMillis / 0.45f);
            float f23 = 1.0f - (l2 * l2);
            if (!this.X0) {
                f23 = 1.0f - f23;
            }
            float f24 = f23 * width;
            canvas.save();
            if (this.X0) {
                canvas.clipRect(f24, 0.0f, width, getHeight());
            } else {
                canvas.clipRect(0.0f, 0.0f, f24, getHeight());
            }
            Paint paint3 = this.W0;
            paint3.setAlpha(jn7.d4);
            canvas.drawBitmap(this.R0, 0.0f, 0.0f, paint3);
            canvas.restore();
            mva mvaVar2 = this.H0;
            mvaVar2.b(canvas, 1.0f);
            int i14 = this.S0;
            int min2 = i14 - Math.min(i14, mvaVar2.E);
            int i15 = this.S0;
            float f25 = i15 == 0 ? 1.0f : min2 / i15;
            hx1 hx1Var = this.U0;
            if (hx1Var != null) {
                ChatActivityEnterView chatActivityEnterView = hx1Var.a;
                chatActivityEnterView.H5 = f25;
                chatActivityEnterView.p();
                if (f25 >= 0.881f && !chatActivityEnterView.C5 && (animatorSet = chatActivityEnterView.B5) != null) {
                    chatActivityEnterView.C5 = true;
                    chatActivityEnterView.B5 = null;
                    animatorSet.start();
                }
                if (!chatActivityEnterView.C5 && f25 < 0.98f) {
                    float sin = (((float) Math.sin(Utilities.i((f25 - 0.55f) / 0.43f, 1.0f, 0.0f) * 3.141592653589793d)) * 0.14f) + 1.0f;
                    chatActivityEnterView.h1.setScaleX(sin);
                    chatActivityEnterView.h1.setScaleY(sin);
                }
            }
            if ((uptimeMillis <= 1.0f || mvaVar2.E > 0) && uptimeMillis <= 1.6f) {
                postInvalidateOnAnimation();
                return;
            }
            mvaVar2.a();
            this.R0.recycle();
            this.R0 = null;
            this.U0 = null;
            this.V0 = true;
            if (hx1Var != null) {
                hl.c3(new uk8(hx1Var, (byte) 29));
                return;
            }
            return;
        }
        int v0 = aob.v0(aob.Pe, this.a);
        int argb = Color.argb(jn7.d4, Math.max(0, Color.red(v0) - 17), Math.max(0, Color.green(v0) - 18), Math.max(0, Color.blue(v0) - 18));
        int f26 = vm2.f(0.46f, v0, -1);
        boolean z7 = this.p0;
        mm mmVar2 = this.m0;
        mmVar2.d(z7);
        float d2 = this.n0.d(this.W);
        boolean z8 = true;
        float d3 = this.z0.d(this.p0);
        float l3 = Utilities.l(f);
        float f27 = 0.0f;
        float min3 = Math.min(rectF.height(), hl.L(32.0f));
        float f28 = rectF.left;
        float f29 = 0.55f;
        float f30 = min3 / 2.0f;
        float centerY = rectF.centerY() - f30;
        float f31 = 2.0f;
        float f32 = rectF.right;
        float centerY2 = rectF.centerY() + f30;
        RectF rectF3 = this.g0;
        rectF3.set(f28, centerY, f32, centerY2);
        float centerY3 = rectF3.centerY();
        float R1 = hl.R1(f30, Math.min(hl.L(9.0f), f30), Utilities.l((l3 - 0.4f) / 0.6f));
        float l4 = Utilities.l((l3 - 0.35f) / 0.65f) * this.s0;
        float L = hl.L(10.0f);
        this.C0 = rectF3.left + L + hl.L(4.0f);
        float L2 = (rectF3.right - L) - hl.L(4.0f);
        this.D0 = L2;
        float max2 = Math.max(1.0f, L2 - this.C0);
        float L3 = ((this.s * max2) + this.C0) - hl.L(4.0f);
        float L4 = hl.L(4.0f) + (this.w * max2) + this.C0;
        this.A0 = L3;
        this.B0 = L4;
        this.q0 = (L3 + L4) / 2.0f;
        this.r0 = rectF3.top;
        float f33 = L3 - L;
        float f34 = L4 + L;
        int p1 = aob.p1(this.s0, v0);
        Paint paint4 = this.i0;
        paint4.setColor(p1);
        float f35 = rectF3.top;
        float f36 = rectF3.bottom;
        RectF rectF4 = this.h0;
        rectF4.set(f33, f35, f34, f36);
        canvas.drawRoundRect(rectF4, R1, R1, paint4);
        Paint paint5 = paint4;
        float f37 = d3;
        if (l4 <= 0.0f) {
            this.Q0 = 0L;
            return;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        long j = this.Q0;
        if (j == 0) {
            mmVar = mmVar2;
            f2 = f34;
            min = 16.0f;
        } else {
            mmVar = mmVar2;
            f2 = f34;
            min = Math.min(64L, uptimeMillis2 - j);
        }
        this.Q0 = uptimeMillis2;
        int max3 = Math.max(12, (int) (max2 / hl.L(4.0f)));
        int i16 = this.O0;
        float[][] fArr3 = this.J0;
        if (max3 == i16) {
            f3 = 0.5f;
            if (this.P0 == this.M) {
                f4 = R1;
                f5 = min;
                float f38 = max3;
                float f39 = max2 / f38;
                float min4 = Math.min(hl.L(2.0f), f39 * f3);
                float L5 = hl.L(2.0f);
                float L6 = hl.L(13.0f);
                if (this.a0) {
                    kfc kfcVar = this.n;
                    if (kfcVar == null || kfcVar.U() <= 0) {
                        rectF2 = rectF3;
                        i2 = argb;
                        f6 = this.s;
                    } else if (g() || this.x) {
                        rectF2 = rectF3;
                        i2 = argb;
                        f6 = Utilities.i(this.n.S() / this.n.U(), this.w, this.s);
                    } else {
                        f6 = this.s;
                    }
                    float f40 = f6;
                    float e = this.o0.e(false, (!g() || this.x || this.a0) ? 1.0f : 0.0f);
                    hn hnVar = this.h;
                    float L7 = hl.L(33.0f) + hnVar.c();
                    float f41 = L4 - L3;
                    float d4 = this.y0.d(L7 <= f41 - ((float) hl.L(8.0f)));
                    float R12 = hl.R1(hl.L(24.0f), L7, d4);
                    float L8 = hl.L(22.0f);
                    float f42 = this.q0;
                    float f43 = R12 / 2.0f;
                    float f44 = L8 / 2.0f;
                    RectF rectF5 = this.E0;
                    rectF5.set(f42 - f43, centerY3 - f44, f42 + f43, centerY3 + f44);
                    canvas.save();
                    f7 = f5 / 250.0f;
                    f8 = f5 / 300.0f;
                    i3 = 0;
                    z = false;
                    z2 = false;
                    while (true) {
                        z3 = z;
                        mvaVar = this.G0;
                        if (i3 >= max3) {
                            break;
                        }
                        float f45 = f7;
                        float f46 = i3;
                        float f47 = (f46 + f3) / f38;
                        float f48 = (f47 < this.s || f47 > this.w) ? 1.0f : f27;
                        float f49 = f8;
                        float f50 = this.N0[i3];
                        if (f50 != f48) {
                            f20 = f48 > f50 ? Math.min(f48, f50 + f45) : Math.max(f48, f50 - f49);
                            f19 = f48;
                            this.N0[i3] = f20;
                            z5 = true;
                        } else {
                            f19 = f48;
                            z5 = z2;
                            f20 = f50;
                        }
                        if (f19 > f27) {
                            z3 = true;
                        }
                        if (f50 <= f27 && f20 > f27) {
                            d(i3);
                            if (f19 > f27) {
                                float R13 = hl.R1(L5, L6, this.M0[i3]);
                                i13 = i3;
                                float f51 = (f39 / f31) + (f46 * f39) + this.C0;
                                float f52 = f47 < (this.s + this.w) / f31 ? -1.0f : 1.0f;
                                int round = Math.round((this.M0[i13] * 44.0f) + 16.0f);
                                z6 = z5;
                                mvaVar.e(f());
                                mvaVar.b = mva.l(v0, f());
                                int i17 = 0;
                                while (i17 < round) {
                                    int i18 = round;
                                    float d5 = mvaVar.d() - f3;
                                    float d6 = ((mvaVar.d() - f3) * f39 * 1.1f) + f51;
                                    int i19 = i17;
                                    float x = c00.x(d5, R13, 1.05f, centerY3);
                                    float d7 = (mvaVar.d() + 0.3f) * hl.L(13.0f) * f52;
                                    mva mvaVar3 = this.G0;
                                    mvaVar3.h(d6, x, ((mvaVar3.d() * 0.8f) + 0.4f) * d7, (hl.L(8.0f) * d5) + ((-hl.L(5.0f)) - (mvaVar.d() * hl.L(17.0f))), (mvaVar.d() * 0.45f) + f29, mvaVar.d() * 0.05f);
                                    i17 = i19 + 1;
                                    round = i18;
                                }
                                if (f20 >= 1.0f) {
                                    float R14 = hl.R1(L5, L6, this.M0[i13]);
                                    float z9 = bp1.z(f39, min4, f31, (f46 * f39) + this.C0);
                                    int f53 = (f47 > f40 || f47 < this.s) ? f26 : vm2.f(e, f26, -1);
                                    if (f19 > f27) {
                                        float interpolation = k43.g.getInterpolation(f20);
                                        float f54 = f29;
                                        f21 = R14;
                                        float R15 = hl.R1(1.0f, f54, interpolation);
                                        float f55 = 1.0f - interpolation;
                                        l = f55 * f55;
                                        f22 = f27;
                                        max = R15;
                                    } else {
                                        f21 = R14;
                                        float f56 = 1.0f - f20;
                                        float f57 = f56 - 1.0f;
                                        f22 = f27;
                                        max = Math.max(f22, (1.4f * f57 * f57) + (2.4f * f57 * f57 * f57) + 1.0f);
                                        l = Utilities.l(f56 * 2.5f);
                                    }
                                    if (l > f22 && max > f22) {
                                        float max4 = Math.max(min4, max * f21);
                                        int p12 = aob.p1(l * l4, f53);
                                        Paint paint6 = this.j0;
                                        paint6.setColor(p12);
                                        float f58 = max4 / 2.0f;
                                        rectF4.set(z9, centerY3 - f58, z9 + min4, f58 + centerY3);
                                        float f59 = min4 / 2.0f;
                                        canvas.drawRoundRect(rectF4, f59, f59, paint6);
                                    }
                                }
                                i3 = i13 + 1;
                                z = z3;
                                f7 = f45;
                                f8 = f49;
                                z2 = z6;
                                f31 = 2.0f;
                                f27 = 0.0f;
                                f29 = 0.55f;
                            }
                        }
                        i13 = i3;
                        z6 = z5;
                        if (f20 >= 1.0f) {
                        }
                        i3 = i13 + 1;
                        z = z3;
                        f7 = f45;
                        f8 = f49;
                        z2 = z6;
                        f31 = 2.0f;
                        f27 = 0.0f;
                        f29 = 0.55f;
                    }
                    canvas.restore();
                    float f60 = f5 / 1000.0f;
                    boolean z10 = z2;
                    pow = (float) Math.pow(0.2d, f60);
                    float L9 = hl.L(70.0f);
                    float L10 = hl.L(9.0f);
                    float L11 = f30 - hl.L(1.2f);
                    float L12 = hl.L(1.7f);
                    i4 = 0;
                    while (true) {
                        iArr = this.I0;
                        f9 = pow;
                        if (i4 >= 6) {
                            break;
                        }
                        iArr[i4] = 0;
                        i4++;
                        pow = f9;
                    }
                    Paint.Cap cap = Paint.Cap.ROUND;
                    Paint paint7 = this.K0;
                    paint7.setStrokeCap(cap);
                    i5 = 0;
                    while (i5 < max3) {
                        float f61 = this.N0[i5];
                        if (f61 <= 0.0f) {
                            i10 = i5;
                            paint2 = paint7;
                            f16 = L9;
                            i11 = max3;
                            f17 = L5;
                        } else {
                            paint2 = paint7;
                            float f62 = i5;
                            float f63 = (f62 + f3) / f38;
                            i10 = i5;
                            boolean z11 = f63 >= this.s && f63 <= this.w;
                            float R16 = hl.R1(L5, L6, this.M0[i10]);
                            float f64 = (f39 / 2.0f) + (f62 * f39) + this.C0;
                            float l5 = Utilities.l((f63 < (this.s + this.w) / 2.0f ? f33 - f64 : f64 - f2) / hl.L(52.0f));
                            f16 = L9;
                            float f65 = 1.0f - (l5 * 0.35f);
                            i11 = max3;
                            int max5 = Math.max(3, Math.min(18, Math.round((this.M0[i10] * 13.0f * f65) + 5.0f)));
                            float interpolation2 = (z11 ? k43.j : k43.g).getInterpolation(f61);
                            boolean z12 = f61 >= 1.0f;
                            f17 = L5;
                            int i20 = 0;
                            while (i20 < max5) {
                                int i21 = ((i10 * 18) + i20) * 10;
                                int i22 = max5;
                                float[] fArr4 = this.F0;
                                int i23 = i21 + 4;
                                float f66 = fArr4[i23] + f60;
                                fArr4[i23] = f66;
                                int i24 = i21 + 5;
                                if (f66 >= fArr4[i24]) {
                                    int i25 = i21 + 6;
                                    boolean isNaN = Float.isNaN(fArr4[i25]);
                                    fArr2 = fArr4;
                                    i12 = i20;
                                    z4 = z12;
                                    fArr2[i25] = xnb.z(l5, hl.L(10.0f), min4 + hl.L(1.0f), h() - f3);
                                    int i26 = i21 + 7;
                                    fArr2[i26] = xnb.z(l5, 0.6f, 1.0f, (h() - f3) * R16);
                                    if (isNaN) {
                                        fArr2[i21] = (h() - f3) * min4;
                                        fArr2[i21 + 1] = fArr2[i21 + 9] * R16;
                                        f18 = l5;
                                    } else {
                                        fArr2[i21] = ((h() - f3) * hl.L(2.0f)) + fArr2[i25];
                                        f18 = l5;
                                        fArr2[i21 + 1] = ((h() - f3) * hl.L(2.0f)) + fArr2[i26];
                                    }
                                    fArr2[i21 + 2] = (h() - f3) * hl.L(6.0f);
                                    fArr2[i21 + 3] = (h() - f3) * hl.L(6.0f);
                                    fArr2[i24] = (h() * 1.3f) + 0.7f;
                                    fArr2[i23] = isNaN ? h() * fArr2[i24] * f3 : 0.0f;
                                    fArr2[i21 + 8] = ((h() * 0.45f) + 0.2f) * f65;
                                } else {
                                    f18 = l5;
                                    fArr2 = fArr4;
                                    i12 = i20;
                                    z4 = z12;
                                }
                                int i27 = i21 + 2;
                                fArr2[i27] = ((((fArr2[i21 + 6] - fArr2[i21]) * 3.2f) + ((h() - f3) * f16)) * f60) + fArr2[i27];
                                int i28 = i21 + 3;
                                int i29 = i21 + 1;
                                fArr2[i28] = ((((fArr2[i21 + 7] - fArr2[i29]) * 3.2f) + ((h() - f3) * f16)) * f60) + fArr2[i28];
                                float f67 = -L10;
                                fArr2[i27] = Utilities.i(fArr2[i27] * f9, L10, f67);
                                fArr2[i28] = Utilities.i(fArr2[i28] * f9, L10, f67);
                                fArr2[i21] = (fArr2[i27] * f60) + fArr2[i21];
                                fArr2[i29] = Utilities.i((fArr2[i28] * f60) + fArr2[i29], L11, -L11);
                                float f68 = L6;
                                float sin2 = fArr2[i21 + 8] * ((float) Math.sin(Utilities.l(fArr2[i23] / fArr2[i24]) * 3.141592653589793d));
                                float R17 = hl.R1(f64, fArr2[i21] + f64, interpolation2);
                                float R18 = hl.R1((fArr2[i21 + 9] * R16) + centerY3, fArr2[i29] + centerY3, interpolation2);
                                if (z4) {
                                    float f69 = sin2 * l4;
                                    if (f69 >= 0.02f) {
                                        int min5 = Math.min(5, (int) ((f69 * 6.0f) / 0.6f));
                                        int i30 = iArr[min5];
                                        float[] fArr5 = fArr3[min5];
                                        fArr5[i30] = R17;
                                        fArr5[i30 + 1] = R18;
                                        iArr[min5] = i30 + 2;
                                    }
                                }
                                i20 = i12 + 1;
                                L6 = f68;
                                max5 = i22;
                                l5 = f18;
                                z12 = z4;
                            }
                        }
                        i5 = i10 + 1;
                        L6 = L6;
                        paint7 = paint2;
                        L9 = f16;
                        L5 = f17;
                        max3 = i11;
                    }
                    Paint paint8 = paint7;
                    canvas.save();
                    RectF rectF6 = rectF2;
                    canvas.clipRect(rectF6);
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas.clipOutRect(f33 + hl.L(2.0f), rectF6.top, f2 - hl.L(2.0f), rectF6.bottom);
                        canvas2 = canvas;
                        f10 = L12;
                        f11 = l4;
                        f12 = f33;
                        f13 = f44;
                        paint = paint8;
                    } else {
                        canvas2 = canvas;
                        f10 = L12;
                        f11 = l4;
                        f12 = f33;
                        f13 = f44;
                        paint = paint8;
                        canvas2.clipRect(f33 + hl.L(2.0f), rectF6.top, f2 - hl.L(2.0f), rectF6.bottom, Region.Op.DIFFERENCE);
                    }
                    boolean f70 = f();
                    i6 = 0;
                    while (i6 < 6) {
                        if (iArr[i6] != 0) {
                            float f71 = ((i6 + f3) / 6.0f) * 0.6f;
                            if (f70) {
                                int[] l6 = mva.l(v0, z8);
                                paint.setColor(aob.p1(Math.min(1.0f, f71 * 1.6f), l6[i6 % l6.length]));
                                paint.setStrokeWidth(f10 * 0.8f);
                            } else {
                                int[] l7 = mva.l(v0, false);
                                paint.setColor(aob.p1(Math.min(1.0f, f71 * 1.6f), i6 >= 4 ? l7[6] : (i6 & 1) == 0 ? l7[1] : l7[3]));
                                paint.setStrokeWidth(Math.max(1.0f, hl.L(1.0f)));
                            }
                            canvas2.drawPoints(fArr3[i6], 0, iArr[i6], paint);
                        }
                        i6++;
                        z8 = true;
                    }
                    canvas2.restore();
                    canvas2.save();
                    i7 = Build.VERSION.SDK_INT;
                    float f72 = rectF6.top;
                    if (i7 >= 26) {
                        canvas2.clipOutRect(f12, f72 - hl.L(40.0f), f2, rectF6.bottom + hl.L(40.0f));
                        c = 4;
                    } else {
                        c = 4;
                        canvas2.clipRect(f12, f72 - hl.L(40.0f), f2, hl.L(40.0f) + rectF6.bottom, Region.Op.DIFFERENCE);
                    }
                    if (mvaVar.b(canvas2, f11)) {
                        z10 = true;
                    }
                    canvas2.restore();
                    i8 = 2;
                    i9 = 0;
                    while (i9 < i8) {
                        float f73 = i9 == 0 ? f12 : L4;
                        float f74 = f73 + L;
                        int i31 = 0;
                        while (true) {
                            fArr = this.w0;
                            if (i31 >= 8) {
                                break;
                            }
                            fArr[i31] = 0.0f;
                            i31++;
                        }
                        if (i9 == 0) {
                            fArr[7] = f4;
                            fArr[6] = f4;
                            fArr[1] = f4;
                            fArr[0] = f4;
                        } else {
                            fArr[5] = f4;
                            fArr[c] = f4;
                            fArr[3] = f4;
                            fArr[2] = f4;
                        }
                        Path path = this.t0;
                        path.rewind();
                        rectF4.set(f73, rectF6.top, f74, rectF6.bottom);
                        path.addRoundRect(rectF4, fArr, Path.Direction.CW);
                        int i32 = i2;
                        Paint paint9 = paint5;
                        paint9.setColor(aob.p1(f11, i32));
                        canvas2.drawPath(path, paint9);
                        boolean z13 = this.p0 && this.c1 == i9;
                        float L13 = hl.L(10.0f);
                        if (z13) {
                            f14 = f37;
                            f15 = hl.R1(1.0f, 1.2f, f14);
                        } else {
                            f14 = f37;
                            f15 = 1.0f;
                        }
                        paint9.setColor(aob.p1(f11 * 0.8f, -1));
                        float f75 = (f73 + f74) / 2.0f;
                        float f76 = (L13 * f15) / 2.0f;
                        rectF4.set(f75 - hl.L(0.8f), centerY3 - f76, f75 + hl.L(0.8f), f76 + centerY3);
                        canvas2.drawRoundRect(rectF4, hl.L(1.0f), hl.L(1.0f), paint9);
                        i9++;
                        f37 = f14;
                        i2 = i32;
                        paint5 = paint9;
                        i8 = 2;
                        c = 4;
                    }
                    Paint paint10 = paint5;
                    int i33 = i2;
                    d = this.x0.d(f41 >= ((float) (hl.L(6.0f) + hl.L(24.0f))));
                    if (d <= 0.01f) {
                        w59 w59Var = this.e0;
                        if (w59Var != null && (mmVar.c > 0.0f || this.p0)) {
                            ChatActivityEnterView chatActivityEnterView2 = ((fx1) w59Var).a;
                            l lVar = chatActivityEnterView2.D2;
                            if (lVar != null) {
                                lVar.invalidate();
                            }
                            chatActivityEnterView2.invalidate();
                        }
                        if (z10 || z3) {
                            postInvalidateOnAnimation();
                            return;
                        } else {
                            this.Q0 = 0L;
                            return;
                        }
                    }
                    mm mmVar3 = mmVar;
                    float f77 = f11 * d;
                    float R19 = hl.R1(f3, 1.0f, d) * (1.0f - (d2 * 0.06f));
                    canvas2.save();
                    canvas2.scale(R19, R19, rectF5.centerX(), rectF5.centerY());
                    paint10.setColor(aob.p1(f77, i33));
                    float f78 = f13;
                    canvas2.drawRoundRect(rectF5, f78, f78, paint10);
                    int L14 = hl.L(12.0f);
                    canvas2.save();
                    float f79 = L14 / 2.0f;
                    canvas2.translate(hl.R1(rectF5.centerX() - f79, rectF5.left + hl.L(7.0f), d4), centerY3);
                    mf8 mf8Var = this.f;
                    mf8Var.a.setColor(-1);
                    mf8Var.setBounds(0, (-L14) / 2, L14, L14 / 2);
                    float f80 = f77 * 255.0f;
                    int i34 = (int) f80;
                    mf8Var.g = i34;
                    if (mf8Var.d > 0.0f || g()) {
                        mf8Var.draw(canvas2);
                    } else {
                        Path path2 = this.u0;
                        Paint paint11 = this.v0;
                        if (path2 == null) {
                            this.u0 = new Path();
                            float N = hl.N(9.6f);
                            float N2 = hl.N(11.0f);
                            float N3 = hl.N(1.0f) + (f79 - (N / 2.0f));
                            this.u0.moveTo(N3, (-N2) / 2.0f);
                            this.u0.lineTo(N + N3, 0.0f);
                            this.u0.lineTo(N3, N2 / 2.0f);
                            this.u0.close();
                            paint11.setPathEffect(new CornerPathEffect(hl.N(1.6f)));
                        }
                        paint11.setColor(-1);
                        paint11.setAlpha(i34);
                        canvas2.drawPath(this.u0, paint11);
                    }
                    canvas2.restore();
                    if (d4 > 0.0f) {
                        hnVar.u(-1);
                        hnVar.C = (int) (f80 * d4);
                        canvas2.save();
                        canvas2.translate(rectF5.left + hl.L(24.0f), centerY3 - hl.L(1.0f));
                        hnVar.setBounds(-1, -1, 1, 1);
                        hnVar.draw(canvas2);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    w59 w59Var2 = this.e0;
                    if (w59Var2 != null && (mmVar3.c > 0.0f || this.p0)) {
                        ChatActivityEnterView chatActivityEnterView3 = ((fx1) w59Var2).a;
                        l lVar2 = chatActivityEnterView3.D2;
                        if (lVar2 != null) {
                            lVar2.invalidate();
                        }
                        chatActivityEnterView3.invalidate();
                    }
                    if (z10 || z3) {
                        postInvalidateOnAnimation();
                        return;
                    } else {
                        this.Q0 = 0L;
                        return;
                    }
                }
                f6 = this.c0;
                rectF2 = rectF3;
                i2 = argb;
                float f402 = f6;
                float e2 = this.o0.e(false, (!g() || this.x || this.a0) ? 1.0f : 0.0f);
                hn hnVar2 = this.h;
                float L72 = hl.L(33.0f) + hnVar2.c();
                float f412 = L4 - L3;
                float d42 = this.y0.d(L72 <= f412 - ((float) hl.L(8.0f)));
                float R122 = hl.R1(hl.L(24.0f), L72, d42);
                float L82 = hl.L(22.0f);
                float f422 = this.q0;
                float f432 = R122 / 2.0f;
                float f442 = L82 / 2.0f;
                RectF rectF52 = this.E0;
                rectF52.set(f422 - f432, centerY3 - f442, f422 + f432, centerY3 + f442);
                canvas.save();
                f7 = f5 / 250.0f;
                f8 = f5 / 300.0f;
                i3 = 0;
                z = false;
                z2 = false;
                while (true) {
                    z3 = z;
                    mvaVar = this.G0;
                    if (i3 >= max3) {
                    }
                    i3 = i13 + 1;
                    z = z3;
                    f7 = f45;
                    f8 = f49;
                    z2 = z6;
                    f31 = 2.0f;
                    f27 = 0.0f;
                    f29 = 0.55f;
                }
                canvas.restore();
                float f602 = f5 / 1000.0f;
                boolean z102 = z2;
                pow = (float) Math.pow(0.2d, f602);
                float L92 = hl.L(70.0f);
                float L102 = hl.L(9.0f);
                float L112 = f30 - hl.L(1.2f);
                float L122 = hl.L(1.7f);
                i4 = 0;
                while (true) {
                    iArr = this.I0;
                    f9 = pow;
                    if (i4 >= 6) {
                    }
                    iArr[i4] = 0;
                    i4++;
                    pow = f9;
                }
                Paint.Cap cap2 = Paint.Cap.ROUND;
                Paint paint72 = this.K0;
                paint72.setStrokeCap(cap2);
                i5 = 0;
                while (i5 < max3) {
                }
                Paint paint82 = paint72;
                canvas.save();
                RectF rectF62 = rectF2;
                canvas.clipRect(rectF62);
                if (Build.VERSION.SDK_INT >= 26) {
                }
                boolean f702 = f();
                i6 = 0;
                while (i6 < 6) {
                }
                canvas2.restore();
                canvas2.save();
                i7 = Build.VERSION.SDK_INT;
                float f722 = rectF62.top;
                if (i7 >= 26) {
                }
                if (mvaVar.b(canvas2, f11)) {
                }
                canvas2.restore();
                i8 = 2;
                i9 = 0;
                while (i9 < i8) {
                }
                Paint paint102 = paint5;
                int i332 = i2;
                d = this.x0.d(f412 >= ((float) (hl.L(6.0f) + hl.L(24.0f))));
                if (d <= 0.01f) {
                }
            }
        } else {
            f3 = 0.5f;
        }
        if (this.M0.length < max3) {
            float[] fArr6 = new float[max3];
            float[] fArr7 = this.N0;
            f4 = R1;
            System.arraycopy(fArr7, 0, fArr6, 0, Math.min(fArr7.length, max3));
            this.N0 = fArr6;
            this.M0 = new float[max3];
            this.F0 = new float[max3 * jn7.J2];
            for (int i35 = 0; i35 < 6; i35++) {
                fArr3[i35] = new float[max3 * 36];
            }
            for (int i36 = 0; i36 < max3; i36++) {
                d(i36);
            }
        } else {
            f4 = R1;
        }
        byte[] bArr = this.M;
        if (bArr != null && bArr.length > 0) {
            int length = bArr.length;
            b = Byte.MIN_VALUE;
            b2 = Byte.MAX_VALUE;
            int i37 = 0;
            while (true) {
                f5 = min;
                if (i37 >= length) {
                    break;
                }
                byte b4 = bArr[i37];
                b2 = (byte) Math.min((int) b2, (int) b4);
                b = (byte) Math.max((int) b, (int) b4);
                i37++;
                min = f5;
            }
        } else {
            f5 = min;
            b = 1;
            b2 = 0;
        }
        int i38 = 0;
        while (i38 < max3) {
            float f81 = (i38 + f3) / max3;
            byte[] bArr2 = this.M;
            byte b5 = b2;
            if (bArr2 == null || bArr2.length == 0) {
                i = i38;
                b3 = 0;
            } else {
                i = i38;
                b3 = bArr2[Math.min(bArr2.length - 1, (int) (bArr2.length * f81))];
            }
            float[] fArr8 = this.M0;
            Typeface typeface = hl.a;
            fArr8[i] = Utilities.l((b3 - b5) / (b - b5));
            if (this.O0 != max3) {
                this.N0[i] = (f81 < this.s || f81 > this.w) ? 1.0f : 0.0f;
            }
            i38 = i + 1;
            b2 = b5;
        }
        this.O0 = max3;
        this.P0 = this.M;
        float f382 = max3;
        float f392 = max2 / f382;
        float min42 = Math.min(hl.L(2.0f), f392 * f3);
        float L52 = hl.L(2.0f);
        float L62 = hl.L(13.0f);
        if (this.a0) {
        }
        rectF2 = rectF3;
        i2 = argb;
        float f4022 = f6;
        float e22 = this.o0.e(false, (!g() || this.x || this.a0) ? 1.0f : 0.0f);
        hn hnVar22 = this.h;
        float L722 = hl.L(33.0f) + hnVar22.c();
        float f4122 = L4 - L3;
        float d422 = this.y0.d(L722 <= f4122 - ((float) hl.L(8.0f)));
        float R1222 = hl.R1(hl.L(24.0f), L722, d422);
        float L822 = hl.L(22.0f);
        float f4222 = this.q0;
        float f4322 = R1222 / 2.0f;
        float f4422 = L822 / 2.0f;
        RectF rectF522 = this.E0;
        rectF522.set(f4222 - f4322, centerY3 - f4422, f4222 + f4322, centerY3 + f4422);
        canvas.save();
        f7 = f5 / 250.0f;
        f8 = f5 / 300.0f;
        i3 = 0;
        z = false;
        z2 = false;
        while (true) {
            z3 = z;
            mvaVar = this.G0;
            if (i3 >= max3) {
            }
            i3 = i13 + 1;
            z = z3;
            f7 = f45;
            f8 = f49;
            z2 = z6;
            f31 = 2.0f;
            f27 = 0.0f;
            f29 = 0.55f;
        }
        canvas.restore();
        float f6022 = f5 / 1000.0f;
        boolean z1022 = z2;
        pow = (float) Math.pow(0.2d, f6022);
        float L922 = hl.L(70.0f);
        float L1022 = hl.L(9.0f);
        float L1122 = f30 - hl.L(1.2f);
        float L1222 = hl.L(1.7f);
        i4 = 0;
        while (true) {
            iArr = this.I0;
            f9 = pow;
            if (i4 >= 6) {
            }
            iArr[i4] = 0;
            i4++;
            pow = f9;
        }
        Paint.Cap cap22 = Paint.Cap.ROUND;
        Paint paint722 = this.K0;
        paint722.setStrokeCap(cap22);
        i5 = 0;
        while (i5 < max3) {
        }
        Paint paint822 = paint722;
        canvas.save();
        RectF rectF622 = rectF2;
        canvas.clipRect(rectF622);
        if (Build.VERSION.SDK_INT >= 26) {
        }
        boolean f7022 = f();
        i6 = 0;
        while (i6 < 6) {
        }
        canvas2.restore();
        canvas2.save();
        i7 = Build.VERSION.SDK_INT;
        float f7222 = rectF622.top;
        if (i7 >= 26) {
        }
        if (mvaVar.b(canvas2, f11)) {
        }
        canvas2.restore();
        i8 = 2;
        i9 = 0;
        while (i9 < i8) {
        }
        Paint paint1022 = paint5;
        int i3322 = i2;
        d = this.x0.d(f4122 >= ((float) (hl.L(6.0f) + hl.L(24.0f))));
        if (d <= 0.01f) {
        }
    }

    public final void d(int i) {
        for (int i2 = 0; i2 < 18; i2++) {
            int i3 = ((18 * i) + i2) * 10;
            this.F0[i3 + 9] = h() - 0.5f;
            float[] fArr = this.F0;
            fArr[i3 + 5] = 0.0f;
            fArr[i3 + 4] = 1.0f;
            fArr[i3 + 6] = Float.NaN;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z = this.d0;
        if (z && !this.S) {
            float f = this.R;
            if (f >= 0.0f) {
                a(canvas, this.Q, f);
                return;
            }
        }
        if (this.S) {
            if (!z) {
                a(canvas, this.E, 1.0f);
                return;
            }
            float width = getWidth();
            float height = getHeight();
            RectF rectF = this.f0;
            rectF.set(0.0f, 0.0f, width, height);
            a(canvas, rectF, 1.0f);
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kfc kfcVar;
        if (!this.d0) {
            boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
            RectF rectF = this.J;
            boolean z = !contains && rectF.contains(motionEvent.getX(), motionEvent.getY());
            RectF rectF2 = this.K;
            boolean z2 = !contains && rectF2.contains(motionEvent.getX(), motionEvent.getY());
            boolean z3 = (contains || z || z2 || motionEvent.getX() <= rectF.right || motionEvent.getX() >= rectF2.left) ? false : true;
            if (motionEvent.getAction() == 0) {
                this.W = contains;
                this.U = z;
                this.V = z2;
                if (z || z2) {
                    this.b0 = g();
                    setPlaying(false);
                }
                this.a0 = z3;
                if (z3) {
                    this.b0 = g();
                    this.c0 = this.n != null ? r0.S() / this.n.U() : 1.0f;
                    setPlaying(false);
                }
                if (getParent() != null && (this.W || this.U || this.V || this.a0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (motionEvent.getAction() == 2) {
                boolean z4 = this.U;
                RectF rectF3 = this.E;
                if (z4) {
                    this.s = Utilities.i(hl.x1(motionEvent.getX(), rectF3.left + hl.L(11.33f), rectF3.right - hl.L(11.33f)), Utilities.l(this.w - Math.max(1.0f / this.r, hl.L(30.0f) / (rectF3.width() - hl.L(22.66f)))), 0.0f);
                    invalidate();
                } else if (this.V) {
                    this.w = Utilities.i(hl.x1(motionEvent.getX(), rectF3.left + hl.L(11.33f), rectF3.right - hl.L(11.33f)), 1.0f, Utilities.l(Math.max(1.0f / this.r, hl.L(30.0f) / (rectF3.width() - hl.L(22.66f))) + this.s));
                    invalidate();
                } else if (this.a0) {
                    kfc kfcVar2 = this.n;
                    if (kfcVar2 != null) {
                        float i = Utilities.i(hl.x1(motionEvent.getX(), rectF3.left + hl.L(11.33f), rectF3.right - hl.L(11.33f)), this.w, this.s);
                        this.c0 = i;
                        kfcVar2.p0((long) (i * this.n.U()), false);
                    }
                    invalidate();
                }
                this.h.t(hl.g0(Math.round(Math.max(1.0f, (this.w - this.s) * this.r)), false, false), false, true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.W) {
                    setPlaying(!g());
                } else if (this.U && this.x) {
                    kfc kfcVar3 = this.n;
                    if (kfcVar3 != null) {
                        kfcVar3.p0((long) (this.s * kfcVar3.U()), false);
                    }
                    setPlaying(true);
                } else if (this.V && this.x) {
                    kfc kfcVar4 = this.n;
                    if (kfcVar4 != null) {
                        kfcVar4.p0(Math.max((long) (this.s * kfcVar4.U()), ((long) (this.w * this.n.U())) - 1500), false);
                    }
                    setPlaying(true);
                } else if (this.a0 && !g()) {
                    setPlaying(true);
                }
                this.W = false;
                this.U = false;
                this.V = false;
                this.a0 = false;
            }
            return this.W || this.U || this.V || this.a0 || super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.R0 != null || this.V0) {
            if (actionMasked != 0) {
                return this.a1;
            }
        } else if (actionMasked == 0) {
            RectF rectF4 = this.g0;
            if (y >= rectF4.top - hl.L(10.0f) && y <= rectF4.bottom + hl.L(10.0f) && x >= rectF4.left - hl.L(8.0f) && x <= rectF4.right + hl.L(8.0f)) {
                this.Z0 = x;
                this.b1 = false;
                this.c1 = -1;
                float L = hl.L(10.0f) / 2.0f;
                float f = this.A0 - L;
                float f2 = this.B0 + L;
                float abs = Math.abs(x - f);
                float abs2 = Math.abs(x - f2);
                if (Math.min(abs, abs2) >= hl.L(22.0f) || this.E0.contains(x, y)) {
                    this.W = true;
                } else {
                    int i2 = abs <= abs2 ? 0 : 1;
                    this.c1 = i2;
                    this.d1 = x - (i2 == 0 ? this.A0 : this.B0);
                    this.p0 = true;
                    this.e1 = g();
                    setPlaying(false);
                    w59 w59Var = this.e0;
                    if (w59Var != null) {
                        ((fx1) w59Var).a(true);
                    }
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.a1 = true;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 2) {
            if (this.a1) {
                float max = Math.max(1.0f, this.D0 - this.C0);
                if (this.p0) {
                    float max2 = Math.max(1.0f / Math.max(1.0f, this.r), hl.L(40.0f) / max);
                    float f3 = x - this.d1;
                    if (this.c1 == 0) {
                        this.s = Utilities.i(((f3 + hl.L(4.0f)) - this.C0) / max, this.w - max2, 0.0f);
                    } else {
                        this.w = Utilities.i(((f3 - hl.L(4.0f)) - this.C0) / max, 1.0f, this.s + max2);
                    }
                    i(true);
                    invalidate();
                    return true;
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                if (!this.b1 && Math.abs(x - this.Z0) > scaledTouchSlop) {
                    this.W = false;
                    this.b1 = true;
                    this.a0 = true;
                    this.b0 = g();
                    kfc kfcVar5 = this.n;
                    if (kfcVar5 != null) {
                        kfcVar5.t0(false);
                    }
                }
                if (this.b1) {
                    this.c0 = Utilities.i((x - this.C0) / max, this.w, this.s);
                    kfc kfcVar6 = this.n;
                    if (kfcVar6 != null && kfcVar6.U() > 0) {
                        this.n.p0((long) (this.c0 * r13.U()), false);
                    }
                    this.x = true;
                    invalidate();
                    return true;
                }
            }
        } else {
            if (actionMasked != 1 && actionMasked != 3) {
                return this.a1;
            }
            if (this.a1) {
                if (this.p0) {
                    this.p0 = false;
                    kfc kfcVar7 = this.n;
                    if (kfcVar7 != null && kfcVar7.U() > 0) {
                        this.n.p0((long) (this.s * r13.U()), false);
                    }
                    if (this.e1) {
                        setPlaying(true);
                    }
                    w59 w59Var2 = this.e0;
                    if (w59Var2 != null) {
                        ((fx1) w59Var2).a(false);
                    }
                } else if (this.b1) {
                    this.a0 = false;
                    if (this.b0 && (kfcVar = this.n) != null) {
                        kfcVar.t0(true);
                        v59 v59Var = this.y;
                        hl.r(v59Var);
                        hl.d3(v59Var, 16L);
                    }
                } else if (actionMasked == 1) {
                    setPlaying(!g());
                }
                i(true);
                this.a1 = false;
                this.b1 = false;
                this.W = false;
                invalidate();
                return true;
            }
        }
    }

    public final boolean e(int i) {
        int v0 = aob.v0(aob.Pe, this.a);
        return (Color.blue(i) + ((Color.green(i) * 6) + (Color.red(i) * 3))) / 10 > ((Color.blue(v0) + ((Color.green(v0) * 6) + (Color.red(v0) * 3))) / 10) + 40;
    }

    public final boolean f() {
        return hl.B(aob.v0(aob.d6, this.a)) < 0.5f;
    }

    public final boolean g() {
        kfc kfcVar = this.n;
        return kfcVar != null && kfcVar.c0();
    }

    public float getAudioLeft() {
        return this.s;
    }

    public long getAudioLeftMs() {
        return (long) (this.s * getDuration());
    }

    public float getAudioRight() {
        return this.w;
    }

    public long getAudioRightMs() {
        return (long) (this.w * getDuration());
    }

    public long getDuration() {
        kfc kfcVar = this.n;
        if (kfcVar == null) {
            return 0L;
        }
        return kfcVar.U();
    }

    public double getNewDuration() {
        return ((this.w - this.s) * getDuration()) / 1000.0d;
    }

    public String getTrimBubbleText() {
        return hl.g0((int) Math.floor(this.s * r0), false, false) + " - " + hl.g0(Math.round(this.r * this.w), false, false);
    }

    public float getTrimHandleX() {
        float L = hl.L(10.0f);
        if (this.c1 != 1) {
            return this.A0 - (L / 2.0f);
        }
        return (L / 2.0f) + this.B0;
    }

    public float getTrimProgress() {
        return this.m0.c;
    }

    public float getTrimWindowCenterX() {
        return this.q0;
    }

    public float getTrimWindowTop() {
        return this.r0;
    }

    public final float h() {
        int i = this.L0;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        this.L0 = i3 ^ (i3 << 5);
        return (r0 >>> 8) / 1.6777216E7f;
    }

    public final void i(boolean z) {
        int round;
        if (this.d0) {
            if (this.n == null || (!g() && (!this.x || this.f == null || this.n.S() <= (this.s * this.n.U()) + 30.0f || this.n.S() >= (this.w * this.n.U()) - 60.0f))) {
                round = Math.round(Math.max(1.0f, (this.w - this.s) * this.r));
            } else {
                round = (int) Math.floor(Math.max(0.0f, this.n.S() - (this.s * this.n.U())) / 1000.0f);
            }
            boolean z2 = false;
            String g0 = hl.g0(round, false, false);
            if (z && !ob6.a0) {
                z2 = true;
            }
            this.h.t(g0, z2, true);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float L = hl.L(32.0f);
        this.E.set(0.0f, (getHeight() - L) / 2.0f, getWidth(), (getHeight() + L) / 2.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float L = hl.L(32.0f);
        this.E.set(0.0f, (getMeasuredHeight() - L) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + L) / 2.0f);
    }

    public void setAllowDraw(boolean z) {
        this.R = -1.0f;
        if (this.S != z) {
            this.S = z;
            invalidate();
        }
    }

    public void setNewContentAlpha(float f) {
        if (this.s0 != f) {
            this.s0 = f;
            invalidate();
        }
    }

    public void setNewStyle(boolean z) {
        if (this.d0 == z) {
            return;
        }
        this.d0 = z;
        if (z) {
            float L = hl.L(14.0f);
            hn hnVar = this.h;
            hnVar.w(L);
            hnVar.x(hl.o());
            hnVar.n(0.35f, 260L, k43.h);
            this.f.h = 260.0f;
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.k0;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.L(2.0f));
        Paint paint2 = this.l0;
        paint2.setStyle(style);
        paint2.setStrokeWidth(hl.L(1.5f));
        paint2.setColor(-1);
        invalidate();
    }

    public void setNewStyleDelegate(w59 w59Var) {
        this.e0 = w59Var;
    }

    public void setPlaying(boolean z) {
        if (this.T) {
            z = false;
        }
        if (this.n != null) {
            float S = r0.S() / this.n.U();
            if (S < this.s || S > this.w || (this.d0 && z && this.n.S() >= ((long) (this.w * this.n.U())) - 60)) {
                this.n.p0((long) (this.s * r0.U()), false);
            }
            this.n.t0(z);
        }
        this.f.a(z, true);
        if (this.d0) {
            if (z) {
                this.x = true;
            }
            i(true);
        }
        v59 v59Var = this.y;
        hl.r(v59Var);
        if (z) {
            hl.d3(v59Var, 16L);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }
}
