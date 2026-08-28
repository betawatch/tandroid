package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i0 extends i1 {
    public final Path c3;
    public final /* synthetic */ xs0 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(xs0 xs0Var, Context context) {
        super(context);
        this.d3 = xs0Var;
        this.c3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.d3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.J1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.J1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.J1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.J1));
        Path path = this.c3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
