package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class h4 extends eg.c2 {
    public final Path d3;
    public final /* synthetic */ f9 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(f9 f9Var, Context context) {
        super(context);
        this.e3 = f9Var;
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
