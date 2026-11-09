package org.telegram.utils.twidget;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class l0 {
    public final ArrayList a = new ArrayList();

    public final synchronized boolean a(int i7, int i10, boolean z9) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.a.size()) {
                break;
            }
            int[] iArr = (int[]) this.a.get(i11);
            if (iArr[0] != i7) {
                i11++;
            } else {
                if (iArr[1] == i10 && iArr[2] == z9 && i11 == 0) {
                    return false;
                }
                this.a.remove(i11);
            }
        }
        this.a.add(0, new int[]{i7, i10, z9 ? 1 : 0});
        while (this.a.size() > 4) {
            ArrayList arrayList = this.a;
            arrayList.remove(arrayList.size() - 1);
        }
        return true;
    }
}
