package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w1 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(z1 z1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = z1Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                z1 z1Var = this.b;
                z1Var.q.reset();
                z1Var.b(canvas, true);
                break;
            default:
                z1 z1Var2 = this.b;
                z1Var2.q.reset();
                z1Var2.q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.i0.m);
                z1Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                z1Var2.b(canvas, false);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, i11);
                this.b.g();
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
