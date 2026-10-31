package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v5 extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ w5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(w5 w5Var, Context context) {
        super(context);
        this.e = w5Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        w5 w5Var = this.e;
        FrameLayout frameLayout = i10 <= -1 ? w5Var.b : i10 >= 1 ? w5Var.f : w5Var.d;
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - org.telegram.messenger.i0.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        w5 w5Var = this.e;
        int floor = (int) Math.floor(w5Var.r);
        RectF rectF = this.a;
        a(rectF, floor);
        int ceil = (int) Math.ceil(w5Var.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f7 = w5Var.r;
        float floor2 = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.c;
        org.telegram.messenger.i0.Z1(rectF, rectF2, floor2, rectF3);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, i0.b.f(w5Var.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(r12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
