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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qd1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ce1 a;

    public qd1(ce1 ce1Var) {
        this.a = ce1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.e6 k10;
        String b10;
        int i11;
        ce1 ce1Var = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = ce1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (ce1Var.Q0(true)) {
                ce1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            ce1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (ce1Var.v) {
                org.telegram.ui.ActionBar.g6.q1(false);
            }
            File d = e6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = ce1Var.W0;
            e6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            e6Var.p = ce1Var.l1;
            e6Var.q = ce1Var.E1;
            if (((int) e6Var.j) == 0) {
                e6Var.j = 4294967296L;
            }
            if (((int) e6Var.k) == 0) {
                e6Var.k = 4294967296L;
            }
            if (((int) e6Var.l) == 0) {
                e6Var.l = 4294967296L;
            }
            if (((int) e6Var.m) == 0) {
                e6Var.m = 4294967296L;
            }
            ce1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(ce1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.g6.u1(ce1Var.e0, true, false, false, true, false);
            org.telegram.ui.ActionBar.g6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ce1Var.e0, Boolean.valueOf(ce1Var.f0), null, -1);
            ce1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (ce1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (ce1Var.F1) {
                sb2.append("blur");
            }
            if (ce1Var.E1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = ce1Var.B1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.m2) ce1Var).currentAccount;
                sb3.append(MessagesController.getInstance(i11).linkPrefix);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder i13 = t8.b.i(b10, "?mode=");
                    i13.append(sb2.toString());
                    b10 = i13.toString();
                }
            } else if (obj instanceof pj1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = ce1Var.W0;
                pj1 pj1Var = new pj1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", ce1Var.Z0, ce1Var.b1, ce1Var.c1, ce1Var.d1, ce1Var.h1, ce1Var.l1, ce1Var.E1, null);
                pj1Var.g = tL_wallPaper2;
                b10 = pj1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.g6.I.k(false)) == null) {
                    return;
                }
                pj1 pj1Var2 = new pj1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = ce1Var.U0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) ce1Var.U0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        pj1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = pj1Var2.b();
            }
            ce1Var.showDialog(new od1(this, ce1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = ce1Var.B1;
                if (!(obj2 instanceof qj1) || (file = ((qj1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(ce1Var.getParentActivity(), null, null);
                PhotoViewer.t1().g2(arrayList, 0, 3, false, new pd1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = ce1Var.p1.a();
        td1 td1Var = ce1Var.p1;
        if (td1Var != null) {
            if (!td1Var.Y0()) {
                ce1Var.g1();
                return;
            }
            ce1Var.p1.o1(true);
            org.telegram.ui.Components.yj0 yj0Var = ce1Var.N1;
            yj0Var.h = true;
            if (a2) {
                yj0Var.P(0);
            } else {
                yj0Var.P(36);
            }
            ce1Var.N1.start();
            if (ce1Var.M1) {
                td1 td1Var2 = ce1Var.p1;
                if (td1Var2 == null || !td1Var2.a()) {
                    ce1Var.R1.a(0.0f);
                } else {
                    ce1Var.R1.setVisibility(0);
                    ce1Var.R1.a(ce1Var.n1);
                }
                ValueAnimator valueAnimator = ce1Var.P1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    ce1Var.P1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ce1Var.o1, ce1Var.p1.a() ? 1.0f : 0.0f);
                ce1Var.P1 = ofFloat;
                ofFloat.addUpdateListener(new f21(this, 14));
                ce1Var.P1.addListener(new lj0(this, 26));
                ce1Var.P1.setDuration(250L);
                ce1Var.P1.setInterpolator(org.telegram.ui.Components.es.f);
                ce1Var.P1.start();
            }
        }
    }
}
