// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wc9 extends TextView {
    public final wm2 a;
    public final int b;
    public final boolean c;

    public wc9(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.c = z;
        if (z) {
            yob.X(this, aob.G6, vnbVar);
            setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.b = hl.L(40.0f);
        } else {
            int i = aob.y8;
            int v0 = aob.v0(i, vnbVar);
            yob.X(this, i, vnbVar);
            hf0 Z = aob.Z(aob.p1(0.08f, v0), aob.p1(0.15f, v0), hl.L(13.0f), hl.L(13.0f));
            uob K = yob.K(0.08f, i);
            uob K2 = yob.K(0.15f, i);
            setBackground(Z);
            yob.j(this, Z, K, K2, vnbVar);
            setPadding(hl.L(11.0f), 0, hl.L(11.0f), 0);
            this.b = hl.L(26.0f);
        }
        setGravity(17);
        setTypeface(hl.o());
        if (!z) {
            iye.a(this);
        }
        wm2 wm2Var = new wm2(R.drawable.arrows_select, 0);
        this.a = wm2Var;
        wm2Var.H = 0.8f;
        float L = hl.L(1.0f);
        wm2Var.r = 0.0f;
        wm2Var.s = L;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.b, TLObject.FLAG_30));
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.c && super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSorting(dd9 dd9Var) {
        wm2 wm2Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        wm2 wm2Var2 = null;
        if (dd9Var == dd9.b) {
            wm2Var = new wm2(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) ob6.M0(2131745869, null));
        } else {
            if (dd9Var != dd9.a) {
                if (dd9Var == dd9.c) {
                    wm2Var = new wm2(R.drawable.mini_gift_sorting_num, 0);
                    spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131745867, null));
                }
                if (wm2Var2 != null) {
                    float L = hl.L(1.0f);
                    wm2Var2.r = 0.0f;
                    wm2Var2.s = L;
                }
                setText(spannableStringBuilder);
            }
            wm2Var = new wm2(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) ob6.M0(2131745865, null));
        }
        wm2Var2 = wm2Var;
        if (wm2Var2 != null) {
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
