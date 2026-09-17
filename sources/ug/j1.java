package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        canvas.drawColor(this.a.getThemedColor(j6.e7));
    }
}
