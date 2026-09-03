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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ jd1 a;

    public xc1(jd1 jd1Var) {
        this.a = jd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.i6 k10;
        String b10;
        int i11;
        jd1 jd1Var = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = jd1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (jd1Var.Q0(true)) {
                jd1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            jd1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (jd1Var.v) {
                org.telegram.ui.ActionBar.k6.p1(false);
            }
            File d = i6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = jd1Var.T0;
            i6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            i6Var.p = jd1Var.i1;
            i6Var.q = jd1Var.B1;
            if (((int) i6Var.j) == 0) {
                i6Var.j = 4294967296L;
            }
            if (((int) i6Var.k) == 0) {
                i6Var.k = 4294967296L;
            }
            if (((int) i6Var.l) == 0) {
                i6Var.l = 4294967296L;
            }
            if (((int) i6Var.m) == 0) {
                i6Var.m = 4294967296L;
            }
            jd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(jd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.k6.t1(jd1Var.b0, true, false, false, true, false);
            org.telegram.ui.ActionBar.k6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, jd1Var.b0, Boolean.valueOf(jd1Var.c0), null, -1);
            jd1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (jd1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (jd1Var.C1) {
                sb.append("blur");
            }
            if (jd1Var.B1) {
                if (sb.length() > 0) {
                    sb.append("+");
                }
                sb.append("motion");
            }
            Object obj = jd1Var.y1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb2 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.p2) jd1Var).currentAccount;
                sb2.append(MessagesController.getInstance(i11).linkPrefix);
                sb2.append("/bg/");
                sb2.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb2.toString();
                if (sb.length() > 0) {
                    StringBuilder f10 = w.c.f(b10, "?mode=");
                    f10.append(sb.toString());
                    b10 = f10.toString();
                }
            } else if (obj instanceof vi1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = jd1Var.T0;
                vi1 vi1Var = new vi1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", jd1Var.W0, jd1Var.Y0, jd1Var.Z0, jd1Var.a1, jd1Var.e1, jd1Var.i1, jd1Var.B1, null);
                vi1Var.g = tL_wallPaper2;
                b10 = vi1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.k6.I.k(false)) == null) {
                    return;
                }
                vi1 vi1Var2 = new vi1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = jd1Var.R0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) jd1Var.R0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        vi1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = vi1Var2.b();
            }
            jd1Var.showDialog(new vc1(this, jd1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = jd1Var.y1;
                if (!(obj2 instanceof wi1) || (file = ((wi1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(jd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new wc1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = jd1Var.m1.a();
        ad1 ad1Var = jd1Var.m1;
        if (ad1Var != null) {
            if (!ad1Var.T0()) {
                jd1Var.g1();
                return;
            }
            jd1Var.m1.l1(true);
            org.telegram.ui.Components.hj0 hj0Var = jd1Var.K1;
            hj0Var.h = true;
            if (a2) {
                hj0Var.N(0);
            } else {
                hj0Var.N(36);
            }
            jd1Var.K1.start();
            if (jd1Var.J1) {
                ad1 ad1Var2 = jd1Var.m1;
                if (ad1Var2 == null || !ad1Var2.a()) {
                    jd1Var.O1.a(0.0f);
                } else {
                    jd1Var.O1.setVisibility(0);
                    jd1Var.O1.a(jd1Var.k1);
                }
                ValueAnimator valueAnimator = jd1Var.M1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    jd1Var.M1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(jd1Var.l1, jd1Var.m1.a() ? 1.0f : 0.0f);
                jd1Var.M1 = ofFloat;
                ofFloat.addUpdateListener(new n11(this, 14));
                jd1Var.M1.addListener(new ss0(this, 21));
                jd1Var.M1.setDuration(250L);
                jd1Var.M1.setInterpolator(org.telegram.ui.Components.pr.f);
                jd1Var.M1.start();
            }
        }
    }
}
