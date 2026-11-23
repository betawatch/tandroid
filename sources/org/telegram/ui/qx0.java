package org.telegram.ui;

import android.os.SystemClock;
import android.os.Trace;
import java.util.HashSet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qx0(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        long j3 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) obj;
                bzVar.e = SystemClock.elapsedRealtime();
                bzVar.c = false;
                if (j3 == -1) {
                    bzVar.d = false;
                    bzVar.b = 0L;
                } else {
                    bzVar.b = j3;
                    bzVar.d = true;
                }
                org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.E4, bzVar);
                return;
            case 1:
                ((li.d) obj).a(Long.valueOf(j3));
                return;
            case 2:
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj;
                a0Var.getClass();
                a0Var.presentFragment(bn.ua(j3));
                return;
            case 3:
                org.telegram.utils.twidget.p1 p1Var = (org.telegram.utils.twidget.p1) obj;
                Trace.beginSection("WidgetSandbox:Destroy");
                try {
                    p1Var.c.e(j3);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 4:
                wg.w0 w0Var = (wg.w0) obj;
                HashSet hashSet = w0Var.a2;
                hashSet.remove(Long.valueOf(j3));
                w0Var.U1.b(true, hashSet, new wg.r0(w0Var, 5), null);
                w0Var.o1(true, false);
                return;
            default:
                yi.j jVar = (yi.j) ((ac.e) obj).c;
                if (j3 != jVar.o || (i7 = jVar.G) == 9 || i7 == 10 || i7 == 8) {
                    return;
                }
                SystemClock.elapsedRealtime();
                jVar.w = false;
                jVar.s(3);
                jVar.i.removeCallbacks(jVar.D);
                jVar.h.b("recording started: retainedDurationMs=" + yi.j.r(jVar.p));
                return;
        }
    }
}
