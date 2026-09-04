package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class va1 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final TextView[] c;

    public va1(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.a = new TextView[i11];
        this.b = new TextView[i11];
        this.c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout f7 = org.telegram.messenger.wl.f(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout f10 = org.telegram.messenger.wl.f(context, 1);
                LinearLayout f11 = org.telegram.messenger.wl.f(context, 0);
                int i14 = (i12 * 2) + i13;
                this.a[i14] = new TextView(context);
                this.b[i14] = new TextView(context);
                this.c[i14] = new TextView(context);
                this.a[i14].setTypeface(AndroidUtilities.bold());
                this.a[i14].setTextSize(1, 17.0f);
                this.c[i14].setTextSize(1, 13.0f);
                this.c[i14].setGravity(3);
                this.b[i14].setTextSize(1, 13.0f);
                this.b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                f11.addView(this.a[i14]);
                f11.addView(this.b[i14]);
                f10.addView(f11);
                f10.addView(this.c[i14]);
                f7.addView(f10, w7.x5.l(1.0f, -1, -2));
            }
            addView(f7, w7.x5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.a[i10].setText(str);
        this.b[i10].setText(str2);
        this.c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.a;
            if (i10 >= textViewArr.length) {
                return;
            }
            TextView textView = textViewArr[i10];
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.c[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false));
            TextView[] textViewArr2 = this.b;
            Integer num = (Integer) textViewArr2[i10].getTag();
            if (num != null) {
                textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, num.intValue(), false));
            } else {
                textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            }
            i10++;
        }
    }

    public void setData(xa1 xa1Var) {
        TextView[] textViewArr = this.a;
        textViewArr[0].setText(xa1Var.b);
        textViewArr[1].setText(xa1Var.f);
        textViewArr[2].setText(xa1Var.j);
        textViewArr[3].setText(xa1Var.n);
        TextView[] textViewArr2 = this.b;
        textViewArr2[0].setText(xa1Var.c);
        textViewArr2[0].setTag(Integer.valueOf(xa1Var.d ? org.telegram.ui.ActionBar.j6.x6 : org.telegram.ui.ActionBar.j6.p7));
        textViewArr2[1].setText(xa1Var.g);
        textViewArr2[1].setTag(Integer.valueOf(xa1Var.h ? org.telegram.ui.ActionBar.j6.x6 : org.telegram.ui.ActionBar.j6.p7));
        textViewArr2[2].setText(xa1Var.k);
        textViewArr2[2].setTag(Integer.valueOf(xa1Var.l ? org.telegram.ui.ActionBar.j6.x6 : org.telegram.ui.ActionBar.j6.p7));
        textViewArr2[3].setText(xa1Var.o);
        textViewArr2[3].setTag(Integer.valueOf(xa1Var.p ? org.telegram.ui.ActionBar.j6.x6 : org.telegram.ui.ActionBar.j6.p7));
        TextView[] textViewArr3 = this.c;
        textViewArr3[0].setText(xa1Var.a);
        textViewArr3[1].setText(xa1Var.e);
        textViewArr3[2].setText(xa1Var.i);
        textViewArr3[3].setText(xa1Var.m);
        b();
    }
}
