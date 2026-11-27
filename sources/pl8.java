// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class pl8 extends em8 {
    public final /* synthetic */ ql8 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl8(ql8 ql8Var, Context context) {
        super(context);
        this.O = ql8Var;
    }

    @Override // em8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        rl8 rl8Var = this.O.d;
        if (this.r.getVisibility() == 0) {
            RectF rectF = hl.P;
            rectF.set(r1.getLeft(), r1.getTop(), r1.getRight(), r1.getBottom());
            rl8Var.n.o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, rl8Var.n.P);
            canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), rl8Var.n.o0.f);
        }
        super.dispatchDraw(canvas);
    }
}
