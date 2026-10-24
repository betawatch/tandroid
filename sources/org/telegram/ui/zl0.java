package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class zl0 extends cu0 {
    public final /* synthetic */ an0 a;

    public zl0(an0 an0Var) {
        this.a = an0Var;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void B(int i10) {
        an0 an0Var = this.a;
        int i11 = an0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? an0Var.j1 : i11 == 4 ? (SecureDocument) an0Var.k1.get(i10) : i11 == 2 ? an0Var.l1 : i11 == 3 ? an0Var.m1 : (SecureDocument) an0Var.i1.get(i10);
        ym0 ym0Var = (ym0) an0Var.n1.remove(secureDocument);
        if (ym0Var == null) {
            return;
        }
        String m12 = an0.m1(secureDocument);
        int i12 = an0Var.S0;
        String str = null;
        if (i12 == 1) {
            an0Var.j1 = null;
            str = si.o0.h("selfie", m12);
        } else if (i12 == 4) {
            str = si.o0.h("translation", m12);
        } else if (i12 == 2) {
            an0Var.l1 = null;
            str = si.o0.h("front", m12);
        } else if (i12 == 3) {
            an0Var.m1 = null;
            str = si.o0.h("reverse", m12);
        } else if (i12 == 0) {
            str = si.o0.h("files", m12);
        }
        if (str != null) {
            HashMap hashMap = an0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = an0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        an0Var.S1(an0Var.S0);
        an0Var.i0.removeView(ym0Var);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        an0 an0Var = this.a;
        if (i10 >= an0Var.i0.getChildCount()) {
            return null;
        }
        ym0 ym0Var = (ym0) an0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        ym0Var.c.getLocationInWindow(iArr);
        mu0 mu0Var = new mu0();
        mu0Var.b = iArr[0];
        mu0Var.c = iArr[1];
        mu0Var.d = an0Var.i0;
        ImageReceiver imageReceiver = ym0Var.c.getImageReceiver();
        mu0Var.a = imageReceiver;
        mu0Var.e = imageReceiver.getBitmapSafe();
        return mu0Var;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final String b0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
