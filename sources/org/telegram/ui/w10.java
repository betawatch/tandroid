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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class w10 extends FrameLayout {
    public final /* synthetic */ FiltersSetupActivity B;
    public final org.telegram.ui.ActionBar.l5 a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final org.telegram.ui.Components.m30 n;
    public boolean r;
    public final org.telegram.ui.Components.k90 s;
    public boolean v;
    public float w;
    public MessagesController.DialogFilter x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.B = filtersSetupActivity;
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
        int i10 = org.telegram.ui.ActionBar.k6.Uh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
        imageView.setClickable(true);
        addView(imageView, k7.c6.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        addView(view, k7.c6.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.a = l5Var;
        l5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        l5Var.setTextSize(16);
        l5Var.setMaxLines(1);
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), mode));
        l5Var.i(drawable);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        g6Var = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity).resourceProvider;
        l5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        boolean z4 = LocaleController.isRTL;
        addView(l5Var, k7.c6.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 80.0f : 64.0f, 10.0f, z4 ? 64.0f : 80.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.z6, false));
        textView.setTextSize(1, 13.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        addView(textView, k7.c6.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 80.0f : 64.0f, 35.0f, z10 ? 64.0f : 80.0f, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.k90 k90Var = new org.telegram.ui.Components.k90();
        this.s = k90Var;
        k90Var.C = true;
        k90Var.t = 2.0f;
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, i12, false);
        k90Var.f(org.telegram.ui.ActionBar.k6.l1(0.4f, w03), org.telegram.ui.ActionBar.k6.l1(1.0f, w03), org.telegram.ui.ActionBar.k6.l1(0.9f, w03), org.telegram.ui.ActionBar.k6.l1(1.7f, w03));
        int dp = AndroidUtilities.dp(1.0f);
        k90Var.w.setStrokeWidth(dp);
        k90Var.j(40.0f);
        org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(this, context, dp, 1);
        this.n = m30Var;
        k90Var.setCallback(m30Var);
        m30Var.setFocusable(false);
        m30Var.setScaleType(scaleType);
        m30Var.setBackground(org.telegram.ui.ActionBar.k6.f0(w03, 1, -1));
        m30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), mode));
        m30Var.setContentDescription(LocaleController.getString(R.string.FilterShare));
        m30Var.setVisibility(8);
        m30Var.setImageResource(R.drawable.msg_link_folder);
        m30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), mode));
        boolean z11 = LocaleController.isRTL;
        addView(m30Var, k7.c6.d(40, 40.0f, (z11 ? 3 : 5) | 16, z11 ? 52.0f : 6.0f, 0.0f, z11 ? 6.0f : 52.0f, 0.0f));
        m30Var.setOnClickListener(new a(this, 26));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i12, false), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), mode));
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        addView(imageView2, k7.c6.d(40, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public MessagesController.DialogFilter getCurrentFilter() {
        return this.x;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.v) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(62.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
        MessagesController.DialogFilter dialogFilter = this.x;
        if (dialogFilter != null) {
            boolean z4 = dialogFilter.locked;
            if (z4) {
                float f10 = this.w;
                if (f10 != 1.0f) {
                    this.w = f10 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z4) {
                float f11 = this.w;
                if (f11 != 0.0f) {
                    this.w = f11 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float clamp = Utilities.clamp(this.w, 1.0f, 0.0f);
        this.w = clamp;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.setRightDrawableScale(clamp);
        l5Var.invalidate();
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
