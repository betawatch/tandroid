package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class z71 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Components.mc0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;
    public boolean r;

    public z71(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.n = true;
        this.a = g6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0(1);
        this.b = mc0Var;
        frameLayout.setBackground(mc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.z5.e(24, 24, 17));
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f7 = org.telegram.messenger.sl.f(e, textView, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = f7;
        f7.setTextSize(1, 13.0f);
        TextView f10 = org.telegram.messenger.sl.f(e, f7, w7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = f10;
        f10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(f10, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(e, w7.z5.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, w7.z5.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, w7.z5.t(28, 28, 19, 18, 0, 0, 0));
            addView(e, w7.z5.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(f10, w7.z5.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.r ? 60.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.h;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, g6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, g6Var));
        this.b.b = this.n && (g6Var == null ? org.telegram.ui.ActionBar.k6.I.q() : g6Var.a());
    }
}
