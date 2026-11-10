package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t11 b;

    public /* synthetic */ xz0(t11 t11Var, int i7) {
        this.a = i7;
        this.b = t11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t11 t11Var = this.b;
                t11Var.getClass();
                HashSet hashSet = ch.e0.a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.gc.D().p;
                if (((CountDownLatch) b0Var.c) == null) {
                    b0Var.c = new CountDownLatch(1);
                }
                ch.e0.b = true;
                ch.e0.e = false;
                ch.e0.g = false;
                org.telegram.messenger.g0.i3(new xz0(t11Var, 2), 0L);
                break;
            case 1:
                t11 t11Var2 = this.b;
                ArrayList arrayList = t11Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = t11Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = t11Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                t11Var2.q0.E(true);
                break;
            case 2:
                this.b.V1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                t11 t11Var3 = this.b;
                org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                xz0 xz0Var = t11Var3.S1;
                e10.e.remove(xz0Var);
                org.telegram.messenger.qs.e().d(xz0Var);
                break;
        }
    }
}
