package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xl0 extends st0 {
    public final /* synthetic */ xm0 a;

    public xl0(xm0 xm0Var) {
        this.a = xm0Var;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void B(int i10) {
        xm0 xm0Var = this.a;
        int i11 = xm0Var.O0;
        SecureDocument secureDocument = i11 == 1 ? xm0Var.f1 : i11 == 4 ? (SecureDocument) xm0Var.g1.get(i10) : i11 == 2 ? xm0Var.h1 : i11 == 3 ? xm0Var.i1 : (SecureDocument) xm0Var.e1.get(i10);
        vm0 vm0Var = (vm0) xm0Var.j1.remove(secureDocument);
        if (vm0Var == null) {
            return;
        }
        String n12 = xm0.n1(secureDocument);
        int i12 = xm0Var.O0;
        String str = null;
        if (i12 == 1) {
            xm0Var.f1 = null;
            str = s3.c.e("selfie", n12);
        } else if (i12 == 4) {
            str = s3.c.e("translation", n12);
        } else if (i12 == 2) {
            xm0Var.h1 = null;
            str = s3.c.e("front", n12);
        } else if (i12 == 3) {
            xm0Var.i1 = null;
            str = s3.c.e("reverse", n12);
        } else if (i12 == 0) {
            str = s3.c.e("files", n12);
        }
        if (str != null) {
            HashMap hashMap = xm0Var.t1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = xm0Var.u1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        xm0Var.S1(xm0Var.O0);
        xm0Var.e0.removeView(vm0Var);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        xm0 xm0Var = this.a;
        if (i10 >= xm0Var.e0.getChildCount()) {
            return null;
        }
        vm0 vm0Var = (vm0) xm0Var.e0.getChildAt(i10);
        int[] iArr = new int[2];
        vm0Var.c.getLocationInWindow(iArr);
        cu0 cu0Var = new cu0();
        cu0Var.b = iArr[0];
        cu0Var.c = iArr[1];
        cu0Var.d = xm0Var.e0;
        ImageReceiver imageReceiver = vm0Var.c.getImageReceiver();
        cu0Var.a = imageReceiver;
        cu0Var.e = imageReceiver.getBitmapSafe();
        return cu0Var;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final String a0() {
        return this.a.O0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
