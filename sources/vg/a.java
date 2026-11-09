package vg;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import c8.ad;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a {
    public static final String[] D = {"crownGradient", "pavilionGradient", "lightSweep", "crownSweep", "rightCrownSweep", "leftCrownSweep", "pavilionSweep", "rightPavilionSweep", "leftPavilionSweep"};
    public boolean A;
    public int C;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final float[] q;
    public final float[] r;
    public int t;
    public int u;
    public int v;
    public final int w;
    public double x;
    public float y;
    public float z;
    public final int[] a = new int[3];
    public final int[] b = new int[4];
    public final int[] c = new int[3];
    public final int[] d = new int[3];
    public final int[] e = new int[2];
    public final int[] f = new int[2];
    public final int[] g = new int[1];
    public final HashMap h = new HashMap();
    public final float[] i = new float[16];
    public final float[] j = new float[16];
    public final float[] k = new float[16];
    public final float[] l = new float[42];
    public float s = 1.0f;
    public float B = 1.0f;

    public a(Context context, int i7) {
        try {
            String[] strArr = {"diamond", "sparkle", "copy"};
            for (int i10 = 0; i10 < 3; i10++) {
                this.a[i10] = ad.a(context, j(context, i10 == 2 ? "fullscreenVertex" : strArr[i10] + "Vertex"), j(context, strArr[i10] + "Fragment"));
            }
            float[] a10 = a(context, "frames");
            this.m = a10;
            float[] a11 = a(context, "planes");
            this.n = a11;
            float[] a12 = a(context, "anchors");
            this.o = a12;
            float[] a13 = a(context, "widths");
            this.p = a13;
            float[] a14 = a(context, "facetProjection");
            this.q = a14;
            float[] a15 = a(context, "camera");
            this.r = a15;
            if (a12.length != 64 || a13.length != 91 || a14.length != 4 || a15.length != 3) {
                throw new IllegalStateException("Invalid Swift diamond camera data");
            }
            if (a10.length != 60522 || a11.length != 68) {
                throw new IllegalStateException("Invalid Swift diamond animation data");
            }
            int[] iArr = this.b;
            GLES30.glGenVertexArrays(iArr.length, iArr, 0);
            int[] iArr2 = this.c;
            GLES20.glGenBuffers(iArr2.length, iArr2, 0);
            String[] strArr2 = {"vertices", "main", "small"};
            int i11 = 0;
            while (i11 < 3) {
                float[] a16 = a(context, strArr2[i11]);
                int i12 = i11 == 0 ? 3 : 2;
                this.d[i11] = a16.length / (i12 * 4);
                GLES30.glBindVertexArray(this.b[i11]);
                GLES20.glBindBuffer(34962, this.c[i11]);
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(a16.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                asFloatBuffer.put(a16).position(0);
                GLES20.glBufferData(34962, a16.length * 4, asFloatBuffer, 35044);
                for (int i13 = 0; i13 < i12; i13++) {
                    GLES20.glEnableVertexAttribArray(i13);
                    GLES20.glVertexAttribPointer(i13, 4, 5126, false, i12 * 16, i13 * 16);
                }
                i11++;
            }
            GLES20.glGenFramebuffers(2, this.e, 0);
            GLES20.glGenRenderbuffers(2, this.f, 0);
            GLES20.glGenTextures(1, this.g, 0);
            GLES20.glBindTexture(3553, this.g[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int[] iArr3 = new int[1];
            GLES20.glGetIntegerv(36183, iArr3, 0);
            this.w = Math.min(i7, iArr3[0]);
        } catch (Exception e10) {
            b();
            throw new IllegalStateException("Cannot load Swift diamond", e10);
        }
    }

    public static float[] a(Context context, String str) {
        byte[] g10 = g(context, "models/diamond_ios/" + str + ".bin");
        float[] fArr = new float[g10.length / 4];
        ByteBuffer.wrap(g10).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer().get(fArr);
        return fArr;
    }

    public static byte[] g(Context context, String str) {
        InputStream open = context.getAssets().open(str);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[TLObject.FLAG_14];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        open.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static float i(float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        return com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
    }

    public static String j(Context context, String str) {
        return new String(g(context, "shaders/diamond/" + str + ".glsl"), StandardCharsets.UTF_8);
    }

    public final void b() {
        for (int i7 : this.a) {
            if (i7 != 0) {
                GLES20.glDeleteProgram(i7);
            }
        }
        int[] iArr = this.c;
        GLES20.glDeleteBuffers(iArr.length, iArr, 0);
        int[] iArr2 = this.b;
        GLES30.glDeleteVertexArrays(iArr2.length, iArr2, 0);
        int[] iArr3 = this.g;
        GLES20.glDeleteTextures(iArr3.length, iArr3, 0);
        int[] iArr4 = this.e;
        GLES20.glDeleteFramebuffers(iArr4.length, iArr4, 0);
        int[] iArr5 = this.f;
        GLES20.glDeleteRenderbuffers(iArr5.length, iArr5, 0);
    }

    public final void c(int i7, int i10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z9) {
        boolean z10;
        int i11;
        int i12;
        if (i7 <= 0 || i10 <= 0) {
            return;
        }
        float max = Math.max(0.0f, Math.min(f13, 0.1f));
        double d = this.x + max;
        this.x = d;
        float f16 = (float) d;
        double d2 = (d * 240.0d) % 1440.0d;
        int i13 = (int) d2;
        float f17 = (float) (d2 - i13);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            float[] fArr = this.l;
            if (i15 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.m;
            float f18 = fArr2[(i13 * 42) + i15];
            fArr[i15] = com.google.android.recaptcha.internal.a.z(fArr2[((1 + i13) * 42) + i15], f18, f17, f18);
            i15++;
        }
        float f19 = i7;
        int max2 = Math.max(1, Math.round(this.B * f19));
        float f20 = i10;
        int max3 = Math.max(1, Math.round(this.B * f20));
        int i16 = this.u;
        int i17 = 36160;
        int[] iArr = this.e;
        if (max2 == i16 && max3 == this.v) {
            z10 = true;
            i11 = 2;
            i12 = 0;
        } else {
            this.u = max2;
            this.v = max3;
            GLES20.glBindFramebuffer(36160, iArr[0]);
            int i18 = 0;
            z10 = true;
            for (int i19 = 2; i18 < i19; i19 = 2) {
                int[] iArr2 = this.f;
                int i20 = i14;
                GLES20.glBindRenderbuffer(36161, iArr2[i18]);
                GLES30.glRenderbufferStorageMultisample(36161, this.w, i18 == 0 ? 32856 : 33189, max2, max3);
                GLES20.glFramebufferRenderbuffer(36160, i18 == 0 ? 36064 : 36096, 36161, iArr2[i18]);
                i18++;
                i17 = 36160;
                i14 = i20;
            }
            int i21 = i14;
            int i22 = i17;
            if (GLES20.glCheckFramebufferStatus(i22) != 36053) {
                throw new IllegalStateException("Incomplete diamond framebuffer");
            }
            GLES20.glBindFramebuffer(i22, iArr[1]);
            int[] iArr3 = this.g;
            GLES20.glBindTexture(3553, iArr3[i21]);
            i11 = 2;
            GLES20.glTexImage2D(3553, 0, 32856, max2, max3, 0, 6408, 5121, null);
            i12 = i21;
            GLES20.glFramebufferTexture2D(i22, 36064, 3553, iArr3[i21], i12);
            if (GLES20.glCheckFramebufferStatus(i22) != 36053) {
                throw new IllegalStateException("Incomplete diamond framebuffer");
            }
        }
        float[] fArr3 = this.r;
        float f21 = f11 + fArr3[i12];
        double d10 = f10;
        int i23 = i11;
        float min = Math.min(90.0f, (360.0f * Math.abs((float) Math.IEEEremainder(d10, 1.5707963267948966d))) / 3.1415927f);
        int min2 = Math.min(89, (int) min);
        float f22 = min - min2;
        float[] fArr4 = this.p;
        float f23 = fArr4[min2];
        float f24 = fArr4[min2 + 1];
        float f25 = min2 == 0 ? 0.0f : (f24 - fArr4[min2 - 1]) / 2.0f;
        float f26 = min2 == 89 ? 0.0f : (fArr4[min2 + 2] - f23) / 2.0f;
        float f27 = ((((((((f23 - f24) * 2.0f) + f25 + f26) * f22) + ((((f24 - f23) * 3.0f) - (f25 * 2.0f)) - f26)) * f22) + f25) * f22) + f23;
        float sin = (float) Math.sin(r9 * 2.0f);
        float f28 = (1.0f - ((0.035f * sin) * sin)) * fArr4[0];
        double d11 = f21;
        this.s = ((1.0f - i((float) ((Math.abs(Math.sin(d11)) - Math.sin(0.25d)) / (Math.sin(0.96d) - Math.sin(0.25d))))) * ((f28 / f27) - 1.0f)) + 1.0f;
        float[] fArr5 = this.i;
        Matrix.setIdentityM(fArr5, 0);
        Matrix.rotateM(this.i, 0, -((float) Math.toDegrees(f12)), 0.0f, 0.0f, 1.0f);
        Matrix.rotateM(this.i, 0, (float) Math.toDegrees(d11), 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.i, 0, (float) Math.toDegrees(d10), 0.0f, 1.0f, 0.0f);
        boolean z11 = false;
        Matrix.transposeM(this.j, 0, fArr5, 0);
        float f29 = 0.0f;
        int i24 = 0;
        float f30 = -1.0f;
        while (i24 < 4) {
            float f31 = (i24 * 3.1415927f) / 2.0f;
            int i25 = i24;
            float cos = (float) (Math.cos(f21 - fArr3[z11 ? 1 : 0]) * Math.cos(f10 + f31));
            if (cos > f30) {
                f30 = cos;
                f29 = f31;
            }
            i24 = i25 + 1;
            z11 = false;
        }
        float hypot = (!this.A || max <= 0.0f) ? 0.596f : ((float) Math.hypot((float) Math.atan2(Math.sin(f10 - this.y), Math.cos(f10 - this.y)), f21 - this.z)) / max;
        this.y = f10;
        this.z = f21;
        this.A = z10;
        float i26 = i(((0.41887903f / Math.max(hypot, 0.001f)) - 0.06f) / 0.34f) * i(1.0f - (((float) Math.acos(Math.max(-1.0f, Math.min(1.0f, f30)))) / 0.20943952f));
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glViewport(0, 0, this.u, this.v);
        GLES20.glDepthMask(true);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        float f32 = f19 / f20;
        float max4 = Math.max(1.0f, 1.0f / f32) * (1.52f / (0.9975f / fArr4[0]));
        float[] fArr6 = this.k;
        Matrix.setIdentityM(fArr6, 0);
        float f33 = 1.0f / (f32 * max4);
        fArr6[0] = f33;
        fArr6[5] = 1.0f / max4;
        float f34 = 1.0f / fArr3[i23];
        float f35 = -f34;
        float f36 = f35 / fArr3[1];
        fArr6[0] = f33 * this.s;
        float f37 = 0.12f / max4;
        fArr6[9] = f37 * f36;
        fArr6[10] = f35 / 6.0f;
        fArr6[11] = f36;
        fArr6[13] = f37 * f34;
        fArr6[14] = 0.5f * f34;
        fArr6[15] = f34;
        int[] iArr4 = this.a;
        h(f16, f29, i26, iArr4[0]);
        GLES20.glDisable(3042);
        GLES20.glEnable(2929);
        GLES20.glEnable(2884);
        GLES20.glDepthFunc(515);
        int[] iArr5 = this.b;
        GLES30.glBindVertexArray(iArr5[0]);
        int[] iArr6 = this.d;
        GLES20.glDrawArrays(4, 0, iArr6[0]);
        h(f16, f29, i26, iArr4[1]);
        GLES20.glEnable(3042);
        GLES20.glDisable(2884);
        GLES20.glDisable(2929);
        int i27 = 1;
        while (i27 <= i23) {
            GLES30.glBindVertexArray(iArr5[i27]);
            GLES30.glUniform1ui(e("baseInstance"), i27 - 1);
            GLES30.glDrawArraysInstanced(4, 0, iArr6[i27], i27 == 1 ? 1 : 7);
            i27++;
        }
        GLES20.glBindFramebuffer(36008, iArr[0]);
        GLES20.glBindFramebuffer(36009, iArr[1]);
        int i28 = this.u;
        int i29 = this.v;
        GLES30.glBlitFramebuffer(0, 0, i28, i29, 0, 0, i28, i29, TLObject.FLAG_14, 9728);
        if (!z9) {
            d(f14, f15, i7, i10);
        } else {
            GLES20.glBindFramebuffer(36160, iArr[1]);
            GLES30.glBindVertexArray(0);
        }
    }

    public final void d(float f10, float f11, int i7, int i10) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i7, i10);
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        int i11 = this.a[2];
        this.t = i11;
        GLES20.glUseProgram(i11);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.g[0]);
        GLES20.glUniform1i(e("image"), 0);
        GLES20.glUniform1f(e("opacity"), f10);
        GLES20.glUniform1f(e("white"), f11);
        GLES30.glBindVertexArray(this.b[3]);
        GLES20.glDrawArrays(4, 0, 3);
        GLES30.glBindVertexArray(0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glEnable(2929);
    }

    public final int e(String str) {
        String str2 = this.t + ":" + str;
        HashMap hashMap = this.h;
        Integer num = (Integer) hashMap.get(str2);
        if (num == null) {
            num = Integer.valueOf(GLES20.glGetUniformLocation(this.t, str));
            hashMap.put(str2, num);
        }
        return num.intValue();
    }

    public final void f(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(e("u.".concat(str)), 1, false, fArr, 0);
    }

    public final void h(float f10, float f11, float f12, int i7) {
        this.t = i7;
        GLES20.glUseProgram(i7);
        f("model", this.i);
        f("inverseModel", this.j);
        f("projection", this.k);
        k("parameters", f10, 0.72f, 1.0f, 1.0f);
        GLES20.glUniform4fv(e("u.facetProjection"), 1, this.q, 0);
        k("appearance", this.C, 0.0f, 0.0f, 0.0f);
        k("referenceCrownFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        k("referencePavilionFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        for (int i10 = 0; i10 < 8; i10++) {
            int e10 = e("anchors[" + i10 + "].position");
            int i11 = i10 * 8;
            float[] fArr = this.o;
            GLES20.glUniform4fv(e10, 1, fArr, i11);
            GLES20.glUniform4fv(e("anchors[" + i10 + "].normal"), 1, fArr, i11 + 4);
        }
        k("viewport", this.u, this.v, 17.0f, 0.0f);
        int e11 = e("u.sparkleShape");
        float[] fArr2 = this.l;
        GLES20.glUniform4fv(e11, 1, fArr2, 36);
        k("sparkleHalo", fArr2[40], f11, this.s, f12);
        for (int i12 = 0; i12 < 9; i12++) {
            GLES20.glUniform4fv(e("u." + D[i12]), 1, fArr2, i12 * 4);
        }
        GLES20.glUniform4fv(e("planes[0]"), 17, this.n, 0);
    }

    public final void k(String str, float f10, float f11, float f12, float f13) {
        GLES20.glUniform4f(e("u.".concat(str)), f10, f11, f12, f13);
    }
}
