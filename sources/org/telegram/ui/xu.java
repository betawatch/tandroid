package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class xu extends org.telegram.ui.Components.fd {
    public final /* synthetic */ yu e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(yu yuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.e0 = yuVar;
    }

    @Override // org.telegram.ui.Components.fd
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.fd
    public final void d(int i10, boolean z10) {
        int i11;
        av avVar = (av) this.e0.e;
        if (!z10) {
            avVar.j1();
            return;
        }
        if (i10 < 0 || i10 >= avVar.e3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            zu[] zuVarArr = avVar.e3;
            i11 = -1;
            if (i12 >= zuVarArr.length) {
                i12 = -1;
                break;
            } else if (zuVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < avVar.a3.size()) {
                vu vuVar = (vu) avVar.a3.get(i13);
                if (vuVar != null && vuVar.a == 2 && vuVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            avVar.e1(new i2.v(i11, 7), 0, true);
        } else {
            avVar.j1();
        }
    }

    @Override // org.telegram.ui.Components.fd
    public final int e() {
        return 10;
    }
}
