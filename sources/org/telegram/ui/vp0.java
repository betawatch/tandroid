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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class vp0 extends FrameLayout {
    public static final /* synthetic */ int q0 = 0;
    public final aq0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public yh.t3 J;
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
    public final zp0 a;
    public int a0;
    public final mp0 b;
    public int b0;
    public final s4.s c;
    public int c0;
    public final op0 d;
    public int d0;
    public final n7.z0 e;
    public int e0;
    public yp0 f;
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
    public sp0 o0;
    public final /* synthetic */ bq0 p0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final qp0 v;
    public final View w;
    public final View x;
    public up0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vp0(bq0 bq0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.p0 = bq0Var;
        int i12 = 7;
        Object[] objArr = 0;
        this.e = new n7.z0(i12, false);
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
        this.f0 = 0;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = bq0Var.getResourceProvider();
        bh.b bVar = bq0Var.G;
        mp0 mp0Var = new mp0(this, context2, resourceProvider, i10);
        this.b = mp0Var;
        mp0Var.setClipToPadding(false);
        mp0Var.setSections(true);
        ((s4.j) mp0Var.getItemAnimator()).m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.c = sVar;
        sVar.O = new di.x1(this, 6);
        mp0Var.i(new di.r1(this, i12));
        mp0Var.setLayoutManager(sVar);
        op0 op0Var = new op0(this, context, i10);
        this.d = op0Var;
        mp0Var.setAdapter(op0Var);
        mp0Var.setOnItemClickListener(new org.telegram.ui.Components.pm0(this, i10, 1));
        mp0Var.j(new pp0(this, i10));
        addView(mp0Var, w7.x5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String string = LocaleController.getString(bq0Var.a ? R.string.ChannelColorApply : R.string.UserColorApply);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.pr.h);
        jVar.C = false;
        jVar.m = false;
        mp0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.w = view;
        bh.c cVar = new bh.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.q = 220;
        view.setBackground(cVar);
        addView(view, w7.x5.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i11 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
            this.a = new zp0(i11, 0L, context3, f6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.x = view2;
            bh.c cVar2 = new bh.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.x5.e(-1, 16, 55));
            Context context4 = getContext();
            d5Var = ((org.telegram.ui.ActionBar.n2) bq0Var).parentLayout;
            f6Var = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
            qp0 qp0Var = new qp0(context4, d5Var, 3, 0L, f6Var);
            this.v = qp0Var;
            qp0Var.setImportantForAccessibility(4);
            qp0Var.r = bq0Var;
            qp0Var.setClipToOutline(true);
            float dp = AndroidUtilities.dp(16.0f);
            bi.z1 z1Var = yf.j0.a;
            qp0Var.setOutlineProvider(new yf.i0(0, dp));
            addView(qp0Var, w7.x5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        f6Var2 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
        aq0 aq0Var = new aq0(bq0Var, context5, f6Var2);
        this.E = aq0Var;
        dh.d c10 = bq0Var.E.c(aq0Var, null, false);
        f6Var3 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
        eh.e eVar = new eh.e(f6Var3);
        eVar.e = new di.w9(9);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.n(eVar);
        c10.p(AndroidUtilities.dp(18.0f));
        c10.h.e = true;
        aq0Var.H = c10;
        aq0Var.G = c10;
        aq0Var.F = new lp0(this, objArr == true ? 1 : 0);
        aq0Var.setVisibility(4);
        addView(aq0Var, w7.x5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, w7.x5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(vp0 vp0Var) {
        int i10;
        mp0 mp0Var = vp0Var.b;
        boolean z10 = vp0Var.H;
        if (z10) {
            mp0Var.B0();
        }
        vp0Var.e();
        if (!z10 || (i10 = vp0Var.h0) < 0) {
            return;
        }
        vp0Var.c.h1(i10, vp0Var.p0.f);
        mp0Var.post(new lp0(vp0Var, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0117 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        bq0 bq0Var = this.p0;
        boolean z10 = bq0Var.a;
        int i10 = this.m0;
        if (z10) {
            TLRPC.Chat chat = bq0Var.getMessagesController().getChat(0L);
            if (chat != null) {
                if (i10 != 1) {
                    if (this.h == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                        if (this.n != (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) || !bq0.B0(chat.emoji_status, this.r)) {
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
        TLRPC.User currentUser = bq0Var.getUserConfig().getCurrentUser();
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
                boolean B0 = bq0.B0(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus : null, this.r);
                if (!z14 || !z15 || !B0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        mp0 mp0Var = this.b;
        if (mp0Var != null) {
            for (int i10 = 0; i10 < mp0Var.getChildCount(); i10++) {
                if (mp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.t00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        bq0 bq0Var = this.p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = bq0Var.getUserConfig().getCurrentUser();
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
            TLRPC.User currentUser2 = bq0Var.getUserConfig().getCurrentUser();
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
        bq0 bq0Var = this.p0;
        n7.z0 z0Var = this.e;
        if (tL_starGiftUnique != null) {
            zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                z0Var.b = zh.v7.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.b).d()), true);
                z0Var.c = zh.v7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                z0Var.b = zh.v7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                z0Var.c = null;
            }
        } else {
            z0Var.b = (bq0Var.getUserConfig().isPremium() || bq0Var.a) ? this.r != null ? this.P : this.O : this.N;
            z0Var.c = null;
        }
        if (bq0Var.C0() == this) {
            bq0Var.R = this;
            bq0Var.Q.g((CharSequence) z0Var.b, z10, true);
            bq0Var.Q.f((SpannableStringBuilder) z0Var.c, z10);
        }
    }

    public final void g() {
        di.d dVar = this.p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        qp0 qp0Var = this.v;
        if (qp0Var != null) {
            qp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new xb(this, 3));
        aq0 aq0Var = this.E;
        if (aq0Var != null) {
            l(aq0Var);
        }
    }

    public final void h() {
        int i10;
        int i11 = this.p0.f;
        View view = this.w;
        aq0 aq0Var = this.E;
        if (aq0Var == null || (i10 = this.h0) < 0) {
            this.G = false;
            this.H = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (aq0Var != null) {
                aq0Var.setVisibility(4);
                boolean z10 = this.G;
                if (aq0Var.I != z10) {
                    aq0Var.I = z10;
                    aq0Var.L.D0(2);
                    aq0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        s4.s sVar = this.c;
        this.F = sVar.m(i10);
        mp0 mp0Var = this.b;
        int paddingTop = mp0Var.getPaddingTop() + i11;
        int L0 = sVar.L0();
        View view2 = this.F;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.H = z11;
            this.G = !z11;
            aq0Var.setVisibility(0);
            aq0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + mp0Var.getTop()) - aq0Var.getTop());
        } else if (L0 == -1 || L0 <= this.h0) {
            this.H = false;
            this.G = false;
            aq0Var.setVisibility(0);
            aq0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - aq0Var.getTop());
        } else {
            this.H = true;
            this.G = false;
            aq0Var.setVisibility(0);
            aq0Var.setTranslationY((mp0Var.getTop() + paddingTop) - aq0Var.getTop());
        }
        boolean z12 = this.G;
        if (aq0Var.I != z12) {
            aq0Var.I = z12;
            aq0Var.L.D0(2);
            aq0Var.invalidate();
        }
        view.setTranslationY(this.H ? AndroidUtilities.dp(36.0f) + i11 : 0.0f);
        mp0Var.invalidate();
        invalidate();
    }

    public final void i() {
        MessageObject messageObject;
        qp0 qp0Var = this.v;
        if (qp0Var != null) {
            org.telegram.ui.Cells.t1[] cells = qp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    yp0 yp0Var = this.f;
                    if (yp0Var != null) {
                        messageObject.overrideLinkColor = yp0Var.getColorId();
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
        bq0 bq0Var;
        ep0 ep0Var;
        int i11;
        yp0 yp0Var = this.f;
        if (yp0Var != null) {
            yp0Var.a(this.h, z10);
        }
        zp0 zp0Var = this.a;
        if (zp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                zp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                zp0Var.c(MessagesController.PeerColor.fromCollectible(this.r), z10);
                zp0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    zp0Var.e(0L, false, z10);
                } else {
                    zp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                zp0Var.b(this.h, z10);
                zp0Var.d(this.n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (ep0Var = (bq0Var = this.p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                ep0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                i11 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                ep0Var.b(i11, this.h, z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            op0 op0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                op0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                op0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            mp0 mp0Var = this.b;
            if (i14 >= mp0Var.getChildCount()) {
                return;
            }
            View childAt = mp0Var.getChildAt(i14);
            if (childAt instanceof jp0) {
                jp0 jp0Var = (jp0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                jp0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == jp0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == jp0Var.getGiftId()), true);
            } else if (childAt instanceof yh.h1) {
                yh.h1 h1Var = (yh.h1) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                h1Var.e((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == h1Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == h1Var.getGiftId()), true);
            }
            i14++;
        }
    }

    public final void k() {
        int i10;
        bq0 bq0Var = this.p0;
        zh.j5 j5Var = bq0Var.b;
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
        zh.j5 j5Var2 = i12 == 1 ? bq0Var.c : j5Var;
        if ((i12 == 0 || i12 == 1) && j5Var2 != null) {
            ArrayList arrayList2 = j5Var2.l;
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
                if (j5Var.i || !j5Var.j) {
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
                    j5Var2.a();
                }
            } else if (this.J != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
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
                yh.t3 t3Var = this.J;
                if (t3Var.t || !t3Var.u) {
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
        aq0 aq0Var = this.E;
        if (aq0Var != null) {
            aq0Var.post(new lp0(this, 1));
        }
    }

    public final void l(aq0 aq0Var) {
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        bq0 bq0Var = this.p0;
        int themedColor = bq0Var.getThemedColor(i10);
        bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7);
        int themedColor2 = bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.z6);
        int themedColor3 = bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
        aq0Var.v.setColor(themedColor);
        aq0Var.x = org.telegram.ui.ActionBar.j6.l1(0.06f, themedColor3);
        aq0Var.y = themedColor2;
        aq0Var.E = themedColor3;
        r60 r60Var = aq0Var.a;
        for (int i11 = 0; i11 < r60Var.getChildCount(); i11++) {
            View childAt = r60Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == aq0Var.d ? aq0Var.E : aq0Var.y);
                childAt.invalidate();
            }
        }
        r60Var.invalidate();
        aq0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.w;
        mp0 mp0Var = this.b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            qp0 qp0Var = this.v;
            this.n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + qp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) qp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) mp0Var.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.x.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(16.0f);
            mp0Var.setPadding(mp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), mp0Var.getPaddingRight(), mp0Var.getPaddingBottom());
        } else {
            this.n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) mp0Var.getLayoutParams()).topMargin = this.n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.n0;
        }
        super.onMeasure(i10, i11);
    }
}
