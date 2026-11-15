package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import c8.gc;
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
import org.telegram.messenger.i20;
import org.telegram.messenger.q5;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.u9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
    public final u9 w;
    public final s4.s0 x;
    public final r0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, SurfaceTexture surfaceTexture, u9 u9Var) {
        super("CanvasInternal", true);
        this.E = u0Var;
        this.x = new s4.s0(this, 2);
        this.y = new r0(this, 0);
        this.w = u9Var;
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
        u9 u9Var = this.w;
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
            if (u9Var != null) {
                synchronized (u9Var.f) {
                    try {
                        if (u9Var.g == eGLContext) {
                            u9Var.g = null;
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
        if (u9Var != null) {
            r0 r0Var = this.y;
            ArrayList arrayList = u9Var.e;
            arrayList.remove(r0Var);
            if (arrayList.isEmpty() && u9Var.d.isEmpty()) {
                u9Var.n.o();
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
        u9 u9Var = this.w;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        int i7 = 0;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (r2.a) {
                i20.u(this.b, new StringBuilder("eglGetDisplay failed "));
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
                        if (u9Var != null) {
                            synchronized (u9Var.f) {
                                try {
                                    eGLContext = u9Var.g;
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
                                i20.u(this.b, new StringBuilder("eglCreateContext failed "));
                            }
                            finish();
                        } else {
                            if (u9Var != null) {
                                u9Var.a(eglCreateContext);
                                u9Var.e.add(this.y);
                            }
                            if (surfaceTexture != null) {
                                EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                this.e = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                    if (r2.a) {
                                        i20.u(this.b, new StringBuilder("createWindowSurface failed "));
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
                                        e2.r0 b10 = v0.b(35633, str);
                                        int i10 = b10.a;
                                        if (b10.b == 0) {
                                            if (r2.a) {
                                                a8.d("Vertex shader compilation failed");
                                            }
                                            v0.c(i10, i7, v0Var.a);
                                        } else {
                                            e2.r0 b11 = v0.b(35632, str2);
                                            int i11 = b11.a;
                                            if (b11.b == 0) {
                                                if (r2.a) {
                                                    a8.d("Fragment shader compilation failed");
                                                }
                                                v0.c(i10, i11, v0Var.a);
                                            } else {
                                                GLES20.glAttachShader(v0Var.a, i10);
                                                GLES20.glAttachShader(v0Var.a, i11);
                                                for (int i12 = i7; i12 < strArr.length; i12++) {
                                                    GLES20.glBindAttribLocation(v0Var.a, i12, strArr[i12]);
                                                }
                                                int i13 = v0Var.a;
                                                GLES20.glLinkProgram(i13);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i13, 35714, iArr3, i7);
                                                if (iArr3[i7] == 0 && r2.a) {
                                                    a8.d(GLES20.glGetProgramInfoLog(i13));
                                                }
                                                if (iArr3[i7] == 0) {
                                                    v0.c(i10, i11, v0Var.a);
                                                } else {
                                                    int length = strArr2.length;
                                                    for (int i14 = i7; i14 < length; i14++) {
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
                                        i7 = 0;
                                    }
                                    i0Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    nt0 nt0Var = i0Var.g;
                                    if (u0Var.h.getWidth() != nt0Var.a || u0Var.h.getHeight() != nt0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) nt0Var.a, (int) nt0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(u0Var.h, (Rect) null, new RectF(0.0f, 0.0f, nt0Var.a, nt0Var.b), (Paint) null);
                                        u0Var.h = createBitmap;
                                        u0Var.r = true;
                                    }
                                    if (u0Var.n != null && (r5.getWidth() != nt0Var.a || u0Var.n.getHeight() != nt0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) nt0Var.a, (int) nt0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(u0Var.n, (Rect) null, new RectF(0.0f, 0.0f, nt0Var.a, nt0Var.b), (Paint) null);
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
                                    gc.a();
                                    z10 = true;
                                } else {
                                    if (r2.a) {
                                        i20.u(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                        i20.u(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (r2.a) {
                    i20.u(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }
}
