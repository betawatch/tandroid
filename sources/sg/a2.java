package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.l4;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a2 extends l4 {
    public final Path h;
    public final /* synthetic */ c2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(c2 c2Var, Context context) {
        super(context);
        this.n = c2Var;
        this.h = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.l4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.h;
        path.reset();
        c2 c2Var = this.n;
        if (c2Var.d) {
            AndroidUtilities.rectTmp.set(0.0f, -c2Var.M, getMeasuredWidth(), getMeasuredHeight());
        } else {
            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + c2Var.M));
        }
        float dp = c2Var.M - AndroidUtilities.dp(3.0f);
        path.addRoundRect(AndroidUtilities.rectTmp, dp, dp, Path.Direction.CW);
    }
}
