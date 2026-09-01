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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ed1 a;

    public sc1(ed1 ed1Var) {
        this.a = ed1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.i6 k10;
        String b10;
        int i11;
        ed1 ed1Var = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = ed1Var.s;
        int i12 = 0;
        if (i10 == -1) {
            if (ed1Var.Q0(true)) {
                ed1Var.O0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            ed1Var.Y0(i10, true);
            return;
        }
        if (i10 == 4) {
            if (ed1Var.v) {
                org.telegram.ui.ActionBar.k6.p1(false);
            }
            File d = i6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = ed1Var.T0;
            i6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            i6Var.p = ed1Var.i1;
            i6Var.q = ed1Var.B1;
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
            ed1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(ed1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.k6.t1(ed1Var.b0, true, false, false, true, false);
            org.telegram.ui.ActionBar.k6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ed1Var.b0, Boolean.valueOf(ed1Var.c0), null, -1);
            ed1Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (ed1Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (ed1Var.C1) {
                sb.append("blur");
            }
            if (ed1Var.B1) {
                if (sb.length() > 0) {
                    sb.append("+");
                }
                sb.append("motion");
            }
            Object obj = ed1Var.y1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb2 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.p2) ed1Var).currentAccount;
                sb2.append(MessagesController.getInstance(i11).linkPrefix);
                sb2.append("/bg/");
                sb2.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb2.toString();
                if (sb.length() > 0) {
                    StringBuilder f10 = w.c.f(b10, "?mode=");
                    f10.append(sb.toString());
                    b10 = f10.toString();
                }
            } else if (obj instanceof pi1) {
                TLRPC.TL_wallPaper tL_wallPaper2 = ed1Var.T0;
                pi1 pi1Var = new pi1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", ed1Var.W0, ed1Var.Y0, ed1Var.Z0, ed1Var.a1, ed1Var.e1, ed1Var.i1, ed1Var.B1, null);
                pi1Var.g = tL_wallPaper2;
                b10 = pi1Var.b();
            } else {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || (k10 = org.telegram.ui.ActionBar.k6.I.k(false)) == null) {
                    return;
                }
                pi1 pi1Var2 = new pi1(k10.o, (int) k10.j, (int) k10.k, (int) k10.l, (int) k10.m, k10.n, k10.p, k10.q, null);
                int size = ed1Var.R0.size();
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) ed1Var.R0.get(i12);
                    if (tL_wallPaper3.pattern && k10.o.equals(tL_wallPaper3.slug)) {
                        pi1Var2.g = tL_wallPaper3;
                        break;
                    }
                    i12++;
                }
                b10 = pi1Var2.b();
            }
            ed1Var.showDialog(new qc1(this, ed1Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = ed1Var.y1;
                if (!(obj2 instanceof qi1) || (file = ((qi1) obj2).e) == null) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(ed1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new rc1(this, photoEntry), null);
                return;
            }
            return;
        }
        if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
            SharedConfig.dayNightWallpaperSwitchHint = 10;
            SharedConfig.increaseDayNightWallpaperSiwtchHint();
        }
        boolean a2 = ed1Var.m1.a();
        vc1 vc1Var = ed1Var.m1;
        if (vc1Var != null) {
            if (!vc1Var.T0()) {
                ed1Var.g1();
                return;
            }
            ed1Var.m1.l1(true);
            org.telegram.ui.Components.ij0 ij0Var = ed1Var.K1;
            ij0Var.h = true;
            if (a2) {
                ij0Var.N(0);
            } else {
                ij0Var.N(36);
            }
            ed1Var.K1.start();
            if (ed1Var.J1) {
                vc1 vc1Var2 = ed1Var.m1;
                if (vc1Var2 == null || !vc1Var2.a()) {
                    ed1Var.O1.a(0.0f);
                } else {
                    ed1Var.O1.setVisibility(0);
                    ed1Var.O1.a(ed1Var.k1);
                }
                ValueAnimator valueAnimator = ed1Var.M1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    ed1Var.M1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ed1Var.l1, ed1Var.m1.a() ? 1.0f : 0.0f);
                ed1Var.M1 = ofFloat;
                ofFloat.addUpdateListener(new j11(this, 14));
                ed1Var.M1.addListener(new ns0(this, 21));
                ed1Var.M1.setDuration(250L);
                ed1Var.M1.setInterpolator(org.telegram.ui.Components.pr.f);
                ed1Var.M1.start();
            }
        }
    }
}
