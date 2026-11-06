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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class qo0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.d51, org.telegram.ui.Components.p51, org.telegram.ui.Components.ed0, ti.m {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ qo0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // ti.m
    public void C(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.a;
        photoViewer.R8 = false;
        try {
            uq0 uq0Var = photoViewer.g0;
            if (uq0Var != null && uq0Var.getParent() == null) {
                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.D2) {
            org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
            if (n51Var != null) {
                n51Var.A0(null);
                photoViewer.F2.z0(photoViewer.C2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.B2;
        if (textureView == null || photoViewer.y2 == null) {
            return;
        }
        textureView.setSurfaceTexture(surfaceTexture);
        org.telegram.messenger.g0.E2(photoViewer.B2);
        photoViewer.y2.addView(photoViewer.B2, 0, c8.ha.e(-1, -1, 17));
    }

    @Override // ti.m
    public View D() {
        if (k()) {
            return this.a.f0.getWebView();
        }
        return null;
    }

    @Override // ti.m
    public boolean E() {
        uq0 uq0Var;
        PhotoViewer photoViewer = PhotoViewer.e9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer != photoViewer2 || !photoViewer2.e || photoViewer2.I3 || photoViewer2.R8 || (uq0Var = photoViewer2.g0) == null || uq0Var.getParent() == null) {
            return false;
        }
        PhotoViewer photoViewer3 = this.a;
        return !photoViewer3.A3 && photoViewer3.m4 == 0;
    }

    @Override // ti.m
    public void F() {
        this.a.b4.cancelRewind();
    }

    @Override // ti.m
    public int I() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.a;
        if (k10) {
            return photoViewer.f0.getEmbedWidth();
        }
        org.telegram.ui.Components.fe0 fe0Var = photoViewer.y2;
        return (fe0Var == null || fe0Var.getAspectRatio() <= 0.0f) ? photoViewer.U : Math.round(photoViewer.y2.getAspectRatio() * 1000.0f);
    }

    @Override // ti.m
    public void J(float f10) {
        this.a.b4.setX(f10);
    }

    @Override // ti.m
    public boolean K() {
        PhotoViewer photoViewer = this.a;
        return photoViewer.r2 && h() && !photoViewer.s4;
    }

    @Override // ti.m
    public /* synthetic */ boolean L() {
        return false;
    }

    @Override // ti.m
    public e2.c1 M() {
        org.telegram.ui.Components.n51 n51Var;
        if (k() || (n51Var = this.a.F2) == null) {
            return null;
        }
        return n51Var.d;
    }

    @Override // ti.m
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // ti.m
    public void Q() {
        this.a.O8 = null;
        PhotoViewer photoViewer = PhotoViewer.f9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.e9;
        PhotoViewer photoViewer4 = this.a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.R8) {
                photoViewer4.R8 = false;
                try {
                    uq0 uq0Var = photoViewer4.g0;
                    if (uq0Var != null && uq0Var.getParent() == null) {
                        WindowManager windowManager = (WindowManager) this.a.D.getSystemService("window");
                        PhotoViewer photoViewer5 = this.a;
                        windowManager.addView(photoViewer5.g0, photoViewer5.d0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.a.z0(false, false);
        }
    }

    @Override // ti.m
    public boolean R(boolean z9, float f10, org.telegram.ui.Components.qm0 qm0Var) {
        boolean k10 = k();
        PhotoViewer photoViewer = this.a;
        if (k10) {
            photoViewer.b4.startRewind(photoViewer.f0, z9, f10, photoViewer.t1, qm0Var);
            return true;
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var == null) {
            return false;
        }
        photoViewer.b4.startRewind(n51Var, z9, f10, photoViewer.t1, qm0Var);
        return true;
    }

    @Override // ti.m
    public void T() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.I3) {
            if (PhotoViewer.e9 != null) {
                PhotoViewer.e9.z0(false, true);
            }
            bq0 bq0Var = photoViewer.f0;
            if (bq0Var != null && bq0Var.f != null) {
                if (org.telegram.messenger.t0.x) {
                    try {
                        bq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                bq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) bq0Var.f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(bq0Var.f);
                }
                bq0Var.addView(bq0Var.f, 0, c8.ha.e(-1, -1, 51));
                ti.o oVar = bq0Var.b.O8;
                if (oVar != null) {
                    oVar.a(new di.e(21));
                }
            }
            PhotoViewer.e9 = PhotoViewer.f9;
            PhotoViewer.f9 = null;
            if (photoViewer.f0 == null) {
                photoViewer.K3 = true;
                Bitmap bitmap = photoViewer.B3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer.B3 = null;
                }
                photoViewer.E3 = true;
            }
            photoViewer.I3 = false;
            View view = photoViewer.D2 ? photoViewer.C2 : photoViewer.B2;
            if (photoViewer.f0 == null && view != null) {
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.y2.addView(view);
            }
            if (org.telegram.messenger.t0.x) {
                try {
                    photoViewer.D.startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.f0 != null) {
                photoViewer.l6 = 0.0f;
            } else if (view != null) {
                photoViewer.A3 = true;
                org.telegram.ui.Components.ki0 s12 = photoViewer.s1(false);
                float f10 = s12.c / photoViewer.w3.getLayoutParams().width;
                photoViewer.w3.setScaleX(f10);
                photoViewer.w3.setScaleY(f10);
                photoViewer.w3.setTranslationX(s12.a);
                photoViewer.w3.setTranslationY(s12.b);
                view.setScaleX(f10);
                view.setScaleY(f10);
                view.setTranslationX(s12.a - photoViewer.y2.getX());
                view.setTranslationY(s12.b - photoViewer.y2.getY());
                nq0 nq0Var = photoViewer.E2;
                if (nq0Var != null) {
                    nq0Var.setScaleX(f10);
                    photoViewer.E2.setScaleY(f10);
                    photoViewer.E2.setTranslationX(view.getTranslationX());
                    photoViewer.E2.setTranslationY(view.getTranslationY());
                }
                photoViewer.W = 0.0f;
                ep0 ep0Var = new ep0(photoViewer, f10, 1);
                view.setOutlineProvider(ep0Var);
                view.setClipToOutline(true);
                photoViewer.w3.setOutlineProvider(ep0Var);
                photoViewer.w3.setClipToOutline(true);
                nq0 nq0Var2 = photoViewer.E2;
                if (nq0Var2 != null) {
                    nq0Var2.setOutlineProvider(ep0Var);
                    photoViewer.E2.setClipToOutline(true);
                }
            }
            try {
                photoViewer.e = true;
                photoViewer.f = true;
                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
                Activity activity = photoViewer.D;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).Z0.add(photoViewer.s1);
                }
                vq0 vq0Var = photoViewer.c5;
                if (vq0Var != null && !vq0Var.s) {
                    vq0Var.a.O0(false, false);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (!photoViewer.D2) {
                photoViewer.u3 = 4;
                return;
            }
            l2.i0 i0Var = photoViewer.F2.d;
            if (i0Var != null) {
                i0Var.z1(null);
            }
            photoViewer.F2.z0(photoViewer.C2);
            photoViewer.C2.setVisibility(4);
            photoViewer.F3 = 2;
            photoViewer.E3 = false;
            photoViewer.e0.invalidate();
            photoViewer.u3 = 4;
        }
    }

    @Override // ti.m
    public int U() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.a;
        if (k10) {
            return photoViewer.f0.getEmbedHeight();
        }
        org.telegram.ui.Components.fe0 fe0Var = photoViewer.y2;
        if (fe0Var == null || fe0Var.getAspectRatio() <= 0.0f) {
            return photoViewer.V;
        }
        return 1000;
    }

    @Override // ti.m
    public float V() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.a;
        if (k10) {
            return photoViewer.f0.getBufferedPosition();
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        return (n51Var == null || n51Var.U() <= 0) ? photoViewer.Q8 : Math.max(photoViewer.Q8, photoViewer.F2.K() / photoViewer.F2.U());
    }

    @Override // org.telegram.ui.Components.p51
    public void a(float f10) {
        bq0 bq0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((bq0Var = photoViewer.f0) != null && bq0Var.y)) {
            if (!photoViewer.A8 && photoViewer.Q7.getVisibility() == 0) {
                f10 = ((photoViewer.R7.getRightProgress() - photoViewer.R7.getLeftProgress()) * f10) + photoViewer.R7.getLeftProgress();
            }
            if (photoViewer.x1() == -9223372036854775807L) {
                photoViewer.Z2 = f10;
            } else {
                photoViewer.q2((int) (f10 * r1));
            }
            photoViewer.Y2(false);
            photoViewer.t3 = false;
        }
    }

    @Override // ti.m
    public void b() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.a;
        if (k10) {
            photoViewer.f0.f();
            return;
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null) {
            n51Var.g0();
        }
    }

    @Override // ti.m
    public void c(long j3) {
        boolean k10 = k();
        PhotoViewer photoViewer = this.a;
        if (k10) {
            photoViewer.f0.i(j3);
            return;
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null) {
            n51Var.p0(j3);
        }
    }

    @Override // ti.m
    public void c0(Canvas canvas, int i7, int i10) {
        this.a.a4.draw(canvas, i7, i10);
    }

    @Override // org.telegram.ui.Components.p51
    public void d(float f10) {
        ip0 ip0Var;
        ip0 ip0Var2;
        PhotoViewer photoViewer = this.a;
        bq0 bq0Var = photoViewer.f0;
        if (bq0Var != null && bq0Var.y && (ip0Var2 = photoViewer.r3) != null) {
            int i7 = photoViewer.p3.h - org.telegram.ui.Components.q51.S;
            ip0Var2.N = bq0Var;
            if (ip0Var2.W != 0) {
                ip0Var2.W = 0L;
                ip0Var2.f0 = null;
                ip0Var2.e0 = null;
                ip0Var2.d0 = null;
                ip0Var2.b(-1);
            }
            if (i7 != 0) {
                ip0Var2.r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (ip0Var2.n != i10) {
                    ip0Var2.n = i10;
                }
            }
            ip0Var2.D = org.telegram.messenger.g0.g0((int) (((long) (bq0Var.getVideoDuration() * f10)) / 1000), false, false);
            ip0Var2.E = (int) Math.ceil(ip0Var2.F.measureText(r0));
            ip0Var2.invalidate();
            if (ip0Var2.f != null) {
                Utilities.e.a(ip0Var2.f);
            }
            double videoDuration = (f10 * bq0Var.getVideoDuration()) / 1000.0d;
            ip0Var2.O = videoDuration;
            String c10 = bq0Var.c((int) videoDuration);
            if (c10 != null) {
                ip0Var2.Q.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ip0Var = photoViewer.r3) != null) {
            ip0Var.e(photoViewer.S4, f10, photoViewer.p3.h - org.telegram.ui.Components.q51.S);
        }
        this.a.Y2(true);
        PhotoViewer.P(this.a);
    }

    @Override // ti.m
    public boolean e0() {
        return !k() || this.a.f0.y;
    }

    @Override // ti.m
    public void f() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.a;
        if (k10) {
            photoViewer.f0.g();
            return;
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null) {
            n51Var.h0();
        }
    }

    @Override // ti.m
    public void g(ti.q qVar) {
        PhotoViewer photoViewer = this.a;
        photoViewer.R8 = true;
        if (photoViewer.D2) {
            org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
            if (n51Var != null) {
                n51Var.z0(null);
                photoViewer.F2.A0(null);
                photoViewer.F2.A0(qVar);
            }
        } else {
            TextureView textureView = photoViewer.B2;
            if (textureView != null) {
                photoViewer.P8 = qVar;
                org.telegram.messenger.g0.E2(textureView);
                photoViewer.P8 = null;
            }
        }
        try {
            uq0 uq0Var = photoViewer.g0;
            if (uq0Var == null || uq0Var.getParent() == null) {
                return;
            }
            ((WindowManager) photoViewer.D.getSystemService("window")).removeViewImmediate(photoViewer.g0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // ti.m
    public long getDuration() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.a;
        if (k10) {
            return photoViewer.f0.getVideoDuration();
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null) {
            return n51Var.U();
        }
        return 0L;
    }

    @Override // ti.m
    public boolean h() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.a;
        if (k10) {
            return photoViewer.f0.G;
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        return n51Var != null && n51Var.d0();
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void i() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.k3 && photoViewer.O3) {
            photoViewer.p2();
        }
    }

    @Override // org.telegram.ui.Components.d51
    public void invalidate() {
        this.a.e0.invalidate();
    }

    @Override // ti.m
    public /* synthetic */ int j() {
        return 0;
    }

    public boolean k() {
        PhotoViewer photoViewer = this.a;
        return photoViewer.s4 && photoViewer.f0 != null;
    }

    @Override // ti.m
    public long l() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.a;
        if (k10) {
            return photoViewer.f0.getCurrentPosition();
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null) {
            return n51Var.S();
        }
        return 0L;
    }

    public void m(boolean z9) {
        boolean z10 = !z9;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.V0.isClickable() != z10) {
            photoViewer.V0.setClickable(z10);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            photoViewer.V0.animate().alpha(!z9 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.xq.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.tp0(10, photoViewer, z10));
        }
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void n() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.k3 && photoViewer.O3) {
            org.telegram.messenger.g0.r(photoViewer.x2);
        }
    }

    public void o() {
        PhotoViewer photoViewer = this.a;
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var == null) {
            return;
        }
        n51Var.p0((long) (n51Var.U() * photoViewer.v8));
        photoViewer.F2.g0();
        photoViewer.R7.setProgress(photoViewer.v8);
        photoViewer.n0();
        ef0 ef0Var = new ef0(this, 22);
        photoViewer.H2 = ef0Var;
        org.telegram.messenger.g0.i3(ef0Var, 860L);
    }

    @Override // ti.m
    public boolean r() {
        if (!k()) {
            return true;
        }
        bq0 bq0Var = this.a.f0;
        return (bq0Var.y && "inapp".equals(org.telegram.messenger.qp.s1(bq0Var.a).A3)) ? false : true;
    }

    @Override // ti.m
    public boolean u() {
        return this.a.b4.rewinding;
    }

    @Override // ti.m
    public void v(Rect rect) {
        oq0 oq0Var;
        PhotoViewer photoViewer = this.a;
        RectF rectF = photoViewer.S8;
        if (!photoViewer.T8 || (oq0Var = photoViewer.e0) == null || !oq0Var.isAttachedToWindow()) {
            rect.setEmpty();
            return;
        }
        photoViewer.e0.getLocationOnScreen(new int[2]);
        rect.set(Math.round(rectF.left + r2[0]), Math.round(rectF.top + r2[1]), Math.round(rectF.right + r2[0]), Math.round(rectF.bottom + r2[1]));
    }

    @Override // ti.m
    public /* synthetic */ View x(LaunchActivity launchActivity) {
        return null;
    }

    @Override // ti.m
    public /* synthetic */ void B(View view) {
    }

    @Override // ti.m
    public /* synthetic */ void S(View view) {
    }

    @Override // ti.m
    public /* synthetic */ void e(View view) {
    }

    @Override // ti.m
    public /* synthetic */ void f0(int i7) {
    }

    @Override // ti.m
    public /* synthetic */ void y(View view) {
    }

    @Override // ti.m
    public /* synthetic */ void Z(int i7, ArrayList arrayList) {
    }
}
