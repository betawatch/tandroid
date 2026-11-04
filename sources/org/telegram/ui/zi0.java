package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zi0 extends eq0 {
    public final /* synthetic */ yj0 a;

    public zi0(yj0 yj0Var) {
        this.a = yj0Var;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void B(int i3) {
        yj0 yj0Var = this.a;
        int i10 = yj0Var.T0;
        org.telegram.messenger.wv wvVar = i10 == 1 ? yj0Var.k1 : i10 == 4 ? (org.telegram.messenger.wv) yj0Var.l1.get(i3) : i10 == 2 ? yj0Var.m1 : i10 == 3 ? yj0Var.n1 : (org.telegram.messenger.wv) yj0Var.j1.get(i3);
        wj0 wj0Var = (wj0) yj0Var.o1.remove(wvVar);
        if (wj0Var == null) {
            return;
        }
        String r12 = yj0.r1(wvVar);
        int i11 = yj0Var.T0;
        String str = null;
        if (i11 == 1) {
            yj0Var.k1 = null;
            str = t4.c.f("selfie", r12);
        } else if (i11 == 4) {
            str = t4.c.f("translation", r12);
        } else if (i11 == 2) {
            yj0Var.m1 = null;
            str = t4.c.f("front", r12);
        } else if (i11 == 3) {
            yj0Var.n1 = null;
            str = t4.c.f("reverse", r12);
        } else if (i11 == 0) {
            str = t4.c.f("files", r12);
        }
        if (str != null) {
            HashMap hashMap = yj0Var.y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = yj0Var.z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        yj0Var.X1(yj0Var.T0);
        yj0Var.j0.removeView(wj0Var);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        if (i3 < 0) {
            return null;
        }
        yj0 yj0Var = this.a;
        if (i3 >= yj0Var.j0.getChildCount()) {
            return null;
        }
        wj0 wj0Var = (wj0) yj0Var.j0.getChildAt(i3);
        int[] iArr = new int[2];
        wj0Var.c.getLocationInWindow(iArr);
        mq0 mq0Var = new mq0();
        mq0Var.b = iArr[0];
        mq0Var.c = iArr[1];
        mq0Var.d = yj0Var.j0;
        ImageReceiver imageReceiver = wj0Var.c.getImageReceiver();
        mq0Var.a = imageReceiver;
        mq0Var.e = imageReceiver.p();
        return mq0Var;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final String b0() {
        return this.a.T0 == 1 ? org.telegram.messenger.bd.a0("PassportDeleteSelfieAlert", null, 2131747589, new Object[0]) : org.telegram.messenger.bd.a0("PassportDeleteScanAlert", null, 2131747591, new Object[0]);
    }
}
