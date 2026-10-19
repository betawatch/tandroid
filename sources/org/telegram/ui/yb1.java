package org.telegram.ui;

import android.animation.ValueAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class yb1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ kc1 a;

    public yb1(kc1 kc1Var) {
        this.a = kc1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.f6 k10;
        String b10;
        int i11;
        kc1 kc1Var = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = kc1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (kc1Var.Q0(true)) {
                kc1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            kc1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (kc1Var.v) {
                org.telegram.ui.ActionBar.h6.q1(false);
            }
            File d = f6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = kc1Var.W0;
            f6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            f6Var.p = kc1Var.l1;
            f6Var.q = kc1Var.E1;
            if (((int) f6Var.j) == 0) {
                f6Var.j = 4294967296L;
            }
            if (((int) f6Var.k) == 0) {
                f6Var.k = 4294967296L;
            }
            if (((int) f6Var.l) == 0) {
                f6Var.l = 4294967296L;
            }
            if (((int) f6Var.m) == 0) {
                f6Var.m = 4294967296L;
            }
            kc1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(kc1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.h6.u1(kc1Var.e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.h6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, kc1Var.e0, Boolean.valueOf(kc1Var.f0), null, -1);
            kc1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (kc1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (kc1Var.F1) {
                sb2.append("blur");
            }
            if (kc1Var.E1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = kc1Var.B1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.n2) kc1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder i13 = r4.c.i(b10, "?mode=");
                    i13.append(sb2.toString());
                    b10 = i13.toString();
                }
            } else if (obj instanceof sh1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = kc1Var.W0;
                sh1 sh1Var = new sh1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", kc1Var.Z0, kc1Var.b1, kc1Var.c1, kc1Var.d1, kc1Var.h1, kc1Var.l1, kc1Var.E1, null);
                sh1Var.g = tL_wallPaper2;
                b10 = sh1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.h6.I.k(false)) == null) {
                    return;
                }
                sh1 sh1Var2 = new sh1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = kc1Var.U0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) kc1Var.U0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        sh1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = sh1Var2.b();
            }
            kc1Var.showDialog(new wb1(this, kc1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = kc1Var.B1;
                if (!(obj2 instanceof th1) || (file = ((th1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(kc1Var.getParentActivity(), null, null);
                PhotoViewer.t1().g2(arrayList, 0, 3, false, new xb1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = kc1Var.p1.a();
        bc1 bc1Var = kc1Var.p1;
        if (bc1Var != null) {
            if (!bc1Var.I0()) {
                kc1Var.g1();
                return;
            }
            kc1Var.p1.c1(true);
            org.telegram.ui.Components.uj0 uj0Var = kc1Var.N1;
            uj0Var.h = true;
            if (a2) {
                uj0Var.P(0);
            } else {
                uj0Var.P(36);
            }
            kc1Var.N1.start();
            if (kc1Var.M1) {
                bc1 bc1Var2 = kc1Var.p1;
                if (bc1Var2 == null || !bc1Var2.a()) {
                    kc1Var.R1.a(0.0f);
                } else {
                    kc1Var.R1.setVisibility(0);
                    kc1Var.R1.a(kc1Var.n1);
                }
                ValueAnimator valueAnimator = kc1Var.P1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    kc1Var.P1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(kc1Var.o1, kc1Var.p1.a() ? 1.0f : 0.0f);
                kc1Var.P1 = ofFloat;
                ofFloat.addUpdateListener(new c11(this, 12));
                kc1Var.P1.addListener(new zb0(this, 27));
                kc1Var.P1.setDuration(250L);
                kc1Var.P1.setInterpolator(org.telegram.ui.Components.bs.f);
                kc1Var.P1.start();
            }
        }
    }
}
