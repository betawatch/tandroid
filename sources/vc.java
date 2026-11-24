// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vc extends EditTextBoldCursor {
    public final /* synthetic */ byte M1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(lu9 lu9Var, Context context) {
        super(context);
        this.M1 = (byte) 6;
    }

    @Override // vu3, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 5:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.M1) {
            case 1:
                super.onDetachedFromWindow();
                gm.t1(this);
                break;
            case 2:
                super.onDetachedFromWindow();
                gm.t1(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.M1) {
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(64.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 0:
                if (motionEvent.getAction() == 1 && !hasFocus()) {
                    requestFocus();
                    gm.E3(this);
                }
                break;
            case 3:
                if (isEnabled()) {
                    break;
                }
                break;
            case 6:
                if (isEnabled()) {
                    motionEvent.getAction();
                    break;
                }
                break;
            case 7:
                if (motionEvent.getAction() == 0 && !gm.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 8:
                if (motionEvent.getAction() == 0 && !gm.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc(Context context, byte b) {
        super(context);
        this.M1 = b;
    }
}
