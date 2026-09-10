package pg;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u2 extends b {
    public final /* synthetic */ v2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(v2 v2Var, Context context) {
        super(context);
        this.E = v2Var;
    }

    @Override // org.telegram.ui.Components.hu, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.E.H;
        if (iVar == null || iVar.getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.hu, android.widget.TextView, android.view.View
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
