package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class xd extends LinearLayout {
    public final LinearLayout a;
    public final LinearLayout[] b;
    public final org.telegram.ui.Components.q5[] c;
    public final TextView[] d;
    public final TextView e;
    public final DecimalFormat f;

    public xd(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = new LinearLayout[2];
        this.c = new org.telegram.ui.Components.q5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i7 = 0; i7 < 2; i7++) {
            this.b[i7] = new LinearLayout(context);
            this.b[i7].setOrientation(0);
            this.a.addView(this.b[i7], c8.ha.p(-1, -2, 1.0f, org.telegram.messenger.qs.E1));
            this.c[i7] = new org.telegram.ui.Components.q5(context);
            this.c[i7].setTypeface(org.telegram.messenger.g0.o());
            this.c[i7].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.V(this.c[i7], org.telegram.ui.ActionBar.k6.G6, f6Var);
            this.b[i7].addView(this.c[i7], c8.ha.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i7] = new org.telegram.ui.Components.q5(context);
            this.d[i7].setTextSize(1, 11.5f);
            org.telegram.ui.ActionBar.r6.V(this.d[i7], org.telegram.ui.ActionBar.k6.y6, f6Var);
            this.b[i7].addView(this.d[i7], c8.ha.r(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.y6, f6Var);
        addView(textView, c8.ha.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void set(wd wdVar) {
        int i7;
        int indexOf;
        this.e.setText(wdVar.c);
        int i10 = 0;
        while (i10 < 2) {
            String str = i10 == 0 ? wdVar.b : wdVar.h;
            long j3 = i10 == 0 ? wdVar.e : wdVar.j;
            LinearLayout[] linearLayoutArr = this.b;
            if (i10 == 0 && !wdVar.a) {
                linearLayoutArr[i10].setVisibility(8);
            } else if (i10 != 1 || wdVar.g) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rf.b.q(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.c;
                if (equalsIgnoreCase) {
                    String format = this.f.format(wdVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i7 = i10;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.E((long) Math.floor(wdVar.d / 1.0E9d), ' '));
                        spannableStringBuilder.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i7 = i10;
                        spannableStringBuilder.append((CharSequence) format);
                    }
                    spannableStringBuilder = zd.K(spannableStringBuilder, textViewArr[i7].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i7 = i10;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i7 == 0) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.E(wdVar.d, ' '));
                        } else {
                            spannableStringBuilder.append((CharSequence) bi.dd.M0(wdVar.i, 0.8f, ' '));
                        }
                        spannableStringBuilder = bi.dd.a1(false, spannableStringBuilder, 0.7f, null);
                    } else {
                        spannableStringBuilder.append((CharSequence) Long.toString(wdVar.d));
                    }
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                if ("TON".equalsIgnoreCase(str) && (indexOf = TextUtils.indexOf(spannableStringBuilder2, ".")) >= 0) {
                    spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder2.length(), 33);
                }
                linearLayoutArr[i7].setVisibility(0);
                textViewArr[i7].setText(spannableStringBuilder2);
                this.d[i7].setText("≈" + org.telegram.messenger.r1.i().f(j3, wdVar.f));
                i10 = i7 + 1;
            } else {
                linearLayoutArr[i10].setVisibility(8);
            }
            i7 = i10;
            i10 = i7 + 1;
        }
    }
}
