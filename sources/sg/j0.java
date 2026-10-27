package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.pt0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j0 extends j1 {
    public final Path o3;
    public final /* synthetic */ pt0 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(pt0 pt0Var, Context context) {
        super(context);
        this.p3 = pt0Var;
        this.o3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.p3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.C1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.C1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.C1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.C1));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
