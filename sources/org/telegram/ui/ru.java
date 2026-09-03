package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ru extends org.telegram.ui.Components.wc {
    public final /* synthetic */ su b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(su suVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.b0 = suVar;
    }

    @Override // org.telegram.ui.Components.wc
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.wc
    public final void d(int i10, boolean z4) {
        int i11;
        uu uuVar = (uu) this.b0.e;
        if (!z4) {
            uuVar.i1();
            return;
        }
        if (i10 < 0 || i10 >= uuVar.d3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            tu[] tuVarArr = uuVar.d3;
            i11 = -1;
            if (i12 >= tuVarArr.length) {
                i12 = -1;
                break;
            } else if (tuVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < uuVar.Z2.size()) {
                pu puVar = (pu) uuVar.Z2.get(i13);
                if (puVar != null && puVar.a == 2 && puVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            uuVar.d1(new d4.b(i11, 3), 0, true);
        } else {
            uuVar.i1();
        }
    }

    @Override // org.telegram.ui.Components.wc
    public final int e() {
        return 10;
    }
}
