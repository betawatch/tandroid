package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.jt0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j0 extends j1 {
    public final Path h3;
    public final /* synthetic */ jt0 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(jt0 jt0Var, Context context) {
        super(context);
        this.i3 = jt0Var;
        this.h3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.i3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.N1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.N1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.N1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.N1));
        Path path = this.h3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
