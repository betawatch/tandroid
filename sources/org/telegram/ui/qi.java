package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class qi {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ zn d;

    public qi(zn znVar, boolean z10, SparseArray sparseArray) {
        this.d = znVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        zn znVar = this.d;
        int i11 = i10 - znVar.A0.J;
        if (i11 < 0 || i11 >= znVar.u6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) znVar.u6.get(i11);
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
        zn znVar = this.d;
        ArrayList arrayList = znVar.u6;
        SparseArray[] sparseArrayArr = znVar.W5;
        int i11 = i10 - znVar.A0.J;
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
                        L = znVar.x0.L(i10);
                        if (L != null) {
                            View view = L.a;
                            if (view instanceof org.telegram.ui.Cells.u1) {
                                zn.b2(znVar, view, false, f7, f10);
                                return;
                            }
                        }
                        znVar.x6(messageObject, false, true);
                        znVar.dc();
                        znVar.Wc(false);
                    }
                }
                this.a = false;
                L = znVar.x0.L(i10);
                if (L != null) {
                }
                znVar.x6(messageObject, false, true);
                znVar.dc();
                znVar.Wc(false);
            }
        }
    }
}
