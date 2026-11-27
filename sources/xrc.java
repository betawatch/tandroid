// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
