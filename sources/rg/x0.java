package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.q90;
import w7.z5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class x0 extends LinearLayout {
    public int a;
    public final TextView b;
    public final q90 c;
    public LinearLayout d;
    public final m0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ y0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(y0 y0Var, Context context, int i10) {
        super(context);
        this.n = y0Var;
        setOrientation(1);
        ViewGroup z10 = y0Var.z(context, i10);
        this.f = z10;
        addView(z10);
        this.e = (m0) z10;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i11 = i6.j5;
        textView.setTextColor(y0Var.getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, z5.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        q90 q90Var = new q90(context, null);
        this.c = q90Var;
        q90Var.setGravity(1);
        q90Var.setTextSize(1, 15.0f);
        q90Var.setTextColor(y0Var.getThemedColor(i11));
        if (!y0Var.E) {
            q90Var.setLines(2);
        }
        addView(q90Var, z5.t(-1, -2, 1, 21, 10, 21, 16));
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
        y0 y0Var = this.n;
        if (z10) {
            ((b) viewGroup).setTopOffset(y0Var.L);
        }
        viewGroup.getLayoutParams().height = y0Var.s;
        q90 q90Var = this.c;
        q90Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            q90Var.setVisibility(8);
            super.onMeasure(i10, i11);
        }
    }
}
