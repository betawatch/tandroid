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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class wp0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final ah.c E;
    public final fh.c F;
    public final ah.c G;
    public org.telegram.ui.ActionBar.n2 H;
    public ci.i1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.tz M;
    public org.telegram.ui.ActionBar.i5 N;
    public FrameLayout O;
    public FrameLayout P;
    public ci.d Q;
    public qp0 R;
    public boolean S;
    public org.telegram.ui.Components.kj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public mc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean a;
    public boolean a0;
    public final yh.l5 b;
    public i0.b b0;
    public final yh.l5 c;
    public final pe.b c0;
    public k0 d;
    public final pe.b d0;
    public yo0 e;
    public final int f;
    public qp0 h;
    public qp0 n;
    public boolean r;
    public org.telegram.ui.ActionBar.d6 s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.e5 w;
    public final org.telegram.ui.ActionBar.e5 x;
    public final fh.c y;

    public wp0() {
        super(null);
        this.f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
        this.S = q6;
        this.a0 = q6;
        this.b0 = i0.b.e;
        pe.b bVar = new pe.b();
        this.c0 = bVar;
        pe.b bVar2 = new pe.b();
        this.d0 = bVar2;
        fh.c cVar = new fh.c();
        this.y = cVar;
        ah.c cVar2 = new ah.c(cVar);
        this.E = cVar2;
        fh.c cVar3 = new fh.c();
        this.F = cVar3;
        ah.c cVar4 = new ah.c(cVar3);
        this.G = cVar4;
        cVar2.e = bVar;
        cVar2.d = bVar2;
        cVar4.e = bVar;
        cVar4.d = bVar2;
        this.a = false;
        yh.u5.y(this.currentAccount, false).V();
        yh.l5 l5Var = new yh.l5(this.currentAccount, 0L, false);
        this.b = l5Var;
        l5Var.f(8, false);
        l5Var.a();
        yh.l5 l5Var2 = new yh.l5(this.currentAccount, 0L, false);
        this.c = l5Var2;
        l5Var2.f(8, false);
        l5Var2.f = true;
        l5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.w = new org.telegram.ui.ActionBar.e5(0, false, false, this.resourceProvider);
        this.x = new org.telegram.ui.ActionBar.e5(0, false, true, this.resourceProvider);
    }

    public static boolean B0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static void S(wp0 wp0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, to0 to0Var, yh.b3 b3Var, nf.e eVar) {
        zArr[0] = true;
        eVar.d();
        yh.u5.x(wp0Var.currentAccount, b3Var.a).h(b3Var.b, tL_starGiftUnique, j3, null, true, new ai.m0(18, eVar, to0Var));
    }

    public static void T(wp0 wp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, to0 to0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.b3 b3Var = new yh.b3(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        yh.d3 d3Var = new yh.d3(wp0Var.getParentActivity(), wp0Var.resourceProvider, tL_starGiftUnique, b3Var, wp0Var.currentAccount, j3, org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2), false, new vo0(wp0Var, zArr, tL_starGiftUnique, j3, to0Var, 0));
        d3Var.h.setOnDismissListener(new ei.f0(10, zArr, to0Var));
        d3Var.b();
    }

    public static int w0(int i10) {
        return org.telegram.ui.ActionBar.i6.b(0.5f, (AndroidUtilities.computePerceivedBrightness(i10) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i10);
    }

    public final void A0() {
        int d = ((double) AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.i6.d6))) > 0.72d ? i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.i6.a7), this.e.getColor()) : getThemedColor(org.telegram.ui.ActionBar.i6.a7);
        this.d.setBackgroundColor(d);
        fh.c cVar = this.F;
        if (cVar.b != d) {
            cVar.a(d);
            Iterator it = this.d0.iterator();
            while (it.hasNext()) {
                ((ch.d) it.next()).k();
            }
            Iterator it2 = this.c0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final qp0 C0() {
        ci.i1 i1Var = this.I;
        return (i1Var == null || i1Var.getPositionAnimated() < 0.5f) ? this.n : this.h;
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
    public final void D0() {
        ArrayList<Integer> arrayList;
        rp0 rp0Var;
        if (this.H != null) {
            boolean z10 = this.U;
            boolean z11 = this.a;
            if (z10) {
                if (this.V) {
                }
                qp0 qp0Var = this.h;
                if (qp0Var.h >= 0) {
                    org.telegram.ui.Components.yc.a0(this.H).L(rp0.a(this.currentAccount, this.h.h), LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                } else {
                    if (qp0Var.s == null) {
                        return;
                    }
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(this.H);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i10 = rp0.j;
                    if (!org.telegram.ui.ActionBar.i6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        rp0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        rp0Var = new rp0(tL_peerColorCollectible.gift_emoji_id, intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue);
                    }
                    a02.L(rp0Var, LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                }
                this.H = null;
            }
            if (this.V) {
                if (this.U) {
                }
                qp0 qp0Var2 = this.n;
                if (qp0Var2.h >= 0) {
                    org.telegram.ui.Components.yc.a0(this.H).L(rp0.c(this.currentAccount, this.n.h), LocaleController.getString(z11 ? R.string.ChannelProfileColorApplied : R.string.UserProfileColorApplied)).j();
                } else if (qp0Var2.n != 0) {
                    org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(this.H);
                    TLRPC.Document f7 = org.telegram.ui.Components.q5.f(this.currentAccount, this.n.n);
                    String string = LocaleController.getString(z11 ? R.string.ChannelProfileColorEmojiApplied : R.string.UserProfileColorEmojiApplied);
                    a03.getClass();
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(a03.W(), a03.c);
                    boolean isTextColorEmoji = MessageObject.isTextColorEmoji(f7);
                    org.telegram.ui.Components.nj0 nj0Var = zbVar.a;
                    if (isTextColorEmoji) {
                        nj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
                    }
                    zbVar.e(f7, new String[0]);
                    nj0Var.i();
                    zbVar.b.setText(string);
                    zbVar.b.setTextSize(1, 14.0f);
                    zbVar.b.setSingleLine(false);
                    zbVar.b.setMaxLines(3);
                    a03.b(zbVar, 2750).j();
                } else {
                    org.telegram.messenger.q.p(z11 ? R.string.ChannelProfileColorResetApplied : R.string.UserProfileColorResetApplied, org.telegram.ui.Components.yc.a0(this.H), R.raw.contact_check, 36);
                }
            }
            this.H = null;
        }
    }

    public final void E0() {
        org.telegram.ui.ActionBar.i5 i5Var = this.N;
        if (i5Var != null) {
            i5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.A8));
        }
        this.h.g();
        this.n.g();
        yo0 yo0Var = this.e;
        if (yo0Var != null) {
            yo0Var.a = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.a7, yo0Var.b);
            yo0Var.a();
            yo0Var.invalidate();
        }
        F0();
        z0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void F0() {
        if (this.e == null) {
            return;
        }
        A0();
        int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
        if (this.M != null) {
            ci.i1 i1Var = this.I;
            float a2 = w7.q.a(((i1Var == null ? 0.0f : i1Var.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
            org.telegram.ui.Components.tz tzVar = this.M;
            int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.i6.a7));
            int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.i6.z6));
            int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.i6.G6));
            tzVar.a.setColor(d);
            tzVar.b.setColor(d10);
            tzVar.d = d11;
            tzVar.e = d12;
            tzVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        this.h = new qp0(this, context, 1);
        this.n = new qp0(this, context, 0);
        yo0 yo0Var = new yo0(this, context, this.resourceProvider);
        this.e = yo0Var;
        yo0Var.E = true;
        this.n.j(false);
        final int i12 = 2;
        this.n.addView(this.e, 2, w7.z5.e(-1, -2, 55));
        ci.i1 i1Var = new ci.i1(this, context, 4);
        this.I = i1Var;
        i1Var.setAdapter(new zo0(this));
        k0Var.addView(this.I, w7.z5.e(-1, -1, 119));
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.o(true, true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wo0
            public final /* synthetic */ wp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                wp0 wp0Var = this.b;
                switch (i13) {
                    case 0:
                        if (wp0Var.onBackPressed(true)) {
                            wp0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        wp0 wp0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) wp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        wp0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        wp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        wp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(wp0Var2, wp0Var2.getParentActivity(), canvas, (wp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (wp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        wp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new bi.d(2));
                        wp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        wp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.tb(wp0Var2, 2));
                        wp0Var2.Z.addListener(new ap0(wp0Var2, 0));
                        wp0Var2.Z.setDuration(400L);
                        wp0Var2.Z.setInterpolator(org.telegram.ui.Components.nt.e);
                        wp0Var2.Z.start();
                        frameLayout2.addView(wp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new nl0(wp0Var2, 10));
                        break;
                    default:
                        wp0Var.y0();
                        break;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.z5.c(-1.0f, -1));
        View view = this.O;
        ch.d c10 = this.E.c(view, null, false);
        c10.w(eh.b.j(this.resourceProvider));
        c10.y(AndroidUtilities.dp(28.0f));
        c10.x(AndroidUtilities.dp(5.0f));
        view.setBackground(c10);
        w7.b6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.addView(this.O, w7.z5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ah.e eVar = new ah.e(this.G.c(this.P, null, false));
        eVar.b(AndroidUtilities.dp(40.0f), true);
        eVar.q = 220;
        this.P.setBackground(eVar);
        qp0 C0 = C0();
        ci.d dVar2 = this.Q;
        if (dVar2 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n7.z0 z0Var = C0.e;
            dVar2.g((CharSequence) z0Var.b, false, true);
            this.Q.f((SpannableStringBuilder) z0Var.c, false);
        }
        k0Var.addView(this.P, w7.z5.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.L = frameLayout3;
        k0Var.addView(frameLayout3, w7.z5.e(-1, -2, 55));
        boolean z10 = this.a;
        if (z10) {
            org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
            this.N = i5Var;
            i5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.z5.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context);
            this.M = tzVar;
            tzVar.setTabs(LocaleController.getString(z10 ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile), LocaleController.getString(z10 ? R.string.ChannelColorTabName : R.string.UserColorTabName));
            this.M.r = new to0(this, i11);
            F0();
            this.L.addView(this.M, w7.z5.e(-1, 40, 17));
        }
        yo0 yo0Var2 = this.e;
        if (yo0Var2 != null) {
            yo0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i13 = org.telegram.ui.ActionBar.i6.u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i13), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wo0
            public final /* synthetic */ wp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i11;
                wp0 wp0Var = this.b;
                switch (i132) {
                    case 0:
                        if (wp0Var.onBackPressed(true)) {
                            wp0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        wp0 wp0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) wp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        wp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        wp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        wp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(wp0Var2, wp0Var2.getParentActivity(), canvas, (wp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (wp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        wp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new bi.d(2));
                        wp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        wp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.tb(wp0Var2, 2));
                        wp0Var2.Z.addListener(new ap0(wp0Var2, 0));
                        wp0Var2.Z.setDuration(400L);
                        wp0Var2.Z.setInterpolator(org.telegram.ui.Components.nt.e);
                        wp0Var2.Z.start();
                        frameLayout22.addView(wp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new nl0(wp0Var2, 10));
                        break;
                    default:
                        wp0Var.y0();
                        break;
                }
            }
        });
        w7.b6.a(this.J);
        this.L.addView(this.J, w7.z5.e(54, 54, 19));
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = kj0Var;
        kj0Var.h = true;
        if (this.S) {
            kj0Var.M(35);
            this.T.P(36);
        } else {
            kj0Var.P(0);
            this.T.M(0);
        }
        this.T.Z = true;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J9, false);
        this.T.Q(w02, "Sunny");
        this.T.Q(w02, "Path 6");
        this.T.Q(w02, "Path");
        this.T.Q(w02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        this.K.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i13), 1, -1));
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wo0
            public final /* synthetic */ wp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i10;
                wp0 wp0Var = this.b;
                switch (i132) {
                    case 0:
                        if (wp0Var.onBackPressed(true)) {
                            wp0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        wp0 wp0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) wp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        wp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        wp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        wp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(wp0Var2, wp0Var2.getParentActivity(), canvas, (wp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (wp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        wp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new bi.d(2));
                        wp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        wp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.tb(wp0Var2, 2));
                        wp0Var2.Z.addListener(new ap0(wp0Var2, 0));
                        wp0Var2.Z.setDuration(400L);
                        wp0Var2.Z.setInterpolator(org.telegram.ui.Components.nt.e);
                        wp0Var2.Z.start();
                        frameLayout22.addView(wp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new nl0(wp0Var2, 10));
                        break;
                    default:
                        wp0Var.y0();
                        break;
                }
            }
        });
        this.L.addView(this.K, w7.z5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        yo0 yo0Var3 = this.e;
        yo0Var3.getClass();
        yo0Var3.a = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.a7, yo0Var3.b);
        yo0Var3.a();
        yo0Var3.invalidate();
        z0();
        A0();
        View view2 = this.fragmentView;
        xo0 xo0Var = new xo0(this, i11);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(view2, xo0Var);
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.c;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 27), org.telegram.ui.ActionBar.i6.d6, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.z6, org.telegram.ui.ActionBar.i6.i6, org.telegram.ui.ActionBar.i6.a7, org.telegram.ui.ActionBar.i6.B6, org.telegram.ui.ActionBar.i6.p7, org.telegram.ui.ActionBar.i6.f6, org.telegram.ui.ActionBar.i6.g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        yo0 yo0Var = this.e;
        return yo0Var == null ? super.isLightStatusBar() : i0.a.f(yo0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.a;
        if (z11 || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.onBackPressed(z10);
        }
        if (z10 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(z11 ? R.string.ChannelColorUnsaved : R.string.UserColorUnsaved);
            alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.ChannelColorUnsavedMessage : R.string.UserColorUnsavedMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new xo0(this, 1));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new xo0(this, 2));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            showDialog(b2Var);
            ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.q7));
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starGiftsLoaded);
        setBulletinDelegate(new ci.z8(11));
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.n2
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
                    qp0 qp0Var = this.h;
                    int i10 = qp0Var.h;
                    tL_peerColor2.color = i10;
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    int i11 = peerColor2.flags;
                    int i12 = i11 | 1;
                    peerColor2.flags = i12;
                    peerColor2.color = i10;
                    long j10 = qp0Var.n;
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
                D0();
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
            showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) this, 23, true));
            return;
        }
        qp0 C0 = C0();
        if (C0.I == null) {
            qp0 qp0Var = this.h;
            if (C0 == qp0Var) {
                qp0Var = this.n;
            }
            if (qp0Var.I != null) {
                qp0Var.d();
            }
            x0();
            finishFragment();
            D0();
            return;
        }
        qp0 qp0Var2 = this.h;
        if (C0 == qp0Var2) {
            qp0Var2 = this.n;
        }
        qp0Var2.d();
        this.r = true;
        this.Q.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
        to0 to0Var = new to0(this, 1);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        zf.b bVar = tL_starGiftUnique.resale_ton_only ? zf.b.b : zf.b.a;
        yh.u5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new uo0(this, bVar, tL_starGiftUnique, clientUserId, to0Var));
    }

    public final void z0() {
        this.y.a(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.w.invalidate();
        this.h.x.invalidate();
        this.n.w.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((ch.d) this.O.getBackground()).k();
        A0();
        Iterator it = this.d0.iterator();
        while (it.hasNext()) {
            ((ch.d) it.next()).k();
        }
    }
}
