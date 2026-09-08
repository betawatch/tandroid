package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qi {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ co d;

    public qi(co coVar, boolean z10, SparseArray sparseArray) {
        this.d = coVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        co coVar = this.d;
        int i11 = i10 - coVar.A0.J;
        if (i11 < 0 || i11 >= coVar.u6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) coVar.u6.get(i11);
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
        s4.c1 K;
        co coVar = this.d;
        ArrayList arrayList = coVar.u6;
        SparseArray[] sparseArrayArr = coVar.W5;
        int i11 = i10 - coVar.A0.J;
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
                        K = coVar.x0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.t1) {
                                co.b2(coVar, view, false, f7, f10);
                                return;
                            }
                        }
                        coVar.x6(messageObject, false, true);
                        coVar.dc();
                        coVar.Wc(false);
                    }
                }
                this.a = false;
                K = coVar.x0.K(i10);
                if (K != null) {
                }
                coVar.x6(messageObject, false, true);
                coVar.dc();
                coVar.Wc(false);
            }
        }
    }
}
