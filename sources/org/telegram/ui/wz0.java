package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s11 b;

    public /* synthetic */ wz0(s11 s11Var, int i7) {
        this.a = i7;
        this.b = s11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s11 s11Var = this.b;
                s11Var.getClass();
                HashSet hashSet = ch.e0.a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.gc.D().p;
                if (((CountDownLatch) b0Var.c) == null) {
                    b0Var.c = new CountDownLatch(1);
                }
                ch.e0.b = true;
                ch.e0.e = false;
                ch.e0.g = false;
                org.telegram.messenger.g0.i3(new wz0(s11Var, 2), 0L);
                break;
            case 1:
                s11 s11Var2 = this.b;
                ArrayList arrayList = s11Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = s11Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = s11Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                s11Var2.q0.E(true);
                break;
            case 2:
                this.b.V1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                s11 s11Var3 = this.b;
                org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                wz0 wz0Var = s11Var3.S1;
                e10.e.remove(wz0Var);
                org.telegram.messenger.qs.e().d(wz0Var);
                break;
        }
    }
}
