// default package

import android.opengl.GLES20;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class pc0 {
    public int a;
    public int b;
    public int c;

    public pc0(String str, String str2) {
        int l = tk9.l(35633, str);
        this.b = l;
        int l2 = tk9.l(35632, str2);
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
            sc8.j(b00.h("Unable to link program: ", glGetProgramInfoLog));
            throw null;
        }
        this.a = glCreateProgram;
        int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
        GLES20.glUseProgram(glCreateProgram);
        GLES20.glUniform1i(glGetUniformLocation, 0);
    }

    public static pc0 a(int i, byte[] bArr) {
        xb5 xb5Var = new xb5();
        xb5Var.a = bArr;
        xb5Var.b = Math.min(i, bArr.length);
        if (xb5Var.b() != -1590787827) {
            return null;
        }
        xb5Var.c();
        xb5Var.b();
        int b = xb5Var.b();
        if (xb5Var.d || b <= 0) {
            return null;
        }
        int b2 = xb5Var.b();
        xb5Var.c();
        int b3 = xb5Var.b();
        xb5Var.b();
        if (xb5Var.d || b2 < 0) {
            return null;
        }
        long j = xb5Var.c + b2;
        if (j > i) {
            return null;
        }
        int i2 = (int) j;
        return new pc0(b3, i2, i - i2);
    }

    public final void b() {
        GLES20.glDeleteProgram(this.a);
        GLES20.glDeleteShader(this.b);
        GLES20.glDeleteShader(this.c);
    }

    public /* synthetic */ pc0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public pc0() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
}
