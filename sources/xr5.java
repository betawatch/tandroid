// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xr5 extends uo3 {
    public static final /* synthetic */ int E = 0;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLConfig d;
    public EGLContext e;
    public EGLSurface f;
    public boolean h;
    public final int[] n;
    public float r;
    public long s;
    public final lq5 w;
    public final zz3 x;
    public final /* synthetic */ yr5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr5(yr5 yr5Var, SurfaceTexture surfaceTexture) {
        super("EGLThread", true);
        this.y = yr5Var;
        this.n = new int[24];
        this.w = new lq5((byte) 3);
        this.x = new zz3(this, (byte) 15);
        this.a = surfaceTexture;
    }

    public final void a(int i, int i2, int i3, boolean z) {
        Drawable drawable = this.y.getParentActivity().getResources().getDrawable(i);
        if (drawable instanceof BitmapDrawable) {
            int[] iArr = this.n;
            if (z) {
                GLES20.glDeleteTextures(1, iArr, i2);
                GLES20.glGenTextures(1, iArr, i2);
            }
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            GLES20.glBindTexture(3553, iArr[i2]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            if (i3 == 0) {
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(5);
            paint.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            GLUtils.texImage2D(3553, 0, createBitmap, 0);
            createBitmap.recycle();
        }
    }

    public final void b(nu4 nu4Var, int i, boolean z) {
        int[] iArr = this.n;
        if (z) {
            GLES20.glDeleteTextures(1, iArr, i);
            GLES20.glGenTextures(1, iArr, i);
        }
        Bitmap bitmap = (Bitmap) nu4Var.h(null);
        GLES20.glBindTexture(3553, iArr[i]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        bitmap.recycle();
    }

    public final void c() {
        int[] iArr = this.n;
        Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
    }

    public final void d() {
        int[] iArr = this.n;
        Intro.setTelegramTextures(iArr[22], iArr[21], iArr[23]);
    }

    public final void finish() {
        if (this.f != null) {
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.b.eglDestroySurface(this.c, this.f);
            this.f = null;
        }
        EGLContext eGLContext = this.e;
        if (eGLContext != null) {
            this.b.eglDestroyContext(this.c, eGLContext);
            this.e = null;
        }
        EGLDisplay eGLDisplay2 = this.c;
        if (eGLDisplay2 != null) {
            this.b.eglTerminate(eGLDisplay2);
            this.c = null;
        }
    }

    @Override // uo3, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (f11.a) {
                c00.w(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            yr5 yr5Var = this.y;
            if (!this.b.eglChooseConfig(this.c, c34.m(yr5Var.getParentActivity()).h() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (f11.a) {
                    c00.w(this.b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.d = eGLConfig;
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.e = eglCreateContext;
                if (eglCreateContext == null) {
                    if (f11.a) {
                        c00.w(this.b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, this.d, surfaceTexture, null);
                        this.f = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (f11.a) {
                                c00.w(this.b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.e)) {
                            int[] iArr2 = this.n;
                            GLES20.glGenTextures(23, iArr2, 0);
                            a(R.drawable.intro_fast_arrow_shadow, 0, 0, false);
                            a(R.drawable.intro_fast_arrow, 1, 0, false);
                            a(R.drawable.intro_fast_body, 2, 0, false);
                            a(R.drawable.intro_fast_spiral, 3, 0, false);
                            a(R.drawable.intro_ic_bubble_dot, 4, 0, false);
                            a(R.drawable.intro_ic_bubble, 5, 0, false);
                            a(R.drawable.intro_ic_cam_lens, 6, 0, false);
                            a(R.drawable.intro_ic_cam, 7, 0, false);
                            a(R.drawable.intro_ic_pencil, 8, 0, false);
                            a(R.drawable.intro_ic_pin, 9, 0, false);
                            a(R.drawable.intro_ic_smile_eye, 10, 0, false);
                            a(R.drawable.intro_ic_smile, 11, 0, false);
                            a(R.drawable.intro_ic_videocam, 12, 0, false);
                            a(R.drawable.intro_knot_down, 13, 0, false);
                            a(R.drawable.intro_knot_up, 14, 0, false);
                            a(R.drawable.intro_powerful_infinity_white, 15, 0, false);
                            a(R.drawable.intro_powerful_infinity, 16, 0, false);
                            a(R.drawable.intro_powerful_mask, 17, aob.w0(null, aob.d6, false), false);
                            a(R.drawable.intro_powerful_star, 18, 0, false);
                            a(R.drawable.intro_private_door, 19, 0, false);
                            a(R.drawable.intro_private_screw, 20, 0, false);
                            a(R.drawable.intro_tg_plane, 21, 0, false);
                            b(new lq5((byte) 4), 22, false);
                            b(this.w, 23, false);
                            d();
                            c();
                            Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                            Intro.setFreeTextures(iArr2[14], iArr2[13]);
                            Intro.setFastTextures(iArr2[2], iArr2[3], iArr2[1], iArr2[0]);
                            Intro.setIcTextures(iArr2[4], iArr2[5], iArr2[6], iArr2[7], iArr2[8], iArr2[9], iArr2[10], iArr2[11], iArr2[12]);
                            Intro.onSurfaceCreated();
                            yr5Var.K = System.currentTimeMillis() - 1000;
                            z = true;
                        } else {
                            if (f11.a) {
                                c00.w(this.b, new StringBuilder("eglMakeCurrent failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (f11.a) {
                    cc4.d("eglConfig not initialized");
                }
                finish();
            }
        } else {
            if (f11.a) {
                c00.w(this.b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        }
        this.h = z;
        super.run();
    }
}
