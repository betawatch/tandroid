package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class xl0 extends bu0 {
    public final /* synthetic */ xm0 a;

    public xl0(xm0 xm0Var) {
        this.a = xm0Var;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void B(int i10) {
        xm0 xm0Var = this.a;
        int i11 = xm0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? xm0Var.j1 : i11 == 4 ? (SecureDocument) xm0Var.k1.get(i10) : i11 == 2 ? xm0Var.l1 : i11 == 3 ? xm0Var.m1 : (SecureDocument) xm0Var.i1.get(i10);
        vm0 vm0Var = (vm0) xm0Var.n1.remove(secureDocument);
        if (vm0Var == null) {
            return;
        }
        String m12 = xm0.m1(secureDocument);
        int i12 = xm0Var.S0;
        String str = null;
        if (i12 == 1) {
            xm0Var.j1 = null;
            str = r4.c.h("selfie", m12);
        } else if (i12 == 4) {
            str = r4.c.h("translation", m12);
        } else if (i12 == 2) {
            xm0Var.l1 = null;
            str = r4.c.h("front", m12);
        } else if (i12 == 3) {
            xm0Var.m1 = null;
            str = r4.c.h("reverse", m12);
        } else if (i12 == 0) {
            str = r4.c.h("files", m12);
        }
        if (str != null) {
            HashMap hashMap = xm0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = xm0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        xm0Var.R1(xm0Var.S0);
        xm0Var.i0.removeView(vm0Var);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        xm0 xm0Var = this.a;
        if (i10 >= xm0Var.i0.getChildCount()) {
            return null;
        }
        vm0 vm0Var = (vm0) xm0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        vm0Var.c.getLocationInWindow(iArr);
        lu0 lu0Var = new lu0();
        lu0Var.b = iArr[0];
        lu0Var.c = iArr[1];
        lu0Var.d = xm0Var.i0;
        ImageReceiver imageReceiver = vm0Var.c.getImageReceiver();
        lu0Var.a = imageReceiver;
        lu0Var.e = imageReceiver.getBitmapSafe();
        return lu0Var;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final String b0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
