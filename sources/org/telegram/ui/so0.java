package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class so0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.z51, org.telegram.ui.Components.j61, org.telegram.ui.Components.qd0, wi.l {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ so0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // wi.l
    public void D(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.a;
        photoViewer.S8 = false;
        try {
            vq0 vq0Var = photoViewer.h0;
            if (vq0Var != null && vq0Var.getParent() == null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.h0, photoViewer.e0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.E2) {
            org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
            if (i61Var != null) {
                i61Var.A0(null);
                photoViewer.G2.z0(photoViewer.D2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.C2;
        if (textureView == null || photoViewer.z2 == null) {
            return;
        }
        textureView.setSurfaceTexture(surfaceTexture);
        org.telegram.messenger.g0.E2(photoViewer.C2);
        photoViewer.z2.addView(photoViewer.C2, 0, c8.ma.e(-1, -1, 17));
    }

    @Override // wi.l
    public View E() {
        if (m()) {
            return this.a.g0.getWebView();
        }
        return null;
    }

    @Override // wi.l
    public boolean G() {
        vq0 vq0Var;
        PhotoViewer photoViewer = PhotoViewer.f9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer != photoViewer2 || !photoViewer2.e || photoViewer2.J3 || photoViewer2.S8 || (vq0Var = photoViewer2.h0) == null || vq0Var.getParent() == null) {
            return false;
        }
        PhotoViewer photoViewer3 = this.a;
        return !photoViewer3.B3 && photoViewer3.n4 == 0;
    }

    @Override // wi.l
    public void H() {
        this.a.c4.cancelRewind();
    }

    @Override // wi.l
    public int J() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.a;
        if (m10) {
            return photoViewer.g0.getEmbedWidth();
        }
        org.telegram.ui.Components.ue0 ue0Var = photoViewer.z2;
        return (ue0Var == null || ue0Var.getAspectRatio() <= 0.0f) ? photoViewer.V : Math.round(photoViewer.z2.getAspectRatio() * 1000.0f);
    }

    @Override // wi.l
    public void L(float f10) {
        this.a.c4.setX(f10);
    }

    @Override // wi.l
    public boolean N() {
        PhotoViewer photoViewer = this.a;
        return photoViewer.s2 && h() && !photoViewer.t4;
    }

    @Override // wi.l
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // wi.l
    public e2.c1 Q() {
        org.telegram.ui.Components.i61 i61Var;
        if (m() || (i61Var = this.a.G2) == null) {
            return null;
        }
        return i61Var.d;
    }

    @Override // wi.l
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // wi.l
    public void U() {
        this.a.P8 = null;
        PhotoViewer photoViewer = PhotoViewer.g9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.f9;
        PhotoViewer photoViewer4 = this.a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.S8) {
                photoViewer4.S8 = false;
                try {
                    vq0 vq0Var = photoViewer4.h0;
                    if (vq0Var != null && vq0Var.getParent() == null) {
                        WindowManager windowManager = (WindowManager) this.a.E.getSystemService("window");
                        PhotoViewer photoViewer5 = this.a;
                        windowManager.addView(photoViewer5.h0, photoViewer5.e0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.a.z0(false, false);
        }
    }

    @Override // wi.l
    public boolean V(boolean z10, float f10, org.telegram.ui.Components.fn0 fn0Var) {
        boolean m10 = m();
        PhotoViewer photoViewer = this.a;
        if (m10) {
            photoViewer.c4.startRewind(photoViewer.g0, z10, f10, photoViewer.u1, fn0Var);
            return true;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var == null) {
            return false;
        }
        photoViewer.c4.startRewind(i61Var, z10, f10, photoViewer.u1, fn0Var);
        return true;
    }

    @Override // wi.l
    public void Z() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J3) {
            if (PhotoViewer.f9 != null) {
                PhotoViewer.f9.z0(false, true);
            }
            dq0 dq0Var = photoViewer.g0;
            if (dq0Var != null && dq0Var.f != null) {
                if (org.telegram.messenger.t0.x) {
                    try {
                        dq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                dq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) dq0Var.f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(dq0Var.f);
                }
                dq0Var.addView(dq0Var.f, 0, c8.ma.e(-1, -1, 51));
                wi.n nVar = dq0Var.b.P8;
                if (nVar != null) {
                    nVar.a(new fi.e(22));
                }
            }
            PhotoViewer.f9 = PhotoViewer.g9;
            PhotoViewer.g9 = null;
            if (photoViewer.g0 == null) {
                photoViewer.L3 = true;
                Bitmap bitmap = photoViewer.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer.C3 = null;
                }
                photoViewer.F3 = true;
            }
            photoViewer.J3 = false;
            View view = photoViewer.E2 ? photoViewer.D2 : photoViewer.C2;
            if (photoViewer.g0 == null && view != null) {
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.z2.addView(view);
            }
            if (org.telegram.messenger.t0.x) {
                try {
                    photoViewer.E.startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.g0 != null) {
                photoViewer.m6 = 0.0f;
            } else if (view != null) {
                photoViewer.B3 = true;
                org.telegram.ui.Components.aj0 s12 = photoViewer.s1(false);
                float f10 = s12.c / photoViewer.x3.getLayoutParams().width;
                photoViewer.x3.setScaleX(f10);
                photoViewer.x3.setScaleY(f10);
                photoViewer.x3.setTranslationX(s12.a);
                photoViewer.x3.setTranslationY(s12.b);
                view.setScaleX(f10);
                view.setScaleY(f10);
                view.setTranslationX(s12.a - photoViewer.z2.getX());
                view.setTranslationY(s12.b - photoViewer.z2.getY());
                pq0 pq0Var = photoViewer.F2;
                if (pq0Var != null) {
                    pq0Var.setScaleX(f10);
                    photoViewer.F2.setScaleY(f10);
                    photoViewer.F2.setTranslationX(view.getTranslationX());
                    photoViewer.F2.setTranslationY(view.getTranslationY());
                }
                photoViewer.X = 0.0f;
                gp0 gp0Var = new gp0(photoViewer, f10, 1);
                view.setOutlineProvider(gp0Var);
                view.setClipToOutline(true);
                photoViewer.x3.setOutlineProvider(gp0Var);
                photoViewer.x3.setClipToOutline(true);
                pq0 pq0Var2 = photoViewer.F2;
                if (pq0Var2 != null) {
                    pq0Var2.setOutlineProvider(gp0Var);
                    photoViewer.F2.setClipToOutline(true);
                }
            }
            try {
                photoViewer.e = true;
                photoViewer.f = true;
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.h0, photoViewer.e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).a1.add(photoViewer.t1);
                }
                wq0 wq0Var = photoViewer.d5;
                if (wq0Var != null && !wq0Var.s) {
                    wq0Var.a.O0(false, false);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (!photoViewer.E2) {
                photoViewer.v3 = 4;
                return;
            }
            l2.f0 f0Var = photoViewer.G2.d;
            if (f0Var != null) {
                f0Var.z1(null);
            }
            photoViewer.G2.z0(photoViewer.D2);
            photoViewer.D2.setVisibility(4);
            photoViewer.G3 = 2;
            photoViewer.F3 = false;
            photoViewer.f0.invalidate();
            photoViewer.v3 = 4;
        }
    }

    @Override // org.telegram.ui.Components.j61
    public void a(float f10) {
        dq0 dq0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.G2 != null || ((dq0Var = photoViewer.g0) != null && dq0Var.y)) {
            if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
                f10 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f10) + photoViewer.S7.getLeftProgress();
            }
            if (photoViewer.x1() == -9223372036854775807L) {
                photoViewer.a3 = f10;
            } else {
                photoViewer.r2((int) (f10 * r1));
            }
            photoViewer.Z2(false);
            photoViewer.u3 = false;
        }
    }

    @Override // wi.l
    public int a0() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.a;
        if (m10) {
            return photoViewer.g0.getEmbedHeight();
        }
        org.telegram.ui.Components.ue0 ue0Var = photoViewer.z2;
        if (ue0Var == null || ue0Var.getAspectRatio() <= 0.0f) {
            return photoViewer.W;
        }
        return 1000;
    }

    @Override // wi.l
    public void b() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.a;
        if (m10) {
            photoViewer.g0.f();
            return;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            i61Var.g0();
        }
    }

    @Override // wi.l
    public float b0() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.a;
        if (m10) {
            return photoViewer.g0.getBufferedPosition();
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        return (i61Var == null || i61Var.U() <= 0) ? photoViewer.R8 : Math.max(photoViewer.R8, photoViewer.G2.K() / photoViewer.G2.U());
    }

    @Override // wi.l
    public void c(long j3) {
        boolean m10 = m();
        PhotoViewer photoViewer = this.a;
        if (m10) {
            photoViewer.g0.i(j3);
            return;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            i61Var.p0(j3);
        }
    }

    @Override // wi.l
    public /* synthetic */ int e() {
        return 0;
    }

    @Override // wi.l
    public void f() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.a;
        if (m10) {
            photoViewer.g0.g();
            return;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            i61Var.h0();
        }
    }

    @Override // org.telegram.ui.Components.j61
    public void g(float f10) {
        kp0 kp0Var;
        kp0 kp0Var2;
        PhotoViewer photoViewer = this.a;
        dq0 dq0Var = photoViewer.g0;
        if (dq0Var != null && dq0Var.y && (kp0Var2 = photoViewer.s3) != null) {
            int i7 = photoViewer.q3.h - org.telegram.ui.Components.k61.S;
            kp0Var2.O = dq0Var;
            if (kp0Var2.a0 != 0) {
                kp0Var2.a0 = 0L;
                kp0Var2.g0 = null;
                kp0Var2.f0 = null;
                kp0Var2.e0 = null;
                kp0Var2.b(-1);
            }
            if (i7 != 0) {
                kp0Var2.r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (kp0Var2.n != i10) {
                    kp0Var2.n = i10;
                }
            }
            kp0Var2.E = org.telegram.messenger.g0.g0((int) (((long) (dq0Var.getVideoDuration() * f10)) / 1000), false, false);
            kp0Var2.F = (int) Math.ceil(kp0Var2.G.measureText(r0));
            kp0Var2.invalidate();
            if (kp0Var2.f != null) {
                Utilities.e.a(kp0Var2.f);
            }
            double videoDuration = (f10 * dq0Var.getVideoDuration()) / 1000.0d;
            kp0Var2.P = videoDuration;
            String c10 = dq0Var.c((int) videoDuration);
            if (c10 != null) {
                kp0Var2.R.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (kp0Var = photoViewer.s3) != null) {
            kp0Var.e(photoViewer.T4, f10, photoViewer.q3.h - org.telegram.ui.Components.k61.S);
        }
        this.a.Z2(true);
        PhotoViewer.Q(this.a);
    }

    @Override // wi.l
    public long getDuration() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.a;
        if (m10) {
            return photoViewer.g0.getVideoDuration();
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            return i61Var.U();
        }
        return 0L;
    }

    @Override // wi.l
    public boolean h() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.a;
        if (m10) {
            return photoViewer.g0.H;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        return i61Var != null && i61Var.d0();
    }

    @Override // wi.l
    public void i(wi.o oVar) {
        PhotoViewer photoViewer = this.a;
        photoViewer.S8 = true;
        if (photoViewer.E2) {
            org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
            if (i61Var != null) {
                i61Var.z0(null);
                photoViewer.G2.A0(null);
                photoViewer.G2.A0(oVar);
            }
        } else {
            TextureView textureView = photoViewer.C2;
            if (textureView != null) {
                photoViewer.Q8 = oVar;
                org.telegram.messenger.g0.E2(textureView);
                photoViewer.Q8 = null;
            }
        }
        try {
            vq0 vq0Var = photoViewer.h0;
            if (vq0Var == null || vq0Var.getParent() == null) {
                return;
            }
            ((WindowManager) photoViewer.E.getSystemService("window")).removeViewImmediate(photoViewer.h0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.z51
    public void invalidate() {
        this.a.f0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void j() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            photoViewer.q2();
        }
    }

    @Override // wi.l
    public void j0(Canvas canvas, int i7, int i10) {
        this.a.b4.draw(canvas, i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void k() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            org.telegram.messenger.g0.r(photoViewer.y2);
        }
    }

    @Override // wi.l
    public long l() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.a;
        if (m10) {
            return photoViewer.g0.getCurrentPosition();
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            return i61Var.S();
        }
        return 0L;
    }

    public boolean m() {
        PhotoViewer photoViewer = this.a;
        return photoViewer.t4 && photoViewer.g0 != null;
    }

    public void n(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.W0.isClickable() != z11) {
            photoViewer.W0.setClickable(z11);
            photoViewer.W0.setVisibility(0);
            photoViewer.W0.clearAnimation();
            photoViewer.W0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.nr.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.rp0(11, photoViewer, z11));
        }
    }

    public void o() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var == null) {
            return;
        }
        i61Var.p0((long) (i61Var.U() * photoViewer.w8));
        photoViewer.G2.g0();
        photoViewer.S7.setProgress(photoViewer.w8);
        photoViewer.n0();
        hf0 hf0Var = new hf0(this, 22);
        photoViewer.I2 = hf0Var;
        org.telegram.messenger.g0.h3(hf0Var, 860L);
    }

    @Override // wi.l
    public boolean o0() {
        return !m() || this.a.g0.y;
    }

    @Override // wi.l
    public boolean p() {
        if (!m()) {
            return true;
        }
        dq0 dq0Var = this.a.g0;
        return (dq0Var.y && "inapp".equals(org.telegram.messenger.mp.u1(dq0Var.a).D3)) ? false : true;
    }

    @Override // wi.l
    public boolean s() {
        return this.a.c4.rewinding;
    }

    @Override // wi.l
    public void u(Rect rect) {
        qq0 qq0Var;
        PhotoViewer photoViewer = this.a;
        RectF rectF = photoViewer.T8;
        if (!photoViewer.U8 || (qq0Var = photoViewer.f0) == null || !qq0Var.isAttachedToWindow()) {
            rect.setEmpty();
            return;
        }
        photoViewer.f0.getLocationOnScreen(new int[2]);
        rect.set(Math.round(rectF.left + r2[0]), Math.round(rectF.top + r2[1]), Math.round(rectF.right + r2[0]), Math.round(rectF.bottom + r2[1]));
    }

    @Override // wi.l
    public /* synthetic */ View v(LaunchActivity launchActivity) {
        return null;
    }

    @Override // wi.l
    public /* synthetic */ void B(View view) {
    }

    @Override // wi.l
    public /* synthetic */ void X(View view) {
    }

    @Override // wi.l
    public /* synthetic */ void d(View view) {
    }

    @Override // wi.l
    public /* synthetic */ void p0(int i7) {
    }

    @Override // wi.l
    public /* synthetic */ void w(View view) {
    }

    @Override // wi.l
    public /* synthetic */ void h0(int i7, ArrayList arrayList) {
    }
}
