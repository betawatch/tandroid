package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i0 extends d1 {
    public final Path o3;
    public final /* synthetic */ vp0 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(vp0 vp0Var, Context context) {
        super(context);
        this.p3 = vp0Var;
        this.o3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.p3.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(r0.x1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(r0.x1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(r0.x1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(r0.x1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
