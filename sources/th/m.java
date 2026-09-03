package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class m extends FrameLayout implements b6 {
    public final p9 a;

    public m(Context context) {
        super(context);
        p9 p9Var = new p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(p9Var, c6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = k6.S0;
        p9 p9Var = this.a;
        lf.r.a(canvas, drawable, (p9Var.getWidth() / 2.0f) + p9Var.getLeft(), (p9Var.getHeight() / 2.0f) + p9Var.getTop(), p9Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
    }
}
