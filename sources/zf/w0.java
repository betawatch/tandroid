package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w0 extends LinearLayout {
    public int a;
    public final TextView b;
    public final l80 c;
    public LinearLayout d;
    public final l0 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ x0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(x0 x0Var, Context context, int i9) {
        super(context);
        this.n = x0Var;
        setOrientation(1);
        ViewGroup z10 = x0Var.z(context, i9);
        this.f = z10;
        addView(z10);
        this.e = (l0) z10;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i10 = f6.j5;
        textView.setTextColor(x0Var.getThemedColor(i10));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, e6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        l80 l80Var = new l80(context, null);
        this.c = l80Var;
        l80Var.setGravity(1);
        l80Var.setTextSize(1, 15.0f);
        l80Var.setTextColor(x0Var.getThemedColor(i10));
        if (!x0Var.A) {
            l80Var.setLines(2);
        }
        addView(l80Var, e6.t(-1, -2, 1, 21, 10, 21, 16));
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
            setTranslationY(this.n.H);
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
    public final void onMeasure(int i9, int i10) {
        TextView textView = this.b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f;
        boolean z10 = viewGroup instanceof b;
        x0 x0Var = this.n;
        if (z10) {
            ((b) viewGroup).setTopOffset(x0Var.H);
        }
        viewGroup.getLayoutParams().height = x0Var.s;
        l80 l80Var = this.c;
        l80Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i9, i10);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
            textView.setVisibility(8);
            l80Var.setVisibility(8);
            super.onMeasure(i9, i10);
        }
    }
}
