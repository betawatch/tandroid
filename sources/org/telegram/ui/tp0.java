package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class tp0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final ah.c E;
    public final fh.c F;
    public final ah.c G;
    public org.telegram.ui.ActionBar.m2 H;
    public ci.i1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.rz M;
    public org.telegram.ui.ActionBar.h5 N;
    public FrameLayout O;
    public FrameLayout P;
    public ci.d Q;
    public np0 R;
    public boolean S;
    public org.telegram.ui.Components.ij0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public kc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean a;
    public boolean a0;
    public final yh.k5 b;
    public i0.b b0;
    public final yh.k5 c;
    public yf.b0 c0;
    public k0 d;
    public final pe.b d0;
    public vo0 e;
    public final pe.b e0;
    public final int f;
    public final ah.h f0;
    public final fh.d g0;
    public np0 h;
    public final ah.c h0;
    public final va i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public np0 n;
    public boolean r;
    public org.telegram.ui.ActionBar.d6 s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.d5 w;
    public final org.telegram.ui.ActionBar.d5 x;
    public final fh.c y;

    public tp0() {
        super(null);
        this.f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
        this.S = q6;
        this.a0 = q6;
        this.b0 = i0.b.e;
        pe.b bVar = new pe.b(true);
        this.d0 = bVar;
        pe.b bVar2 = new pe.b(true);
        this.e0 = bVar2;
        this.i0 = new va(this, 1);
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        fh.c cVar = new fh.c();
        this.y = cVar;
        ah.c cVar2 = new ah.c(cVar);
        this.E = cVar2;
        fh.c cVar3 = new fh.c();
        this.F = cVar3;
        ah.c cVar4 = new ah.c(cVar3);
        this.G = cVar4;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.f0 = null;
            this.g0 = null;
            this.h0 = new ah.c(cVar);
        } else {
            ah.h hVar = new ah.h(false);
            this.f0 = hVar;
            fh.d dVar = new fh.d(cVar);
            this.g0 = dVar;
            dVar.v = new ro0(this, 1);
            dVar.d = hVar;
            dVar.e = -2;
            dVar.f = cVar;
            ah.c cVar5 = new ah.c(dVar);
            this.h0 = cVar5;
            cVar5.i = LiteMode.isEnabled(262144);
        }
        cVar2.e = bVar;
        cVar2.d = bVar2;
        cVar4.e = bVar;
        cVar4.d = bVar2;
        ah.c cVar6 = this.h0;
        cVar6.e = bVar;
        cVar6.d = bVar2;
        this.a = false;
        yh.t5.y(this.currentAccount, false).V();
        yh.k5 k5Var = new yh.k5(this.currentAccount, 0L, false);
        this.b = k5Var;
        k5Var.f(8, false);
        k5Var.a();
        yh.k5 k5Var2 = new yh.k5(this.currentAccount, 0L, false);
        this.c = k5Var2;
        k5Var2.f(8, false);
        k5Var2.f = true;
        k5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.w = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.x = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
    }

    public static boolean B0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static void U(tp0 tp0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, qo0 qo0Var, yh.a3 a3Var, nf.e eVar) {
        zArr[0] = true;
        eVar.d();
        yh.t5.x(tp0Var.currentAccount, a3Var.a).h(a3Var.b, tL_starGiftUnique, j3, null, true, new ai.m0(18, eVar, qo0Var));
    }

    public static void V(tp0 tp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, qo0 qo0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.a3 a3Var = new yh.a3(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        yh.c3 c3Var = new yh.c3(tp0Var.getParentActivity(), tp0Var.resourceProvider, tL_starGiftUnique, a3Var, tp0Var.currentAccount, j3, org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2), false, new uo0(tp0Var, zArr, tL_starGiftUnique, j3, qo0Var, 0));
        c3Var.h.setOnDismissListener(new ei.e0(10, zArr, qo0Var));
        c3Var.b();
    }

    public static int w0(int i10) {
        return org.telegram.ui.ActionBar.h6.b(0.5f, (AndroidUtilities.computePerceivedBrightness(i10) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i10);
    }

    public final void A0() {
        int d = ((double) AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.h6.d6))) > 0.72d ? i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.h6.a7), this.e.getColor()) : getThemedColor(org.telegram.ui.ActionBar.h6.a7);
        this.d.setBackgroundColor(d);
        fh.c cVar = this.F;
        if (cVar.a.getColor() != d) {
            cVar.a(d);
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((ch.d) it.next()).v();
            }
            Iterator it2 = this.d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final np0 C0() {
        ci.i1 i1Var = this.I;
        return (i1Var == null || i1Var.getPositionAnimated() < 0.5f) ? this.n : this.h;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT < 31 || this.f0 == null) {
            return;
        }
        yf.b0 b0Var = this.c0;
        if (b0Var.c == 0) {
            b0Var.invalidate();
        }
        b0Var.c = i10 | b0Var.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r15.I.getCurrentPosition() == 0 ? r15.n : r15.h) == r15.h) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
    
        if ((r15.I.getCurrentPosition() == 0 ? r15.n : r15.h) == r15.n) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0() {
        ArrayList<Integer> arrayList;
        op0 op0Var;
        if (this.H != null) {
            boolean z10 = this.U;
            boolean z11 = this.a;
            if (z10) {
                if (this.V) {
                }
                np0 np0Var = this.h;
                if (np0Var.h >= 0) {
                    org.telegram.ui.Components.yc.a0(this.H).L(op0.a(this.currentAccount, this.h.h), LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                } else {
                    if (np0Var.s == null) {
                        return;
                    }
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(this.H);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i10 = op0.j;
                    if (!org.telegram.ui.ActionBar.h6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        op0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        op0Var = new op0(tL_peerColorCollectible.gift_emoji_id, intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue);
                    }
                    a02.L(op0Var, LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                }
                this.H = null;
            }
            if (this.V) {
                if (this.U) {
                }
                np0 np0Var2 = this.n;
                if (np0Var2.h >= 0) {
                    org.telegram.ui.Components.yc.a0(this.H).L(op0.c(this.currentAccount, this.n.h), LocaleController.getString(z11 ? R.string.ChannelProfileColorApplied : R.string.UserProfileColorApplied)).j();
                } else if (np0Var2.n != 0) {
                    org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(this.H);
                    TLRPC.Document f7 = org.telegram.ui.Components.q5.f(this.currentAccount, this.n.n);
                    String string = LocaleController.getString(z11 ? R.string.ChannelProfileColorEmojiApplied : R.string.UserProfileColorEmojiApplied);
                    a03.getClass();
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a03.W(), a03.c);
                    boolean isTextColorEmoji = MessageObject.isTextColorEmoji(f7);
                    org.telegram.ui.Components.lj0 lj0Var = ybVar.a;
                    if (isTextColorEmoji) {
                        lj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Hi, false), PorterDuff.Mode.SRC_IN));
                    }
                    ybVar.e(f7, new String[0]);
                    lj0Var.i();
                    ybVar.b.setText(string);
                    ybVar.b.setTextSize(1, 14.0f);
                    ybVar.b.setSingleLine(false);
                    ybVar.b.setMaxLines(3);
                    a03.b(ybVar, 2750).j();
                } else {
                    org.telegram.messenger.f0.p(z11 ? R.string.ChannelProfileColorResetApplied : R.string.UserProfileColorResetApplied, org.telegram.ui.Components.yc.a0(this.H), R.raw.contact_check, 36);
                }
            }
            this.H = null;
        }
    }

    public final void F0() {
        org.telegram.ui.ActionBar.h5 h5Var = this.N;
        if (h5Var != null) {
            h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.A8));
        }
        this.h.g();
        this.n.g();
        vo0 vo0Var = this.e;
        if (vo0Var != null) {
            vo0Var.a = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.a7, vo0Var.b);
            vo0Var.a();
            vo0Var.invalidate();
        }
        G0();
        z0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void G0() {
        if (this.e == null) {
            return;
        }
        A0();
        int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
        if (this.M != null) {
            ci.i1 i1Var = this.I;
            float a2 = w7.q.a(((i1Var == null ? 0.0f : i1Var.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
            org.telegram.ui.Components.rz rzVar = this.M;
            int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.a7));
            int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.z6));
            int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.G6));
            rzVar.a.setColor(d);
            rzVar.b.setColor(d10);
            rzVar.d = d11;
            rzVar.e = d12;
            rzVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        final int i10 = 1;
        setHasOwnBackground(true);
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        k0 k0Var = new k0(this, context, 15);
        this.d = k0Var;
        this.fragmentView = k0Var;
        this.c0 = new yf.b0(context, new po0(this, i11));
        hh.k kVar = new hh.k(this.d);
        k0 k0Var2 = this.d;
        ah.c cVar = this.h0;
        cVar.f = kVar;
        cVar.g = k0Var2;
        this.h = new np0(this, context, 1);
        this.n = new np0(this, context, 0);
        vo0 vo0Var = new vo0(this, context, this.resourceProvider);
        this.e = vo0Var;
        vo0Var.E = true;
        this.n.j(false);
        final int i12 = 2;
        this.n.addView(this.e, 2, w7.y5.e(-1, -2, 55));
        ci.i1 i1Var = new ci.i1(this, context, 4);
        this.I = i1Var;
        i1Var.setAdapter(new wo0(this));
        k0Var.addView(this.I, w7.y5.e(-1, -1, 119));
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.o(true, true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.so0
            public final /* synthetic */ tp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i11;
                tp0 tp0Var = this.b;
                switch (i13) {
                    case 0:
                        tp0Var.y0();
                        break;
                    case 1:
                        if (tp0Var.onBackPressed(true)) {
                            tp0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        tp0 tp0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) tp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tp0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        tp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(tp0Var2, tp0Var2.getParentActivity(), canvas, (tp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tp0Var2.X = kcVar;
                        kcVar.setOnTouchListener(new bi.d(2));
                        tp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(tp0Var2, 2));
                        tp0Var2.Z.addListener(new xo0(tp0Var2, 0));
                        tp0Var2.Z.setDuration(400L);
                        tp0Var2.Z.setInterpolator(org.telegram.ui.Components.lt.e);
                        tp0Var2.Z.start();
                        frameLayout2.addView(tp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ro0(tp0Var2, 0));
                        break;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.y5.c(-1.0f, -1));
        View view = this.O;
        ch.d c10 = this.E.c(view, null, false);
        c10.o(eh.b.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        view.setBackground(c10);
        w7.a6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.addView(this.O, w7.y5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ah.d dVar2 = new ah.d(this.G.c(this.P, null, false));
        dVar2.b(AndroidUtilities.dp(40.0f), true);
        dVar2.q = 220;
        this.P.setBackground(dVar2);
        np0 C0 = C0();
        ci.d dVar3 = this.Q;
        if (dVar3 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n7.z0 z0Var = C0.e;
            dVar3.g((CharSequence) z0Var.b, false, true);
            this.Q.f((SpannableStringBuilder) z0Var.c, false);
        }
        k0Var.addView(this.P, w7.y5.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.L = frameLayout3;
        k0Var.addView(frameLayout3, w7.y5.e(-1, -2, 55));
        boolean z10 = this.a;
        if (z10) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.N = h5Var;
            h5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.y5.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.rz rzVar = new org.telegram.ui.Components.rz(context);
            this.M = rzVar;
            rzVar.setTabs(LocaleController.getString(z10 ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile), LocaleController.getString(z10 ? R.string.ChannelColorTabName : R.string.UserColorTabName));
            this.M.r = new qo0(this, i10);
            G0();
            this.L.addView(this.M, w7.y5.e(-1, 40, 17));
        }
        vo0 vo0Var2 = this.e;
        if (vo0Var2 != null) {
            vo0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i13 = org.telegram.ui.ActionBar.h6.u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i13), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.so0
            public final /* synthetic */ tp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i10;
                tp0 tp0Var = this.b;
                switch (i132) {
                    case 0:
                        tp0Var.y0();
                        break;
                    case 1:
                        if (tp0Var.onBackPressed(true)) {
                            tp0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        tp0 tp0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) tp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        tp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(tp0Var2, tp0Var2.getParentActivity(), canvas, (tp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tp0Var2.X = kcVar;
                        kcVar.setOnTouchListener(new bi.d(2));
                        tp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(tp0Var2, 2));
                        tp0Var2.Z.addListener(new xo0(tp0Var2, 0));
                        tp0Var2.Z.setDuration(400L);
                        tp0Var2.Z.setInterpolator(org.telegram.ui.Components.lt.e);
                        tp0Var2.Z.start();
                        frameLayout22.addView(tp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ro0(tp0Var2, 0));
                        break;
                }
            }
        });
        w7.a6.a(this.J);
        this.L.addView(this.J, w7.y5.e(54, 54, 19));
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = ij0Var;
        ij0Var.h = true;
        if (this.S) {
            ij0Var.M(35);
            this.T.P(36);
        } else {
            ij0Var.P(0);
            this.T.M(0);
        }
        this.T.Z = true;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J9, false);
        this.T.Q(w02, "Sunny");
        this.T.Q(w02, "Path 6");
        this.T.Q(w02, "Path");
        this.T.Q(w02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        this.K.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i13), 1, -1));
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.so0
            public final /* synthetic */ tp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i12;
                tp0 tp0Var = this.b;
                switch (i132) {
                    case 0:
                        tp0Var.y0();
                        break;
                    case 1:
                        if (tp0Var.onBackPressed(true)) {
                            tp0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        tp0 tp0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) tp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        tp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(tp0Var2, tp0Var2.getParentActivity(), canvas, (tp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tp0Var2.X = kcVar;
                        kcVar.setOnTouchListener(new bi.d(2));
                        tp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(tp0Var2, 2));
                        tp0Var2.Z.addListener(new xo0(tp0Var2, 0));
                        tp0Var2.Z.setDuration(400L);
                        tp0Var2.Z.setInterpolator(org.telegram.ui.Components.lt.e);
                        tp0Var2.Z.start();
                        frameLayout22.addView(tp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ro0(tp0Var2, 0));
                        break;
                }
            }
        });
        this.L.addView(this.K, w7.y5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        vo0 vo0Var3 = this.e;
        vo0Var3.getClass();
        vo0Var3.a = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.a7, vo0Var3.b);
        vo0Var3.a();
        vo0Var3.invalidate();
        z0();
        this.d.addView(this.c0);
        A0();
        View view2 = this.fragmentView;
        po0 po0Var = new po0(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(view2, po0Var);
        return this.d;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            this.h.f(true);
            this.n.f(true);
        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
            this.h.e();
            this.n.e();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            this.h.e();
            this.n.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.c;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        return w7.b6.a(new e(this, 27), org.telegram.ui.ActionBar.h6.d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.z6, org.telegram.ui.ActionBar.h6.i6, org.telegram.ui.ActionBar.h6.a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.p7, org.telegram.ui.ActionBar.h6.f6, org.telegram.ui.ActionBar.h6.g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        vo0 vo0Var = this.e;
        return vo0Var == null ? super.isLightStatusBar() : i0.a.f(vo0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.a;
        if (z11 || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.onBackPressed(z10);
        }
        if (z10 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(z11 ? R.string.ChannelColorUnsaved : R.string.UserColorUnsaved);
            alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.ChannelColorUnsavedMessage : R.string.UserColorUnsavedMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new po0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new po0(this, 3));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            showDialog(a2Var);
            ((TextView) a2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starGiftsLoaded);
        setBulletinDelegate(new ci.a9(11));
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void setResourceProvider(org.telegram.ui.ActionBar.d6 d6Var) {
        this.s = d6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r3 != (r8 instanceof org.telegram.tgnet.TLRPC.TL_peerColorCollectible ? r8.collectible_id : 0)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        if ((r3 == null ? 0 : r3.collectible_id) != org.telegram.messenger.UserObject.getProfileCollectibleId(r0)) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [org.telegram.tgnet.TLRPC$TL_emojiStatusEmpty] */
    /* JADX WARN: Type inference failed for: r3v15, types: [org.telegram.tgnet.TLRPC$EmojiStatus] */
    /* JADX WARN: Type inference failed for: r3v16, types: [org.telegram.tgnet.TLRPC$TL_inputEmojiStatusCollectible] */
    /* JADX WARN: Type inference failed for: r4v38, types: [org.telegram.messenger.MessagesController] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0() {
        if (this.W) {
            return;
        }
        boolean z10 = this.a;
        if (z10 || getUserConfig().isPremium()) {
            if (z10) {
                finishFragment();
            } else {
                TLRPC.User currentUser = getUserConfig().getCurrentUser();
                if (currentUser.color == null) {
                    TLRPC.TL_peerColor tL_peerColor = new TLRPC.TL_peerColor();
                    currentUser.color = tL_peerColor;
                    tL_peerColor.flags |= 1;
                    tL_peerColor.color = (int) (currentUser.id % 7);
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
                if (this.h.h == UserObject.getColorId(currentUser) && this.h.n == UserObject.getEmojiId(currentUser)) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    long j3 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
                    TLRPC.PeerColor peerColor = currentUser.color;
                }
                this.U = true;
                TL_account.updateColor updatecolor = new TL_account.updateColor();
                currentUser.flags2 |= 256;
                currentUser.color.flags |= 1;
                if (this.h.s != null) {
                    updatecolor.flags |= 4;
                    TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible = new TLRPC.TL_inputPeerColorCollectible();
                    updatecolor.color = tL_inputPeerColorCollectible;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.h.s;
                    tL_inputPeerColorCollectible.collectible_id = tL_peerColorCollectible2.collectible_id;
                    currentUser.color = tL_peerColorCollectible2;
                } else {
                    updatecolor.flags |= 4;
                    TLRPC.TL_peerColor tL_peerColor2 = new TLRPC.TL_peerColor();
                    updatecolor.color = tL_peerColor2;
                    tL_peerColor2.flags |= 1;
                    np0 np0Var = this.h;
                    int i10 = np0Var.h;
                    tL_peerColor2.color = i10;
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    int i11 = peerColor2.flags;
                    int i12 = i11 | 1;
                    peerColor2.flags = i12;
                    peerColor2.color = i10;
                    long j10 = np0Var.n;
                    if (j10 != 0) {
                        updatecolor.flags |= 1;
                        peerColor2.flags = i11 | 3;
                        tL_peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j10;
                        tL_peerColor2.background_emoji_id = j10;
                    } else {
                        peerColor2.flags = i12 & (-3);
                        peerColor2.background_emoji_id = 0L;
                    }
                }
                getConnectionsManager().sendRequest(updatecolor, null);
                if (this.n.h == UserObject.getProfileColorId(currentUser) && this.n.n == UserObject.getOnlyProfileEmojiId(currentUser)) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.n.r;
                }
                this.V = true;
                if (currentUser.profile_color == null) {
                    currentUser.profile_color = new TLRPC.TL_peerColor();
                }
                TL_account.updateColor updatecolor2 = new TL_account.updateColor();
                updatecolor2.for_profile = true;
                currentUser.flags2 |= 512;
                if (this.n.h < 0) {
                    currentUser.profile_color.flags &= -2;
                } else {
                    if (updatecolor2.color == null) {
                        updatecolor2.flags |= 4;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor3 = updatecolor2.color;
                    peerColor3.flags |= 1;
                    int i13 = this.n.h;
                    peerColor3.color = i13;
                    TLRPC.PeerColor peerColor4 = currentUser.profile_color;
                    peerColor4.flags |= 1;
                    peerColor4.color = i13;
                }
                if (this.n.n != 0) {
                    int i14 = updatecolor2.flags;
                    updatecolor2.flags = i14 | 1;
                    currentUser.profile_color.flags |= 2;
                    if (updatecolor2.color == null) {
                        updatecolor2.flags = i14 | 5;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor5 = updatecolor2.color;
                    peerColor5.flags |= 2;
                    TLRPC.PeerColor peerColor6 = currentUser.profile_color;
                    long j11 = this.n.n;
                    peerColor6.background_emoji_id = j11;
                    peerColor5.background_emoji_id = j11;
                } else {
                    TLRPC.PeerColor peerColor7 = currentUser.profile_color;
                    peerColor7.flags &= -3;
                    peerColor7.background_emoji_id = 0L;
                }
                getConnectionsManager().sendRequest(updatecolor2, null);
                if (!B0(currentUser.emoji_status, this.n.r) && (this.n.r != null || DialogObject.isEmojiStatusCollectible(currentUser.emoji_status))) {
                    ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.n.r;
                    if (tL_emojiStatusCollectible2 != null) {
                        long j12 = tL_emojiStatusCollectible2.collectible_id;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= this.n.l0.size()) {
                                break;
                            }
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.n.l0.get(i15);
                            if (tL_starGiftUnique2.id == j12) {
                                tL_starGiftUnique = tL_starGiftUnique2;
                                break;
                            }
                            i15++;
                        }
                    }
                    if (tL_starGiftUnique != null) {
                        tL_emojiStatusEmpty = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_emojiStatusEmpty.collectible_id = tL_starGiftUnique.id;
                    }
                    getMessagesController().updateEmojiStatus(0L, tL_emojiStatusEmpty, tL_starGiftUnique);
                }
                getMessagesController().putUser(currentUser, false);
                getUserConfig().saveConfig(true);
                finishFragment();
                E0();
            }
            this.W = true;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
        }
    }

    public final void y0() {
        if (this.r) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) this, 23, true));
            return;
        }
        np0 C0 = C0();
        if (C0.I == null) {
            np0 np0Var = this.h;
            if (C0 == np0Var) {
                np0Var = this.n;
            }
            if (np0Var.I != null) {
                np0Var.d();
            }
            x0();
            finishFragment();
            E0();
            return;
        }
        np0 np0Var2 = this.h;
        if (C0 == np0Var2) {
            np0Var2 = this.n;
        }
        np0Var2.d();
        this.r = true;
        this.Q.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
        qo0 qo0Var = new qo0(this, 0);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        zf.b bVar = tL_starGiftUnique.resale_ton_only ? zf.b.b : zf.b.a;
        yh.t5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new to0(this, bVar, tL_starGiftUnique, clientUserId, qo0Var));
    }

    public final void z0() {
        this.y.a(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.w.invalidate();
        this.h.x.invalidate();
        this.n.w.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((ch.d) this.O.getBackground()).v();
        A0();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((ch.d) it.next()).v();
        }
    }
}
