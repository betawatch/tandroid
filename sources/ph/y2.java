package ph;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.g9;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y2 extends LinearLayout {
    public final TextView a;

    public y2(Context context, p6 p6Var) {
        super(context);
        setOrientation(1);
        g9 g9Var = new g9(context);
        g9Var.setImageDrawable(new bi0(R.raw.utyan_empty, org.telegram.messenger.i0.L(130.0f), org.telegram.messenger.i0.L(130.0f)));
        addView(g9Var, b6.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.a = textView;
        a7.V(textView, t6.A6, p6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, b6.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.i0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
    }

    public void set(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
