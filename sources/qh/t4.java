package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class t4 extends View {
    public final /* synthetic */ e9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(e9 e9Var, Context context) {
        super(context);
        this.a = e9Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        r4 r4Var = this.a.L0;
        if (r4Var != null) {
            r4Var.d(canvas);
        }
    }
}
