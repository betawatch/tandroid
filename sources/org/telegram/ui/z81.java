package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z81 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ k91 a;

    public z81(k91 k91Var) {
        this.a = k91Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        File file;
        String b10;
        int i11;
        k91 k91Var = this.a;
        org.telegram.ui.ActionBar.r6 r6Var = k91Var.w;
        if (i10 == -1) {
            if (k91Var.U0(true)) {
                k91Var.S0(false);
                return;
            }
            return;
        }
        if (i10 >= 1 && i10 <= 3) {
            k91Var.d1(i10, true);
            return;
        }
        if (i10 == 4) {
            if (k91Var.x) {
                org.telegram.ui.ActionBar.t6.v1(false);
            }
            File e = r6Var.e();
            if (e != null) {
                e.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = k91Var.X0;
            r6Var.o = tL_wallPaper != null ? tL_wallPaper.slug : "";
            r6Var.p = k91Var.m1;
            r6Var.q = k91Var.F1;
            if (((int) r6Var.j) == 0) {
                r6Var.j = 4294967296L;
            }
            if (((int) r6Var.k) == 0) {
                r6Var.k = 4294967296L;
            }
            if (((int) r6Var.l) == 0) {
                r6Var.l = 4294967296L;
            }
            if (((int) r6Var.m) == 0) {
                r6Var.m = 4294967296L;
            }
            k91Var.b1();
            org.telegram.messenger.at.e().n(k91Var, org.telegram.messenger.at.e4);
            org.telegram.ui.ActionBar.t6.z1(k91Var.f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.t6.p();
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.t4, k91Var.f0, Boolean.valueOf(k91Var.g0), null, -1);
            k91Var.finishFragment();
            return;
        }
        if (i10 == 5) {
            if (k91Var.getParentActivity() == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            if (k91Var.G1) {
                sb2.append("blur");
            }
            if (k91Var.F1) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
            Object obj = k91Var.C1;
            if (obj instanceof TLRPC.TL_wallPaper) {
                StringBuilder sb3 = new StringBuilder("https://");
                i11 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
                sb3.append(org.telegram.messenger.wp.r1(i11).U2);
                sb3.append("/bg/");
                sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                b10 = sb3.toString();
                if (sb2.length() > 0) {
                    StringBuilder i12 = sc.e.i(b10, "?mode=");
                    i12.append(sb2.toString());
                    b10 = i12.toString();
                }
            } else {
                if (!(obj instanceof ke1)) {
                    boolean z10 = org.telegram.messenger.v2.a;
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper2 = k91Var.X0;
                ke1 ke1Var = new ke1(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", k91Var.a1, k91Var.c1, k91Var.d1, k91Var.e1, k91Var.i1, k91Var.m1, k91Var.F1, null);
                ke1Var.g = tL_wallPaper2;
                b10 = ke1Var.b();
            }
            k91Var.showDialog(new x81(this, k91Var.getParentActivity(), b10, b10));
            return;
        }
        if (i10 != 6) {
            if (i10 == 7) {
                Object obj2 = k91Var.C1;
                if (!(obj2 instanceof le1) || (file = ((le1) obj2).e) == null) {
                    return;
                }
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, file.getAbsolutePath(), 0, false, 0, 0);
                ffVar.b = false;
                ffVar.c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ffVar);
                PhotoViewer.v1().N2(k91Var.getParentActivity(), null, null);
                PhotoViewer.v1().j2(arrayList, 0, 3, false, new y81(this, ffVar), null);
                return;
            }
            return;
        }
        if (org.telegram.messenger.uz.S <= 3) {
            org.telegram.messenger.uz.S = 10;
            SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
            int i13 = org.telegram.messenger.uz.S + 1;
            org.telegram.messenger.uz.S = i13;
            edit.putInt("dayNightWallpaperSwitchHint", i13);
            edit.apply();
        }
        boolean a2 = k91Var.q1.a();
        c91 c91Var = k91Var.q1;
        if (c91Var != null) {
            if (!c91Var.b1()) {
                k91Var.l1();
                return;
            }
            k91Var.q1.M1(true);
            org.telegram.ui.Components.ci0 ci0Var = k91Var.O1;
            ci0Var.h = true;
            if (a2) {
                ci0Var.P(0);
            } else {
                ci0Var.P(36);
            }
            k91Var.O1.start();
            if (k91Var.N1) {
                c91 c91Var2 = k91Var.q1;
                if (c91Var2 == null || !c91Var2.a()) {
                    k91Var.S1.a(0.0f);
                } else {
                    k91Var.S1.setVisibility(0);
                    k91Var.S1.a(k91Var.o1);
                }
                ValueAnimator valueAnimator = k91Var.Q1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    k91Var.Q1.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(k91Var.p1, k91Var.q1.a() ? 1.0f : 0.0f);
                k91Var.Q1 = ofFloat;
                ofFloat.addUpdateListener(new u01(this, 10));
                k91Var.Q1.addListener(new ms0(this, 10));
                k91Var.Q1.setDuration(250L);
                k91Var.Q1.setInterpolator(org.telegram.ui.Components.gr.f);
                k91Var.Q1.start();
            }
        }
    }
}
