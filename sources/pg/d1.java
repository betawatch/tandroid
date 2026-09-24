package pg;

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
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.uv0;
import w7.n6;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class d1 extends DispatchQueue {
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public b1 s;
    public final ja v;
    public final c1 w;
    public final b1 x;
    public final /* synthetic */ f1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, SurfaceTexture surfaceTexture, ja jaVar) {
        super("CanvasInternal");
        this.y = f1Var;
        int i10 = 0;
        this.w = new c1(this, i10);
        this.x = new b1(this, i10);
        this.v = jaVar;
        this.a = surfaceTexture;
    }

    public static void b(d1 d1Var) {
        if (d1Var.f) {
            if (d1Var.d.equals(d1Var.b.eglGetCurrentContext()) && d1Var.e.equals(d1Var.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = d1Var.b;
            EGLDisplay eGLDisplay = d1Var.c;
            EGLSurface eGLSurface = d1Var.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, d1Var.d);
        }
    }

    public final void finish() {
        ja jaVar = this.v;
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
            if (jaVar != null) {
                synchronized (jaVar.f) {
                    try {
                        if (jaVar.g == eGLContext) {
                            jaVar.g = null;
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
        if (jaVar != null) {
            b1 b1Var = this.x;
            ArrayList arrayList = jaVar.e;
            arrayList.remove(b1Var);
            if (arrayList.isEmpty() && jaVar.d.isEmpty()) {
                jaVar.n.a();
            }
        }
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        f1 f1Var = this.y;
        Bitmap bitmap = f1Var.h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        SurfaceTexture surfaceTexture = this.a;
        ja jaVar = this.v;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        int i10 = 0;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                ok.u(this.b, new StringBuilder("eglGetDisplay failed "));
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
                        if (jaVar != null) {
                            synchronized (jaVar.f) {
                                try {
                                    eGLContext = jaVar.g;
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
                            if (BuildVars.LOGS_ENABLED) {
                                ok.u(this.b, new StringBuilder("eglCreateContext failed "));
                            }
                            finish();
                        } else {
                            if (jaVar != null) {
                                jaVar.a(eglCreateContext);
                                jaVar.e.add(this.x);
                            }
                            if (surfaceTexture != null) {
                                EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                this.e = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        ok.u(this.b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    s0 s0Var = f1Var.c;
                                    s0Var.getClass();
                                    Map map = h1.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : h1.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        g1 g1Var = new g1();
                                        g1Var.b = new HashMap();
                                        g1Var.a = GLES20.glCreateProgram();
                                        b2.q0 b10 = g1.b(35633, str);
                                        int i11 = b10.a;
                                        if (b10.b == 0) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.e("Vertex shader compilation failed");
                                            }
                                            g1.c(i11, i10, g1Var.a);
                                        } else {
                                            b2.q0 b11 = g1.b(35632, str2);
                                            int i12 = b11.a;
                                            if (b11.b == 0) {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.e("Fragment shader compilation failed");
                                                }
                                                g1.c(i11, i12, g1Var.a);
                                            } else {
                                                GLES20.glAttachShader(g1Var.a, i11);
                                                GLES20.glAttachShader(g1Var.a, i12);
                                                for (int i13 = 0; i13 < strArr.length; i13++) {
                                                    GLES20.glBindAttribLocation(g1Var.a, i13, strArr[i13]);
                                                }
                                                int i14 = g1Var.a;
                                                GLES20.glLinkProgram(i14);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                    FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                }
                                                if (iArr3[i10] == 0) {
                                                    g1.c(i11, i12, g1Var.a);
                                                } else {
                                                    for (String str3 : strArr2) {
                                                        g1Var.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(g1Var.a, str3)));
                                                    }
                                                    if (i11 != 0) {
                                                        GLES20.glDeleteShader(i11);
                                                    }
                                                    if (i12 != 0) {
                                                        GLES20.glDeleteShader(i12);
                                                    }
                                                }
                                            }
                                        }
                                        hashMap.put((String) entry.getKey(), g1Var);
                                        i10 = 0;
                                    }
                                    s0Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    uv0 uv0Var = s0Var.g;
                                    if (f1Var.h.getWidth() != uv0Var.a || f1Var.h.getHeight() != uv0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) uv0Var.a, (int) uv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(f1Var.h, (Rect) null, new RectF(0.0f, 0.0f, uv0Var.a, uv0Var.b), (Paint) null);
                                        f1Var.h = createBitmap;
                                        f1Var.r = true;
                                    }
                                    if (f1Var.n != null && (r5.getWidth() != uv0Var.a || f1Var.n.getHeight() != uv0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) uv0Var.a, (int) uv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(f1Var.n, (Rect) null, new RectF(0.0f, 0.0f, uv0Var.a, uv0Var.b), (Paint) null);
                                        f1Var.n = createBitmap2;
                                        f1Var.r = true;
                                    }
                                    Bitmap bitmap2 = f1Var.h;
                                    Bitmap bitmap3 = f1Var.n;
                                    if (s0Var.k == null) {
                                        s0Var.k = new u1(bitmap2);
                                    }
                                    if (s0Var.D == null) {
                                        s0Var.D = new u1(bitmap3);
                                    }
                                    if (s0Var.G && s0Var.l == null) {
                                        s0Var.l = new u1(s0Var.A);
                                    }
                                    n6.a();
                                    z10 = true;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        ok.u(this.b, new StringBuilder("eglMakeCurrent failed "));
                                    }
                                    finish();
                                }
                            } else {
                                finish();
                            }
                        }
                    } else {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("eglConfig not initialized");
                        }
                        finish();
                    }
                    z10 = false;
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        ok.u(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    ok.u(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }
}
