package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.z90;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class x0 extends LinearLayout {
    public int a;
    public final TextView b;
    public final z90 c;
    public LinearLayout d;
    public final l0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ y0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(y0 y0Var, Context context, int i10) {
        super(context);
        u6 u6Var;
        u6 u6Var2;
        this.n = y0Var;
        setOrientation(1);
        ViewGroup C = y0Var.C(context, i10);
        this.f = C;
        addView(C);
        this.e = (l0) C;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i11 = y6.j5;
        u6Var = ((k3) y0Var).resourcesProvider;
        f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, gb1.h(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        z90 z90Var = new z90(context, null);
        this.c = z90Var;
        z90Var.setGravity(1);
        z90Var.setTextSize(1, 15.0f);
        u6Var2 = ((k3) y0Var).resourcesProvider;
        f7.V(z90Var, i11, u6Var2);
        if (!y0Var.E) {
            z90Var.setLines(2);
        }
        addView(z90Var, gb1.x(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f) {
            return super.drawChild(canvas, view, j10);
        }
        boolean z10 = view instanceof b;
        if (z10) {
            setTranslationY(0.0f);
        } else {
            setTranslationY(this.n.L);
        }
        if (z10) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f;
        boolean z10 = viewGroup instanceof b;
        y0 y0Var = this.n;
        if (z10) {
            ((b) viewGroup).setTopOffset(y0Var.L);
        }
        viewGroup.getLayoutParams().height = y0Var.s;
        z90 z90Var = this.c;
        z90Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            z90Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
