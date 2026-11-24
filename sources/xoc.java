// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class xoc extends FrameLayout {
    public final /* synthetic */ apc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoc(apc apcVar, Context context) {
        super(context);
        this.a = apcVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        trc trcVar = this.a.j;
        trcVar.p(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (trcVar.q()) {
            postInvalidateOnAnimation();
        }
    }
}
