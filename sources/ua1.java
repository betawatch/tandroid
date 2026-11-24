// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ua1 extends Drawable {
    public static final sa1 H = new sa1((byte) 0);
    public int B;
    public int C;
    public int D;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public final ta1 q;
    public final ta1 r;
    public float s;
    public long t;
    public boolean u;
    public float v;
    public float w;
    public float x;
    public final float a = gl.L(18.0f);
    public final float b = gl.L(22.0f);
    public final float c = 2.4f;
    public final float d = gl.L(12.0f);
    public final float e = gl.L(1.5f);
    public final float f = 3600.0f;
    public final float g = 0.25f;
    public final Path y = new Path();
    public final float[] z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final nv0 F = new nv0(this, 14);
    public int G = kk7.d4;

    public ua1() {
        ta1 ta1Var = new ta1();
        this.q = ta1Var;
        ta1Var.a = 1.0f;
        ta1Var.b = 0.0f;
        ta1Var.c = gl.L(0.5f);
        ta1Var.d = gl.L(8.5f);
        ta1Var.e = 1.0f;
        ta1Var.f = 1.0f;
        ta1Var.g = (short) 61;
        ta1 ta1Var2 = new ta1();
        this.r = ta1Var2;
        ta1Var2.a = 0.82f;
        ta1Var2.b = 0.6f;
        ta1Var2.c = gl.L(0.0f);
        ta1Var2.d = gl.L(4.25f);
        ta1Var2.e = 0.55f;
        ta1Var2.f = 0.55f;
        ta1Var2.g = (short) 128;
        g(0, false);
    }

    public static int e(int i) {
        return i != 0 ? i != 1 ? i != 3 ? bkb.w0(null, bkb.Rh, false) : bm2.f(0.5f, bm2.f(0.5f, bkb.w0(null, bkb.Yh, false), bkb.w0(null, bkb.Zh, false)), bkb.w0(null, bkb.ai, false)) : bm2.f(0.5f, bkb.w0(null, bkb.Ph, false), bkb.w0(null, bkb.Qh, false)) : bm2.f(0.5f, bkb.w0(null, bkb.Nh, false), bkb.w0(null, bkb.Oh, false));
    }

    public final void a(int i) {
        this.B = i;
        ta1 ta1Var = this.q;
        ta1Var.h = i;
        ta1 ta1Var2 = this.r;
        ta1Var2.h = i;
        ta1Var.a();
        ta1Var2.a();
    }

    public final void b(float f, float f2, float f3, float[] fArr) {
        double d = f3;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f4 = this.j;
        fArr[0] = (f4 * cos) + f;
        fArr[1] = (f4 * sin) + f2;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void c(Canvas canvas, ta1 ta1Var, float f, float f2, float f3) {
        int i;
        char c;
        int i2 = ta1Var.x;
        if (i2 == 0) {
            return;
        }
        float f4 = ta1Var.c;
        float f5 = ta1Var.d - f4;
        float f6 = this.v;
        float f7 = (f5 * f6) + f4;
        float f8 = 1.0f;
        float f9 = 0.0f;
        float z = yjb.z(f6, 1.0f, 0.0f, this.d * ta1Var.e);
        float[] fArr = ta1Var.u;
        float[] fArr2 = ta1Var.v;
        float[] fArr3 = ta1Var.w;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            float interpolation = H.getInterpolation(ta1Var.o[i4]);
            float f10 = 1.0f - interpolation;
            fArr[i4] = (ta1Var.l[i4] * interpolation) + (ta1Var.k[i4] * f10);
            fArr3[i4] = (ta1Var.n[i4] * interpolation) + (ta1Var.m[i4] * f10);
        }
        float f11 = this.g;
        char c2 = 2;
        if (f11 > 0.0f) {
            int i5 = 0;
            while (i5 < 2) {
                int i6 = 0;
                while (i6 < i2) {
                    float f12 = f8;
                    int i7 = i6 + 1;
                    float f13 = (fArr[i6 == 0 ? i2 - 1 : i6 - 1] + fArr[i7 == i2 ? 0 : i7]) * 0.5f;
                    float f14 = f9;
                    float f15 = fArr[i6];
                    fArr2[i6] = tb4.A(f13, f15, f11, f15);
                    i6 = i7;
                    f8 = f12;
                    f9 = f14;
                }
                float f16 = f8;
                i5++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
                f8 = f16;
            }
        }
        float f17 = f8;
        float f18 = f9;
        int i8 = 0;
        while (i8 < i2) {
            float f19 = (i8 / i2) + fArr3[i8];
            float floor = (f19 - ((float) Math.floor(f19))) * this.p;
            float f20 = this.m;
            float[] fArr5 = this.z;
            if (floor < f20) {
                fArr5[i3] = (-this.k) + floor;
                fArr5[1] = -this.i;
                fArr5[c2] = f17;
                fArr5[3] = f18;
                i = i3;
                c = c2;
            } else {
                float f21 = floor - f20;
                float f22 = this.o;
                i = i3;
                float f23 = this.c;
                if (f21 < f22) {
                    c = c2;
                    b(this.k, -this.l, (f21 / (f23 * this.j)) - 1.5707964f, fArr5);
                } else {
                    c = c2;
                    float f24 = f21 - f22;
                    float f25 = this.n;
                    if (f24 < f25) {
                        fArr5[i] = this.h;
                        fArr5[1] = (-this.l) + f24;
                        fArr5[c] = f18;
                        fArr5[3] = f17;
                    } else {
                        float f26 = f24 - f25;
                        if (f26 < f22) {
                            b(this.k, this.l, f26 / (f23 * this.j), fArr5);
                        } else {
                            float f27 = f26 - f22;
                            if (f27 < f20) {
                                fArr5[i] = this.k - f27;
                                fArr5[1] = this.i;
                                fArr5[c] = -1.0f;
                                fArr5[3] = f18;
                            } else {
                                float f28 = f27 - f20;
                                if (f28 < f22) {
                                    b(-this.k, this.l, (f28 / (f23 * this.j)) + 1.5707964f, fArr5);
                                } else {
                                    float f29 = f28 - f22;
                                    if (f29 < f25) {
                                        fArr5[i] = -this.h;
                                        fArr5[1] = this.l - f29;
                                        fArr5[c] = f18;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        b(-this.k, -this.l, ((f29 - f25) / (f23 * this.j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f30 = fArr5[3];
            float f31 = -fArr5[c];
            float f32 = (fArr[i8] * z) + f7 + f3;
            ta1Var.q[i8] = (f30 * f32) + f + fArr5[i];
            ta1Var.r[i8] = (f31 * f32) + f2 + fArr5[1];
            ta1Var.s[i8] = fArr5[c];
            ta1Var.t[i8] = fArr5[3];
            i8++;
            c2 = c;
            i3 = i;
        }
        int i9 = i3;
        Path path = this.y;
        path.rewind();
        path.moveTo(ta1Var.q[i9], ta1Var.r[i9]);
        int i10 = i9;
        while (i10 < i2) {
            int i11 = i10 + 1;
            int i12 = i11 < i2 ? i11 : i9;
            float[] fArr6 = ta1Var.q;
            float f33 = fArr6[i12] - fArr6[i10];
            float[] fArr7 = ta1Var.r;
            float f34 = fArr7[i12] - fArr7[i10];
            float sqrt = ((float) Math.sqrt((f34 * f34) + (f33 * f33))) / 3.0f;
            float[] fArr8 = ta1Var.q;
            float f35 = fArr8[i10];
            float[] fArr9 = ta1Var.s;
            float f36 = (fArr9[i10] * sqrt) + f35;
            float[] fArr10 = ta1Var.r;
            float f37 = fArr10[i10];
            float[] fArr11 = ta1Var.t;
            float f38 = (fArr11[i10] * sqrt) + f37;
            float f39 = fArr8[i12];
            float f40 = f39 - (fArr9[i12] * sqrt);
            float f41 = fArr10[i12];
            path.cubicTo(f36, f38, f40, f41 - (fArr11[i12] * sqrt), f39, f41);
            i10 = i11;
        }
        path.close();
        canvas.drawPath(path, ta1Var.i);
    }

    public final float d() {
        ta1 ta1Var = this.q;
        float f = ta1Var.d;
        float f2 = ta1Var.f;
        float f3 = this.e;
        float f4 = (f2 * f3) + f;
        float f5 = ta1Var.e;
        float f6 = this.d;
        float f7 = (f5 * f6) + f4;
        ta1 ta1Var2 = this.r;
        return Math.max(f7, (f6 * ta1Var2.e) + (f3 * ta1Var2.f) + ta1Var2.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.h < 1.0f) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = (this.u || this.E < 1.0f) ? Math.min(40L, Math.max(0L, elapsedRealtime - this.t)) : 0L;
        this.t = elapsedRealtime;
        boolean e = e66.e(512);
        ta1 ta1Var = this.r;
        ta1 ta1Var2 = this.q;
        if (e && min > 0) {
            float f = this.w;
            float f2 = this.v;
            if (f != f2) {
                float f3 = this.x;
                float f4 = (min * f3) + f2;
                this.v = f4;
                if (f3 > 0.0f) {
                    if (f4 > f) {
                        this.v = f;
                    }
                    f = f4;
                } else {
                    if (f4 < f) {
                        this.v = f;
                    }
                    f = f4;
                }
            } else {
                f = f2;
            }
            this.s = b00.A(min, this.f, 6.2831855f, this.s);
            ta1Var2.d(f);
            ta1Var.d(this.v);
        }
        float f5 = this.E;
        if (f5 < 1.0f && min > 0) {
            float f6 = (min / 250.0f) + f5;
            this.E = f6;
            if (f6 > 1.0f) {
                this.E = 1.0f;
                f6 = 1.0f;
            }
            a(bm2.f(f6, this.C, this.D));
        }
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f7 = 1.0f - (this.v * 0.7f);
        float f8 = ta1Var2.f;
        float f9 = this.e;
        float z = yjb.z((float) Math.sin(this.s), 0.5f, 0.5f, f8 * f9 * f7);
        float z2 = yjb.z((float) Math.sin(this.s + ta1Var.b), 0.5f, 0.5f, f9 * ta1Var.f * f7);
        c(canvas, this.q, exactCenterX, exactCenterY, z);
        c(canvas, this.r, exactCenterX, exactCenterY, z2);
        if (this.E < 1.0f) {
            invalidateSelf();
        }
    }

    public final void f(float f) {
        this.w = f;
        if (e66.e(512)) {
            float f2 = this.w - this.v;
            this.x = f2 / (((f2 > 0.0f ? 400.0f : 500.0f) * 0.55f) + 100.0f);
        }
    }

    public final void g(int i, boolean z) {
        if (i != this.A || this.E < 1.0f) {
            this.A = i;
            int e = e(i);
            if (z && this.B != 0 && e66.e(512)) {
                this.C = this.B;
                this.D = e;
                this.E = 0.0f;
            } else {
                this.E = 1.0f;
                a(e);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            g(2, z);
            return;
        }
        fc2 fc2Var = sharedInstance.groupCall;
        if (fc2Var == null) {
            g(sharedInstance.isMicMute() ? 1 : 0, z);
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
        if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || hc2.w(14, sharedInstance.getChat())) && !sharedInstance.groupCall.b.rtmp_stream) {
            g(sharedInstance.isMicMute() ? 1 : 0, z);
        } else {
            sharedInstance.setMicMute(true, false, false);
            g(3, z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (getBounds().isEmpty()) {
            return;
        }
        float d = d() + gl.L(1.0f);
        float min = (Math.min(r6.width(), r6.height()) / 2.0f) - gl.L(2.0f);
        if (d > min) {
            d = Math.max(0.0f, min);
        }
        this.h = (r6.width() / 2.0f) - d;
        float height = (r6.height() / 2.0f) - d;
        this.i = height;
        float f = this.h;
        if (f < 1.0f || height < 1.0f) {
            return;
        }
        float min2 = Math.min(this.a, Math.min(f, height));
        this.j = min2;
        float f2 = this.h - min2;
        this.k = f2;
        float f3 = this.i - min2;
        this.l = f3;
        float f4 = f2 * 2.0f;
        this.m = f4;
        float f5 = f3 * 2.0f;
        this.n = f5;
        float f6 = this.c * 1.5707964f * min2;
        this.o = f6;
        float f7 = (f5 * 2.0f) + (f4 * 2.0f);
        this.p = (f6 * 4.0f) + f7;
        int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f7) / this.b)));
        ta1 ta1Var = this.q;
        if (max != ta1Var.x) {
            ta1Var.c(max);
            this.r.c(max);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.G != i) {
            this.G = i;
            ta1 ta1Var = this.q;
            ta1Var.y = i;
            ta1Var.a();
            ta1 ta1Var2 = this.r;
            ta1Var2.y = i;
            ta1Var2.a();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.q.i.setColorFilter(colorFilter);
        this.r.i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
