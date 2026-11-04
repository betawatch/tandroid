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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vd extends LinearLayout {
    public final LinearLayout a;
    public final LinearLayout[] b;
    public final org.telegram.ui.Components.o5[] c;
    public final TextView[] d;
    public final TextView e;
    public final DecimalFormat f;

    public vd(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = new LinearLayout[2];
        this.c = new org.telegram.ui.Components.o5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i3 = 0; i3 < 2; i3++) {
            this.b[i3] = new LinearLayout(context);
            this.b[i3].setOrientation(0);
            this.a.addView(this.b[i3], b8.mf.p(-1, -2, 1.0f, org.telegram.messenger.hs.E1));
            this.c[i3] = new org.telegram.ui.Components.o5(context);
            this.c[i3].setTypeface(org.telegram.messenger.g0.o());
            this.c[i3].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.V(this.c[i3], org.telegram.ui.ActionBar.k6.G6, e6Var);
            this.b[i3].addView(this.c[i3], b8.mf.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i3] = new org.telegram.ui.Components.o5(context);
            this.d[i3].setTextSize(1, 11.5f);
            org.telegram.ui.ActionBar.r6.V(this.d[i3], org.telegram.ui.ActionBar.k6.y6, e6Var);
            this.b[i3].addView(this.d[i3], b8.mf.r(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.y6, e6Var);
        addView(textView, b8.mf.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
    }

    public void set(ud udVar) {
        int i3;
        int indexOf;
        this.e.setText(udVar.c);
        int i10 = 0;
        while (i10 < 2) {
            String str = i10 == 0 ? udVar.b : udVar.h;
            long j10 = i10 == 0 ? udVar.e : udVar.j;
            LinearLayout[] linearLayoutArr = this.b;
            if (i10 == 0 && !udVar.a) {
                linearLayoutArr[i10].setVisibility(8);
            } else if (i10 != 1 || udVar.g) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t4.c.q(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.c;
                if (equalsIgnoreCase) {
                    String format = this.f.format(udVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i3 = i10;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.E((long) Math.floor(udVar.d / 1.0E9d), ' '));
                        spannableStringBuilder.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i3 = i10;
                        spannableStringBuilder.append((CharSequence) format);
                    }
                    spannableStringBuilder = xd.K(spannableStringBuilder, textViewArr[i3].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i3 = i10;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i3 == 0) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.E(udVar.d, ' '));
                        } else {
                            spannableStringBuilder.append((CharSequence) ci.wb.M0(udVar.i, 0.8f, ' '));
                        }
                        spannableStringBuilder = ci.wb.a1(false, spannableStringBuilder, 0.7f, null);
                    } else {
                        spannableStringBuilder.append((CharSequence) Long.toString(udVar.d));
                    }
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                if ("TON".equalsIgnoreCase(str) && (indexOf = TextUtils.indexOf(spannableStringBuilder2, ".")) >= 0) {
                    spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder2.length(), 33);
                }
                linearLayoutArr[i3].setVisibility(0);
                textViewArr[i3].setText(spannableStringBuilder2);
                this.d[i3].setText("≈" + org.telegram.messenger.r1.i().f(j10, udVar.f));
                i10 = i3 + 1;
            } else {
                linearLayoutArr[i10].setVisibility(8);
            }
            i3 = i10;
            i10 = i3 + 1;
        }
    }
}
