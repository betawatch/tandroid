package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.au0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class l0 extends l1 {
    public final Path g3;
    public final /* synthetic */ au0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(au0 au0Var, Context context) {
        super(context);
        this.h3 = au0Var;
        this.g3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.h3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.N1));
        Path path = this.g3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
