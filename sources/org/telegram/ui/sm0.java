package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class sm0 extends av0 {
    public final /* synthetic */ un0 a;

    public sm0(un0 un0Var) {
        this.a = un0Var;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void B(int i10) {
        un0 un0Var = this.a;
        int i11 = un0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? un0Var.j1 : i11 == 4 ? (SecureDocument) un0Var.k1.get(i10) : i11 == 2 ? un0Var.l1 : i11 == 3 ? un0Var.m1 : (SecureDocument) un0Var.i1.get(i10);
        sn0 sn0Var = (sn0) un0Var.n1.remove(secureDocument);
        if (sn0Var == null) {
            return;
        }
        String m12 = un0.m1(secureDocument);
        int i12 = un0Var.S0;
        String str = null;
        if (i12 == 1) {
            un0Var.j1 = null;
            str = t8.b.h("selfie", m12);
        } else if (i12 == 4) {
            str = t8.b.h("translation", m12);
        } else if (i12 == 2) {
            un0Var.l1 = null;
            str = t8.b.h("front", m12);
        } else if (i12 == 3) {
            un0Var.m1 = null;
            str = t8.b.h("reverse", m12);
        } else if (i12 == 0) {
            str = t8.b.h("files", m12);
        }
        if (str != null) {
            HashMap hashMap = un0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = un0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        un0Var.R1(un0Var.S0);
        un0Var.i0.removeView(sn0Var);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        un0 un0Var = this.a;
        if (i10 >= un0Var.i0.getChildCount()) {
            return null;
        }
        sn0 sn0Var = (sn0) un0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        sn0Var.c.getLocationInWindow(iArr);
        kv0 kv0Var = new kv0();
        kv0Var.b = iArr[0];
        kv0Var.c = iArr[1];
        kv0Var.d = un0Var.i0;
        ImageReceiver imageReceiver = sn0Var.c.getImageReceiver();
        kv0Var.a = imageReceiver;
        kv0Var.e = imageReceiver.getBitmapSafe();
        return kv0Var;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final String a0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
