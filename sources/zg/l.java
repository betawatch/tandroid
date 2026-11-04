package zg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Wallet.ma;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final xs a;
    public final TextView b;
    public k c;

    public l(Context context, e6 e6Var) {
        super(context);
        setOrientation(0);
        xs xsVar = new xs(context, e6Var);
        this.a = xsVar;
        xsVar.setLines(1);
        xsVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        xsVar.setInputType(TLObject.FLAG_14);
        xsVar.setFilters(inputFilterArr);
        xsVar.setTextSize(1, 16.0f);
        r6.V(xsVar, k6.Ie, e6Var);
        r6.H(xsVar, k6.Vc, e6Var);
        r6.D(xsVar, k6.ig, e6Var);
        int i3 = k6.Je;
        r6.m(xsVar, 34, i3, e6Var);
        r6.E(xsVar, i3, e6Var);
        r6.m(xsVar, 30, k6.Ke, e6Var);
        r6.m(xsVar, 36, k6.jg, e6Var);
        xsVar.setBackground(null);
        xsVar.setHint(bd.M0(2131753477, null));
        xsVar.addTextChangedListener(new ma(this, 4));
        xsVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        r6.V(textView, k6.j5, e6Var);
        if (!bd.a0) {
            addView(textView, mf.t(-2, -2, 16, 20, 0, 0, 0));
            addView(xsVar, mf.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = mf.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(xsVar, t10);
            addView(textView, mf.t(-2, -2, 16, 0, 0, 20, 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), TLObject.FLAG_30));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.c = kVar;
    }

    public void setCount(int i3) {
        this.b.setText(String.valueOf(i3));
    }
}
