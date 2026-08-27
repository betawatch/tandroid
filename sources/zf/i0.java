package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i0 extends i1 {
    public final Path c3;
    public final /* synthetic */ ys0 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ys0 ys0Var, Context context) {
        super(context);
        this.d3 = ys0Var;
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
