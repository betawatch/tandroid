package rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a implements GLSurfaceView.Renderer {
    public final int A;
    public final int B;
    public boolean C;
    public float D;
    public int a;
    public int b;
    public g c;
    public float i;
    public final Context n;
    public Bitmap o;
    public float p;
    public float q;
    public float r;
    public float s;
    public boolean t;
    public int u;
    public int v;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public final float[] j = new float[16];
    public final float[] k = new float[16];
    public final float[] l = new float[16];
    public final float[] m = new float[16];
    public int w = j6.Vj;
    public int x = j6.Wj;
    public final int y = j6.fk;
    public final int z = j6.gk;

    public a(Context context, int i10, int i11) {
        this.i = 0.0f;
        this.n = context;
        this.A = i10;
        this.B = i11;
        if (i11 == 2) {
            this.i = 1.0f;
        }
        b();
    }

    public static int a(int i10, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i10);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(glCreateShader) + " " + str);
    }

    public final void b() {
        int i10 = j6.h5;
        boolean z10 = false;
        this.t = i0.a.f(j6.w0(null, i10, false)) < 0.5d;
        this.u = i0.a.d(this.i, j6.w0(null, this.w, false), j6.w0(null, this.y, false));
        this.v = i0.a.d(this.i, j6.w0(null, this.x, false), j6.w0(null, this.z, false));
        if (this.A == 1 && i0.a.f(j6.w0(null, i10, false)) < 0.5d) {
            z10 = true;
        }
        this.C = z10;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        Matrix.setLookAtM(this.l, 0, 0.0f, this.B == 4 ? 40.0f : 0.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.m;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.m, 0, -this.g, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.m, 0, (-this.d) - this.f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.j, 0, this.l, 0, this.m, 0);
        float[] fArr2 = this.j;
        Matrix.multiplyMM(fArr2, 0, this.k, 0, fArr2, 0);
        g gVar = this.c;
        if (gVar != null) {
            gVar.D = this.t;
            gVar.y = this.u;
            gVar.z = this.v;
            int i10 = this.a;
            int i11 = this.b;
            float f7 = this.p;
            float f10 = this.r;
            float f11 = this.q;
            float f12 = this.s;
            float f13 = this.h;
            float f14 = this.i;
            float f15 = this.D;
            if (gVar.V != null) {
                GLES20.glBindTexture(3553, gVar.j);
                GLUtils.texImage2D(3553, 0, gVar.V, 0);
                gVar.V = null;
            }
            GLES20.glUniform1i(gVar.g, 0);
            GLES20.glUniform1f(gVar.n, gVar.s);
            GLES20.glUniform1f(gVar.o, gVar.u);
            GLES20.glUniform1f(gVar.q, f13);
            GLES20.glUniform1f(gVar.r, f14);
            GLES20.glUniformMatrix4fv(gVar.b, 1, false, this.j, 0);
            GLES20.glUniformMatrix4fv(gVar.c, 1, false, fArr, 0);
            GLES20.glUniform1f(gVar.E, gVar.v);
            GLES20.glUniform1f(gVar.F, gVar.w);
            GLES20.glUniform1f(gVar.G, gVar.x);
            GLES20.glUniform1f(gVar.J, gVar.A);
            GLES20.glUniform3f(gVar.H, Color.red(gVar.y) / 255.0f, Color.green(gVar.y) / 255.0f, Color.blue(gVar.y) / 255.0f);
            GLES20.glUniform3f(gVar.I, Color.red(gVar.z) / 255.0f, Color.green(gVar.z) / 255.0f, Color.blue(gVar.z) / 255.0f);
            GLES20.glUniform3f(gVar.K, Color.red(gVar.B) / 255.0f, Color.green(gVar.B) / 255.0f, Color.blue(gVar.B) / 255.0f);
            GLES20.glUniform3f(gVar.L, Color.red(gVar.C) / 255.0f, Color.green(gVar.C) / 255.0f, Color.blue(gVar.C) / 255.0f);
            GLES20.glUniform2f(gVar.M, i10, i11);
            GLES20.glUniform4f(gVar.N, f7, f10, f11, f12);
            GLES20.glUniform1i(gVar.S, gVar.D ? 1 : 0);
            float f16 = gVar.Z + f15;
            gVar.Z = f16;
            GLES20.glUniform1f(gVar.T, f16);
            if (gVar.X == 4) {
                gVar.a(0, true);
                GLES20.glClear(256);
                gVar.a(1, true);
                GLES20.glClear(256);
                gVar.a(2, false);
                gVar.a(1, false);
                gVar.a(0, false);
            } else {
                for (int i12 = 0; i12 < gVar.W; i12++) {
                    gVar.a(i12, false);
                }
            }
            float f17 = gVar.u;
            if (f17 < 1.0f) {
                float f18 = f17 + 0.07272727f;
                gVar.u = f18;
                if (f18 > 1.0f) {
                    gVar.u = 1.0f;
                }
            }
            float f19 = gVar.s + 5.0E-4f;
            gVar.s = f19;
            if (f19 > 1.0f) {
                gVar.s = f19 - 1.0f;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.a = i10;
        this.b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        Matrix.perspectiveM(this.k, 0, this.B == 4 ? 12.0f : 53.13f, i10 / i11, 1.0f, 200.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        g gVar = this.c;
        if (gVar != null) {
            GLES20.glDeleteProgram(gVar.a);
        }
        g gVar2 = new g(this.n, this.B);
        this.c = gVar2;
        Bitmap bitmap = this.o;
        if (bitmap != null) {
            gVar2.V = bitmap;
        }
        if (this.C) {
            gVar2.v = 1.0f;
            gVar2.w = 0.2f;
        }
    }
}
