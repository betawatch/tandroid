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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bu;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        buVar.setTextColor(i6.v0(i6.Ud, e6Var));
        buVar.setLinkTextColor(i6.v0(i6.hc, e6Var));
        buVar.setHighlightColor(i6.v0(i6.uf, e6Var));
        int i10 = i6.Vd;
        buVar.setHintColor(i6.v0(i10, e6Var));
        buVar.setHintTextColor(i6.v0(i10, e6Var));
        buVar.setCursorColor(i6.v0(i6.Wd, e6Var));
        buVar.setHandlesColor(i6.v0(i6.vf, e6Var));
        buVar.setBackground(null);
        buVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        buVar.addTextChangedListener(new i2(this, 18));
        buVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i6.v0(i6.j5, e6Var));
        if (!LocaleController.isRTL) {
            addView(textView, x5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(buVar, x5.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = x5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(buVar, t10);
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
