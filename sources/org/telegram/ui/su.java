package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class su extends org.telegram.ui.Components.bd {
    public final /* synthetic */ tu e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(tu tuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = tuVar;
    }

    @Override // org.telegram.ui.Components.bd
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.bd
    public final void d(int i10, boolean z10) {
        int i11;
        vu vuVar = (vu) this.e0.e;
        if (!z10) {
            vuVar.j1();
            return;
        }
        if (i10 < 0 || i10 >= vuVar.g3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            uu[] uuVarArr = vuVar.g3;
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
            if (i13 < vuVar.c3.size()) {
                qu quVar = (qu) vuVar.c3.get(i13);
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
            vuVar.e1(new i2.v(i11, 3), 0, true);
        } else {
            vuVar.j1();
        }
    }

    @Override // org.telegram.ui.Components.bd
    public final int e() {
        return 10;
    }
}
