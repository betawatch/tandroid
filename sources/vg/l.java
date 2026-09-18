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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bu;
import w7.y5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final bu a;
    public final TextView b;
    public k c;

    public l(Context context, e6 e6Var) {
        super(context);
        setOrientation(0);
        bu buVar = new bu(context, e6Var);
        this.a = buVar;
        buVar.setLines(1);
        buVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        buVar.setInputType(16384);
        buVar.setFilters(inputFilterArr);
        buVar.setTextSize(1, 16.0f);
        buVar.setTextColor(j6.v0(j6.Ud, e6Var));
        buVar.setLinkTextColor(j6.v0(j6.hc, e6Var));
        buVar.setHighlightColor(j6.v0(j6.uf, e6Var));
        int i10 = j6.Vd;
        buVar.setHintColor(j6.v0(i10, e6Var));
        buVar.setHintTextColor(j6.v0(i10, e6Var));
        buVar.setCursorColor(j6.v0(j6.Wd, e6Var));
        buVar.setHandlesColor(j6.v0(j6.vf, e6Var));
        buVar.setBackground(null);
        buVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        buVar.addTextChangedListener(new i2(this, 18));
        buVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.v0(j6.j5, e6Var));
        if (!LocaleController.isRTL) {
            addView(textView, y5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(buVar, y5.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = y5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(buVar, t10);
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
