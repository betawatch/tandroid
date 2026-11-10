package yg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Wallet.oa;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final ys a;
    public final TextView b;
    public k c;

    public l(Context context, h6 h6Var) {
        super(context);
        setOrientation(0);
        ys ysVar = new ys(context, h6Var);
        this.a = ysVar;
        ysVar.setLines(1);
        ysVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        ysVar.setInputType(TLObject.FLAG_14);
        ysVar.setFilters(inputFilterArr);
        ysVar.setTextSize(1, 16.0f);
        t6.U(ysVar, m6.Ie, h6Var);
        t6.G(ysVar, m6.Vc, h6Var);
        t6.C(ysVar, m6.ig, h6Var);
        int i7 = m6.Je;
        t6.l(ysVar, 34, i7, h6Var);
        t6.D(ysVar, i7, h6Var);
        t6.l(ysVar, 30, m6.Ke, h6Var);
        t6.l(ysVar, 36, m6.jg, h6Var);
        ysVar.setBackground(null);
        ysVar.setHint(id.M0(2131753477, null));
        ysVar.addTextChangedListener(new oa(this, 4));
        ysVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        t6.U(textView, m6.j5, h6Var);
        if (!id.a0) {
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
