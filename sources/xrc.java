// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
