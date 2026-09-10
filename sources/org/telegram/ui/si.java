package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class si {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ eo d;

    public si(eo eoVar, boolean z10, SparseArray sparseArray) {
        this.d = eoVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        eo eoVar = this.d;
        int i11 = i10 - eoVar.A0.J;
        if (i11 < 0 || i11 >= eoVar.u6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) eoVar.u6.get(i11);
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
        eo eoVar = this.d;
        ArrayList arrayList = eoVar.u6;
        SparseArray[] sparseArrayArr = eoVar.W5;
        int i11 = i10 - eoVar.A0.J;
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
                        K = eoVar.x0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.t1) {
                                eo.b2(eoVar, view, false, f7, f10);
                                return;
                            }
                        }
                        eoVar.x6(messageObject, false, true);
                        eoVar.dc();
                        eoVar.Wc(false);
                    }
                }
                this.a = false;
                K = eoVar.x0.K(i10);
                if (K != null) {
                }
                eoVar.x6(messageObject, false, true);
                eoVar.dc();
                eoVar.Wc(false);
            }
        }
    }
}
