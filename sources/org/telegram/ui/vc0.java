package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vc0 extends ViewSwitcher {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc0(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), TLObject.FLAG_31));
                break;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), TLObject.FLAG_31));
                break;
        }
    }
}
