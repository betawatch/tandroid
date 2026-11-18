package org.telegram.utils.twidget;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class l0 {
    public final ArrayList a = new ArrayList();

    public final synchronized boolean a(int i7, int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.a.size()) {
                break;
            }
            int[] iArr = (int[]) this.a.get(i11);
            if (iArr[0] != i7) {
                i11++;
            } else {
                if (iArr[1] == i10 && iArr[2] == z10 && i11 == 0) {
                    return false;
                }
                this.a.remove(i11);
            }
        }
        this.a.add(0, new int[]{i7, i10, z10 ? 1 : 0});
        while (this.a.size() > 4) {
            ArrayList arrayList = this.a;
            arrayList.remove(arrayList.size() - 1);
        }
        return true;
    }
}
