package xg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ju;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l extends LinearLayout {
    public final ju a;
    public final TextView b;
    public k c;

    public l(Context context, u6 u6Var) {
        super(context);
        setOrientation(0);
        ju juVar = new ju(context, u6Var);
        this.a = juVar;
        juVar.setLines(1);
        juVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        juVar.setInputType(16384);
        juVar.setFilters(inputFilterArr);
        juVar.setTextSize(1, 16.0f);
        f7.V(juVar, y6.Ud, u6Var);
        f7.H(juVar, y6.hc, u6Var);
        f7.D(juVar, y6.uf, u6Var);
        int i10 = y6.Vd;
        f7.m(juVar, 34, i10, u6Var);
        f7.E(juVar, i10, u6Var);
        f7.m(juVar, 30, y6.Wd, u6Var);
        f7.m(juVar, 36, y6.vf, u6Var);
        juVar.setBackground(null);
        juVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        juVar.addTextChangedListener(new bi.u(this, 22));
        juVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        f7.V(textView, y6.j5, u6Var);
        if (!LocaleController.isRTL) {
            addView(textView, gb1.x(-2, -2, 16, 20, 0, 0, 0));
            addView(juVar, gb1.x(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams x9 = gb1.x(-1, -2, 16, 20, 0, 36, 0);
            x9.weight = 1.0f;
            addView(juVar, x9);
            addView(textView, gb1.x(-2, -2, 16, 0, 0, 20, 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.c = kVar;
    }

    public void setCount(int i10) {
        this.b.setText(String.valueOf(i10));
    }
}
