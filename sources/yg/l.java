package yg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Wallet.na;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final ys a;
    public final TextView b;
    public k c;

    public l(Context context, f6 f6Var) {
        super(context);
        setOrientation(0);
        ys ysVar = new ys(context, f6Var);
        this.a = ysVar;
        ysVar.setLines(1);
        ysVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        ysVar.setInputType(TLObject.FLAG_14);
        ysVar.setFilters(inputFilterArr);
        ysVar.setTextSize(1, 16.0f);
        r6.V(ysVar, k6.Ie, f6Var);
        r6.H(ysVar, k6.Vc, f6Var);
        r6.D(ysVar, k6.ig, f6Var);
        int i7 = k6.Je;
        r6.m(ysVar, 34, i7, f6Var);
        r6.E(ysVar, i7, f6Var);
        r6.m(ysVar, 30, k6.Ke, f6Var);
        r6.m(ysVar, 36, k6.jg, f6Var);
        ysVar.setBackground(null);
        ysVar.setHint(hd.M0(2131753477, null));
        ysVar.addTextChangedListener(new na(this, 4));
        ysVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        r6.V(textView, k6.j5, f6Var);
        if (!hd.a0) {
            addView(textView, ha.t(-2, -2, 16, 20, 0, 0, 0));
            addView(ysVar, ha.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t6 = ha.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(ysVar, t6);
            addView(textView, ha.t(-2, -2, 16, 0, 0, 20, 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), TLObject.FLAG_30));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.c = kVar;
    }

    public void setCount(int i7) {
        this.b.setText(String.valueOf(i7));
    }
}
