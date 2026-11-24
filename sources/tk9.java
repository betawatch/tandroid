// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.util.Size;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class tk9 {
    public static sk9 E;
    public static sk9 F;
    public static final String G = k(1.75f, 4);
    public static final String H = k(4.0f, 9);
    public long A;
    public boolean B;
    public boolean C;
    public final short a;
    public final int b;
    public Size c;
    public int d;
    public final boolean e;
    public final boolean f;
    public final ok9 g;
    public final pc0 h;
    public final qk9 i;
    public final pk9 j;
    public final rk9 k;
    public final ok9 l;
    public final ok9 m;
    public final pc0 n;
    public final FloatBuffer o;
    public final FloatBuffer p;
    public FloatBuffer q;
    public FloatBuffer r;
    public int s;
    public final int[] u;
    public int v;
    public final int[] t = new int[8];
    public boolean w = false;
    public boolean x = true;
    public boolean y = false;
    public boolean z = true;
    public float D = -1.0f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023e A[Catch: all -> 0x0363, TRY_ENTER, TryCatch #2 {, blocks: (B:30:0x0194, B:48:0x01ad, B:50:0x01e0, B:52:0x01f6, B:62:0x022a, B:65:0x023e, B:66:0x025c, B:68:0x0262, B:70:0x0287, B:75:0x028e, B:76:0x0343, B:77:0x0353, B:88:0x0238, B:94:0x0355, B:95:0x0358, B:100:0x0359, B:101:0x0360, B:103:0x0199, B:85:0x0235), top: B:28:0x0192, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0262 A[Catch: all -> 0x0363, TryCatch #2 {, blocks: (B:30:0x0194, B:48:0x01ad, B:50:0x01e0, B:52:0x01f6, B:62:0x022a, B:65:0x023e, B:66:0x025c, B:68:0x0262, B:70:0x0287, B:75:0x028e, B:76:0x0343, B:77:0x0353, B:88:0x0238, B:94:0x0355, B:95:0x0358, B:100:0x0359, B:101:0x0360, B:103:0x0199, B:85:0x0235), top: B:28:0x0192, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0343 A[Catch: all -> 0x0363, TRY_ENTER, TryCatch #2 {, blocks: (B:30:0x0194, B:48:0x01ad, B:50:0x01e0, B:52:0x01f6, B:62:0x022a, B:65:0x023e, B:66:0x025c, B:68:0x0262, B:70:0x0287, B:75:0x028e, B:76:0x0343, B:77:0x0353, B:88:0x0238, B:94:0x0355, B:95:0x0358, B:100:0x0359, B:101:0x0360, B:103:0x0199, B:85:0x0235), top: B:28:0x0192, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tk9(int i, int i2, Size size, boolean z) {
        pk9 pk9Var;
        float[] fArr;
        int i3;
        int i4;
        int i5;
        sk9 sk9Var;
        InputStream inputStream;
        boolean z2;
        Bitmap bitmap;
        int i6;
        int[] iArr = new int[10];
        this.u = iArr;
        this.a = i;
        this.b = Math.max(1, i / 2);
        this.c = size;
        this.d = i2;
        this.e = z;
        String glGetString = GLES20.glGetString(7939);
        boolean z3 = glGetString != null && glGetString.contains("GL_EXT_shader_texture_lod");
        this.f = z3;
        this.g = new ok9("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", (byte) 0);
        this.h = new pc0("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.i = z ? new qk9() : null;
        if (z) {
            pk9Var = new pk9("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n", (byte) 0);
            int glGetUniformLocation = GLES20.glGetUniformLocation(pk9Var.a, "bTexture");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(pk9Var.a, "mTexture");
            GLES20.glUseProgram(pk9Var.a);
            GLES20.glUniform1i(glGetUniformLocation, 1);
            GLES20.glUniform1i(glGetUniformLocation2, 2);
        } else {
            pk9Var = null;
        }
        this.j = pk9Var;
        this.k = new rk9(z, z3);
        this.l = new ok9();
        this.m = new ok9(H, (byte) 1);
        this.n = z ? new pc0("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, texture2D(sTexture, vTextureCoord).a);\n}\n") : null;
        float[] fArr2 = new float[656];
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 1.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 0.0f;
        fArr2[5] = 1.0f;
        fArr2[6] = 1.0f;
        fArr2[7] = 1.0f;
        float[] fArr3 = new float[48];
        fArr3[0] = -1.0f;
        fArr3[1] = -1.0f;
        fArr3[2] = 0.0f;
        fArr3[3] = 1.0f;
        fArr3[4] = -1.0f;
        fArr3[5] = 0.0f;
        fArr3[6] = -1.0f;
        fArr3[7] = 1.0f;
        fArr3[8] = 0.0f;
        fArr3[9] = 1.0f;
        fArr3[10] = 1.0f;
        fArr3[11] = 0.0f;
        v();
        GLES20.glGenTextures(10, iArr, 0);
        if (z) {
            j(0, 48, 48);
            j(1, 48, 48);
            g(2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i);
            float f = i * 0.5f;
            float f2 = 2.0f;
            float f3 = f + 2.0f;
            int i7 = 0;
            while (i7 < i) {
                float f4 = (i7 + 0.5f) - f;
                float f5 = f2;
                int i8 = 0;
                while (i8 < i) {
                    float f6 = (i8 + 0.5f) - f;
                    allocateDirect.put((byte) Math.round(Math.max(0.0f, Math.min(1.0f, (f3 + 0.5f) - ((float) Math.sqrt((f4 * f4) + (f6 * f6))))) * 255.0f));
                    i8++;
                    fArr3 = fArr3;
                }
                i7++;
                f2 = f5;
            }
            float[] fArr4 = fArr3;
            float f7 = f2;
            allocateDirect.position(0);
            GLES20.glPixelStorei(3317, 1);
            short s = this.a;
            GLES20.glTexImage2D(3553, 0, 6406, s, s, 0, 6406, 5121, allocateDirect);
            GLES20.glPixelStorei(3317, 4);
            g(3);
            short s2 = this.a;
            synchronized (tk9.class) {
                sk9Var = s2 == 360 ? E : s2 == 480 ? F : null;
                if (sk9Var == null) {
                    float f8 = s2;
                    int round = Math.round((372.0f * f8) / 1536.0f);
                    int round2 = Math.round(0.2f * f8);
                    int round3 = round2 - (Math.round((f8 * 28.0f) / 1536.0f) << 1);
                    int i9 = round3 << 2;
                    int max = Math.max(round3 << 3, round);
                    int i10 = i9 + round;
                    RLottieNative b = RLottieNative.b(gl.v2(null, R.raw.plane_logo_plain), null, null, null);
                    if (b == null) {
                        throw new IllegalStateException("Unable to load watermark animation");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(round2, round2, Bitmap.Config.ARGB_8888);
                    Bitmap createBitmap2 = Bitmap.createBitmap(max, i10, Bitmap.Config.ALPHA_8);
                    Canvas canvas = new Canvas(createBitmap2);
                    int i11 = 0;
                    for (int i12 = 27; i11 < i12; i12 = 27) {
                        b.c(i11 << 1, createBitmap, true);
                        int i13 = i10;
                        canvas.drawBitmap(createBitmap, ((i11 % 8) * round3) - r0, ((i11 / 8) * round3) - r0, (Paint) null);
                        i11++;
                        i10 = i13;
                    }
                    int i14 = i10;
                    try {
                        inputStream = a.b.getResources().openRawResource(R.raw.round_blur_overlay_text);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = null;
                    }
                    try {
                        bitmap = BitmapFactory.decodeStream(inputStream);
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                        z2 = true;
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = true;
                        try {
                            fa4.g(th, true);
                            bitmap = null;
                            if (bitmap == null) {
                            }
                            if (createBitmap2.getRowBytes() == max) {
                            }
                        } finally {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                    if (bitmap == null) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round, z2);
                        Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                        i6 = i9;
                        canvas.drawBitmap(extractAlpha, 0.0f, i9, (Paint) null);
                        extractAlpha.recycle();
                        createScaledBitmap.recycle();
                        bitmap.recycle();
                    } else {
                        i6 = i9;
                    }
                    if (createBitmap2.getRowBytes() == max) {
                        createBitmap2.recycle();
                        createBitmap.recycle();
                        b.d();
                        throw new IllegalStateException("Unexpected watermark atlas stride");
                    }
                    ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(max * i14);
                    createBitmap2.copyPixelsToBuffer(allocateDirect2);
                    allocateDirect2.position(0);
                    sk9 sk9Var2 = new sk9(max, i14, round, round3, i6, allocateDirect2);
                    createBitmap2.recycle();
                    createBitmap.recycle();
                    b.d();
                    if (s2 == 360) {
                        E = sk9Var2;
                    } else if (s2 == 480) {
                        F = sk9Var2;
                    }
                    sk9Var = sk9Var2;
                }
            }
            int i15 = 0;
            for (int i16 = 27; i15 < i16; i16 = i16) {
                int i17 = i15 % 8;
                int i18 = i15 / 8;
                int i19 = i15 * 24;
                s(fArr2, i19 + 8, 0.0f, sk9Var.e / sk9Var.b, sk9Var.c / sk9Var.a, 1.0f);
                int i20 = i19 + 20;
                int i21 = sk9Var.d;
                float f9 = sk9Var.a;
                float f10 = sk9Var.b;
                s(fArr2, i20, (i21 * i17) / f9, (i21 * i18) / f10, ((i17 + 1) * i21) / f9, ((i18 + 1) * i21) / f10);
                i15++;
            }
            i3 = 3;
            i4 = 4;
            float f11 = (sk9Var.c / this.a) * f7;
            fArr = fArr4;
            t(fArr, 12, 1.0f - f11, 1.0f, f11 - 1.0f);
            float A = b00.A(sk9Var.d, this.a, f7, -1.0f);
            t(fArr, 30, -1.0f, A, A);
            ByteBuffer duplicate = ((ByteBuffer) sk9Var.f).duplicate();
            duplicate.position(0);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6406, sk9Var.a, sk9Var.b, 0, 6406, 5121, duplicate);
            GLES20.glPixelStorei(3317, 4);
            j(8, 48, 48);
        } else {
            fArr = fArr3;
            i3 = 3;
            i4 = 4;
        }
        j(i4, i, i);
        j(5, 512, 512);
        j(6, i, i);
        int i22 = this.b;
        j(7, i22, i22);
        int i23 = this.b;
        j(9, i23, i23);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.t;
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        if (z) {
            a(0, 0);
            a(1, 1);
            i5 = 6;
            a(6, 8);
        } else {
            i5 = 6;
        }
        a(2, i4);
        a(i3, 5);
        a(i4, i5);
        a(5, 7);
        a(7, 9);
        GLES20.glBindFramebuffer(36160, 0);
        this.o = h(fArr);
        this.p = h(fArr2);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(1);
    }

    public static void c(int i) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
    }

    public static FloatBuffer h(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        return asFloatBuffer;
    }

    public static FloatBuffer i(int i, int i2, Size size, boolean z) {
        int width;
        int height;
        int min = Math.min(i, Math.min(size.getWidth(), size.getHeight()));
        if (z) {
            width = size.getHeight();
            height = size.getWidth();
        } else {
            width = size.getWidth();
            height = size.getHeight();
        }
        float f = min;
        float f2 = f / (width * 2.0f);
        float f3 = f / (height * 2.0f);
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        float[] fArr2 = new float[8];
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = i3 << 1;
            float f4 = fArr[i4];
            int i5 = i4 + 1;
            float f5 = fArr[i5];
            if (i2 != 90) {
                if (i2 == 180) {
                    f4 = -f4;
                    f5 = -f5;
                } else if (i2 == 270) {
                    f5 = -f5;
                }
                fArr2[i4] = (f4 * f2) + 0.5f;
                fArr2[i5] = (f5 * f3) + 0.5f;
            } else {
                f4 = -f4;
            }
            float f6 = f5;
            f5 = f4;
            f4 = f6;
            fArr2[i4] = (f4 * f2) + 0.5f;
            fArr2[i5] = (f5 * f3) + 0.5f;
        }
        return h(fArr2);
    }

    public static String k(float f, int i) {
        double d;
        int i2 = -i;
        double d2 = 0.0d;
        while (true) {
            d = 2.0d;
            if (i2 > i) {
                break;
            }
            double d3 = f;
            d2 += Math.exp((-(i2 * i2)) / ((2.0d * d3) * d3));
            i2++;
        }
        StringBuilder sb = new StringBuilder(TLObject.FLAG_12);
        sb.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform vec2 texOffset;\nvoid main() {\n    vec3 color = texture2D(sTexture, vTextureCoord).rgb * ");
        sb.append(Float.toString((float) (1.0d / d2)));
        sb.append(";\n");
        int i3 = 1;
        while (i3 <= i) {
            double d4 = f;
            double d5 = d4 * d * d4;
            float exp = (float) (Math.exp((-(i3 * i3)) / d5) / d2);
            int i4 = i3 + 1;
            float exp2 = i4 <= i ? (float) (Math.exp((-(i4 * i4)) / d5) / d2) : 0.0f;
            float f2 = exp + exp2;
            float y = exp2 == 0.0f ? i3 : b00.y(i4, exp2, i3 * exp, f2);
            sb.append("    color += (texture2D(sTexture, vTextureCoord + texOffset * ");
            sb.append(Float.toString(y));
            sb.append(").rgb + texture2D(sTexture, vTextureCoord - texOffset * ");
            sb.append(Float.toString(y));
            sb.append(").rgb) * ");
            sb.append(Float.toString(f2));
            sb.append(";\n");
            i3 += 2;
            d = 2.0d;
        }
        sb.append("    gl_FragColor = vec4(color, 1.0);\n}\n");
        return sb.toString();
    }

    public static int l(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        sc8.j(b00.h("Unable to compile shader: ", glGetShaderInfoLog));
        return 0;
    }

    public static void s(float[] fArr, int i, float f, float f2, float f3, float f4) {
        fArr[i] = f;
        fArr[i + 1] = f4;
        fArr[i + 2] = f3;
        fArr[i + 3] = f4;
        fArr[i + 4] = f;
        fArr[i + 5] = f2;
        fArr[i + 6] = f;
        fArr[i + 7] = f2;
        fArr[i + 8] = f3;
        fArr[i + 9] = f4;
        fArr[i + 10] = f3;
        fArr[i + 11] = f2;
    }

    public static void t(float[] fArr, int i, float f, float f2, float f3) {
        u(fArr, i, f, -1.0f);
        u(fArr, i + 3, f2, -1.0f);
        u(fArr, i + 6, f, f3);
        u(fArr, i + 9, f, f3);
        u(fArr, i + 12, f2, -1.0f);
        u(fArr, i + 15, f2, f3);
    }

    public static void u(float[] fArr, int i, float f, float f2) {
        fArr[i] = f;
        fArr[i + 1] = f2;
        fArr[i + 2] = 0.0f;
    }

    public final void a(int i, int i2) {
        GLES20.glBindFramebuffer(36160, this.t[i]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.u[i2], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            wn4.p(Integer.toHexString(glCheckFramebufferStatus), "Incomplete framebuffer: 0x");
        } else {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(TLObject.FLAG_14);
        }
    }

    public final void b(ok9 ok9Var, float[] fArr) {
        GLES20.glUseProgram(ok9Var.a);
        this.o.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.o);
        FloatBuffer floatBuffer = Math.abs(fArr[1]) > Math.abs(fArr[0]) ? this.r : this.q;
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) floatBuffer);
        GLES20.glUniformMatrix4fv(ok9Var.d, 1, false, fArr, 0);
    }

    public final void d(pc0 pc0Var, int i, int i2) {
        GLES20.glUseProgram(pc0Var.a);
        this.o.position(i2);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.o);
        this.p.position(i);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.p);
    }

    public final void e(int i, int i2) {
        GLES20.glActiveTexture(i + 33984);
        GLES20.glBindTexture(3553, this.u[i2]);
    }

    public final void f(float[] fArr, int i, boolean z) {
        char c;
        GLES20.glDisable(3042);
        int[] iArr = this.u;
        if (z) {
            c = 4;
        } else {
            GLES20.glBindTexture(3553, iArr[5]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            c = 2;
        }
        int[] iArr2 = this.t;
        GLES20.glBindFramebuffer(36160, iArr2[c]);
        short s = this.a;
        GLES20.glViewport(0, 0, s, s);
        b(this.g, fArr);
        c(i);
        GLES20.glDrawArrays(5, 0, 4);
        if (z) {
            boolean z2 = this.x;
            this.z = z2;
            if (this.e) {
                q(i, fArr, z2 ? 1 : 0, 0.0f);
                boolean z3 = this.z;
                n(0.020833334f, 0.0f, z3 ? 1 : 0, 6);
                n(0.0f, 0.020833334f, 8, z3 ? 1 : 0);
            }
            this.D = -1.0f;
            this.C = true;
            return;
        }
        GLES20.glBindFramebuffer(36160, iArr2[3]);
        GLES20.glViewport(0, 0, 512, 512);
        d(this.h, 0, 0);
        e(0, 4);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, iArr[5]);
        GLES20.glGenerateMipmap(3553);
        GLES20.glTexParameteri(3553, 10241, 9987);
        this.y = this.w;
        this.z = this.x;
        this.C = false;
        this.D = -1.0f;
    }

    public final void g(int i) {
        GLES20.glBindTexture(3553, this.u[i]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void j(int i, int i2, int i3) {
        g(i);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
    }

    public final void m(int i, float[] fArr, long j, int i2, int i3) {
        int i4;
        float f;
        GLES20.glDisable(3042);
        if (this.e) {
            boolean z = this.x;
            if (this.B) {
                long j2 = this.A;
                if (j2 != 0) {
                    long j3 = j - j2;
                    if (j3 > 0 && j3 <= 100000000) {
                        f = (float) Math.exp((-j3) / 2.8E8d);
                        i4 = i;
                        q(i4, fArr, z ? 1 : 0, f);
                        boolean z2 = this.x;
                        n(0.020833334f, 0.0f, z2 ? 1 : 0, 6);
                        n(0.0f, 0.020833334f, 8, z2 ? 1 : 0);
                        boolean z3 = this.w;
                        boolean z4 = this.x;
                        this.w = z4;
                        this.x = z3;
                        this.B = true;
                        this.A = j;
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glViewport(0, 0, i2, i3);
                        b(this.j, fArr);
                        c(i4);
                        e(1, z4 ? 1 : 0);
                        e(2, 2);
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            i4 = i;
            f = 0.0f;
            q(i4, fArr, z ? 1 : 0, f);
            boolean z22 = this.x;
            n(0.020833334f, 0.0f, z22 ? 1 : 0, 6);
            n(0.0f, 0.020833334f, 8, z22 ? 1 : 0);
            boolean z32 = this.w;
            boolean z42 = this.x;
            this.w = z42;
            this.x = z32;
            this.B = true;
            this.A = j;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i2, i3);
            b(this.j, fArr);
            c(i4);
            e(1, z42 ? 1 : 0);
            e(2, 2);
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i2, i3);
            b(this.g, fArr);
            c(i);
            GLES20.glDrawArrays(5, 0, 4);
        }
        r();
    }

    public final void n(float f, float f2, int i, int i2) {
        GLES20.glBindFramebuffer(36160, this.t[i2]);
        GLES20.glViewport(0, 0, 48, 48);
        ok9 ok9Var = this.l;
        d(ok9Var, 0, 0);
        e(0, i);
        GLES20.glUniform2f(ok9Var.d, f, f2);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void o(float f, float f2, float f3, int i, int i2) {
        boolean z = this.C;
        short s = this.a;
        if (z) {
            float min = Math.min(f, 9.0f);
            if (Math.abs(this.D - min) >= 0.2f) {
                float f4 = min / (s * 9);
                int i3 = this.b;
                p(6, f4, 7, i3, 0.0f, i3);
                int i4 = this.b;
                p(9, 0.0f, 5, i4, f4, i4);
                this.D = min;
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glDisable(3042);
        rk9 rk9Var = this.k;
        d(rk9Var, 0, 0);
        e(0, 4);
        e(1, 5);
        e(2, 6);
        e(3, 7);
        if (this.e) {
            e(4, this.y ? 1 : 0);
            e(5, this.z ? 1 : 0);
            e(6, 2);
        }
        float max = (Math.max(0.0f, f) * 0.625f) / s;
        GLES20.glUniform2f(rk9Var.d, max, max);
        int i5 = rk9Var.e;
        float min2 = Math.min(8.0f, (float) (Math.log(((Math.max(1.0f, f) * 0.625f) * 512.0f) / r10) / 0.6931471805599453d)) + 1.25f;
        GLES20.glUniform1f(i5, this.f ? Math.max(0.0f, min2) : Math.max(0.0f, min2 - ((float) (Math.log(512.0d / s) / 0.6931471805599453d))));
        GLES20.glUniform1f(rk9Var.f, Math.max(0.0f, Math.min(1.0f, f / 2.0f)));
        GLES20.glUniform1f(rk9Var.g, f2);
        GLES20.glUniform1f(rk9Var.h, f3);
        GLES20.glDrawArrays(5, 0, 4);
        r();
    }

    public final void p(int i, float f, int i2, int i3, float f2, int i4) {
        GLES20.glBindFramebuffer(36160, this.t[i2]);
        GLES20.glViewport(0, 0, i3, i4);
        ok9 ok9Var = this.m;
        d(ok9Var, 0, 0);
        e(0, i);
        GLES20.glUniform2f(ok9Var.d, f, f2);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(int i, float[] fArr, int i2, float f) {
        float width;
        int height;
        GLES20.glBindFramebuffer(36160, this.t[i2]);
        GLES20.glViewport(0, 0, 48, 48);
        qk9 qk9Var = this.i;
        b(qk9Var, fArr);
        c(i);
        e(1, this.w ? 1 : 0);
        Object[] objArr = Math.abs(fArr[1]) > Math.abs(fArr[0]);
        int min = Math.min(this.d, Math.min(this.c.getWidth(), this.c.getHeight()));
        Size size = this.c;
        if (objArr == true) {
            width = size.getHeight();
            height = this.c.getWidth();
        } else {
            width = size.getWidth();
            height = this.c.getHeight();
        }
        float f2 = min;
        float f3 = ((f2 / width) / 48.0f) * 0.45f;
        float f4 = ((f2 / height) / 48.0f) * 0.45f;
        GLES20.glUniform2f(qk9Var.e, fArr[0] * f3, fArr[1] * f3);
        GLES20.glUniform2f(qk9Var.f, fArr[4] * f4, fArr[5] * f4);
        GLES20.glUniform1f(qk9Var.g, f);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void r() {
        pc0 pc0Var;
        if (!this.e || (pc0Var = this.n) == null) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        int i = this.v;
        this.v = i + 1;
        d(pc0Var, ((i % 27) * 24) + 8, 12);
        e(0, 3);
        GLES20.glDrawArrays(4, 0, 12);
        GLES20.glDisable(3042);
    }

    public final void v() {
        this.q = i(this.d, this.s, this.c, false);
        this.r = i(this.d, this.s, this.c, true);
    }
}
