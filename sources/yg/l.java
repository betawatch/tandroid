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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.zs;
import org.telegram.ui.Wallet.la;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final zs a;
    public final TextView b;
    public k c;

    public l(Context context, g6 g6Var) {
        super(context);
        setOrientation(0);
        zs zsVar = new zs(context, g6Var);
        this.a = zsVar;
        zsVar.setLines(1);
        zsVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        zsVar.setInputType(TLObject.FLAG_14);
        zsVar.setFilters(inputFilterArr);
        zsVar.setTextSize(1, 16.0f);
        s6.U(zsVar, l6.Ie, g6Var);
        s6.G(zsVar, l6.Vc, g6Var);
        s6.C(zsVar, l6.ig, g6Var);
        int i7 = l6.Je;
        s6.l(zsVar, 34, i7, g6Var);
        s6.D(zsVar, i7, g6Var);
        s6.l(zsVar, 30, l6.Ke, g6Var);
        s6.l(zsVar, 36, l6.jg, g6Var);
        zsVar.setBackground(null);
        zsVar.setHint(id.M0(2131753477, null));
        zsVar.addTextChangedListener(new la(this, 4));
        zsVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        s6.U(textView, l6.j5, g6Var);
        if (!id.a0) {
            addView(textView, ha.t(-2, -2, 16, 20, 0, 0, 0));
            addView(zsVar, ha.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t6 = ha.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(zsVar, t6);
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
