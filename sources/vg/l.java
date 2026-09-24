package vg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.i2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.cu;
import w7.y5;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final cu a;
    public final TextView b;
    public k c;

    public l(Context context, d6 d6Var) {
        super(context);
        setOrientation(0);
        cu cuVar = new cu(context, d6Var);
        this.a = cuVar;
        cuVar.setLines(1);
        cuVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        cuVar.setInputType(16384);
        cuVar.setFilters(inputFilterArr);
        cuVar.setTextSize(1, 16.0f);
        cuVar.setTextColor(h6.v0(h6.Ud, d6Var));
        cuVar.setLinkTextColor(h6.v0(h6.hc, d6Var));
        cuVar.setHighlightColor(h6.v0(h6.uf, d6Var));
        int i10 = h6.Vd;
        cuVar.setHintColor(h6.v0(i10, d6Var));
        cuVar.setHintTextColor(h6.v0(i10, d6Var));
        cuVar.setCursorColor(h6.v0(h6.Wd, d6Var));
        cuVar.setHandlesColor(h6.v0(h6.vf, d6Var));
        cuVar.setBackground(null);
        cuVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        cuVar.addTextChangedListener(new i2(this, 18));
        cuVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(h6.v0(h6.j5, d6Var));
        if (!LocaleController.isRTL) {
            addView(textView, y5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(cuVar, y5.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = y5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(cuVar, t10);
            addView(textView, y5.t(-2, -2, 16, 0, 0, 20, 0));
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
