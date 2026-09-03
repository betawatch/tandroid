package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s81 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Components.tb0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;

    public s81(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = g6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(1);
        this.b = tb0Var;
        frameLayout.setBackground(tb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, k7.c6.e(24, 24, 17));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = yh.i(f10, textView, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = i10;
        i10.setTextSize(1, 13.0f);
        TextView i11 = yh.i(f10, i10, k7.c6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = i11;
        i11.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i11, k7.c6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f10, k7.c6.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, k7.c6.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, k7.c6.t(28, 28, 19, 18, 0, 0, 0));
            addView(f10, k7.c6.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(i11, k7.c6.t(-2, -2, 16, 0, 0, 20, 0));
        }
        e();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.y6, g6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.n6, g6Var));
        this.b.b = g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.n ? 60.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.h;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
