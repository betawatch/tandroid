// default package

import android.opengl.GLES20;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class pd0 {
    public int a;
    public int b;
    public int c;

    public pd0(String str, String str2) {
        int l = um9.l(35633, str);
        this.b = l;
        int l2 = um9.l(35632, str2);
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
            dq9.m(b10.h("Unable to link program: ", glGetProgramInfoLog));
            throw null;
        }
        this.a = glCreateProgram;
        int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
        GLES20.glUseProgram(glCreateProgram);
        GLES20.glUniform1i(glGetUniformLocation, 0);
    }

    public static pd0 a(int i, byte[] bArr) {
        vd5 vd5Var = new vd5();
        vd5Var.a = bArr;
        vd5Var.b = Math.min(i, bArr.length);
        if (vd5Var.b() != -1590787827) {
            return null;
        }
        vd5Var.c();
        vd5Var.b();
        int b = vd5Var.b();
        if (vd5Var.d || b <= 0) {
            return null;
        }
        int b2 = vd5Var.b();
        vd5Var.c();
        int b3 = vd5Var.b();
        vd5Var.b();
        if (vd5Var.d || b2 < 0) {
            return null;
        }
        long j = vd5Var.c + b2;
        if (j > i) {
            return null;
        }
        int i2 = (int) j;
        return new pd0(b3, i2, i - i2);
    }

    public final void b() {
        GLES20.glDeleteProgram(this.a);
        GLES20.glDeleteShader(this.b);
        GLES20.glDeleteShader(this.c);
    }

    public /* synthetic */ pd0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public pd0() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
}
