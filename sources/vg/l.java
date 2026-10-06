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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.eu;
import w7.z5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final eu a;
    public final TextView b;
    public k c;

    public l(Context context, d6 d6Var) {
        super(context);
        setOrientation(0);
        eu euVar = new eu(context, d6Var);
        this.a = euVar;
        euVar.setLines(1);
        euVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        euVar.setInputType(16384);
        euVar.setFilters(inputFilterArr);
        euVar.setTextSize(1, 16.0f);
        euVar.setTextColor(i6.v0(i6.Ud, d6Var));
        euVar.setLinkTextColor(i6.v0(i6.hc, d6Var));
        euVar.setHighlightColor(i6.v0(i6.uf, d6Var));
        int i10 = i6.Vd;
        euVar.setHintColor(i6.v0(i10, d6Var));
        euVar.setHintTextColor(i6.v0(i10, d6Var));
        euVar.setCursorColor(i6.v0(i6.Wd, d6Var));
        euVar.setHandlesColor(i6.v0(i6.vf, d6Var));
        euVar.setBackground(null);
        euVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        euVar.addTextChangedListener(new i2(this, 18));
        euVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i6.v0(i6.j5, d6Var));
        if (!LocaleController.isRTL) {
            addView(textView, z5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(euVar, z5.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = z5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(euVar, t10);
            addView(textView, z5.t(-2, -2, 16, 0, 0, 20, 0));
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
