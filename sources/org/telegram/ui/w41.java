package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w41 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final TextView[] a;
    public final TextView[] b;
    public final TextView[] c;

    public w41(Context context, int i7) {
        super(context);
        int i10 = i7 * 2;
        this.a = new TextView[i10];
        this.b = new TextView[i10];
        this.c = new TextView[i10];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        for (int i11 = 0; i11 < i7; i11++) {
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
            for (int i12 = 0; i12 < 2; i12++) {
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                int i13 = (i11 * 2) + i12;
                this.a[i13] = new TextView(context);
                this.b[i13] = new TextView(context);
                this.c[i13] = new TextView(context);
                this.a[i13].setTypeface(org.telegram.messenger.g0.o());
                this.a[i13].setTextSize(1, 17.0f);
                this.c[i13].setTextSize(1, 13.0f);
                this.c[i13].setGravity(3);
                this.b[i13].setTextSize(1, 13.0f);
                this.b[i13].setPadding(org.telegram.messenger.g0.L(4.0f), 0, 0, 0);
                f12.addView(this.a[i13]);
                f12.addView(this.b[i13]);
                f11.addView(f12);
                f11.addView(this.c[i13]);
                f10.addView(f11, c8.ha.l(1.0f, -1, -2));
            }
            addView(f10, c8.ha.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i7, String str2, String str3) {
        this.a[i7].setText(str);
        this.b[i7].setText(str2);
        this.c[i7].setText(str3);
        updateColors();
    }

    public void setData(y41 y41Var) {
        TextView[] textViewArr = this.a;
        textViewArr[0].setText(y41Var.b);
        textViewArr[1].setText(y41Var.f);
        textViewArr[2].setText(y41Var.j);
        textViewArr[3].setText(y41Var.n);
        TextView[] textViewArr2 = this.b;
        textViewArr2[0].setText(y41Var.c);
        textViewArr2[0].setTag(Integer.valueOf(y41Var.d ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
        textViewArr2[1].setText(y41Var.g);
        textViewArr2[1].setTag(Integer.valueOf(y41Var.h ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
        textViewArr2[2].setText(y41Var.k);
        textViewArr2[2].setTag(Integer.valueOf(y41Var.l ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
        textViewArr2[3].setText(y41Var.o);
        textViewArr2[3].setTag(Integer.valueOf(y41Var.p ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
        TextView[] textViewArr3 = this.c;
        textViewArr3[0].setText(y41Var.a);
        textViewArr3[1].setText(y41Var.e);
        textViewArr3[2].setText(y41Var.i);
        textViewArr3[3].setText(y41Var.m);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.a;
        if (textViewArr3 == null || (textViewArr = this.b) == null || (textViewArr2 = this.c) == null) {
            return;
        }
        for (int i7 = 0; i7 < textViewArr3.length; i7++) {
            TextView textView = textViewArr3[i7];
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            textViewArr2[i7].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z6, false));
            Integer num = (Integer) textViewArr[i7].getTag();
            if (num != null) {
                textViewArr[i7].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, num.intValue(), false));
            } else {
                textViewArr[i7].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
