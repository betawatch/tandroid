package sg;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import com.google.android.gms.internal.vision.e2;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import w7.m7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    public a(Context context, int i10) {
        try {
            String[] strArr = {"diamond", "sparkle", "copy"};
            for (int i11 = 0; i11 < 3; i11++) {
                this.a[i11] = m7.b(context, "diamond", j(context, i11 == 2 ? "fullscreenVertex" : strArr[i11] + "Vertex"), j(context, strArr[i11] + "Fragment"), "position", "normal");
            }
            float[] a2 = a(context, "frames");
            this.m = a2;
            float[] a10 = a(context, "planes");
            this.n = a10;
            float[] a11 = a(context, "anchors");
            this.o = a11;
            float[] a12 = a(context, "widths");
            this.p = a12;
            float[] a13 = a(context, "facetProjection");
            this.q = a13;
            float[] a14 = a(context, "camera");
            this.r = a14;
            if (a11.length != 64 || a12.length != 91 || a13.length != 4 || a14.length != 3) {
                throw new IllegalStateException("Invalid Swift diamond camera data");
            }
            if (a2.length != 60522 || a10.length != 68) {
                throw new IllegalStateException("Invalid Swift diamond animation data");
            }
            int[] iArr = this.b;
            GLES30.glGenVertexArrays(iArr.length, iArr, 0);
            int[] iArr2 = this.c;
            GLES20.glGenBuffers(iArr2.length, iArr2, 0);
            String[] strArr2 = {"vertices", "main", "small"};
            int i12 = 0;
            while (i12 < 3) {
                float[] a15 = a(context, strArr2[i12]);
                int i13 = i12 == 0 ? 3 : 2;
                this.d[i12] = a15.length / (i13 * 4);
                GLES30.glBindVertexArray(this.b[i12]);
                GLES20.glBindBuffer(34962, this.c[i12]);
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(a15.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                asFloatBuffer.put(a15).position(0);
                GLES20.glBufferData(34962, a15.length * 4, asFloatBuffer, 35044);
                for (int i14 = 0; i14 < i13; i14++) {
                    GLES20.glEnableVertexAttribArray(i14);
                    GLES20.glVertexAttribPointer(i14, 4, 5126, false, i13 * 16, i14 * 16);
                }
                i12++;
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
            this.w = Math.min(i10, iArr3[0]);
        } catch (Exception e7) {
            b();
            throw new IllegalStateException("Cannot load Swift diamond", e7);
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
                byte[] bArr = new byte[16384];
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

    public static float i(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return e2.B(max, 2.0f, 3.0f, max * max);
    }

    public static String j(Context context, String str) {
        return new String(g(context, "shaders/diamond/" + str + ".glsl"), StandardCharsets.UTF_8);
    }

    public final void b() {
        for (int i10 : this.a) {
            if (i10 != 0) {
                GLES20.glDeleteProgram(i10);
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

    public final void c(int i10, int i11, float f7, float f10, float f11, float f12, float f13, float f14, boolean z10) {
        boolean z11;
        int i12;
        int i13;
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        float max = Math.max(0.0f, Math.min(f12, 0.1f));
        double d = this.x + max;
        this.x = d;
        float f15 = (float) d;
        double d10 = (d * 240.0d) % 1440.0d;
        int i14 = (int) d10;
        float f16 = (float) (d10 - i14);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            float[] fArr = this.l;
            if (i16 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.m;
            float f17 = fArr2[(i14 * 42) + i16];
            fArr[i16] = e2.y(fArr2[((1 + i14) * 42) + i16], f17, f16, f17);
            i16++;
        }
        float f18 = i10;
        int max2 = Math.max(1, Math.round(this.B * f18));
        float f19 = i11;
        int max3 = Math.max(1, Math.round(this.B * f19));
        int i17 = this.u;
        int i18 = 36160;
        int[] iArr = this.e;
        if (max2 == i17 && max3 == this.v) {
            z11 = true;
            i12 = 2;
            i13 = 0;
        } else {
            this.u = max2;
            this.v = max3;
            GLES20.glBindFramebuffer(36160, iArr[0]);
            int i19 = 0;
            z11 = true;
            for (int i20 = 2; i19 < i20; i20 = 2) {
                int[] iArr2 = this.f;
                int i21 = i15;
                GLES20.glBindRenderbuffer(36161, iArr2[i19]);
                GLES30.glRenderbufferStorageMultisample(36161, this.w, i19 == 0 ? 32856 : 33189, max2, max3);
                GLES20.glFramebufferRenderbuffer(36160, i19 == 0 ? 36064 : 36096, 36161, iArr2[i19]);
                i19++;
                i18 = 36160;
                i15 = i21;
            }
            int i22 = i15;
            int i23 = i18;
            if (GLES20.glCheckFramebufferStatus(i23) != 36053) {
                throw new IllegalStateException("Incomplete diamond framebuffer");
            }
            GLES20.glBindFramebuffer(i23, iArr[1]);
            int[] iArr3 = this.g;
            GLES20.glBindTexture(3553, iArr3[i22]);
            i12 = 2;
            GLES20.glTexImage2D(3553, 0, 32856, max2, max3, 0, 6408, 5121, null);
            i13 = i22;
            GLES20.glFramebufferTexture2D(i23, 36064, 3553, iArr3[i22], i13);
            if (GLES20.glCheckFramebufferStatus(i23) != 36053) {
                throw new IllegalStateException("Incomplete diamond framebuffer");
            }
        }
        float[] fArr3 = this.r;
        float f20 = f10 + fArr3[i13];
        double d11 = f7;
        int i24 = i12;
        float min = Math.min(90.0f, (360.0f * Math.abs((float) Math.IEEEremainder(d11, 1.5707963267948966d))) / 3.1415927f);
        int min2 = Math.min(89, (int) min);
        float f21 = min - min2;
        float[] fArr4 = this.p;
        float f22 = fArr4[min2];
        float f23 = fArr4[min2 + 1];
        float f24 = min2 == 0 ? 0.0f : (f23 - fArr4[min2 - 1]) / 2.0f;
        float f25 = min2 == 89 ? 0.0f : (fArr4[min2 + 2] - f22) / 2.0f;
        float f26 = ((((((((f22 - f23) * 2.0f) + f24 + f25) * f21) + ((((f23 - f22) * 3.0f) - (f24 * 2.0f)) - f25)) * f21) + f24) * f21) + f22;
        float sin = (float) Math.sin(r9 * 2.0f);
        float f27 = (1.0f - ((0.035f * sin) * sin)) * fArr4[0];
        double d12 = f20;
        this.s = ((1.0f - i((float) ((Math.abs(Math.sin(d12)) - Math.sin(0.25d)) / (Math.sin(0.96d) - Math.sin(0.25d))))) * ((f27 / f26) - 1.0f)) + 1.0f;
        float[] fArr5 = this.i;
        Matrix.setIdentityM(fArr5, 0);
        Matrix.rotateM(this.i, 0, -((float) Math.toDegrees(f11)), 0.0f, 0.0f, 1.0f);
        Matrix.rotateM(this.i, 0, (float) Math.toDegrees(d12), 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.i, 0, (float) Math.toDegrees(d11), 0.0f, 1.0f, 0.0f);
        boolean z12 = false;
        Matrix.transposeM(this.j, 0, fArr5, 0);
        float f28 = 0.0f;
        int i25 = 0;
        float f29 = -1.0f;
        while (i25 < 4) {
            float f30 = (i25 * 3.1415927f) / 2.0f;
            int i26 = i25;
            float cos = (float) (Math.cos(f20 - fArr3[z12 ? 1 : 0]) * Math.cos(f7 + f30));
            if (cos > f29) {
                f29 = cos;
                f28 = f30;
            }
            i25 = i26 + 1;
            z12 = false;
        }
        float hypot = (!this.A || max <= 0.0f) ? 0.596f : ((float) Math.hypot((float) Math.atan2(Math.sin(f7 - this.y), Math.cos(f7 - this.y)), f20 - this.z)) / max;
        this.y = f7;
        this.z = f20;
        this.A = z11;
        float i27 = i(((0.41887903f / Math.max(hypot, 0.001f)) - 0.06f) / 0.34f) * i(1.0f - (((float) Math.acos(Math.max(-1.0f, Math.min(1.0f, f29)))) / 0.20943952f));
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glViewport(0, 0, this.u, this.v);
        GLES20.glDepthMask(true);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        float f31 = f18 / f19;
        float max4 = Math.max(1.0f, 1.0f / f31) * (1.52f / (0.9975f / fArr4[0]));
        float[] fArr6 = this.k;
        Matrix.setIdentityM(fArr6, 0);
        float f32 = 1.0f / (f31 * max4);
        fArr6[0] = f32;
        fArr6[5] = 1.0f / max4;
        float f33 = 1.0f / fArr3[i24];
        float f34 = -f33;
        float f35 = f34 / fArr3[1];
        fArr6[0] = f32 * this.s;
        float f36 = 0.12f / max4;
        fArr6[9] = f36 * f35;
        fArr6[10] = f34 / 6.0f;
        fArr6[11] = f35;
        fArr6[13] = f36 * f33;
        fArr6[14] = 0.5f * f33;
        fArr6[15] = f33;
        int[] iArr4 = this.a;
        h(f15, f28, i27, iArr4[0]);
        GLES20.glDisable(3042);
        GLES20.glEnable(2929);
        GLES20.glEnable(2884);
        GLES20.glDepthFunc(515);
        int[] iArr5 = this.b;
        GLES30.glBindVertexArray(iArr5[0]);
        int[] iArr6 = this.d;
        GLES20.glDrawArrays(4, 0, iArr6[0]);
        h(f15, f28, i27, iArr4[1]);
        GLES20.glEnable(3042);
        GLES20.glDisable(2884);
        GLES20.glDisable(2929);
        int i28 = 1;
        while (i28 <= i24) {
            GLES30.glBindVertexArray(iArr5[i28]);
            GLES30.glUniform1ui(e("baseInstance"), i28 - 1);
            GLES30.glDrawArraysInstanced(4, 0, iArr6[i28], i28 == 1 ? 1 : 7);
            i28++;
        }
        GLES20.glBindFramebuffer(36008, iArr[0]);
        GLES20.glBindFramebuffer(36009, iArr[1]);
        int i29 = this.u;
        int i30 = this.v;
        GLES30.glBlitFramebuffer(0, 0, i29, i30, 0, 0, i29, i30, 16384, 9728);
        if (!z10) {
            d(f13, f14, i10, i11);
        } else {
            GLES20.glBindFramebuffer(36160, iArr[1]);
            GLES30.glBindVertexArray(0);
        }
    }

    public final void d(float f7, float f10, int i10, int i11) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        int i12 = this.a[2];
        this.t = i12;
        GLES20.glUseProgram(i12);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.g[0]);
        GLES20.glUniform1i(e("image"), 0);
        GLES20.glUniform1f(e("opacity"), f7);
        GLES20.glUniform1f(e("white"), f10);
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

    public final void h(float f7, float f10, float f11, int i10) {
        this.t = i10;
        GLES20.glUseProgram(i10);
        f("model", this.i);
        f("inverseModel", this.j);
        f("projection", this.k);
        k("parameters", f7, 0.72f, 1.0f, 1.0f);
        GLES20.glUniform4fv(e("u.facetProjection"), 1, this.q, 0);
        k("appearance", this.C, 0.0f, 0.0f, 0.0f);
        k("referenceCrownFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        k("referencePavilionFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        for (int i11 = 0; i11 < 8; i11++) {
            int e7 = e("anchors[" + i11 + "].position");
            int i12 = i11 * 8;
            float[] fArr = this.o;
            GLES20.glUniform4fv(e7, 1, fArr, i12);
            GLES20.glUniform4fv(e("anchors[" + i11 + "].normal"), 1, fArr, i12 + 4);
        }
        k("viewport", this.u, this.v, 17.0f, 0.0f);
        int e10 = e("u.sparkleShape");
        float[] fArr2 = this.l;
        GLES20.glUniform4fv(e10, 1, fArr2, 36);
        k("sparkleHalo", fArr2[40], f10, this.s, f11);
        for (int i13 = 0; i13 < 9; i13++) {
            GLES20.glUniform4fv(e("u." + D[i13]), 1, fArr2, i13 * 4);
        }
        GLES20.glUniform4fv(e("planes[0]"), 17, this.n, 0);
    }

    public final void k(String str, float f7, float f10, float f11, float f12) {
        GLES20.glUniform4f(e("u.".concat(str)), f7, f10, f11, f12);
    }
}
