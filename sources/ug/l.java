package ug;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.u2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fu;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final fu a;
    public final TextView b;
    public k c;

    public l(Context context, f6 f6Var) {
        super(context);
        setOrientation(0);
        fu fuVar = new fu(context, f6Var);
        this.a = fuVar;
        fuVar.setLines(1);
        fuVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        fuVar.setInputType(16384);
        fuVar.setFilters(inputFilterArr);
        fuVar.setTextSize(1, 16.0f);
        fuVar.setTextColor(j6.v0(j6.Ud, f6Var));
        fuVar.setLinkTextColor(j6.v0(j6.hc, f6Var));
        fuVar.setHighlightColor(j6.v0(j6.uf, f6Var));
        int i10 = j6.Vd;
        fuVar.setHintColor(j6.v0(i10, f6Var));
        fuVar.setHintTextColor(j6.v0(i10, f6Var));
        fuVar.setCursorColor(j6.v0(j6.Wd, f6Var));
        fuVar.setHandlesColor(j6.v0(j6.vf, f6Var));
        fuVar.setBackground(null);
        fuVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        fuVar.addTextChangedListener(new u2(this, 18));
        fuVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.v0(j6.j5, f6Var));
        if (!LocaleController.isRTL) {
            addView(textView, a6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(fuVar, a6.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = a6.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(fuVar, t10);
            addView(textView, a6.t(-2, -2, 16, 0, 0, 20, 0));
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
