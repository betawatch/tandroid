package org.telegram.utils.twidget;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class n {
    public final ArrayList a = new ArrayList();

    public final synchronized boolean a(int i10, int i11, boolean z10) {
        int i12 = 0;
        while (true) {
            if (i12 >= this.a.size()) {
                break;
            }
            int[] iArr = (int[]) this.a.get(i12);
            if (iArr[0] != i10) {
                i12++;
            } else {
                if (iArr[1] == i11 && iArr[2] == z10 && i12 == 0) {
                    return false;
                }
                this.a.remove(i12);
            }
        }
        this.a.add(0, new int[]{i10, i11, z10 ? 1 : 0});
        while (this.a.size() > 4) {
            ArrayList arrayList = this.a;
            arrayList.remove(arrayList.size() - 1);
        }
        return true;
    }
}
