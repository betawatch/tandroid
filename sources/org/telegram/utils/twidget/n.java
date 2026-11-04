package org.telegram.utils.twidget;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class n {
    public final ArrayList a = new ArrayList();

    public final synchronized boolean a(int i3, int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.a.size()) {
                break;
            }
            int[] iArr = (int[]) this.a.get(i11);
            if (iArr[0] != i3) {
                i11++;
            } else {
                if (iArr[1] == i10 && iArr[2] == z10 && i11 == 0) {
                    return false;
                }
                this.a.remove(i11);
            }
        }
        this.a.add(0, new int[]{i3, i10, z10 ? 1 : 0});
        while (this.a.size() > 4) {
            ArrayList arrayList = this.a;
            arrayList.remove(arrayList.size() - 1);
        }
        return true;
    }
}
