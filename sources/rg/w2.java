package rg;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class w2 extends b {
    public final /* synthetic */ x2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, Context context) {
        super(context);
        this.E = x2Var;
    }

    @Override // org.telegram.ui.Components.bu, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        j jVar = this.E.H;
        if (jVar == null || jVar.getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.bu, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.E.m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.E.m();
    }
}
