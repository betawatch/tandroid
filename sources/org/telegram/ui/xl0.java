package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xl0 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final FrameLayout c;
    public final org.telegram.ui.Components.x9 d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public boolean n;
    public String r;

    public xl0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = i10;
        this.b = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, w7.x5.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.d = x9Var;
        x9Var.setImageResource(R.drawable.msg2_permissions);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.3f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        x9Var.setColorFilter(new PorterDuffColorFilter(l1, mode));
        frameLayout.addView(x9Var, w7.x5.e(36, 36, 17));
        TextView b10 = w7.b6.b(context, 15.0f, i11, true, null);
        this.e = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, w7.x5.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.j6.y6;
        TextView b11 = w7.b6.b(context, 13.0f, i12, false, null);
        this.f = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, w7.x5.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false), mode));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 1, -1));
        addView(imageView, w7.x5.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.n) {
            Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", this.b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.j6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 72.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 0.0f), getMeasuredHeight(), T0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }
}
