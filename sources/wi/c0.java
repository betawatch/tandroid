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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class c0 {
    public static b0 D;
    public static b0 E;
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
    public final x g;
    public final a3.h h;
    public final z i;
    public final y j;
    public final a0 k;
    public final x l;
    public final x m;
    public final a3.h n;
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

    public c0(int i3, Size size, int i10, boolean z10) {
        int i11;
        float f10;
        y yVar;
        float[] fArr;
        int i12;
        b0 b0Var;
        float f11;
        float[] fArr2;
        int[] iArr = new int[10];
        this.t = iArr;
        int i13 = 0;
        this.a = i3;
        this.b = Math.max(1, i3 / 2);
        this.c = size;
        this.d = i10;
        this.e = z10;
        String glGetString = GLES20.glGetString(7939);
        boolean z11 = glGetString != null && glGetString.contains("GL_EXT_shader_texture_lod");
        this.f = z11;
        this.g = new x("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", 0);
        this.h = new a3.h("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.i = z10 ? new z() : null;
        if (z10) {
            yVar = new y("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n", 0);
            i11 = 8;
            int glGetUniformLocation = GLES20.glGetUniformLocation(yVar.a, "bTexture");
            f10 = -1.0f;
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(yVar.a, "mTexture");
            GLES20.glUseProgram(yVar.a);
            GLES20.glUniform1i(glGetUniformLocation, 1);
            GLES20.glUniform1i(glGetUniformLocation2, 2);
        } else {
            i11 = 8;
            f10 = -1.0f;
            yVar = null;
        }
        this.j = yVar;
        this.k = new a0(z10, z11);
        this.l = new x();
        this.m = new x(G, 1);
        this.n = z10 ? new a3.h("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, texture2D(sTexture, vTextureCoord).a);\n}\n") : null;
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
        if (z10) {
            k(0, 48, 48);
            k(1, 48, 48);
            h(2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 * i3);
            float f12 = i3 * 0.5f;
            float f13 = 2.0f;
            float f14 = f12 + 2.0f;
            int i14 = 0;
            while (i14 < i3) {
                float f15 = (i14 + 0.5f) - f12;
                int i15 = i13;
                while (i15 < i3) {
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
            synchronized (c0.class) {
                try {
                    b0Var = i17 == 360 ? D : i17 == 480 ? E : null;
                    if (b0Var != null) {
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
                        b0 b0Var2 = new b0(max, i22, round, round3, i18, allocateDirect2);
                        createBitmap2.recycle();
                        createBitmap.recycle();
                        b10.d();
                        if (i17 == 360) {
                            D = b0Var2;
                        } else if (i17 == 480) {
                            E = b0Var2;
                        }
                        b0Var = b0Var2;
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
                s(fArr5, i26 + 8, 0.0f, b0Var.e / b0Var.b, b0Var.c / b0Var.a, 1.0f);
                int i27 = i26 + 20;
                int i28 = b0Var.d;
                float f20 = b0Var.a;
                float f21 = b0Var.b;
                s(fArr5, i27, (i28 * i24) / f20, (i28 * i25) / f21, ((i24 + 1) * i28) / f20, ((i25 + 1) * i28) / f21);
                i23++;
                fArr2 = fArr5;
            }
            fArr = fArr2;
            float f22 = (b0Var.c / this.a) * f18;
            t(fArr4, 12, f11 - f22, f11, f22 + f10);
            float f23 = f10;
            float A = a1.g.A(b0Var.d, this.a, f18, f23);
            t(fArr4, 30, f23, A, A);
            ByteBuffer duplicate = b0Var.f.duplicate();
            duplicate.position(0);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6406, b0Var.a, b0Var.b, 0, 6406, 5121, duplicate);
            GLES20.glPixelStorei(3317, 4);
            k(i11, 48, 48);
        } else {
            fArr = fArr3;
        }
        k(4, i3, i3);
        k(5, 512, 512);
        k(6, i3, i3);
        int i29 = this.b;
        k(7, i29, i29);
        int i30 = this.b;
        k(9, i30, i30);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.s;
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        if (z10) {
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

    public static int a(int i3, String str) {
        int glCreateShader = GLES20.glCreateShader(i3);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(t4.c.f("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static void d(int i3) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i3);
    }

    public static FloatBuffer i(float[] fArr) {
        FloatBuffer g7 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(fArr.length * 4));
        g7.put(fArr).position(0);
        return g7;
    }

    public static FloatBuffer j(Size size, int i3, boolean z10) {
        int min = Math.min(i3, Math.min(size.getWidth(), size.getHeight()));
        int height = z10 ? size.getHeight() : size.getWidth();
        int width = z10 ? size.getWidth() : size.getHeight();
        float f10 = min;
        float f11 = f10 / (height * 2.0f);
        float f12 = f10 / (width * 2.0f);
        float f13 = 0.5f - f11;
        float f14 = 0.5f - f12;
        float f15 = f11 + 0.5f;
        float f16 = f12 + 0.5f;
        return i(new float[]{f13, f14, f15, f14, f13, f16, f15, f16});
    }

    public static String l(float f10, int i3) {
        double d;
        int i10 = -i3;
        double d10 = 0.0d;
        while (true) {
            d = 2.0d;
            if (i10 > i3) {
                break;
            }
            double d11 = f10;
            d10 += Math.exp((-(i10 * i10)) / ((2.0d * d11) * d11));
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(TLObject.FLAG_12);
        sb2.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform vec2 texOffset;\nvoid main() {\n    vec3 color = texture2D(sTexture, vTextureCoord).rgb * ");
        sb2.append(Float.toString((float) (1.0d / d10)));
        sb2.append(";\n");
        int i11 = 1;
        while (i11 <= i3) {
            double d12 = f10;
            double d13 = d12 * d * d12;
            float exp = (float) (Math.exp((-(i11 * i11)) / d13) / d10);
            int i12 = i11 + 1;
            float exp2 = i12 <= i3 ? (float) (Math.exp((-(i12 * i12)) / d13) / d10) : 0.0f;
            float f11 = exp + exp2;
            float x10 = exp2 == 0.0f ? i11 : com.google.android.recaptcha.internal.a.x(i12, exp2, i11 * exp, f11);
            sb2.append("    color += (texture2D(sTexture, vTextureCoord + texOffset * ");
            sb2.append(Float.toString(x10));
            sb2.append(").rgb + texture2D(sTexture, vTextureCoord - texOffset * ");
            sb2.append(Float.toString(x10));
            sb2.append(").rgb) * ");
            sb2.append(Float.toString(f11));
            sb2.append(";\n");
            i11 += 2;
            d = 2.0d;
        }
        sb2.append("    gl_FragColor = vec4(color, 1.0);\n}\n");
        return sb2.toString();
    }

    public static void s(float[] fArr, int i3, float f10, float f11, float f12, float f13) {
        fArr[i3] = f10;
        fArr[i3 + 1] = f13;
        fArr[i3 + 2] = f12;
        fArr[i3 + 3] = f13;
        fArr[i3 + 4] = f10;
        fArr[i3 + 5] = f11;
        fArr[i3 + 6] = f10;
        fArr[i3 + 7] = f11;
        fArr[i3 + 8] = f12;
        fArr[i3 + 9] = f13;
        fArr[i3 + 10] = f12;
        fArr[i3 + 11] = f11;
    }

    public static void t(float[] fArr, int i3, float f10, float f11, float f12) {
        u(fArr, i3, f10, -1.0f);
        u(fArr, i3 + 3, f11, -1.0f);
        u(fArr, i3 + 6, f10, f12);
        u(fArr, i3 + 9, f10, f12);
        u(fArr, i3 + 12, f11, -1.0f);
        u(fArr, i3 + 15, f11, f12);
    }

    public static void u(float[] fArr, int i3, float f10, float f11) {
        fArr[i3] = f10;
        fArr[i3 + 1] = f11;
        fArr[i3 + 2] = 0.0f;
    }

    public final void b(int i3, int i10) {
        GLES20.glBindFramebuffer(36160, this.s[i3]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.t[i10], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(TLObject.FLAG_14);
        } else {
            throw new IllegalStateException("Incomplete framebuffer: 0x" + Integer.toHexString(glCheckFramebufferStatus));
        }
    }

    public final void c(x xVar, float[] fArr) {
        GLES20.glUseProgram(xVar.a);
        this.o.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.o);
        FloatBuffer floatBuffer = Math.abs(fArr[1]) > Math.abs(fArr[0]) ? this.r : this.q;
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(xVar.d, 2, 5126, false, 8, (Buffer) floatBuffer);
        GLES20.glUniformMatrix4fv(xVar.e, 1, false, fArr, 0);
    }

    public final void e(a3.h hVar, int i3, int i10) {
        GLES20.glUseProgram(hVar.a);
        this.o.position(i10);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.o);
        this.p.position(i3);
        GLES20.glVertexAttribPointer(hVar.d, 2, 5126, false, 8, (Buffer) this.p);
    }

    public final void f(int i3, int i10) {
        GLES20.glActiveTexture(i3 + 33984);
        GLES20.glBindTexture(3553, this.t[i10]);
    }

    public final void g(float[] fArr, int i3, boolean z10) {
        GLES20.glDisable(3042);
        int[] iArr = this.t;
        if (!z10) {
            GLES20.glBindTexture(3553, iArr[5]);
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        char c2 = z10 ? (char) 4 : (char) 2;
        int[] iArr2 = this.s;
        GLES20.glBindFramebuffer(36160, iArr2[c2]);
        int i10 = this.a;
        GLES20.glViewport(0, 0, i10, i10);
        c(this.g, fArr);
        d(i3);
        GLES20.glDrawArrays(5, 0, 4);
        if (z10) {
            int i11 = this.w;
            this.y = i11;
            if (this.e) {
                q(i3, fArr, i11, 0.0f);
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

    public final void h(int i3) {
        GLES20.glBindTexture(3553, this.t[i3]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void k(int i3, int i10, int i11) {
        h(i3);
        GLES20.glTexImage2D(3553, 0, 6408, i10, i11, 0, 6408, 5121, null);
    }

    public final void m(int i3, float[] fArr, long j10, int i10, int i11) {
        int i12;
        float f10;
        GLES20.glDisable(3042);
        if (this.e) {
            int i13 = this.w;
            if (this.A) {
                long j11 = this.z;
                if (j11 != 0) {
                    long j12 = j10 - j11;
                    if (j12 > 0 && j12 <= 100000000) {
                        f10 = (float) Math.exp((-j12) / 2.8E8d);
                        i12 = i3;
                        q(i12, fArr, i13, f10);
                        int i14 = this.w;
                        n(0.020833334f, 0.0f, i14, 6);
                        n(0.0f, 0.020833334f, 8, i14);
                        int i15 = this.v;
                        int i16 = this.w;
                        this.v = i16;
                        this.w = i15;
                        this.A = true;
                        this.z = j10;
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
            i12 = i3;
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
            this.z = j10;
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
            d(i3);
            GLES20.glDrawArrays(5, 0, 4);
        }
        r();
    }

    public final void n(float f10, float f11, int i3, int i10) {
        GLES20.glBindFramebuffer(36160, this.s[i10]);
        GLES20.glViewport(0, 0, 48, 48);
        x xVar = this.l;
        e(xVar, 0, 0);
        f(0, i3);
        GLES20.glUniform2f(xVar.e, f10, f11);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void o(float f10, float f11, float f12, int i3, int i10) {
        boolean z10 = this.B;
        int i11 = this.a;
        if (z10) {
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
        GLES20.glViewport(0, 0, i3, i10);
        GLES20.glDisable(3042);
        a0 a0Var = this.k;
        e(a0Var, 0, 0);
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
        GLES20.glUniform2f(a0Var.e, max, max);
        int i14 = a0Var.f;
        float min2 = Math.min(8.0f, (float) (Math.log(((Math.max(1.0f, f10) * 0.625f) * 512.0f) / r10) / Math.log(2.0d))) + 1.25f;
        GLES20.glUniform1f(i14, this.f ? Math.max(0.0f, min2) : Math.max(0.0f, min2 - ((float) (Math.log(512.0d / i11) / Math.log(2.0d)))));
        GLES20.glUniform1f(a0Var.g, Math.max(0.0f, Math.min(1.0f, f10 / 2.0f)));
        GLES20.glUniform1f(a0Var.h, f11);
        GLES20.glUniform1f(a0Var.i, f12);
        GLES20.glDrawArrays(5, 0, 4);
        r();
    }

    public final void p(int i3, float f10, int i10, int i11, float f11, int i12) {
        GLES20.glBindFramebuffer(36160, this.s[i10]);
        GLES20.glViewport(0, 0, i11, i12);
        x xVar = this.m;
        e(xVar, 0, 0);
        f(0, i3);
        GLES20.glUniform2f(xVar.e, f10, f11);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void q(int i3, float[] fArr, int i10, float f10) {
        GLES20.glBindFramebuffer(36160, this.s[i10]);
        GLES20.glViewport(0, 0, 48, 48);
        z zVar = this.i;
        c(zVar, fArr);
        d(i3);
        f(1, this.v);
        boolean z10 = Math.abs(fArr[1]) > Math.abs(fArr[0]);
        int min = Math.min(this.d, Math.min(this.c.getWidth(), this.c.getHeight()));
        Size size = this.c;
        float f11 = min;
        float height = ((f11 / (z10 ? size.getHeight() : size.getWidth())) / 48.0f) * 0.45f;
        float width = ((f11 / (z10 ? this.c.getWidth() : this.c.getHeight())) / 48.0f) * 0.45f;
        GLES20.glUniform2f(zVar.f, fArr[0] * height, fArr[1] * height);
        GLES20.glUniform2f(zVar.g, fArr[4] * width, fArr[5] * width);
        GLES20.glUniform1f(zVar.h, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void r() {
        a3.h hVar;
        if (!this.e || (hVar = this.n) == null) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        int i3 = this.u;
        this.u = i3 + 1;
        e(hVar, ((i3 % 27) * 24) + 8, 12);
        f(0, 3);
        GLES20.glDrawArrays(4, 0, 12);
        GLES20.glDisable(3042);
    }
}
