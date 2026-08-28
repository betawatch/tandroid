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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w71 extends LinearLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 a;
    public final org.telegram.ui.Components.xa0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;

    public w71(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = b6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.xa0 xa0Var = new org.telegram.ui.Components.xa0(1);
        this.b = xa0Var;
        frameLayout.setBackground(xa0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, g7.e6.e(24, 24, 17));
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = j3.r0.h(f10, textView, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = h;
        h.setTextSize(1, 13.0f);
        TextView h10 = j3.r0.h(f10, h, g7.e6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = h10;
        h10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h10, g7.e6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f10, g7.e6.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, g7.e6.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, g7.e6.t(28, 28, 19, 18, 0, 0, 0));
            addView(f10, g7.e6.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(h10, g7.e6.t(-2, -2, 16, 0, 0, 20, 0));
        }
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        this.e.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.f.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.n6, b6Var));
        this.b.b = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.n ? 60.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        int i9 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.h;
        textView.setVisibility(i9);
        textView.setText(charSequence);
    }
}
