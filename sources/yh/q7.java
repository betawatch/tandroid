package yh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.v9;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class q7 extends LinearLayout {
    public static HashMap E;
    public final int a;
    public final g9 b;
    public final v9 c;
    public final v9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final k90 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString v;
    public final SpannableString w;
    public boolean x;
    public boolean y;

    public q7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 1;
        this.a = i10;
        setOrientation(0);
        ai.v7 v7Var = new ai.v7(this, context, f6Var);
        addView(v7Var, w7.y5.o(72, -1, 0.0f, 115));
        v9 v9Var = new v9(context);
        this.d = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        v7Var.addView(v9Var, w7.y5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new g9((org.telegram.ui.ActionBar.f6) null);
        v9 v9Var2 = new v9(context);
        this.c = v9Var2;
        v9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        v7Var.addView(v9Var2, w7.y5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.y5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        rk.n(i11, f6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.y5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        k90 k90Var = new k90(context, null);
        this.n = k90Var;
        k90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        k90Var.setTextSize(1, 13.0f);
        k90Var.setEllipsize(truncateAt);
        k90Var.setSingleLine(true);
        linearLayout.addView(k90Var, w7.y5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        rk.n(org.telegram.ui.ActionBar.j6.z6, f6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView2, w7.y5.n(-1, -2), context);
        this.s = h;
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 15.3f);
        h.setGravity(5);
        addView(h, w7.y5.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.w = spannableString2;
        oq oqVar = new oq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        oqVar.setSize(AndroidUtilities.dp(18.0f));
        oqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(oqVar, 0, spannableString2.length(), 33);
    }

    public static pq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.w6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        pq pqVar = (pq) E.get(str);
        if (pqVar != null) {
            return pqVar;
        }
        HashMap hashMap = E;
        pq a2 = org.telegram.ui.Cells.w6.a(44, str);
        hashMap.put(str, a2);
        return a2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y) {
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.x ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
