package org.telegram.ui;

import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zy implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zy(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    private final void a() {
        x5.i iVar = (x5.i) this.b;
        int i10 = ((x5.j) this.c).a;
        synchronized (iVar) {
            x5.j jVar = (x5.j) iVar.e.get(i10);
            if (jVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                iVar.e.remove(i10);
                jVar.b(new b7.a("Timed out waiting for response", null));
                iVar.c();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.Components.ic) this.b).j();
                ((cz) this.c).B = null;
                return;
            case 1:
                p2.b bVar = (p2.b) this.b;
                p2.h hVar = (p2.h) this.c;
                if (((p2.o) bVar.f.c) != null) {
                    ((p2.o) bVar.f.c).onPurchasesUpdated(hVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 2:
                Future future = (Future) this.b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.c;
                future.cancel(true);
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                p2.b bVar2 = (p2.b) this.b;
                org.telegram.messenger.d0 d0Var = (org.telegram.messenger.d0) this.c;
                p2.h hVar2 = p2.a0.i;
                bVar2.y(24, 7, hVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                d0Var.a(hVar2, new p2.q(vVar, vVar));
                return;
            case 4:
                p2.b bVar3 = (p2.b) this.b;
                p2.n nVar = (p2.n) this.c;
                p2.h hVar3 = p2.a0.i;
                bVar3.y(24, 9, hVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
                nVar.b(hVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 5:
                q5.f0 f0Var = ((q5.e0) this.b).b;
                u5.d dVar = (u5.d) this.c;
                u5.b bVar4 = q5.f0.G;
                q5.d dVar2 = dVar.d;
                q5.x xVar = dVar.f;
                q5.d dVar3 = f0Var.t;
                r5.e0 e0Var = f0Var.D;
                if (!u5.a.d(dVar2, dVar3)) {
                    f0Var.t = dVar2;
                    e0Var.c();
                }
                double d = dVar.a;
                if (Double.isNaN(d) || Math.abs(d - f0Var.v) <= 1.0E-7d) {
                    z4 = false;
                } else {
                    f0Var.v = d;
                    z4 = true;
                }
                boolean z17 = dVar.b;
                if (z17 != f0Var.w) {
                    f0Var.w = z17;
                    z4 = true;
                }
                u5.b bVar5 = q5.f0.G;
                bVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(f0Var.m));
                if (e0Var != null && (z4 || f0Var.m)) {
                    e0Var.f();
                }
                Double.isNaN(dVar.h);
                int i11 = dVar.c;
                if (i11 != f0Var.x) {
                    f0Var.x = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(f0Var.m));
                if (e0Var != null && (z10 || f0Var.m)) {
                    e0Var.a();
                }
                int i12 = dVar.e;
                if (i12 != f0Var.y) {
                    f0Var.y = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(f0Var.m));
                if (e0Var != null && (z11 || f0Var.m)) {
                    e0Var.e();
                }
                if (!u5.a.d(f0Var.z, xVar)) {
                    f0Var.z = xVar;
                }
                f0Var.m = false;
                return;
            case 6:
                q5.f0 f0Var2 = ((q5.e0) this.b).b;
                u5.c cVar = (u5.c) this.c;
                u5.b bVar6 = q5.f0.G;
                String str = cVar.a;
                if (u5.a.d(str, f0Var2.u)) {
                    z12 = false;
                } else {
                    f0Var2.u = str;
                    z12 = true;
                }
                q5.f0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(f0Var2.n));
                r5.e0 e0Var2 = f0Var2.D;
                if (e0Var2 != null && (z12 || f0Var2.n)) {
                    e0Var2.d();
                }
                f0Var2.n = false;
                return;
            case 7:
                qd.i iVar = (qd.i) this.c;
                ld.a0 a0Var = iVar.c;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th2) {
                        ld.e0.m(th2, uc.i.a);
                    }
                    Runnable f10 = iVar.f();
                    if (f10 == null) {
                        return;
                    }
                    this.b = f10;
                    i10++;
                    if (i10 >= 16 && a0Var.e()) {
                        a0Var.c(iVar, this);
                        return;
                    }
                }
                break;
            case 8:
                u5.w wVar = (u5.w) this.b;
                u5.d dVar4 = (u5.d) this.c;
                u5.b bVar7 = u5.w.k0;
                q5.d dVar5 = dVar4.d;
                q5.x xVar2 = dVar4.f;
                q5.d dVar6 = wVar.R;
                r5.e0 e0Var3 = wVar.T;
                if (!u5.a.d(dVar5, dVar6)) {
                    wVar.R = dVar5;
                    e0Var3.c();
                }
                double d10 = dVar4.a;
                if (Double.isNaN(d10) || Math.abs(d10 - wVar.c0) <= 1.0E-7d) {
                    z13 = false;
                } else {
                    wVar.c0 = d10;
                    z13 = true;
                }
                boolean z18 = dVar4.b;
                if (z18 != wVar.Z) {
                    wVar.Z = z18;
                    z13 = true;
                }
                Double.isNaN(dVar4.h);
                u5.b bVar8 = u5.w.k0;
                bVar8.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(wVar.b0));
                if (e0Var3 != null && (z13 || wVar.b0)) {
                    e0Var3.f();
                }
                int i13 = dVar4.c;
                if (i13 != wVar.e0) {
                    wVar.e0 = i13;
                    z14 = true;
                } else {
                    z14 = false;
                }
                bVar8.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(wVar.b0));
                if (e0Var3 != null && (z14 || wVar.b0)) {
                    e0Var3.a();
                }
                int i14 = dVar4.e;
                if (i14 != wVar.f0) {
                    wVar.f0 = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar8.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(wVar.b0));
                if (e0Var3 != null && (z15 || wVar.b0)) {
                    e0Var3.e();
                }
                if (!u5.a.d(wVar.d0, xVar2)) {
                    wVar.d0 = xVar2;
                }
                wVar.b0 = false;
                return;
            case 9:
                u5.w wVar2 = (u5.w) this.b;
                u5.c cVar2 = (u5.c) this.c;
                u5.b bVar9 = u5.w.k0;
                String str2 = cVar2.a;
                if (u5.a.d(str2, wVar2.Y)) {
                    z16 = false;
                } else {
                    wVar2.Y = str2;
                    z16 = true;
                }
                u5.w.k0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(wVar2.a0));
                r5.e0 e0Var4 = wVar2.T;
                if (e0Var4 != null && (z16 || wVar2.a0)) {
                    e0Var4.d();
                }
                wVar2.a0 = false;
                return;
            case 10:
                x1.a aVar = (x1.a) this.c;
                Object obj = this.b;
                if (aVar.c.get()) {
                    o5.d dVar7 = aVar.e;
                    if (dVar7.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar7.h = null;
                        dVar7.b();
                    }
                } else {
                    o5.d dVar8 = aVar.e;
                    if (dVar8.g != aVar) {
                        if (dVar8.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar8.h = null;
                            dVar8.b();
                        }
                    } else if (!dVar8.c) {
                        SystemClock.uptimeMillis();
                        dVar8.g = null;
                        w1.a aVar2 = dVar8.a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj);
                            } else {
                                aVar2.h(obj);
                            }
                        }
                    }
                }
                aVar.b = 3;
                return;
            case 11:
                x5.i iVar2 = (x5.i) this.b;
                IBinder iBinder = (IBinder) this.c;
                synchronized (iVar2) {
                    if (iBinder == null) {
                        iVar2.a("Null service connection");
                    } else {
                        try {
                            iVar2.c = new q5.c0(iBinder);
                            iVar2.a = 2;
                            ((ScheduledExecutorService) iVar2.f.c).execute(new x5.g(iVar2, i10));
                        } catch (RemoteException e6) {
                            iVar2.a(e6.getMessage());
                        }
                    }
                }
                return;
            case 12:
                a();
                return;
            default:
                xh.n nVar2 = (xh.n) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    nVar2.B((f2.j) obj2);
                }
                arrayList.clear();
                nVar2.v.remove(arrayList);
                return;
        }
    }

    public /* synthetic */ zy(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
