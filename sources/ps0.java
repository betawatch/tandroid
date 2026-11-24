// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ps0 extends EditTextBoldCursor {
    public final /* synthetic */ byte M1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(js9 js9Var, Context context) {
        super(context);
        this.M1 = (byte) 5;
    }

    @Override // lt3, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 4:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, lt3, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.M1) {
            case 0:
                super.onDetachedFromWindow();
                gl.t1(this);
                break;
            case 1:
                super.onDetachedFromWindow();
                gl.t1(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.M1) {
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(64.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
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
                if (motionEvent.getAction() == 0 && !gl.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 7:
                if (motionEvent.getAction() == 0 && !gl.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps0(Context context, byte b) {
        super(context);
        this.M1 = b;
    }
}
