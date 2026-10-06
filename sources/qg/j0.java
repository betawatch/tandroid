package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vt0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class j0 extends i1 {
    public final Path n3;
    public final /* synthetic */ vt0 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(vt0 vt0Var, Context context) {
        super(context);
        this.o3 = vt0Var;
        this.n3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.o3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.N1));
        Path path = this.n3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
