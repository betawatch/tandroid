package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t41 extends FrameLayout {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t41(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 7:
                org.telegram.ui.ActionBar.j6.i3.setBounds(0, 0, getMeasuredWidth(), org.telegram.ui.ActionBar.j6.i3.getIntrinsicHeight());
                org.telegram.ui.ActionBar.j6.i3.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 10:
                return super.drawChild(canvas, view, j3);
            case 11:
            default:
                return super.drawChild(canvas, view, j3);
            case 12:
                return false;
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 6:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, org.telegram.ui.ActionBar.j6.k0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 3:
                int childCount = getChildCount();
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getMeasuredWidth() + i14 > getMeasuredWidth()) {
                        i15 += getChildAt(i16).getMeasuredHeight();
                        i14 = 0;
                    }
                    getChildAt(i16).layout(i14, i15, getChildAt(i16).getMeasuredWidth() + i14, getChildAt(i16).getMeasuredHeight() + i15);
                    i14 += getChildAt(i16).getMeasuredWidth();
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                super.onMeasure(i10, org.telegram.messenger.wl.C(36.0f, View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i10, i11);
                break;
            case 3:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
                int childCount = getChildCount();
                int measuredHeight = childCount > 0 ? getChildAt(0).getMeasuredHeight() : 0;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getMeasuredWidth() + i12 > size) {
                        i13 += getChildAt(i14).getMeasuredHeight();
                        i12 = 0;
                    }
                    i12 += getChildAt(i14).getMeasuredWidth();
                }
                setMeasuredDimension(getMeasuredWidth(), getChildCount() != 0 ? AndroidUtilities.dp(16.0f) + measuredHeight + i13 : 0);
                break;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                super.onMeasure(i10, i11);
                break;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t41(u41 u41Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.a = 0;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f6Var = ((org.telegram.ui.ActionBar.g3) u41Var).resourcesProvider;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.x5.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        f6Var2 = ((org.telegram.ui.ActionBar.g3) u41Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        addView(textView, w7.x5.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(getContext(), null);
        c90Var.setText(charSequence);
        c90Var.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Pi;
        f6Var3 = ((org.telegram.ui.ActionBar.g3) u41Var).resourcesProvider;
        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var3));
        int i13 = org.telegram.ui.ActionBar.j6.gc;
        f6Var4 = ((org.telegram.ui.ActionBar.g3) u41Var).resourcesProvider;
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var4));
        c90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        c90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(c90Var, w7.x5.d(-2, -2.0f, z10 ? 5 : 3, (z10 ? 27 : 68) - 4, 18.0f, (z10 ? 68 : 27) - 4, 0.0f));
    }
}
