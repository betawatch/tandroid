// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rza extends LinearLayout implements vlb {
    public final TextView[] a;
    public final TextView[] b;
    public final TextView[] c;

    public rza(Context context, int i) {
        super(context);
        int i2 = i << 1;
        this.a = new TextView[i2];
        this.b = new TextView[i2];
        this.c = new TextView[i2];
        setOrientation(1);
        setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        for (int i3 = 0; i3 < i; i3++) {
            LinearLayout i4 = hg9.i(context, 0);
            for (int i5 = 0; i5 < 2; i5++) {
                LinearLayout i6 = hg9.i(context, 1);
                LinearLayout i7 = hg9.i(context, 0);
                int i8 = (i3 << 1) + i5;
                this.a[i8] = new TextView(context);
                this.b[i8] = new TextView(context);
                this.c[i8] = new TextView(context);
                this.a[i8].setTypeface(gm.o());
                this.a[i8].setTextSize(1, 17.0f);
                this.c[i8].setTextSize(1, 13.0f);
                this.c[i8].setGravity(3);
                this.b[i8].setTextSize(1, 13.0f);
                this.b[i8].setPadding(gm.L(4.0f), 0, 0, 0);
                i7.addView(this.a[i8]);
                i7.addView(this.b[i8]);
                i6.addView(i7);
                i6.addView(this.c[i8]);
                i4.addView(i6, qoe.l(1.0f, -1, -2));
            }
            addView(i4, qoe.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i, String str2, String str3) {
        this.a[i].setText(str);
        this.b[i].setText(str2);
        this.c[i].setText(str3);
        updateColors();
    }

    public void setData(tza tzaVar) {
        TextView[] textViewArr = this.a;
        textViewArr[0].setText(tzaVar.b);
        textViewArr[1].setText(tzaVar.f);
        textViewArr[2].setText(tzaVar.j);
        textViewArr[3].setText(tzaVar.n);
        TextView[] textViewArr2 = this.b;
        textViewArr2[0].setText(tzaVar.c);
        textViewArr2[0].setTag(Integer.valueOf(tzaVar.d ? cmb.w6 : cmb.o7));
        textViewArr2[1].setText(tzaVar.g);
        textViewArr2[1].setTag(Integer.valueOf(tzaVar.h ? cmb.w6 : cmb.o7));
        textViewArr2[2].setText(tzaVar.k);
        textViewArr2[2].setTag(Integer.valueOf(tzaVar.l ? cmb.w6 : cmb.o7));
        textViewArr2[3].setText(tzaVar.o);
        textViewArr2[3].setTag(Integer.valueOf(tzaVar.p ? cmb.w6 : cmb.o7));
        TextView[] textViewArr3 = this.c;
        textViewArr3[0].setText(tzaVar.a);
        textViewArr3[1].setText(tzaVar.e);
        textViewArr3[2].setText(tzaVar.i);
        textViewArr3[3].setText(tzaVar.m);
        updateColors();
    }

    @Override // vlb
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.a;
        if (textViewArr3 == null || (textViewArr = this.b) == null || (textViewArr2 = this.c) == null) {
            return;
        }
        for (int i = 0; i < textViewArr3.length; i++) {
            TextView textView = textViewArr3[i];
            int i2 = cmb.F6;
            textView.setTextColor(cmb.w0(null, i2, false));
            textViewArr2[i].setTextColor(cmb.w0(null, cmb.y6, false));
            Integer num = (Integer) textViewArr[i].getTag();
            if (num != null) {
                textViewArr[i].setTextColor(cmb.w0(null, num.intValue(), false));
            } else {
                textViewArr[i].setTextColor(cmb.w0(null, i2, false));
            }
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
