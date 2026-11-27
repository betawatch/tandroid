// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
