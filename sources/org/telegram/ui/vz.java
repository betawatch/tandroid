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
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vz extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public boolean c;

    public vz(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false));
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.CreateNewLink));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z10 = LocaleController.isRTL;
        textView.setPadding(z10 ? 16 : 0, 0, z10 ? 0 : 16, 0);
        boolean z11 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-1, -2.0f, 23, z11 ? 0.0f : 64.0f, 0.0f, z11 ? 64.0f : 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k7, false), mode));
        imageView.setImageDrawable(new org.telegram.ui.Components.fq(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z12 = LocaleController.isRTL;
        addView(imageView, g7.e6.d(32, 32.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 16.0f, 0.0f, z12 ? 16.0f : 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            TextView textView = this.a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.a.setAlpha(z10 ? 1.0f : 0.5f);
        this.b.setAlpha(z10 ? 1.0f : 0.5f);
    }
}
