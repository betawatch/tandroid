// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class pw7 extends gv7 {
    public final Path o3;
    public final /* synthetic */ vab p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw7(vab vabVar, Context context) {
        super(context);
        this.p3 = vabVar;
        this.o3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.p3.getBarView();
        RectF rectF = hl.P;
        rectF.set(hl.U1(r0.n1, barView.getLeft() - getLeft(), 0), hl.U1(r0.n1, barView.getTop() - getTop(), 0), hl.U1(r0.n1, barView.getRight() - getLeft(), getWidth()), hl.U1(r0.n1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, hl.L(32.0f), hl.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
