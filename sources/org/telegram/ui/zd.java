package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zd extends EditTextBoldCursor {
    public final /* synthetic */ int G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd(Context context, int i10) {
        super(context);
        this.G1 = i10;
    }

    @Override // org.telegram.ui.Components.qt, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 5:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.view.View
    public void onDetachedFromWindow() {
        switch (this.G1) {
            case 0:
                super.onDetachedFromWindow();
                org.telegram.messenger.i0.v1(this);
                break;
            case 4:
                super.onDetachedFromWindow();
                org.telegram.messenger.i0.v1(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.G1) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 2:
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.i0.J3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 3:
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.i0.J3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 6:
                if (isEnabled()) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
