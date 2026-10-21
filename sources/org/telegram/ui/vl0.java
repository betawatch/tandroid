package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class vl0 extends zt0 {
    public final /* synthetic */ vm0 a;

    public vl0(vm0 vm0Var) {
        this.a = vm0Var;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void B(int i10) {
        vm0 vm0Var = this.a;
        int i11 = vm0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? vm0Var.j1 : i11 == 4 ? (SecureDocument) vm0Var.k1.get(i10) : i11 == 2 ? vm0Var.l1 : i11 == 3 ? vm0Var.m1 : (SecureDocument) vm0Var.i1.get(i10);
        tm0 tm0Var = (tm0) vm0Var.n1.remove(secureDocument);
        if (tm0Var == null) {
            return;
        }
        String m12 = vm0.m1(secureDocument);
        int i12 = vm0Var.S0;
        String str = null;
        if (i12 == 1) {
            vm0Var.j1 = null;
            str = r4.c.h("selfie", m12);
        } else if (i12 == 4) {
            str = r4.c.h("translation", m12);
        } else if (i12 == 2) {
            vm0Var.l1 = null;
            str = r4.c.h("front", m12);
        } else if (i12 == 3) {
            vm0Var.m1 = null;
            str = r4.c.h("reverse", m12);
        } else if (i12 == 0) {
            str = r4.c.h("files", m12);
        }
        if (str != null) {
            HashMap hashMap = vm0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = vm0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        vm0Var.R1(vm0Var.S0);
        vm0Var.i0.removeView(tm0Var);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        vm0 vm0Var = this.a;
        if (i10 >= vm0Var.i0.getChildCount()) {
            return null;
        }
        tm0 tm0Var = (tm0) vm0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        tm0Var.c.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.b = iArr[0];
        ju0Var.c = iArr[1];
        ju0Var.d = vm0Var.i0;
        ImageReceiver imageReceiver = tm0Var.c.getImageReceiver();
        ju0Var.a = imageReceiver;
        ju0Var.e = imageReceiver.getBitmapSafe();
        return ju0Var;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final String b0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
