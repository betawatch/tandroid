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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yo0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public ImageView A;
    public ImageView B;
    public FrameLayout C;
    public org.telegram.ui.Components.lz D;
    public org.telegram.ui.ActionBar.h5 E;
    public boolean F;
    public org.telegram.ui.Components.xi0 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public fc K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public final boolean a;
    public final jh.k7 b;
    public final jh.k7 c;
    public n0 d;
    public eo0 e;
    public to0 f;
    public to0 h;
    public boolean n;
    public org.telegram.ui.ActionBar.c6 r;
    public final SparseIntArray s;
    public final org.telegram.ui.ActionBar.d5 v;
    public final org.telegram.ui.ActionBar.d5 w;
    public org.telegram.ui.ActionBar.o2 x;
    public nh.g1 y;

    public yo0() {
        super(null);
        this.s = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
        this.F = q6;
        this.N = q6;
        this.a = false;
        jh.s7.y(this.currentAccount, false).V();
        jh.k7 k7Var = new jh.k7(this.currentAccount, 0L, false);
        this.b = k7Var;
        k7Var.f(8, false);
        k7Var.a();
        jh.k7 k7Var2 = new jh.k7(this.currentAccount, 0L, false);
        this.c = k7Var2;
        k7Var2.f(8, false);
        k7Var2.f = true;
        k7Var2.a();
        this.resourceProvider = new h(this, 29);
        this.v = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.w = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
    }

    public static void U(yo0 yo0Var, kf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm tmVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        jh.j4 j4Var = new jh.j4(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        jh.l4 l4Var = new jh.l4(yo0Var.getParentActivity(), yo0Var.resourceProvider, tL_starGiftUnique, j4Var, yo0Var.currentAccount, j10, j7.l1.m(tL_starGiftUnique.num, ',', sb2), false, new jh.t2(yo0Var, zArr, tL_starGiftUnique, j10, tmVar, 1));
        l4Var.h.setOnDismissListener(new eg.g(9, zArr, tmVar));
        l4Var.b();
    }

    public static void V(yo0 yo0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm tmVar, jh.j4 j4Var, ye.c cVar) {
        zArr[0] = true;
        cVar.d();
        jh.s7.x(yo0Var.currentAccount, j4Var.a).h(j4Var.b, tL_starGiftUnique, j10, null, true, new bh.v(24, cVar, tmVar));
    }

    public static int u0(int i10) {
        return org.telegram.ui.ActionBar.g6.b(0.5f, (AndroidUtilities.computePerceivedBrightness(i10) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i10) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i10);
    }

    public static boolean x0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        final int i10 = 1;
        this.f = new to0(this, context, 1);
        final int i11 = 0;
        this.h = new to0(this, context, 0);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        n0 n0Var = new n0(this, context, 15);
        n0Var.setFitsSystemWindows(true);
        this.e = new eo0(this, context, this.resourceProvider);
        this.h.i(false);
        n0Var.addView(this.e, i7.f6.e(-1, -2, 55));
        nh.g1 g1Var = new nh.g1(this, context, 3);
        this.y = g1Var;
        g1Var.setAdapter(new fo0(this));
        n0Var.addView(this.y, i7.f6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.C = frameLayout;
        n0Var.addView(frameLayout, i7.f6.e(-1, -2, 55));
        boolean z10 = this.a;
        if (z10) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.E = h5Var;
            h5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.E.setEllipsizeByGradient(true);
            this.E.setTextSize(20);
            this.E.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
            this.E.setTypeface(AndroidUtilities.bold());
            this.C.addView(this.E, i7.f6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context);
            this.D = lzVar;
            lzVar.setTabs(LocaleController.getString(z10 ? R.string.ChannelColorTabProfile : R.string.UserColorTabProfile), LocaleController.getString(z10 ? R.string.ChannelColorTabName : R.string.UserColorTabName));
            org.telegram.ui.Components.lz lzVar2 = this.D;
            lzVar2.f = new x3(this, 12);
            this.C.addView(lzVar2, i7.f6.e(-1, 40, 17));
        }
        eo0 eo0Var = this.e;
        if (eo0Var != null) {
            eo0Var.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.A = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.A;
        int i12 = org.telegram.ui.ActionBar.g6.u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i12), 1, -1));
        this.A.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.A;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.A.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.co0
            public final /* synthetic */ yo0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        yo0 yo0Var = this.b;
                        if (yo0Var.onBackPressed(true)) {
                            yo0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        yo0 yo0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) yo0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        yo0Var2.B.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        yo0Var2.B.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        yo0Var2.B.getLocationInWindow(iArr);
                        float f9 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fc fcVar = new fc(yo0Var2, yo0Var2.getParentActivity(), canvas, (yo0Var2.B.getMeasuredWidth() / 2.0f) + f9, (yo0Var2.B.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f9, f10, 1);
                        yo0Var2.K = fcVar;
                        fcVar.setOnTouchListener(new mh.d(2));
                        yo0Var2.L = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        yo0Var2.M = ofFloat;
                        ofFloat.addUpdateListener(new nh.qa(yo0Var2, 2));
                        yo0Var2.M.addListener(new e50(yo0Var2, 7));
                        yo0Var2.M.setDuration(400L);
                        yo0Var2.M.setInterpolator(org.telegram.ui.Components.ct.e);
                        yo0Var2.M.start();
                        frameLayout2.addView(yo0Var2.K, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new vk0(yo0Var2, 10));
                        break;
                }
            }
        });
        this.C.addView(this.A, i7.f6.e(54, 54, 19));
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.G = xi0Var;
        xi0Var.h = true;
        if (this.F) {
            xi0Var.K(35);
            this.G.N(36);
        } else {
            xi0Var.N(0);
            this.G.K(0);
        }
        this.G.W = true;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J9, false);
        this.G.O(w02, "Sunny");
        this.G.O(w02, "Path 6");
        this.G.O(w02, "Path");
        this.G.O(w02, "Path 5");
        this.G.m();
        ImageView imageView4 = new ImageView(context);
        this.B = imageView4;
        imageView4.setScaleType(scaleType);
        this.B.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i12), 1, -1));
        this.B.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.B.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.co0
            public final /* synthetic */ yo0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        yo0 yo0Var = this.b;
                        if (yo0Var.onBackPressed(true)) {
                            yo0Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        yo0 yo0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) yo0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        yo0Var2.B.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        yo0Var2.B.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        yo0Var2.B.getLocationInWindow(iArr);
                        float f9 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fc fcVar = new fc(yo0Var2, yo0Var2.getParentActivity(), canvas, (yo0Var2.B.getMeasuredWidth() / 2.0f) + f9, (yo0Var2.B.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f9, f10, 1);
                        yo0Var2.K = fcVar;
                        fcVar.setOnTouchListener(new mh.d(2));
                        yo0Var2.L = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        yo0Var2.M = ofFloat;
                        ofFloat.addUpdateListener(new nh.qa(yo0Var2, 2));
                        yo0Var2.M.addListener(new e50(yo0Var2, 7));
                        yo0Var2.M.setDuration(400L);
                        yo0Var2.M.setInterpolator(org.telegram.ui.Components.ct.e);
                        yo0Var2.M.start();
                        frameLayout2.addView(yo0Var2.K, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new vk0(yo0Var2, 10));
                        break;
                }
            }
        });
        this.C.addView(this.B, i7.f6.e(54, 54, 21));
        this.B.setImageDrawable(this.G);
        eo0 eo0Var2 = this.e;
        eo0Var2.getClass();
        eo0Var2.a = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s8, eo0Var2.b);
        eo0Var2.a();
        eo0Var2.invalidate();
        this.d = n0Var;
        this.fragmentView = n0Var;
        return n0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            this.f.f();
            this.h.f();
        } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
            this.f.e();
            this.h.e();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            this.f.e();
            this.h.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return i7.i6.a(new f(this, 27), org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.z6, org.telegram.ui.ActionBar.g6.i6, org.telegram.ui.ActionBar.g6.a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.p7, org.telegram.ui.ActionBar.g6.f6, org.telegram.ui.ActionBar.g6.g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        eo0 eo0Var = this.e;
        return eo0Var == null ? super.isLightStatusBar() : i0.a.f(eo0Var.getColor()) > 0.699999988079071d;
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
            final int i10 = 0;
            alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.do0
                public final /* synthetic */ yo0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.finishFragment();
                            break;
                        default:
                            this.b.w0();
                            break;
                    }
                }
            });
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.do0
                public final /* synthetic */ yo0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.finishFragment();
                            break;
                        default:
                            this.b.w0();
                            break;
                    }
                }
            });
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            showDialog(c2Var);
            ((TextView) c2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
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
        setBulletinDelegate(new eg.x(13));
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.r = c6Var;
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
    public final void v0() {
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
                    to0 to0Var = this.f;
                    int i10 = to0Var.n;
                    tL_peerColor2.color = i10;
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    int i11 = peerColor2.flags;
                    int i12 = i11 | 1;
                    peerColor2.flags = i12;
                    peerColor2.color = i10;
                    long j11 = to0Var.r;
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
                    int i13 = this.h.n;
                    peerColor3.color = i13;
                    TLRPC.PeerColor peerColor4 = currentUser.profile_color;
                    peerColor4.flags |= 1;
                    peerColor4.color = i13;
                }
                if (this.h.r != 0) {
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
                    long j12 = this.h.r;
                    peerColor6.background_emoji_id = j12;
                    peerColor5.background_emoji_id = j12;
                } else {
                    TLRPC.PeerColor peerColor7 = currentUser.profile_color;
                    peerColor7.flags &= -3;
                    peerColor7.background_emoji_id = 0L;
                }
                getConnectionsManager().sendRequest(updatecolor2, null);
                if (!x0(currentUser.emoji_status, this.h.s) && (this.h.s != null || DialogObject.isEmojiStatusCollectible(currentUser.emoji_status))) {
                    ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.h.s;
                    if (tL_emojiStatusCollectible2 != null) {
                        long j13 = tL_emojiStatusCollectible2.collectible_id;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= this.h.b0.size()) {
                                break;
                            }
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.h.b0.get(i15);
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
                y0();
            }
            this.J = true;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
        }
    }

    public final void w0() {
        if (this.n) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) this, 23, true));
            return;
        }
        to0 to0Var = this.y.getCurrentPosition() == 1 ? this.f : this.h;
        if (to0Var.y == null) {
            to0 to0Var2 = this.y.getCurrentPosition() == 1 ? this.h : this.f;
            if (to0Var2.y != null) {
                to0Var2.d();
            }
            v0();
            finishFragment();
            y0();
            return;
        }
        (this.y.getCurrentPosition() == 1 ? this.h : this.f).d();
        this.n = true;
        to0Var.f.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = to0Var.y;
        tm tmVar = new tm(29, this, to0Var);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        kf.b bVar = tL_starGiftUnique.resale_ton_only ? kf.b.b : kf.b.a;
        jh.s7.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new ih.h5(this, bVar, tL_starGiftUnique, clientUserId, tmVar));
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
    public final void y0() {
        ArrayList<Integer> arrayList;
        uo0 uo0Var;
        if (this.x != null) {
            boolean z10 = this.H;
            boolean z11 = this.a;
            if (z10) {
                if (this.I) {
                }
                to0 to0Var = this.f;
                if (to0Var.n >= 0) {
                    org.telegram.ui.Components.tc.a0(this.x).L(uo0.a(this.currentAccount, this.f.n), LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                } else {
                    if (to0Var.v == null) {
                        return;
                    }
                    org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(this.x);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.f.v;
                    int i10 = uo0.j;
                    if (!org.telegram.ui.ActionBar.g6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        uo0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        uo0Var = new uo0(tL_peerColorCollectible.gift_emoji_id, intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue);
                    }
                    a02.L(uo0Var, LocaleController.getString(z11 ? R.string.ChannelColorApplied : R.string.UserColorApplied)).j();
                }
                this.x = null;
            }
            if (this.I) {
                if (this.H) {
                }
                to0 to0Var2 = this.h;
                if (to0Var2.n >= 0) {
                    org.telegram.ui.Components.tc.a0(this.x).L(uo0.c(this.currentAccount, this.h.n), LocaleController.getString(z11 ? R.string.ChannelProfileColorApplied : R.string.UserProfileColorApplied)).j();
                } else if (to0Var2.r != 0) {
                    org.telegram.ui.Components.tc a03 = org.telegram.ui.Components.tc.a0(this.x);
                    TLRPC.Document f9 = org.telegram.ui.Components.p5.f(this.currentAccount, this.h.r);
                    String string = LocaleController.getString(z11 ? R.string.ChannelProfileColorEmojiApplied : R.string.UserProfileColorEmojiApplied);
                    a03.getClass();
                    org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(a03.W(), a03.c);
                    boolean isTextColorEmoji = MessageObject.isTextColorEmoji(f9);
                    org.telegram.ui.Components.aj0 aj0Var = ubVar.a;
                    if (isTextColorEmoji) {
                        aj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
                    }
                    ubVar.e(f9, new String[0]);
                    aj0Var.i();
                    ubVar.b.setText(string);
                    ubVar.b.setTextSize(1, 14.0f);
                    ubVar.b.setSingleLine(false);
                    ubVar.b.setMaxLines(3);
                    a03.b(ubVar, 2750).j();
                } else {
                    j7.l1.v(z11 ? R.string.ChannelProfileColorResetApplied : R.string.UserProfileColorResetApplied, org.telegram.ui.Components.tc.a0(this.x), R.raw.contact_check, 36);
                }
            }
            this.x = null;
        }
    }

    public final void z0() {
        this.d.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        org.telegram.ui.ActionBar.h5 h5Var = this.E;
        if (h5Var != null) {
            h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
        }
        this.f.g();
        this.h.g();
        eo0 eo0Var = this.e;
        if (eo0Var != null) {
            eo0Var.a = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s8, eo0Var.b);
            eo0Var.a();
            eo0Var.invalidate();
        }
        setNavigationBarColor(getNavigationBarColor());
    }
}
