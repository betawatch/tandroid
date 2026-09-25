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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.w9;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class q7 extends LinearLayout {
    public static HashMap E;
    public final int a;
    public final h9 b;
    public final w9 c;
    public final w9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final n90 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString v;
    public final SpannableString w;
    public boolean x;
    public boolean y;

    public q7(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 1;
        this.a = i10;
        setOrientation(0);
        ai.w7 w7Var = new ai.w7(this, context, d6Var);
        addView(w7Var, w7.y5.o(72, -1, 0.0f, 115));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        w7Var.addView(w9Var, w7.y5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new h9((org.telegram.ui.ActionBar.d6) null);
        w9 w9Var2 = new w9(context);
        this.c = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        w7Var.addView(w9Var2, w7.y5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.y5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        ok.n(i11, d6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.y5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        n90 n90Var = new n90(context, null);
        this.n = n90Var;
        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        n90Var.setTextSize(1, 13.0f);
        n90Var.setEllipsize(truncateAt);
        n90Var.setSingleLine(true);
        linearLayout.addView(n90Var, w7.y5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        ok.n(org.telegram.ui.ActionBar.h6.z6, d6Var, textView2, 1, 14.0f);
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
        pq pqVar = new pq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        pqVar.setSize(AndroidUtilities.dp(18.0f));
        pqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(pqVar, 0, spannableString2.length(), 33);
    }

    public static qq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.v6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        qq qqVar = (qq) E.get(str);
        if (qqVar != null) {
            return qqVar;
        }
        HashMap hashMap = E;
        qq a2 = org.telegram.ui.Cells.v6.a(44, str);
        hashMap.put(str, a2);
        return a2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y) {
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.h6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.x ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
