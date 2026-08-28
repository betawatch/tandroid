package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wl0 extends rt0 {
    public final /* synthetic */ wm0 a;

    public wl0(wm0 wm0Var) {
        this.a = wm0Var;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void B(int i9) {
        wm0 wm0Var = this.a;
        int i10 = wm0Var.O0;
        SecureDocument secureDocument = i10 == 1 ? wm0Var.f1 : i10 == 4 ? (SecureDocument) wm0Var.g1.get(i9) : i10 == 2 ? wm0Var.h1 : i10 == 3 ? wm0Var.i1 : (SecureDocument) wm0Var.e1.get(i9);
        um0 um0Var = (um0) wm0Var.j1.remove(secureDocument);
        if (um0Var == null) {
            return;
        }
        String n12 = wm0.n1(secureDocument);
        int i11 = wm0Var.O0;
        String str = null;
        if (i11 == 1) {
            wm0Var.f1 = null;
            str = ta.b.d("selfie", n12);
        } else if (i11 == 4) {
            str = ta.b.d("translation", n12);
        } else if (i11 == 2) {
            wm0Var.h1 = null;
            str = ta.b.d("front", n12);
        } else if (i11 == 3) {
            wm0Var.i1 = null;
            str = ta.b.d("reverse", n12);
        } else if (i11 == 0) {
            str = ta.b.d("files", n12);
        }
        if (str != null) {
            HashMap hashMap = wm0Var.t1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = wm0Var.u1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        wm0Var.S1(wm0Var.O0);
        wm0Var.e0.removeView(um0Var);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        if (i9 < 0) {
            return null;
        }
        wm0 wm0Var = this.a;
        if (i9 >= wm0Var.e0.getChildCount()) {
            return null;
        }
        um0 um0Var = (um0) wm0Var.e0.getChildAt(i9);
        int[] iArr = new int[2];
        um0Var.c.getLocationInWindow(iArr);
        bu0 bu0Var = new bu0();
        bu0Var.b = iArr[0];
        bu0Var.c = iArr[1];
        bu0Var.d = wm0Var.e0;
        ImageReceiver imageReceiver = um0Var.c.getImageReceiver();
        bu0Var.a = imageReceiver;
        bu0Var.e = imageReceiver.getBitmapSafe();
        return bu0Var;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final String a0() {
        return this.a.O0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
