package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class i1 extends View {
    public final /* synthetic */ m1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(m1 m1Var, Context context) {
        super(context);
        this.a = m1Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.a.getThemedColor(h6.e7));
    }
}
