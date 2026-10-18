package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ui {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ sn d;

    public ui(sn snVar, boolean z10, SparseArray sparseArray) {
        this.d = snVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        sn snVar = this.d;
        int i11 = i10 - snVar.A0.J;
        if (i11 < 0 || i11 >= snVar.u6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) snVar.u6.get(i11);
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
        s4.b1 K;
        sn snVar = this.d;
        ArrayList arrayList = snVar.u6;
        SparseArray[] sparseArrayArr = snVar.W5;
        int i11 = i10 - snVar.A0.J;
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
                        K = snVar.x0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.u1) {
                                sn.c2(snVar, view, false, f7, f10);
                                return;
                            }
                        }
                        snVar.A6(messageObject, false, true);
                        snVar.hc();
                        snVar.ad(false);
                    }
                }
                this.a = false;
                K = snVar.x0.K(i10);
                if (K != null) {
                }
                snVar.A6(messageObject, false, true);
                snVar.hc();
                snVar.ad(false);
            }
        }
    }
}
