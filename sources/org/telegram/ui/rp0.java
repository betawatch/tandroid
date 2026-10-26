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
import org.telegram.messenger.FileLog;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rp0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final ch.b E;
    public final hh.c F;
    public final ch.b G;
    public org.telegram.ui.ActionBar.r2 H;
    public fi.h1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.zz M;
    public org.telegram.ui.ActionBar.b6 N;
    public FrameLayout O;
    public FrameLayout P;
    public fi.d Q;
    public lp0 R;
    public boolean S;
    public org.telegram.ui.Components.xj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public mc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean a;
    public boolean a0;
    public final bi.t9 b;
    public i0.b b0;
    public final bi.t9 c;
    public final se.b c0;
    public k0 d;
    public final se.b d0;
    public uo0 e;
    public final int f;
    public lp0 h;
    public lp0 n;
    public boolean r;
    public org.telegram.ui.ActionBar.u6 s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.l5 w;
    public final org.telegram.ui.ActionBar.l5 x;
    public final hh.c y;

    public rp0() {
        super(null);
        this.f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
        this.S = q5;
        this.a0 = q5;
        this.b0 = i0.b.e;
        se.b bVar = new se.b();
        this.c0 = bVar;
        se.b bVar2 = new se.b();
        this.d0 = bVar2;
        hh.c cVar = new hh.c();
        this.y = cVar;
        ch.b bVar3 = new ch.b(cVar);
        this.E = bVar3;
        hh.c cVar2 = new hh.c();
        this.F = cVar2;
        ch.b bVar4 = new ch.b(cVar2);
        this.G = bVar4;
        bVar3.e = bVar;
        bVar3.d = bVar2;
        bVar4.e = bVar;
        bVar4.d = bVar2;
        this.a = false;
        bi.ca.y(this.currentAccount, false).V();
        bi.t9 t9Var = new bi.t9(this.currentAccount, 0L, false);
        this.b = t9Var;
        t9Var.g(8, false);
        t9Var.b();
        bi.t9 t9Var2 = new bi.t9(this.currentAccount, 0L, false);
        this.c = t9Var2;
        t9Var2.g(8, false);
        t9Var2.f = true;
        t9Var2.b();
        this.resourceProvider = new xj(this, 1);
        this.w = new org.telegram.ui.ActionBar.l5(0, false, false, this.resourceProvider);
        this.x = new org.telegram.ui.ActionBar.l5(0, false, true, this.resourceProvider);
    }

    public static boolean C0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static void V(rp0 rp0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, qo0 qo0Var, bi.d6 d6Var, qf.c cVar) {
        zArr[0] = true;
        cVar.d();
        bi.ca.x(rp0Var.currentAccount, d6Var.a).h(d6Var.b, tL_starGiftUnique, j10, null, true, new bi.m5(21, cVar, qo0Var));
    }

    public static void W(rp0 rp0Var, bg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, qo0 qo0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        bi.d6 d6Var = new bi.d6(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        bi.g6 g6Var = new bi.g6(rp0Var.getParentActivity(), rp0Var.resourceProvider, tL_starGiftUnique, d6Var, rp0Var.currentAccount, j10, org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2), false, new bi.w3(rp0Var, zArr, tL_starGiftUnique, j10, qo0Var, 1));
        g6Var.h.setOnDismissListener(new bi.u3(12, zArr, qo0Var));
        g6Var.b();
    }

    public static int x0(int i10) {
        return org.telegram.ui.ActionBar.y6.b(0.5f, (AndroidUtilities.computePerceivedBrightness(i10) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i10);
    }

    public final void A0() {
        this.y.a(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.w.invalidate();
        this.h.x.invalidate();
        this.n.w.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((eh.d) this.O.getBackground()).updateColors();
        B0();
        Iterator it = this.d0.iterator();
        while (it.hasNext()) {
            ((eh.d) it.next()).updateColors();
        }
    }

    public final void B0() {
        int f7 = ((double) AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.y6.d6))) > 0.72d ? i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.y6.a7), this.e.getColor()) : getThemedColor(org.telegram.ui.ActionBar.y6.a7);
        this.d.setBackgroundColor(f7);
        hh.c cVar = this.F;
        if (cVar.b != f7) {
            cVar.a(f7);
            Iterator it = this.d0.iterator();
            while (it.hasNext()) {
                ((eh.d) it.next()).updateColors();
            }
            Iterator it2 = this.c0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final lp0 D0() {
        fi.h1 h1Var = this.I;
        return (h1Var == null || h1Var.getPositionAnimated() < 0.5f) ? this.n : this.h;
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
        mp0 mp0Var;
        if (this.H != null) {
            boolean z10 = this.U;
            boolean z11 = this.a;
            if (z10) {
                if (this.V) {
                }
                lp0 lp0Var = this.h;
                if (lp0Var.h >= 0) {
                    org.telegram.ui.Components.wc.b0(this.H).L(mp0.a(this.currentAccount, this.h.h), LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                } else {
                    if (lp0Var.s == null) {
                        return;
                    }
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(this.H);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i10 = mp0.j;
                    if (!org.telegram.ui.ActionBar.y6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        mp0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        mp0Var = new mp0(tL_peerColorCollectible.gift_emoji_id, intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue);
                    }
                    b02.L(mp0Var, LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                }
                this.H = null;
            }
            if (this.V) {
                if (this.U) {
                }
                lp0 lp0Var2 = this.n;
                if (lp0Var2.h >= 0) {
                    org.telegram.ui.Components.wc.b0(this.H).L(mp0.c(this.currentAccount, this.n.h), LocaleController.getString(z11 ? R.string.ChannelProfileColorApplied : R.string.UserProfileColorApplied)).j();
                } else if (lp0Var2.n != 0) {
                    org.telegram.ui.Components.wc b03 = org.telegram.ui.Components.wc.b0(this.H);
                    TLRPC.Document f7 = org.telegram.ui.Components.t5.f(this.currentAccount, this.n.n);
                    String string = LocaleController.getString(z11 ? R.string.ChannelProfileColorEmojiApplied : R.string.UserProfileColorEmojiApplied);
                    b03.getClass();
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(b03.X(), b03.c);
                    boolean isTextColorEmoji = MessageObject.isTextColorEmoji(f7);
                    org.telegram.ui.Components.ak0 ak0Var = ybVar.a;
                    if (isTextColorEmoji) {
                        org.telegram.ui.ActionBar.f7.t(ak0Var, org.telegram.ui.ActionBar.y6.Hi, null, PorterDuff.Mode.SRC_IN);
                    }
                    ybVar.e(f7, new String[0]);
                    ak0Var.i();
                    ybVar.b.setText(string);
                    ybVar.b.setTextSize(1, 14.0f);
                    ybVar.b.setSingleLine(false);
                    ybVar.b.setMaxLines(3);
                    b03.b(ybVar, 2750).j();
                } else {
                    org.telegram.messenger.t.q(z11 ? R.string.ChannelProfileColorResetApplied : R.string.UserProfileColorResetApplied, org.telegram.ui.Components.wc.b0(this.H), R.raw.contact_check, 36);
                }
            }
            this.H = null;
        }
    }

    public final void F0() {
        org.telegram.ui.ActionBar.b6 b6Var = this.N;
        if (b6Var != null) {
            b6Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.A8));
        }
        this.h.g();
        this.n.g();
        uo0 uo0Var = this.e;
        if (uo0Var != null) {
            uo0Var.a = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, uo0Var.b);
            uo0Var.a();
            uo0Var.invalidate();
        }
        G0();
        A0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void G0() {
        if (this.e == null) {
            return;
        }
        B0();
        int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
        if (this.M != null) {
            fi.h1 h1Var = this.I;
            float a2 = a8.ee.a(((h1Var == null ? 0.0f : h1Var.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
            org.telegram.ui.Components.zz zzVar = this.M;
            int f7 = i0.a.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            int f10 = i0.a.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.y6.a7));
            int f11 = i0.a.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.y6.z6));
            int f12 = i0.a.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.y6.G6));
            zzVar.a.setColor(f7);
            zzVar.b.setColor(f10);
            zzVar.d = f11;
            zzVar.e = f12;
            zzVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        final int i10 = 1;
        setHasOwnBackground(true);
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        k0 k0Var = new k0(this, context, 16);
        this.d = k0Var;
        this.fragmentView = k0Var;
        this.h = new lp0(this, context, 1);
        this.n = new lp0(this, context, 0);
        uo0 uo0Var = new uo0(this, context, this.resourceProvider);
        this.e = uo0Var;
        uo0Var.E = true;
        this.n.j(false);
        final int i12 = 2;
        this.n.addView(this.e, 2, org.telegram.ui.Components.gb1.i(-1, -2, 55));
        fi.h1 h1Var = new fi.h1(this, context, 5);
        this.I = h1Var;
        h1Var.setAdapter(new vo0(this, i11));
        k0Var.addView(this.I, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.f();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.so0
            public final /* synthetic */ rp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                rp0 rp0Var = this.b;
                switch (i13) {
                    case 0:
                        if (rp0Var.onBackPressed(true)) {
                            rp0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        rp0 rp0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) rp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rp0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        rp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        rp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(rp0Var2, rp0Var2.getParentActivity(), canvas, (rp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (rp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        rp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new ei.d(2));
                        rp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        rp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.bb(rp0Var2, 2));
                        rp0Var2.Z.addListener(new i50(rp0Var2, 8));
                        rp0Var2.Z.setDuration(400L);
                        rp0Var2.Z.setInterpolator(org.telegram.ui.Components.ut.e);
                        rp0Var2.Z.start();
                        frameLayout2.addView(rp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new lj0(rp0Var2, 12));
                        break;
                    default:
                        rp0Var.z0();
                        break;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        View view = this.O;
        eh.d c10 = this.E.c(view, null, false);
        c10.v(gh.c.j(this.resourceProvider));
        c10.x(AndroidUtilities.dp(28.0f));
        c10.w(AndroidUtilities.dp(5.0f));
        view.setBackground(c10);
        org.telegram.ui.Components.gb1.c(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.addView(this.O, org.telegram.ui.Components.gb1.h(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ch.c cVar = new ch.c(this.G.c(this.P, null, false));
        cVar.b(AndroidUtilities.dp(40.0f), true);
        cVar.G = 220;
        this.P.setBackground(cVar);
        lp0 D0 = D0();
        fi.d dVar2 = this.Q;
        if (dVar2 != null && D0 != null && D0 != this.R) {
            this.R = D0;
            m4.c cVar2 = D0.e;
            dVar2.i((CharSequence) cVar2.b, false, true);
            this.Q.g((SpannableStringBuilder) cVar2.c, false);
        }
        k0Var.addView(this.P, org.telegram.ui.Components.gb1.i(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.L = frameLayout3;
        k0Var.addView(frameLayout3, org.telegram.ui.Components.gb1.i(-1, -2, 55));
        boolean z10 = this.a;
        if (z10) {
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
            this.N = b6Var;
            b6Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            org.telegram.ui.ActionBar.f7.Y(this.N, org.telegram.ui.ActionBar.y6.A8, getResourceProvider());
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, org.telegram.ui.Components.gb1.h(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context);
            this.M = zzVar;
            zzVar.setTabs(LocaleController.getString(z10 ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile), LocaleController.getString(z10 ? R.string.ChannelColorTabName : R.string.UserColorTabName));
            this.M.r = new qo0(this, i11);
            G0();
            this.L.addView(this.M, org.telegram.ui.Components.gb1.i(-1, 40, 17));
        }
        uo0 uo0Var2 = this.e;
        if (uo0Var2 != null) {
            uo0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i13 = org.telegram.ui.ActionBar.y6.u8;
        org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i13), getResourceProvider());
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.so0
            public final /* synthetic */ rp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i11;
                rp0 rp0Var = this.b;
                switch (i132) {
                    case 0:
                        if (rp0Var.onBackPressed(true)) {
                            rp0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        rp0 rp0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) rp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        rp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        rp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(rp0Var2, rp0Var2.getParentActivity(), canvas, (rp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (rp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        rp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new ei.d(2));
                        rp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        rp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.bb(rp0Var2, 2));
                        rp0Var2.Z.addListener(new i50(rp0Var2, 8));
                        rp0Var2.Z.setDuration(400L);
                        rp0Var2.Z.setInterpolator(org.telegram.ui.Components.ut.e);
                        rp0Var2.Z.start();
                        frameLayout22.addView(rp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new lj0(rp0Var2, 12));
                        break;
                    default:
                        rp0Var.z0();
                        break;
                }
            }
        });
        org.telegram.ui.Components.gb1.b(this.J);
        this.L.addView(this.J, org.telegram.ui.Components.gb1.i(54, 54, 19));
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = xj0Var;
        xj0Var.h = true;
        if (this.S) {
            xj0Var.M(35);
            this.T.P(36);
        } else {
            xj0Var.P(0);
            this.T.M(0);
        }
        this.T.Z = true;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J9, false);
        this.T.Q(x02, "Sunny");
        this.T.Q(x02, "Path 6");
        this.T.Q(x02, "Path");
        this.T.Q(x02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.f7.R(this.K, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i13), getResourceProvider());
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.so0
            public final /* synthetic */ rp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i10;
                rp0 rp0Var = this.b;
                switch (i132) {
                    case 0:
                        if (rp0Var.onBackPressed(true)) {
                            rp0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        rp0 rp0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) rp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        rp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        rp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(rp0Var2, rp0Var2.getParentActivity(), canvas, (rp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (rp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        rp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new ei.d(2));
                        rp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        rp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.bb(rp0Var2, 2));
                        rp0Var2.Z.addListener(new i50(rp0Var2, 8));
                        rp0Var2.Z.setDuration(400L);
                        rp0Var2.Z.setInterpolator(org.telegram.ui.Components.ut.e);
                        rp0Var2.Z.start();
                        frameLayout22.addView(rp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new lj0(rp0Var2, 12));
                        break;
                    default:
                        rp0Var.z0();
                        break;
                }
            }
        });
        this.L.addView(this.K, org.telegram.ui.Components.gb1.i(54, 54, 21));
        this.K.setImageDrawable(this.T);
        uo0 uo0Var3 = this.e;
        uo0Var3.getClass();
        uo0Var3.a = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, uo0Var3.b);
        uo0Var3.a();
        uo0Var3.invalidate();
        A0();
        B0();
        View view2 = this.fragmentView;
        to0 to0Var = new to0(this, i11);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view2, to0Var);
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

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.e4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.e4.c;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        return org.telegram.ui.Components.gb1.C(new j6(16, this), org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.z6, org.telegram.ui.ActionBar.y6.i6, org.telegram.ui.ActionBar.y6.a7, org.telegram.ui.ActionBar.y6.B6, org.telegram.ui.ActionBar.y6.p7, org.telegram.ui.ActionBar.y6.f6, org.telegram.ui.ActionBar.y6.g6, org.telegram.ui.ActionBar.y6.O6, org.telegram.ui.ActionBar.y6.P6, org.telegram.ui.ActionBar.y6.Q6, org.telegram.ui.ActionBar.y6.R6);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        uo0 uo0Var = this.e;
        return uo0Var == null ? super.isLightStatusBar() : i0.a.h(uo0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.a;
        if (z11 || !((this.h.b() || this.n.b()) && getUserConfig().isPremium())) {
            return super.onBackPressed(z10);
        }
        if (z10 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(z11 ? R.string.ChannelColorUnsaved : R.string.UserColorUnsaved);
            alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.ChannelColorUnsavedMessage : R.string.UserColorUnsavedMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new to0(this, 1));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new to0(this, 2));
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            showDialog(e2Var);
            org.telegram.ui.ActionBar.f7.V((TextView) e2Var.d(-2), org.telegram.ui.ActionBar.y6.q7, getResourceProvider());
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starGiftsLoaded);
        setBulletinDelegate(new fi.k8(10));
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            if (this.h == null || this.n == null) {
                return;
            }
            F0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void setResourceProvider(org.telegram.ui.ActionBar.u6 u6Var) {
        this.s = u6Var;
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
    public final void y0() {
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
                    long j10 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
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
                    lp0 lp0Var = this.h;
                    int i10 = lp0Var.h;
                    tL_peerColor2.color = i10;
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    int i11 = peerColor2.flags;
                    int i12 = i11 | 1;
                    peerColor2.flags = i12;
                    peerColor2.color = i10;
                    long j11 = lp0Var.n;
                    if (j11 != 0) {
                        updatecolor.flags |= 1;
                        peerColor2.flags = i11 | 3;
                        tL_peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j11;
                        tL_peerColor2.background_emoji_id = j11;
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
                    long j12 = this.n.n;
                    peerColor6.background_emoji_id = j12;
                    peerColor5.background_emoji_id = j12;
                } else {
                    TLRPC.PeerColor peerColor7 = currentUser.profile_color;
                    peerColor7.flags &= -3;
                    peerColor7.background_emoji_id = 0L;
                }
                getConnectionsManager().sendRequest(updatecolor2, null);
                if (!C0(currentUser.emoji_status, this.n.r) && (this.n.r != null || DialogObject.isEmojiStatusCollectible(currentUser.emoji_status))) {
                    ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.n.r;
                    if (tL_emojiStatusCollectible2 != null) {
                        long j13 = tL_emojiStatusCollectible2.collectible_id;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= this.n.l0.size()) {
                                break;
                            }
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.n.l0.get(i15);
                            if (tL_starGiftUnique2.id == j13) {
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

    public final void z0() {
        if (this.r) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) this, 23, true));
            return;
        }
        lp0 D0 = D0();
        if (D0.I == null) {
            lp0 lp0Var = this.h;
            if (D0 == lp0Var) {
                lp0Var = this.n;
            }
            if (lp0Var.I != null) {
                lp0Var.d();
            }
            y0();
            finishFragment();
            E0();
            return;
        }
        lp0 lp0Var2 = this.h;
        if (D0 == lp0Var2) {
            lp0Var2 = this.n;
        }
        lp0Var2.d();
        this.r = true;
        this.Q.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = D0.I;
        qo0 qo0Var = new qo0(this, 1);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        bg.b bVar = tL_starGiftUnique.resale_ton_only ? bg.b.b : bg.b.a;
        bi.ca.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new ro0(this, bVar, tL_starGiftUnique, clientUserId, qo0Var));
    }
}
