package xh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.xi0;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class k3 extends LinearLayout {
    public final TextView a;

    public k3(Context context, e6 e6Var) {
        super(context);
        setOrientation(1);
        u9 u9Var = new u9(context);
        u9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        addView(u9Var, x5.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.a = textView;
        vl.o(i6.A6, e6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        addView(textView, x5.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
    }

    public void set(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
