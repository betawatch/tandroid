package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.x90;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class w0 extends LinearLayout {
    public int a;
    public final TextView b;
    public final x90 c;
    public LinearLayout d;
    public final l0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ x0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(x0 x0Var, Context context, int i10) {
        super(context);
        this.n = x0Var;
        setOrientation(1);
        ViewGroup B = x0Var.B(context, i10);
        this.f = B;
        addView(B);
        this.e = (l0) B;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i11 = h6.j5;
        textView.setTextColor(x0Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, z5.a(-2.0f, 21.0f, 20.0f, 21.0f, 0.0f, -1, 0));
        x90 x90Var = new x90(context, null);
        this.c = x90Var;
        x90Var.setGravity(1);
        x90Var.setTextSize(1, 15.0f);
        x90Var.setTextColor(x0Var.getThemedColor(i11));
        if (!x0Var.E) {
            x90Var.setLines(2);
        }
        addView(x90Var, z5.t(-1, -2, 1, 21, 10, 21, 16));
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
        x0 x0Var = this.n;
        if (z10) {
            ((b) viewGroup).setTopOffset(x0Var.L);
        }
        viewGroup.getLayoutParams().height = x0Var.s;
        x90 x90Var = this.c;
        x90Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            x90Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
