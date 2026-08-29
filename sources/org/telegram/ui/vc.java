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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class vc extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper A;
    public TLRPC.WallPaper B;
    public TLRPC.WallPaper C;
    public Drawable D;
    public SpannableStringBuilder E;
    public boolean F;
    public org.telegram.ui.Components.xi0 G;
    public org.telegram.ui.ActionBar.w0 H;
    public org.telegram.ui.Components.jl0 I;
    public hc J;
    public FrameLayout K;
    public nh.d L;
    public ec M;
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
    public fc i0;
    public float j0;
    public ValueAnimator k0;
    public boolean l0;
    public org.telegram.ui.ActionBar.c6 m0;
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

    public vc(long j10) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
        this.F = q6;
        this.N = 0;
        this.l0 = q6;
        this.n0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.u0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, this.resourceProvider));
        this.s0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.t0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new lh.y1(1, this, chat));
        this.resourceProvider = new uc(this);
        this.o0 = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.p0 = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
        this.q0 = new org.telegram.ui.ActionBar.d5(0, true, false, this.resourceProvider);
        this.r0 = new org.telegram.ui.ActionBar.d5(0, true, true, this.resourceProvider);
    }

    public static void U(vc vcVar) {
        org.telegram.ui.ActionBar.c6 c6Var = vcVar.resourceProvider;
        if (c6Var instanceof uc) {
            vc vcVar2 = ((uc) c6Var).a;
            vcVar2.F = !vcVar2.F;
            vcVar2.d1();
            vcVar2.Z0(false);
        } else {
            vcVar.F = !vcVar.F;
            vcVar.d1();
        }
        vcVar.U0(vcVar.F, true);
        vcVar.Z0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(vc vcVar, TLRPC.ChatFull chatFull, View view, int i10) {
        long j10;
        long emojiStatusDocumentId;
        long j11;
        long j12 = vcVar.a;
        int i11 = 1;
        if (!(view instanceof ic)) {
            if (i10 == vcVar.a0) {
                vcVar.s = -1;
                vcVar.w = 0L;
                if (vcVar.y instanceof TLRPC.TL_emojiStatusCollectible) {
                    vcVar.y = null;
                }
                vcVar.b1();
                vcVar.X0(true);
                vcVar.c1();
                vcVar.Z0(true);
                return;
            }
            if (i10 == vcVar.T) {
                Activity parentActivity = vcVar.getParentActivity();
                long j13 = vcVar.a;
                org.telegram.ui.ActionBar.c6 c6Var = vcVar.resourceProvider;
                x3 x3Var = new x3(vcVar, i11);
                h hVar = new h(vcVar, 12);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = vcVar.c;
                int i12 = org.telegram.ui.Components.gp.e0;
                org.telegram.ui.Components.ni niVar = new org.telegram.ui.Components.ni(parentActivity, vcVar, false, false, false, c6Var);
                niVar.drawNavigationBar = true;
                niVar.L1(LocaleController.getString(R.string.ChooseBackground));
                niVar.V1 = new org.telegram.ui.Components.vo(niVar, tL_premium_boostsStatus, c6Var, hVar, j13, x3Var, vcVar);
                niVar.J1(1, false);
                niVar.r1();
                niVar.f0.f0();
                niVar.show();
                return;
            }
            return;
        }
        if (i10 == vcVar.f0) {
            if (chatFull == null) {
                return;
            }
            c70 c70Var = new c70(-j12);
            c70Var.e0(chatFull);
            vcVar.presentFragment(c70Var);
            return;
        }
        if (i10 == vcVar.Q) {
            emojiStatusDocumentId = vcVar.n;
        } else if (i10 == vcVar.Y) {
            emojiStatusDocumentId = vcVar.w;
        } else {
            if (i10 != vcVar.b0) {
                j10 = 0;
                if (i10 != vcVar.d0) {
                    int H0 = vcVar.H0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = vcVar.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < H0) {
                        vcVar.T0(29);
                        return;
                    }
                    c70 c70Var2 = new c70(-j12, 0);
                    c70Var2.e0(chatFull);
                    vcVar.presentFragment(c70Var2);
                    return;
                }
                ic icVar = (ic) view;
                boolean z10 = i10 == vcVar.b0;
                yb ybVar = new yb(vcVar, i10, view);
                int v02 = vcVar.y instanceof TLRPC.TL_emojiStatusCollectible ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v6, vcVar.resourceProvider) : icVar.f;
                if (vcVar.M == null) {
                    org.telegram.ui.Components.n5 n5Var = icVar.c;
                    u51[] u51VarArr = new u51[1];
                    boolean z11 = ((float) (icVar.getHeight() + icVar.getTop())) > ((float) vcVar.I.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    Drawable[] drawableArr = n5Var.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        j11 = 0;
                        if (drawable instanceof org.telegram.ui.Components.p5) {
                            ((org.telegram.ui.Components.p5) drawable).p(n5Var);
                        }
                        drawableArr[1] = null;
                    } else {
                        j11 = 0;
                    }
                    n5Var.f();
                    icVar.f();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(n5Var.getBounds());
                    int dp = z11 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(icVar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    dc dcVar = new dc(vcVar, vcVar, vcVar.getParentActivity(), Integer.valueOf(rect.centerX() - (AndroidUtilities.displaySize.x - min2)), z10 ? z11 ? 10 : 9 : z11 ? 5 : 7, vcVar.getResourceProvider(), z11 ? 24 : 16, v02, ybVar, u51VarArr);
                    dcVar.c1 = true;
                    dcVar.setSelected(j10 == j11 ? null : Long.valueOf(j10));
                    dcVar.setSaveState(3);
                    dcVar.y(n5Var, icVar);
                    ec ecVar = new ec(vcVar, dcVar);
                    vcVar.M = ecVar;
                    u51VarArr[0] = ecVar;
                    ecVar.showAsDropDown(icVar, 0, dp, 53);
                    u51VarArr[0].b();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = vcVar.y;
            emojiStatusDocumentId = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : DialogObject.getEmojiStatusDocumentId(emojiStatus);
        }
        j10 = emojiStatusDocumentId;
        if (i10 != vcVar.d0) {
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
    public static void W(vc vcVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        int i10;
        int i11;
        long j10 = vcVar.a;
        if (vcVar.e != vcVar.f) {
            MessagesController.PeerColors peerColors = vcVar.getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(vcVar.f);
            if (color != null && color.getLvl(vcVar.d) > vcVar.b) {
                i10 = color.getLvl(vcVar.d);
                if (vcVar.r != vcVar.s) {
                    MessagesController.PeerColors peerColors2 = vcVar.getMessagesController().profilePeerColors;
                    MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(vcVar.s) : null;
                    if (color2 != null && color2.getLvl(vcVar.d) > vcVar.b) {
                        i10 = color2.getLvl(vcVar.d);
                        i11 = 24;
                        int i12 = i10;
                        if (vcVar.h != vcVar.n && vcVar.getMessagesController().channelBgIconLevelMin > vcVar.b) {
                            i11 = 27;
                        }
                        if (vcVar.v != vcVar.w && vcVar.J0() > vcVar.b) {
                            i11 = 28;
                        }
                        if (!DialogObject.emojiStatusesEqual(vcVar.x, vcVar.y) && vcVar.F0() > vcVar.b) {
                            i11 = !(vcVar.y instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        int i13 = !ChatThemeController.wallpaperEquals(vcVar.A, vcVar.B) ? !TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(vcVar.B)) ? 22 : 23 : i11;
                        if (vcVar.getParentActivity() == null || vcVar.getParentActivity() == null) {
                            return;
                        }
                        cc ccVar = new cc(vcVar, vcVar.getParentActivity(), i13, vcVar.currentAccount, vcVar.getResourceProvider(), i12);
                        ccVar.G1(canApplyBoost);
                        ccVar.F1(vcVar.c, true);
                        ccVar.H1(j10);
                        TLRPC.Chat chat = vcVar.getMessagesController().getChat(Long.valueOf(-j10));
                        if (chat != null) {
                            ccVar.M0 = new org.telegram.ui.ActionBar.c(22, vcVar, chat);
                        }
                        vcVar.showDialog(ccVar);
                        vcVar.L.setLoading(false);
                        return;
                    }
                }
                i11 = 20;
                int i122 = i10;
                if (vcVar.h != vcVar.n) {
                    i11 = 27;
                }
                if (vcVar.v != vcVar.w) {
                    i11 = 28;
                }
                if (!DialogObject.emojiStatusesEqual(vcVar.x, vcVar.y)) {
                    if (!(vcVar.y instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                if (!ChatThemeController.wallpaperEquals(vcVar.A, vcVar.B)) {
                }
                if (vcVar.getParentActivity() == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        i10 = 0;
        if (vcVar.r != vcVar.s) {
        }
        i11 = 20;
        int i1222 = i10;
        if (vcVar.h != vcVar.n) {
        }
        if (vcVar.v != vcVar.w) {
        }
        if (!DialogObject.emojiStatusesEqual(vcVar.x, vcVar.y)) {
        }
        if (!ChatThemeController.wallpaperEquals(vcVar.A, vcVar.B)) {
        }
        if (vcVar.getParentActivity() == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y0(View view) {
        if (view instanceof ic) {
            ic icVar = (ic) view;
            icVar.a.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, icVar.d));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.m8) {
            ((org.telegram.ui.Cells.m8) view).v();
            return;
        }
        if (view instanceof mc) {
            mc mcVar = (mc) view;
            AndroidUtilities.forEachViews((RecyclerView) mcVar.b, (f5.d) new lh.y1(2, mcVar, MessagesController.getInstance(mcVar.d).peerColors));
            return;
        }
        if (view instanceof tc) {
            tc tcVar = (tc) view;
            ArrayList arrayList = tcVar.c;
            org.telegram.ui.ActionBar.c6 c6Var = tcVar.b;
            int a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.fp) arrayList.get(i10)).c = a2;
            }
            AndroidUtilities.forEachViews((RecyclerView) tcVar.d, (f5.d) new pc(tcVar, 0));
            tcVar.h.l();
        }
    }

    public int A0() {
        return 0;
    }

    public int B0() {
        return 0;
    }

    public final TLRPC.Document C0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public final long D0(TLRPC.StickerSet stickerSet) {
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

    public int E0() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int F0() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int G0() {
        return R.string.ChannelEmojiStatus;
    }

    public int H0() {
        return 0;
    }

    public int I0() {
        return 3;
    }

    public int J0() {
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
        int i10 = 0;
        if (this.e != this.f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(this.f);
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.r != this.s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(this.s) : null;
            if (color2 != null) {
                i10 = Math.max(i10, color2.getLvl(this.d));
            }
        }
        if (this.v != this.w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.x, this.y)) {
            i10 = Math.max(i10, F0());
        }
        return !ChatThemeController.wallpaperEquals(this.A, this.B) ? Math.max(i10, O0()) : i10;
    }

    public final void U0(boolean z10, boolean z11) {
        if (this.l0 == z10) {
            return;
        }
        this.l0 = z10;
        if (z11) {
            org.telegram.ui.Components.xi0 xi0Var = this.G;
            xi0Var.N(z10 ? xi0Var.e[0] : 0);
            org.telegram.ui.Components.xi0 xi0Var2 = this.G;
            if (xi0Var2 != null) {
                xi0Var2.start();
                return;
            }
            return;
        }
        int i10 = z10 ? this.G.e[0] - 1 : 0;
        this.G.L(i10, false, true);
        this.G.N(i10);
        org.telegram.ui.ActionBar.w0 w0Var = this.H;
        if (w0Var != null) {
            w0Var.invalidate();
        }
    }

    public final void V0() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.bc
            public final /* synthetic */ vc b;

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
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.bc
            public final /* synthetic */ vc b;

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

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            hc hcVar = this.J;
            if (hcVar != null) {
                hcVar.l();
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
            org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.mini_switch_lock, 0);
            iqVar.setTopOffset(1);
            this.E.setSpan(iqVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.E).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
        this.L.f(spannableStringBuilder, z10);
    }

    public void Z0(boolean z10) {
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.s8));
        this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.g6.A8) : -1);
        this.actionBar.C((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.g6.v8) : -1, false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.t8), false);
        if (z10) {
            return;
        }
        org.telegram.ui.Components.jl0 jl0Var = this.I;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        jl0Var.setBackgroundColor(getThemedColor(i10));
        this.J.l();
        AndroidUtilities.forEachViews((RecyclerView) this.I, (f5.d) new l4.x0(this));
        this.K.setBackgroundColor(getThemedColor(i10));
        this.L.j();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void a1(boolean z10) {
        MessageObject messageObject;
        View y02 = y0(this.O);
        View y03 = y0(this.P);
        View y04 = y0(this.Q);
        View y05 = y0(this.S);
        if (y02 instanceof org.telegram.ui.Cells.ca) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) y02;
            org.telegram.ui.Cells.s1[] cells = caVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f;
                    messageObject.overrideLinkEmoji = this.n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f9 = nh.f6.f(this.D, this.currentAccount, this.B, this.F);
            this.D = f9;
            caVar.setOverrideBackground(f9);
        }
        if (y03 instanceof wo0) {
            ((wo0) y03).a(this.f, z10);
        } else if (y03 instanceof mc) {
            ((mc) y03).a(this.f, z10);
        }
        if (y04 instanceof ic) {
            ic icVar = (ic) y04;
            icVar.a(this.currentAccount, this.f, true);
            icVar.c(this.n, false, z10);
        }
        if (y05 instanceof tc) {
            tc tcVar = (tc) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.B);
            if (wallpaperEmoticon == null && this.B == null && this.C != null) {
                wallpaperEmoticon = "❌";
            }
            tcVar.a(wallpaperEmoticon, z10);
            tcVar.setGalleryWallpaper(this.C);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View y02 = y0(this.V);
        View y03 = y0(this.X);
        View y04 = y0(this.Y);
        View y05 = y0(this.b0);
        View y06 = y0(this.d0);
        View y07 = y0(this.f0);
        if (y02 instanceof oc) {
            TLRPC.EmojiStatus emojiStatus = this.y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                oc ocVar = (oc) y02;
                nc ncVar = ocVar.b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                ncVar.c(fromCollectible, true);
                ocVar.a.c(fromCollectible, true);
                ncVar.d(((TLRPC.TL_emojiStatusCollectible) this.y).pattern_document_id, true, true);
            } else {
                oc ocVar2 = (oc) y02;
                nc ncVar2 = ocVar2.b;
                int i10 = this.s;
                ncVar2.b(i10, true);
                ocVar2.a.b(ocVar2.h.currentAccount, i10, true);
                ncVar2.d(this.w, false, true);
            }
            oc ocVar3 = (oc) y02;
            nc ncVar3 = ocVar3.b;
            ncVar3.e(DialogObject.getEmojiStatusDocumentId(this.y), false, true);
            ncVar3.a(this.f);
            ocVar3.e();
        }
        if (y03 instanceof wo0) {
            ((wo0) y03).a(this.s, true);
        } else if (y03 instanceof mc) {
            ((mc) y03).a(this.f, true);
        }
        if (y04 instanceof ic) {
            ic icVar = (ic) y04;
            icVar.a(this.currentAccount, this.s, false);
            icVar.c(this.w, false, true);
        }
        if (y05 instanceof ic) {
            TLRPC.EmojiStatus emojiStatus2 = this.y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((ic) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((ic) y05).a(this.currentAccount, this.s, false);
            }
            ((ic) y05).c(DialogObject.getEmojiStatusDocumentId(this.y), DialogObject.isEmojiStatusCollectible(this.y), true);
        }
        boolean z10 = y06 instanceof ic;
        long j10 = this.a;
        if (z10) {
            ic icVar2 = (ic) y06;
            icVar2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull == null || (stickerSet2 = chatFull.emojiset) == null) {
                icVar2.c(0L, false, false);
            } else {
                icVar2.c(D0(stickerSet2), false, false);
            }
        }
        if (y07 instanceof ic) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 == null || (stickerSet = chatFull2.stickerset) == null) {
                ((ic) y07).c(0L, false, false);
            } else {
                ((ic) y07).d(C0(stickerSet));
            }
        }
        c1();
    }

    public void c1() {
        hc hcVar;
        hc hcVar2;
        this.O = 0;
        int i10 = 1 + 1;
        this.P = 1;
        this.Q = i10;
        this.R = i10 + 1;
        this.S = i10 + 2;
        this.T = i10 + 3;
        this.U = i10 + 4;
        this.V = i10 + 5;
        this.X = i10 + 6;
        int i11 = i10 + 8;
        this.N = i11;
        this.Y = i10 + 7;
        if (this.w != 0 || this.s >= 0 || (this.y instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z10 = this.a0 >= 0;
            this.N = i10 + 9;
            this.a0 = i11;
            if (!z10 && (hcVar = this.J) != null) {
                hcVar.o(i11);
                this.J.m(this.Y);
            }
        } else {
            int i12 = this.a0;
            this.a0 = -1;
            if (i12 >= 0 && (hcVar2 = this.J) != null) {
                hcVar2.u(i12);
                this.J.m(this.Y);
            }
        }
        int i13 = this.N;
        this.Z = i13;
        this.b0 = i13 + 1;
        this.N = i13 + 3;
        this.c0 = i13 + 2;
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
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 16));
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
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J9, this.resourceProvider);
        this.G.O(v02, "Sunny");
        this.G.O(v02, "Path 6");
        this.G.O(v02, "Path");
        this.G.O(v02, "Path 5");
        this.H = this.actionBar.n().d(1, this.G);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.I);
        }
        org.telegram.ui.Components.jl0 jl0Var = this.I;
        hc hcVar = new hc(this);
        this.J = hcVar;
        jl0Var.setAdapter(hcVar);
        new f2.w(3);
        this.I.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.jl0 jl0Var2 = this.I;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        jl0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.I, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.I.setOnItemClickListener(new eg.w0(5, this, chatFull));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.m = false;
        this.I.setItemAnimator(lVar);
        nh.d dVar = new nh.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.L = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.L.setOnClickListener(new a(this, 12));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.K = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.K.addView(this.L, i7.f6.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.K, i7.f6.e(-1, 68, 80));
        setBulletinDelegate(new w8(this, 1));
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
        int i10;
        org.telegram.ui.ActionBar.e6 k9;
        View y02;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.f6 N0 = !this.F ? org.telegram.ui.ActionBar.g6.N0(str2) : org.telegram.ui.ActionBar.g6.N0(str);
            this.n0.clear();
            String[] strArr = new String[1];
            String str3 = N0.d;
            Q0 = str3 == null ? org.telegram.ui.ActionBar.g6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.g6.Q0(new File(N0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.g6.nl;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    this.n0.put(i11, iArr[i11]);
                }
            }
            for (i10 = 0; i10 < Q0.size(); i10++) {
                this.n0.put(Q0.keyAt(i10), Q0.valueAt(i10));
            }
            k9 = N0.k(false);
            if (k9 != null) {
                k9.c(Q0, this.n0);
            }
            this.u0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, this.resourceProvider));
            this.D = nh.f6.f(this.D, this.currentAccount, this.B, this.F);
            y02 = y0(this.O);
            if (y02 instanceof org.telegram.ui.Cells.ca) {
                return;
            }
            ((org.telegram.ui.Cells.ca) y02).setOverrideBackground(this.D);
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
        iArr = org.telegram.ui.ActionBar.g6.nl;
        if (iArr != null) {
        }
        while (i10 < Q0.size()) {
        }
        k9 = N0.k(false);
        if (k9 != null) {
        }
        this.u0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, this.resourceProvider));
        this.D = nh.f6.f(this.D, this.currentAccount, this.B, this.F);
        y02 = y0(this.O);
        if (y02 instanceof org.telegram.ui.Cells.ca) {
        }
    }

    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().getBoostsController().getBoostsStats(j10, new ac(this, 1));
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.m0 = c6Var;
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
    public final void w0() {
        int[] iArr;
        char c3;
        long j10;
        boolean z10;
        long j11;
        int i10;
        long j12;
        ?? r13;
        if (this.c == null || this.L.J) {
            return;
        }
        int i11 = this.b;
        int S0 = S0();
        long j13 = this.a;
        int i12 = 0;
        if (i11 < S0) {
            this.L.setLoading(true);
            getMessagesController().getBoostsController().userCanBoostChannel(j13, this.c, new ac(this, i12));
            return;
        }
        int[] iArr2 = {0};
        final eg.d1 d1Var = new eg.d1(this, new boolean[]{false}, new int[]{0}, iArr2, 5);
        long j14 = -j13;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j14));
        if (chat == null) {
            FileLog.e("channel is null in ChannelColorAcitivity");
            j7.l1.v(R.string.UnknownError, org.telegram.ui.Components.tc.a0(this), R.raw.error, 36);
            return;
        }
        this.L.setLoading(true);
        if (this.e == this.f) {
            iArr = iArr2;
            if (this.h == this.n) {
                j10 = j14;
                z10 = true;
                c3 = 0;
                if (this.r == this.s || this.v != this.w) {
                    TLRPC.TL_channels_updateColor tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                    j11 = j10;
                    tL_channels_updateColor.channel = getMessagesController().getInputChannel(j11);
                    tL_channels_updateColor.for_profile = z10;
                    if (chat.profile_color == null) {
                        chat.profile_color = new TLRPC.TL_peerColor();
                        chat.flags2 |= 256;
                    }
                    i10 = this.s;
                    if (i10 < 0) {
                        tL_channels_updateColor.flags |= 4;
                        tL_channels_updateColor.color = i10;
                        TLRPC.PeerColor peerColor = chat.profile_color;
                        peerColor.flags |= 1;
                        peerColor.color = i10;
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
                    iArr[c3] = iArr[c3] + 1;
                    final int i13 = 3;
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: org.telegram.ui.xb
                        public final /* synthetic */ vc b;

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
                                    d1Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    d1Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    d1Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    d1Var.run(tL_error);
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
                    iArr[c3] = iArr[c3] + 1;
                    final int i14 = 0;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: org.telegram.ui.xb
                        public final /* synthetic */ vc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i14) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    d1Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    d1Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    d1Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    d1Var.run(tL_error);
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
                        int i15 = NotificationCenter.chatInfoDidLoad;
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, chatFull, 0, bool, bool);
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
                    final int i16 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: org.telegram.ui.xb
                        public final /* synthetic */ vc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i16) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    d1Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    d1Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    d1Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    d1Var.run(tL_error);
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
                int i17 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[r13] = Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS);
                notificationCenter2.lambda$postNotificationNameOnUIThread$1(i17, objArr);
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
        int i18 = tL_channels_updateColor2.flags;
        tL_channels_updateColor2.flags = i18 | 4;
        int i19 = this.f;
        tL_channels_updateColor2.color = i19;
        TLRPC.PeerColor peerColor4 = chat.color;
        int i20 = peerColor4.flags;
        c3 = 0;
        int i21 = i20 | 1;
        peerColor4.flags = i21;
        peerColor4.color = i19;
        j10 = j14;
        z10 = true;
        long j15 = this.n;
        if (j15 != 0) {
            tL_channels_updateColor2.flags = i18 | 5;
            tL_channels_updateColor2.background_emoji_id = j15;
            peerColor4.flags = i20 | 3;
            peerColor4.background_emoji_id = j15;
        } else {
            peerColor4.flags = i21 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        final int i22 = 2;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: org.telegram.ui.xb
            public final /* synthetic */ vc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i22) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        d1Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        d1Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        d1Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        d1Var.run(tL_error);
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
        i10 = this.s;
        if (i10 < 0) {
        }
        j12 = this.w;
        if (j12 == 0) {
        }
        iArr[c3] = iArr[c3] + 1;
        final int i132 = 3;
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: org.telegram.ui.xb
            public final /* synthetic */ vc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i132) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        d1Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        d1Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        d1Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        d1Var.run(tL_error);
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

    public void x0() {
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(getParentActivity(), this.resourceProvider);
        this.I = jl0Var;
        jl0Var.setSections(false);
    }

    public final View y0(int i10) {
        for (int i11 = 0; i11 < this.I.getChildCount(); i11++) {
            View childAt = this.I.getChildAt(i11);
            this.I.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int z0() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public void T0(int i10) {
    }
}
