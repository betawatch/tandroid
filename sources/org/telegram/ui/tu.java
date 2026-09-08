package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class tu extends org.telegram.ui.Components.ed {
    public final /* synthetic */ uu e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(uu uuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = uuVar;
    }

    @Override // org.telegram.ui.Components.ed
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.ed
    public final void d(int i10, boolean z10) {
        int i11;
        wu wuVar = (wu) this.e0.e;
        if (!z10) {
            wuVar.i1();
            return;
        }
        if (i10 < 0 || i10 >= wuVar.g3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            vu[] vuVarArr = wuVar.g3;
            i11 = -1;
            if (i12 >= vuVarArr.length) {
                i12 = -1;
                break;
            } else if (vuVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < wuVar.c3.size()) {
                ru ruVar = (ru) wuVar.c3.get(i13);
                if (ruVar != null && ruVar.a == 2 && ruVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            wuVar.d1(new i2.w(i11, 3), 0, true);
        } else {
            wuVar.i1();
        }
    }

    @Override // org.telegram.ui.Components.ed
    public final int e() {
        return 10;
    }
}
