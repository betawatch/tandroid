// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class xmc extends FrameLayout {
    public final /* synthetic */ anc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmc(anc ancVar, Context context) {
        super(context);
        this.a = ancVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        spc spcVar = this.a.j;
        spcVar.p(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (spcVar.q()) {
            postInvalidateOnAnimation();
        }
    }
}
