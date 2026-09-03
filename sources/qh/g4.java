package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class g4 extends eg.c2 {
    public final Path d3;
    public final /* synthetic */ e9 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(e9 e9Var, Context context) {
        super(context);
        this.e3 = e9Var;
        this.d3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.e3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.A1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.A1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.A1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.A1));
        Path path = this.d3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
