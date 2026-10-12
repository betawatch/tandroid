package zh;

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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class j7 extends LinearLayout {
    public static HashMap E;
    public final int a;
    public final k9 b;
    public final z9 c;
    public final z9 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final da0 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString v;
    public final SpannableString w;
    public boolean x;
    public boolean y;

    public j7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = 1;
        this.a = i10;
        setOrientation(0);
        bi.i7 i7Var = new bi.i7(this, context, c6Var);
        addView(i7Var, w7.a6.o(72, -1, 0.0f, 115));
        z9 z9Var = new z9(context);
        this.d = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        i7Var.addView(z9Var, w7.a6.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 16));
        this.b = new k9((org.telegram.ui.ActionBar.c6) null);
        z9 z9Var2 = new z9(context);
        this.c = z9Var2;
        z9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        i7Var.addView(z9Var2, w7.a6.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.a6.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        yh.n(i11, c6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.a6.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        da0 da0Var = new da0(context, null);
        this.n = da0Var;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        da0Var.setTextSize(1, 13.0f);
        da0Var.setEllipsize(truncateAt);
        da0Var.setSingleLine(true);
        linearLayout.addView(da0Var, w7.a6.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        yh.n(org.telegram.ui.ActionBar.g6.z6, c6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView2, w7.a6.n(-1, -2), context);
        this.s = i12;
        i12.setTypeface(AndroidUtilities.bold());
        i12.setTextSize(1, 15.3f);
        i12.setGravity(5);
        addView(i12, w7.a6.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.w = spannableString2;
        br brVar = new br(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        brVar.recolorDrawable = false;
        brVar.setSize(AndroidUtilities.dp(18.0f));
        brVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(brVar, 0, spannableString2.length(), 33);
    }

    public static cr a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.v6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        cr crVar = (cr) E.get(str);
        if (crVar != null) {
            return crVar;
        }
        HashMap hashMap = E;
        cr a2 = org.telegram.ui.Cells.v6.a(44, str);
        hashMap.put(str, a2);
        return a2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y) {
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.x ? 71.0f : 58.0f), TLObject.FLAG_30));
    }
}
