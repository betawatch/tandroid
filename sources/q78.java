// default package

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b0;
import org.telegram.ui.v;
import org.telegram.ui.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class q78 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q78(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ms1 ms1Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((r78) obj).p0.M.f();
                break;
            case 1:
                ((lb8) obj).invalidate();
                break;
            case 2:
                uz0 uz0Var = (uz0) obj;
                PhotoViewer photoViewer = (PhotoViewer) uz0Var.d;
                long j = uz0Var.a;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.C1(j);
                if (photoViewer.d2 == 1) {
                    long j2 = uz0Var.a;
                    photoViewer.c8 = j2;
                    if (photoViewer.b8 != j2) {
                        photoViewer.b8 = -1L;
                    }
                }
                uz0Var.c = null;
                break;
            case 3:
                PhotoViewer photoViewer2 = (PhotoViewer) ((kg3) obj).b;
                ImageView imageView = photoViewer2.E3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.E3.getParent()).removeView(photoViewer2.E3);
                    if (photoViewer2.D3 != null) {
                        ImageView imageView2 = photoViewer2.E3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        gm.w2(photoViewer2.D3);
                        photoViewer2.D3 = null;
                    }
                    photoViewer2.E3 = null;
                    break;
                }
                break;
            case 4:
                yv1 yv1Var = ((ea8) obj).W2.k4;
                if (yv1Var != null && (ms1Var = yv1Var.a0) != null) {
                    ms1Var.j1();
                    break;
                }
                break;
            case 5:
                PhotoViewer photoViewer3 = (PhotoViewer) ((u5) ((s38) obj).b).c;
                photoViewer3.H2 = false;
                ndc ndcVar = photoViewer3.G2;
                if (ndcVar != null) {
                    ndcVar.g0();
                }
                photoViewer3.I2 = null;
                break;
            case 6:
                PhotoViewer photoViewer4 = ((e98) obj).a;
                photoViewer4.H2 = false;
                ndc ndcVar2 = photoViewer4.G2;
                if (ndcVar2 != null) {
                    ndcVar2.g0();
                }
                photoViewer4.I2 = null;
                break;
            case 7:
                PhotoViewer photoViewer5 = ((v) ((s38) obj).b).r;
                photoViewer5.q7.e();
                Runnable runnable = photoViewer5.o4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.o4 = null;
                }
                photoViewer5.H1(true);
                break;
            case 8:
                PhotoViewer photoViewer6 = ((ha8) obj).b;
                Runnable runnable2 = photoViewer6.o4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.o4 = null;
                    break;
                }
                break;
            case 9:
                ((gb8) obj).y.e(true);
                break;
            case 10:
                ((kb8) obj).d = true;
                break;
            case 11:
                z zVar = (z) obj;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zVar.a.O0.getLayoutParams();
                ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                int D = wi8.D(34.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer7 = zVar.a;
                int i = D + (!photoViewer7.s ? gm.m : 0);
                if (i != layoutParams.topMargin) {
                    layoutParams.topMargin = i;
                    photoViewer7.O0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zVar.a.P0.getLayoutParams();
                int D2 = wi8.D(40.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer8 = zVar.a;
                int i2 = D2 + (photoViewer8.s ? 0 : gm.m);
                if (layoutParams2.topMargin != i2) {
                    layoutParams2.topMargin = i2;
                    photoViewer8.P0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 12:
                ((wb8) obj).h = null;
                break;
            case 13:
                wb8 wb8Var = (wb8) ((wm4) obj).c;
                wb8Var.d.p0(wb8Var.e, false);
                break;
            case 14:
                ya8 ya8Var = (ya8) obj;
                if (ya8Var.y) {
                    ya8Var.h("pollPosition();");
                }
                if (ya8Var.H) {
                    gm.d3(ya8Var.M, 500L);
                    break;
                }
                break;
            case 15:
                yc3 yc3Var = (yc3) obj;
                ArrayList arrayList = (ArrayList) yc3Var.c;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ad8 ad8Var = (ad8) arrayList.get(i3);
                    tl4 tl4Var = ad8Var.e;
                    if (tl4Var != null && ad8Var.c == 1 && tl4Var.g && !tl4Var.K) {
                        if ((tl4Var.b.D() && Settings.canDrawOverlays(tl4Var.c)) != tl4Var.f) {
                            tl4Var.l();
                            tl4Var.a();
                        }
                    }
                }
                yc3Var.d();
                break;
            case 16:
                ((vc8) obj).e0();
                break;
            case 17:
                ad8 ad8Var2 = (ad8) obj;
                if (ad8Var2.c == 1) {
                    ad8Var2.a.n0();
                    break;
                }
                break;
            case 18:
                ((le8) obj).m--;
                break;
            case 19:
                ((df8) obj).f();
                break;
            case 20:
                gm.E3(((lf8) obj).a);
                break;
            case 21:
                s09 s09Var = ((cj8) obj).G;
                s09Var.getAnimatedDrawable().I(0, true, false);
                s09Var.d();
                break;
            case 22:
                ((kj8) ((ij8) obj).c).D0();
                break;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((b0) obj).c;
                premiumPreviewFragment.showDialog(new cd9(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 24:
                sk8 sk8Var = (sk8) obj;
                int size = 1073741823 - (1073741823 % sk8Var.f3.size());
                u46 u46Var = sk8Var.g3;
                sk8Var.t3 = size;
                u46Var.g1(size, (sk8Var.getMeasuredHeight() - sk8Var.getChildAt(0).getMeasuredHeight()) >> 1);
                sk8Var.z1(null, false);
                break;
            case 25:
                ((k9b) obj).r();
                break;
            case 26:
                fn8 fn8Var = (fn8) obj;
                g36 g36Var = fn8Var.f;
                if (fn8Var.b == 0) {
                    fn8Var.c = true;
                    g36Var.e(u26.ON_PAUSE);
                }
                if (fn8Var.a == 0 && fn8Var.c) {
                    g36Var.e(u26.ON_STOP);
                    fn8Var.d = true;
                    break;
                }
                break;
            case 27:
                RectF rectF = ProfileActivity.e7;
                ((un8) obj).a(0);
                break;
            case 28:
                qo8 qo8Var = (qo8) obj;
                qo8Var.G.getNotificationCenter().j(qo8Var.F);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((su) obj).c;
                if (profileActivity.y5 != 1.0f) {
                    zo8 zo8Var = profileActivity.o0;
                    while (zo8Var.E0.k(r2) != zo8Var.getRealCount() - 1) {
                        r2++;
                    }
                    zo8Var.x(r2, true);
                    break;
                }
                break;
        }
    }
}
