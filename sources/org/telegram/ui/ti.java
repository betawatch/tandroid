package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ti {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ un d;

    public ti(un unVar, boolean z10, SparseArray sparseArray) {
        this.d = unVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        un unVar = this.d;
        int i11 = i10 - unVar.A0.J;
        if (i11 < 0 || i11 >= unVar.G6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) unVar.G6.get(i11);
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
        s4.e1 K;
        un unVar = this.d;
        ArrayList arrayList = unVar.G6;
        SparseArray[] sparseArrayArr = unVar.i6;
        int i11 = i10 - unVar.A0.J;
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
                        K = unVar.x0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.s1) {
                                un.e2(unVar, view, false, f7, f10);
                                return;
                            }
                        }
                        unVar.C6(messageObject, false, true);
                        unVar.qc();
                        unVar.jd(false);
                    }
                }
                this.a = false;
                K = unVar.x0.K(i10);
                if (K != null) {
                }
                unVar.C6(messageObject, false, true);
                unVar.qc();
                unVar.jd(false);
            }
        }
    }
}
