package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n3 extends jg.n1 {
    public final Path n3;
    public final /* synthetic */ s7 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(s7 s7Var, Context context) {
        super(context);
        this.o3 = s7Var;
        this.n3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.o3.getBarView();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(org.telegram.messenger.i0.W1(r0.m1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.i0.W1(r0.m1, barView.getTop() - getTop(), 0), org.telegram.messenger.i0.W1(r0.m1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.i0.W1(r0.m1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.n3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
