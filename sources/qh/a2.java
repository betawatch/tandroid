package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class a2 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(d2 d2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = d2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                d2 d2Var = this.b;
                d2Var.q.reset();
                d2Var.b(canvas, true);
                break;
            default:
                d2 d2Var2 = this.b;
                d2Var2.q.reset();
                d2Var2.q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                d2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                d2Var2.b(canvas, false);
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
