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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t21 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.gj0 B;
    public final r21 C;
    public f2.i0 D;
    public final View E;
    public final View F;
    public e21 G;
    public org.telegram.ui.Components.ip H;
    public boolean J;
    public ValueAnimator K;
    public org.telegram.ui.Components.to L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ u21 P;
    public final org.telegram.ui.Components.hp b;
    public final q21 c;
    public final u21 d;
    public final Window e;
    public final Drawable f;
    public final ah.e h;
    public final TextView n;
    public final org.telegram.ui.Components.u00 r;
    public final TextView s;
    public final LinearLayout v;
    public final TextView w;
    public final ImageView x;
    public final org.telegram.ui.Components.rl0 y;
    public final Paint a = new Paint(1);
    public int I = -1;

    public t21(u21 u21Var, u21 u21Var2, Window window) {
        int i10;
        f2.i0 wVar;
        int i11;
        this.P = u21Var;
        this.d = u21Var2;
        this.e = window;
        Activity parentActivity = u21Var2.getParentActivity();
        this.c = new q21(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f = mutate;
        int themedColor = u21Var2.getThemedColor(org.telegram.ui.ActionBar.j6.h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ah.e eVar = new ah.e(this, parentActivity, u21Var2);
        this.h = eVar;
        TextView textView = new TextView(parentActivity);
        this.n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(u21Var2.getThemedColor(org.telegram.ui.ActionBar.j6.j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        eVar.addView(textView, k7.b6.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor2 = u21Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.sun_outline, dp, dp, false, null);
        this.B = gj0Var;
        this.J = !org.telegram.ui.ActionBar.j6.I.q();
        int i13 = 0;
        a(org.telegram.ui.ActionBar.j6.I.q(), false);
        gj0Var.h = true;
        gj0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        r21 r21Var = new r21(this, parentActivity);
        this.C = r21Var;
        r21Var.setAnimation(gj0Var);
        r21Var.setScaleType(ImageView.ScaleType.CENTER);
        r21Var.setOnClickListener(new g60(this, 27));
        r21Var.setAlpha(0.0f);
        r21Var.setVisibility(4);
        eVar.addView(r21Var, k7.b6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(parentActivity, u21Var2.a);
        this.r = u00Var;
        u00Var.setVisibility(0);
        eVar.addView(u00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.O = true;
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(parentActivity, null);
        this.y = rl0Var;
        i10 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(i10, 2, u21Var.a);
        this.b = hpVar;
        rl0Var.setAdapter(hpVar);
        rl0Var.setClipChildren(false);
        rl0Var.setClipToPadding(false);
        rl0Var.setItemAnimator(null);
        rl0Var.setNestedScrollingEnabled(false);
        if (this.O) {
            u21Var2.getParentActivity();
            wVar = new f2.i0(0, false);
        } else {
            u21Var2.getParentActivity();
            wVar = new f2.w(3, false);
        }
        this.D = wVar;
        rl0Var.setLayoutManager(wVar);
        rl0Var.setOnItemClickListener(new p21(this, i13));
        rl0Var.setOnScrollListener(new org.telegram.ui.Components.n41(this));
        eVar.addView(rl0Var);
        View view = new View(parentActivity);
        this.E = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        eVar.addView(view);
        View view2 = new View(parentActivity);
        this.F = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        eVar.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, u21Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(u21Var2.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        eVar.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() != u21Var.I) {
            this.v = null;
            this.x = null;
            this.w = null;
            return;
        }
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.v = linearLayout;
        linearLayout.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.z5.b(u21Var2.getThemedColor(i12)), 25)));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        ImageView imageView = new ImageView(parentActivity);
        this.x = imageView;
        imageView.setLayoutParams(k7.b6.t(24, 24, 17, 0, 0, 10, 0));
        imageView.setImageResource(R.drawable.profile_qr_scan_24);
        imageView.setColorFilter(new PorterDuffColorFilter(u21Var2.getThemedColor(i12), mode));
        linearLayout.addView(imageView);
        TextView textView3 = new TextView(parentActivity);
        this.w = textView3;
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setText(LocaleController.getString(R.string.ScanQrCode));
        textView3.setTextColor(u21Var2.getThemedColor(i12));
        textView3.setTextSize(1, 15.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3);
        eVar.addView(linearLayout);
    }

    public final void a(boolean z4, boolean z10) {
        if (this.J == z4) {
            return;
        }
        this.J = z4;
        org.telegram.ui.Components.gj0 gj0Var = this.B;
        int i10 = z4 ? gj0Var.e[0] - 1 : 0;
        r21 r21Var = this.C;
        if (z10) {
            gj0Var.N(i10);
            if (r21Var != null) {
                r21Var.d();
                return;
            }
            return;
        }
        gj0Var.N(i10);
        gj0Var.L(i10, false, true);
        if (r21Var != null) {
            r21Var.invalidate();
        }
    }

    public final void b(int i10) {
        this.I = i10;
        org.telegram.ui.Components.hp hpVar = this.b;
        hpVar.E(i10);
        if (i10 > 0 && i10 < hpVar.d.size() / 2) {
            i10--;
        }
        this.D.h1(Math.min(i10, hpVar.d.size() - 1), 0);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.b.l();
        }
    }
}
