package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wr {
    public ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public org.telegram.ui.ActionBar.c1 b;
    public org.telegram.ui.ActionBar.g1[] c;

    public final void a(float f10, boolean z4) {
        org.telegram.ui.ActionBar.g1[] g1VarArr = this.c;
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            if (!z4 || ((i10 != 0 || Math.abs(f10 - 0.2f) >= 0.01f) && ((i10 != 1 || Math.abs(f10 - 0.5f) >= 0.1f) && ((i10 != 2 || Math.abs(f10 - 1.0f) >= 0.1f) && ((i10 != 3 || Math.abs(f10 - 1.5f) >= 0.1f) && (i10 != 4 || Math.abs(f10 - 2.0f) >= 0.1f)))))) {
                g1VarArr[i10].c(-328966, -328966);
            } else {
                g1VarArr[i10].c(-9718023, -9718023);
            }
        }
        this.b.d(f10, true);
    }
}
