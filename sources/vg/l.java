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
import org.telegram.ui.Components.du;
import w7.y5;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final du a;
    public final TextView b;
    public k c;

    public l(Context context, d6 d6Var) {
        super(context);
        setOrientation(0);
        du duVar = new du(context, d6Var);
        this.a = duVar;
        duVar.setLines(1);
        duVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        duVar.setInputType(16384);
        duVar.setFilters(inputFilterArr);
        duVar.setTextSize(1, 16.0f);
        duVar.setTextColor(h6.v0(h6.Ud, d6Var));
        duVar.setLinkTextColor(h6.v0(h6.hc, d6Var));
        duVar.setHighlightColor(h6.v0(h6.uf, d6Var));
        int i10 = h6.Vd;
        duVar.setHintColor(h6.v0(i10, d6Var));
        duVar.setHintTextColor(h6.v0(i10, d6Var));
        duVar.setCursorColor(h6.v0(h6.Wd, d6Var));
        duVar.setHandlesColor(h6.v0(h6.vf, d6Var));
        duVar.setBackground(null);
        duVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        duVar.addTextChangedListener(new i2(this, 18));
        duVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(h6.v0(h6.j5, d6Var));
        if (!LocaleController.isRTL) {
            addView(textView, y5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(duVar, y5.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = y5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(duVar, t10);
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
