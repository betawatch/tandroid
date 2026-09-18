package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ri {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ bo d;

    public ri(bo boVar, boolean z10, SparseArray sparseArray) {
        this.d = boVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        bo boVar = this.d;
        int i11 = i10 - boVar.A0.J;
        if (i11 < 0 || i11 >= boVar.u6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) boVar.u6.get(i11);
        if (messageObject.contentType != 0) {
            return false;
        }
        SparseArray sparseArray = this.c;
        boolean z10 = this.b;
        if (z10 || sparseArray.get(messageObject.getId(), null) != null) {
            return z10 && sparseArray.get(messageObject.getId(), null) != null;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10, boolean z10, float f7, float f10) {
        s4.c1 L;
        bo boVar = this.d;
        ArrayList arrayList = boVar.u6;
        SparseArray[] sparseArrayArr = boVar.W5;
        int i11 = i10 - boVar.A0.J;
        if (this.b) {
            z10 = !z10;
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(i11);
        if (!z10 || (sparseArrayArr[0].indexOfKey(messageObject.getId()) < 0 && sparseArrayArr[1].indexOfKey(messageObject.getId()) < 0)) {
            if ((z10 || sparseArrayArr[0].indexOfKey(messageObject.getId()) >= 0 || sparseArrayArr[1].indexOfKey(messageObject.getId()) >= 0) && messageObject.contentType == 0) {
                if (z10) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        this.a = true;
                        L = boVar.x0.L(i10);
                        if (L != null) {
                            View view = L.a;
                            if (view instanceof org.telegram.ui.Cells.t1) {
                                bo.b2(boVar, view, false, f7, f10);
                                return;
                            }
                        }
                        boVar.x6(messageObject, false, true);
                        boVar.dc();
                        boVar.Wc(false);
                    }
                }
                this.a = false;
                L = boVar.x0.L(i10);
                if (L != null) {
                }
                boVar.x6(messageObject, false, true);
                boVar.dc();
                boVar.Wc(false);
            }
        }
    }
}
