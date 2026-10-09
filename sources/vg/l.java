package vg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.h2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ru;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final ru a;
    public final TextView b;
    public k c;

    public l(Context context, e6 e6Var) {
        super(context);
        setOrientation(0);
        ru ruVar = new ru(context, e6Var);
        this.a = ruVar;
        ruVar.setLines(1);
        ruVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        ruVar.setInputType(16384);
        ruVar.setFilters(inputFilterArr);
        ruVar.setTextSize(1, 16.0f);
        ruVar.setTextColor(i6.w0(i6.Ud, e6Var));
        ruVar.setLinkTextColor(i6.w0(i6.hc, e6Var));
        ruVar.setHighlightColor(i6.w0(i6.uf, e6Var));
        int i10 = i6.Vd;
        ruVar.setHintColor(i6.w0(i10, e6Var));
        ruVar.setHintTextColor(i6.w0(i10, e6Var));
        ruVar.setCursorColor(i6.w0(i6.Wd, e6Var));
        ruVar.setHandlesColor(i6.w0(i6.vf, e6Var));
        ruVar.setBackground(null);
        ruVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        ruVar.addTextChangedListener(new h2(this, 21));
        ruVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i6.w0(i6.j5, e6Var));
        if (!LocaleController.isRTL) {
            addView(textView, x5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(ruVar, x5.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = x5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(ruVar, t10);
            addView(textView, x5.t(-2, -2, 16, 0, 0, 20, 0));
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
