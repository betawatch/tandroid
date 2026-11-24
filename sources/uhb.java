// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uhb extends st3 {
    public final /* synthetic */ vhb h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhb(vhb vhbVar, Context context) {
        super(context);
        this.h2 = vhbVar;
    }

    @Override // lt3, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k34 k34Var = this.h2.J;
        if (k34Var == null || k34Var.getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // lt3, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h2.m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.h2.m();
    }
}
