package tg;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l2 extends b {
    public final /* synthetic */ m2 Z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, Context context) {
        super(context);
        this.Z1 = m2Var;
    }

    @Override // org.telegram.ui.Components.pt, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.Z1.I;
        if (iVar == null || iVar.getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pt, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.Z1.m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.Z1.m();
    }
}
