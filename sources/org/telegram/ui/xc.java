package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class xc extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper A;
    public TLRPC.WallPaper B;
    public TLRPC.WallPaper C;
    public Drawable D;
    public SpannableStringBuilder E;
    public boolean F;
    public org.telegram.ui.Components.mi0 G;
    public org.telegram.ui.ActionBar.w0 H;
    public org.telegram.ui.Components.wk0 I;
    public ic J;
    public FrameLayout K;
    public kh.d L;
    public fc M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long a;
    public int a0;
    public int b;
    public int b0;
    public TL_stories.TL_premium_boostsStatus c;
    public int c0;
    public boolean d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g0;
    public long h;
    public org.telegram.ui.ActionBar.o2 h0;
    public gc i0;
    public float j0;
    public ValueAnimator k0;
    public boolean l0;
    public org.telegram.ui.ActionBar.b6 m0;
    public long n;
    public final SparseIntArray n0;
    public final org.telegram.ui.ActionBar.d5 o0;
    public final org.telegram.ui.ActionBar.d5 p0;
    public final org.telegram.ui.ActionBar.d5 q0;
    public int r;
    public final org.telegram.ui.ActionBar.d5 r0;
    public int s;
    public final Drawable s0;
    public final Drawable t0;
    public final Paint u0;
    public long v;
    public long w;
    public TLRPC.EmojiStatus x;
    public TLRPC.EmojiStatus y;

    public xc(long j10) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.f6.I.q();
        this.F = q10;
        this.N = 0;
        this.l0 = q10;
        this.n0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.u0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, this.resourceProvider));
        this.s0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.t0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new ih.a2(1, this, chat));
        this.resourceProvider = new wc(this);
        this.o0 = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.p0 = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
        this.q0 = new org.telegram.ui.ActionBar.d5(0, true, false, this.resourceProvider);
        this.r0 = new org.telegram.ui.ActionBar.d5(0, true, true, this.resourceProvider);
    }

    public static void T(xc xcVar) {
        org.telegram.ui.ActionBar.b6 b6Var = xcVar.resourceProvider;
        if (b6Var instanceof wc) {
            xc xcVar2 = ((wc) b6Var).a;
            xcVar2.F = !xcVar2.F;
            xcVar2.d1();
            xcVar2.Z0(false);
        } else {
            xcVar.F = !xcVar.F;
            xcVar.d1();
        }
        xcVar.U0(xcVar.F, true);
        xcVar.Z0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(xc xcVar, TLRPC.ChatFull chatFull, View view, int i9) {
        long j10;
        long emojiStatusDocumentId;
        long j11;
        long j12 = xcVar.a;
        int i10 = 1;
        if (!(view instanceof jc)) {
            if (i9 == xcVar.a0) {
                xcVar.s = -1;
                xcVar.w = 0L;
                if (xcVar.y instanceof TLRPC.TL_emojiStatusCollectible) {
                    xcVar.y = null;
                }
                xcVar.b1();
                xcVar.X0(true);
                xcVar.c1();
                xcVar.Z0(true);
                return;
            }
            if (i9 == xcVar.T) {
                Activity parentActivity = xcVar.getParentActivity();
                long j13 = xcVar.a;
                org.telegram.ui.ActionBar.b6 b6Var = xcVar.resourceProvider;
                w3 w3Var = new w3(xcVar, i10);
                g gVar = new g(xcVar, 12);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xcVar.c;
                int i11 = org.telegram.ui.Components.cp.e0;
                org.telegram.ui.Components.ki kiVar = new org.telegram.ui.Components.ki(parentActivity, xcVar, false, false, false, b6Var);
                kiVar.drawNavigationBar = true;
                kiVar.L1(LocaleController.getString(R.string.ChooseBackground));
                kiVar.V1 = new org.telegram.ui.Components.ro(kiVar, tL_premium_boostsStatus, b6Var, gVar, j13, w3Var, xcVar);
                kiVar.J1(1, false);
                kiVar.r1();
                kiVar.f0.e0();
                kiVar.show();
                return;
            }
            return;
        }
        if (i9 == xcVar.f0) {
            if (chatFull == null) {
                return;
            }
            z60 z60Var = new z60(-j12);
            z60Var.d0(chatFull);
            xcVar.presentFragment(z60Var);
            return;
        }
        if (i9 == xcVar.Q) {
            emojiStatusDocumentId = xcVar.n;
        } else if (i9 == xcVar.Y) {
            emojiStatusDocumentId = xcVar.w;
        } else {
            if (i9 != xcVar.b0) {
                j10 = 0;
                if (i9 != xcVar.d0) {
                    int G0 = xcVar.G0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = xcVar.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < G0) {
                        xcVar.T0(29);
                        return;
                    }
                    z60 z60Var2 = new z60(-j12, 0);
                    z60Var2.d0(chatFull);
                    xcVar.presentFragment(z60Var2);
                    return;
                }
                jc jcVar = (jc) view;
                boolean z10 = i9 == xcVar.b0;
                zb zbVar = new zb(xcVar, i9, view);
                int v02 = xcVar.y instanceof TLRPC.TL_emojiStatusCollectible ? org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v6, xcVar.resourceProvider) : jcVar.f;
                if (xcVar.M == null) {
                    org.telegram.ui.Components.i5 i5Var = jcVar.c;
                    s51[] s51VarArr = new s51[1];
                    boolean z11 = ((float) (jcVar.getHeight() + jcVar.getTop())) > ((float) xcVar.I.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    Drawable[] drawableArr = i5Var.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        j11 = 0;
                        if (drawable instanceof org.telegram.ui.Components.k5) {
                            ((org.telegram.ui.Components.k5) drawable).p(i5Var);
                        }
                        drawableArr[1] = null;
                    } else {
                        j11 = 0;
                    }
                    i5Var.f();
                    jcVar.f();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(i5Var.getBounds());
                    int dp = z11 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(jcVar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    ec ecVar = new ec(xcVar, xcVar, xcVar.getParentActivity(), Integer.valueOf(rect.centerX() - (AndroidUtilities.displaySize.x - min2)), z10 ? z11 ? 10 : 9 : z11 ? 5 : 7, xcVar.getResourceProvider(), z11 ? 24 : 16, v02, zbVar, s51VarArr);
                    ecVar.c1 = true;
                    ecVar.setSelected(j10 == j11 ? null : Long.valueOf(j10));
                    ecVar.setSaveState(3);
                    ecVar.y(i5Var, jcVar);
                    fc fcVar = new fc(xcVar, ecVar);
                    xcVar.M = fcVar;
                    s51VarArr[0] = fcVar;
                    fcVar.showAsDropDown(jcVar, 0, dp, 53);
                    s51VarArr[0].b();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = xcVar.y;
            emojiStatusDocumentId = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : DialogObject.getEmojiStatusDocumentId(emojiStatus);
        }
        j10 = emojiStatusDocumentId;
        if (i9 != xcVar.d0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(xc xcVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        int i9;
        int i10;
        long j10 = xcVar.a;
        if (xcVar.e != xcVar.f) {
            MessagesController.PeerColors peerColors = xcVar.getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(xcVar.f);
            if (color != null && color.getLvl(xcVar.d) > xcVar.b) {
                i9 = color.getLvl(xcVar.d);
                if (xcVar.r != xcVar.s) {
                    MessagesController.PeerColors peerColors2 = xcVar.getMessagesController().profilePeerColors;
                    MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(xcVar.s) : null;
                    if (color2 != null && color2.getLvl(xcVar.d) > xcVar.b) {
                        i9 = color2.getLvl(xcVar.d);
                        i10 = 24;
                        int i11 = i9;
                        if (xcVar.h != xcVar.n && xcVar.getMessagesController().channelBgIconLevelMin > xcVar.b) {
                            i10 = 27;
                        }
                        if (xcVar.v != xcVar.w && xcVar.I0() > xcVar.b) {
                            i10 = 28;
                        }
                        if (!DialogObject.emojiStatusesEqual(xcVar.x, xcVar.y) && xcVar.E0() > xcVar.b) {
                            i10 = !(xcVar.y instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        int i12 = !ChatThemeController.wallpaperEquals(xcVar.A, xcVar.B) ? !TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(xcVar.B)) ? 22 : 23 : i10;
                        if (xcVar.getParentActivity() == null || xcVar.getParentActivity() == null) {
                            return;
                        }
                        dc dcVar = new dc(xcVar, xcVar.getParentActivity(), i12, xcVar.currentAccount, xcVar.getResourceProvider(), i11);
                        dcVar.G1(canApplyBoost);
                        dcVar.F1(xcVar.c, true);
                        dcVar.H1(j10);
                        TLRPC.Chat chat = xcVar.getMessagesController().getChat(Long.valueOf(-j10));
                        if (chat != null) {
                            dcVar.M0 = new org.telegram.messenger.voip.l0(25, xcVar, chat);
                        }
                        xcVar.showDialog(dcVar);
                        xcVar.L.setLoading(false);
                        return;
                    }
                }
                i10 = 20;
                int i112 = i9;
                if (xcVar.h != xcVar.n) {
                    i10 = 27;
                }
                if (xcVar.v != xcVar.w) {
                    i10 = 28;
                }
                if (!DialogObject.emojiStatusesEqual(xcVar.x, xcVar.y)) {
                    if (!(xcVar.y instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                if (!ChatThemeController.wallpaperEquals(xcVar.A, xcVar.B)) {
                }
                if (xcVar.getParentActivity() == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        i9 = 0;
        if (xcVar.r != xcVar.s) {
        }
        i10 = 20;
        int i1122 = i9;
        if (xcVar.h != xcVar.n) {
        }
        if (xcVar.v != xcVar.w) {
        }
        if (!DialogObject.emojiStatusesEqual(xcVar.x, xcVar.y)) {
        }
        if (!ChatThemeController.wallpaperEquals(xcVar.A, xcVar.B)) {
        }
        if (xcVar.getParentActivity() == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y0(View view) {
        if (view instanceof jc) {
            jc jcVar = (jc) view;
            jcVar.a.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, jcVar.d));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.p8) {
            ((org.telegram.ui.Cells.p8) view).v();
            return;
        }
        if (view instanceof nc) {
            nc ncVar = (nc) view;
            AndroidUtilities.forEachViews((RecyclerView) ncVar.b, (d5.d) new ih.a2(2, ncVar, MessagesController.getInstance(ncVar.d).peerColors));
            return;
        }
        if (view instanceof vc) {
            vc vcVar = (vc) view;
            ArrayList arrayList = vcVar.c;
            org.telegram.ui.ActionBar.b6 b6Var = vcVar.b;
            int a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((org.telegram.ui.Components.bp) arrayList.get(i9)).c = a2;
            }
            AndroidUtilities.forEachViews((RecyclerView) vcVar.d, (d5.d) new qc(vcVar, 0));
            vcVar.h.l();
        }
    }

    public int A0() {
        return 0;
    }

    public final TLRPC.Document B0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public final long C0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0).id;
            }
        }
        return j10;
    }

    public int D0() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int E0() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int F0() {
        return R.string.ChannelEmojiStatus;
    }

    public int G0() {
        return 0;
    }

    public int H0() {
        return 3;
    }

    public int I0() {
        return getMessagesController().channelProfileIconLevelMin;
    }

    public int K0() {
        return R.string.ChannelProfileInfo;
    }

    public int L0() {
        return 0;
    }

    public int M0() {
        return 0;
    }

    public int N0() {
        return R.string.ChannelWallpaper2Info;
    }

    public int O0() {
        return getMessagesController().channelWallpaperLevelMin;
    }

    public int P0() {
        return R.string.ChannelWallpaper;
    }

    public final boolean Q0() {
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.v == this.w && DialogObject.emojiStatusesEqual(this.x, this.y) && ChatThemeController.wallpaperEquals(this.A, this.B)) ? false : true;
    }

    public boolean R0() {
        return false;
    }

    public final int S0() {
        int i9 = 0;
        if (this.e != this.f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(this.f);
            if (color != null) {
                i9 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.n) {
            i9 = Math.max(i9, getMessagesController().channelBgIconLevelMin);
        }
        if (this.r != this.s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(this.s) : null;
            if (color2 != null) {
                i9 = Math.max(i9, color2.getLvl(this.d));
            }
        }
        if (this.v != this.w) {
            i9 = Math.max(i9, I0());
        }
        if (!DialogObject.emojiStatusesEqual(this.x, this.y)) {
            i9 = Math.max(i9, E0());
        }
        return !ChatThemeController.wallpaperEquals(this.A, this.B) ? Math.max(i9, O0()) : i9;
    }

    public final void U0(boolean z10, boolean z11) {
        if (this.l0 == z10) {
            return;
        }
        this.l0 = z10;
        if (z11) {
            org.telegram.ui.Components.mi0 mi0Var = this.G;
            mi0Var.N(z10 ? mi0Var.e[0] : 0);
            org.telegram.ui.Components.mi0 mi0Var2 = this.G;
            if (mi0Var2 != null) {
                mi0Var2.start();
                return;
            }
            return;
        }
        int i9 = z10 ? this.G.e[0] - 1 : 0;
        this.G.L(i9, false, true);
        this.G.N(i9);
        org.telegram.ui.ActionBar.w0 w0Var = this.H;
        if (w0Var != null) {
            w0Var.invalidate();
        }
    }

    public final void V0() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i9 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.cc
            public final /* synthetic */ xc b;

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
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.cc
            public final /* synthetic */ xc b;

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

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i9 = tL_premium_boostsStatus.level;
            this.b = i9;
            if (chat != null) {
                chat.level = i9;
            }
            ic icVar = this.J;
            if (icVar != null) {
                icVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z10) {
        if (this.L == null || this.c == null) {
            return;
        }
        int S0 = S0();
        if (this.b >= S0) {
            this.L.f(null, z10);
            return;
        }
        if (this.E == null) {
            this.E = new SpannableStringBuilder("l");
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.mini_switch_lock, 0);
            eqVar.setTopOffset(1);
            this.E.setSpan(eqVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.E).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
        this.L.f(spannableStringBuilder, z10);
    }

    public void Z0(boolean z10) {
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.s8));
        this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.f6.A8) : -1);
        this.actionBar.C((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.f6.v8) : -1, false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.f6.t8), false);
        if (z10) {
            return;
        }
        org.telegram.ui.Components.wk0 wk0Var = this.I;
        int i9 = org.telegram.ui.ActionBar.f6.a7;
        wk0Var.setBackgroundColor(getThemedColor(i9));
        this.J.l();
        AndroidUtilities.forEachViews((RecyclerView) this.I, (d5.d) new ih.e(this));
        this.K.setBackgroundColor(getThemedColor(i9));
        this.L.j();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void a1(boolean z10) {
        MessageObject messageObject;
        View x02 = x0(this.O);
        View x03 = x0(this.P);
        View x04 = x0(this.Q);
        View x05 = x0(this.S);
        if (x02 instanceof org.telegram.ui.Cells.fa) {
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) x02;
            org.telegram.ui.Cells.t1[] cells = faVar.getCells();
            for (int i9 = 0; i9 < cells.length; i9++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i9];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f;
                    messageObject.overrideLinkEmoji = this.n;
                    cells[i9].setAvatar(messageObject);
                    cells[i9].invalidate();
                }
            }
            Drawable f10 = kh.r6.f(this.D, this.currentAccount, this.B, this.F);
            this.D = f10;
            faVar.setOverrideBackground(f10);
        }
        if (x03 instanceof xo0) {
            ((xo0) x03).a(this.f, z10);
        } else if (x03 instanceof nc) {
            ((nc) x03).a(this.f, z10);
        }
        if (x04 instanceof jc) {
            jc jcVar = (jc) x04;
            jcVar.a(this.currentAccount, this.f, true);
            jcVar.c(this.n, false, z10);
        }
        if (x05 instanceof vc) {
            vc vcVar = (vc) x05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.B);
            if (wallpaperEmoticon == null && this.B == null && this.C != null) {
                wallpaperEmoticon = "❌";
            }
            vcVar.a(wallpaperEmoticon, z10);
            vcVar.setGalleryWallpaper(this.C);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View x02 = x0(this.V);
        View x03 = x0(this.X);
        View x04 = x0(this.Y);
        View x05 = x0(this.b0);
        View x06 = x0(this.d0);
        View x07 = x0(this.f0);
        if (x02 instanceof pc) {
            TLRPC.EmojiStatus emojiStatus = this.y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                pc pcVar = (pc) x02;
                oc ocVar = pcVar.b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                ocVar.c(fromCollectible, true);
                pcVar.a.c(fromCollectible, true);
                ocVar.d(((TLRPC.TL_emojiStatusCollectible) this.y).pattern_document_id, true, true);
            } else {
                pc pcVar2 = (pc) x02;
                oc ocVar2 = pcVar2.b;
                int i9 = this.s;
                ocVar2.b(i9, true);
                pcVar2.a.b(pcVar2.h.currentAccount, i9, true);
                ocVar2.d(this.w, false, true);
            }
            pc pcVar3 = (pc) x02;
            oc ocVar3 = pcVar3.b;
            ocVar3.e(DialogObject.getEmojiStatusDocumentId(this.y), false, true);
            ocVar3.a(this.f);
            pcVar3.d();
        }
        if (x03 instanceof xo0) {
            ((xo0) x03).a(this.s, true);
        } else if (x03 instanceof nc) {
            ((nc) x03).a(this.f, true);
        }
        if (x04 instanceof jc) {
            jc jcVar = (jc) x04;
            jcVar.a(this.currentAccount, this.s, false);
            jcVar.c(this.w, false, true);
        }
        if (x05 instanceof jc) {
            TLRPC.EmojiStatus emojiStatus2 = this.y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((jc) x05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((jc) x05).a(this.currentAccount, this.s, false);
            }
            ((jc) x05).c(DialogObject.getEmojiStatusDocumentId(this.y), DialogObject.isEmojiStatusCollectible(this.y), true);
        }
        boolean z10 = x06 instanceof jc;
        long j10 = this.a;
        if (z10) {
            jc jcVar2 = (jc) x06;
            jcVar2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull == null || (stickerSet2 = chatFull.emojiset) == null) {
                jcVar2.c(0L, false, false);
            } else {
                jcVar2.c(C0(stickerSet2), false, false);
            }
        }
        if (x07 instanceof jc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 == null || (stickerSet = chatFull2.stickerset) == null) {
                ((jc) x07).c(0L, false, false);
            } else {
                ((jc) x07).d(B0(stickerSet));
            }
        }
        c1();
    }

    public void c1() {
        ic icVar;
        ic icVar2;
        this.O = 0;
        int i9 = 1 + 1;
        this.P = 1;
        this.Q = i9;
        this.R = i9 + 1;
        this.S = i9 + 2;
        this.T = i9 + 3;
        this.U = i9 + 4;
        this.V = i9 + 5;
        this.X = i9 + 6;
        int i10 = i9 + 8;
        this.N = i10;
        this.Y = i9 + 7;
        if (this.w != 0 || this.s >= 0 || (this.y instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z10 = this.a0 >= 0;
            this.N = i9 + 9;
            this.a0 = i10;
            if (!z10 && (icVar = this.J) != null) {
                icVar.o(i10);
                this.J.m(this.Y);
            }
        } else {
            int i11 = this.a0;
            this.a0 = -1;
            if (i11 >= 0 && (icVar2 = this.J) != null) {
                icVar2.u(i11);
                this.J.m(this.Y);
            }
        }
        int i12 = this.N;
        this.Z = i12;
        this.b0 = i12 + 1;
        this.N = i12 + 3;
        this.c0 = i12 + 2;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j10 = -this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f = colorId;
            this.e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.s = profileColorId;
            this.r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.y = emojiStatus;
            this.x = emojiStatus;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        if (chatFull != null) {
            TLRPC.WallPaper wallPaper = chatFull.wallpaper;
            this.B = wallPaper;
            this.A = wallPaper;
            if (ChatThemeController.isNotEmoticonWallpaper(wallPaper)) {
                this.C = this.A;
            }
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 24));
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
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J9, this.resourceProvider);
        this.G.O(v02, "Sunny");
        this.G.O(v02, "Path 6");
        this.G.O(v02, "Path");
        this.G.O(v02, "Path 5");
        this.H = this.actionBar.n().d(1, this.G);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        w0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.I);
        }
        org.telegram.ui.Components.wk0 wk0Var = this.I;
        ic icVar = new ic(this);
        this.J = icVar;
        wk0Var.setAdapter(icVar);
        new f2.y(3);
        this.I.setLayoutManager(new f2.m0());
        org.telegram.ui.Components.wk0 wk0Var2 = this.I;
        int i9 = org.telegram.ui.ActionBar.f6.a7;
        wk0Var2.setBackgroundColor(getThemedColor(i9));
        frameLayout.addView(this.I, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.I.setOnItemClickListener(new bg.b1(6, this, chatFull));
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.m = false;
        this.I.setItemAnimator(nVar);
        kh.d dVar = new kh.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.L = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.L.setOnClickListener(new a(this, 12));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.K = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i9));
        this.K.addView(this.L, g7.e6.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.K, g7.e6.e(-1, 68, 80));
        setBulletinDelegate(new x8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[LOOP:1: B:32:0x009b->B:34:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1() {
        SparseIntArray Q0;
        int[] iArr;
        int i9;
        org.telegram.ui.ActionBar.d6 k10;
        View x02;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.f6.N0(string) == null || org.telegram.ui.ActionBar.f6.N0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.f6.N0(string2) == null || !org.telegram.ui.ActionBar.f6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (e6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.e6 N0 = !this.F ? org.telegram.ui.ActionBar.f6.N0(str2) : org.telegram.ui.ActionBar.f6.N0(str);
            this.n0.clear();
            String[] strArr = new String[1];
            String str3 = N0.d;
            Q0 = str3 == null ? org.telegram.ui.ActionBar.f6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.f6.Q0(new File(N0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.f6.nl;
            if (iArr != null) {
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    this.n0.put(i10, iArr[i10]);
                }
            }
            for (i9 = 0; i9 < Q0.size(); i9++) {
                this.n0.put(Q0.keyAt(i9), Q0.valueAt(i9));
            }
            k10 = N0.k(false);
            if (k10 != null) {
                k10.c(Q0, this.n0);
            }
            this.u0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, this.resourceProvider));
            this.D = kh.r6.f(this.D, this.currentAccount, this.B, this.F);
            x02 = x0(this.O);
            if (x02 instanceof org.telegram.ui.Cells.fa) {
                return;
            }
            ((org.telegram.ui.Cells.fa) x02).setOverrideBackground(this.D);
            return;
        }
        str = string;
        if (!this.F) {
        }
        this.n0.clear();
        String[] strArr2 = new String[1];
        String str32 = N0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.f6.nl;
        if (iArr != null) {
        }
        while (i9 < Q0.size()) {
        }
        k10 = N0.k(false);
        if (k10 != null) {
        }
        this.u0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, this.resourceProvider));
        this.D = kh.r6.f(this.D, this.currentAccount, this.B, this.F);
        x02 = x0(this.O);
        if (x02 instanceof org.telegram.ui.Cells.fa) {
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.a;
        if (i9 == i11) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i9 == NotificationCenter.boostByChannelCreated) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().getBoostsController().getBoostsStats(j10, new bc(this, 1));
        } else if (i9 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !Q0() || this.b < S0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (this.b < S0() || !Q0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        V0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public boolean onFragmentCreate() {
        getMediaDataController().loadRestrictedStatusEmojis();
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setResourceProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.m0 = b6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0140  */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0() {
        int[] iArr;
        char c10;
        long j10;
        boolean z10;
        long j11;
        int i9;
        long j12;
        ?? r13;
        if (this.c == null || this.L.J) {
            return;
        }
        int i10 = this.b;
        int S0 = S0();
        long j13 = this.a;
        int i11 = 0;
        if (i10 < S0) {
            this.L.setLoading(true);
            getMessagesController().getBoostsController().userCanBoostChannel(j13, this.c, new bc(this, i11));
            return;
        }
        int[] iArr2 = {0};
        final bg.j1 j1Var = new bg.j1(this, new boolean[]{false}, new int[]{0}, iArr2, 5);
        long j14 = -j13;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j14));
        if (chat == null) {
            FileLog.e("channel is null in ChannelColorAcitivity");
            org.telegram.messenger.l0.p(R.string.UnknownError, org.telegram.ui.Components.oc.a0(this), R.raw.error, 36);
            return;
        }
        this.L.setLoading(true);
        if (this.e == this.f) {
            iArr = iArr2;
            if (this.h == this.n) {
                j10 = j14;
                z10 = true;
                c10 = 0;
                if (this.r == this.s || this.v != this.w) {
                    TLRPC.TL_channels_updateColor tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                    j11 = j10;
                    tL_channels_updateColor.channel = getMessagesController().getInputChannel(j11);
                    tL_channels_updateColor.for_profile = z10;
                    if (chat.profile_color == null) {
                        chat.profile_color = new TLRPC.TL_peerColor();
                        chat.flags2 |= 256;
                    }
                    i9 = this.s;
                    if (i9 < 0) {
                        tL_channels_updateColor.flags |= 4;
                        tL_channels_updateColor.color = i9;
                        TLRPC.PeerColor peerColor = chat.profile_color;
                        peerColor.flags |= 1;
                        peerColor.color = i9;
                    } else {
                        chat.profile_color.flags &= -2;
                    }
                    j12 = this.w;
                    if (j12 == 0) {
                        tL_channels_updateColor.flags |= 1;
                        tL_channels_updateColor.background_emoji_id = j12;
                        TLRPC.PeerColor peerColor2 = chat.profile_color;
                        peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j12;
                    } else {
                        TLRPC.PeerColor peerColor3 = chat.profile_color;
                        peerColor3.flags &= -3;
                        peerColor3.background_emoji_id = 0L;
                    }
                    iArr[c10] = iArr[c10] + 1;
                    final int i12 = 3;
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: org.telegram.ui.yb
                        public final /* synthetic */ xc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i12) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                            }
                        }
                    });
                } else {
                    j11 = j10;
                }
                if (!ChatThemeController.wallpaperEquals(this.A, this.B)) {
                    TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                    tL_messages_setChatWallPaper.peer = getMessagesController().getInputPeer(j13);
                    TLRPC.WallPaper wallPaper = this.B;
                    if (wallPaper != null) {
                        if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                            tL_messages_setChatWallPaper.flags |= 1;
                            TLRPC.WallPaper wallPaper2 = this.B;
                            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                                TLRPC.WallPaper wallPaper3 = this.B;
                                tL_inputWallPaper.id = wallPaper3.id;
                                tL_inputWallPaper.access_hash = wallPaper3.access_hash;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper;
                            } else if (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = this.B.id;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile;
                            }
                        } else {
                            tL_messages_setChatWallPaper.flags |= 1;
                            TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile2 = new TLRPC.TL_inputWallPaperNoFile();
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile2;
                            tL_inputWallPaperNoFile2.id = 0L;
                            tL_messages_setChatWallPaper.flags |= 4;
                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                            tL_messages_setChatWallPaper.settings = tL_wallPaperSettings;
                            tL_wallPaperSettings.flags |= 128;
                            tL_wallPaperSettings.emoticon = ChatThemeController.getWallpaperEmoticon(this.B);
                        }
                    }
                    iArr[c10] = iArr[c10] + 1;
                    final int i13 = 0;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: org.telegram.ui.yb
                        public final /* synthetic */ xc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                            }
                        }
                    });
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j11);
                    ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(j13, this.B);
                    if (chatFull != null) {
                        TLRPC.WallPaper wallPaper4 = this.B;
                        if (wallPaper4 == null) {
                            chatFull.flags2 &= -129;
                            chatFull.wallpaper = null;
                        } else {
                            chatFull.flags2 |= 128;
                            chatFull.wallpaper = wallPaper4;
                        }
                        getMessagesController().putChatFull(chatFull);
                        NotificationCenter notificationCenter = getNotificationCenter();
                        int i14 = NotificationCenter.chatInfoDidLoad;
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i14, chatFull, 0, bool, bool);
                    }
                }
                if (DialogObject.emojiStatusesEqual(this.x, this.y)) {
                    TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                    tL_channels_updateEmojiStatus.channel = getMessagesController().getInputChannel(j11);
                    TLRPC.EmojiStatus emojiStatus = this.y;
                    if (emojiStatus == null || (emojiStatus instanceof TLRPC.TL_emojiStatusEmpty)) {
                        tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        chat.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        chat.flags2 &= -513;
                    } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_inputEmojiStatusCollectible.collectible_id = tL_emojiStatusCollectible.collectible_id;
                        tL_inputEmojiStatusCollectible.flags = tL_emojiStatusCollectible.flags;
                        tL_inputEmojiStatusCollectible.until = tL_emojiStatusCollectible.until;
                        tL_channels_updateEmojiStatus.emoji_status = tL_inputEmojiStatusCollectible;
                        chat.emoji_status = this.y;
                        chat.flags |= 512;
                    } else {
                        tL_channels_updateEmojiStatus.emoji_status = emojiStatus;
                        chat.emoji_status = emojiStatus;
                        chat.flags |= 512;
                    }
                    getMessagesController().updateEmojiStatusUntilUpdate(j13, this.y);
                    r13 = 0;
                    final int i15 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: org.telegram.ui.yb
                        public final /* synthetic */ xc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i15) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    j1Var.run(tL_error);
                                    break;
                            }
                        }
                    });
                } else {
                    r13 = 0;
                }
                if (iArr[r13] != 0) {
                    finishFragment();
                    this.L.setLoading(r13);
                    return;
                }
                getMessagesController().putChat(chat, r13);
                NotificationCenter notificationCenter2 = getNotificationCenter();
                int i16 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[r13] = Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS);
                notificationCenter2.lambda$postNotificationNameOnUIThread$1(i16, objArr);
                return;
            }
        } else {
            iArr = iArr2;
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().getInputChannel(j14);
        tL_channels_updateColor2.for_profile = false;
        if (chat.color == null) {
            chat.color = new TLRPC.TL_peerColor();
            chat.flags2 |= 128;
        }
        int i17 = tL_channels_updateColor2.flags;
        tL_channels_updateColor2.flags = i17 | 4;
        int i18 = this.f;
        tL_channels_updateColor2.color = i18;
        TLRPC.PeerColor peerColor4 = chat.color;
        int i19 = peerColor4.flags;
        c10 = 0;
        int i20 = i19 | 1;
        peerColor4.flags = i20;
        peerColor4.color = i18;
        j10 = j14;
        z10 = true;
        long j15 = this.n;
        if (j15 != 0) {
            tL_channels_updateColor2.flags = i17 | 5;
            tL_channels_updateColor2.background_emoji_id = j15;
            peerColor4.flags = i19 | 3;
            peerColor4.background_emoji_id = j15;
        } else {
            peerColor4.flags = i20 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        final int i21 = 2;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: org.telegram.ui.yb
            public final /* synthetic */ xc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i21) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        j1Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        j1Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        j1Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        j1Var.run(tL_error);
                        break;
                }
            }
        });
        if (this.r == this.s) {
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor3 = new TLRPC.TL_channels_updateColor();
        j11 = j10;
        tL_channels_updateColor3.channel = getMessagesController().getInputChannel(j11);
        tL_channels_updateColor3.for_profile = z10;
        if (chat.profile_color == null) {
        }
        i9 = this.s;
        if (i9 < 0) {
        }
        j12 = this.w;
        if (j12 == 0) {
        }
        iArr[c10] = iArr[c10] + 1;
        final int i122 = 3;
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: org.telegram.ui.yb
            public final /* synthetic */ xc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i122) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        j1Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        j1Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        j1Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        j1Var.run(tL_error);
                        break;
                }
            }
        });
        if (!ChatThemeController.wallpaperEquals(this.A, this.B)) {
        }
        if (DialogObject.emojiStatusesEqual(this.x, this.y)) {
        }
        if (iArr[r13] != 0) {
        }
    }

    public void w0() {
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(getParentActivity(), this.resourceProvider);
        this.I = wk0Var;
        wk0Var.setSections(false);
    }

    public final View x0(int i9) {
        for (int i10 = 0; i10 < this.I.getChildCount(); i10++) {
            View childAt = this.I.getChildAt(i10);
            this.I.getClass();
            if (RecyclerView.R(childAt) == i9) {
                return childAt;
            }
        }
        return null;
    }

    public int y0() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public int z0() {
        return 0;
    }

    public void T0(int i9) {
    }
}
