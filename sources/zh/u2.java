package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import c8.ka;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u2 extends TextView {
    public final wp a;
    public final int b;
    public final boolean c;

    public u2(Context context, h6 h6Var, boolean z9) {
        super(context);
        this.c = z9;
        if (z9) {
            t6.U(this, m6.G6, h6Var);
            setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.b = org.telegram.messenger.g0.L(40.0f);
        } else {
            int i7 = m6.y8;
            int w02 = m6.w0(i7, h6Var);
            t6.U(this, i7, h6Var);
            org.telegram.ui.Cells.y b02 = m6.b0(m6.r1(0.08f, w02), m6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
            p6 K = t6.K(0.08f, i7);
            p6 K2 = t6.K(0.15f, i7);
            setBackground(b02);
            t6.j(this, b02, K, K2, h6Var);
            setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
            this.b = org.telegram.messenger.g0.L(26.0f);
        }
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        if (!z9) {
            ka.a(this);
        }
        wp wpVar = new wp(R.drawable.arrows_select, 0);
        this.a = wpVar;
        wpVar.G = 0.8f;
        float L = org.telegram.messenger.g0.L(1.0f);
        wpVar.r = 0.0f;
        wpVar.s = L;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.b, TLObject.FLAG_30));
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.c && super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSorting(b3 b3Var) {
        wp wpVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        wp wpVar2 = null;
        if (b3Var == b3.b) {
            wpVar = new wp(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) id.M0(2131746142, null));
        } else {
            if (b3Var != b3.a) {
                if (b3Var == b3.c) {
                    wpVar = new wp(R.drawable.mini_gift_sorting_num, 0);
                    spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) id.M0(2131746140, null));
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
            spannableStringBuilder.append((CharSequence) id.M0(2131746138, null));
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
