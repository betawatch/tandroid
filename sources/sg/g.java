package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class g implements GLSurfaceView.Renderer {
    public final int D;
    public final int E;
    public boolean F;
    public float G;
    public int a;
    public int b;
    public o c;
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
    public int z = i6.Vj;
    public int A = i6.Wj;
    public final int B = i6.fk;
    public final int C = i6.gk;

    public g(Context context, int i10, int i11) {
        this.l = 0.0f;
        this.q = context;
        this.D = i10;
        this.E = i11;
        if (i11 == 2) {
            this.l = 1.0f;
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
        int i10 = i6.h5;
        boolean z10 = false;
        this.w = i0.a.f(i6.x0(null, i10, false)) < 0.5d;
        this.x = i0.a.d(this.l, i6.x0(null, this.z, false), i6.x0(null, this.B, false));
        this.y = i0.a.d(this.l, i6.x0(null, this.A, false), i6.x0(null, this.C, false));
        if (this.D == 1 && i0.a.f(i6.x0(null, i10, false)) < 0.5d) {
            z10 = true;
        }
        this.F = z10;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        int i10;
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
        o oVar = this.c;
        if (oVar != null) {
            oVar.b = (float) Math.toRadians(this.d + this.f);
            this.c.c = (float) Math.toRadians(this.i + this.j);
            this.c.d = (float) Math.toRadians(this.g);
            this.c.e = this.h;
            o oVar2 = this.c;
            oVar2.getClass();
            oVar2.J = this.w;
            oVar2.E = this.x;
            oVar2.F = this.y;
            float[] fArr2 = this.m;
            float[] fArr3 = this.p;
            int i11 = this.a;
            int i12 = this.b;
            float f7 = this.s;
            float f10 = this.u;
            float f11 = this.t;
            float f12 = this.v;
            float f13 = this.k;
            float f14 = this.l;
            float f15 = this.G;
            if (oVar2.a != null) {
                float min = Math.min(1.0f, (Math.max(0.0f, Math.min(f15, 0.1f)) / 0.22f) + oVar2.z);
                oVar2.z = min;
                a aVar = oVar2.a;
                aVar.B = oVar2.e;
                aVar.C = 0;
                aVar.c(i11, i12, oVar2.b, oVar2.c, oVar2.d, f15, min * oVar2.A, f13, false);
                return;
            }
            if (oVar2.Z != null) {
                GLES20.glBindTexture(3553, oVar2.o);
                i10 = 0;
                GLUtils.texImage2D(3553, 0, oVar2.Z, 0);
                oVar2.Z = null;
            } else {
                i10 = 0;
            }
            GLES20.glUniform1i(oVar2.l, i10);
            GLES20.glUniform1f(oVar2.s, oVar2.x);
            GLES20.glUniform1f(oVar2.t, oVar2.z);
            GLES20.glUniform1f(oVar2.v, f13);
            GLES20.glUniform1f(oVar2.w, f14);
            GLES20.glUniformMatrix4fv(oVar2.g, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(oVar2.h, 1, false, fArr3, 0);
            GLES20.glUniform1f(oVar2.K, oVar2.B);
            GLES20.glUniform1f(oVar2.L, oVar2.C);
            GLES20.glUniform1f(oVar2.M, oVar2.D);
            GLES20.glUniform1f(oVar2.P, oVar2.G);
            GLES20.glUniform3f(oVar2.N, Color.red(oVar2.E) / 255.0f, Color.green(oVar2.E) / 255.0f, Color.blue(oVar2.E) / 255.0f);
            GLES20.glUniform3f(oVar2.O, Color.red(oVar2.F) / 255.0f, Color.green(oVar2.F) / 255.0f, Color.blue(oVar2.F) / 255.0f);
            GLES20.glUniform3f(oVar2.Q, Color.red(oVar2.H) / 255.0f, Color.green(oVar2.H) / 255.0f, Color.blue(oVar2.H) / 255.0f);
            GLES20.glUniform3f(oVar2.R, Color.red(oVar2.I) / 255.0f, Color.green(oVar2.I) / 255.0f, Color.blue(oVar2.I) / 255.0f);
            GLES20.glUniform2f(oVar2.S, i11, i12);
            GLES20.glUniform4f(oVar2.T, f7, f10, f11, f12);
            GLES20.glUniform1i(oVar2.W, oVar2.J ? 1 : 0);
            float f16 = oVar2.d0 + f15;
            oVar2.d0 = f16;
            GLES20.glUniform1f(oVar2.X, f16);
            for (int i13 = 0; i13 < oVar2.a0; i13++) {
                int i14 = i13 * 3;
                GLES20.glBindBuffer(34962, oVar2.c0[i14]);
                GLES20.glVertexAttribPointer(oVar2.q, 2, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.c0[i14 + 1]);
                GLES20.glVertexAttribPointer(oVar2.r, 3, 5126, false, 0, 0);
                GLES20.glBindBuffer(34962, oVar2.c0[i14 + 2]);
                GLES20.glVertexAttribPointer(oVar2.p, 3, 5126, false, 0, 0);
                GLES20.glUniform1i(oVar2.U, i13);
                GLES20.glUniform1i(oVar2.V, oVar2.b0);
                GLES20.glDrawArrays(4, 0, oVar2.y[i13] / 3);
            }
            float f17 = oVar2.z;
            if (f17 < 1.0f) {
                float f18 = f17 + 0.07272727f;
                oVar2.z = f18;
                if (f18 > 1.0f) {
                    oVar2.z = 1.0f;
                }
            }
            float f19 = oVar2.x + 5.0E-4f;
            oVar2.x = f19;
            if (f19 > 1.0f) {
                oVar2.x = f19 - 1.0f;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.a = i10;
        this.b = i11;
        GLES20.glViewport(0, 0, i10, i11);
        Matrix.perspectiveM(this.n, 0, this.E == 4 ? 12.0f : 53.13f, i10 / i11, 1.0f, 200.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        o oVar = this.c;
        if (oVar != null) {
            a aVar = oVar.a;
            if (aVar != null) {
                aVar.b();
                oVar.a = null;
            } else {
                GLES20.glDeleteProgram(oVar.f);
            }
        }
        o oVar2 = new o(this.q, this.E);
        this.c = oVar2;
        Bitmap bitmap = this.r;
        if (bitmap != null && oVar2.a == null) {
            oVar2.Z = bitmap;
        }
        if (this.F) {
            oVar2.B = 1.0f;
            oVar2.C = 0.2f;
        }
    }
}
