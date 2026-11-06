package vg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int a;
    public int b;
    public n c;
    public float l;
    public final Context q;
    public Bitmap r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public int x;
    public int y;
    public float d = 0.0f;
    public float e = 0.0f;
    public volatile float f = 0.0f;
    public volatile float g = 0.0f;
    public volatile float h = 1.0f;
    public float i = 0.0f;
    public volatile float j = 0.0f;
    public float k = 0.0f;
    public final float[] m = new float[16];
    public final float[] n = new float[16];
    public final float[] o = new float[16];
    public final float[] p = new float[16];
    public int z = k6.Jk;
    public int A = k6.Kk;
    public final int B = k6.Tk;
    public final int C = k6.Uk;

    public f(Context context, int i7, int i10) {
        this.l = 0.0f;
        this.q = context;
        this.D = i7;
        this.E = i10;
        if (i10 == 2) {
            this.l = 1.0f;
        }
        b();
    }

    public static int a(int i7, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i7);
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
        int i7 = k6.h5;
        boolean z9 = false;
        this.w = i0.a.h(k6.x0(null, i7, false)) < 0.5d;
        this.x = i0.a.f(this.l, k6.x0(null, this.z, false), k6.x0(null, this.B, false));
        this.y = i0.a.f(this.l, k6.x0(null, this.A, false), k6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.h(k6.x0(null, i7, false)) < 0.5d) {
            z9 = true;
        }
        this.F = z9;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        int i7;
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        Matrix.setLookAtM(this.o, 0, 0.0f, this.E == 4 ? 40.0f : 0.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.p, 0);
        Matrix.translateM(this.p, 0, 0.0f, this.e, 0.0f);
        Matrix.rotateM(this.p, 0, (-this.i) - this.j, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.p, 0, (-this.d) - this.f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.m, 0, this.o, 0, this.p, 0);
        float[] fArr = this.m;
        Matrix.multiplyMM(fArr, 0, this.n, 0, fArr, 0);
        n nVar = this.c;
        if (nVar != null) {
            nVar.b = (float) Math.toRadians(this.d + this.f);
            this.c.c = (float) Math.toRadians(this.i + this.j);
            this.c.d = (float) Math.toRadians(this.g);
            this.c.e = this.h;
            n nVar2 = this.c;
            nVar2.getClass();
            nVar2.J = this.w;
            nVar2.E = this.x;
            nVar2.F = this.y;
            float[] fArr2 = this.m;
            float[] fArr3 = this.p;
            int i10 = this.a;
            int i11 = this.b;
            float f10 = this.s;
            float f11 = this.u;
            float f12 = this.t;
            float f13 = this.v;
            float f14 = this.k;
            float f15 = this.l;
            float f16 = this.G;
            if (nVar2.a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f16, 0.1f)) / 0.22f) + nVar2.z);
                nVar2.z = min;
                a aVar = nVar2.a;
                aVar.B = nVar2.e;
                aVar.C = 0;
                aVar.c(i10, i11, nVar2.b, nVar2.c, nVar2.d, f16, min * nVar2.A, f14, false);
                return;
            }
            if (nVar2.Z != null) {
                GLES20.glBindTexture(3553, nVar2.o);
                i7 = 0;
                GLUtils.texImage2D(3553, 0, nVar2.Z, 0);
                nVar2.Z = null;
            } else {
                i7 = 0;
            }
            GLES20.glUniform1i(nVar2.l, i7);
            GLES20.glUniform1f(nVar2.s, nVar2.x);
            GLES20.glUniform1f(nVar2.t, nVar2.z);
            GLES20.glUniform1f(nVar2.v, f14);
            GLES20.glUniform1f(nVar2.w, f15);
            GLES20.glUniformMatrix4fv(nVar2.g, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(nVar2.h, 1, false, fArr3, 0);
            GLES20.glUniform1f(nVar2.K, nVar2.B);
            GLES20.glUniform1f(nVar2.L, nVar2.C);
            GLES20.glUniform1f(nVar2.M, nVar2.D);
            GLES20.glUniform1f(nVar2.P, nVar2.G);
            GLES20.glUniform3f(nVar2.N, Color.red(nVar2.E) / 255.0f, Color.green(nVar2.E) / 255.0f, Color.blue(nVar2.E) / 255.0f);
            GLES20.glUniform3f(nVar2.O, Color.red(nVar2.F) / 255.0f, Color.green(nVar2.F) / 255.0f, Color.blue(nVar2.F) / 255.0f);
            GLES20.glUniform3f(nVar2.Q, Color.red(nVar2.H) / 255.0f, Color.green(nVar2.H) / 255.0f, Color.blue(nVar2.H) / 255.0f);
            GLES20.glUniform3f(nVar2.R, Color.red(nVar2.I) / 255.0f, Color.green(nVar2.I) / 255.0f, Color.blue(nVar2.I) / 255.0f);
            GLES20.glUniform2f(nVar2.S, i10, i11);
            GLES20.glUniform4f(nVar2.T, f10, f11, f12, f13);
            GLES20.glUniform1i(nVar2.W, nVar2.J ? 1 : 0);
            float f17 = nVar2.d0 + f16;
            nVar2.d0 = f17;
            GLES20.glUniform1f(nVar2.X, f17);
            for (int i12 = 0; i12 < nVar2.a0; i12++) {
                int i13 = i12 * 3;
                GLES20.glBindBuffer(34962, nVar2.c0[i13]);
                GLES20.glVertexAttribPointer(nVar2.q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.c0[i13 + 1]);
                GLES20.glVertexAttribPointer(nVar2.r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, nVar2.c0[i13 + 2]);
                GLES20.glVertexAttribPointer(nVar2.p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(nVar2.U, i12);
                GLES20.glUniform1i(nVar2.V, nVar2.b0);
                GLES20.glDrawArrays(4, 0, nVar2.y[i12] / 3);
            }
            float f18 = nVar2.z;
            if (f18 < 1.0f) {
                float f19 = f18 + 0.07272727f;
                nVar2.z = f19;
                if (f19 > 1.0f) {
                    nVar2.z = 1.0f;
                }
            }
            float f20 = nVar2.x + 5.0E-4f;
            nVar2.x = f20;
            if (f20 > 1.0f) {
                nVar2.x = f20 - 1.0f;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        this.a = i7;
        this.b = i10;
        GLES20.glViewport(0, 0, i7, i10);
        Matrix.perspectiveM(this.n, 0, this.E == 4 ? 12.0f : 53.13f, i7 / i10, 1.0f, 200.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        n nVar = this.c;
        if (nVar != null) {
            a aVar = nVar.a;
            if (aVar != null) {
                aVar.b();
                nVar.a = null;
            } else {
                GLES20.glDeleteProgram(nVar.f);
            }
        }
        n nVar2 = new n(this.q, this.E);
        this.c = nVar2;
        Bitmap bitmap = this.r;
        if (bitmap != null && nVar2.a == null) {
            nVar2.Z = bitmap;
        }
        if (this.F) {
            nVar2.B = 1.0f;
            nVar2.C = 0.2f;
        }
    }
}
