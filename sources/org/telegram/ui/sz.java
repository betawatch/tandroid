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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sz extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public boolean c;

    public sz(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q6, null);
        sc.e.u(textView, 1, 16.0f, null, 2131751714);
        textView.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        boolean z10 = org.telegram.messenger.cd.X;
        textView.setPadding(z10 ? 16 : 0, 0, z10 ? 0 : 16, 0);
        boolean z11 = org.telegram.messenger.cd.X;
        addView(textView, w7.b6.d(-1, -2.0f, 23, z11 ? 0.0f : 64.0f, 0.0f, z11 ? 64.0f : 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.y(this, drawable, i10, null, mode);
        org.telegram.ui.ActionBar.a7.y(this, drawable2, org.telegram.ui.ActionBar.t6.k7, null, mode);
        imageView.setImageDrawable(new org.telegram.ui.Components.eq(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z12 = org.telegram.messenger.cd.X;
        addView(imageView, w7.b6.d(32, 32.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 16.0f, 0.0f, z12 ? 16.0f : 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            TextView textView = this.a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(45.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.a.setAlpha(z10 ? 1.0f : 0.5f);
        this.b.setAlpha(z10 ? 1.0f : 0.5f);
    }
}
