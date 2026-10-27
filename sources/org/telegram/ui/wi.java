package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wi {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ wn d;

    public wi(wn wnVar, boolean z10, SparseArray sparseArray) {
        this.d = wnVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        wn wnVar = this.d;
        int i11 = i10 - wnVar.A0.J;
        if (i11 < 0 || i11 >= wnVar.K6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) wnVar.K6.get(i11);
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
        wn wnVar = this.d;
        ArrayList arrayList = wnVar.K6;
        SparseArray[] sparseArrayArr = wnVar.m6;
        int i11 = i10 - wnVar.A0.J;
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
                        K = wnVar.x0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.s1) {
                                wn.f2(wnVar, view, false, f7, f10);
                                return;
                            }
                        }
                        wnVar.D6(messageObject, false, true);
                        wnVar.uc();
                        wnVar.nd(false);
                    }
                }
                this.a = false;
                K = wnVar.x0.K(i10);
                if (K != null) {
                }
                wnVar.D6(messageObject, false, true);
                wnVar.uc();
                wnVar.nd(false);
            }
        }
    }
}
