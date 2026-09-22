package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class j1 extends View {
    public final /* synthetic */ n1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(n1 n1Var, Context context) {
        super(context);
        this.a = n1Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.a.getThemedColor(i6.e7));
    }
}
