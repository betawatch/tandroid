package ph;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class l2 extends rl0 {
    public final /* synthetic */ a3 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(a3 a3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U2 = a3Var;
    }

    @Override // org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.U2.H) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.U2.H) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
