package xh;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d extends Thread {
    public EGLSurface E;
    public EGLContext F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int[] P;
    public float Q;
    public final /* synthetic */ e R;
    public final c c;
    public final SurfaceTexture d;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public EGL10 w;
    public EGLDisplay x;
    public EGLConfig y;
    public volatile boolean a = true;
    public volatile boolean b = false;
    public final Object e = new Object();
    public final float s = g0.N(1.2f);
    public boolean N = true;
    public int O = 0;

    public d(e eVar, SurfaceTexture surfaceTexture, int i7, int i10, c cVar) {
        this.R = eVar;
        this.c = cVar;
        this.d = surfaceTexture;
        this.h = i7;
        this.n = i10;
        this.r = (int) Utilities.i(((i7 * i10) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
    }

    public static void a() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            a8.d("spoiler gles error " + glGetError);
        }
    }

    public final void b() {
        int[] iArr = this.P;
        if (iArr != null) {
            GLES20.glDeleteBuffers(2, iArr, 0);
        }
        int[] iArr2 = new int[2];
        this.P = iArr2;
        GLES20.glGenBuffers(2, iArr2, 0);
        for (int i7 = 0; i7 < 2; i7++) {
            GLES20.glBindBuffer(34962, this.P[i7]);
            GLES20.glBufferData(34962, this.r * 24, null, 35048);
        }
        a();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.w = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.x = eglGetDisplay;
        int i11 = 3;
        int i12 = 2;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            this.a = false;
        } else {
            if (this.w.eglInitialize(eglGetDisplay, new int[2])) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (this.w.eglChooseConfig(this.x, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.y = eGLConfig;
                    EGLContext eglCreateContext = this.w.eglCreateContext(this.x, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                    this.F = eglCreateContext;
                    if (eglCreateContext == null) {
                        this.a = false;
                    } else {
                        EGLSurface eglCreateWindowSurface = this.w.eglCreateWindowSurface(this.x, this.y, this.d, null);
                        this.E = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null) {
                            this.a = false;
                        } else if (this.w.eglMakeCurrent(this.x, eglCreateWindowSurface, eglCreateWindowSurface, this.F)) {
                            b();
                            int glCreateShader = GLES20.glCreateShader(35633);
                            int glCreateShader2 = GLES20.glCreateShader(35632);
                            if (glCreateShader == 0 || glCreateShader2 == 0) {
                                this.a = false;
                            } else {
                                GLES20.glShaderSource(glCreateShader, g0.y2(null, R.raw.spoiler_vertex));
                                GLES20.glCompileShader(glCreateShader);
                                int[] iArr = new int[1];
                                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                                if (iArr[0] == 0) {
                                    a8.d("SpoilerEffect2, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                                    GLES20.glDeleteShader(glCreateShader);
                                    this.a = false;
                                } else {
                                    GLES20.glShaderSource(glCreateShader2, g0.y2(null, R.raw.spoiler_fragment));
                                    GLES20.glCompileShader(glCreateShader2);
                                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                                    if (iArr[0] == 0) {
                                        a8.d("SpoilerEffect2, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                                        GLES20.glDeleteShader(glCreateShader2);
                                        this.a = false;
                                    } else {
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.G = glCreateProgram;
                                        if (glCreateProgram == 0) {
                                            this.a = false;
                                        } else {
                                            GLES20.glAttachShader(glCreateProgram, glCreateShader);
                                            GLES20.glAttachShader(this.G, glCreateShader2);
                                            GLES30.glTransformFeedbackVaryings(this.G, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
                                            GLES20.glLinkProgram(this.G);
                                            GLES20.glGetProgramiv(this.G, 35714, iArr, 0);
                                            if (iArr[0] == 0) {
                                                a8.d("SpoilerEffect2, link draw program error: " + GLES20.glGetProgramInfoLog(this.G));
                                                this.a = false;
                                            } else {
                                                this.H = GLES20.glGetUniformLocation(this.G, "reset");
                                                this.I = GLES20.glGetUniformLocation(this.G, "time");
                                                this.J = GLES20.glGetUniformLocation(this.G, "deltaTime");
                                                this.K = GLES20.glGetUniformLocation(this.G, "size");
                                                this.L = GLES20.glGetUniformLocation(this.G, "r");
                                                this.M = GLES20.glGetUniformLocation(this.G, "seed");
                                                GLES20.glViewport(0, 0, this.h, this.n);
                                                GLES20.glEnable(3042);
                                                GLES20.glBlendFunc(770, 771);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glUseProgram(this.G);
                                                GLES20.glUniform2f(this.K, this.h, this.n);
                                                GLES20.glUniform1f(this.H, this.N ? 1.0f : 0.0f);
                                                GLES20.glUniform1f(this.L, this.s);
                                                GLES20.glUniform1f(this.M, Utilities.c.nextInt(256) / 256.0f);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.a = false;
                        }
                    }
                } else {
                    this.a = false;
                }
            } else {
                this.a = false;
            }
        }
        long nanoTime = System.nanoTime();
        while (this.a) {
            long nanoTime2 = System.nanoTime();
            double d = (nanoTime2 - nanoTime) / 1.0E9d;
            e eVar = this.R;
            double d2 = eVar.a;
            if (d < d2) {
                double d10 = d2 - d;
                long j3 = (long) (d10 * 1000.0d);
                i7 = i11;
                i10 = i12;
                try {
                    Thread.sleep(j3, (int) ((d10 - (j3 / 1000.0d)) * 1.0E9d));
                } catch (Exception unused) {
                }
                d = this.R.a;
            } else {
                i7 = i11;
                i10 = i12;
                double d11 = eVar.b;
                if (d > d11) {
                    d = d11;
                }
            }
            while (this.b) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused2) {
                }
            }
            synchronized (this.e) {
                try {
                    if (this.f) {
                        GLES20.glUniform2f(this.K, this.h, this.n);
                        GLES20.glViewport(0, 0, this.h, this.n);
                        int i13 = (int) Utilities.i(((this.h * this.n) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
                        if (i13 > this.r) {
                            this.N = true;
                            b();
                        }
                        this.r = i13;
                        this.f = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            float f10 = (float) d;
            EGL10 egl102 = this.w;
            EGLDisplay eGLDisplay = this.x;
            EGLSurface eGLSurface = this.E;
            if (egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.F)) {
                float f11 = f10 * 0.65f;
                float f12 = this.Q + f11;
                this.Q = f12;
                if (f12 > 1000.0f) {
                    this.Q = 0.0f;
                }
                GLES20.glClear(TLObject.FLAG_14);
                GLES20.glBindBuffer(34962, this.P[this.O]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(i10);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i7);
                GLES30.glBindBufferBase(35982, 0, this.P[1 - this.O]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(i10);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i7);
                GLES20.glUniform1f(this.I, this.Q);
                GLES20.glUniform1f(this.J, f11);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, this.r);
                GLES30.glEndTransformFeedback();
                if (this.N) {
                    this.N = false;
                    GLES20.glUniform1f(this.H, 0.0f);
                }
                this.O = 1 - this.O;
                this.w.eglSwapBuffers(this.x, this.E);
                a();
            } else {
                this.a = false;
            }
            g0.r(this.c);
            g0.h3(this.c);
            i11 = i7;
            nanoTime = nanoTime2;
            i12 = i10;
        }
        int i14 = i12;
        int[] iArr2 = this.P;
        if (iArr2 != null) {
            try {
                GLES20.glDeleteBuffers(i14, iArr2, 0);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            this.P = null;
        }
        int i15 = this.G;
        if (i15 != 0) {
            try {
                GLES20.glDeleteProgram(i15);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            this.G = 0;
        }
        EGL10 egl103 = this.w;
        if (egl103 != null) {
            try {
                EGLDisplay eGLDisplay2 = this.x;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl103.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            try {
                this.w.eglDestroySurface(this.x, this.E);
            } catch (Exception e13) {
                a8.g(e13, true);
            }
            try {
                this.w.eglDestroyContext(this.x, this.F);
            } catch (Exception e14) {
                a8.g(e14, true);
            }
        }
        try {
            this.d.release();
        } catch (Exception e15) {
            a8.g(e15, true);
        }
        a();
    }
}
