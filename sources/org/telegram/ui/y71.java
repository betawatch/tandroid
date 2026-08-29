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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y71 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 a;
    public final org.telegram.ui.Components.mb0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;

    public y71(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = c6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(1);
        this.b = mb0Var;
        frameLayout.setBackground(mb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, i7.f6.e(24, 24, 17));
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = th.i(g10, textView, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = i10;
        i10.setTextSize(1, 13.0f);
        TextView i11 = th.i(g10, i10, i7.f6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = i11;
        i11.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i11, i7.f6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(g10, i7.f6.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, i7.f6.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, i7.f6.t(28, 28, 19, 18, 0, 0, 0));
            addView(g10, i7.f6.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(i11, i7.f6.t(-2, -2, 16, 0, 0, 20, 0));
        }
        e();
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        this.e.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n6, c6Var));
        this.b.b = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
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
