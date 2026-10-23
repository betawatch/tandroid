package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gt0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class i0 extends i1 {
    public final Path e3;
    public final /* synthetic */ gt0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(gt0 gt0Var, Context context) {
        super(context);
        this.f3 = gt0Var;
        this.e3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.f3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.N1));
        Path path = this.e3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
