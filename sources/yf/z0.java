package yf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import h7.n8;
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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.z9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z0 extends DispatchQueue {
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public y0 s;
    public final z9 v;
    public final mu0 w;
    public final y0 x;
    public final /* synthetic */ b1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, SurfaceTexture surfaceTexture, z9 z9Var) {
        super("CanvasInternal");
        this.y = b1Var;
        this.w = new mu0(this, 9);
        this.x = new y0(this, 0);
        this.v = z9Var;
        this.a = surfaceTexture;
    }

    public static void b(z0 z0Var) {
        if (z0Var.f) {
            if (z0Var.d.equals(z0Var.b.eglGetCurrentContext()) && z0Var.e.equals(z0Var.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = z0Var.b;
            EGLDisplay eGLDisplay = z0Var.c;
            EGLSurface eGLSurface = z0Var.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, z0Var.d);
        }
    }

    public final void finish() {
        z9 z9Var = this.v;
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
            if (z9Var != null) {
                synchronized (z9Var.f) {
                    try {
                        if (z9Var.g == eGLContext) {
                            z9Var.g = null;
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
        if (z9Var != null) {
            y0 y0Var = this.x;
            ArrayList arrayList = z9Var.e;
            arrayList.remove(y0Var);
            if (arrayList.isEmpty() && z9Var.d.isEmpty()) {
                z9Var.n.a();
            }
        }
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        b1 b1Var = this.y;
        Bitmap bitmap = b1Var.h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        SurfaceTexture surfaceTexture = this.a;
        z9 z9Var = this.v;
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
                rl.r(this.b, new StringBuilder("eglGetDisplay failed "));
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
                        if (z9Var != null) {
                            synchronized (z9Var.f) {
                                try {
                                    eGLContext = z9Var.g;
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
                                rl.r(this.b, new StringBuilder("eglCreateContext failed "));
                            }
                            finish();
                        } else {
                            if (z9Var != null) {
                                z9Var.a(eglCreateContext);
                                z9Var.e.add(this.x);
                            }
                            if (surfaceTexture != null) {
                                EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                this.e = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        rl.r(this.b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    p0 p0Var = b1Var.c;
                                    p0Var.getClass();
                                    Map map = d1.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : d1.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        c1 c1Var = new c1();
                                        c1Var.b = new HashMap();
                                        c1Var.a = GLES20.glCreateProgram();
                                        d5.p b10 = c1.b(35633, str);
                                        int i11 = b10.a;
                                        if (b10.b == 0) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.e("Vertex shader compilation failed");
                                            }
                                            c1.c(i11, i10, c1Var.a);
                                        } else {
                                            d5.p b11 = c1.b(35632, str2);
                                            int i12 = b11.a;
                                            if (b11.b == 0) {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.e("Fragment shader compilation failed");
                                                }
                                                c1.c(i11, i12, c1Var.a);
                                            } else {
                                                GLES20.glAttachShader(c1Var.a, i11);
                                                GLES20.glAttachShader(c1Var.a, i12);
                                                for (int i13 = 0; i13 < strArr.length; i13++) {
                                                    GLES20.glBindAttribLocation(c1Var.a, i13, strArr[i13]);
                                                }
                                                int i14 = c1Var.a;
                                                GLES20.glLinkProgram(i14);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                    FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                }
                                                if (iArr3[i10] == 0) {
                                                    c1.c(i11, i12, c1Var.a);
                                                } else {
                                                    for (String str3 : strArr2) {
                                                        c1Var.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(c1Var.a, str3)));
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
                                        hashMap.put((String) entry.getKey(), c1Var);
                                        i10 = 0;
                                    }
                                    p0Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    tu0 tu0Var = p0Var.g;
                                    if (b1Var.h.getWidth() != tu0Var.a || b1Var.h.getHeight() != tu0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) tu0Var.a, (int) tu0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(b1Var.h, (Rect) null, new RectF(0.0f, 0.0f, tu0Var.a, tu0Var.b), (Paint) null);
                                        b1Var.h = createBitmap;
                                        b1Var.r = true;
                                    }
                                    if (b1Var.n != null && (r5.getWidth() != tu0Var.a || b1Var.n.getHeight() != tu0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) tu0Var.a, (int) tu0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(b1Var.n, (Rect) null, new RectF(0.0f, 0.0f, tu0Var.a, tu0Var.b), (Paint) null);
                                        b1Var.n = createBitmap2;
                                        b1Var.r = true;
                                    }
                                    Bitmap bitmap2 = b1Var.h;
                                    Bitmap bitmap3 = b1Var.n;
                                    if (p0Var.k == null) {
                                        p0Var.k = new q1(bitmap2);
                                    }
                                    if (p0Var.D == null) {
                                        p0Var.D = new q1(bitmap3);
                                    }
                                    if (p0Var.G && p0Var.l == null) {
                                        p0Var.l = new q1(p0Var.A);
                                    }
                                    n8.a();
                                    z10 = true;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        rl.r(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                        rl.r(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    rl.r(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }
}
