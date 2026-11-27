// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class q56 extends EditText {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q56(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                break;
            default:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
