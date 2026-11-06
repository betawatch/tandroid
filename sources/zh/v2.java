package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import c8.ka;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v2 extends TextView {
    public final wp a;

    public v2(Context context, f6 f6Var) {
        super(context);
        int i7 = k6.y8;
        int w02 = k6.w0(i7, f6Var);
        r6.V(this, i7, f6Var);
        org.telegram.ui.Cells.y b02 = k6.b0(k6.r1(0.08f, w02), k6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
        n6 L = r6.L(0.08f, i7);
        n6 L2 = r6.L(0.15f, i7);
        setBackground(b02);
        r6.k(this, b02, L, L2, f6Var);
        setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        ka.a(this);
        wp wpVar = new wp(R.drawable.arrows_select, 0);
        this.a = wpVar;
        wpVar.G = 0.8f;
        float L3 = org.telegram.messenger.g0.L(1.0f);
        wpVar.r = 0.0f;
        wpVar.s = L3;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSorting(c3 c3Var) {
        wp wpVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        wp wpVar2 = null;
        if (c3Var == c3.b) {
            wpVar = new wp(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) hd.M0(2131746143, null));
        } else {
            if (c3Var != c3.a) {
                if (c3Var == c3.c) {
                    wpVar = new wp(R.drawable.mini_gift_sorting_num, 0);
                    spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) hd.M0(2131746141, null));
                }
                if (wpVar2 != null) {
                    float L = org.telegram.messenger.g0.L(1.0f);
                    wpVar2.r = 0.0f;
                    wpVar2.s = L;
                }
                setText(spannableStringBuilder);
            }
            wpVar = new wp(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) hd.M0(2131746139, null));
        }
        wpVar2 = wpVar;
        if (wpVar2 != null) {
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
