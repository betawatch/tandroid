// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
