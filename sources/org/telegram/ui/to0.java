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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class to0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.j51, org.telegram.ui.Components.v51, org.telegram.ui.Components.fd0, ti.m {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ to0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // ti.m
    public void C(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.a;
        photoViewer.R8 = false;
        try {
            xq0 xq0Var = photoViewer.g0;
            if (xq0Var != null && xq0Var.getParent() == null) {
                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.D2) {
            org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
            if (u51Var != null) {
                u51Var.A0(null);
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
        xq0 xq0Var;
        PhotoViewer photoViewer = PhotoViewer.e9;
        PhotoViewer photoViewer2 = this.a;
        if (photoViewer != photoViewer2 || !photoViewer2.e || photoViewer2.I3 || photoViewer2.R8 || (xq0Var = photoViewer2.g0) == null || xq0Var.getParent() == null) {
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
        org.telegram.ui.Components.ge0 ge0Var = photoViewer.y2;
        return (ge0Var == null || ge0Var.getAspectRatio() <= 0.0f) ? photoViewer.U : Math.round(photoViewer.y2.getAspectRatio() * 1000.0f);
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
        org.telegram.ui.Components.u51 u51Var;
        if (k() || (u51Var = this.a.F2) == null) {
            return null;
        }
        return u51Var.d;
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
                    xq0 xq0Var = photoViewer4.g0;
                    if (xq0Var != null && xq0Var.getParent() == null) {
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
    public boolean R(boolean z9, float f10, org.telegram.ui.Components.rm0 rm0Var) {
        boolean k10 = k();
        PhotoViewer photoViewer = this.a;
        if (k10) {
            photoViewer.b4.startRewind(photoViewer.f0, z9, f10, photoViewer.t1, rm0Var);
            return true;
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var == null) {
            return false;
        }
        photoViewer.b4.startRewind(u51Var, z9, f10, photoViewer.t1, rm0Var);
        return true;
    }

    @Override // ti.m
    public void T() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.I3) {
            if (PhotoViewer.e9 != null) {
                PhotoViewer.e9.z0(false, true);
            }
            eq0 eq0Var = photoViewer.f0;
            if (eq0Var != null && eq0Var.f != null) {
                if (org.telegram.messenger.t0.x) {
                    try {
                        eq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                eq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) eq0Var.f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(eq0Var.f);
                }
                eq0Var.addView(eq0Var.f, 0, c8.ha.e(-1, -1, 51));
                ti.o oVar = eq0Var.b.O8;
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
                org.telegram.ui.Components.li0 s12 = photoViewer.s1(false);
                float f10 = s12.c / photoViewer.w3.getLayoutParams().width;
                photoViewer.w3.setScaleX(f10);
                photoViewer.w3.setScaleY(f10);
                photoViewer.w3.setTranslationX(s12.a);
                photoViewer.w3.setTranslationY(s12.b);
                view.setScaleX(f10);
                view.setScaleY(f10);
                view.setTranslationX(s12.a - photoViewer.y2.getX());
                view.setTranslationY(s12.b - photoViewer.y2.getY());
                qq0 qq0Var = photoViewer.E2;
                if (qq0Var != null) {
                    qq0Var.setScaleX(f10);
                    photoViewer.E2.setScaleY(f10);
                    photoViewer.E2.setTranslationX(view.getTranslationX());
                    photoViewer.E2.setTranslationY(view.getTranslationY());
                }
                photoViewer.W = 0.0f;
                hp0 hp0Var = new hp0(photoViewer, f10, 1);
                view.setOutlineProvider(hp0Var);
                view.setClipToOutline(true);
                photoViewer.w3.setOutlineProvider(hp0Var);
                photoViewer.w3.setClipToOutline(true);
                qq0 qq0Var2 = photoViewer.E2;
                if (qq0Var2 != null) {
                    qq0Var2.setOutlineProvider(hp0Var);
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
                yq0 yq0Var = photoViewer.c5;
                if (yq0Var != null && !yq0Var.s) {
                    yq0Var.a.O0(false, false);
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
        org.telegram.ui.Components.ge0 ge0Var = photoViewer.y2;
        if (ge0Var == null || ge0Var.getAspectRatio() <= 0.0f) {
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
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        return (u51Var == null || u51Var.U() <= 0) ? photoViewer.Q8 : Math.max(photoViewer.Q8, photoViewer.F2.K() / photoViewer.F2.U());
    }

    @Override // org.telegram.ui.Components.v51
    public void a(float f10) {
        eq0 eq0Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.F2 != null || ((eq0Var = photoViewer.f0) != null && eq0Var.y)) {
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
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null) {
            u51Var.g0();
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
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null) {
            u51Var.p0(j3);
        }
    }

    @Override // ti.m
    public void c0(Canvas canvas, int i7, int i10) {
        this.a.a4.draw(canvas, i7, i10);
    }

    @Override // org.telegram.ui.Components.v51
    public void d(float f10) {
        lp0 lp0Var;
        lp0 lp0Var2;
        PhotoViewer photoViewer = this.a;
        eq0 eq0Var = photoViewer.f0;
        if (eq0Var != null && eq0Var.y && (lp0Var2 = photoViewer.r3) != null) {
            int i7 = photoViewer.p3.h - org.telegram.ui.Components.w51.S;
            lp0Var2.N = eq0Var;
            if (lp0Var2.W != 0) {
                lp0Var2.W = 0L;
                lp0Var2.f0 = null;
                lp0Var2.e0 = null;
                lp0Var2.d0 = null;
                lp0Var2.b(-1);
            }
            if (i7 != 0) {
                lp0Var2.r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (lp0Var2.n != i10) {
                    lp0Var2.n = i10;
                }
            }
            lp0Var2.D = org.telegram.messenger.g0.g0((int) (((long) (eq0Var.getVideoDuration() * f10)) / 1000), false, false);
            lp0Var2.E = (int) Math.ceil(lp0Var2.F.measureText(r0));
            lp0Var2.invalidate();
            if (lp0Var2.f != null) {
                Utilities.e.a(lp0Var2.f);
            }
            double videoDuration = (f10 * eq0Var.getVideoDuration()) / 1000.0d;
            lp0Var2.O = videoDuration;
            String c10 = eq0Var.c((int) videoDuration);
            if (c10 != null) {
                lp0Var2.Q.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (lp0Var = photoViewer.r3) != null) {
            lp0Var.e(photoViewer.S4, f10, photoViewer.p3.h - org.telegram.ui.Components.w51.S);
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
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null) {
            u51Var.h0();
        }
    }

    @Override // ti.m
    public void g(ti.p pVar) {
        PhotoViewer photoViewer = this.a;
        photoViewer.R8 = true;
        if (photoViewer.D2) {
            org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
            if (u51Var != null) {
                u51Var.z0(null);
                photoViewer.F2.A0(null);
                photoViewer.F2.A0(pVar);
            }
        } else {
            TextureView textureView = photoViewer.B2;
            if (textureView != null) {
                photoViewer.P8 = pVar;
                org.telegram.messenger.g0.E2(textureView);
                photoViewer.P8 = null;
            }
        }
        try {
            xq0 xq0Var = photoViewer.g0;
            if (xq0Var == null || xq0Var.getParent() == null) {
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
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null) {
            return u51Var.U();
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
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        return u51Var != null && u51Var.d0();
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void i() {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.k3 && photoViewer.O3) {
            photoViewer.p2();
        }
    }

    @Override // org.telegram.ui.Components.j51
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
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null) {
            return u51Var.S();
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
            photoViewer.V0.animate().alpha(!z9 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.xq.f).setDuration(150L).withEndAction(new org.telegram.ui.Components.up0(10, photoViewer, z10));
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
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var == null) {
            return;
        }
        u51Var.p0((long) (u51Var.U() * photoViewer.v8));
        photoViewer.F2.g0();
        photoViewer.R7.setProgress(photoViewer.v8);
        photoViewer.n0();
        gf0 gf0Var = new gf0(this, 22);
        photoViewer.H2 = gf0Var;
        org.telegram.messenger.g0.i3(gf0Var, 860L);
    }

    @Override // ti.m
    public boolean r() {
        if (!k()) {
            return true;
        }
        eq0 eq0Var = this.a.f0;
        return (eq0Var.y && "inapp".equals(org.telegram.messenger.qp.s1(eq0Var.a).A3)) ? false : true;
    }

    @Override // ti.m
    public boolean u() {
        return this.a.b4.rewinding;
    }

    @Override // ti.m
    public void v(Rect rect) {
        rq0 rq0Var;
        PhotoViewer photoViewer = this.a;
        RectF rectF = photoViewer.S8;
        if (!photoViewer.T8 || (rq0Var = photoViewer.e0) == null || !rq0Var.isAttachedToWindow()) {
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
