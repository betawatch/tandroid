package wg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.i2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.zt;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final zt a;
    public final TextView b;
    public k c;

    public l(Context context, f6 f6Var) {
        super(context);
        setOrientation(0);
        zt ztVar = new zt(context, f6Var);
        this.a = ztVar;
        ztVar.setLines(1);
        ztVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        ztVar.setInputType(16384);
        ztVar.setFilters(inputFilterArr);
        ztVar.setTextSize(1, 16.0f);
        ztVar.setTextColor(j6.v0(j6.Ud, f6Var));
        ztVar.setLinkTextColor(j6.v0(j6.hc, f6Var));
        ztVar.setHighlightColor(j6.v0(j6.uf, f6Var));
        int i10 = j6.Vd;
        ztVar.setHintColor(j6.v0(i10, f6Var));
        ztVar.setHintTextColor(j6.v0(i10, f6Var));
        ztVar.setCursorColor(j6.v0(j6.Wd, f6Var));
        ztVar.setHandlesColor(j6.v0(j6.vf, f6Var));
        ztVar.setBackground(null);
        ztVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        ztVar.addTextChangedListener(new i2(this, 18));
        ztVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.v0(j6.j5, f6Var));
        if (!LocaleController.isRTL) {
            addView(textView, x5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(ztVar, x5.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = x5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(ztVar, t10);
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
