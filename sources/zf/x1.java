package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x1 extends c5.c {
    public final Path h;
    public final /* synthetic */ z1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(z1 z1Var, Context context) {
        super(context);
        this.n = z1Var;
        this.h = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // c5.c, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        Path path = this.h;
        path.reset();
        z1 z1Var = this.n;
        if (z1Var.d) {
            AndroidUtilities.rectTmp.set(0.0f, -z1Var.I, getMeasuredWidth(), getMeasuredHeight());
        } else {
            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + z1Var.I));
        }
        float dp = z1Var.I - AndroidUtilities.dp(3.0f);
        path.addRoundRect(AndroidUtilities.rectTmp, dp, dp, Path.Direction.CW);
    }
}
