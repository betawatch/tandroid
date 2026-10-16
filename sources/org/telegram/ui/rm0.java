package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class rm0 extends zu0 {
    public final /* synthetic */ sn0 a;

    public rm0(sn0 sn0Var) {
        this.a = sn0Var;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void B(int i10) {
        sn0 sn0Var = this.a;
        int i11 = sn0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? sn0Var.j1 : i11 == 4 ? (SecureDocument) sn0Var.k1.get(i10) : i11 == 2 ? sn0Var.l1 : i11 == 3 ? sn0Var.m1 : (SecureDocument) sn0Var.i1.get(i10);
        qn0 qn0Var = (qn0) sn0Var.n1.remove(secureDocument);
        if (qn0Var == null) {
            return;
        }
        String m12 = sn0.m1(secureDocument);
        int i12 = sn0Var.S0;
        String str = null;
        if (i12 == 1) {
            sn0Var.j1 = null;
            str = t8.b.h("selfie", m12);
        } else if (i12 == 4) {
            str = t8.b.h("translation", m12);
        } else if (i12 == 2) {
            sn0Var.l1 = null;
            str = t8.b.h("front", m12);
        } else if (i12 == 3) {
            sn0Var.m1 = null;
            str = t8.b.h("reverse", m12);
        } else if (i12 == 0) {
            str = t8.b.h("files", m12);
        }
        if (str != null) {
            HashMap hashMap = sn0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = sn0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        sn0Var.R1(sn0Var.S0);
        sn0Var.i0.removeView(qn0Var);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        sn0 sn0Var = this.a;
        if (i10 >= sn0Var.i0.getChildCount()) {
            return null;
        }
        qn0 qn0Var = (qn0) sn0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        qn0Var.c.getLocationInWindow(iArr);
        jv0 jv0Var = new jv0();
        jv0Var.b = iArr[0];
        jv0Var.c = iArr[1];
        jv0Var.d = sn0Var.i0;
        ImageReceiver imageReceiver = qn0Var.c.getImageReceiver();
        jv0Var.a = imageReceiver;
        jv0Var.e = imageReceiver.getBitmapSafe();
        return jv0Var;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final String b0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
