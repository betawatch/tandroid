package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nq;
import w7.z5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k3 extends TextView {
    public final nq a;

    public k3(Context context, f6 f6Var) {
        super(context);
        int v02 = j6.v0(j6.y8, f6Var);
        setTextColor(v02);
        setBackground(j6.Z(j6.l1(0.08f, v02), j6.l1(0.15f, v02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        z5.a(this);
        nq nqVar = new nq(R.drawable.arrows_select, 0);
        this.a = nqVar;
        nqVar.spaceScaleX = 0.8f;
        nqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), TLObject.FLAG_30));
    }

    public void setSorting(s3 s3Var) {
        nq nqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (s3Var == s3.c) {
            nqVar = new nq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (s3Var == s3.b) {
            nqVar = new nq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (s3Var == s3.d) {
            nqVar = new nq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            nqVar = null;
        }
        if (nqVar != null) {
            nqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
