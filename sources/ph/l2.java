package ph;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class l2 extends sl0 {
    public final /* synthetic */ a3 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(a3 a3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U2 = a3Var;
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.U2.H) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.U2.H) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
