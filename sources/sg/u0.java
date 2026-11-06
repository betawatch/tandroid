package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import c8.ec;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.a8;
import org.telegram.messenger.q5;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class u0 extends q5 {
    public final /* synthetic */ w0 D;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public s0 s;
    public final y9 w;
    public final dt x;
    public final s0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, SurfaceTexture surfaceTexture, y9 y9Var) {
        super("CanvasInternal", true);
        this.D = w0Var;
        this.x = new dt(this, 29);
        this.y = new s0(this, 0);
        this.w = y9Var;
        this.a = surfaceTexture;
    }

    public static void a(u0 u0Var) {
        if (u0Var.f) {
            if (u0Var.d.equals(u0Var.b.eglGetCurrentContext()) && u0Var.e.equals(u0Var.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = u0Var.b;
            EGLDisplay eGLDisplay = u0Var.c;
            EGLSurface eGLSurface = u0Var.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, u0Var.d);
        }
    }

    public final void finish() {
        y9 y9Var = this.w;
        if (this.e != null) {
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.b.eglDestroySurface(this.c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (y9Var != null) {
                synchronized (y9Var.f) {
                    try {
                        if (y9Var.g == eGLContext) {
                            y9Var.g = null;
                        }
                    } finally {
                    }
                }
            }
            this.b.eglDestroyContext(this.c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.c;
        if (eGLDisplay2 != null) {
            this.b.eglTerminate(eGLDisplay2);
            this.c = null;
        }
        if (y9Var != null) {
            s0 s0Var = this.y;
            ArrayList arrayList = y9Var.e;
            arrayList.remove(s0Var);
            if (arrayList.isEmpty() && y9Var.d.isEmpty()) {
                y9Var.n.o();
            }
        }
    }

    @Override // org.telegram.messenger.q5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        w0 w0Var = this.D;
        Bitmap bitmap = w0Var.h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        SurfaceTexture surfaceTexture = this.a;
        y9 y9Var = this.w;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        int i7 = 0;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z9 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (r2.a) {
                org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else {
            if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (iArr[0] > 0) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        int[] iArr2 = {12440, 2, 12344};
                        if (y9Var != null) {
                            synchronized (y9Var.f) {
                                try {
                                    eGLContext = y9Var.g;
                                    if (eGLContext == null) {
                                        eGLContext = EGL10.EGL_NO_CONTEXT;
                                    }
                                } finally {
                                }
                            }
                        } else {
                            eGLContext = EGL10.EGL_NO_CONTEXT;
                        }
                        EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, eGLContext, iArr2);
                        this.d = eglCreateContext;
                        if (eglCreateContext == null) {
                            if (r2.a) {
                                org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglCreateContext failed "));
                            }
                            finish();
                        } else {
                            if (y9Var != null) {
                                y9Var.a(eglCreateContext);
                                y9Var.e.add(this.y);
                            }
                            if (surfaceTexture != null) {
                                EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                this.e = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                    if (r2.a) {
                                        org.telegram.messenger.camera.q.t(this.b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    j0 j0Var = w0Var.c;
                                    j0Var.getClass();
                                    Map map = y0.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : y0.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        x0 x0Var = new x0();
                                        x0Var.b = new HashMap();
                                        x0Var.a = GLES20.glCreateProgram();
                                        e2.r0 b10 = x0.b(35633, str);
                                        int i10 = b10.a;
                                        if (b10.b == 0) {
                                            if (r2.a) {
                                                a8.d("Vertex shader compilation failed");
                                            }
                                            x0.c(i10, i7, x0Var.a);
                                        } else {
                                            e2.r0 b11 = x0.b(35632, str2);
                                            int i11 = b11.a;
                                            if (b11.b == 0) {
                                                if (r2.a) {
                                                    a8.d("Fragment shader compilation failed");
                                                }
                                                x0.c(i10, i11, x0Var.a);
                                            } else {
                                                GLES20.glAttachShader(x0Var.a, i10);
                                                GLES20.glAttachShader(x0Var.a, i11);
                                                for (int i12 = i7; i12 < strArr.length; i12++) {
                                                    GLES20.glBindAttribLocation(x0Var.a, i12, strArr[i12]);
                                                }
                                                int i13 = x0Var.a;
                                                GLES20.glLinkProgram(i13);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i13, 35714, iArr3, i7);
                                                if (iArr3[i7] == 0 && r2.a) {
                                                    a8.d(GLES20.glGetProgramInfoLog(i13));
                                                }
                                                if (iArr3[i7] == 0) {
                                                    x0.c(i10, i11, x0Var.a);
                                                } else {
                                                    int length = strArr2.length;
                                                    for (int i14 = i7; i14 < length; i14++) {
                                                        String str3 = strArr2[i14];
                                                        x0Var.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(x0Var.a, str3)));
                                                    }
                                                    if (i10 != 0) {
                                                        GLES20.glDeleteShader(i10);
                                                    }
                                                    if (i11 != 0) {
                                                        GLES20.glDeleteShader(i11);
                                                    }
                                                }
                                            }
                                        }
                                        hashMap.put((String) entry.getKey(), x0Var);
                                        i7 = 0;
                                    }
                                    j0Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    mt0 mt0Var = j0Var.g;
                                    if (w0Var.h.getWidth() != mt0Var.a || w0Var.h.getHeight() != mt0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) mt0Var.a, (int) mt0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(w0Var.h, (Rect) null, new RectF(0.0f, 0.0f, mt0Var.a, mt0Var.b), (Paint) null);
                                        w0Var.h = createBitmap;
                                        w0Var.r = true;
                                    }
                                    if (w0Var.n != null && (r5.getWidth() != mt0Var.a || w0Var.n.getHeight() != mt0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) mt0Var.a, (int) mt0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(w0Var.n, (Rect) null, new RectF(0.0f, 0.0f, mt0Var.a, mt0Var.b), (Paint) null);
                                        w0Var.n = createBitmap2;
                                        w0Var.r = true;
                                    }
                                    Bitmap bitmap2 = w0Var.h;
                                    Bitmap bitmap3 = w0Var.n;
                                    if (j0Var.k == null) {
                                        j0Var.k = new k1(bitmap2);
                                    }
                                    if (j0Var.D == null) {
                                        j0Var.D = new k1(bitmap3);
                                    }
                                    if (j0Var.G && j0Var.l == null) {
                                        j0Var.l = new k1(j0Var.A);
                                    }
                                    ec.a();
                                    z9 = true;
                                } else {
                                    if (r2.a) {
                                        org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglMakeCurrent failed "));
                                    }
                                    finish();
                                }
                            } else {
                                finish();
                            }
                        }
                    } else {
                        if (r2.a) {
                            a8.d("eglConfig not initialized");
                        }
                        finish();
                    }
                    z9 = false;
                } else {
                    if (r2.a) {
                        org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (r2.a) {
                    org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z9;
        super.run();
    }
}
