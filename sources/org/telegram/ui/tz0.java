package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q11 b;

    public /* synthetic */ tz0(q11 q11Var, int i7) {
        this.a = i7;
        this.b = q11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q11 q11Var = this.b;
                q11Var.getClass();
                HashSet hashSet = ch.e0.a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.gc.D().p;
                if (((CountDownLatch) b0Var.c) == null) {
                    b0Var.c = new CountDownLatch(1);
                }
                ch.e0.b = true;
                ch.e0.e = false;
                ch.e0.g = false;
                org.telegram.messenger.g0.i3(new tz0(q11Var, 2), 0L);
                break;
            case 1:
                q11 q11Var2 = this.b;
                ArrayList arrayList = q11Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = q11Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = q11Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                q11Var2.q0.E(true);
                break;
            case 2:
                this.b.V1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                q11 q11Var3 = this.b;
                org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                tz0 tz0Var = q11Var3.S1;
                e10.e.remove(tz0Var);
                org.telegram.messenger.qs.e().d(tz0Var);
                break;
        }
    }
}
