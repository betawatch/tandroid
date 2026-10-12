package org.telegram.ui.web;

import android.os.SystemClock;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
import org.telegram.ui.hb1;
import zh.p7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ri.o oVar;
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.c;
                f0Var.getClass();
                f0Var.presentFragment(fo.W9(this.b));
                break;
            case 1:
                ri.q qVar = (ri.q) ((cc.e) this.c).c;
                if (this.b == qVar.o && (oVar = qVar.m) != ri.o.r && oVar != ri.o.s && oVar != ri.o.n) {
                    SystemClock.elapsedRealtime();
                    qVar.w = false;
                    qVar.r(ri.o.c);
                    qVar.h.removeCallbacks(qVar.D);
                    qVar.g.b("recording started: retainedDurationMs=" + ri.q.q(qVar.p));
                    break;
                }
                break;
            case 2:
                ug.z0 z0Var = (ug.z0) this.c;
                HashSet hashSet = z0Var.e0;
                hashSet.remove(Long.valueOf(this.b));
                z0Var.Y.b(true, hashSet, new ug.t0(z0Var, 5), null);
                z0Var.c0(true, false);
                break;
            case 3:
                zc.a0((p7) this.c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) this.b), R.raw.stars_topup).k(true);
                break;
            default:
                zc.a0((hb1) this.c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) this.b), R.raw.stars_topup).k(true);
                break;
        }
    }
}
