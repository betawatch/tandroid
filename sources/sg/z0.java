package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d90;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class z0 extends LinearLayout {
    public int a;
    public final TextView b;
    public final d90 c;
    public LinearLayout d;
    public final m0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ a1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(a1 a1Var, Context context, int i10) {
        super(context);
        this.n = a1Var;
        setOrientation(1);
        ViewGroup A = a1Var.A(context, i10);
        this.f = A;
        addView(A);
        this.e = (m0) A;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i11 = j6.j5;
        textView.setTextColor(a1Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, x5.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        d90 d90Var = new d90(context, null);
        this.c = d90Var;
        d90Var.setGravity(1);
        d90Var.setTextSize(1, 15.0f);
        d90Var.setTextColor(a1Var.getThemedColor(i11));
        if (!a1Var.E) {
            d90Var.setLines(2);
        }
        addView(d90Var, x5.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f) {
            return super.drawChild(canvas, view, j3);
        }
        boolean z10 = view instanceof b;
        if (z10) {
            setTranslationY(0.0f);
        } else {
            setTranslationY(this.n.L);
        }
        if (z10) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f;
        boolean z10 = viewGroup instanceof b;
        a1 a1Var = this.n;
        if (z10) {
            ((b) viewGroup).setTopOffset(a1Var.L);
        }
        viewGroup.getLayoutParams().height = a1Var.s;
        d90 d90Var = this.c;
        d90Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            d90Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
