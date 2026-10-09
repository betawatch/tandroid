package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y10 extends FrameLayout {
    public final /* synthetic */ FiltersSetupActivity E;
    public final org.telegram.ui.ActionBar.j5 a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final org.telegram.ui.Components.a40 n;
    public boolean r;
    public final org.telegram.ui.Components.ia0 s;
    public boolean v;
    public float w;
    public MessagesController.DialogFilter x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y10(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.E = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.r = false;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i10 = org.telegram.ui.ActionBar.i6.Uh;
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
        imageView.setClickable(true);
        addView(imageView, w7.x5.a(48.0f, 7.0f, 0.0f, 6.0f, 0.0f, 48, (LocaleController.isRTL ? 5 : 3) | 16));
        View view = new View(context);
        this.f = view;
        addView(view, w7.x5.a(20.0f, 22.0f, 0.0f, 22.0f, 0.0f, 20, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.a = j5Var;
        j5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        j5Var.setTextSize(16);
        j5Var.setMaxLines(1);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i10, false), mode));
        j5Var.i(drawable);
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        e6Var = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity).resourceProvider;
        j5Var.setEmojiColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        boolean z10 = LocaleController.isRTL;
        addView(j5Var, w7.x5.a(-2.0f, z10 ? 80.0f : 64.0f, 10.0f, z10 ? 64.0f : 80.0f, 0.0f, -1, (z10 ? 5 : 3) | 48));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.z6, false));
        textView.setTextSize(1, 13.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = LocaleController.isRTL;
        addView(textView, w7.x5.a(-2.0f, z11 ? 80.0f : 64.0f, 35.0f, z11 ? 64.0f : 80.0f, 0.0f, -2, (z11 ? 5 : 3) | 48));
        textView.setVisibility(8);
        org.telegram.ui.Components.ia0 ia0Var = new org.telegram.ui.Components.ia0();
        this.s = ia0Var;
        ia0Var.D = true;
        ia0Var.t = 2.0f;
        int i12 = org.telegram.ui.ActionBar.i6.i6;
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, i12, false);
        ia0Var.g(org.telegram.ui.ActionBar.i6.m1(0.4f, x03), org.telegram.ui.ActionBar.i6.m1(1.0f, x03), org.telegram.ui.ActionBar.i6.m1(0.9f, x03), org.telegram.ui.ActionBar.i6.m1(1.7f, x03));
        int dp = AndroidUtilities.dp(1.0f);
        ia0Var.x.setStrokeWidth(dp);
        ia0Var.k(40.0f);
        org.telegram.ui.Components.a40 a40Var = new org.telegram.ui.Components.a40(this, context, dp, 1);
        this.n = a40Var;
        ia0Var.setCallback(a40Var);
        a40Var.setFocusable(false);
        a40Var.setScaleType(scaleType);
        a40Var.setBackground(org.telegram.ui.ActionBar.i6.g0(x03, 1, -1));
        a40Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i10, false), mode));
        a40Var.setContentDescription(LocaleController.getString(R.string.FilterShare));
        a40Var.setVisibility(8);
        a40Var.setImageResource(R.drawable.msg_link_folder);
        a40Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i10, false), mode));
        boolean z12 = LocaleController.isRTL;
        addView(a40Var, w7.x5.a(40.0f, z12 ? 52.0f : 6.0f, 0.0f, z12 ? 6.0f : 52.0f, 0.0f, 40, (z12 ? 3 : 5) | 16));
        a40Var.setOnClickListener(new a(this, 25));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i12, false), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i10, false), mode));
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        addView(imageView2, w7.x5.a(40.0f, 6.0f, 0.0f, 6.0f, 0.0f, 40, (LocaleController.isRTL ? 3 : 5) | 16));
    }

    public MessagesController.DialogFilter getCurrentFilter() {
        return this.x;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.v) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(62.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.k0);
        }
        MessagesController.DialogFilter dialogFilter = this.x;
        if (dialogFilter != null) {
            boolean z10 = dialogFilter.locked;
            if (z10) {
                float f7 = this.w;
                if (f7 != 1.0f) {
                    this.w = f7 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f10 = this.w;
                if (f10 != 0.0f) {
                    this.w = f10 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float clamp = Utilities.clamp(this.w, 1.0f, 0.0f);
        this.w = clamp;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.setRightDrawableScale(clamp);
        j5Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.c.setOnTouchListener(onTouchListener);
    }
}
