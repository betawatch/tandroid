package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class wp0 extends FrameLayout {
    public static final /* synthetic */ int q0 = 0;
    public final bq0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public xh.v3 J;
    public TL_stars.StarGift K;
    public final ArrayList L;
    public final HashMap M;
    public final SpannableStringBuilder N;
    public final String O;
    public final String P;
    public int Q;
    public int R;
    public int S;
    public final int T;
    public int U;
    public int V;
    public int W;
    public final aq0 a;
    public int a0;
    public final np0 b;
    public int b0;
    public final s4.s c;
    public int c0;
    public final pp0 d;
    public int d0;
    public final org.telegram.ui.Cells.f3 e;
    public int e0;
    public zp0 f;
    public int f0;
    public int g0;
    public int h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public final ArrayList l0;
    public final int m0;
    public long n;
    public int n0;
    public tp0 o0;
    public final /* synthetic */ cq0 p0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final rp0 v;
    public final View w;
    public final View x;
    public vp0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(cq0 cq0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.p0 = cq0Var;
        this.e = new org.telegram.ui.Cells.f3(4);
        this.h = -1;
        this.n = 0L;
        this.r = null;
        this.s = null;
        this.K = null;
        this.L = new ArrayList();
        this.M = new HashMap();
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        int i12 = 0;
        this.f0 = 0;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = cq0Var.getResourceProvider();
        ah.c cVar = cq0Var.G;
        np0 np0Var = new np0(this, context2, resourceProvider, i10);
        this.b = np0Var;
        np0Var.setClipToPadding(false);
        np0Var.setSections(true);
        ((s4.j) np0Var.getItemAnimator()).m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.c = sVar;
        sVar.O = new ci.x1(this, 6);
        np0Var.i(new ci.r1(this, 7));
        np0Var.setLayoutManager(sVar);
        pp0 pp0Var = new pp0(this, context, i10);
        this.d = pp0Var;
        np0Var.setAdapter(pp0Var);
        np0Var.setOnItemClickListener(new org.telegram.ui.Components.bn0(this, i10, 1));
        np0Var.j(new qp0(this, i10));
        addView(np0Var, w7.y5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String string = LocaleController.getString(cq0Var.a ? R.string.ChannelColorApply : R.string.UserColorApply);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.qr.h);
        jVar.C = false;
        jVar.m = false;
        np0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.w = view;
        ah.e eVar = new ah.e(cVar.c(view, null, false));
        eVar.b(-AndroidUtilities.dp(24.0f), true);
        eVar.q = 220;
        view.setBackground(eVar);
        addView(view, w7.y5.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i11 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
            this.a = new aq0(i11, 0L, context3, f6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.x = view2;
            ah.e eVar2 = new ah.e(cVar.c(view2, null, false));
            eVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(eVar2);
            addView(view2, w7.y5.e(-1, 16, 55));
            Context context4 = getContext();
            d5Var = ((org.telegram.ui.ActionBar.n2) cq0Var).parentLayout;
            f6Var = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
            rp0 rp0Var = new rp0(context4, d5Var, 3, 0L, f6Var);
            this.v = rp0Var;
            rp0Var.setImportantForAccessibility(4);
            rp0Var.r = cq0Var;
            rp0Var.setClipToOutline(true);
            float dp = AndroidUtilities.dp(16.0f);
            ai.k2 k2Var = yf.j0.a;
            rp0Var.setOutlineProvider(new yf.h0(0, dp));
            addView(rp0Var, w7.y5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        f6Var2 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
        bq0 bq0Var = new bq0(cq0Var, context5, f6Var2);
        this.E = bq0Var;
        ch.d c10 = cq0Var.E.c(bq0Var, null, false);
        f6Var3 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
        dh.e eVar3 = new dh.e(f6Var3);
        eVar3.e = new d2.c(9);
        eVar3.f(0, 0);
        eVar3.e(0, 0);
        eVar3.c(0, 0);
        c10.o(eVar3);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.j.e = true;
        bq0Var.H = c10;
        bq0Var.G = c10;
        bq0Var.F = new mp0(this, i12);
        bq0Var.setVisibility(4);
        addView(bq0Var, w7.y5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, w7.y5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(wp0 wp0Var) {
        int i10;
        np0 np0Var = wp0Var.b;
        boolean z10 = wp0Var.H;
        if (z10) {
            np0Var.C0();
        }
        wp0Var.e();
        if (!z10 || (i10 = wp0Var.h0) < 0) {
            return;
        }
        wp0Var.c.h1(i10, wp0Var.p0.f);
        np0Var.post(new mp0(wp0Var, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0117 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        cq0 cq0Var = this.p0;
        boolean z10 = cq0Var.a;
        int i10 = this.m0;
        if (z10) {
            TLRPC.Chat chat = cq0Var.getMessagesController().getChat(0L);
            if (chat != null) {
                if (i10 != 1) {
                    if (this.h == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                        if (this.n != (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) || !cq0.B0(chat.emoji_status, this.r)) {
                        }
                    }
                    return true;
                }
                if (this.h == ChatObject.getColorId(chat) && this.n == ChatObject.getEmojiId(chat)) {
                    TLRPC.PeerColor peerColor = chat.color;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = peerColor instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.s;
                    if (tL_peerColorCollectible != tL_peerColorCollectible2 && ((tL_peerColorCollectible != null || tL_peerColorCollectible2 != null) && (tL_peerColorCollectible == null || tL_peerColorCollectible2 == null || tL_peerColorCollectible.collectible_id != tL_peerColorCollectible2.collectible_id))) {
                    }
                }
                return true;
            }
            return false;
        }
        TLRPC.User currentUser = cq0Var.getUserConfig().getCurrentUser();
        if (currentUser != null) {
            if (i10 == 1) {
                boolean z11 = this.h == (currentUser.color instanceof TLRPC.TL_peerColorCollectible ? -1 : UserObject.getColorId(currentUser));
                boolean z12 = this.n == UserObject.getEmojiId(currentUser);
                TLRPC.PeerColor peerColor2 = currentUser.color;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                boolean z13 = tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 == null && tL_peerColorCollectible4 == null) || !(tL_peerColorCollectible3 == null || tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id);
                if (!z11 || !z12 || !z13) {
                    return true;
                }
            } else {
                boolean z14 = this.h == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : UserObject.getProfileColorId(currentUser));
                boolean z15 = this.n == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : UserObject.getOnlyProfileEmojiId(currentUser));
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                boolean B0 = cq0.B0(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null, this.r);
                if (!z14 || !z15 || !B0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        np0 np0Var = this.b;
        if (np0Var != null) {
            for (int i10 = 0; i10 < np0Var.getChildCount(); i10++) {
                if (np0Var.getChildAt(i10) instanceof org.telegram.ui.Components.t00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        cq0 cq0Var = this.p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = cq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.r = tL_emojiStatusCollectible;
                    this.s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.r = tL_emojiStatusCollectible;
            this.s = null;
        } else {
            TLRPC.User currentUser2 = cq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.n = UserObject.getEmojiId(currentUser2);
            this.r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.s = tL_peerColorCollectible;
        }
        if (this.r == null && this.s == null) {
            return;
        }
        this.h = -1;
        this.n = 0L;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.E || this.H) {
            return super.drawChild(canvas, view, j3);
        }
        return false;
    }

    public final void e() {
        k();
        this.d.l();
    }

    public final void f(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        cq0 cq0Var = this.p0;
        org.telegram.ui.Cells.f3 f3Var = this.e;
        if (tL_starGiftUnique != null) {
            zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                f3Var.b = yh.w7.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.b).d()), true);
                f3Var.c = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                f3Var.b = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                f3Var.c = null;
            }
        } else {
            f3Var.b = (cq0Var.getUserConfig().isPremium() || cq0Var.a) ? this.r != null ? this.P : this.O : this.N;
            f3Var.c = null;
        }
        if (cq0Var.C0() == this) {
            cq0Var.R = this;
            cq0Var.Q.g((CharSequence) f3Var.b, z10, true);
            cq0Var.Q.f((SpannableStringBuilder) f3Var.c, z10);
        }
    }

    public final void g() {
        ci.d dVar = this.p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        rp0 rp0Var = this.v;
        if (rp0Var != null) {
            rp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new yb(this, 3));
        bq0 bq0Var = this.E;
        if (bq0Var != null) {
            l(bq0Var);
        }
    }

    public final void h() {
        int i10;
        int i11 = this.p0.f;
        View view = this.w;
        bq0 bq0Var = this.E;
        if (bq0Var == null || (i10 = this.h0) < 0) {
            this.G = false;
            this.H = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (bq0Var != null) {
                bq0Var.setVisibility(4);
                boolean z10 = this.G;
                if (bq0Var.I != z10) {
                    bq0Var.I = z10;
                    bq0Var.L.D0(2);
                    bq0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        s4.s sVar = this.c;
        this.F = sVar.m(i10);
        np0 np0Var = this.b;
        int paddingTop = np0Var.getPaddingTop() + i11;
        int L0 = sVar.L0();
        View view2 = this.F;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.H = z11;
            this.G = !z11;
            bq0Var.setVisibility(0);
            bq0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + np0Var.getTop()) - bq0Var.getTop());
        } else if (L0 == -1 || L0 <= this.h0) {
            this.H = false;
            this.G = false;
            bq0Var.setVisibility(0);
            bq0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - bq0Var.getTop());
        } else {
            this.H = true;
            this.G = false;
            bq0Var.setVisibility(0);
            bq0Var.setTranslationY((np0Var.getTop() + paddingTop) - bq0Var.getTop());
        }
        boolean z12 = this.G;
        if (bq0Var.I != z12) {
            bq0Var.I = z12;
            bq0Var.L.D0(2);
            bq0Var.invalidate();
        }
        view.setTranslationY(this.H ? AndroidUtilities.dp(36.0f) + i11 : 0.0f);
        np0Var.invalidate();
        invalidate();
    }

    public final void i() {
        MessageObject messageObject;
        rp0 rp0Var = this.v;
        if (rp0Var != null) {
            org.telegram.ui.Cells.u1[] cells = rp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    zp0 zp0Var = this.f;
                    if (zp0Var != null) {
                        messageObject.overrideLinkColor = zp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.n;
                    messageObject.overrideLinkPeerColor = this.s;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void j(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        int i10;
        cq0 cq0Var;
        ep0 ep0Var;
        int i11;
        zp0 zp0Var = this.f;
        if (zp0Var != null) {
            zp0Var.a(this.h, z10);
        }
        aq0 aq0Var = this.a;
        if (aq0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                aq0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                aq0Var.c(MessagesController.PeerColor.fromCollectible(this.r), z10);
                aq0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    aq0Var.e(0L, false, z10);
                } else {
                    aq0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                aq0Var.b(this.h, z10);
                aq0Var.d(this.n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (ep0Var = (cq0Var = this.p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                ep0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                i11 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                ep0Var.b(i11, this.h, z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            pp0 pp0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                pp0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                pp0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            np0 np0Var = this.b;
            if (i14 >= np0Var.getChildCount()) {
                return;
            }
            View childAt = np0Var.getChildAt(i14);
            if (childAt instanceof kp0) {
                kp0 kp0Var = (kp0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                kp0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == kp0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == kp0Var.getGiftId()), true);
            } else if (childAt instanceof xh.j1) {
                xh.j1 j1Var = (xh.j1) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                j1Var.e((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == j1Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == j1Var.getGiftId()), true);
            }
            i14++;
        }
    }

    public final void k() {
        int i10;
        cq0 cq0Var = this.p0;
        yh.l5 l5Var = cq0Var.b;
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.c0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.f0 = 0;
        ArrayList arrayList = this.l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i11 = 3;
        this.k0 = 3;
        this.R = 2;
        int i12 = this.m0;
        if (i12 == 0 && (this.h >= 0 || this.r != null || this.s != null)) {
            this.V = 3;
            this.k0 = 5;
            this.W = 4;
        }
        yh.l5 l5Var2 = i12 == 1 ? cq0Var.c : l5Var;
        if ((i12 == 0 || i12 == 1) && l5Var2 != null) {
            ArrayList arrayList2 = l5Var2.l;
            int i13 = this.k0;
            this.k0 = i13 + 1;
            this.h0 = i13;
            if (this.K == null) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i14)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i15 = this.k0;
                this.b0 = i15;
                this.k0 = arrayList.size() + i15;
                int size = arrayList.size() + this.f0;
                this.f0 = size;
                int i16 = this.k0;
                this.c0 = i16;
                if (l5Var.i || !l5Var.j) {
                    this.d0 = i16;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i11 = 9;
                    } else if (i17 > 0) {
                        i11 = i17;
                    }
                    int i18 = i16 + i11;
                    this.k0 = i18;
                    this.f0 = size + i11;
                    this.e0 = i18;
                } else if (arrayList.isEmpty()) {
                    int i19 = this.k0;
                    this.j0 = i19;
                    this.k0 = i19 + 2;
                    this.i0 = i19 + 1;
                }
                if (c()) {
                    l5Var2.a();
                }
            } else if (this.J != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                for (int i20 = 0; i20 < this.J.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i20);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i21 = this.k0;
                this.b0 = i21;
                this.k0 = arrayList.size() + i21;
                int size2 = arrayList.size() + this.f0;
                this.f0 = size2;
                int i22 = this.k0;
                this.c0 = i22;
                xh.v3 v3Var = this.J;
                if (v3Var.t || !v3Var.u) {
                    this.d0 = i22;
                    int i23 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i11 = 9;
                    } else if (i23 > 0) {
                        i11 = i23;
                    }
                    int i24 = i22 + i11;
                    this.k0 = i24;
                    this.f0 = size2 + i11;
                    this.e0 = i24;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i25 = this.k0;
            this.k0 = i25 + 1;
            this.g0 = i25;
        }
        int i26 = this.k0;
        this.k0 = i26 + 1;
        this.U = i26;
        bq0 bq0Var = this.E;
        if (bq0Var != null) {
            bq0Var.post(new mp0(this, 1));
        }
    }

    public final void l(bq0 bq0Var) {
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        cq0 cq0Var = this.p0;
        int themedColor = cq0Var.getThemedColor(i10);
        cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7);
        int themedColor2 = cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.z6);
        int themedColor3 = cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
        bq0Var.v.setColor(themedColor);
        bq0Var.x = org.telegram.ui.ActionBar.j6.l1(0.06f, themedColor3);
        bq0Var.y = themedColor2;
        bq0Var.E = themedColor3;
        q60 q60Var = bq0Var.a;
        for (int i11 = 0; i11 < q60Var.getChildCount(); i11++) {
            View childAt = q60Var.getChildAt(i11);
            int S = RecyclerView.S(childAt);
            if (S != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(S == bq0Var.d ? bq0Var.E : bq0Var.y);
                childAt.invalidate();
            }
        }
        q60Var.invalidate();
        bq0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.w;
        np0 np0Var = this.b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            rp0 rp0Var = this.v;
            this.n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + rp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) rp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) np0Var.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.x.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            np0Var.setPadding(np0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), np0Var.getPaddingRight(), np0Var.getPaddingBottom());
        } else {
            this.n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) np0Var.getLayoutParams()).topMargin = this.n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.n0;
        }
        super.onMeasure(i10, i11);
    }
}
