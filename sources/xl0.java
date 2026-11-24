// default package

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xl0 {
    public FloatBuffer e;
    public FloatBuffer f;
    public FloatBuffer g;
    public boolean h;
    public int l;
    public int m;
    public ByteBuffer o;
    public Bitmap p;
    public boolean q;
    public sl0 t;
    public int a = 1;
    public int b = 1;
    public boolean c = false;
    public final tl0[] d = new tl0[2];
    public final float[] i = new float[9];
    public final float[] j = new float[16];
    public final Object k = new Object();
    public final Object n = new Object();
    public final int[] r = new int[3];
    public final int[] s = new int[3];
    public final oz u = new oz(this, 11);
    public final Matrix v = new Matrix();

    public final void a(int i, int i2, int i3, float[] fArr) {
        char c = fArr != null ? (char) 1 : (char) 0;
        tl0 tl0Var = this.d[c];
        if (tl0Var != null) {
            GLES20.glBindFramebuffer(36160, this.r[0]);
            GLES20.glViewport(0, 0, this.a, this.b);
            GLES20.glClear(TLObject.FLAG_14);
            GLES20.glUseProgram(tl0Var.a);
            GLES20.glUniform1i(tl0Var.e, 0);
            GLES20.glActiveTexture(33984);
            if (c != 0) {
                GLES20.glBindTexture(36197, i);
            } else {
                GLES20.glBindTexture(3553, i);
            }
            GLES20.glEnableVertexAttribArray(tl0Var.c);
            GLES20.glVertexAttribPointer(tl0Var.c, 2, 5126, false, 8, (Buffer) this.g);
            GLES20.glEnableVertexAttribArray(tl0Var.b);
            GLES20.glVertexAttribPointer(tl0Var.b, 2, 5126, false, 8, (Buffer) this.e);
            GLES20.glUniform2f(tl0Var.f, this.a, this.b);
            float f = i2;
            float f2 = i3;
            GLES20.glUniform2f(tl0Var.g, f, f2);
            GLES20.glUniform1i(tl0Var.j, 0);
            GLES20.glUniform1f(tl0Var.k, c != 0 ? 1.0f : 0.0f);
            if (c != 0) {
                GLES20.glUniformMatrix4fv(tl0Var.l, 1, false, fArr, 0);
            }
            GLES20.glUniform1f(tl0Var.m, c == 0 ? 0.0f : 1.0f);
            z8a.a(tl0Var.h, this.l);
            z8a.a(tl0Var.i, this.m);
            synchronized (this.k) {
                GLES20.glUniformMatrix4fv(tl0Var.d, 1, false, this.j, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            if (c != 0) {
                tl0Var = this.d[0];
                if (tl0Var == null) {
                    return;
                }
                GLES20.glUseProgram(tl0Var.a);
                GLES20.glEnableVertexAttribArray(tl0Var.c);
                GLES20.glVertexAttribPointer(tl0Var.c, 2, 5126, false, 8, (Buffer) this.g);
                GLES20.glEnableVertexAttribArray(tl0Var.b);
                GLES20.glVertexAttribPointer(tl0Var.b, 2, 5126, false, 8, (Buffer) this.e);
                GLES20.glUniform2f(tl0Var.f, this.a, this.b);
                GLES20.glUniform2f(tl0Var.g, f, f2);
                GLES20.glUniform1i(tl0Var.j, 0);
                z8a.a(tl0Var.h, this.l);
                z8a.a(tl0Var.i, this.m);
                GLES20.glUniform1f(tl0Var.k, 0.0f);
                synchronized (this.k) {
                    GLES20.glUniformMatrix4fv(tl0Var.d, 1, false, this.j, 0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.r[1]);
            GLES20.glUniform1i(tl0Var.j, 1);
            GLES20.glUniform1i(tl0Var.e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.s[0]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.r[2]);
            int i4 = this.a;
            int i5 = (this.c ? 1 : 0) << 1;
            GLES20.glViewport(0, 0, i4 + i5, this.b + i5);
            GLES20.glClear(TLObject.FLAG_14);
            GLES20.glEnableVertexAttribArray(tl0Var.b);
            GLES20.glVertexAttribPointer(tl0Var.b, 2, 5126, false, 8, (Buffer) this.f);
            GLES20.glUniform1i(tl0Var.j, 2);
            GLES20.glUniform1i(tl0Var.e, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.s[1]);
            sl0 sl0Var = this.t;
            Object obj = sl0Var != null ? sl0Var.h : null;
            if (obj != null) {
                synchronized (obj) {
                    GLES20.glDrawArrays(5, 0, 4);
                }
            } else {
                GLES20.glDrawArrays(5, 0, 4);
            }
            ByteBuffer byteBuffer = this.o;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                int i6 = this.a;
                int i7 = (this.c ? 1 : 0) << 1;
                GLES20.glReadPixels(0, 0, i6 + i7, this.b + i7, 6408, 5121, this.o);
                synchronized (this.n) {
                    this.p.copyPixelsFromBuffer(this.o);
                    this.q = true;
                }
                GLES20.glBindFramebuffer(36160, 0);
            }
            gl.r(this.u);
            gl.d3(this.u);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(float f, int i) {
        this.a = (int) Math.round(Math.sqrt(f * 324.0f));
        this.b = (int) Math.round(Math.sqrt(324.0f / f));
        this.c = i;
        if (!this.h) {
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.v;
            matrix.invert(matrix2);
            matrix2.preScale(1.0f, 1.0f);
            matrix2.postScale(1.0f, 1.0f);
            c(matrix2);
        }
        float[] fArr = new float[8];
        fArr[0] = -1.0f;
        fArr[1] = 1.0f;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        fArr[4] = -1.0f;
        fArr[5] = -1.0f;
        fArr[6] = 1.0f;
        fArr[7] = -1.0f;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.e = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.e.position(0);
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i2 << 1;
            fArr[i3] = ((r13 - i) / this.a) * fArr[i3];
            int i4 = i3 + 1;
            fArr[i4] = ((r13 - i) / this.b) * fArr[i4];
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.g = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.g.position(0);
        String v2 = gl.v2(null, R.raw.blur_vrt);
        String v22 = gl.v2(null, R.raw.blur_frg);
        if (v2 != null && v22 != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= 2) {
                    int[] iArr = this.r;
                    GLES20.glGenFramebuffers(3, iArr, 0);
                    int[] iArr2 = this.s;
                    GLES20.glGenTextures(3, iArr2, 0);
                    int i6 = 0;
                    while (i6 < 3) {
                        GLES20.glBindTexture(3553, iArr2[i6]);
                        GLES20.glTexImage2D(3553, 0, 6408, this.a + (i6 == 2 ? i << 1 : 0), this.b + (i6 == 2 ? i << 1 : 0), 0, 6408, 5121, null);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glBindFramebuffer(36160, iArr[i6]);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[i6], 0);
                        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                            i6++;
                        }
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    int i7 = i << 1;
                    this.p = Bitmap.createBitmap(this.a + i7, this.b + i7, Bitmap.Config.ARGB_8888);
                    this.o = ByteBuffer.allocateDirect(((i7 + this.b) * (this.a + i7)) << 2);
                    return true;
                }
                if (i5 == 1) {
                    v22 = "#extension GL_OES_EGL_image_external : require\n" + v22.replace("sampler2D tex", "samplerExternalOES tex");
                }
                int h = wd4.h(35633, v2);
                int h2 = wd4.h(35632, v22);
                if (h == 0 || h2 == 0) {
                    break;
                }
                int glCreateProgram = GLES20.glCreateProgram();
                GLES20.glAttachShader(glCreateProgram, h);
                GLES20.glAttachShader(glCreateProgram, h2);
                GLES20.glBindAttribLocation(glCreateProgram, 0, "p");
                GLES20.glBindAttribLocation(glCreateProgram, 1, "inputuv");
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr3 = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr3, 0);
                if (iArr3[0] == 0) {
                    GLES20.glDeleteProgram(glCreateProgram);
                    return false;
                }
                tl0 tl0Var = new tl0();
                tl0Var.a = glCreateProgram;
                tl0Var.b = GLES20.glGetAttribLocation(glCreateProgram, "p");
                tl0Var.c = GLES20.glGetAttribLocation(glCreateProgram, "inputuv");
                tl0Var.d = GLES20.glGetUniformLocation(glCreateProgram, "matrix");
                tl0Var.e = GLES20.glGetUniformLocation(glCreateProgram, "tex");
                tl0Var.f = GLES20.glGetUniformLocation(glCreateProgram, "sz");
                tl0Var.g = GLES20.glGetUniformLocation(glCreateProgram, "texSz");
                tl0Var.h = GLES20.glGetUniformLocation(glCreateProgram, "gtop");
                tl0Var.i = GLES20.glGetUniformLocation(glCreateProgram, "gbottom");
                tl0Var.j = GLES20.glGetUniformLocation(glCreateProgram, "step");
                tl0Var.l = GLES20.glGetUniformLocation(glCreateProgram, "videoMatrix");
                tl0Var.m = GLES20.glGetUniformLocation(glCreateProgram, "hasVideoMatrix");
                tl0Var.k = GLES20.glGetUniformLocation(glCreateProgram, "flipy");
                this.d[i5] = tl0Var;
                i5++;
            }
        }
        return false;
    }

    public final void c(Matrix matrix) {
        this.h = true;
        matrix.getValues(this.i);
        synchronized (this.k) {
            float[] fArr = this.j;
            float[] fArr2 = this.i;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[3];
            fArr[2] = 0.0f;
            fArr[3] = fArr2[6];
            fArr[4] = fArr2[1];
            fArr[5] = fArr2[4];
            fArr[6] = 0.0f;
            fArr[7] = fArr2[7];
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = fArr2[2];
            fArr[13] = fArr2[5];
            fArr[14] = 0.0f;
            fArr[15] = fArr2[8];
        }
    }
}
