package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l3 extends TextView {
    public final zq a;

    public l3(Context context, u6 u6Var) {
        super(context);
        int i10 = y6.y8;
        int w02 = y6.w0(i10, u6Var);
        f7.V(this, i10, u6Var);
        org.telegram.ui.Cells.y a02 = y6.a0(y6.o1(0.08f, w02), y6.o1(0.15f, w02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f));
        b7 L = f7.L(0.08f, i10);
        b7 L2 = f7.L(0.15f, i10);
        setBackground(a02);
        f7.k(this, a02, L, L2, u6Var);
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        kb1.b(this);
        zq zqVar = new zq(R.drawable.arrows_select, 0);
        this.a = zqVar;
        zqVar.spaceScaleX = 0.8f;
        zqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), TLObject.FLAG_30));
    }

    public void setSorting(t3 t3Var) {
        zq zqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (t3Var == t3.c) {
            zqVar = new zq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (t3Var == t3.b) {
            zqVar = new zq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (t3Var == t3.d) {
            zqVar = new zq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            zqVar = null;
        }
        if (zqVar != null) {
            zqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
