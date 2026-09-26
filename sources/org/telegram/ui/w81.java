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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class w81 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public final org.telegram.ui.Components.ac0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;

    public w81(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = d6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(1);
        this.b = ac0Var;
        frameLayout.setBackground(ac0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.y5.e(24, 24, 17));
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(f7, textView, w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = h;
        h.setTextSize(1, 13.0f);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(f7, h, w7.y5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = h10;
        h10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(h10, w7.y5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f7, w7.y5.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, w7.y5.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, w7.y5.t(28, 28, 19, 18, 0, 0, 0));
            addView(f7, w7.y5.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(h10, w7.y5.t(-2, -2, 16, 0, 0, 20, 0));
        }
        e();
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        this.f.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.y6, d6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.n6, d6Var));
        this.b.b = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q();
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
