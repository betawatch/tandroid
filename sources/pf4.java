// default package

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Looper;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pf4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rf4 b;

    public /* synthetic */ pf4(rf4 rf4Var, byte b) {
        this.a = b;
        this.b = rf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tf4 tf4Var;
        byte b = this.a;
        rf4 rf4Var = this.b;
        switch (b) {
            case 0:
                rf4Var.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 1:
                if (rf4Var.f) {
                    rf4Var.a();
                    if (rf4Var.y) {
                        rf4Var.x.updateTexImage();
                        rf4Var.x.getTransformMatrix(rf4Var.E);
                        rf4Var.d();
                        rf4Var.y = false;
                        uf4 uf4Var = rf4Var.K;
                        uf4Var.P0 = rf4Var.E;
                        uf4Var.W0 = false;
                        rf4Var.G = true;
                    }
                    if (rf4Var.a0) {
                        if (!rf4Var.h || ((tf4Var = rf4Var.K.f1) != null && !tf4Var.g())) {
                            if (rf4Var.c0 == null || rf4Var.G) {
                                GLES20.glViewport(0, 0, rf4Var.V, rf4Var.W);
                                rf4Var.K.f();
                                rf4Var.K.d();
                                if (rf4Var.c0 == null) {
                                    rf4Var.K.e();
                                }
                                rf4Var.K.c();
                                rf4Var.U = rf4Var.K.b();
                                rf4Var.d0 = true;
                            }
                            if (rf4Var.d0) {
                                GLES20.glViewport(0, 0, rf4Var.n, rf4Var.r);
                                GLES20.glBindFramebuffer(36160, 0);
                                int g = rf4Var.K.g(!rf4Var.U ? 1 : 0);
                                GLES20.glUseProgram(rf4Var.L);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, g);
                                GLES20.glUniform1i(rf4Var.O, 0);
                                GLES20.glEnableVertexAttribArray(rf4Var.N);
                                int i = rf4Var.N;
                                FloatBuffer floatBuffer = rf4Var.Z;
                                if (floatBuffer == null) {
                                    floatBuffer = rf4Var.K.a1;
                                }
                                GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, (Buffer) floatBuffer);
                                GLES20.glEnableVertexAttribArray(rf4Var.M);
                                GLES20.glVertexAttribPointer(rf4Var.M, 2, 5126, false, 8, (Buffer) rf4Var.K.Z0);
                                GLES20.glDrawArrays(5, 0, 4);
                                rf4Var.b.eglSwapBuffers(rf4Var.c, rf4Var.e);
                                yl0 yl0Var = rf4Var.J;
                                if (yl0Var != null) {
                                    yl0Var.a(g, rf4Var.V, rf4Var.W, null);
                                    break;
                                }
                            }
                        } else {
                            GLES20.glViewport(0, 0, rf4Var.n, rf4Var.r);
                            GLES20.glBindFramebuffer(36160, 0);
                            GLES20.glUseProgram(rf4Var.P);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(36197, rf4Var.F[0]);
                            GLES20.glUniform1i(rf4Var.T, 0);
                            GLES20.glEnableVertexAttribArray(rf4Var.S);
                            int i2 = rf4Var.S;
                            FloatBuffer floatBuffer2 = rf4Var.Z;
                            if (floatBuffer2 == null) {
                                floatBuffer2 = rf4Var.K.a1;
                            }
                            GLES20.glVertexAttribPointer(i2, 2, 5126, false, 8, (Buffer) floatBuffer2);
                            GLES20.glEnableVertexAttribArray(rf4Var.Q);
                            GLES20.glVertexAttribPointer(rf4Var.Q, 2, 5126, false, 8, (Buffer) rf4Var.K.b1);
                            GLES20.glUniformMatrix4fv(rf4Var.R, 1, false, rf4Var.E, 0);
                            GLES20.glDrawArrays(5, 0, 4);
                            rf4Var.b.eglSwapBuffers(rf4Var.c, rf4Var.e);
                            yl0 yl0Var2 = rf4Var.J;
                            if (yl0Var2 != null) {
                                yl0Var2.a(rf4Var.F[0], rf4Var.X, rf4Var.Y, rf4Var.E);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ftb ftbVar = rf4Var.c0;
                SurfaceTexture surfaceTexture = rf4Var.x;
                kec kecVar = (kec) ftbVar.b;
                if (kecVar.a != null) {
                    kecVar.a.x0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
