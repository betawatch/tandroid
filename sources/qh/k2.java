package qh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class k2 extends sl0 {
    public final /* synthetic */ z2 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(z2 z2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = z2Var;
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
