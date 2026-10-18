package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.it0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class d0 extends View {
    public final /* synthetic */ it0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(it0 it0Var, Context context) {
        super(context);
        this.a = it0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b0 b0Var = this.a.W0;
        if (b0Var != null) {
            b0Var.d(canvas);
        }
    }
}
