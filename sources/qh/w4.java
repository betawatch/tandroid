package qh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class w4 extends FrameLayout {
    public final /* synthetic */ e9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(e9 e9Var, Context context) {
        super(context);
        this.a = e9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.j2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
