package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.dq;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z2 extends TextView {
    public final dq a;

    public z2(Context context, p6 p6Var) {
        super(context);
        int i10 = t6.y8;
        int w02 = t6.w0(i10, p6Var);
        a7.V(this, i10, p6Var);
        org.telegram.ui.Cells.y b02 = t6.b0(t6.r1(0.08f, w02), t6.r1(0.15f, w02), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f));
        w6 L = a7.L(0.08f, i10);
        w6 L2 = a7.L(0.15f, i10);
        setBackground(b02);
        a7.k(this, b02, L, L2, p6Var);
        setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f), 0);
        setGravity(17);
        setTypeface(org.telegram.messenger.i0.o());
        e6.a(this);
        dq dqVar = new dq(R.drawable.arrows_select, 0);
        this.a = dqVar;
        dqVar.G = 0.8f;
        float L3 = org.telegram.messenger.i0.L(1.0f);
        dqVar.r = 0.0f;
        dqVar.s = L3;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(26.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSorting(g3 g3Var) {
        dq dqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        dq dqVar2 = null;
        if (g3Var == g3.b) {
            dqVar = new dq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) cd.L0(2131746159, null));
        } else {
            if (g3Var != g3.a) {
                if (g3Var == g3.c) {
                    dqVar = new dq(R.drawable.mini_gift_sorting_num, 0);
                    spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) cd.L0(2131746157, null));
                }
                if (dqVar2 != null) {
                    float L = org.telegram.messenger.i0.L(1.0f);
                    dqVar2.r = 0.0f;
                    dqVar2.s = L;
                }
                setText(spannableStringBuilder);
            }
            dqVar = new dq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) cd.L0(2131746155, null));
        }
        dqVar2 = dqVar;
        if (dqVar2 != null) {
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
