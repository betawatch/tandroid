package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class z1 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(c2 c2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = c2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                c2Var.q.reset();
                c2Var.b(canvas, true);
                break;
            default:
                c2 c2Var2 = this.b;
                c2Var2.q.reset();
                c2Var2.q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                c2Var2.q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                c2Var2.b(canvas, false);
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
