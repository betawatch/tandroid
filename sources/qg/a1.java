package qg;

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
import org.telegram.messenger.vl;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ja;
import w7.u6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class a1 extends DispatchQueue {
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public z0 s;
    public final ja v;
    public final l7 w;
    public final z0 x;
    public final /* synthetic */ c1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, SurfaceTexture surfaceTexture, ja jaVar) {
        super("CanvasInternal");
        this.y = c1Var;
        this.w = new l7(this, 29);
        this.x = new z0(this, 0);
        this.v = jaVar;
        this.a = surfaceTexture;
    }

    public static void b(a1 a1Var) {
        if (a1Var.f) {
            if (a1Var.d.equals(a1Var.b.eglGetCurrentContext()) && a1Var.e.equals(a1Var.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = a1Var.b;
            EGLDisplay eGLDisplay = a1Var.c;
            EGLSurface eGLSurface = a1Var.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, a1Var.d);
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
            z0 z0Var = this.x;
            ArrayList arrayList = jaVar.e;
            arrayList.remove(z0Var);
            if (arrayList.isEmpty() && jaVar.d.isEmpty()) {
                jaVar.n.a();
            }
        }
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        c1 c1Var = this.y;
        Bitmap bitmap = c1Var.h;
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
                vl.s(this.b, new StringBuilder("eglGetDisplay failed "));
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
                                vl.s(this.b, new StringBuilder("eglCreateContext failed "));
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
                                        vl.s(this.b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    q0 q0Var = c1Var.c;
                                    q0Var.getClass();
                                    Map map = e1.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : e1.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        d1 d1Var = new d1();
                                        d1Var.b = new HashMap();
                                        d1Var.a = GLES20.glCreateProgram();
                                        b2.q0 b10 = d1.b(35633, str);
                                        int i11 = b10.a;
                                        if (b10.b == 0) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.e("Vertex shader compilation failed");
                                            }
                                            d1.c(i11, i10, d1Var.a);
                                        } else {
                                            b2.q0 b11 = d1.b(35632, str2);
                                            int i12 = b11.a;
                                            if (b11.b == 0) {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.e("Fragment shader compilation failed");
                                                }
                                                d1.c(i11, i12, d1Var.a);
                                            } else {
                                                GLES20.glAttachShader(d1Var.a, i11);
                                                GLES20.glAttachShader(d1Var.a, i12);
                                                for (int i13 = 0; i13 < strArr.length; i13++) {
                                                    GLES20.glBindAttribLocation(d1Var.a, i13, strArr[i13]);
                                                }
                                                int i14 = d1Var.a;
                                                GLES20.glLinkProgram(i14);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                    FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                }
                                                if (iArr3[i10] == 0) {
                                                    d1.c(i11, i12, d1Var.a);
                                                } else {
                                                    for (String str3 : strArr2) {
                                                        d1Var.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(d1Var.a, str3)));
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
                                        hashMap.put((String) entry.getKey(), d1Var);
                                        i10 = 0;
                                    }
                                    q0Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    iv0 iv0Var = q0Var.g;
                                    if (c1Var.h.getWidth() != iv0Var.a || c1Var.h.getHeight() != iv0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) iv0Var.a, (int) iv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(c1Var.h, (Rect) null, new RectF(0.0f, 0.0f, iv0Var.a, iv0Var.b), (Paint) null);
                                        c1Var.h = createBitmap;
                                        c1Var.r = true;
                                    }
                                    if (c1Var.n != null && (r5.getWidth() != iv0Var.a || c1Var.n.getHeight() != iv0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) iv0Var.a, (int) iv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(c1Var.n, (Rect) null, new RectF(0.0f, 0.0f, iv0Var.a, iv0Var.b), (Paint) null);
                                        c1Var.n = createBitmap2;
                                        c1Var.r = true;
                                    }
                                    Bitmap bitmap2 = c1Var.h;
                                    Bitmap bitmap3 = c1Var.n;
                                    if (q0Var.k == null) {
                                        q0Var.k = new r1(bitmap2);
                                    }
                                    if (q0Var.D == null) {
                                        q0Var.D = new r1(bitmap3);
                                    }
                                    if (q0Var.G && q0Var.l == null) {
                                        q0Var.l = new r1(q0Var.A);
                                    }
                                    u6.a();
                                    z10 = true;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        vl.s(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                        vl.s(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    vl.s(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }
}
