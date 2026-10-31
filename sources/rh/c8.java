package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c8 extends LinearLayout {
    public static HashMap E;
    public boolean D;
    public final int a;
    public final org.telegram.ui.Components.r8 b;
    public final g9 c;
    public final g9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final p80 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString w;
    public final SpannableString x;
    public boolean y;

    public c8(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = 1;
        this.a = i10;
        setOrientation(0);
        jg.a3 a3Var = new jg.a3(this, context, p6Var);
        addView(a3Var, w7.b6.p(72, -1, 0.0f, zs.A1));
        g9 g9Var = new g9(context);
        this.d = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(46.0f));
        a3Var.addView(g9Var, w7.b6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        g9 g9Var2 = new g9(context);
        this.c = g9Var2;
        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(46.0f));
        a3Var.addView(g9Var2, w7.b6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.b6.p(-2, -1, 1.0f, zs.E1));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.b6.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        p80 p80Var = new p80(context, null);
        this.n = p80Var;
        org.telegram.ui.ActionBar.a7.V(p80Var, i11, p6Var);
        p80Var.setTextSize(1, 13.0f);
        p80Var.setEllipsize(truncateAt);
        p80Var.setSingleLine(true);
        linearLayout.addView(p80Var, w7.b6.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, p6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, w7.b6.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, w7.b6.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.w = spannableString;
        Drawable f7 = i0.a.f(context, R.drawable.star_small_inner);
        f7.setBounds(0, 0, org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(21.0f));
        spannableString.setSpan(new ImageSpan(f7), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.x = spannableString2;
        dq dqVar = new dq(0, i0.a.f(context, R.drawable.mini_gram_72));
        dqVar.d = false;
        dqVar.c(org.telegram.messenger.i0.L(18.0f));
        dqVar.s = org.telegram.messenger.i0.L(0.5f);
        spannableString2.setSpan(dqVar, 0, spannableString2.length(), 33);
    }

    public static eq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.w6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        eq eqVar = (eq) E.get(str);
        if (eqVar != null) {
            return eqVar;
        }
        HashMap hashMap = E;
        eq a2 = org.telegram.ui.Cells.w6.a(44, str);
        hashMap.put(str, a2);
        return a2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.D) {
            canvas.drawRect(cd.X ? 0.0f : org.telegram.messenger.i0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.y ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
