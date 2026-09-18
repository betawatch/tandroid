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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.vv0;
import w7.n6;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class c1 extends DispatchQueue {
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
    public final p8.b w;
    public final b1 x;
    public final /* synthetic */ e1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var, SurfaceTexture surfaceTexture, ja jaVar) {
        super("CanvasInternal");
        this.y = e1Var;
        this.w = new p8.b(this, 1);
        this.x = new b1(this, 0);
        this.v = jaVar;
        this.a = surfaceTexture;
    }

    public static void b(c1 c1Var) {
        if (c1Var.f) {
            if (c1Var.d.equals(c1Var.b.eglGetCurrentContext()) && c1Var.e.equals(c1Var.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = c1Var.b;
            EGLDisplay eGLDisplay = c1Var.c;
            EGLSurface eGLSurface = c1Var.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, c1Var.d);
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
        e1 e1Var = this.y;
        Bitmap bitmap = e1Var.h;
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
                wh.t(this.b, new StringBuilder("eglGetDisplay failed "));
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
                                wh.t(this.b, new StringBuilder("eglCreateContext failed "));
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
                                        wh.t(this.b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    s0 s0Var = e1Var.c;
                                    s0Var.getClass();
                                    Map map = g1.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : g1.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        f1 f1Var = new f1();
                                        f1Var.b = new HashMap();
                                        f1Var.a = GLES20.glCreateProgram();
                                        b2.q0 b10 = f1.b(35633, str);
                                        int i11 = b10.a;
                                        if (b10.b == 0) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.e("Vertex shader compilation failed");
                                            }
                                            f1.c(i11, i10, f1Var.a);
                                        } else {
                                            b2.q0 b11 = f1.b(35632, str2);
                                            int i12 = b11.a;
                                            if (b11.b == 0) {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.e("Fragment shader compilation failed");
                                                }
                                                f1.c(i11, i12, f1Var.a);
                                            } else {
                                                GLES20.glAttachShader(f1Var.a, i11);
                                                GLES20.glAttachShader(f1Var.a, i12);
                                                for (int i13 = 0; i13 < strArr.length; i13++) {
                                                    GLES20.glBindAttribLocation(f1Var.a, i13, strArr[i13]);
                                                }
                                                int i14 = f1Var.a;
                                                GLES20.glLinkProgram(i14);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                    FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                }
                                                if (iArr3[i10] == 0) {
                                                    f1.c(i11, i12, f1Var.a);
                                                } else {
                                                    for (String str3 : strArr2) {
                                                        f1Var.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(f1Var.a, str3)));
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
                                        hashMap.put((String) entry.getKey(), f1Var);
                                        i10 = 0;
                                    }
                                    s0Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    vv0 vv0Var = s0Var.g;
                                    if (e1Var.h.getWidth() != vv0Var.a || e1Var.h.getHeight() != vv0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) vv0Var.a, (int) vv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(e1Var.h, (Rect) null, new RectF(0.0f, 0.0f, vv0Var.a, vv0Var.b), (Paint) null);
                                        e1Var.h = createBitmap;
                                        e1Var.r = true;
                                    }
                                    if (e1Var.n != null && (r5.getWidth() != vv0Var.a || e1Var.n.getHeight() != vv0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) vv0Var.a, (int) vv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(e1Var.n, (Rect) null, new RectF(0.0f, 0.0f, vv0Var.a, vv0Var.b), (Paint) null);
                                        e1Var.n = createBitmap2;
                                        e1Var.r = true;
                                    }
                                    Bitmap bitmap2 = e1Var.h;
                                    Bitmap bitmap3 = e1Var.n;
                                    if (s0Var.k == null) {
                                        s0Var.k = new t1(bitmap2);
                                    }
                                    if (s0Var.D == null) {
                                        s0Var.D = new t1(bitmap3);
                                    }
                                    if (s0Var.G && s0Var.l == null) {
                                        s0Var.l = new t1(s0Var.A);
                                    }
                                    n6.a();
                                    z10 = true;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        wh.t(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                        wh.t(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    wh.t(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }
}
