package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import c8.kc;
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
import org.telegram.messenger.m10;
import org.telegram.messenger.r5;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Wallet.o5;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r0 extends r5 {
    public final /* synthetic */ t0 E;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public q0 s;
    public final ba w;
    public final o5 x;
    public final q0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, SurfaceTexture surfaceTexture, ba baVar) {
        super("CanvasInternal", true);
        this.E = t0Var;
        this.x = new o5(this, 5);
        this.y = new q0(this, 0);
        this.w = baVar;
        this.a = surfaceTexture;
    }

    public static void a(r0 r0Var) {
        if (r0Var.f) {
            if (r0Var.d.equals(r0Var.b.eglGetCurrentContext()) && r0Var.e.equals(r0Var.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = r0Var.b;
            EGLDisplay eGLDisplay = r0Var.c;
            EGLSurface eGLSurface = r0Var.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, r0Var.d);
        }
    }

    public final void finish() {
        ba baVar = this.w;
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
            if (baVar != null) {
                synchronized (baVar.f) {
                    try {
                        if (baVar.g == eGLContext) {
                            baVar.g = null;
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
        if (baVar != null) {
            q0 q0Var = this.y;
            ArrayList arrayList = baVar.e;
            arrayList.remove(q0Var);
            if (arrayList.isEmpty() && baVar.d.isEmpty()) {
                baVar.n.o();
            }
        }
    }

    @Override // org.telegram.messenger.r5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        t0 t0Var = this.E;
        Bitmap bitmap = t0Var.h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        SurfaceTexture surfaceTexture = this.a;
        ba baVar = this.w;
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
            if (s2.a) {
                m10.v(this.b, new StringBuilder("eglGetDisplay failed "));
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
                        if (baVar != null) {
                            synchronized (baVar.f) {
                                try {
                                    eGLContext = baVar.g;
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
                            if (s2.a) {
                                m10.v(this.b, new StringBuilder("eglCreateContext failed "));
                            }
                            finish();
                        } else {
                            if (baVar != null) {
                                baVar.a(eglCreateContext);
                                baVar.e.add(this.y);
                            }
                            if (surfaceTexture != null) {
                                EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                this.e = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                    if (s2.a) {
                                        m10.v(this.b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    h0 h0Var = t0Var.c;
                                    h0Var.getClass();
                                    Map map = v0.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : v0.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        u0 u0Var = new u0();
                                        u0Var.b = new HashMap();
                                        u0Var.a = GLES20.glCreateProgram();
                                        e2.r0 b10 = u0.b(35633, str);
                                        int i10 = b10.a;
                                        if (b10.b == 0) {
                                            if (s2.a) {
                                                a8.d("Vertex shader compilation failed");
                                            }
                                            u0.c(i10, i7, u0Var.a);
                                        } else {
                                            e2.r0 b11 = u0.b(35632, str2);
                                            int i11 = b11.a;
                                            if (b11.b == 0) {
                                                if (s2.a) {
                                                    a8.d("Fragment shader compilation failed");
                                                }
                                                u0.c(i10, i11, u0Var.a);
                                            } else {
                                                GLES20.glAttachShader(u0Var.a, i10);
                                                GLES20.glAttachShader(u0Var.a, i11);
                                                for (int i12 = i7; i12 < strArr.length; i12++) {
                                                    GLES20.glBindAttribLocation(u0Var.a, i12, strArr[i12]);
                                                }
                                                int i13 = u0Var.a;
                                                GLES20.glLinkProgram(i13);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i13, 35714, iArr3, i7);
                                                if (iArr3[i7] == 0 && s2.a) {
                                                    a8.d(GLES20.glGetProgramInfoLog(i13));
                                                }
                                                if (iArr3[i7] == 0) {
                                                    u0.c(i10, i11, u0Var.a);
                                                } else {
                                                    int length = strArr2.length;
                                                    for (int i14 = i7; i14 < length; i14++) {
                                                        String str3 = strArr2[i14];
                                                        u0Var.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(u0Var.a, str3)));
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
                                        hashMap.put((String) entry.getKey(), u0Var);
                                        i7 = 0;
                                    }
                                    h0Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    xt0 xt0Var = h0Var.g;
                                    if (t0Var.h.getWidth() != xt0Var.a || t0Var.h.getHeight() != xt0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) xt0Var.a, (int) xt0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(t0Var.h, (Rect) null, new RectF(0.0f, 0.0f, xt0Var.a, xt0Var.b), (Paint) null);
                                        t0Var.h = createBitmap;
                                        t0Var.r = true;
                                    }
                                    if (t0Var.n != null && (r5.getWidth() != xt0Var.a || t0Var.n.getHeight() != xt0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) xt0Var.a, (int) xt0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(t0Var.n, (Rect) null, new RectF(0.0f, 0.0f, xt0Var.a, xt0Var.b), (Paint) null);
                                        t0Var.n = createBitmap2;
                                        t0Var.r = true;
                                    }
                                    Bitmap bitmap2 = t0Var.h;
                                    Bitmap bitmap3 = t0Var.n;
                                    if (h0Var.k == null) {
                                        h0Var.k = new h1(bitmap2);
                                    }
                                    if (h0Var.D == null) {
                                        h0Var.D = new h1(bitmap3);
                                    }
                                    if (h0Var.G && h0Var.l == null) {
                                        h0Var.l = new h1(h0Var.A);
                                    }
                                    kc.a();
                                    z10 = true;
                                } else {
                                    if (s2.a) {
                                        m10.v(this.b, new StringBuilder("eglMakeCurrent failed "));
                                    }
                                    finish();
                                }
                            } else {
                                finish();
                            }
                        }
                    } else {
                        if (s2.a) {
                            a8.d("eglConfig not initialized");
                        }
                        finish();
                    }
                    z10 = false;
                } else {
                    if (s2.a) {
                        m10.v(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (s2.a) {
                    m10.v(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }
}
