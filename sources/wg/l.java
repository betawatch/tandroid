package wg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.iu;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class l extends LinearLayout {
    public final iu a;
    public final TextView b;
    public k c;

    public l(Context context, d6 d6Var) {
        super(context);
        setOrientation(0);
        iu iuVar = new iu(context, d6Var);
        this.a = iuVar;
        iuVar.setLines(1);
        iuVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        iuVar.setInputType(16384);
        iuVar.setFilters(inputFilterArr);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setTextColor(h6.w0(h6.Ud, d6Var));
        iuVar.setLinkTextColor(h6.w0(h6.hc, d6Var));
        iuVar.setHighlightColor(h6.w0(h6.uf, d6Var));
        int i10 = h6.Vd;
        iuVar.setHintColor(h6.w0(i10, d6Var));
        iuVar.setHintTextColor(h6.w0(i10, d6Var));
        iuVar.setCursorColor(h6.w0(h6.Wd, d6Var));
        iuVar.setHandlesColor(h6.w0(h6.vf, d6Var));
        iuVar.setBackground(null);
        iuVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        iuVar.addTextChangedListener(new ai.u(this, 22));
        iuVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(h6.w0(h6.j5, d6Var));
        if (!LocaleController.isRTL) {
            addView(textView, z5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(iuVar, z5.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = z5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(iuVar, t10);
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
