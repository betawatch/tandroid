// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sy5 extends gv7 {
    public final Path o3;
    public final /* synthetic */ hc8 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy5(hc8 hc8Var, Context context) {
        super(context);
        this.p3 = hc8Var;
        this.o3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.p3.getBarView();
        RectF rectF = hl.P;
        rectF.set(hl.U1(r0.x1, barView.getLeft() - getLeft(), 0), hl.U1(r0.x1, barView.getTop() - getTop(), 0), hl.U1(r0.x1, barView.getRight() - getLeft(), getWidth()), hl.U1(r0.x1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, hl.L(32.0f), hl.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
