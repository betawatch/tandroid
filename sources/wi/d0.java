package wi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.util.Size;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class d0 {
    public static c0 D;
    public static c0 E;
    public static final String F = l(1.75f, 4);
    public static final String G = l(4.0f, 9);
    public boolean A;
    public boolean B;
    public final int a;
    public final int b;
    public Size c;
    public int d;
    public final boolean e;
    public final boolean f;
    public final y g;
    public final b3.h h;
    public final a0 i;
    public final z j;
    public final b0 k;
    public final y l;
    public final y m;
    public final b3.h n;
    public final FloatBuffer o;
    public final FloatBuffer p;
    public FloatBuffer q;
    public FloatBuffer r;
    public final int[] t;
    public int u;
    public long z;
    public final int[] s = new int[8];
    public int v = 0;
    public int w = 1;
    public int x = 0;
    public int y = 1;
    public float C = -1.0f;

    public d0(int i7, Size size, int i10, boolean z9) {
        int i11;
        float f10;
        z zVar;
        float[] fArr;
        int i12;
        c0 c0Var;
        float f11;
        float[] fArr2;
        int[] iArr = new int[10];
        this.t = iArr;
        int i13 = 0;
        this.a = i7;
        this.b = Math.max(1, i7 / 2);
        this.c = size;
        this.d = i10;
        this.e = z9;
        String glGetString = GLES20.glGetString(7939);
        boolean z10 = glGetString != null && glGetString.contains("GL_EXT_shader_texture_lod");
        this.f = z10;
        this.g = new y("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", 0);
        this.h = new b3.h("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.i = z9 ? new a0() : null;
        if (z9) {
            zVar = new z("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n", 0);
            i11 = 8;
            int glGetUniformLocation = GLES20.glGetUniformLocation(zVar.a, "bTexture");
            f10 = -1.0f;
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(zVar.a, "mTexture");
            GLES20.glUseProgram(zVar.a);
            GLES20.glUniform1i(glGetUniformLocation, 1);
            GLES20.glUniform1i(glGetUniformLocation2, 2);
        } else {
            i11 = 8;
            f10 = -1.0f;
            zVar = null;
        }
        this.j = zVar;
        this.k = new b0(z9, z10);
        this.l = new y();
        this.m = new y(G, 1);
        this.n = z9 ? new b3.h("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, texture2D(sTexture, vTextureCoord).a);\n}\n") : null;
        float[] fArr3 = new float[656];
        fArr3[0] = 0.0f;
        fArr3[1] = 0.0f;
        fArr3[2] = 1.0f;
        fArr3[3] = 0.0f;
        fArr3[4] = 0.0f;
        fArr3[5] = 1.0f;
        fArr3[6] = 1.0f;
        fArr3[7] = 1.0f;
        float[] fArr4 = new float[48];
        fArr4[0] = f10;
        fArr4[1] = f10;
        fArr4[2] = 0.0f;
        fArr4[3] = 1.0f;
        fArr4[4] = f10;
        fArr4[5] = 0.0f;
        fArr4[6] = f10;
        fArr4[7] = 1.0f;
        fArr4[i11] = 0.0f;
        fArr4[9] = 1.0f;
        fArr4[10] = 1.0f;
        fArr4[11] = 0.0f;
        this.q = j(size, i10, false);
        this.r = j(size, i10, true);
        GLES20.glGenTextures(10, iArr, 0);
        if (z9) {
            k(0, 48, 48);
            k(1, 48, 48);
            h(2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i7 * i7);
            float f12 = i7 * 0.5f;
            float f13 = 2.0f;
            float f14 = f12 + 2.0f;
            int i14 = 0;
            while (i14 < i7) {
                float f15 = (i14 + 0.5f) - f12;
                int i15 = i13;
                while (i15 < i7) {
                    float f16 = f13;
                    float f17 = (i15 + 0.5f) - f12;
                    allocateDirect.put((byte) Math.round(Math.max(0.0f, Math.min(1.0f, (f14 + 0.5f) - ((float) Math.sqrt((f15 * f15) + (f17 * f17))))) * 255.0f));
                    i15++;
                    f13 = f16;
                }
                i14++;
                i13 = 0;
            }
            float f18 = f13;
            allocateDirect.position(i13);
            GLES20.glPixelStorei(3317, 1);
            int i16 = this.a;
            GLES20.glTexImage2D(3553, 0, 6406, i16, i16, 0, 6406, 5121, allocateDirect);
            GLES20.glPixelStorei(3317, 4);
            h(3);
            int i17 = this.a;
            synchronized (d0.class) {
                try {
                    c0Var = i17 == 360 ? D : i17 == 480 ? E : null;
                    if (c0Var != null) {
                        fArr2 = fArr3;
                        f11 = 1.0f;
                    } else {
                        float f19 = i17;
                        int round = Math.round((372.0f * f19) / 1536.0f);
                        int round2 = Math.round(0.2f * f19);
                        int round3 = round2 - (Math.round((f19 * 28.0f) / 1536.0f) * 2);
                        f11 = 1.0f;
                        int i18 = round3 * 4;
                        int max = Math.max(round3 * 8, round);
                        int i19 = i18 + round;
                        RLottieNative b10 = RLottieNative.b(org.telegram.messenger.g0.y2(null, R.raw.plane_logo_plain), null, null, null);
                        if (b10 == null) {
                            throw new IllegalStateException("Unable to load watermark animation");
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(round2, round2, Bitmap.Config.ARGB_8888);
                        Bitmap createBitmap2 = Bitmap.createBitmap(max, i19, Bitmap.Config.ALPHA_8);
                        Canvas canvas = new Canvas(createBitmap2);
                        fArr2 = fArr3;
                        int i20 = 0;
                        while (i20 < 27) {
                            int i21 = i20;
                            b10.c(i21 * 2, createBitmap, true);
                            canvas.drawBitmap(createBitmap, (round3 * (i20 % 8)) - r9, ((i20 / 8) * round3) - r9, (Paint) null);
                            i20 = i21 + 1;
                            i19 = i19;
                        }
                        int i22 = i19;
                        Bitmap x02 = org.telegram.messenger.g0.x0();
                        if (x02 != null) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(x02, round, round, true);
                            Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                            canvas.drawBitmap(extractAlpha, 0.0f, i18, (Paint) null);
                            extractAlpha.recycle();
                            createScaledBitmap.recycle();
                            x02.recycle();
                        }
                        if (createBitmap2.getRowBytes() != max) {
                            createBitmap2.recycle();
                            createBitmap.recycle();
                            b10.d();
                            throw new IllegalStateException("Unexpected watermark atlas stride");
                        }
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(max * i22);
                        createBitmap2.copyPixelsToBuffer(allocateDirect2);
                        allocateDirect2.position(0);
                        c0 c0Var2 = new c0(max, i22, round, round3, i18, allocateDirect2);
                        createBitmap2.recycle();
                        createBitmap.recycle();
                        b10.d();
                        if (i17 == 360) {
                            D = c0Var2;
                        } else if (i17 == 480) {
                            E = c0Var2;
                        }
                        c0Var = c0Var2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i23 = 0;
            while (i23 < 27) {
                int i24 = i23 % 8;
                int i25 = i23 / 8;
                int i26 = i23 * 24;
                float[] fArr5 = fArr2;
                s(fArr5, i26 + 8, 0.0f, c0Var.e / c0Var.b, c0Var.c / c0Var.a, 1.0f);
                int i27 = i26 + 20;
                int i28 = c0Var.d;
                float f20 = c0Var.a;
                float f21 = c0Var.b;
                s(fArr5, i27, (i28 * i24) / f20, (i28 * i25) / f21, ((i24 + 1) * i28) / f20, ((i25 + 1) * i28) / f21);
                i23++;
                fArr2 = fArr5;
            }
            fArr = fArr2;
            float f22 = (c0Var.c / this.a) * f18;
            t(fArr4, 12, f11 - f22, f11, f22 + f10);
            float f23 = f10;
            float c10 = com.google.android.recaptcha.internal.a.c(c0Var.d, this.a, f18, f23);
            t(fArr4, 30, f23, c10, c10);
            ByteBuffer duplicate = c0Var.f.duplicate();
            duplicate.position(0);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6406, c0Var.a, c0Var.b, 0, 6406, 5121, duplicate);
            GLES20.glPixelStorei(3317, 4);
            k(i11, 48, 48);
        } else {
            fArr = fArr3;
        }
        k(4, i7, i7);
        k(5, 512, 512);
        k(6, i7, i7);
        int i29 = this.b;
        k(7, i29, i29);
        int i30 = this.b;
        k(9, i30, i30);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.s;
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        if (z9) {
            b(0, 0);
            b(1, 1);
            i12 = 6;
            b(6, 8);
        } else {
            i12 = 6;
        }
        b(2, 4);
        b(3, 5);
        b(4, i12);
        b(5, 7);
        b(7, 9);
        GLES20.glBindFramebuffer(36160, 0);
        this.o = i(fArr4);
        this.p = i(fArr);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(1);
    }

    public static int a(int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(rf.b.i("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static void d(int i7) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i7);
    }

    public static FloatBuffer i(float[] fArr) {
        FloatBuffer g10 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(fArr.length * 4));
        g10.put(fArr).position(0);
        return g10;
    }

    public static FloatBuffer j(Size size, int i7, boolean z9) {
        int min = Math.min(i7, Math.min(size.getWidth(), size.getHeight()));
        int height = z9 ? size.getHeight() : size.getWidth();
        int width = z9 ? size.getWidth() : size.getHeight();
        float f10 = min;
        float f11 = f10 / (height * 2.0f);
        float f12 = f10 / (width * 2.0f);
        float f13 = 0.5f - f11;
        float f14 = 0.5f - f12;
        float f15 = f11 + 0.5f;
        float f16 = f12 + 0.5f;
        return i(new float[]{f13, f14, f15, f14, f13, f16, f15, f16});
    }

    public static String l(float f10, int i7) {
        double d;
        int i10 = -i7;
        double d2 = 0.0d;
        while (true) {
            d = 2.0d;
            if (i10 > i7) {
                break;
            }
            double d10 = f10;
            d2 += Math.exp((-(i10 * i10)) / ((2.0d * d10) * d10));
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(TLObject.FLAG_12);
        sb2.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform vec2 texOffset;\nvoid main() {\n    vec3 color = texture2D(sTexture, vTextureCoord).rgb * ");
        sb2.append(Float.toString((float) (1.0d / d2)));
        sb2.append(";\n");
        int i11 = 1;
        while (i11 <= i7) {
            double d11 = f10;
            double d12 = d11 * d * d11;
            float exp = (float) (Math.exp((-(i11 * i11)) / d12) / d2);
            int i12 = i11 + 1;
            float exp2 = i12 <= i7 ? (float) (Math.exp((-(i12 * i12)) / d12) / d2) : 0.0f;
            float f11 = exp + exp2;
            float y10 = exp2 == 0.0f ? i11 : com.google.android.recaptcha.internal.a.y(i12, exp2, i11 * exp, f11);
            sb2.append("    color += (texture2D(sTexture, vTextureCoord + texOffset * ");
            sb2.append(Float.toString(y10));
            sb2.append(").rgb + texture2D(sTexture, vTextureCoord - texOffset * ");
            sb2.append(Float.toString(y10));
            sb2.append(").rgb) * ");
            sb2.append(Float.toString(f11));
            sb2.append(";\n");
            i11 += 2;
            d = 2.0d;
        }
        sb2.append("    gl_FragColor = vec4(color, 1.0);\n}\n");
        return sb2.toString();
    }

    public static void s(float[] fArr, int i7, float f10, float f11, float f12, float f13) {
        fArr[i7] = f10;
        fArr[i7 + 1] = f13;
        fArr[i7 + 2] = f12;
        fArr[i7 + 3] = f13;
        fArr[i7 + 4] = f10;
        fArr[i7 + 5] = f11;
        fArr[i7 + 6] = f10;
        fArr[i7 + 7] = f11;
        fArr[i7 + 8] = f12;
        fArr[i7 + 9] = f13;
        fArr[i7 + 10] = f12;
        fArr[i7 + 11] = f11;
    }

    public static void t(float[] fArr, int i7, float f10, float f11, float f12) {
        u(fArr, i7, f10, -1.0f);
        u(fArr, i7 + 3, f11, -1.0f);
        u(fArr, i7 + 6, f10, f12);
        u(fArr, i7 + 9, f10, f12);
        u(fArr, i7 + 12, f11, -1.0f);
        u(fArr, i7 + 15, f11, f12);
    }

    public static void u(float[] fArr, int i7, float f10, float f11) {
        fArr[i7] = f10;
        fArr[i7 + 1] = f11;
        fArr[i7 + 2] = 0.0f;
    }

    public final void b(int i7, int i10) {
        GLES20.glBindFramebuffer(36160, this.s[i7]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.t[i10], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(TLObject.FLAG_14);
        } else {
            throw new IllegalStateException("Incomplete framebuffer: 0x" + Integer.toHexString(glCheckFramebufferStatus));
        }
    }

    public final void c(y yVar, float[] fArr) {
        GLES20.glUseProgram(yVar.a);
        this.o.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.o);
        FloatBuffer floatBuffer = Math.abs(fArr[1]) > Math.abs(fArr[0]) ? this.r : this.q;
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(yVar.d, 2, 5126, false, 8, (Buffer) floatBuffer);
        GLES20.glUniformMatrix4fv(yVar.e, 1, false, fArr, 0);
    }

    public final void e(b3.h hVar, int i7, int i10) {
        GLES20.glUseProgram(hVar.a);
        this.o.position(i10);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.o);
        this.p.position(i7);
        GLES20.glVertexAttribPointer(hVar.d, 2, 5126, false, 8, (Buffer) this.p);
    }

    public final void f(int i7, int i10) {
        GLES20.glActiveTexture(i7 + 33984);
        GLES20.glBindTexture(3553, this.t[i10]);
    }

    public final void g(float[] fArr, int i7, boolean z9) {
        GLES20.glDisable(3042);
        int[] iArr = this.t;
        if (!z9) {
            GLES20.glBindTexture(3553, iArr[5]);
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        char c10 = z9 ? (char) 4 : (char) 2;
        int[] iArr2 = this.s;
        GLES20.glBindFramebuffer(36160, iArr2[c10]);
        int i10 = this.a;
        GLES20.glViewport(0, 0, i10, i10);
        c(this.g, fArr);
        d(i7);
        GLES20.glDrawArrays(5, 0, 4);
        if (z9) {
            int i11 = this.w;
            this.y = i11;
            if (this.e) {
                q(i7, fArr, i11, 0.0f);
                int i12 = this.y;
                n(0.020833334f, 0.0f, i12, 6);
                n(0.0f, 0.020833334f, 8, i12);
            }
            this.C = -1.0f;
            this.B = true;
            return;
        }
        GLES20.glBindFramebuffer(36160, iArr2[3]);
        GLES20.glViewport(0, 0, 512, 512);
        e(this.h, 0, 0);
        f(0, 4);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, iArr[5]);
        GLES20.glGenerateMipmap(3553);
        GLES20.glTexParameteri(3553, 10241, 9987);
        this.x = this.v;
        this.y = this.w;
        this.B = false;
        this.C = -1.0f;
    }

    public final void h(int i7) {
        GLES20.glBindTexture(3553, this.t[i7]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void k(int i7, int i10, int i11) {
        h(i7);
        GLES20.glTexImage2D(3553, 0, 6408, i10, i11, 0, 6408, 5121, null);
    }

    public final void m(int i7, float[] fArr, long j3, int i10, int i11) {
        int i12;
        float f10;
        GLES20.glDisable(3042);
        if (this.e) {
            int i13 = this.w;
            if (this.A) {
                long j10 = this.z;
                if (j10 != 0) {
                    long j11 = j3 - j10;
                    if (j11 > 0 && j11 <= 100000000) {
                        f10 = (float) Math.exp((-j11) / 2.8E8d);
                        i12 = i7;
                        q(i12, fArr, i13, f10);
                        int i14 = this.w;
                        n(0.020833334f, 0.0f, i14, 6);
                        n(0.0f, 0.020833334f, 8, i14);
                        int i15 = this.v;
                        int i16 = this.w;
                        this.v = i16;
                        this.w = i15;
                        this.A = true;
                        this.z = j3;
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glViewport(0, 0, i10, i11);
                        c(this.j, fArr);
                        d(i12);
                        f(1, i16);
                        f(2, 2);
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            i12 = i7;
            f10 = 0.0f;
            q(i12, fArr, i13, f10);
            int i142 = this.w;
            n(0.020833334f, 0.0f, i142, 6);
            n(0.0f, 0.020833334f, 8, i142);
            int i152 = this.v;
            int i162 = this.w;
            this.v = i162;
            this.w = i152;
            this.A = true;
            this.z = j3;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i10, i11);
            c(this.j, fArr);
            d(i12);
            f(1, i162);
            f(2, 2);
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i10, i11);
            c(this.g, fArr);
            d(i7);
            GLES20.glDrawArrays(5, 0, 4);
        }
        r();
    }

    public final void n(float f10, float f11, int i7, int i10) {
        GLES20.glBindFramebuffer(36160, this.s[i10]);
        GLES20.glViewport(0, 0, 48, 48);
        y yVar = this.l;
        e(yVar, 0, 0);
        f(0, i7);
        GLES20.glUniform2f(yVar.e, f10, f11);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void o(float f10, float f11, float f12, int i7, int i10) {
        boolean z9 = this.B;
        int i11 = this.a;
        if (z9) {
            float min = Math.min(f10, 9.0f);
            if (Math.abs(this.C - min) >= 0.2f) {
                float f13 = min / (i11 * 9);
                int i12 = this.b;
                p(6, f13, 7, i12, 0.0f, i12);
                int i13 = this.b;
                p(9, 0.0f, 5, i13, f13, i13);
                this.C = min;
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i7, i10);
        GLES20.glDisable(3042);
        b0 b0Var = this.k;
        e(b0Var, 0, 0);
        f(0, 4);
        f(1, 5);
        f(2, 6);
        f(3, 7);
        if (this.e) {
            f(4, this.x);
            f(5, this.y);
            f(6, 2);
        }
        float max = (Math.max(0.0f, f10) * 0.625f) / i11;
        GLES20.glUniform2f(b0Var.e, max, max);
        int i14 = b0Var.f;
        float min2 = Math.min(8.0f, (float) (Math.log(((Math.max(1.0f, f10) * 0.625f) * 512.0f) / r10) / Math.log(2.0d))) + 1.25f;
        GLES20.glUniform1f(i14, this.f ? Math.max(0.0f, min2) : Math.max(0.0f, min2 - ((float) (Math.log(512.0d / i11) / Math.log(2.0d)))));
        GLES20.glUniform1f(b0Var.g, Math.max(0.0f, Math.min(1.0f, f10 / 2.0f)));
        GLES20.glUniform1f(b0Var.h, f11);
        GLES20.glUniform1f(b0Var.i, f12);
        GLES20.glDrawArrays(5, 0, 4);
        r();
    }

    public final void p(int i7, float f10, int i10, int i11, float f11, int i12) {
        GLES20.glBindFramebuffer(36160, this.s[i10]);
        GLES20.glViewport(0, 0, i11, i12);
        y yVar = this.m;
        e(yVar, 0, 0);
        f(0, i7);
        GLES20.glUniform2f(yVar.e, f10, f11);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void q(int i7, float[] fArr, int i10, float f10) {
        GLES20.glBindFramebuffer(36160, this.s[i10]);
        GLES20.glViewport(0, 0, 48, 48);
        a0 a0Var = this.i;
        c(a0Var, fArr);
        d(i7);
        f(1, this.v);
        boolean z9 = Math.abs(fArr[1]) > Math.abs(fArr[0]);
        int min = Math.min(this.d, Math.min(this.c.getWidth(), this.c.getHeight()));
        Size size = this.c;
        float f11 = min;
        float height = ((f11 / (z9 ? size.getHeight() : size.getWidth())) / 48.0f) * 0.45f;
        float width = ((f11 / (z9 ? this.c.getWidth() : this.c.getHeight())) / 48.0f) * 0.45f;
        GLES20.glUniform2f(a0Var.f, fArr[0] * height, fArr[1] * height);
        GLES20.glUniform2f(a0Var.g, fArr[4] * width, fArr[5] * width);
        GLES20.glUniform1f(a0Var.h, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void r() {
        b3.h hVar;
        if (!this.e || (hVar = this.n) == null) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        int i7 = this.u;
        this.u = i7 + 1;
        e(hVar, ((i7 % 27) * 24) + 8, 12);
        f(0, 3);
        GLES20.glDrawArrays(4, 0, 12);
        GLES20.glDisable(3042);
    }
}
