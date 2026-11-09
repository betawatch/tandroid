package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.wp0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d0 extends y0 {
    public final Path n3;
    public final /* synthetic */ wp0 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(wp0 wp0Var, Context context) {
        super(context);
        this.o3 = wp0Var;
        this.n3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.o3.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(r0.w1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(r0.w1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(r0.w1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(r0.w1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.n3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
