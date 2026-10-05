package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class su extends org.telegram.ui.Components.ed {
    public final /* synthetic */ tu e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(tu tuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = tuVar;
    }

    @Override // org.telegram.ui.Components.ed
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.ed
    public final void d(int i10, boolean z10) {
        int i11;
        vu vuVar = (vu) this.e0.e;
        if (!z10) {
            vuVar.l1();
            return;
        }
        if (i10 < 0 || i10 >= vuVar.n3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            uu[] uuVarArr = vuVar.n3;
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
            if (i13 < vuVar.j3.size()) {
                qu quVar = (qu) vuVar.j3.get(i13);
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
            vuVar.e1(new i2.w(i11, 7), 0, true);
        } else {
            vuVar.l1();
        }
    }

    @Override // org.telegram.ui.Components.ed
    public final int e() {
        return 10;
    }
}
