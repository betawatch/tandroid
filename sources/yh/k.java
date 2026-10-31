package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k extends FrameLayout implements k6 {
    public final g9 a;

    public k(Context context) {
        super(context);
        g9 g9Var = new g9(context);
        this.a = g9Var;
        g9Var.setRoundRadius(i0.L(20.0f));
        addView(g9Var, b6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = t6.S0;
        g9 g9Var = this.a;
        rf.o.a(canvas, drawable, (g9Var.getWidth() / 2.0f) + g9Var.getLeft(), (g9Var.getHeight() / 2.0f) + g9Var.getTop(), g9Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i0.L(136.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
