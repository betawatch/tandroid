package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qu extends org.telegram.ui.Components.wc {
    public final /* synthetic */ ru b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu(ru ruVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.b0 = ruVar;
    }

    @Override // org.telegram.ui.Components.wc
    public final int c() {
        return 216;
    }

    @Override // org.telegram.ui.Components.wc
    public final void d(int i10, boolean z4) {
        int i11;
        tu tuVar = (tu) this.b0.e;
        if (!z4) {
            tuVar.j1();
            return;
        }
        if (i10 < 0 || i10 >= tuVar.d3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            su[] suVarArr = tuVar.d3;
            i11 = -1;
            if (i12 >= suVarArr.length) {
                i12 = -1;
                break;
            } else if (suVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < tuVar.Z2.size()) {
                ou ouVar = (ou) tuVar.Z2.get(i13);
                if (ouVar != null && ouVar.a == 2 && ouVar.h == i12) {
                    i11 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            tuVar.e1(new d4.b(i11, 3), 0, true);
        } else {
            tuVar.j1();
        }
    }

    @Override // org.telegram.ui.Components.wc
    public final int e() {
        return 10;
    }
}
