package yf;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u2 extends b {
    public final /* synthetic */ v2 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(v2 v2Var, Context context) {
        super(context);
        this.A = v2Var;
    }

    @Override // org.telegram.ui.Components.ot, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.A.D;
        if (iVar == null || iVar.getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.A.m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.A.m();
    }
}
