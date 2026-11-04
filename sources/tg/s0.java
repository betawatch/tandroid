package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
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
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s0 extends q5 {
    public final /* synthetic */ u0 E;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public r0 s;
    public final x9 w;
    public final lt x;
    public final r0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, SurfaceTexture surfaceTexture, x9 x9Var) {
        super("CanvasInternal", true);
        this.E = u0Var;
        this.x = new lt(this, 24);
        this.y = new r0(this, 0);
        this.w = x9Var;
        this.a = surfaceTexture;
    }

    public static void a(s0 s0Var) {
        if (s0Var.f) {
            if (s0Var.d.equals(s0Var.b.eglGetCurrentContext()) && s0Var.e.equals(s0Var.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = s0Var.b;
            EGLDisplay eGLDisplay = s0Var.c;
            EGLSurface eGLSurface = s0Var.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, s0Var.d);
        }
    }

    public final void finish() {
        x9 x9Var = this.w;
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
            if (x9Var != null) {
                synchronized (x9Var.f) {
                    try {
                        if (x9Var.g == eGLContext) {
                            x9Var.g = null;
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
        if (x9Var != null) {
            r0 r0Var = this.y;
            ArrayList arrayList = x9Var.e;
            arrayList.remove(r0Var);
            if (arrayList.isEmpty() && x9Var.d.isEmpty()) {
                x9Var.n.o();
            }
        }
    }

    @Override // org.telegram.messenger.q5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        u0 u0Var = this.E;
        Bitmap bitmap = u0Var.h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        SurfaceTexture surfaceTexture = this.a;
        x9 x9Var = this.w;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        int i3 = 0;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z10 = false;
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
                        if (x9Var != null) {
                            synchronized (x9Var.f) {
                                try {
                                    eGLContext = x9Var.g;
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
                            if (x9Var != null) {
                                x9Var.a(eglCreateContext);
                                x9Var.e.add(this.y);
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
                                    i0 i0Var = u0Var.c;
                                    i0Var.getClass();
                                    Map map = w0.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : w0.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        v0 v0Var = new v0();
                                        v0Var.b = new HashMap();
                                        v0Var.a = GLES20.glCreateProgram();
                                        d2.t0 b10 = v0.b(35633, str);
                                        int i10 = b10.a;
                                        if (b10.b == 0) {
                                            if (r2.a) {
                                                a8.d("Vertex shader compilation failed");
                                            }
                                            v0.c(i10, i3, v0Var.a);
                                        } else {
                                            d2.t0 b11 = v0.b(35632, str2);
                                            int i11 = b11.a;
                                            if (b11.b == 0) {
                                                if (r2.a) {
                                                    a8.d("Fragment shader compilation failed");
                                                }
                                                v0.c(i10, i11, v0Var.a);
                                            } else {
                                                GLES20.glAttachShader(v0Var.a, i10);
                                                GLES20.glAttachShader(v0Var.a, i11);
                                                for (int i12 = i3; i12 < strArr.length; i12++) {
                                                    GLES20.glBindAttribLocation(v0Var.a, i12, strArr[i12]);
                                                }
                                                int i13 = v0Var.a;
                                                GLES20.glLinkProgram(i13);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i13, 35714, iArr3, i3);
                                                if (iArr3[i3] == 0 && r2.a) {
                                                    a8.d(GLES20.glGetProgramInfoLog(i13));
                                                }
                                                if (iArr3[i3] == 0) {
                                                    v0.c(i10, i11, v0Var.a);
                                                } else {
                                                    int length = strArr2.length;
                                                    for (int i14 = i3; i14 < length; i14++) {
                                                        String str3 = strArr2[i14];
                                                        v0Var.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(v0Var.a, str3)));
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
                                        hashMap.put((String) entry.getKey(), v0Var);
                                        i3 = 0;
                                    }
                                    i0Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    lt0 lt0Var = i0Var.g;
                                    if (u0Var.h.getWidth() != lt0Var.a || u0Var.h.getHeight() != lt0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) lt0Var.a, (int) lt0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(u0Var.h, (Rect) null, new RectF(0.0f, 0.0f, lt0Var.a, lt0Var.b), (Paint) null);
                                        u0Var.h = createBitmap;
                                        u0Var.r = true;
                                    }
                                    if (u0Var.n != null && (r5.getWidth() != lt0Var.a || u0Var.n.getHeight() != lt0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) lt0Var.a, (int) lt0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(u0Var.n, (Rect) null, new RectF(0.0f, 0.0f, lt0Var.a, lt0Var.b), (Paint) null);
                                        u0Var.n = createBitmap2;
                                        u0Var.r = true;
                                    }
                                    Bitmap bitmap2 = u0Var.h;
                                    Bitmap bitmap3 = u0Var.n;
                                    if (i0Var.k == null) {
                                        i0Var.k = new i1(bitmap2);
                                    }
                                    if (i0Var.D == null) {
                                        i0Var.D = new i1(bitmap3);
                                    }
                                    if (i0Var.G && i0Var.l == null) {
                                        i0Var.l = new i1(i0Var.A);
                                    }
                                    x7.e0.a();
                                    z10 = true;
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
                    z10 = false;
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
        this.f = z10;
        super.run();
    }
}
