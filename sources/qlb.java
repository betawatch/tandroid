// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qlb extends ju3 {
    public final /* synthetic */ rlb i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlb(rlb rlbVar, Context context) {
        super(context);
        this.i2 = rlbVar;
    }

    @Override // cu3, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g44 g44Var = this.i2.J;
        if (g44Var == null || g44Var.getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // cu3, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.i2.m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.i2.m();
    }
}
