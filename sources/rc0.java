// default package

import android.opengl.GLES20;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class rc0 {
    public int a;
    public int b;
    public int c;

    public rc0(String str, String str2) {
        int l = ho9.l(35633, str);
        this.b = l;
        int l2 = ho9.l(35632, str2);
        this.c = l2;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, l);
        GLES20.glAttachShader(glCreateProgram, l2);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
            GLES20.glDeleteProgram(glCreateProgram);
            grb.i(c00.i("Unable to link program: ", glGetProgramInfoLog));
            throw null;
        }
        this.a = glCreateProgram;
        int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
        GLES20.glUseProgram(glCreateProgram);
        GLES20.glUniform1i(glGetUniformLocation, 0);
    }

    public static rc0 a(int i, byte[] bArr) {
        yd5 yd5Var = new yd5();
        yd5Var.a = bArr;
        yd5Var.b = Math.min(i, bArr.length);
        if (yd5Var.b() != -1590787827) {
            return null;
        }
        yd5Var.c();
        yd5Var.b();
        int b = yd5Var.b();
        if (yd5Var.d || b <= 0) {
            return null;
        }
        int b2 = yd5Var.b();
        yd5Var.c();
        int b3 = yd5Var.b();
        yd5Var.b();
        if (yd5Var.d || b2 < 0) {
            return null;
        }
        long j = yd5Var.c + b2;
        if (j > i) {
            return null;
        }
        int i2 = (int) j;
        return new rc0(b3, i2, i - i2);
    }

    public final void b() {
        GLES20.glDeleteProgram(this.a);
        GLES20.glDeleteShader(this.b);
        GLES20.glDeleteShader(this.c);
    }

    public /* synthetic */ rc0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public rc0() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
}
