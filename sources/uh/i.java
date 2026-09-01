package uh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class i extends LinearLayout implements b6 {
    public final g6 a;
    public final tb0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public i(Context context, g6 g6Var, boolean z4) {
        super(context);
        this.a = g6Var;
        this.h = z4;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        tb0 tb0Var = new tb0(1);
        this.b = tb0Var;
        frameLayout.setBackground(tb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, c6.e(24, 24, 17));
        LinearLayout f10 = y3.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = yh.i(f10, textView, c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = i10;
        i10.setGravity(17);
        i10.setMinWidth(AndroidUtilities.dp(20.66f));
        i10.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        i10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i10, c6.j(13.33f, 0.0f));
            addView(f10, c6.p(0, -2, 1.0f, 23, 20, 0, z4 ? 12 : 16, 0));
            addView(frameLayout, c6.t(28, 28, 21, 0, 0, z4 ? 9 : 14, 0));
        } else {
            addView(frameLayout, c6.t(28, 28, 19, z4 ? 9 : 14, 0, 0, 0));
            addView(f10, c6.p(0, -2, 1.0f, 23, z4 ? 12 : 16, 0, 20, 0));
            addView(i10, c6.j(0.0f, 13.33f));
        }
        e();
        setUnreadMode(true);
    }

    public final void a(int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        this.c.setVisibility(i12 != 0 ? 0 : 8);
        this.e.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        this.b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z4);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        int i10 = k6.G6;
        g6 g6Var = this.a;
        this.e.setTextColor(k6.v0(i10, g6Var));
        int v02 = k6.v0(this.n ? k6.W8 : k6.n6, g6Var);
        TextView textView = this.f;
        textView.setTextColor(v02);
        textView.setBackground(this.n ? k6.b0(AndroidUtilities.dp(10.33f), k6.v0(k6.U8, g6Var)) : null);
        this.b.b = g6Var != null ? g6Var.a() : k6.I.q();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z4) {
        if (this.n != z4) {
            this.n = z4;
            float f10 = z4 ? 13.0f : 16.0f;
            TextView textView = this.f;
            textView.setTextSize(1, f10);
            textView.setTypeface(z4 ? AndroidUtilities.bold() : null);
            int i10 = z4 ? k6.W8 : k6.n6;
            g6 g6Var = this.a;
            textView.setTextColor(k6.v0(i10, g6Var));
            textView.setBackground(z4 ? k6.b0(AndroidUtilities.dp(10.33f), k6.v0(k6.U8, g6Var)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
