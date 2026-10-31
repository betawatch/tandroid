package rh;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b30;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.mn;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.br;
import org.telegram.ui.do0;
import org.telegram.ui.i51;
import org.telegram.ui.o10;
import org.telegram.ui.o60;
import org.telegram.ui.oo;
import org.telegram.ui.p10;
import org.telegram.ui.u71;
import org.telegram.ui.un;
import org.telegram.ui.vf;
import org.telegram.ui.wt;
import w7.b9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h8 extends p10 implements us {
    public static DecimalFormat v0;
    public static DecimalFormat w0;
    public FrameLayout R;
    public lg.q S;
    public g8 T;
    public ku0 U;
    public bi.t0 V;
    public View W;
    public fe.b X;
    public fe.b Y;
    public fe.b Z;
    public int b0;
    public int c0;
    public boolean d0;
    public boolean e0;
    public do0 g0;
    public xz h0;
    public LinearLayout i0;
    public SpannableStringBuilder j0;
    public org.telegram.ui.Components.f6 k0;
    public TextView l0;
    public vh.d m0;
    public org.telegram.ui.Components.voip.i0 n0;
    public vh.d o0;
    public u71 p0;
    public vh.d q0;
    public vh.d r0;
    public boolean s0;
    public boolean t0;
    public ph.o3 u0;
    public int a0 = -1;
    public final ph.x1 f0 = new ph.x1(this, 22);

    public h8() {
        this.M = true;
    }

    public static void A0(h8 h8Var) {
        e6.y(h8Var.currentAccount, false).u();
        mg.i2.l1(1, org.telegram.messenger.y1.a(h8Var.currentAccount).b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04fe  */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void B0(h8 h8Var, int i10) {
        a51 G;
        int i11;
        boolean[] zArr;
        String str;
        final boolean z10;
        final boolean z11;
        TLRPC.Chat chat;
        boolean[] zArr2;
        TLRPC.Chat chat2;
        String str2;
        int i12;
        Activity activity;
        boolean z12;
        String str3;
        String str4;
        long currentTime;
        long j10;
        int i13;
        j7 j7Var;
        final org.telegram.ui.ActionBar.z2[] z2VarArr;
        final int i14;
        ?? r52;
        org.telegram.ui.ActionBar.k2 T;
        ph.o3 o3Var = h8Var.u0;
        if (o3Var == null || (G = o3Var.G(i10)) == null) {
            return;
        }
        int i15 = G.d;
        if (i15 == -1) {
            h8Var.u0.O(true);
            return;
        }
        int i16 = 0;
        if (i15 == -2) {
            e6.y(h8Var.currentAccount, false).u();
            mg.i2.l1(1, org.telegram.messenger.y1.a(h8Var.currentAccount).b());
            return;
        }
        if (i15 == -3) {
            e6.y(h8Var.currentAccount, false).V();
            h8Var.u0.O(true);
            return;
        }
        if (i15 == -4) {
            if (vp.r1(h8Var.currentAccount).u2()) {
                org.telegram.ui.b.b(h8Var.currentAccount);
                return;
            } else {
                h8Var.presentFragment(new xh.z2(h8Var.getUserConfig().e()));
                return;
            }
        }
        if (G.H(u7.class)) {
            if (G.G instanceof TL_stars.TL_starsTopupOption) {
                e6.y(h8Var.currentAccount, false).f(h8Var.getParentActivity(), (TL_stars.TL_starsTopupOption) G.G, new s6(i16, h8Var, G), null);
                return;
            }
            return;
        }
        if (G.H(z7.class) && (G.G instanceof TL_stars.StarsSubscription)) {
            Activity parentActivity = h8Var.getParentActivity();
            int i17 = h8Var.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.G;
            org.telegram.ui.ActionBar.p6 resourceProvider = h8Var.getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            org.telegram.ui.ActionBar.z2 h = z20.h(parentActivity, false, 1, resourceProvider);
            org.telegram.ui.ActionBar.z2[] z2VarArr2 = new org.telegram.ui.ActionBar.z2[1];
            LinearLayout e = org.telegram.messenger.m5.e(parentActivity, 1);
            e.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.0f));
            e.setClipChildren(false);
            e.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            e.addView(frameLayout, w7.b6.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr3 = new boolean[1];
            j7 j7Var2 = new j7(zArr3, z2VarArr2);
            zs.f(i17).b(j7Var2, zs.A3);
            long o10 = org.telegram.messenger.o5.o(starsSubscription.peer);
            g9 g9Var = new g9(parentActivity);
            int i18 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
            if (i18 >= 0) {
                TLRPC.User Z1 = vp.r1(i17).Z1(Long.valueOf(o10));
                String p5 = h20.p(Z1);
                boolean t10 = h20.t(Z1);
                z10 = !t10;
                str = p5;
                zArr = zArr3;
                z11 = t10;
                i11 = i18;
                chat = Z1;
            } else {
                i11 = i18;
                zArr = zArr3;
                TLRPC.Chat L0 = vp.r1(i17).L0(Long.valueOf(-o10));
                str = L0 == null ? "" : L0.title;
                z10 = false;
                z11 = false;
                chat = L0;
            }
            TLRPC.Chat chat3 = chat;
            if (starsSubscription.photo != null) {
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
                zArr2 = zArr;
                g9Var.p(ic.p(b30.c(starsSubscription.photo)), "100_100", null, null);
            } else {
                zArr2 = zArr;
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(50.0f));
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                if (i11 < 0) {
                    chat2 = chat3;
                    str2 = str;
                    TLRPC.Chat L02 = vp.r1(i17).L0(Long.valueOf(-o10));
                    r8Var.q(L02);
                    g9Var.e(L02, r8Var);
                    frameLayout.addView(g9Var, w7.b6.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    org.telegram.ui.ActionBar.a7.y(frameLayout, drawable, org.telegram.ui.ActionBar.t6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, w7.b6.e(28, 28, 17));
                        imageView.setTranslationX(org.telegram.messenger.i0.L(34.0f));
                        imageView.setTranslationY(org.telegram.messenger.i0.L(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, w7.b6.e(28, 28, 17));
                        imageView2.setTranslationX(org.telegram.messenger.i0.L(34.0f));
                        imageView2.setTranslationY(org.telegram.messenger.i0.L(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.j5, resourceProvider, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(cd.L0(2131744989, null));
                    }
                    e.addView(textView, w7.b6.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.B6, resourceProvider);
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i12 = tL_starsSubscriptionPricing.period;
                    if (i12 != 2592000) {
                        textView2.setText(Z0(false, cd.a0(null, null, 2131745001, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f, null));
                    } else {
                        textView2.setText(Z0(false, cd.a0(null, null, 2131745001, Long.valueOf(tL_starsSubscriptionPricing.amount), i12 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    e.addView(textView2, w7.b6.t(-1, -2, 17, 20, 0, 20, 4));
                    wy0 wy0Var = new wy0(parentActivity, resourceProvider);
                    p80 p80Var = new p80(parentActivity, resourceProvider);
                    p80Var.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
                    p80Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i19 = org.telegram.ui.ActionBar.t6.Uc;
                    org.telegram.ui.ActionBar.a7.V(p80Var, i19, resourceProvider);
                    org.telegram.ui.ActionBar.a7.H(p80Var, i19, resourceProvider);
                    p80Var.setTextSize(1, 14.0f);
                    p80Var.setSingleLine(true);
                    p80Var.setDisablePaddingsOffsetY(true);
                    org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(24.0f, i17, p80Var);
                    if (i11 < 0) {
                        TLRPC.User Z12 = vp.r1(i17).Z1(Long.valueOf(o10));
                        z12 = Z12 == null || h20.x(Z12);
                        str3 = h20.p(Z12);
                        e5Var.e(Z12);
                        activity = parentActivity;
                    } else {
                        activity = parentActivity;
                        TLRPC.Chat L03 = vp.r1(i17).L0(Long.valueOf(-o10));
                        z12 = L03 == null;
                        str3 = L03 != null ? L03.title : "";
                        e5Var.b(L03);
                    }
                    String str5 = str3;
                    final TLRPC.Chat chat4 = chat2;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str5));
                    spannableStringBuilder.setSpan(e5Var, 0, 1, 33);
                    spannableStringBuilder.setSpan(new k7(z2VarArr2, o10), 3, spannableStringBuilder.length(), 33);
                    p80Var.setText(spannableStringBuilder);
                    if (!z12) {
                        wy0Var.l(p80Var, cd.L0(i11 < 0 ? 2131745013 : z10 ? 2131745023 : 2131745028, null));
                    }
                    if (i11 >= 0 || TextUtils.isEmpty(starsSubscription.title)) {
                        str4 = null;
                    } else {
                        str4 = null;
                        wy0Var.c(cd.L0(z10 ? 2131745021 : 2131745026, null), starsSubscription.title, null, null);
                    }
                    wy0Var.c(cd.L0(2131744994, str4), cd.a0(null, null, 2131742808, cd.D0().r0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), cd.D0().o0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i17).getCurrentTime();
                    if (!starsSubscription.canceled || starsSubscription.bot_canceled) {
                        j10 = o10;
                        i13 = 2131744987;
                    } else {
                        j10 = o10;
                        i13 = currentTime > ((long) starsSubscription.until_date) ? 2131744988 : 2131744986;
                    }
                    wy0Var.c(cd.L0(i13, null), cd.a0(null, null, 2131742808, cd.D0().r0().format(new Date(starsSubscription.until_date * 1000)), cd.D0().o0().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    e.addView(wy0Var, w7.b6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    final Activity activity2 = activity;
                    p80 p80Var2 = new p80(activity2, resourceProvider);
                    int i20 = org.telegram.ui.ActionBar.t6.z6;
                    org.telegram.ui.ActionBar.a7.V(p80Var2, i20, resourceProvider);
                    org.telegram.ui.ActionBar.a7.H(p80Var2, i19, resourceProvider);
                    final int i21 = 1;
                    p80Var2.setTextSize(1, 14.0f);
                    p80Var2.setText(org.telegram.messenger.i0.T2(cd.L0(2131744944, null), new Runnable() { // from class: e0.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            int i22 = i21;
                            Activity activity3 = activity2;
                            switch (i22) {
                                case 0:
                                    if (activity3.isFinishing()) {
                                        return;
                                    }
                                    Handler handler = e.g;
                                    Method method = e.f;
                                    int i23 = Build.VERSION.SDK_INT;
                                    if (i23 >= 28) {
                                        activity3.recreate();
                                        return;
                                    }
                                    if (((i23 != 26 && i23 != 27) || method != null) && (e.e != null || e.d != null)) {
                                        try {
                                            Object obj2 = e.c.get(activity3);
                                            if (obj2 != null && (obj = e.b.get(activity3)) != null) {
                                                Application application = activity3.getApplication();
                                                d dVar = new d(activity3);
                                                application.registerActivityLifecycleCallbacks(dVar);
                                                handler.post(new j9.u(11, dVar, obj2));
                                                try {
                                                    if (i23 == 26 || i23 == 27) {
                                                        Boolean bool = Boolean.FALSE;
                                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                                    } else {
                                                        activity3.recreate();
                                                    }
                                                    handler.post(new j9.u(12, application, dVar));
                                                    return;
                                                } finally {
                                                    handler.post(new j9.u(12, application, dVar));
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    activity3.recreate();
                                    return;
                                default:
                                    gf.f.r(activity3, cd.L0(2131744984, null));
                                    return;
                            }
                        }
                    }));
                    p80Var2.setGravity(17);
                    e.addView(p80Var2, w7.b6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        j7Var = j7Var2;
                        z2VarArr = z2VarArr2;
                        i14 = i17;
                        p80 p80Var3 = new p80(activity2, resourceProvider);
                        org.telegram.ui.ActionBar.a7.V(p80Var3, i20, resourceProvider);
                        org.telegram.ui.ActionBar.a7.H(p80Var3, i19, resourceProvider);
                        p80Var3.setTextSize(1, 14.0f);
                        p80Var3.setText(cd.a0(null, null, 2131745003, cd.u(starsSubscription.until_date, false)));
                        p80Var3.setSingleLine(false);
                        p80Var3.setMaxLines(4);
                        p80Var3.setGravity(17);
                        e.addView(p80Var3, w7.b6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            vh.d dVar = new vh.d(activity2, resourceProvider, true);
                            dVar.setRoundRadius(24);
                            r52 = 0;
                            dVar.i(cd.L0(2131745029, null), false, true);
                            e.addView(dVar, w7.b6.o(-1, 48));
                            dVar.setOnClickListener(new wt(dVar, starsSubscription, i14, z2VarArr, resourceProvider, zArr2, activity2));
                            h.N = e;
                            z2VarArr[r52] = h;
                            h.T0 = r52;
                            h.setOnDismissListener(new jg.w(i14, j7Var));
                            z2VarArr[r52].O();
                            T = LaunchActivity.T();
                            if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(T)) {
                                z2VarArr[r52].a0(T);
                            }
                            z2VarArr[r52].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        p80 p80Var4 = new p80(activity2, resourceProvider);
                        org.telegram.ui.ActionBar.a7.V(p80Var4, i20, resourceProvider);
                        org.telegram.ui.ActionBar.a7.H(p80Var4, i19, resourceProvider);
                        p80Var4.setTextSize(1, 14.0f);
                        p80Var4.setText(cd.a0(null, null, z11 ? 2131745024 : 2131744999, cd.u(starsSubscription.until_date, false)));
                        p80Var4.setSingleLine(false);
                        p80Var4.setMaxLines(4);
                        p80Var4.setGravity(17);
                        e.addView(p80Var4, w7.b6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        vh.d dVar2 = new vh.d(activity2, resourceProvider, true);
                        dVar2.i(cd.L0(z11 ? 2131745025 : 2131745000, null), false, true);
                        e.addView(dVar2, w7.b6.o(-1, 48));
                        j7Var = j7Var2;
                        z2VarArr = z2VarArr2;
                        y6 y6Var = new y6(dVar2, i17, starsSubscription, z2VarArr, j10, activity2, resourceProvider, z10, str2);
                        i14 = i17;
                        dVar2.setOnClickListener(y6Var);
                    } else {
                        j7Var = j7Var2;
                        z2VarArr = z2VarArr2;
                        i14 = i17;
                        if (starsSubscription.bot_canceled) {
                            p80 p80Var5 = new p80(activity2, resourceProvider);
                            org.telegram.ui.ActionBar.a7.V(p80Var5, org.telegram.ui.ActionBar.t6.kk, resourceProvider);
                            org.telegram.ui.ActionBar.a7.H(p80Var5, i19, resourceProvider);
                            p80Var5.setTextSize(1, 14.0f);
                            p80Var5.setText(cd.L0(z10 ? 2131745022 : 2131745027, null));
                            p80Var5.setSingleLine(false);
                            p80Var5.setMaxLines(4);
                            p80Var5.setGravity(17);
                            e.addView(p80Var5, w7.b6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            p80 p80Var6 = new p80(activity2, resourceProvider);
                            org.telegram.ui.ActionBar.a7.V(p80Var6, org.telegram.ui.ActionBar.t6.kk, resourceProvider);
                            org.telegram.ui.ActionBar.a7.H(p80Var6, i19, resourceProvider);
                            p80Var6.setTextSize(1, 14.0f);
                            p80Var6.setText(cd.L0(2131745016, null));
                            p80Var6.setSingleLine(false);
                            p80Var6.setMaxLines(4);
                            p80Var6.setGravity(17);
                            e.addView(p80Var6, w7.b6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                vh.d dVar3 = new vh.d(activity2, resourceProvider, true);
                                dVar3.i(cd.L0(2131744998, null), false, true);
                                e.addView(dVar3, w7.b6.o(-1, 48));
                                dVar3.setOnClickListener(new vf(dVar3, starsSubscription, i14, z2VarArr, chat4, str2));
                            }
                        } else {
                            p80 p80Var7 = new p80(activity2, resourceProvider);
                            org.telegram.ui.ActionBar.a7.V(p80Var7, i20, resourceProvider);
                            org.telegram.ui.ActionBar.a7.H(p80Var7, i19, resourceProvider);
                            p80Var7.setTextSize(1, 14.0f);
                            p80Var7.setText(cd.a0(null, null, 2131745019, cd.u(starsSubscription.until_date, false)));
                            p80Var7.setSingleLine(false);
                            p80Var7.setMaxLines(4);
                            p80Var7.setGravity(17);
                            e.addView(p80Var7, w7.b6.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final vh.d dVar4 = new vh.d(activity2, resourceProvider, false);
                            dVar4.i(cd.L0(2131745020, null), false, true);
                            dVar4.setTextColorKey(org.telegram.ui.ActionBar.t6.kk);
                            e.addView(dVar4, w7.b6.o(-1, 48));
                            dVar4.setOnClickListener(new View.OnClickListener() { // from class: rh.z6
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final vh.d dVar5 = dVar4;
                                    if (dVar5.Q) {
                                        return;
                                    }
                                    dVar5.setLoading(true);
                                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                    tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                    final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                                    tL_changeStarsSubscription.subscription_id = starsSubscription2.id;
                                    final int i22 = i14;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i22);
                                    final TLObject tLObject = chat4;
                                    final boolean z13 = z10;
                                    final boolean z14 = z11;
                                    final org.telegram.ui.ActionBar.z2[] z2VarArr3 = z2VarArr;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: rh.c7
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            org.telegram.messenger.i0.g3(new li.m0(i22, tLObject, starsSubscription2, dVar5, z13, z14, z2VarArr3));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r52 = 0;
                    h.N = e;
                    z2VarArr[r52] = h;
                    h.T0 = r52;
                    h.setOnDismissListener(new jg.w(i14, j7Var));
                    z2VarArr[r52].O();
                    T = LaunchActivity.T();
                    if (!org.telegram.messenger.i0.Q1()) {
                        z2VarArr[r52].a0(T);
                    }
                    z2VarArr[r52].show();
                }
                TLRPC.User Z13 = vp.r1(i17).Z1(Long.valueOf(o10));
                r8Var.r(Z13);
                g9Var.e(Z13, r8Var);
            }
            chat2 = chat3;
            str2 = str;
            frameLayout.addView(g9Var, w7.b6.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.a7.y(frameLayout, drawable3, org.telegram.ui.ActionBar.t6.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            org.telegram.messenger.m5.m(textView3, org.telegram.ui.ActionBar.t6.j5, resourceProvider, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            e.addView(textView3, w7.b6.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.B6, resourceProvider);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i12 = tL_starsSubscriptionPricing2.period;
            if (i12 != 2592000) {
            }
            e.addView(textView22, w7.b6.t(-1, -2, 17, 20, 0, 20, 4));
            wy0 wy0Var2 = new wy0(parentActivity, resourceProvider);
            p80 p80Var8 = new p80(parentActivity, resourceProvider);
            p80Var8.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
            p80Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i192 = org.telegram.ui.ActionBar.t6.Uc;
            org.telegram.ui.ActionBar.a7.V(p80Var8, i192, resourceProvider);
            org.telegram.ui.ActionBar.a7.H(p80Var8, i192, resourceProvider);
            p80Var8.setTextSize(1, 14.0f);
            p80Var8.setSingleLine(true);
            p80Var8.setDisablePaddingsOffsetY(true);
            org.telegram.ui.e5 e5Var2 = new org.telegram.ui.e5(24.0f, i17, p80Var8);
            if (i11 < 0) {
            }
            String str52 = str3;
            final TLObject chat42 = chat2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str52));
            spannableStringBuilder2.setSpan(e5Var2, 0, 1, 33);
            spannableStringBuilder2.setSpan(new k7(z2VarArr2, o10), 3, spannableStringBuilder2.length(), 33);
            p80Var8.setText(spannableStringBuilder2);
            if (!z12) {
            }
            if (i11 >= 0) {
            }
            str4 = null;
            wy0Var2.c(cd.L0(2131744994, str4), cd.a0(null, null, 2131742808, cd.D0().r0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), cd.D0().o0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i17).getCurrentTime();
            if (starsSubscription.canceled) {
            }
            j10 = o10;
            i13 = 2131744987;
            wy0Var2.c(cd.L0(i13, null), cd.a0(null, null, 2131742808, cd.D0().r0().format(new Date(starsSubscription.until_date * 1000)), cd.D0().o0().format(new Date(starsSubscription.until_date * 1000))), null, null);
            e.addView(wy0Var2, w7.b6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            final Activity activity22 = activity;
            p80 p80Var22 = new p80(activity22, resourceProvider);
            int i202 = org.telegram.ui.ActionBar.t6.z6;
            org.telegram.ui.ActionBar.a7.V(p80Var22, i202, resourceProvider);
            org.telegram.ui.ActionBar.a7.H(p80Var22, i192, resourceProvider);
            final int i212 = 1;
            p80Var22.setTextSize(1, 14.0f);
            p80Var22.setText(org.telegram.messenger.i0.T2(cd.L0(2131744944, null), new Runnable() { // from class: e0.a
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    int i22 = i212;
                    Activity activity3 = activity22;
                    switch (i22) {
                        case 0:
                            if (activity3.isFinishing()) {
                                return;
                            }
                            Handler handler = e.g;
                            Method method = e.f;
                            int i23 = Build.VERSION.SDK_INT;
                            if (i23 >= 28) {
                                activity3.recreate();
                                return;
                            }
                            if (((i23 != 26 && i23 != 27) || method != null) && (e.e != null || e.d != null)) {
                                try {
                                    Object obj2 = e.c.get(activity3);
                                    if (obj2 != null && (obj = e.b.get(activity3)) != null) {
                                        Application application = activity3.getApplication();
                                        d dVar5 = new d(activity3);
                                        application.registerActivityLifecycleCallbacks(dVar5);
                                        handler.post(new j9.u(11, dVar5, obj2));
                                        try {
                                            if (i23 == 26 || i23 == 27) {
                                                Boolean bool = Boolean.FALSE;
                                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                            } else {
                                                activity3.recreate();
                                            }
                                            handler.post(new j9.u(12, application, dVar5));
                                            return;
                                        } finally {
                                            handler.post(new j9.u(12, application, dVar5));
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            activity3.recreate();
                            return;
                        default:
                            gf.f.r(activity3, cd.L0(2131744984, null));
                            return;
                    }
                }
            }));
            p80Var22.setGravity(17);
            e.addView(p80Var22, w7.b6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r52 = 0;
            h.N = e;
            z2VarArr[r52] = h;
            h.T0 = r52;
            h.setOnDismissListener(new jg.w(i14, j7Var));
            z2VarArr[r52].O();
            T = LaunchActivity.T();
            if (!org.telegram.messenger.i0.Q1()) {
            }
            z2VarArr[r52].show();
        }
    }

    public static void C0(h8 h8Var, a51 a51Var, Boolean bool, String str) {
        if (h8Var.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            cc.a0(h8Var).I(R.raw.stars_topup, cd.L0(2131745177, null), org.telegram.messenger.i0.W2(cd.G((int) a51Var.B, "StarsAcquiredInfo", new Object[0]))).j();
            h8Var.h0.c(true);
            e6.y(h8Var.currentAccount, false).S(true);
        } else if (str != null) {
            cc.a0(h8Var).Q(R.raw.error, 36, cd.a0(null, null, 2131743903, str)).j();
        }
    }

    public static void G0(wy0 wy0Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.p6 p6Var) {
        CharSequence charSequence;
        TextView textView = (TextView) ((ty0) wy0Var.c(cd.L0(2131750309, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        u80 u80Var = new u80(textView, org.telegram.messenger.i0.L(90.0f), 0, p6Var);
        u80Var.a(org.telegram.ui.ActionBar.t6.r1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.t6.r1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(u80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                int i11 = starGift.availability_remains;
                textView.setText(i11 <= 0 ? cd.H(',', "Gift2Availability2ValueNone", starGift.availability_total) : cd.K("Gift2Availability4Value", i11, ',', cd.E(starGift.availability_total, ',')));
                return;
            }
            if (starGift.availability_remains <= 0) {
                charSequence = cd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = cd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + cd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
            return;
        }
        final e6 y3 = e6.y(i10, false);
        final long j10 = starGift.id;
        final ph.h1 h1Var = new ph.h1(textView, 13);
        final boolean[] zArr = {false};
        final us[] usVarArr = new us[1];
        usVarArr[0] = new us() { // from class: rh.q5
            @Override // org.telegram.messenger.us
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                int i14;
                e6 e6Var;
                TL_stars.StarGift J;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i12 != (i14 = zs.F3) || (J = (e6Var = e6.this).J(j10)) == null) {
                    return;
                }
                zArr2[0] = true;
                zs.f(e6Var.a).n(usVarArr[0], i14);
                h1Var.a(J);
            }
        };
        int i12 = y3.a;
        zs f7 = zs.f(i12);
        us usVar = usVarArr[0];
        int i13 = zs.F3;
        f7.b(usVar, i13);
        TL_stars.StarGift J = y3.J(j10);
        if (J != null) {
            zArr[0] = true;
            zs.f(i12).n(usVarArr[0], i13);
            h1Var.a(J);
        }
    }

    public static void H0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new m7(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount) {
        return L0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (w0 == null) {
            w0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(starsAmount.negative() ? "-" : "");
                sb2.append(cd.E(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
            String format = w0.format(j10 / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            boolean z10 = false;
            if (i11 < 0 && j11 > 0) {
                i10 = -1;
                d = 1.0E9d;
            } else if (i11 <= 0 || j11 >= 0) {
                d = 1.0E9d;
                i10 = 0;
            } else {
                d = 1.0E9d;
                i10 = 1;
            }
            long j12 = i10 + j11;
            if (j11 != 0 ? j11 < 0 : i11 < 0) {
                z10 = true;
            }
            if (i11 == 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(cd.E(Math.abs(j12), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(cd.E(Math.abs(j12), c10));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = w0;
            int i12 = starsAmount.nanos;
            double d10 = i12;
            if (i12 < 0) {
                d10 += d;
            }
            String format2 = decimalFormat.format(d10 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), length + 1, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (w0 == null) {
            w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = w0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            if (i11 < 0 && j10 > 0) {
                i10 = -1;
                d = 1.0E9d;
            } else if (i11 <= 0 || j10 >= 0) {
                d = 1.0E9d;
                i10 = 0;
            } else {
                d = 1.0E9d;
                i10 = 1;
            }
            long j11 = i10 + j10;
            boolean z10 = j10 != 0 ? j10 < 0 : i11 < 0;
            if (Math.abs(j11) > 1000 || starsAmount.nanos == 0) {
                if (starsAmount.amount <= 1000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(z10 ? "-" : "");
                    sb2.append(cd.E(Math.abs(j11), c10));
                    spannableStringBuilder.append((CharSequence) sb2.toString());
                    return spannableStringBuilder;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z10 ? "-" : "");
                sb3.append(org.telegram.messenger.i0.o0((int) Math.abs(j11), 0));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z10 ? "-" : "");
            sb4.append(cd.E(Math.abs(j11), c10));
            spannableStringBuilder.append((CharSequence) sb4.toString());
            DecimalFormat decimalFormat = w0;
            int i12 = starsAmount.nanos;
            double d10 = i12;
            if (i12 < 0) {
                d10 += d;
            }
            String format2 = decimalFormat.format(d10 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                String substring = format2.substring(indexOf2);
                if (substring.length() > 1) {
                    spannableStringBuilder.append((CharSequence) substring.substring(0, Math.min(substring.length(), 3)));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), length + 1, spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder N0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (w0 == null) {
                w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = w0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = starsAmount.amount;
        int i11 = starsAmount.nanos;
        boolean z10 = false;
        if (i11 < 0 && j10 > 0) {
            i10 = -1;
            d = 1.0E9d;
        } else if (i11 <= 0 || j10 >= 0) {
            d = 1.0E9d;
            i10 = 0;
        } else {
            d = 1.0E9d;
            i10 = 1;
        }
        long j11 = i10 + j10;
        if (j10 != 0 ? j10 < 0 : i11 < 0) {
            z10 = true;
        }
        if (i11 == 0) {
            spannableStringBuilder.append((CharSequence) cd.H(',', "Stars", (int) j10));
            return spannableStringBuilder;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "-" : "");
        sb2.append(cd.E(Math.abs(j11), ','));
        spannableStringBuilder.append((CharSequence) sb2.toString());
        if (w0 == null) {
            w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        DecimalFormat decimalFormat = w0;
        int i12 = starsAmount.nanos;
        double d10 = i12;
        if (i12 < 0) {
            d10 += d;
        }
        String format2 = decimalFormat.format(d10 / d);
        int indexOf2 = format2.indexOf(".");
        if (indexOf2 >= 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.L0(2131745102, null));
        return spannableStringBuilder;
    }

    public static String O0(long j10) {
        if (v0 == null) {
            v0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return v0.format(j10 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10 < 0 ? "-" : "");
        sb2.append(cd.E(Math.abs(j10 / 1000000000), ','));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0199, code lost:
    
        r6 = 2131744969;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String P0(int i10, boolean z10, TL_stars.StarsTransaction starsTransaction) {
        if (starsTransaction.stargift_drop_original_details) {
            return cd.L0(2131744950, null);
        }
        if (starsTransaction.posts_search) {
            return cd.L0(2131744954, null);
        }
        if (starsTransaction.premium_gift) {
            return cd.L0(2131744953, null);
        }
        if (starsTransaction.phonegroup_message) {
            return cd.L0(starsTransaction.reaction ? 2131744962 : 2131744963, null);
        }
        if (starsTransaction.paid_message) {
            return cd.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return cd.L0(2131744977, null);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return cd.L0(2131745222, null);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        int i11 = starsTransaction.flags;
        if ((131072 & i11) == 0 && (65536 & i11) != 0) {
            return cd.a0(null, null, 2131745179, xh.i.I0(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return cd.L0(2131749939, null);
            }
            if (starsTransaction.refund) {
                return cd.L0(starsTransaction.stargift_auction_bid ? 2131749938 : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749935 : 2131749936 : 2131749937, null);
            }
            return cd.L0(starsTransaction.stargift_auction_bid ? 2131749941 : starsAmount.amount > 0 ? 2131749940 : starsTransaction.stargift_upgrade ? 2131749932 : 2131749933, null);
        }
        if (starsTransaction.subscription) {
            int i12 = starsTransaction.subscription_period;
            if (i12 == 2592000) {
                return cd.L0(2131745181, null);
            }
            if (i12 == 300) {
                return "5-minute subscription fee";
            }
            if (i12 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i11 & TLObject.FLAG_13) != 0) {
            return cd.L0(2131745111, null);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return cd.L0(h20.B(vp.r1(i10).Z1(Long.valueOf(org.telegram.messenger.o5.o(starsTransaction.sent_by)))) ? 2131745119 : 2131745120, null);
            }
            return cd.L0(2131745120, null);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long o10 = org.telegram.messenger.o5.o(starsTransaction.peer.peer);
        if (o10 != 0) {
            if (o10 >= 0) {
                return h20.p(vp.r1(d20.s0).Z1(Long.valueOf(o10)));
            }
            TLRPC.Chat L0 = vp.r1(d20.s0).L0(Long.valueOf(-o10));
            return L0 == null ? "" : L0.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? cd.L0(2131744979, null) : starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds ? cd.L0(2131744980, null) : cd.L0(2131744941, null);
        }
        if (!z10) {
            if (starsTransaction.refund) {
            }
            return cd.L0(r6, null);
        }
        int i13 = 2131744939;
        return cd.L0(i13, null);
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence, float f7) {
        return R0(charSequence, f7, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f7, float f10, float f11) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        dq dqVar = new dq(R.drawable.diamond, 0);
        dqVar.d = false;
        dqVar.r = 0.0f;
        dqVar.s = f10;
        dqVar.G = f11;
        dqVar.H = f7;
        dqVar.I = f7;
        spannableString.setSpan(dqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.i0.L2(spannableStringBuilder, "💎", "💎️");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "💎", "💎 ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "💎");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder S0(CharSequence charSequence) {
        return T0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder T0(CharSequence charSequence, float f7, dq[] dqVarArr) {
        return W0(false, charSequence, f7, dqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, boolean z10) {
        return W0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return W0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder W0(boolean z10, CharSequence charSequence, float f7, dq[] dqVarArr, float f10, float f11) {
        dq dqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z10 ? "TON" : "⭐").concat(" "));
        if (dqVarArr == null || (dqVar = dqVarArr[0]) == null) {
            dqVar = new dq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (dqVarArr != null) {
                dqVarArr[0] = dqVar;
            }
        }
        dqVar.r = 0.0f;
        dqVar.s = f10;
        dqVar.G = f11;
        if (z10) {
            dqVar.d = false;
            float f12 = f7 * 0.2f;
            dqVar.H = f12;
            dqVar.I = f12;
        } else {
            dqVar.H = f7;
            dqVar.I = f7;
        }
        spannableString.setSpan(dqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder X0(boolean z10, String str, dq[] dqVarArr) {
        dq dqVar;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (dqVarArr == null || (dqVar = dqVarArr[0]) == null) {
            dqVar = new dq(z10 ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            float f7 = z10 ? 0.222f : 1.13f;
            float f10 = z10 ? 0.222f : 1.13f;
            dqVar.H = f7;
            dqVar.I = f10;
        }
        if (z10) {
            dqVar.d = false;
        }
        if (dqVarArr != null) {
            dqVarArr[0] = dqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(dqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Y0(TL_stars.StarsAmount starsAmount, String str, dq[] dqVarArr) {
        return Z0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, dqVarArr);
    }

    public static SpannableStringBuilder Z0(boolean z10, CharSequence charSequence, float f7, dq[] dqVarArr) {
        dq dqVar;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        String str = z10 ? "TON" : "⭐";
        int i10 = z10 ? R.drawable.mini_gram_72 : R.drawable.star_small_inner;
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (dqVarArr == null || (dqVar = dqVarArr[0]) == null) {
            if (dqVarArr == null || dqVarArr.length <= 0) {
                dqVar = new dq(i10, 0);
            } else {
                dqVar = new dq(i10, 0);
                dqVarArr[0] = dqVar;
            }
        }
        dqVar.d = false;
        if (z10) {
            f7 *= 0.33f;
        }
        dqVar.H = f7;
        dqVar.I = f7;
        spannableString.setSpan(dqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static d01 a1(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i10 = imageReceiver.d;
        final ig.o0 o0Var = new ig.o0(z10, i10, str, imageReceiver, new boolean[1]);
        o0Var.run();
        final int i11 = 0;
        Runnable h = zs.f(i10).h(view, z10 ? zs.X2 : zs.W2, new q20() { // from class: rh.a7
            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        o0Var.run();
                        break;
                    default:
                        o0Var.run();
                        break;
                }
            }
        });
        final int i12 = 1;
        return new d01(h, zs.f(i10).h(view, zs.y0, new q20() { // from class: rh.a7
            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        o0Var.run();
                        break;
                    default:
                        o0Var.run();
                        break;
                }
            }
        }), 1);
    }

    public static void b1(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, i10, false, null, false);
        imageReceiver.r0(ic.b(document), a1.g.i(i10, i10, "_"), ic.c(w9, document), a1.g.i(i10, i10, "_"), org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.a7, 0.35f, false), 0L, null, null, 0);
    }

    public static void c1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        b1(imageReceiver, starGift == null ? null : starGift.getDocument(), i10);
    }

    public static void d1(g9 g9Var, ImageReceiver imageReceiver, long j10) {
        a1(g9Var, imageReceiver, j10 <= 1000 ? "2⃣" : j10 < 2500 ? "3⃣" : "4⃣", false);
    }

    public static d01 e1(g9 g9Var, ImageReceiver imageReceiver, int i10) {
        return a1(g9Var, imageReceiver, i10 != 3 ? i10 != 6 ? i10 != 12 ? i10 != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void f1(g9 g9Var, ImageReceiver imageReceiver, long j10) {
        a1(g9Var, imageReceiver, j10 <= 10000000000L ? "2⃣" : j10 <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, android.widget.TextView] */
    public static void g1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.p6 p6Var) {
        boolean z10;
        org.telegram.ui.ActionBar.z2[] z2VarArr;
        wy0 wy0Var;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        org.telegram.ui.ActionBar.z2[] z2VarArr2 = new org.telegram.ui.ActionBar.z2[1];
        ?? f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(0, org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(4.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.b6.t(-1, zs.g2, 7, 0, 0, 0, 10));
        o7 o7Var = new o7(context, 70, 0, 0);
        frameLayout.addView(o7Var, w7.b6.c(-1.0f, -1));
        lg.q qVar = new lg.q(context, 1, 2);
        lg.h hVar = qVar.b;
        hVar.z = org.telegram.ui.ActionBar.t6.Tk;
        hVar.A = org.telegram.ui.ActionBar.t6.Uk;
        hVar.b();
        qVar.setStarParticlesView(o7Var);
        frameLayout.addView(qVar, w7.b6.d(zs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        qVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.j5, p6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(cd.H(' ', "BoostStars", (int) boost.stars));
        ?? f10 = z20.f(f7, textView, w7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        f10.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(20.0f), -6915073));
        f10.setTextColor(-1);
        f10.setTextSize(1, 11.33f);
        f10.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(8.33f), 0);
        f10.setGravity(17);
        f10.setTypeface(org.telegram.messenger.i0.o());
        StringBuilder sb2 = new StringBuilder("x");
        int i11 = boost.multiplier;
        if (i11 == 0) {
            i11 = 1;
        }
        sb2.append(cd.H(' ', "BoostingBoostsCount", i11));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        dq dqVar = new dq(R.drawable.mini_boost_badge, 2);
        float L = org.telegram.messenger.i0.L(0.66f);
        dqVar.r = 0.0f;
        dqVar.s = L;
        spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
        f10.setText(spannableStringBuilder);
        f7.addView(f10, w7.b6.t(-2, 20, 17, 20, 4, 20, 4));
        wy0 wy0Var2 = new wy0(context, p6Var);
        wy0Var2.n(cd.L0(2131753627, null), i10, j10, new m6(z2VarArr2, j10, 6));
        wy0Var2.c(cd.L0(2131753626, null), cd.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            z2VarArr = z2VarArr2;
            wy0Var = wy0Var2;
            z10 = 0;
            wy0Var.i(cd.L0(2131753615, null), cd.L0(2131753614, null), new a3.i0(z2VarArr, j10, boost, 26));
        } else {
            z10 = 0;
            z2VarArr = z2VarArr2;
            wy0Var = wy0Var2;
        }
        String L0 = cd.L0(2131753662, null);
        String format = cd.D0().r0().format(new Date(boost.date * 1000));
        String format2 = cd.D0().o0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[z10] = format;
        objArr[1] = format2;
        wy0Var.c(L0, cd.a0(null, null, 2131742808, objArr), null, null);
        String L02 = cd.L0(2131753607, null);
        String format3 = cd.D0().r0().format(new Date(boost.expires * 1000));
        wy0 wy0Var3 = wy0Var;
        String format4 = cd.D0().o0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[z10] = format3;
        objArr2[1] = format4;
        wy0Var3.c(L02, cd.a0(null, null, 2131742808, objArr2), null, null);
        f7.addView(wy0Var3, w7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        p80 p80Var = new p80(context, p6Var);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.z6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setText(org.telegram.messenger.i0.T2(cd.L0(2131744944, null), new ph.p0(context, 6)));
        p80Var.setGravity(17);
        f7.addView(p80Var, w7.b6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.i(cd.L0(2131747847, null), z10, true);
        dVar.setOnClickListener(new p6(z2VarArr, 1));
        f7.addView(dVar, w7.b6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        k10.N = f7;
        z2VarArr[0] = k10;
        k10.T0 = false;
        k10.O();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(T)) {
            z2VarArr[0].a0(T);
        }
        qVar.setPaused(false);
        z2VarArr[0].show();
        z2VarArr[0].o(new ph.x1(qVar, 23));
    }

    public static i0 h1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, j20 j20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        sf.b bVar = sf.b.a;
        i0 i0Var = new i0(context, p6Var, i10, tL_starGiftUnique == null ? sf.a.g(((org.telegram.messenger.l0) vp.r1(i10).y7.p.a).c, bVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(sf.b.b) : tL_starGiftUnique.getResellAmount(bVar), new e3(1, j20Var, r8));
        i0[] i0VarArr = {i0Var};
        i0Var.show();
        return i0VarArr[0];
    }

    public static void i1(Context context, long j10, boolean z10, final j20 j20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        org.telegram.ui.ActionBar.z2[] z2VarArr;
        int i10 = 1;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        vh.d dVar = null;
        textView.setText(cd.L0(2131747748, null));
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        linearLayout.addView(textView, w7.b6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        ec0 ec0Var = new ec0(context, p6Var);
        ec0Var.setForceForceUseCenter(true);
        ec0Var.setText(cd.L0(2131747749, null));
        ec0Var.setLeftPadding(org.telegram.messenger.i0.L(36.0f));
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i11, p6Var);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = org.telegram.messenger.i0.L(16.0f);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.a7.D(editTextBoldCursor, org.telegram.ui.ActionBar.t6.ig, p6Var);
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.t6.jg, p6Var);
        editTextBoldCursor.setGravity(cd.X ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new i51(ec0Var, editTextBoldCursor, i10));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.b6.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.b6.p(-1, -2, 1.0f, zs.E1));
        ec0Var.e(editTextBoldCursor);
        ec0Var.addView(linearLayout2, w7.b6.e(-1, -2, 48));
        linearLayout.addView(ec0Var, w7.b6.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.A6, null);
        ec0Var.addView(textView2, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        p80 p80Var = new p80(context, null);
        p80Var.setText(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(cd.L0(2131747751, null), new ph.p0(context, 7)), true));
        p80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.z6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        linearLayout.addView(p80Var, w7.b6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final vh.d i12 = z20.i(24, context, p6Var, true);
        i12.i(cd.L0(j10 > 0 ? 2131747747 : 2131747753, null), false, true);
        linearLayout.addView(i12, w7.b6.o(-1, 48));
        if (j10 > 0 && z10) {
            vh.d i13 = z20.i(24, context, p6Var, false);
            i13.i(cd.L0(2131747752, null), false, false);
            linearLayout.addView(i13, w7.b6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            dVar = i13;
        }
        k10.N = linearLayout;
        final org.telegram.ui.ActionBar.z2[] z2VarArr2 = {k10};
        editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
        editTextBoldCursor.addTextChangedListener(new n7(editTextBoldCursor, ec0Var, j10, z10, i12, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: rh.t6
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                if (i14 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                i12.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                j20Var.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new w6(editTextBoldCursor2, z2VarArr2, 1));
                return true;
            }
        });
        u6 u6Var = new u6(zArr, j20Var, editTextBoldCursor, i12, z2VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        i12.setOnClickListener(u6Var);
        if (dVar != null) {
            vh.d dVar2 = dVar;
            u6 u6Var2 = new u6(zArr, j20Var, dVar2, editTextBoldCursor2, z2VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            z2VarArr = z2VarArr2;
            dVar2.setOnClickListener(u6Var2);
        } else {
            z2VarArr = z2VarArr2;
        }
        z2VarArr[0].O();
        z2VarArr[0].setOnDismissListener(new ag.x(editTextBoldCursor2, 11));
        z2VarArr[0].show();
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        org.telegram.messenger.i0.h3(new w6(z2VarArr, editTextBoldCursor2), Q instanceof un ? ((un) Q).fa() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0f9f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0fd5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x101a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x106f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x10a8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x10c9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x10b2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x107b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x105d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0e8b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0d9f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0dad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0dbe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0e5a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0e91 A[LOOP:0: B:68:0x0e05->B:77:0x0e91, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0e9d A[EDGE_INSN: B:78:0x0e9d->B:79:0x0e9d BREAK  A[LOOP:0: B:68:0x0e05->B:77:0x0e91], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0f17 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f2a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0f2d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0f3d  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v103 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.telegram.ui.ActionBar.z2 j1(final Context context, final boolean z10, final long j10, final int i10, final TL_stars.StarsTransaction starsTransaction, final org.telegram.ui.ActionBar.p6 p6Var) {
        boolean z11;
        org.telegram.ui.ActionBar.z2 z2Var;
        org.telegram.ui.ActionBar.z2[] z2VarArr;
        Context context2;
        int i11;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z12;
        boolean z13;
        long j11;
        org.telegram.ui.ActionBar.p6 p6Var2;
        TLRPC.Peer peer;
        long j12;
        ic icVar;
        ic c10;
        int i12;
        org.telegram.ui.ActionBar.z2[] z2VarArr2;
        int i13;
        String K0;
        TL_stars.StarGift starGift;
        TL_stars.StarsTransaction starsTransaction3;
        org.telegram.ui.ActionBar.p6 p6Var3;
        ViewGroup viewGroup;
        wy0 wy0Var;
        final org.telegram.ui.ActionBar.z2[] z2VarArr3;
        TL_stars.StarsTransaction starsTransaction4;
        org.telegram.ui.ActionBar.p6 p6Var4;
        Context context3;
        int i14;
        wy0 wy0Var2;
        wy0 wy0Var3;
        wy0 wy0Var4;
        wy0 wy0Var5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z14;
        TL_stars.StarGift starGift2;
        Context context4;
        ?? r32;
        org.telegram.ui.ActionBar.k2 T;
        TLRPC.Chat L0;
        int i15;
        ic icVar2;
        ic c11;
        final Context context5;
        final int i16;
        int i17;
        long j13;
        org.telegram.ui.ActionBar.p6 p6Var5;
        wy0 wy0Var6;
        final org.telegram.ui.ActionBar.z2[] z2VarArr4;
        long j14;
        TL_stars.StarsAmount starsAmount;
        wy0 wy0Var7;
        TL_stars.StarsTransaction starsTransaction5;
        ViewGroup viewGroup2;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z15 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i18 = starsTransaction.flags;
        boolean z16 = (i18 & TLObject.FLAG_13) != 0;
        boolean z17 = ((131072 & i18) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z18 = (z17 || (i18 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(context, p6Var, false, false);
        z2Var2.O();
        org.telegram.ui.ActionBar.z2[] z2VarArr5 = new org.telegram.ui.ActionBar.z2[1];
        final LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(0, org.telegram.messenger.i0.L((z16 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, org.telegram.messenger.i0.L(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        boolean z19 = z16;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z11 = z17;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                z2VarArr = z2VarArr5;
                z2Var = z2Var2;
                f7 f7Var = new f7(context, matrix, radialGradient, paint, d5Var);
                d5Var.l(f7Var);
                d5Var.i(stargiftattributepattern.document, false);
                f7Var.setOrientation(1);
                g9 g9Var = new g9(context);
                c1(g9Var.getImageReceiver(), starsTransaction.stargift, zs.q2);
                f7Var.addView(g9Var, w7.b6.t(zs.q2, zs.q2, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    w7.e6.a(g9Var);
                    g9Var.setOnClickListener(new jg.w1(context, i10, tL_starGiftUnique, 24));
                }
                TextView b10 = w7.g6.b(context, 20.0f, 0, true, null);
                b10.setTextColor(-1);
                b10.setText(tL_starGiftUnique.title);
                f7Var.addView(b10, w7.b6.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b11 = w7.g6.b(context, 13.0f, 0, false, null);
                b11.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b11.setText(cd.I(tL_starGiftUnique.num, "Gift2CollectionNumber"));
                f7Var.addView(b11, w7.b6.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b12 = w7.g6.b(context, 18.0f, 0, true, null);
                b12.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                b12.setText(V0(starsAmount3, TextUtils.concat(positive ? "+" : "", K0(starsAmount3), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b12.getText());
                if (starsTransaction.refund) {
                    H0(spannableStringBuilder, b12, cd.K0(2131745048));
                } else if (starsTransaction.failed) {
                    H0(spannableStringBuilder, b12, cd.K0(2131745128));
                } else if (starsTransaction.pending) {
                    H0(spannableStringBuilder, b12, cd.K0(2131745071));
                }
                b12.setText(spannableStringBuilder);
                f7Var.addView(b12, w7.b6.t(-2, -2, 17, 0, 11, 0, 17));
                f7.addView(f7Var, w7.b6.o(-1, -2));
                p6Var2 = p6Var;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = f7;
                str = "";
                z12 = z18;
                z2VarArr2 = z2VarArr;
                wy0 wy0Var8 = new wy0(context2, p6Var2);
                starGift = starsTransaction2.stargift;
                int i19 = 5;
                if (starGift != null) {
                    starsTransaction3 = starsTransaction2;
                    p6Var3 = p6Var2;
                    viewGroup = linearLayout;
                    wy0Var = wy0Var8;
                    z2VarArr3 = z2VarArr2;
                    TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction3.peer;
                    if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                        final long o10 = org.telegram.messenger.o5.o(starsTransactionPeer2.peer);
                        if (starsTransaction3.paid_message) {
                            wy0Var.n(cd.K0(positive ? 2131750202 : 2131749945), i10, o10, new m6(z2VarArr3, o10, 0));
                            if (starsTransaction3.starref_amount != null && starsTransaction3.starref_commission_permille > 0) {
                                wy0Var.d(Z0(starsTransaction3.amount instanceof TL_stars.TL_starsTonAmount, i0.a.k(Math.abs(Math.round(starsTransaction3.starref_amount.toDouble() + starsTransaction3.amount.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), cd.K0(2131744968));
                            }
                            wy0Var4 = wy0Var;
                            starsTransaction4 = starsTransaction3;
                            p6Var4 = p6Var3;
                            context3 = context;
                            wy0Var3 = wy0Var4;
                        } else if (z11) {
                            long o11 = org.telegram.messenger.o5.o(starsTransaction3.starref_peer);
                            wy0Var.i(cd.K0(2131745248), cd.K0(2131745247), new m6(z2VarArr3, j10, 1));
                            wy0Var.n(cd.K0(2131745251), i10, o11, new m6(z2VarArr3, o11, 2));
                            wy0Var.n(cd.K0(2131745246), i10, o10, new m6(z2VarArr3, o10, 3));
                            wy0Var.d(xh.i.I0(starsTransaction3.starref_commission_permille), cd.K0(2131745250));
                            i14 = i10;
                            p6Var4 = p6Var;
                            wy0Var5 = wy0Var;
                            starsTransaction4 = starsTransaction3;
                            context3 = context;
                            wy0Var2 = wy0Var5;
                        } else if (z12) {
                            p6Var4 = p6Var;
                            wy0Var.i(cd.K0(2131745248), cd.K0(2131745247), new mn(i10, context, j10, o10, z2VarArr3, p6Var4));
                            wy0Var.n(cd.K0(2131745249), i10, o10, new m6(z2VarArr3, o10, 4));
                            wy0Var4 = wy0Var;
                            z2VarArr3 = z2VarArr3;
                            starsTransaction4 = starsTransaction3;
                            context3 = context;
                            wy0Var3 = wy0Var4;
                        } else {
                            p6Var4 = p6Var;
                            if (z19) {
                                wy0Var.n(cd.K0(2131745226), i10, o10, new l6(z2VarArr3, starsTransaction3, o10, 1));
                                final int i20 = 2;
                                wy0Var.n(cd.K0(2131745225), i10, d20.i(i10).e(), new Runnable() { // from class: rh.k6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i20) {
                                            case 0:
                                                z2VarArr3[0].dismiss();
                                                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                if (T2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", d20.i(i10).e());
                                                    bundle.putBoolean("my_profile", true);
                                                    bundle.putBoolean("open_gifts", true);
                                                    T2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                z2VarArr3[0].dismiss();
                                                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                                                if (T3 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putLong("user_id", d20.i(i10).e());
                                                    bundle2.putBoolean("my_profile", true);
                                                    bundle2.putBoolean("open_gifts", true);
                                                    T3.presentFragment(new ProfileActivity(bundle2, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                z2VarArr3[0].dismiss();
                                                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                                                if (T4 != null) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("user_id", d20.i(i10).e());
                                                    bundle3.putBoolean("my_profile", true);
                                                    T4.presentFragment(new ProfileActivity(bundle3, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                starsTransaction4 = starsTransaction;
                                wy0Var.i(cd.K0(2131745224), cd.K0(2131745223), new l6(z2VarArr3, starsTransaction, o10, 2));
                                wy0Var.d(N0(starsTransaction4.amount), cd.K0(2131745227));
                                context3 = context;
                                i14 = i10;
                                z2VarArr3 = z2VarArr3;
                                wy0Var2 = wy0Var;
                            } else {
                                starsTransaction4 = starsTransaction3;
                                if (!starsTransaction4.subscription || z10) {
                                    if (starsTransaction4.premium_gift) {
                                        final int i21 = 1;
                                        wy0Var.n(cd.K0(2131749945), i10, o10, new Runnable() { // from class: rh.o6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i22 = i21;
                                                Context context6 = context;
                                                long j15 = o10;
                                                org.telegram.ui.ActionBar.z2[] z2VarArr6 = z2VarArr3;
                                                switch (i22) {
                                                    case 0:
                                                        z2VarArr6[0].dismiss();
                                                        if (!h20.A(j15)) {
                                                            org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                            if (T2 != null) {
                                                                T2.presentFragment(un.ha(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            gf.f.r(context6, cd.L0(2131744942, null));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        z2VarArr6[0].dismiss();
                                                        if (!h20.A(j15)) {
                                                            org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                                                            if (T3 != null) {
                                                                T3.presentFragment(un.ha(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            gf.f.r(context6, cd.L0(2131744942, null));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        z2VarArr6[0].dismiss();
                                                        if (!h20.A(j15)) {
                                                            org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                                                            if (T4 != null) {
                                                                T4.presentFragment(un.ha(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            gf.f.r(context6, cd.L0(2131744942, null));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        wy0Var.d(cd.I(starsTransaction4.premium_gift_months, "Months"), cd.K0(2131744952));
                                    } else if (!starsTransaction4.posts_search) {
                                        String K02 = cd.K0(2131744951);
                                        final int i22 = 2;
                                        Runnable runnable = new Runnable() { // from class: rh.o6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i222 = i22;
                                                Context context6 = context;
                                                long j15 = o10;
                                                org.telegram.ui.ActionBar.z2[] z2VarArr6 = z2VarArr3;
                                                switch (i222) {
                                                    case 0:
                                                        z2VarArr6[0].dismiss();
                                                        if (!h20.A(j15)) {
                                                            org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                            if (T2 != null) {
                                                                T2.presentFragment(un.ha(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            gf.f.r(context6, cd.L0(2131744942, null));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        z2VarArr6[0].dismiss();
                                                        if (!h20.A(j15)) {
                                                            org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                                                            if (T3 != null) {
                                                                T3.presentFragment(un.ha(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            gf.f.r(context6, cd.L0(2131744942, null));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        z2VarArr6[0].dismiss();
                                                        if (!h20.A(j15)) {
                                                            org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                                                            if (T4 != null) {
                                                                T4.presentFragment(un.ha(j15));
                                                                break;
                                                            }
                                                        } else {
                                                            gf.f.r(context6, cd.L0(2131744942, null));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        z2VarArr3 = z2VarArr3;
                                        context3 = context;
                                        wy0Var.n(K02, i10, o10, runnable);
                                        wy0Var2 = wy0Var;
                                        i14 = i10;
                                    }
                                    context3 = context;
                                    i14 = i10;
                                    wy0Var2 = wy0Var;
                                    z2VarArr3 = z2VarArr3;
                                } else {
                                    final int i23 = 0;
                                    wy0Var.n(cd.K0(2131745180), i10, o10, new Runnable() { // from class: rh.o6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i222 = i23;
                                            Context context6 = context;
                                            long j15 = o10;
                                            org.telegram.ui.ActionBar.z2[] z2VarArr6 = z2VarArr3;
                                            switch (i222) {
                                                case 0:
                                                    z2VarArr6[0].dismiss();
                                                    if (!h20.A(j15)) {
                                                        org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                        if (T2 != null) {
                                                            T2.presentFragment(un.ha(j15));
                                                            break;
                                                        }
                                                    } else {
                                                        gf.f.r(context6, cd.L0(2131744942, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    z2VarArr6[0].dismiss();
                                                    if (!h20.A(j15)) {
                                                        org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                                                        if (T3 != null) {
                                                            T3.presentFragment(un.ha(j15));
                                                            break;
                                                        }
                                                    } else {
                                                        gf.f.r(context6, cd.L0(2131744942, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    z2VarArr6[0].dismiss();
                                                    if (!h20.A(j15)) {
                                                        org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                                                        if (T4 != null) {
                                                            T4.presentFragment(un.ha(j15));
                                                            break;
                                                        }
                                                    } else {
                                                        gf.f.r(context6, cd.L0(2131744942, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    context3 = context;
                                    wy0Var3 = wy0Var;
                                    z2VarArr3 = z2VarArr3;
                                }
                            }
                        }
                    } else {
                        wy0 wy0Var9 = wy0Var;
                        starsTransaction4 = starsTransaction3;
                        p6Var4 = p6Var3;
                        context3 = context;
                        i14 = i10;
                        if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction4.gift) {
                                p80 p80Var = new p80(context3, p6Var4);
                                p80Var.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
                                p80Var.setEllipsize(TextUtils.TruncateAt.END);
                                int i24 = org.telegram.ui.ActionBar.t6.Uc;
                                org.telegram.ui.ActionBar.a7.V(p80Var, i24, p6Var4);
                                org.telegram.ui.ActionBar.a7.H(p80Var, i24, p6Var4);
                                p80Var.setTextSize(1, 14.0f);
                                p80Var.setSingleLine(true);
                                p80Var.setDisablePaddingsOffsetY(true);
                                org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(24.0f, i14, p80Var);
                                String K03 = cd.K0(z15 ? 2131744946 : 2131744943);
                                eq a2 = c8.a(24, "fragment");
                                int L = org.telegram.messenger.i0.L(16.0f);
                                int L2 = org.telegram.messenger.i0.L(16.0f);
                                a2.e = L;
                                a2.f = L2;
                                e5Var.b.w0(a2);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) K03));
                                spannableStringBuilder2.setSpan(e5Var, 0, 1, 33);
                                spannableStringBuilder2.setSpan(new h7(z2VarArr3, context3, z15), 3, spannableStringBuilder2.length(), 33);
                                p80Var.setText(spannableStringBuilder2);
                                wy0Var9.l(p80Var, cd.K0(2131744951));
                                wy0Var2 = wy0Var9;
                            } else {
                                wy0Var9.d(cd.K0(2131750530), cd.K0(2131744949));
                                wy0Var2 = wy0Var9;
                            }
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            wy0Var9.d(cd.K0(2131754231), cd.K0(2131744949));
                            wy0Var2 = wy0Var9;
                        } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            wy0Var9.d(cd.K0(2131747234), cd.K0(2131744949));
                            wy0Var2 = wy0Var9;
                        } else {
                            wy0Var2 = wy0Var9;
                            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                wy0Var9.d(cd.K0(2131744979), cd.K0(2131744949));
                                wy0Var2 = wy0Var9;
                            }
                        }
                    }
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                        long o12 = org.telegram.messenger.o5.o(starsTransactionPeer.peer);
                        if (z10) {
                        }
                        L0 = vp.r1(i14).L0(Long.valueOf(-o12));
                        if (L0 != null) {
                        }
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    wy0Var2.d(cd.Z(2131742808, cd.D0().r0().format(new Date(starsTransaction4.date * 1000)), cd.D0().o0().format(new Date(starsTransaction4.date * 1000))), cd.K0(2131744978));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup3 = viewGroup;
                    viewGroup3.addView(wy0Var2, w7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    vh.d dVar = new vh.d(context4, p6Var4);
                    dVar.f();
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    viewGroup3.addView(dVar, w7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.z2 z2Var3 = z2Var;
                    z2Var3.N = viewGroup3;
                    z2VarArr3[r32] = z2Var3;
                    z2Var3.T0 = r32;
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    z2VarArr3[r32].O();
                    T = LaunchActivity.T();
                    if (!org.telegram.messenger.i0.Q1()) {
                    }
                    z2VarArr3[r32].show();
                    return z2VarArr3[r32];
                }
                if (starsTransaction2.stargift_upgrade) {
                    if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                        starsTransaction5 = starsTransaction2;
                        viewGroup2 = linearLayout;
                    } else {
                        ec ecVar = (ec) ((ty0) wy0Var8.d(cd.K0(2131745238), cd.K0(2131745245)).getChildAt(1)).getChildAt(0);
                        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                        tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                        viewGroup2 = linearLayout;
                        Context context6 = context2;
                        starsTransaction5 = starsTransaction;
                        e6.w(i10).M(tL_inputSavedStarGiftUser, new bi.i6(ecVar, i10, context6, p6Var2, 4));
                    }
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction5.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        long o13 = org.telegram.messenger.o5.o(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                        context5 = context;
                        wy0Var8.n(cd.K0(2131745228), i10, o13, new m6(z2VarArr2, o13, i19));
                        p6Var4 = p6Var;
                        wy0Var7 = wy0Var8;
                        i14 = i10;
                        z2VarArr3 = z2VarArr2;
                        starsTransaction4 = starsTransaction5;
                        viewGroup = viewGroup2;
                        context3 = context5;
                        wy0Var2 = wy0Var7;
                    } else {
                        i14 = i10;
                        p6Var4 = p6Var;
                        wy0Var5 = wy0Var8;
                        z2VarArr3 = z2VarArr2;
                        starsTransaction4 = starsTransaction5;
                        viewGroup = viewGroup2;
                        context3 = context;
                        wy0Var2 = wy0Var5;
                    }
                } else {
                    context5 = context2;
                    TL_stars.StarsTransaction starsTransaction6 = starsTransaction2;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        String str2 = starGift.slug;
                        if (TextUtils.isEmpty(str2)) {
                            i17 = 2131750202;
                        } else {
                            String K04 = cd.K0(2131750201);
                            StringBuilder sb2 = new StringBuilder();
                            i17 = 2131750202;
                            sb2.append(starsTransaction6.stargift.title);
                            sb2.append(" #");
                            sb2.append(starsTransaction6.stargift.num);
                            wy0Var8.i(K04, sb2.toString(), new org.telegram.ui.Wallet.x0(context5, i10, str2, 14));
                        }
                        final long e = d20.i(i10).e();
                        long o14 = org.telegram.messenger.o5.o(((TL_stars.TL_starsTransactionPeer) starsTransaction6.peer).peer);
                        if (!starsTransaction6.offer) {
                            if (starsTransaction6.stargift_resale) {
                                if (negative) {
                                    wy0Var8.d(cd.K0(starsTransaction6.refund ? 2131745240 : 2131745242), cd.K0(2131745245));
                                } else {
                                    wy0Var8.d(cd.K0(starsTransaction6.refund ? 2131745242 : 2131745240), cd.K0(2131745245));
                                    j13 = e;
                                }
                            } else if (starsTransaction6.stargift_drop_original_details) {
                                wy0Var8.d(cd.K0(2131745241), cd.K0(2131745245));
                                j13 = e;
                                o14 = j13;
                            } else {
                                wy0Var8.d(cd.K0(2131745239), cd.K0(2131745245));
                            }
                            j13 = o14;
                            o14 = e;
                        } else if (negative) {
                            wy0Var8.d(cd.K0(starsTransaction6.refund ? 2131745240 : 2131745244), cd.K0(2131745245));
                            j13 = o14;
                            o14 = e;
                        } else {
                            wy0Var8.d(cd.K0(starsTransaction6.refund ? 2131745243 : 2131745240), cd.K0(2131745245));
                            j13 = e;
                        }
                        if (o14 != e) {
                            z2VarArr4 = z2VarArr2;
                            final int i25 = 0;
                            p6Var5 = p6Var;
                            wy0Var6 = wy0Var8;
                            viewGroup = linearLayout;
                            final long j15 = o14;
                            j14 = e;
                            wy0Var6.n(cd.K0(i17), i10, j15, new Runnable() { // from class: rh.r6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i25) {
                                        case 0:
                                            z2VarArr4[0].dismiss();
                                            org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                            if (T2 != null) {
                                                long j16 = j15;
                                                Bundle k10 = org.telegram.ui.Cells.f1.k(j16, "user_id");
                                                if (j16 == e) {
                                                    k10.putBoolean("my_profile", true);
                                                }
                                                k10.putBoolean("open_gifts", true);
                                                T2.presentFragment(new ProfileActivity(k10, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            z2VarArr4[0].dismiss();
                                            org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                                            if (T3 != null) {
                                                long j17 = j15;
                                                Bundle k11 = org.telegram.ui.Cells.f1.k(j17, "user_id");
                                                if (j17 == e) {
                                                    k11.putBoolean("my_profile", true);
                                                }
                                                k11.putBoolean("open_gifts", true);
                                                T3.presentFragment(new ProfileActivity(k11, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            p6Var5 = p6Var;
                            wy0Var6 = wy0Var8;
                            viewGroup = linearLayout;
                            z2VarArr4 = z2VarArr2;
                            j14 = e;
                        }
                        if (j13 != j14) {
                            final long j16 = j14;
                            final int i26 = 1;
                            final long j17 = j13;
                            final org.telegram.ui.ActionBar.z2[] z2VarArr6 = z2VarArr4;
                            wy0Var6.n(cd.K0(2131749945), i10, j17, new Runnable() { // from class: rh.r6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i26) {
                                        case 0:
                                            z2VarArr6[0].dismiss();
                                            org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                            if (T2 != null) {
                                                long j162 = j17;
                                                Bundle k10 = org.telegram.ui.Cells.f1.k(j162, "user_id");
                                                if (j162 == j16) {
                                                    k10.putBoolean("my_profile", true);
                                                }
                                                k10.putBoolean("open_gifts", true);
                                                T2.presentFragment(new ProfileActivity(k10, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            z2VarArr6[0].dismiss();
                                            org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                                            if (T3 != null) {
                                                long j172 = j17;
                                                Bundle k11 = org.telegram.ui.Cells.f1.k(j172, "user_id");
                                                if (j172 == j16) {
                                                    k11.putBoolean("my_profile", true);
                                                }
                                                k11.putBoolean("open_gifts", true);
                                                T3.presentFragment(new ProfileActivity(k11, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        wy0 wy0Var10 = wy0Var6;
                        if ((o14 == e || starsTransaction6.stargift_resale) && (starsAmount = starsTransaction6.starref_amount) != null && starsTransaction6.starref_commission_permille > 0) {
                            TL_stars.StarsAmount starsAmount4 = starsTransaction6.amount;
                            if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                tL_starsTonAmount.amount = starsTransaction6.amount.amount + starsTransaction6.starref_amount.amount;
                                dq[] dqVarArr = new dq[1];
                                wy0Var10.d(Y0(starsTransaction6.amount, "⭐️ " + ((Object) K0(tL_starsTonAmount)), dqVarArr), cd.K0(2131744968));
                                dq dqVar = dqVarArr[0];
                                if (dqVar != null) {
                                    dqVar.y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var5);
                                }
                            } else {
                                wy0Var10.d(Z0(starsTransaction6.amount instanceof TL_stars.TL_starsTonAmount, i0.a.k(Math.abs(Math.round(starsTransaction6.starref_amount.toDouble() + starsAmount4.toDouble())), ',', new StringBuilder("⭐️ ")), 0.8f, null), cd.K0(2131744968));
                            }
                        }
                        i14 = i10;
                        wy0Var7 = wy0Var10;
                        starsTransaction4 = starsTransaction6;
                        p6Var4 = p6Var5;
                        z2VarArr3 = z2VarArr4;
                        context3 = context5;
                        wy0Var2 = wy0Var7;
                    } else {
                        p6Var3 = p6Var;
                        viewGroup = linearLayout;
                        final org.telegram.ui.ActionBar.z2[] z2VarArr7 = z2VarArr2;
                        if (starsTransaction6.refund) {
                            i14 = i10;
                            wy0Var5 = wy0Var8;
                            starsTransaction4 = starsTransaction6;
                            p6Var4 = p6Var3;
                            z2VarArr3 = z2VarArr7;
                            context3 = context;
                            wy0Var2 = wy0Var5;
                        } else {
                            long e7 = j10 == 0 ? d20.i(i10).e() : j10;
                            final long o15 = org.telegram.messenger.o5.o(starsTransaction6.peer.peer);
                            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(o15));
                            if (positive) {
                                if (o15 != e7) {
                                    CharSequence K05 = cd.K0(2131745226);
                                    Runnable l6Var = new l6(z2VarArr7, starsTransaction6, o15, 4);
                                    String K06 = (Z1 == null || h20.x(Z1) || h20.b(vp.r1(d20.s0).a2(o15))) ? null : cd.K0(2131750293);
                                    final int i27 = 0;
                                    i16 = i10;
                                    Runnable runnable2 = new Runnable() { // from class: rh.j6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.z2 z2Var4 = z2VarArr7[0];
                                                    Objects.requireNonNull(z2Var4);
                                                    new ph.l1(context5, i16, o15, null, new ph.h1(z2Var4, 12)).show();
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.z2 z2Var5 = z2VarArr7[0];
                                                    Objects.requireNonNull(z2Var5);
                                                    new ph.l1(context5, i16, o15, null, new ph.h1(z2Var5, 12)).show();
                                                    break;
                                            }
                                        }
                                    };
                                    wy0Var = wy0Var8;
                                    z2VarArr3 = z2VarArr7;
                                    wy0Var.m(K05, i16, o15, l6Var, K06, runnable2);
                                } else {
                                    i16 = i10;
                                    wy0Var = wy0Var8;
                                    z2VarArr3 = z2VarArr7;
                                }
                                final int i28 = 0;
                                wy0Var.n(cd.K0(2131745225), i16, e7, new Runnable() { // from class: rh.k6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i28) {
                                            case 0:
                                                z2VarArr3[0].dismiss();
                                                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                if (T2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", d20.i(i16).e());
                                                    bundle.putBoolean("my_profile", true);
                                                    bundle.putBoolean("open_gifts", true);
                                                    T2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                z2VarArr3[0].dismiss();
                                                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                                                if (T3 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putLong("user_id", d20.i(i16).e());
                                                    bundle2.putBoolean("my_profile", true);
                                                    bundle2.putBoolean("open_gifts", true);
                                                    T3.presentFragment(new ProfileActivity(bundle2, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                z2VarArr3[0].dismiss();
                                                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                                                if (T4 != null) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("user_id", d20.i(i16).e());
                                                    bundle3.putBoolean("my_profile", true);
                                                    T4.presentFragment(new ProfileActivity(bundle3, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                starsTransaction3 = starsTransaction;
                            } else {
                                long j18 = e7;
                                if (o15 != j18) {
                                    final int i29 = 1;
                                    wy0Var8.n(cd.K0(2131745226), i10, j18, new Runnable() { // from class: rh.k6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i29) {
                                                case 0:
                                                    z2VarArr7[0].dismiss();
                                                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", d20.i(i10).e());
                                                        bundle.putBoolean("my_profile", true);
                                                        bundle.putBoolean("open_gifts", true);
                                                        T2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    z2VarArr7[0].dismiss();
                                                    org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                                                    if (T3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", d20.i(i10).e());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        T3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    z2VarArr7[0].dismiss();
                                                    org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                                                    if (T4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", d20.i(i10).e());
                                                        bundle3.putBoolean("my_profile", true);
                                                        T4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                }
                                CharSequence K07 = cd.K0(2131745225);
                                Runnable l6Var2 = new l6(z2VarArr7, starsTransaction, o15, 0);
                                starsTransaction3 = starsTransaction;
                                String K08 = (Z1 == null || h20.x(Z1) || h20.b(vp.r1(d20.s0).a2(o15))) ? null : cd.K0(2131750293);
                                final int i30 = 1;
                                Runnable runnable3 = new Runnable() { // from class: rh.j6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i30) {
                                            case 0:
                                                org.telegram.ui.ActionBar.z2 z2Var4 = z2VarArr7[0];
                                                Objects.requireNonNull(z2Var4);
                                                new ph.l1(context, i10, o15, null, new ph.h1(z2Var4, 12)).show();
                                                break;
                                            default:
                                                org.telegram.ui.ActionBar.z2 z2Var5 = z2VarArr7[0];
                                                Objects.requireNonNull(z2Var5);
                                                new ph.l1(context, i10, o15, null, new ph.h1(z2Var5, 12)).show();
                                                break;
                                        }
                                    }
                                };
                                wy0Var = wy0Var8;
                                z2VarArr3 = z2VarArr7;
                                wy0Var.m(K07, i10, o15, l6Var2, K08, runnable3);
                            }
                            wy0Var4 = wy0Var;
                            starsTransaction4 = starsTransaction3;
                            p6Var4 = p6Var3;
                            context3 = context;
                            wy0Var3 = wy0Var4;
                        }
                    }
                }
                starsTransactionPeer = starsTransaction4.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction4.flags & 256) != 0) {
                    long o122 = org.telegram.messenger.o5.o(starsTransactionPeer.peer);
                    if (z10) {
                        o122 = j10;
                    }
                    L0 = vp.r1(i14).L0(Long.valueOf(-o122));
                    if (L0 != null) {
                        p80 p80Var2 = new p80(context3, p6Var4);
                        p80Var2.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
                        p80Var2.setEllipsize(TextUtils.TruncateAt.END);
                        int i31 = org.telegram.ui.ActionBar.t6.Uc;
                        org.telegram.ui.ActionBar.a7.V(p80Var2, i31, p6Var4);
                        org.telegram.ui.ActionBar.a7.H(p80Var2, i31, p6Var4);
                        p80Var2.setTextSize(1, 14.0f);
                        p80Var2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        if (starsTransaction4.extended_media.isEmpty()) {
                            z14 = z15;
                        } else {
                            ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction4.extended_media;
                            int size = arrayList.size();
                            z14 = z15;
                            int i32 = 0;
                            int i33 = 0;
                            while (i32 < size) {
                                TLRPC.MessageMedia messageMedia = arrayList.get(i32);
                                int i34 = i32 + 1;
                                TLRPC.MessageMedia messageMedia2 = messageMedia;
                                ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                int i35 = size;
                                o60 o60Var = new o60(24.0f, i14, p80Var2);
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                    i15 = i33;
                                    c11 = ic.i(org.telegram.messenger.b8.v(org.telegram.messenger.i0.L(24.0f), messageMedia2.photo.sizes, true), messageMedia2.photo);
                                } else {
                                    i15 = i33;
                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                        c11 = ic.c(org.telegram.messenger.b8.v(org.telegram.messenger.i0.L(24.0f), messageMedia2.document.thumbs, true), messageMedia2.document);
                                    } else {
                                        icVar2 = null;
                                        if (icVar2 == null) {
                                            o60Var.a(6.0f);
                                            o60Var.b.q0(icVar2, "24_24", null, null, null, 0);
                                            SpannableString spannableString = new SpannableString("x");
                                            spannableString.setSpan(o60Var, 0, spannableString.length(), 33);
                                            spannableStringBuilder3.append((CharSequence) spannableString);
                                            spannableStringBuilder3.append((CharSequence) " ");
                                            i33 = i15 + 1;
                                        } else {
                                            i33 = i15;
                                        }
                                        if (i33 < 3) {
                                            break;
                                        }
                                        i32 = i34;
                                        size = i35;
                                        arrayList = arrayList2;
                                    }
                                }
                                icVar2 = c11;
                                if (icVar2 == null) {
                                }
                                if (i33 < 3) {
                                }
                            }
                        }
                        spannableStringBuilder3.append((CharSequence) " ");
                        int length = spannableStringBuilder3.length();
                        String K = org.telegram.messenger.w3.K(L0, false);
                        if (TextUtils.isEmpty(K)) {
                            spannableStringBuilder3.append((CharSequence) L0.title);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            c3.i0.r(sb3, vp.r1(i14).U2, "/", K, "/");
                            sb3.append(starsTransaction4.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb3.toString());
                        }
                        l6 l6Var3 = new l6(z2VarArr3, o122, starsTransaction4);
                        spannableStringBuilder3.setSpan(new i7(l6Var3), length, spannableStringBuilder3.length(), 33);
                        p80Var2.setSingleLine(true);
                        p80Var2.setEllipsize(TextUtils.TruncateAt.END);
                        p80Var2.setText(spannableStringBuilder3);
                        p80Var2.setOnClickListener(new s(l6Var3, 8));
                        wy0Var2.l(p80Var2, cd.K0(starsTransaction4.reaction ? 2131744960 : 2131744961));
                        if (!TextUtils.isEmpty(starsTransaction4.id) && !z19) {
                            String K09 = cd.K0(2131744966);
                            String str3 = starsTransaction4.id;
                            wy0Var2.k(K09, str3, str3.length() <= 25 ? 9 : 10, new o(16, z2VarArr3, p6Var4));
                        }
                        if (starsTransaction4.floodskip && starsTransaction4.floodskip_number > 0) {
                            wy0Var2.d(cd.I(starsTransaction4.floodskip_number, "StarsTransactionFloodskipNumber"), cd.K0(2131744972));
                        }
                        wy0Var2.d(cd.Z(2131742808, cd.D0().r0().format(new Date(starsTransaction4.date * 1000)), cd.D0().o0().format(new Date(starsTransaction4.date * 1000))), cd.K0(2131744978));
                        starGift2 = starsTransaction4.stargift;
                        if (starGift2 != null) {
                            if (starGift2.limited) {
                                G0(wy0Var2, i14, starGift2, p6Var4);
                            }
                            if (!TextUtils.isEmpty(starsTransaction4.description)) {
                                wy0Var2.a(new SpannableStringBuilder(starsTransaction4.description));
                            }
                        }
                        ViewGroup viewGroup32 = viewGroup;
                        viewGroup32.addView(wy0Var2, w7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                        if ((starsTransaction4.flags & 32) != 0) {
                            wy0Var2.d(cd.Z(2131742808, cd.D0().r0().format(new Date(starsTransaction4.transaction_date * 1000)), cd.D0().o0().format(new Date(starsTransaction4.transaction_date * 1000))), cd.K0(2131744947));
                        }
                        if (z14) {
                            context4 = context;
                        } else {
                            context4 = context;
                            p80 p80Var3 = new p80(context4, p6Var4);
                            org.telegram.ui.ActionBar.a7.V(p80Var3, org.telegram.ui.ActionBar.t6.z6, p6Var4);
                            org.telegram.ui.ActionBar.a7.H(p80Var3, org.telegram.ui.ActionBar.t6.Uc, p6Var4);
                            p80Var3.setTextSize(1, 14.0f);
                            p80Var3.setText(org.telegram.messenger.i0.T2(cd.K0(2131744944), new ph.p0(context4, 5)));
                            p80Var3.setGravity(17);
                            viewGroup32.addView(p80Var3, w7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                        }
                        vh.d dVar2 = new vh.d(context4, p6Var4);
                        dVar2.f();
                        if ((starsTransaction4.flags & 32) != 0) {
                            r32 = 0;
                            dVar2.h(cd.K0(2131744940), false);
                        } else {
                            r32 = 0;
                            dVar2.h(cd.K0(2131747847), false);
                        }
                        viewGroup32.addView(dVar2, w7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                        org.telegram.ui.ActionBar.z2 z2Var32 = z2Var;
                        z2Var32.N = viewGroup32;
                        z2VarArr3[r32] = z2Var32;
                        z2Var32.T0 = r32;
                        if ((starsTransaction4.flags & 32) != 0) {
                            dVar2.setOnClickListener(new u1(3, context4, starsTransaction4));
                        } else {
                            dVar2.setOnClickListener(new p6(z2VarArr3, r32));
                        }
                        z2VarArr3[r32].O();
                        T = LaunchActivity.T();
                        if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(T)) {
                            z2VarArr3[r32].a0(T);
                        }
                        z2VarArr3[r32].show();
                        return z2VarArr3[r32];
                    }
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    String K092 = cd.K0(2131744966);
                    String str32 = starsTransaction4.id;
                    wy0Var2.k(K092, str32, str32.length() <= 25 ? 9 : 10, new o(16, z2VarArr3, p6Var4));
                }
                if (starsTransaction4.floodskip) {
                    wy0Var2.d(cd.I(starsTransaction4.floodskip_number, "StarsTransactionFloodskipNumber"), cd.K0(2131744972));
                }
                wy0Var2.d(cd.Z(2131742808, cd.D0().r0().format(new Date(starsTransaction4.date * 1000)), cd.D0().o0().format(new Date(starsTransaction4.date * 1000))), cd.K0(2131744978));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup322 = viewGroup;
                viewGroup322.addView(wy0Var2, w7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                vh.d dVar22 = new vh.d(context4, p6Var4);
                dVar22.f();
                if ((starsTransaction4.flags & 32) != 0) {
                }
                viewGroup322.addView(dVar22, w7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.z2 z2Var322 = z2Var;
                z2Var322.N = viewGroup322;
                z2VarArr3[r32] = z2Var322;
                z2Var322.T0 = r32;
                if ((starsTransaction4.flags & 32) != 0) {
                }
                z2VarArr3[r32].O();
                T = LaunchActivity.T();
                if (!org.telegram.messenger.i0.Q1()) {
                    z2VarArr3[r32].a0(T);
                }
                z2VarArr3[r32].show();
                return z2VarArr3[r32];
                i14 = i10;
                wy0Var2 = wy0Var3;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                wy0Var2.d(cd.Z(2131742808, cd.D0().r0().format(new Date(starsTransaction4.date * 1000)), cd.D0().o0().format(new Date(starsTransaction4.date * 1000))), cd.K0(2131744978));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup3222 = viewGroup;
                viewGroup3222.addView(wy0Var2, w7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                vh.d dVar222 = new vh.d(context4, p6Var4);
                dVar222.f();
                if ((starsTransaction4.flags & 32) != 0) {
                }
                viewGroup3222.addView(dVar222, w7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.z2 z2Var3222 = z2Var;
                z2Var3222.N = viewGroup3222;
                z2VarArr3[r32] = z2Var3222;
                z2Var3222.T0 = r32;
                if ((starsTransaction4.flags & 32) != 0) {
                }
                z2VarArr3[r32].O();
                T = LaunchActivity.T();
                if (!org.telegram.messenger.i0.Q1()) {
                }
                z2VarArr3[r32].show();
                return z2VarArr3[r32];
            }
            z11 = z17;
        } else {
            z11 = z17;
        }
        z2Var = z2Var2;
        z2VarArr = z2VarArr5;
        final g9 g9Var2 = new g9(context);
        if (starsTransaction.premium_gift) {
            e1(g9Var2, g9Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            f7.addView(g9Var2, w7.b6.t(zs.q2, zs.q2, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            eq a10 = org.telegram.ui.Cells.w6.a(100, "search");
            int L3 = org.telegram.messenger.i0.L(40.0f);
            int L4 = org.telegram.messenger.i0.L(40.0f);
            a10.e = L3;
            a10.f = L4;
            g9Var2.setImageDrawable(a10);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z19 || starsTransaction.gift) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f7;
                    str = "";
                    z12 = z18;
                    z13 = z10;
                    j11 = j10;
                    p6Var2 = p6Var;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        f1(g9Var2, g9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        d1(g9Var2, g9Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(g9Var2, w7.b6.t(zs.q2, zs.q2, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i11 = i10;
                    starsTransaction2 = starsTransaction;
                    linearLayout = f7;
                    z13 = z10;
                    j11 = j10;
                    p6Var2 = p6Var;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            g9Var2.setRoundRadius(org.telegram.messenger.i0.L(50.0f));
                            z12 = z18;
                            g9Var2.p(ic.p(b30.c(starsTransaction2.photo)), "100_100", null, null);
                            str = "";
                        } else {
                            z12 = z18;
                            g9Var2.setRoundRadius(org.telegram.messenger.i0.L(50.0f));
                            if (z12) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z13) {
                                j12 = j11;
                                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8();
                                if (j12 < 0) {
                                    str = "";
                                    TLRPC.User Z12 = vp.r1(i11).Z1(Long.valueOf(j12));
                                    r8Var.o(Z12);
                                    g9Var2.e(Z12, r8Var);
                                } else {
                                    str = "";
                                    TLRPC.Chat L02 = vp.r1(i11).L0(Long.valueOf(-j12));
                                    r8Var.m(L02);
                                    g9Var2.e(L02, r8Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            j12 = org.telegram.messenger.o5.o(peer);
                            org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8();
                            if (j12 < 0) {
                            }
                        }
                        linearLayout.addView(g9Var2, w7.b6.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z12 = z18;
                        eq a11 = org.telegram.ui.Cells.w6.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int L5 = org.telegram.messenger.i0.L(40.0f);
                        int L6 = org.telegram.messenger.i0.L(40.0f);
                        a11.e = L5;
                        a11.f = L6;
                        g9Var2.setImageDrawable(a11);
                    }
                } else {
                    g9Var2.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        c10 = ic.i(org.telegram.messenger.b8.v(org.telegram.messenger.i0.L(100.0f), messageMedia3.photo.sizes, true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        c10 = ic.c(org.telegram.messenger.b8.v(org.telegram.messenger.i0.L(100.0f), messageMedia3.document.thumbs, true), messageMedia3.document);
                    } else {
                        icVar = null;
                        g9Var2.m(icVar, "100_100", null, null, null, 0);
                        f7.addView(g9Var2, w7.b6.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: rh.n6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z20 = z10;
                                TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                                long o16 = z20 ? j10 : org.telegram.messenger.o5.o(starsTransaction7.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i36 = 0; i36 < starsTransaction7.extended_media.size(); i36++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i36);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction7.msg_id;
                                    tL_message.dialog_id = o16;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j19 = -o16;
                                    tL_peerChannel.channel_id = j19;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j19;
                                    tL_message.date = starsTransaction7.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new jj(i10, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.v1().N2(null, LaunchActivity.Q(), p6Var);
                                PhotoViewer.v1().e2(arrayList3, 0, o16, 0L, 0L, new g7(g9Var2, f7, o16));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z13 = z10;
                        p6Var2 = p6Var;
                        i11 = i10;
                        linearLayout = f7;
                        j11 = j10;
                        g9Var2.setOnClickListener(onClickListener);
                        str = "";
                        z12 = z18;
                    }
                    icVar = c10;
                    g9Var2.m(icVar, "100_100", null, null, null, 0);
                    f7.addView(g9Var2, w7.b6.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: rh.n6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z20 = z10;
                            TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                            long o16 = z20 ? j10 : org.telegram.messenger.o5.o(starsTransaction7.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i36 = 0; i36 < starsTransaction7.extended_media.size(); i36++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i36);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction7.msg_id;
                                tL_message.dialog_id = o16;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j19 = -o16;
                                tL_peerChannel.channel_id = j19;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j19;
                                tL_message.date = starsTransaction7.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new jj(i10, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.v1().N2(null, LaunchActivity.Q(), p6Var);
                            PhotoViewer.v1().e2(arrayList3, 0, o16, 0L, 0L, new g7(g9Var2, f7, o16));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z13 = z10;
                    p6Var2 = p6Var;
                    i11 = i10;
                    linearLayout = f7;
                    j11 = j10;
                    g9Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z12 = z18;
                }
                TextView textView = new TextView(context2);
                i12 = org.telegram.ui.ActionBar.t6.j5;
                org.telegram.messenger.m5.m(textView, i12, p6Var2, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(P0(i11, z13, starsTransaction2));
                TextView f10 = z20.f(linearLayout, textView, w7.b6.t(-1, -2, 17, 36, 0, 36, 4), context2);
                f10.setTextSize(1, 18.0f);
                f10.setTypeface(org.telegram.messenger.i0.o());
                f10.setGravity(17);
                org.telegram.ui.ActionBar.a7.V(f10, !positive ? org.telegram.ui.ActionBar.t6.ik : org.telegram.ui.ActionBar.t6.kk, p6Var2);
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                f10.setText(Z0(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, K0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(f10.getText());
                if (!starsTransaction2.refund) {
                    H0(spannableStringBuilder4, f10, cd.K0(2131745048));
                } else if (starsTransaction2.failed) {
                    org.telegram.ui.ActionBar.a7.V(f10, org.telegram.ui.ActionBar.t6.kk, p6Var2);
                    H0(spannableStringBuilder4, f10, cd.K0(2131745128));
                } else if (starsTransaction2.pending) {
                    org.telegram.ui.ActionBar.a7.V(f10, org.telegram.ui.ActionBar.t6.mk, p6Var2);
                    H0(spannableStringBuilder4, f10, cd.K0(2131745071));
                }
                f10.setText(spannableStringBuilder4);
                linearLayout.addView(f10, w7.b6.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    p80 p80Var4 = new p80(context2);
                    org.telegram.ui.ActionBar.a7.V(p80Var4, i12, p6Var2);
                    p80Var4.setTextSize(1, 14.0f);
                    p80Var4.setGravity(17);
                    org.telegram.ui.ActionBar.a7.H(p80Var4, org.telegram.ui.ActionBar.t6.Uc, p6Var2);
                    p80Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) org.telegram.messenger.i0.W2(cd.Z(2131744958, xh.i.I0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j11 == d20.i(i11).e() || org.telegram.messenger.w3.w(2, vp.r1(i11).L0(Long.valueOf(-j11)))) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append((CharSequence) org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(cd.K0(2131744957).replace(' ', (char) 160), new org.telegram.ui.web.l(j11, i11, 1)), true));
                    }
                    p80Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(p80Var4, w7.b6.t(-1, -2, 17, 36, 0, 36, 4));
                    z2VarArr2 = z2VarArr;
                    wy0 wy0Var82 = new wy0(context2, p6Var2);
                    starGift = starsTransaction2.stargift;
                    int i192 = 5;
                    if (starGift != null) {
                    }
                    i14 = i10;
                    wy0Var2 = wy0Var3;
                    starsTransactionPeer = starsTransaction4.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z14 = z15;
                    if (!TextUtils.isEmpty(starsTransaction4.id)) {
                    }
                    if (starsTransaction4.floodskip) {
                    }
                    wy0Var2.d(cd.Z(2131742808, cd.D0().r0().format(new Date(starsTransaction4.date * 1000)), cd.D0().o0().format(new Date(starsTransaction4.date * 1000))), cd.K0(2131744978));
                    starGift2 = starsTransaction4.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup32222 = viewGroup;
                    viewGroup32222.addView(wy0Var2, w7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    if (z14) {
                    }
                    vh.d dVar2222 = new vh.d(context4, p6Var4);
                    dVar2222.f();
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    viewGroup32222.addView(dVar2222, w7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    org.telegram.ui.ActionBar.z2 z2Var32222 = z2Var;
                    z2Var32222.N = viewGroup32222;
                    z2VarArr3[r32] = z2Var32222;
                    z2Var32222.T0 = r32;
                    if ((starsTransaction4.flags & 32) != 0) {
                    }
                    z2VarArr3[r32].O();
                    T = LaunchActivity.T();
                    if (!org.telegram.messenger.i0.Q1()) {
                    }
                    z2VarArr3[r32].show();
                    return z2VarArr3[r32];
                }
                if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z19 || starsTransaction2.gift)) {
                    TLRPC.User Z13 = starsTransaction2.sent_by == null ? null : vp.r1(i11).Z1(Long.valueOf(org.telegram.messenger.o5.o(starsTransaction2.sent_by)));
                    TLRPC.User Z14 = starsTransaction2.sent_by == null ? null : vp.r1(i11).Z1(Long.valueOf(org.telegram.messenger.o5.o(starsTransaction2.received_by)));
                    boolean B = h20.B(Z13);
                    if (B) {
                        org.telegram.ui.ActionBar.a7.V(f10, org.telegram.ui.ActionBar.t6.G6, p6Var2);
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i13 = 1;
                        f10.setText(Z0(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(K0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i13 = 1;
                    }
                    p80 p80Var5 = new p80(context2);
                    org.telegram.ui.ActionBar.a7.V(p80Var5, i12, p6Var2);
                    p80Var5.setTextSize(i13, 16.0f);
                    p80Var5.setGravity(17);
                    org.telegram.ui.ActionBar.a7.H(p80Var5, org.telegram.ui.ActionBar.t6.Uc, p6Var2);
                    p80Var5.setDisablePaddingsOffsetY(i13);
                    if (B) {
                        Object[] objArr = new Object[i13];
                        objArr[0] = h20.k(Z14);
                        K0 = cd.Z(2131754631, objArr);
                    } else {
                        K0 = cd.K0(2131754630);
                    }
                    z2VarArr2 = z2VarArr;
                    p80Var5.setText(TextUtils.concat(org.telegram.messenger.i0.W2(K0), " ", org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(cd.K0(2131749617).replace(' ', (char) 160), new y31(context2, z2VarArr2)), true)));
                    linearLayout.addView(p80Var5, w7.b6.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    z2VarArr2 = z2VarArr;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        org.telegram.ui.ActionBar.a7.V(textView2, i12, p6Var2);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, w7.b6.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                wy0 wy0Var822 = new wy0(context2, p6Var2);
                starGift = starsTransaction2.stargift;
                int i1922 = 5;
                if (starGift != null) {
                }
                i14 = i10;
                wy0Var2 = wy0Var3;
                starsTransactionPeer = starsTransaction4.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                }
                z14 = z15;
                if (!TextUtils.isEmpty(starsTransaction4.id)) {
                }
                if (starsTransaction4.floodskip) {
                }
                wy0Var2.d(cd.Z(2131742808, cd.D0().r0().format(new Date(starsTransaction4.date * 1000)), cd.D0().o0().format(new Date(starsTransaction4.date * 1000))), cd.K0(2131744978));
                starGift2 = starsTransaction4.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup322222 = viewGroup;
                viewGroup322222.addView(wy0Var2, w7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction4.flags & 32) != 0) {
                }
                if (z14) {
                }
                vh.d dVar22222 = new vh.d(context4, p6Var4);
                dVar22222.f();
                if ((starsTransaction4.flags & 32) != 0) {
                }
                viewGroup322222.addView(dVar22222, w7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                org.telegram.ui.ActionBar.z2 z2Var322222 = z2Var;
                z2Var322222.N = viewGroup322222;
                z2VarArr3[r32] = z2Var322222;
                z2Var322222.T0 = r32;
                if ((starsTransaction4.flags & 32) != 0) {
                }
                z2VarArr3[r32].O();
                T = LaunchActivity.T();
                if (!org.telegram.messenger.i0.Q1()) {
                }
                z2VarArr3[r32].show();
                return z2VarArr3[r32];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                g9Var2.setImageDrawable(new p3(g9Var2, starsTransaction.stargift, 94, 0.44f));
                f7.addView(g9Var2, w7.b6.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                c1(g9Var2.getImageReceiver(), starsTransaction.stargift, zs.q2);
                f7.addView(g9Var2, w7.b6.t(zs.q2, zs.q2, 17, 0, -8, 0, 10));
            }
        }
        p6Var2 = p6Var;
        context2 = context;
        i11 = i10;
        starsTransaction2 = starsTransaction;
        linearLayout = f7;
        str = "";
        z12 = z18;
        z13 = z10;
        j11 = j10;
        TextView textView3 = new TextView(context2);
        i12 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.messenger.m5.m(textView3, i12, p6Var2, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(P0(i11, z13, starsTransaction2));
        TextView f102 = z20.f(linearLayout, textView3, w7.b6.t(-1, -2, 17, 36, 0, 36, 4), context2);
        f102.setTextSize(1, 18.0f);
        f102.setTypeface(org.telegram.messenger.i0.o());
        f102.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(f102, !positive ? org.telegram.ui.ActionBar.t6.ik : org.telegram.ui.ActionBar.t6.kk, p6Var2);
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        f102.setText(Z0(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, K0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(f102.getText());
        if (!starsTransaction2.refund) {
        }
        f102.setText(spannableStringBuilder42);
        linearLayout.addView(f102, w7.b6.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        z2VarArr2 = z2VarArr;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            org.telegram.ui.ActionBar.a7.V(textView22, i12, p6Var2);
            textView22.setTextSize(1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, w7.b6.t(-1, -2, 17, 36, 0, 36, 4));
        }
        wy0 wy0Var8222 = new wy0(context2, p6Var2);
        starGift = starsTransaction2.stargift;
        int i19222 = 5;
        if (starGift != null) {
        }
        i14 = i10;
        wy0Var2 = wy0Var3;
        starsTransactionPeer = starsTransaction4.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z14 = z15;
        if (!TextUtils.isEmpty(starsTransaction4.id)) {
        }
        if (starsTransaction4.floodskip) {
        }
        wy0Var2.d(cd.Z(2131742808, cd.D0().r0().format(new Date(starsTransaction4.date * 1000)), cd.D0().o0().format(new Date(starsTransaction4.date * 1000))), cd.K0(2131744978));
        starGift2 = starsTransaction4.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup3222222 = viewGroup;
        viewGroup3222222.addView(wy0Var2, w7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction4.flags & 32) != 0) {
        }
        if (z14) {
        }
        vh.d dVar222222 = new vh.d(context4, p6Var4);
        dVar222222.f();
        if ((starsTransaction4.flags & 32) != 0) {
        }
        viewGroup3222222.addView(dVar222222, w7.b6.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.z2 z2Var3222222 = z2Var;
        z2Var3222222.N = viewGroup3222222;
        z2VarArr3[r32] = z2Var3222222;
        z2Var3222222.T0 = r32;
        if ((starsTransaction4.flags & 32) != 0) {
        }
        z2VarArr3[r32].O();
        T = LaunchActivity.T();
        if (!org.telegram.messenger.i0.Q1()) {
        }
        z2VarArr3[r32].show();
        return z2VarArr3[r32];
    }

    public static void k1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.p6 p6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.id = tL_messageActionPaymentRefunded.charge.id;
        starsTransaction.refund = true;
        j1(activity, false, 0L, i10, starsTransaction, p6Var);
    }

    public static void l1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.p6 p6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = vp.r1(i10).y1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        j1(context, false, 0L, i10, starsTransaction, p6Var);
    }

    public static CharSequence r1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        x4.o c10;
        if (z10 && c3.i0.t(spannableStringBuilder)) {
            for (dq dqVar : (dq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), dq.class)) {
                Drawable drawable = dqVar.c;
                if (drawable != null && !(drawable instanceof x4.o) && (c10 = x4.o.c(org.telegram.messenger.w0.b.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c10.setBounds(dqVar.c.getBounds());
                    dqVar.c = c10;
                    dqVar.d = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ void z0(h8 h8Var, Context context) {
        if (vp.r1(h8Var.currentAccount).u2()) {
            org.telegram.ui.b.b(h8Var.currentAccount);
        } else {
            new y7(context, h8Var.resourceProvider).show();
        }
    }

    public final void I0() {
        p1();
        tk0 tk0Var = this.c;
        if (tk0Var == null || this.U == null || tk0Var.getLayoutParams() == null) {
            return;
        }
        int C = z20.C(48.0f, this.b0, -org.telegram.messenger.i0.L(8.0f));
        int C2 = z20.C(48.0f, this.c0, -org.telegram.messenger.i0.L(8.0f));
        org.telegram.messenger.i0.A3(this.c, 0, C, 0, C2);
        tk0 tk0Var2 = this.c;
        int i10 = -C;
        tk0Var2.setPadding(tk0Var2.getPaddingLeft(), i10, this.c.getPaddingRight(), this.c0 - C2);
        this.U.z(i10, -C2);
    }

    public final void J0(ArrayList arrayList, p51 p51Var) {
        tk0 tk0Var;
        m1("FILL_BEFORE");
        ku0 ku0Var = this.U;
        boolean z10 = ku0Var != null && ku0Var.e0;
        this.a0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        e6 y3 = e6.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        bi.t0 t0Var = (bi.t0) super.n0(getParentActivity());
        a51 a51Var = new a51(-2);
        a51Var.c = t0Var;
        arrayList.add(a51Var);
        arrayList.add(a51.k(this.i0));
        vh.d dVar = this.r0;
        if (dVar != null) {
            dVar.setVisibility(getMessagesController().Y5 ? 0 : 8);
        }
        arrayList.add(a51.C(null));
        if (getMessagesController().h6) {
            arrayList.add(xh.e.i(-4, getThemedColor(org.telegram.ui.ActionBar.t6.ik), oo.h0(cd.L0(2131743792, null)), cd.L0(2131743793, null)));
            arrayList.add(a51.C(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            arrayList.add(a51.u(cd.L0(2131745221, null)));
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList2.get(i10);
                int i11 = z7.b;
                a51 K = a51.K(z7.class);
                K.G = starsSubscription;
                arrayList.add(K);
            }
            if (y3.x) {
                arrayList.add(a51.q(arrayList.size(), 33));
            } else if (!y3.y) {
                a51 c10 = a51.c(-3, R.drawable.arrow_more, cd.L0(2131745220, null));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(a51.C(null));
        }
        boolean N = y3.N(0);
        this.s0 = N;
        if (N) {
            this.a0 = arrayList.size();
            arrayList.add(a51.n(this.V, -2));
            if (z10 && (tk0Var = this.c) != null) {
                ph.x1 x1Var = this.f0;
                tk0Var.removeCallbacks(x1Var);
                this.c.post(x1Var);
            }
        } else {
            arrayList.add(a51.m(this.g0));
        }
        m1("FILL_AFTER");
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final int i10 = 0;
        this.G = false;
        this.E = org.telegram.messenger.i0.L(238.0f);
        ku0 ku0Var = new ku0(context);
        this.U = ku0Var;
        char c10 = 1;
        char c11 = 1;
        ku0Var.setDebugLoggingEnabled(true);
        this.U.setCommonInsetsManagedExternally(true);
        if (!this.d0) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            this.b0 = (z4Var == null || !((ActionBarLayout) z4Var).S0) ? org.telegram.messenger.i0.m : 0;
            this.c0 = org.telegram.messenger.i0.n;
        }
        this.U.setGeometry(new m2.t(this, 21));
        this.U.z(-z20.C(48.0f, this.b0, -org.telegram.messenger.i0.L(8.0f)), -z20.C(48.0f, this.c0, -org.telegram.messenger.i0.L(8.0f)));
        ku0 ku0Var2 = this.U;
        ku0Var2.getClass();
        this.V = new bi.t0(ku0Var2, context, 20);
        this.T = new g8(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.g0 = new do0(this, context, 9);
        super.createView(context);
        o10 o10Var = this.s;
        getBaseSimpleGlass().f(o10Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.D.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().l = this.U;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().m = new ei.a(8, this, new org.telegram.ui.ActionBar.y1(2, o10Var));
        View view = this.T.d;
        View view2 = new View(getParentActivity());
        this.W = view2;
        view2.setAlpha(0.0f);
        ku0 ku0Var3 = this.U;
        ku0Var3.addView(this.W, ku0Var3.indexOfChild(view), w7.b6.e(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        i6 i6Var = new i6(this, 0);
        gr grVar = gr.h;
        fe.b bVar = new fe.b(0, i6Var, grVar, 380L, false);
        this.X = bVar;
        this.Y = new fe.b(1, new i6(this, 1), grVar, 380L, false);
        this.Z = new fe.b(2, new i6(this, 2), grVar, 380L, false);
        bVar.a(this.c.canScrollVertically(-1) || this.simpleActionBar.s(), false);
        this.Y.a(this.U.e0, false);
        this.c.j(new bu0(this, 19));
        p1();
        vg.f c12 = getBaseSimpleGlass().c.c(view, null, false);
        c12.o(b9.m(this.resourceProvider));
        c12.p(org.telegram.messenger.i0.L(9.66f));
        c12.q(org.telegram.messenger.i0.L(18.0f));
        view.setBackground(c12);
        org.telegram.ui.ActionBar.z4 z4Var2 = this.parentLayout;
        if (z4Var2 != null && ((ActionBarLayout) z4Var2).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        lg.q qVar = new lg.q(context, 1, 2);
        this.S = qVar;
        lg.h hVar = qVar.b;
        hVar.z = org.telegram.ui.ActionBar.t6.Tk;
        hVar.A = org.telegram.ui.ActionBar.t6.Uk;
        hVar.b();
        this.S.setStarParticlesView(this.e);
        this.R.addView(this.S, w7.b6.d(zs.U2, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        i0(cd.L0(2131744240, null), org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(cd.L0(2131744237, null), new ph.p0(context, 4)), true), this.R, null);
        this.c.setOverScrollMode(2);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(grVar);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setOnItemClickListener(new ag.y0(this, 12));
        xz xzVar = new xz(getParentActivity());
        this.h0 = xzVar;
        this.s.addView(xzVar, w7.b6.c(-1.0f, -1));
        e6 y3 = e6.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.i0.setPadding(0, org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(10.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(getParentActivity(), false, true, false);
        this.k0 = f6Var;
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        this.k0.setTextSize(org.telegram.messenger.i0.L(32.0f));
        this.k0.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(this.k0, org.telegram.ui.ActionBar.t6.G6, this.resourceProvider);
        this.j0 = new SpannableStringBuilder("S");
        o60 o60Var = new o60(42.0f, this.currentAccount, this.k0);
        bi0 bi0Var = new bi0(R.raw.star_reaction, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f));
        ImageReceiver imageReceiver = o60Var.b;
        imageReceiver.w0(bi0Var);
        imageReceiver.W(2);
        o60Var.f = false;
        o60Var.h = -org.telegram.messenger.i0.L(3.0f);
        this.j0.setSpan(o60Var, 0, 1, 33);
        this.i0.addView(this.k0, w7.b6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.l0 = textView;
        textView.setTextSize(1, 14.0f);
        this.l0.setGravity(17);
        this.l0.setText(cd.L0(2131742815, null));
        org.telegram.ui.ActionBar.a7.V(this.l0, org.telegram.ui.ActionBar.t6.z6, this.resourceProvider);
        this.i0.addView(this.l0, w7.b6.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        org.telegram.ui.Components.voip.i0 i0Var = new org.telegram.ui.Components.voip.i0(this, getParentActivity(), 6);
        this.n0 = i0Var;
        frameLayout2.addView(i0Var);
        vh.d dVar = new vh.d(getParentActivity(), this.resourceProvider, true);
        this.o0 = dVar;
        dVar.f();
        this.o0.i("", false, true);
        this.o0.setOnClickListener(new View.OnClickListener(this) { // from class: rh.q6
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        h8.z0(this.b, context);
                        break;
                    default:
                        new y7(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.n0.addView(this.o0, w7.b6.e(-1, 48, zs.E1));
        u71 u71Var = new u71(this, getParentActivity(), 23);
        this.p0 = u71Var;
        frameLayout2.addView(u71Var);
        vh.d dVar2 = new vh.d(getParentActivity(), this.resourceProvider, true);
        this.q0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new dq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) cd.L0(2131744983, null));
        this.q0.i(spannableStringBuilder, false, true);
        vh.d dVar3 = this.q0;
        final char c13 = c11 == true ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: rh.q6
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c13) {
                    case 0:
                        h8.z0(this.b, context);
                        break;
                    default:
                        new y7(context, this.b.resourceProvider).show();
                        break;
                }
            }
        });
        this.p0.addView(this.q0, w7.b6.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        vh.d dVar4 = new vh.d(getParentActivity(), this.resourceProvider, true);
        this.m0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new dq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) cd.L0(2131745040, null));
        this.m0.i(spannableStringBuilder2, false, true);
        this.m0.setOnClickListener(new View.OnClickListener(this) { // from class: rh.v6
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        h8 h8Var = this.b;
                        h8Var.presentFragment(new i(0, h8Var.getUserConfig().e()));
                        break;
                    default:
                        h8.A0(this.b);
                        break;
                }
            }
        });
        this.p0.addView(this.m0, w7.b6.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.i0.addView(frameLayout2, w7.b6.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        vh.d dVar5 = new vh.d(getParentActivity(), this.resourceProvider, false);
        this.r0 = dVar5;
        dVar5.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new dq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) cd.L0(2131744238, null));
        this.r0.i(spannableStringBuilder3, false, true);
        vh.d dVar6 = this.r0;
        final char c14 = c10 == true ? 1 : 0;
        dVar6.setOnClickListener(new View.OnClickListener(this) { // from class: rh.v6
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (c14) {
                    case 0:
                        h8 h8Var = this.b;
                        h8Var.presentFragment(new i(0, h8Var.getUserConfig().e()));
                        break;
                    default:
                        h8.A0(this.b);
                        break;
                }
            }
        });
        this.i0.addView(this.r0, w7.b6.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        n1();
        ph.o3 o3Var = this.u0;
        if (o3Var != null) {
            o3Var.O(false);
        }
        r.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = r.g(this.currentAccount).h(getUserConfig().e(), false);
        o1(y3.p().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.v3;
        int i13 = zs.A3;
        int i14 = zs.z3;
        if (i10 == i14 || i10 == i13 || i10 == i12) {
            m1("NOTIFICATION_" + i10);
        }
        if (i10 == i12) {
            t0();
            ph.o3 o3Var = this.u0;
            if (o3Var != null) {
                o3Var.O(true);
            }
            g0();
            return;
        }
        if (i10 == i14) {
            e6 y3 = e6.y(this.currentAccount, false);
            if (this.s0 != y3.N(0)) {
                this.s0 = y3.N(0);
                t0();
                ph.o3 o3Var2 = this.u0;
                if (o3Var2 != null) {
                    o3Var2.O(false);
                }
                g0();
                return;
            }
            return;
        }
        if (i10 == i13) {
            ph.o3 o3Var3 = this.u0;
            if (o3Var3 != null) {
                o3Var3.O(true);
                return;
            }
            return;
        }
        if (i10 == zs.y3) {
            n1();
        } else if (i10 == zs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            n1();
        }
    }

    @Override // org.telegram.ui.p10
    public final void g0() {
        ku0 ku0Var;
        m1("RESTORE_BEFORE");
        super.g0();
        if (this.e0 && (ku0Var = this.U) != null && this.a0 != -1) {
            ku0Var.a();
        }
        this.e0 = false;
        m1("RESTORE_AFTER");
    }

    @Override // org.telegram.ui.p10
    public final void h0() {
        this.s.addView(this.U, w7.b6.c(-1.0f, -1));
        this.U.u(this.c, new i6(this, 3));
        ku0 ku0Var = this.U;
        g8 g8Var = this.T;
        ku0Var.x(g8Var, g8Var.b, new x6(0));
        this.U.y(this.T.d);
        this.T.d.setLayoutParams(w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        I0();
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ku0 ku0Var = this.U;
        return ku0Var == null || motionEvent == null || ku0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.b.b == 0;
    }

    @Override // org.telegram.ui.p10
    public final s4.g0 j0() {
        ph.o3 o3Var = new ph.o3(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new qh.d(this, 8), getResourceProvider(), 1);
        this.u0 = o3Var;
        o3Var.r = false;
        return o3Var;
    }

    @Override // org.telegram.ui.p10
    public final s4.a0 k0(Context context) {
        ku0 ku0Var = this.U;
        ku0Var.getClass();
        return new br((Object) ku0Var, 4);
    }

    @Override // org.telegram.ui.p10
    public final kg.g2 l0() {
        return new o7(getParentActivity(), 75, 1, 0);
    }

    public final void m1(String str) {
        if (this.U == null) {
            return;
        }
        StringBuilder u10 = a1.g.u("Stars event=", str, " row=");
        u10.append(this.a0);
        u10.append(" hasTransactions=");
        u10.append(this.s0);
        u10.append(" savedPosition=");
        u10.append(this.P);
        u10.append(" savedOffset=");
        u10.append(this.Q);
        u10.append(" savedPinned=");
        u10.append(this.e0);
        u10.append(" boundaryAttached=");
        bi.t0 t0Var = this.V;
        u10.append((t0Var == null || t0Var.getParent() == null) ? false : true);
        u10.append(" boundaryTop=");
        bi.t0 t0Var2 = this.V;
        u10.append(t0Var2 == null ? 0 : t0Var2.getTop());
        u10.append(" boundaryHeight=");
        bi.t0 t0Var3 = this.V;
        u10.append(t0Var3 == null ? 0 : t0Var3.getHeight());
        Log.d("SiblingScroll", u10.toString());
        ku0 ku0Var = this.U;
        if (ku0Var.a) {
            ku0Var.b = Math.max(ku0Var.b, Math.min(60, Math.max(0, 30)));
            ku0Var.f(str, null, 0, 0, true);
        }
    }

    @Override // org.telegram.ui.p10
    public final View n0(Context context) {
        throw null;
    }

    public final void n1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        e6 y3 = e6.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.j0);
        spannableStringBuilder.append((CharSequence) L0(y3.p(), 0.66f, ' '));
        this.k0.setText(spannableStringBuilder);
        this.o0.i(cd.L0(y3.p().amount > 0 ? 2131745168 : 2131745169, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = r.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        o1(z10, true);
    }

    public final void o1(final boolean z10, boolean z11) {
        this.t0 = z10;
        if (z11) {
            this.n0.setVisibility(0);
            this.p0.setVisibility(0);
            final int i10 = 0;
            this.n0.animate().alpha(z10 ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: rh.b7
                public final /* synthetic */ h8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            if (z10) {
                                this.b.n0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.p0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final int i11 = 1;
            this.p0.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: rh.b7
                public final /* synthetic */ h8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            if (z10) {
                                this.b.n0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z10) {
                                this.b.p0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        this.n0.animate().cancel();
        this.p0.animate().cancel();
        this.p0.setAlpha(z10 ? 1.0f : 0.0f);
        this.n0.setAlpha(z10 ? 0.0f : 1.0f);
        this.p0.setVisibility(z10 ? 0 : 8);
        this.n0.setVisibility(z10 ? 8 : 0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        zs.f(this.currentAccount).c(this, zs.v3);
        zs.f(this.currentAccount).c(this, zs.y3);
        zs.f(this.currentAccount).c(this, zs.z3);
        zs.f(this.currentAccount).c(this, zs.A3);
        zs.f(this.currentAccount).c(this, zs.C3);
        e6.y(this.currentAccount, false).S(true);
        e6.y(this.currentAccount, false).R();
        e6.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        tk0 tk0Var = this.c;
        if (tk0Var != null) {
            tk0Var.removeCallbacks(this.f0);
        }
        super.onFragmentDestroy();
        zs.f(this.currentAccount).n(this, zs.v3);
        zs.f(this.currentAccount).n(this, zs.y3);
        zs.f(this.currentAccount).n(this, zs.z3);
        zs.f(this.currentAccount).n(this, zs.A3);
        zs.f(this.currentAccount).n(this, zs.C3);
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.d0 = true;
        this.b0 = i11;
        this.c0 = i13;
        I0();
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        lg.q qVar = this.S;
        if (qVar != null) {
            qVar.setPaused(true);
            this.S.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.p10, org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        lg.q qVar = this.S;
        if (qVar != null) {
            qVar.setPaused(false);
            this.S.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.p10
    public final float p0() {
        tk0 tk0Var = this.c;
        if (tk0Var == null) {
            return 0.0f;
        }
        return tk0Var.getY();
    }

    public final void p1() {
        if (this.W == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.W.setLayoutParams(layoutParams);
        }
        q1();
    }

    @Override // org.telegram.ui.p10
    public final View q0() {
        return this.U;
    }

    public final void q1() {
        View view = this.W;
        if (view == null) {
            return;
        }
        fe.b bVar = this.X;
        float f7 = bVar == null ? 0.0f : bVar.e;
        fe.b bVar2 = this.Y;
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - ((1.0f - (bVar2 != null ? bVar2.e : 0.0f)) * org.telegram.messenger.i0.L(44.0f)));
    }

    @Override // org.telegram.ui.p10
    public final void r0(boolean z10) {
        fe.b bVar = this.Z;
        if (bVar == null || bVar.f == z10) {
            return;
        }
        bVar.a(z10, true);
    }

    @Override // org.telegram.ui.p10
    public final void t0() {
        m1("SAVE_BEFORE");
        super.t0();
        ku0 ku0Var = this.U;
        this.e0 = ku0Var != null && ku0Var.e0;
        tk0 tk0Var = this.c;
        if (tk0Var != null && this.P >= 0) {
            this.Q -= tk0Var.getPaddingTop();
        }
        m1("SAVE_AFTER");
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
