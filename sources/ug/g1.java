package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class g1 extends View {
    public final /* synthetic */ l1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l1 l1Var, Context context) {
        super(context);
        this.a = l1Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.a.getThemedColor(k6.e7));
    }
}
