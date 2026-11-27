// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xs0 extends EditTextBoldCursor {
    public final /* synthetic */ byte N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(cw9 cw9Var, Context context) {
        super(context);
        this.N1 = (byte) 5;
    }

    @Override // cu3, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.N1) {
            case 4:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.N1) {
            case 0:
                super.onDetachedFromWindow();
                hl.t1(this);
                break;
            case 1:
                super.onDetachedFromWindow();
                hl.t1(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.N1) {
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(64.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.N1) {
            case 2:
                if (isEnabled()) {
                    break;
                }
                break;
            case 5:
                if (isEnabled()) {
                    motionEvent.getAction();
                    break;
                }
                break;
            case 6:
                if (motionEvent.getAction() == 0 && !hl.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 7:
                if (motionEvent.getAction() == 0 && !hl.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xs0(Context context, byte b) {
        super(context);
        this.N1 = b;
    }
}
