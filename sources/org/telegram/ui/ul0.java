package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ul0 extends pt0 {
    public final /* synthetic */ vm0 a;

    public ul0(vm0 vm0Var) {
        this.a = vm0Var;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void B(int i10) {
        vm0 vm0Var = this.a;
        int i11 = vm0Var.O0;
        SecureDocument secureDocument = i11 == 1 ? vm0Var.f1 : i11 == 4 ? (SecureDocument) vm0Var.g1.get(i10) : i11 == 2 ? vm0Var.h1 : i11 == 3 ? vm0Var.i1 : (SecureDocument) vm0Var.e1.get(i10);
        tm0 tm0Var = (tm0) vm0Var.j1.remove(secureDocument);
        if (tm0Var == null) {
            return;
        }
        String n12 = vm0.n1(secureDocument);
        int i12 = vm0Var.O0;
        String str = null;
        if (i12 == 1) {
            vm0Var.f1 = null;
            str = u3.c.e("selfie", n12);
        } else if (i12 == 4) {
            str = u3.c.e("translation", n12);
        } else if (i12 == 2) {
            vm0Var.h1 = null;
            str = u3.c.e("front", n12);
        } else if (i12 == 3) {
            vm0Var.i1 = null;
            str = u3.c.e("reverse", n12);
        } else if (i12 == 0) {
            str = u3.c.e("files", n12);
        }
        if (str != null) {
            HashMap hashMap = vm0Var.t1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = vm0Var.u1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        vm0Var.S1(vm0Var.O0);
        vm0Var.e0.removeView(tm0Var);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        vm0 vm0Var = this.a;
        if (i10 >= vm0Var.e0.getChildCount()) {
            return null;
        }
        tm0 tm0Var = (tm0) vm0Var.e0.getChildAt(i10);
        int[] iArr = new int[2];
        tm0Var.c.getLocationInWindow(iArr);
        zt0 zt0Var = new zt0();
        zt0Var.b = iArr[0];
        zt0Var.c = iArr[1];
        zt0Var.d = vm0Var.e0;
        ImageReceiver imageReceiver = tm0Var.c.getImageReceiver();
        zt0Var.a = imageReceiver;
        zt0Var.e = imageReceiver.getBitmapSafe();
        return zt0Var;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final String a0() {
        return this.a.O0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
