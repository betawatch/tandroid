package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class su extends org.telegram.ui.Components.wc {
    public final /* synthetic */ tu b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(tu tuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.b0 = tuVar;
    }

    @Override // org.telegram.ui.Components.wc
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.wc
    public final void d(int i10, boolean z4) {
        int i11;
        vu vuVar = (vu) this.b0.e;
        if (!z4) {
            vuVar.i1();
            return;
        }
        if (i10 < 0 || i10 >= vuVar.d3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            uu[] uuVarArr = vuVar.d3;
            i11 = -1;
            if (i12 >= uuVarArr.length) {
                i12 = -1;
                break;
            } else if (uuVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < vuVar.Z2.size()) {
                qu quVar = (qu) vuVar.Z2.get(i13);
                if (quVar != null && quVar.a == 2 && quVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            vuVar.d1(new d4.b(i11, 3), 0, true);
        } else {
            vuVar.i1();
        }
    }

    @Override // org.telegram.ui.Components.wc
    public final int e() {
        return 10;
    }
}
