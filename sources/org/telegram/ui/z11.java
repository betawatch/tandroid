package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z11 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.xi0 A;
    public final x11 B;
    public f2.j0 C;
    public final View D;
    public final View E;
    public m11 F;
    public org.telegram.ui.Components.fp G;
    public boolean I;
    public ValueAnimator J;
    public nh.pa K;
    public float L;
    public boolean M;
    public boolean N;
    public final /* synthetic */ a21 O;
    public final org.telegram.ui.Components.ep b;
    public final w11 c;
    public final a21 d;
    public final Window e;
    public final Drawable f;
    public final bg.d1 h;
    public final TextView n;
    public final org.telegram.ui.Components.p00 r;
    public final TextView s;
    public final LinearLayout v;
    public final TextView w;
    public final ImageView x;
    public final org.telegram.ui.Components.jl0 y;
    public final Paint a = new Paint(1);
    public int H = -1;

    public z11(a21 a21Var, a21 a21Var2, Window window) {
        int i10;
        f2.j0 wVar;
        int i11;
        this.O = a21Var;
        this.d = a21Var2;
        this.e = window;
        Activity parentActivity = a21Var2.getParentActivity();
        this.c = new w11(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f = mutate;
        int themedColor = a21Var2.getThemedColor(org.telegram.ui.ActionBar.g6.h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        bg.d1 d1Var = new bg.d1(this, parentActivity, a21Var2);
        this.h = d1Var;
        TextView textView = new TextView(parentActivity);
        this.n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(a21Var2.getThemedColor(org.telegram.ui.ActionBar.g6.j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        d1Var.addView(textView, i7.f6.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        int themedColor2 = a21Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun_outline, "" + R.raw.sun_outline, dp, dp, false, null);
        this.A = xi0Var;
        this.I = org.telegram.ui.ActionBar.g6.I.q() ^ true;
        a(org.telegram.ui.ActionBar.g6.I.q(), false);
        xi0Var.h = true;
        xi0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        x11 x11Var = new x11(this, parentActivity);
        this.B = x11Var;
        x11Var.setAnimation(xi0Var);
        x11Var.setScaleType(ImageView.ScaleType.CENTER);
        x11Var.setOnClickListener(new t50(this, 28));
        x11Var.setAlpha(0.0f);
        x11Var.setVisibility(4);
        d1Var.addView(x11Var, i7.f6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(parentActivity, a21Var2.a);
        this.r = p00Var;
        p00Var.setVisibility(0);
        d1Var.addView(p00Var, i7.f6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.N = true;
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(parentActivity, null);
        this.y = jl0Var;
        i10 = ((org.telegram.ui.ActionBar.o2) a21Var).currentAccount;
        org.telegram.ui.Components.ep epVar = new org.telegram.ui.Components.ep(i10, 2, a21Var.a);
        this.b = epVar;
        jl0Var.setAdapter(epVar);
        jl0Var.setClipChildren(false);
        jl0Var.setClipToPadding(false);
        jl0Var.setItemAnimator(null);
        jl0Var.setNestedScrollingEnabled(false);
        if (this.N) {
            a21Var2.getParentActivity();
            wVar = new f2.j0(0, false);
        } else {
            a21Var2.getParentActivity();
            wVar = new f2.w(3, false);
        }
        this.C = wVar;
        jl0Var.setLayoutManager(wVar);
        jl0Var.setOnItemClickListener(new j(this, 29));
        jl0Var.setOnScrollListener(new org.telegram.ui.Components.b41(this));
        d1Var.addView(jl0Var);
        View view = new View(parentActivity);
        this.D = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        d1Var.addView(view);
        View view2 = new View(parentActivity);
        this.E = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        d1Var.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, a21Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(a21Var2.getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        d1Var.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.o2) a21Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() != a21Var.H) {
            this.v = null;
            this.x = null;
            this.w = null;
            return;
        }
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.v = linearLayout;
        linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(a21Var2.getThemedColor(i12)), 25)));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        ImageView imageView = new ImageView(parentActivity);
        this.x = imageView;
        imageView.setLayoutParams(i7.f6.t(24, 24, 17, 0, 0, 10, 0));
        imageView.setImageResource(R.drawable.profile_qr_scan_24);
        imageView.setColorFilter(new PorterDuffColorFilter(a21Var2.getThemedColor(i12), mode));
        linearLayout.addView(imageView);
        TextView textView3 = new TextView(parentActivity);
        this.w = textView3;
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setText(LocaleController.getString(R.string.ScanQrCode));
        textView3.setTextColor(a21Var2.getThemedColor(i12));
        textView3.setTextSize(1, 15.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3);
        d1Var.addView(linearLayout);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        org.telegram.ui.Components.xi0 xi0Var = this.A;
        int i10 = z10 ? xi0Var.e[0] - 1 : 0;
        x11 x11Var = this.B;
        if (z11) {
            xi0Var.N(i10);
            if (x11Var != null) {
                x11Var.d();
                return;
            }
            return;
        }
        xi0Var.N(i10);
        xi0Var.L(i10, false, true);
        if (x11Var != null) {
            x11Var.invalidate();
        }
    }

    public final void b(int i10) {
        this.H = i10;
        org.telegram.ui.Components.ep epVar = this.b;
        epVar.E(i10);
        if (i10 > 0 && i10 < epVar.d.size() / 2) {
            i10--;
        }
        this.C.h1(Math.min(i10, epVar.d.size() - 1), 0);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.b.l();
        }
    }
}
