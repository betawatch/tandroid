package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class qv0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public boolean e;
    public gw0 f;
    public org.telegram.ui.Components.i5 h;
    public Drawable n;

    public qv0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.a = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(15);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        linearLayout.addView(h5Var, g7.e6.n(-1, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, g7.e6.p(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, g7.e6.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, g7.e6.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.M6, b6Var));
        addView(imageView2, g7.e6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(gw0 gw0Var, boolean z10) {
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && gw0Var.a == 12 && gw0Var.b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
            b(emojiStatusDocumentId == null ? 0L : emojiStatusDocumentId.longValue(), false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.i5 i5Var = this.h;
            if (i5Var != null) {
                i5Var.b();
                this.h = null;
            }
        }
        this.f = gw0Var;
        this.a.l(gw0Var.c, false);
        this.b.setText(gw0Var.d);
        this.c.setImageResource(gw0Var.b);
        this.e = z10;
    }

    public final void b(long j10, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j10 != 0) {
            this.h.j(j10, z10);
            return;
        }
        if (this.n == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
            this.n = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.v6, false), PorterDuff.Mode.SRC_IN));
        }
        this.h.g(this.n, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.v6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.i5 i5Var = this.h;
        if (i5Var != null) {
            i5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.i5 i5Var = this.h;
        if (i5Var != null) {
            i5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
