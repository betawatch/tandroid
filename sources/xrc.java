// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xrc extends zl3 {
    public final /* synthetic */ yrc M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrc(yrc yrcVar, Context context) {
        super(context);
        this.M = yrcVar;
    }

    @Override // zl3, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.M.y && super.onTouchEvent(motionEvent);
    }
}
