package yg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Wallet.i9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final ot a;
    public final TextView b;
    public k c;

    public l(Context context, h6 h6Var) {
        super(context);
        setOrientation(0);
        ot otVar = new ot(context, h6Var);
        this.a = otVar;
        otVar.setLines(1);
        otVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        otVar.setInputType(TLObject.FLAG_14);
        otVar.setFilters(inputFilterArr);
        otVar.setTextSize(1, 16.0f);
        t6.U(otVar, m6.Le, h6Var);
        t6.G(otVar, m6.Yc, h6Var);
        t6.C(otVar, m6.lg, h6Var);
        int i7 = m6.Me;
        t6.l(otVar, 34, i7, h6Var);
        t6.D(otVar, i7, h6Var);
        t6.l(otVar, 30, m6.Ne, h6Var);
        t6.l(otVar, 36, m6.mg, h6Var);
        otVar.setBackground(null);
        otVar.setHint(gd.N0(2131753474, null));
        otVar.addTextChangedListener(new i9(this, 7));
        otVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        t6.U(textView, m6.j5, h6Var);
        if (!gd.a0) {
            addView(textView, ma.t(-2, -2, 16, 20, 0, 0, 0));
            addView(otVar, ma.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t6 = ma.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(otVar, t6);
            addView(textView, ma.t(-2, -2, 16, 0, 0, 20, 0));
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
