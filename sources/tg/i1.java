package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
