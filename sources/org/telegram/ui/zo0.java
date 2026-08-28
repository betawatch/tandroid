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
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zo0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public ImageView A;
    public ImageView B;
    public FrameLayout C;
    public org.telegram.ui.Components.cz D;
    public org.telegram.ui.ActionBar.h5 E;
    public boolean F;
    public org.telegram.ui.Components.mi0 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public gc K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public final boolean a;
    public final gh.n7 b;
    public final gh.n7 c;
    public m0 d;
    public fo0 e;
    public uo0 f;
    public uo0 h;
    public boolean n;
    public org.telegram.ui.ActionBar.b6 r;
    public final SparseIntArray s;
    public final org.telegram.ui.ActionBar.d5 v;
    public final org.telegram.ui.ActionBar.d5 w;
    public org.telegram.ui.ActionBar.o2 x;
    public kh.j1 y;

    public zo0() {
        super(null);
        this.s = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.f6.I.q();
        this.F = q10;
        this.N = q10;
        this.a = false;
        gh.v7.y(this.currentAccount, false).V();
        gh.n7 n7Var = new gh.n7(this.currentAccount, 0L, false);
        this.b = n7Var;
        n7Var.f(8, false);
        n7Var.a();
        gh.n7 n7Var2 = new gh.n7(this.currentAccount, 0L, false);
        this.c = n7Var2;
        n7Var2.f(8, false);
        n7Var2.f = true;
        n7Var2.a();
        this.resourceProvider = new g(this, 29);
        this.v = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.w = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
    }

    public static void T(zo0 zo0Var, gf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, eb0 eb0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        gh.m4 m4Var = new gh.m4(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        gh.o4 o4Var = new gh.o4(zo0Var.getParentActivity(), zo0Var.resourceProvider, tL_starGiftUnique, m4Var, zo0Var.currentAccount, j10, j3.r0.n(tL_starGiftUnique.num, ',', sb2), false, new gh.v2(zo0Var, zArr, tL_starGiftUnique, j10, eb0Var, 1));
        o4Var.h.setOnDismissListener(new bg.j(12, zArr, eb0Var));
        o4Var.b();
    }

    public static void U(zo0 zo0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, eb0 eb0Var, gh.m4 m4Var, ve.d dVar) {
        zArr[0] = true;
        dVar.d();
        gh.v7.x(zo0Var.currentAccount, m4Var.a).h(m4Var.b, tL_starGiftUnique, j10, null, true, new bg.y0(24, dVar, eb0Var));
    }

    public static int t0(int i9) {
        return org.telegram.ui.ActionBar.f6.b(0.5f, (AndroidUtilities.computePerceivedBrightness(i9) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i9) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i9);
    }

    public static boolean w0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        final int i9 = 1;
        this.f = new uo0(this, context, 1);
        final int i10 = 0;
        this.h = new uo0(this, context, 0);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        m0 m0Var = new m0(this, context, 15);
        m0Var.setFitsSystemWindows(true);
        this.e = new fo0(this, context, this.resourceProvider);
        this.h.i(false);
        m0Var.addView(this.e, g7.e6.e(-1, -2, 55));
        kh.j1 j1Var = new kh.j1(this, context, 4);
        this.y = j1Var;
        j1Var.setAdapter(new go0(this));
        m0Var.addView(this.y, g7.e6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.C = frameLayout;
        m0Var.addView(frameLayout, g7.e6.e(-1, -2, 55));
        boolean z10 = this.a;
        if (z10) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.E = h5Var;
            h5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.E.setEllipsizeByGradient(true);
            this.E.setTextSize(20);
            this.E.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.A8));
            this.E.setTypeface(AndroidUtilities.bold());
            this.C.addView(this.E, g7.e6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.cz czVar = new org.telegram.ui.Components.cz(context);
            this.D = czVar;
            czVar.setTabs(LocaleController.getString(z10 ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile), LocaleController.getString(z10 ? R.string.ChannelColorTabName : R.string.UserColorTabName));
            org.telegram.ui.Components.cz czVar2 = this.D;
            czVar2.f = new w3(this, 12);
            this.C.addView(czVar2, g7.e6.e(-1, 40, 17));
        }
        fo0 fo0Var = this.e;
        if (fo0Var != null) {
            fo0Var.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.A = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.A;
        int i11 = org.telegram.ui.ActionBar.f6.u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i11), 1, -1));
        this.A.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.A;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.A.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.do0
            public final /* synthetic */ zo0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        zo0 zo0Var = this.b;
                        if (zo0Var.onBackPressed(true)) {
                            zo0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        zo0 zo0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) zo0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        zo0Var2.B.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        zo0Var2.B.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        zo0Var2.B.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gc gcVar = new gc(zo0Var2, zo0Var2.getParentActivity(), canvas, (zo0Var2.B.getMeasuredWidth() / 2.0f) + f10, (zo0Var2.B.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        zo0Var2.K = gcVar;
                        gcVar.setOnTouchListener(new jh.d(2));
                        zo0Var2.L = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        zo0Var2.M = ofFloat;
                        ofFloat.addUpdateListener(new kh.fb(zo0Var2, 2));
                        zo0Var2.M.addListener(new bc0(zo0Var2, 5));
                        zo0Var2.M.setDuration(400L);
                        zo0Var2.M.setInterpolator(org.telegram.ui.Components.xs.e);
                        zo0Var2.M.start();
                        frameLayout2.addView(zo0Var2.K, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new zk0(zo0Var2, 10));
                        break;
                }
            }
        });
        this.C.addView(this.A, g7.e6.e(54, 54, 19));
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(R.raw.sun, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.G = mi0Var;
        mi0Var.h = true;
        if (this.F) {
            mi0Var.K(35);
            this.G.N(36);
        } else {
            mi0Var.N(0);
            this.G.K(0);
        }
        this.G.W = true;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J9, false);
        this.G.O(w02, "Sunny");
        this.G.O(w02, "Path 6");
        this.G.O(w02, "Path");
        this.G.O(w02, "Path 5");
        this.G.m();
        ImageView imageView4 = new ImageView(context);
        this.B = imageView4;
        imageView4.setScaleType(scaleType);
        this.B.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i11), 1, -1));
        this.B.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.B.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.do0
            public final /* synthetic */ zo0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        zo0 zo0Var = this.b;
                        if (zo0Var.onBackPressed(true)) {
                            zo0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        zo0 zo0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) zo0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        zo0Var2.B.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        zo0Var2.B.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        zo0Var2.B.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gc gcVar = new gc(zo0Var2, zo0Var2.getParentActivity(), canvas, (zo0Var2.B.getMeasuredWidth() / 2.0f) + f10, (zo0Var2.B.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        zo0Var2.K = gcVar;
                        gcVar.setOnTouchListener(new jh.d(2));
                        zo0Var2.L = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        zo0Var2.M = ofFloat;
                        ofFloat.addUpdateListener(new kh.fb(zo0Var2, 2));
                        zo0Var2.M.addListener(new bc0(zo0Var2, 5));
                        zo0Var2.M.setDuration(400L);
                        zo0Var2.M.setInterpolator(org.telegram.ui.Components.xs.e);
                        zo0Var2.M.start();
                        frameLayout2.addView(zo0Var2.K, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new zk0(zo0Var2, 10));
                        break;
                }
            }
        });
        this.C.addView(this.B, g7.e6.e(54, 54, 21));
        this.B.setImageDrawable(this.G);
        fo0 fo0Var2 = this.e;
        fo0Var2.getClass();
        fo0Var2.a = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, fo0Var2.b);
        fo0Var2.a();
        fo0Var2.invalidate();
        this.d = m0Var;
        this.fragmentView = m0Var;
        return m0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i10 != this.currentAccount) {
            return;
        }
        if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
            this.f.f();
            this.h.f();
        } else if (i9 == NotificationCenter.starUserGiftsLoaded) {
            this.f.e();
            this.h.e();
        } else if (i9 == NotificationCenter.starGiftsLoaded) {
            this.f.e();
            this.h.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return g7.h6.a(new e(this, 27), org.telegram.ui.ActionBar.f6.d6, org.telegram.ui.ActionBar.f6.G6, org.telegram.ui.ActionBar.f6.z6, org.telegram.ui.ActionBar.f6.i6, org.telegram.ui.ActionBar.f6.a7, org.telegram.ui.ActionBar.f6.B6, org.telegram.ui.ActionBar.f6.p7, org.telegram.ui.ActionBar.f6.f6, org.telegram.ui.ActionBar.f6.g6, org.telegram.ui.ActionBar.f6.O6, org.telegram.ui.ActionBar.f6.P6, org.telegram.ui.ActionBar.f6.Q6, org.telegram.ui.ActionBar.f6.R6);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        fo0 fo0Var = this.e;
        return fo0Var == null ? super.isLightStatusBar() : i0.a.f(fo0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.f.b() || this.h.b()) && getUserConfig().isPremium())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.a;
        if (z11 || !((this.f.b() || this.h.b()) && getUserConfig().isPremium())) {
            return super.onBackPressed(z10);
        }
        if (z10 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.N = LocaleController.getString(z11 ? R.string.ChannelColorUnsaved : R.string.UserColorUnsaved);
            alertDialog$Builder.a.P = LocaleController.getString(z11 ? R.string.ChannelColorUnsavedMessage : R.string.UserColorUnsavedMessage);
            final int i9 = 0;
            alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.eo0
                public final /* synthetic */ zo0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (i9) {
                        case 0:
                            this.b.finishFragment();
                            break;
                        default:
                            this.b.v0();
                            break;
                    }
                }
            });
            final int i10 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.eo0
                public final /* synthetic */ zo0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i102) {
                    switch (i10) {
                        case 0:
                            this.b.finishFragment();
                            break;
                        default:
                            this.b.v0();
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            showDialog(c2Var);
            ((TextView) c2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.q7));
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starGiftsLoaded);
        setBulletinDelegate(new bg.z(15));
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setResourceProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.r = b6Var;
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
    public final void u0() {
        if (this.J) {
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
                if (this.f.n == UserObject.getColorId(currentUser) && this.f.r == UserObject.getEmojiId(currentUser)) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.f.v;
                    long j10 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
                    TLRPC.PeerColor peerColor = currentUser.color;
                }
                this.H = true;
                TL_account.updateColor updatecolor = new TL_account.updateColor();
                currentUser.flags2 |= 256;
                currentUser.color.flags |= 1;
                if (this.f.v != null) {
                    updatecolor.flags |= 4;
                    TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible = new TLRPC.TL_inputPeerColorCollectible();
                    updatecolor.color = tL_inputPeerColorCollectible;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.f.v;
                    tL_inputPeerColorCollectible.collectible_id = tL_peerColorCollectible2.collectible_id;
                    currentUser.color = tL_peerColorCollectible2;
                } else {
                    updatecolor.flags |= 4;
                    TLRPC.TL_peerColor tL_peerColor2 = new TLRPC.TL_peerColor();
                    updatecolor.color = tL_peerColor2;
                    tL_peerColor2.flags |= 1;
                    uo0 uo0Var = this.f;
                    int i9 = uo0Var.n;
                    tL_peerColor2.color = i9;
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    int i10 = peerColor2.flags;
                    int i11 = i10 | 1;
                    peerColor2.flags = i11;
                    peerColor2.color = i9;
                    long j11 = uo0Var.r;
                    if (j11 != 0) {
                        updatecolor.flags |= 1;
                        peerColor2.flags = i10 | 3;
                        tL_peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j11;
                        tL_peerColor2.background_emoji_id = j11;
                    } else {
                        peerColor2.flags = i11 & (-3);
                        peerColor2.background_emoji_id = 0L;
                    }
                }
                getConnectionsManager().sendRequest(updatecolor, null);
                if (this.h.n == UserObject.getProfileColorId(currentUser) && this.h.r == UserObject.getOnlyProfileEmojiId(currentUser)) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.h.s;
                }
                this.I = true;
                if (currentUser.profile_color == null) {
                    currentUser.profile_color = new TLRPC.TL_peerColor();
                }
                TL_account.updateColor updatecolor2 = new TL_account.updateColor();
                updatecolor2.for_profile = true;
                currentUser.flags2 |= 512;
                if (this.h.n < 0) {
                    currentUser.profile_color.flags &= -2;
                } else {
                    if (updatecolor2.color == null) {
                        updatecolor2.flags |= 4;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor3 = updatecolor2.color;
                    peerColor3.flags |= 1;
                    int i12 = this.h.n;
                    peerColor3.color = i12;
                    TLRPC.PeerColor peerColor4 = currentUser.profile_color;
                    peerColor4.flags |= 1;
                    peerColor4.color = i12;
                }
                if (this.h.r != 0) {
                    int i13 = updatecolor2.flags;
                    updatecolor2.flags = i13 | 1;
                    currentUser.profile_color.flags |= 2;
                    if (updatecolor2.color == null) {
                        updatecolor2.flags = i13 | 5;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor5 = updatecolor2.color;
                    peerColor5.flags |= 2;
                    TLRPC.PeerColor peerColor6 = currentUser.profile_color;
                    long j12 = this.h.r;
                    peerColor6.background_emoji_id = j12;
                    peerColor5.background_emoji_id = j12;
                } else {
                    TLRPC.PeerColor peerColor7 = currentUser.profile_color;
                    peerColor7.flags &= -3;
                    peerColor7.background_emoji_id = 0L;
                }
                getConnectionsManager().sendRequest(updatecolor2, null);
                if (!w0(currentUser.emoji_status, this.h.s) && (this.h.s != null || DialogObject.isEmojiStatusCollectible(currentUser.emoji_status))) {
                    ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.h.s;
                    if (tL_emojiStatusCollectible2 != null) {
                        long j13 = tL_emojiStatusCollectible2.collectible_id;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= this.h.b0.size()) {
                                break;
                            }
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.h.b0.get(i14);
                            if (tL_starGiftUnique2.id == j13) {
                                tL_starGiftUnique = tL_starGiftUnique2;
                                break;
                            }
                            i14++;
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
                x0();
            }
            this.J = true;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
        }
    }

    public final void v0() {
        if (this.n) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) this, 23, true));
            return;
        }
        uo0 uo0Var = this.y.getCurrentPosition() == 1 ? this.f : this.h;
        if (uo0Var.y == null) {
            uo0 uo0Var2 = this.y.getCurrentPosition() == 1 ? this.h : this.f;
            if (uo0Var2.y != null) {
                uo0Var2.d();
            }
            u0();
            finishFragment();
            x0();
            return;
        }
        (this.y.getCurrentPosition() == 1 ? this.h : this.f).d();
        this.n = true;
        uo0Var.f.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = uo0Var.y;
        eb0 eb0Var = new eb0(6, this, uo0Var);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        gf.b bVar = tL_starGiftUnique.resale_ton_only ? gf.b.b : gf.b.a;
        gh.v7.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new fh.v5(this, bVar, tL_starGiftUnique, clientUserId, eb0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r15.y.getCurrentPosition() == 0 ? r15.h : r15.f) == r15.f) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
    
        if ((r15.y.getCurrentPosition() == 0 ? r15.h : r15.f) == r15.h) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0() {
        ArrayList<Integer> arrayList;
        vo0 vo0Var;
        if (this.x != null) {
            boolean z10 = this.H;
            boolean z11 = this.a;
            if (z10) {
                if (this.I) {
                }
                uo0 uo0Var = this.f;
                if (uo0Var.n >= 0) {
                    org.telegram.ui.Components.oc.a0(this.x).L(vo0.a(this.currentAccount, this.f.n), LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                } else {
                    if (uo0Var.v == null) {
                        return;
                    }
                    org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(this.x);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.f.v;
                    int i9 = vo0.j;
                    if (!org.telegram.ui.ActionBar.f6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        vo0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        vo0Var = new vo0(tL_peerColorCollectible.gift_emoji_id, intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue);
                    }
                    a02.L(vo0Var, LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                }
                this.x = null;
            }
            if (this.I) {
                if (this.H) {
                }
                uo0 uo0Var2 = this.h;
                if (uo0Var2.n >= 0) {
                    org.telegram.ui.Components.oc.a0(this.x).L(vo0.c(this.currentAccount, this.h.n), LocaleController.getString(z11 ? R.string.ChannelProfileColorApplied : R.string.UserProfileColorApplied)).j();
                } else if (uo0Var2.r != 0) {
                    org.telegram.ui.Components.oc a03 = org.telegram.ui.Components.oc.a0(this.x);
                    TLRPC.Document f10 = org.telegram.ui.Components.k5.f(this.currentAccount, this.h.r);
                    String string = LocaleController.getString(z11 ? R.string.ChannelProfileColorEmojiApplied : R.string.UserProfileColorEmojiApplied);
                    a03.getClass();
                    org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(a03.W(), a03.c);
                    boolean isTextColorEmoji = MessageObject.isTextColorEmoji(f10);
                    org.telegram.ui.Components.pi0 pi0Var = obVar.a;
                    if (isTextColorEmoji) {
                        pi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Hi, false), PorterDuff.Mode.SRC_IN));
                    }
                    obVar.e(f10, new String[0]);
                    pi0Var.i();
                    obVar.b.setText(string);
                    obVar.b.setTextSize(1, 14.0f);
                    obVar.b.setSingleLine(false);
                    obVar.b.setMaxLines(3);
                    a03.b(obVar, 2750).j();
                } else {
                    org.telegram.messenger.l0.p(z11 ? R.string.ChannelProfileColorResetApplied : R.string.UserProfileColorResetApplied, org.telegram.ui.Components.oc.a0(this.x), R.raw.contact_check, 36);
                }
            }
            this.x = null;
        }
    }

    public final void y0() {
        this.d.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.a7));
        org.telegram.ui.ActionBar.h5 h5Var = this.E;
        if (h5Var != null) {
            h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.A8));
        }
        this.f.g();
        this.h.g();
        fo0 fo0Var = this.e;
        if (fo0Var != null) {
            fo0Var.a = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, fo0Var.b);
            fo0Var.a();
            fo0Var.invalidate();
        }
        setNavigationBarColor(getNavigationBarColor());
    }
}
