package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r11 b;

    public /* synthetic */ vz0(r11 r11Var, int i7) {
        this.a = i7;
        this.b = r11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r11 r11Var = this.b;
                r11Var.getClass();
                HashSet hashSet = ch.f0.a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.ec.D().p;
                if (((CountDownLatch) b0Var.c) == null) {
                    b0Var.c = new CountDownLatch(1);
                }
                ch.f0.b = true;
                ch.f0.e = false;
                ch.f0.g = false;
                org.telegram.messenger.g0.h3(new vz0(r11Var, 2), 0L);
                break;
            case 1:
                r11 r11Var2 = this.b;
                ArrayList arrayList = r11Var2.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = r11Var2.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = r11Var2.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                r11Var2.r0.E(true);
                break;
            case 2:
                this.b.W1.start();
                break;
            case 3:
                this.b.B(true, true, true);
                break;
            default:
                r11 r11Var3 = this.b;
                org.telegram.messenger.ks e10 = org.telegram.messenger.ks.e();
                vz0 vz0Var = r11Var3.T1;
                e10.e.remove(vz0Var);
                org.telegram.messenger.ks.e().d(vz0Var);
                break;
        }
    }
}
