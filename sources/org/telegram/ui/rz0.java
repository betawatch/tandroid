package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n11 b;

    public /* synthetic */ rz0(n11 n11Var, int i7) {
        this.a = i7;
        this.b = n11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n11 n11Var = this.b;
                n11Var.getClass();
                HashSet hashSet = ch.f0.a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.fc.D().p;
                if (((CountDownLatch) b0Var.c) == null) {
                    b0Var.c = new CountDownLatch(1);
                }
                ch.f0.b = true;
                ch.f0.e = false;
                ch.f0.g = false;
                org.telegram.messenger.g0.i3(new rz0(n11Var, 2), 0L);
                break;
            case 1:
                n11 n11Var2 = this.b;
                ArrayList arrayList = n11Var2.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = n11Var2.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = n11Var2.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                n11Var2.r0.E(true);
                break;
            case 2:
                this.b.W1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                n11 n11Var3 = this.b;
                org.telegram.messenger.ns e10 = org.telegram.messenger.ns.e();
                rz0 rz0Var = n11Var3.T1;
                e10.e.remove(rz0Var);
                org.telegram.messenger.ns.e().d(rz0Var);
                break;
        }
    }
}
