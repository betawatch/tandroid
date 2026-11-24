// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zj4 extends ImageButton {
    public final /* synthetic */ ek4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj4(ek4 ek4Var, Context context) {
        super(context);
        this.a = ek4Var;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
