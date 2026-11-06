package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class s30 extends org.telegram.ui.Cells.z3 {
    @Override // org.telegram.ui.Cells.z3, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (org.telegram.messenger.g0.Q1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(420.0f), View.MeasureSpec.getSize(i7)), TLObject.FLAG_30), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }
}
