package tg;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j2 extends b {
    public final /* synthetic */ k2 T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, Context context) {
        super(context);
        this.T1 = k2Var;
    }

    @Override // org.telegram.ui.Components.dt, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.T1.H;
        if (iVar == null || iVar.getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.dt, android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.T1.m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.T1.m();
    }
}
