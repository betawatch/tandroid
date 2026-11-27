// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class p56 extends u1 {
    public final /* synthetic */ byte b = 1;

    public /* synthetic */ p56(Context context) {
        super(context, (byte) 9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.b) {
            case 0:
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                invalidate();
                break;
        }
    }

    public p56(v56 v56Var, Context context) {
        super(context, (byte) 9);
    }
}
