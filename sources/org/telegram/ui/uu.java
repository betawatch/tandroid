package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class uu extends org.telegram.ui.Components.bd {
    public final /* synthetic */ vu e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(vu vuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = vuVar;
    }

    @Override // org.telegram.ui.Components.bd
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.bd
    public final void d(int i10, boolean z10) {
        int i11;
        xu xuVar = (xu) this.e0.e;
        if (!z10) {
            xuVar.k1();
            return;
        }
        if (i10 < 0 || i10 >= xuVar.g3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            wu[] wuVarArr = xuVar.g3;
            i11 = -1;
            if (i12 >= wuVarArr.length) {
                i12 = -1;
                break;
            } else if (wuVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < xuVar.c3.size()) {
                su suVar = (su) xuVar.c3.get(i13);
                if (suVar != null && suVar.a == 2 && suVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            xuVar.f1(new i2.v(i11, 3), 0, true);
        } else {
            xuVar.k1();
        }
    }

    @Override // org.telegram.ui.Components.bd
    public final int e() {
        return 10;
    }
}
