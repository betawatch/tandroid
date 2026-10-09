package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ru extends org.telegram.ui.Components.gd {
    public final /* synthetic */ su e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(su suVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = suVar;
    }

    @Override // org.telegram.ui.Components.gd
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.gd
    public final void d(int i10, boolean z10) {
        int i11;
        uu uuVar = (uu) this.e0.e;
        if (!z10) {
            uuVar.j1();
            return;
        }
        if (i10 < 0 || i10 >= uuVar.e3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            tu[] tuVarArr = uuVar.e3;
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
            if (i13 < uuVar.a3.size()) {
                pu puVar = (pu) uuVar.a3.get(i13);
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
            uuVar.e1(new i2.w(i11, 7), 0, true);
        } else {
            uuVar.j1();
        }
    }

    @Override // org.telegram.ui.Components.gd
    public final int e() {
        return 10;
    }
}
