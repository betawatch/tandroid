package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.br;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class k3 extends TextView {
    public final br a;

    public k3(Context context, c6 c6Var) {
        super(context);
        int w02 = g6.w0(g6.y8, c6Var);
        setTextColor(w02);
        setBackground(g6.a0(g6.m1(0.08f, w02), g6.m1(0.15f, w02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        w7.c6.a(this);
        br brVar = new br(R.drawable.arrows_select, 0);
        this.a = brVar;
        brVar.spaceScaleX = 0.8f;
        brVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), TLObject.FLAG_30));
    }

    public void setSorting(s3 s3Var) {
        br brVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (s3Var == s3.c) {
            brVar = new br(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(brVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (s3Var == s3.b) {
            brVar = new br(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(brVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (s3Var == s3.d) {
            brVar = new br(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(brVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            brVar = null;
        }
        if (brVar != null) {
            brVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
