package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class uy extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public boolean c;

    public uy(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q6, null);
        i5.c.r(16.0f, 1, 2131751701, textView, null);
        textView.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        boolean z10 = org.telegram.messenger.gd.a0;
        textView.setPadding(z10 ? 16 : 0, 0, z10 ? 0 : 16, 0);
        boolean z11 = org.telegram.messenger.gd.a0;
        addView(textView, c8.na.d(-1, -2.0f, 23, z11 ? 0.0f : 64.0f, 0.0f, z11 ? 64.0f : 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.x(this, drawable, i7, null, mode);
        org.telegram.ui.ActionBar.u6.x(this, drawable2, org.telegram.ui.ActionBar.n6.k7, null, mode);
        imageView.setImageDrawable(new org.telegram.ui.Components.lq(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z12 = org.telegram.messenger.gd.a0;
        addView(imageView, c8.na.d(32, 32.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 16.0f, 0.0f, z12 ? 16.0f : 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            TextView textView = this.a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(45.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.a.setAlpha(z10 ? 1.0f : 0.5f);
        this.b.setAlpha(z10 ? 1.0f : 0.5f);
    }
}
