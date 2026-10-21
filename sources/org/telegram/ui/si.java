package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class si {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ qn d;

    public si(qn qnVar, boolean z10, SparseArray sparseArray) {
        this.d = qnVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        qn qnVar = this.d;
        int i11 = i10 - qnVar.A0.J;
        if (i11 < 0 || i11 >= qnVar.u6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) qnVar.u6.get(i11);
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
        qn qnVar = this.d;
        ArrayList arrayList = qnVar.u6;
        SparseArray[] sparseArrayArr = qnVar.W5;
        int i11 = i10 - qnVar.A0.J;
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
                        K = qnVar.x0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.u1) {
                                qn.c2(qnVar, view, false, f7, f10);
                                return;
                            }
                        }
                        qnVar.A6(messageObject, false, true);
                        qnVar.ic();
                        qnVar.bd(false);
                    }
                }
                this.a = false;
                K = qnVar.x0.K(i10);
                if (K != null) {
                }
                qnVar.A6(messageObject, false, true);
                qnVar.ic();
                qnVar.bd(false);
            }
        }
    }
}
