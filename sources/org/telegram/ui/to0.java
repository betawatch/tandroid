package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class to0 extends FrameLayout {
    public ih.b5 A;
    public TL_stars.StarGift B;
    public final ArrayList C;
    public final HashMap D;
    public final SpannableStringBuilder E;
    public final String F;
    public final String G;
    public int H;
    public int I;
    public int J;
    public final int K;
    public int L;
    public int M;
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
    public final xo0 a;
    public int a0;
    public final lo0 b;
    public final ArrayList b0;
    public final no0 c;
    public final int c0;
    public final View d;
    public int d0;
    public final FrameLayout e;
    public qo0 e0;
    public final nh.d f;
    public final /* synthetic */ yo0 f0;
    public wo0 h;
    public int n;
    public long r;
    public TLRPC.TL_emojiStatusCollectible s;
    public TLRPC.TL_peerColorCollectible v;
    public final org.telegram.ui.Cells.ca w;
    public so0 x;
    public TL_stars.TL_starGiftUnique y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public to0(yo0 yo0Var, Context context, int i10) {
        super(context);
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.f0 = yo0Var;
        this.n = -1;
        this.r = 0L;
        this.s = null;
        this.v = null;
        this.B = null;
        this.C = new ArrayList();
        this.D = new HashMap();
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = 0;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.b0 = new ArrayList();
        this.c0 = i10;
        d();
        lo0 lo0Var = new lo0(this, getContext(), yo0Var.getResourceProvider(), i10);
        this.b = lo0Var;
        ((f2.l) lo0Var.getItemAnimator()).m = false;
        getContext();
        f2.w wVar = new f2.w(3);
        int i12 = 8;
        wVar.O = new ih.n5(this, i12);
        lo0Var.i(new eg.f2(this, i12));
        lo0Var.setLayoutManager(wVar);
        no0 no0Var = new no0(this, context, i10);
        this.c = no0Var;
        lo0Var.setAdapter(no0Var);
        lo0Var.setOnItemClickListener(new org.telegram.ui.Components.nm0(this, i10, 1));
        lo0Var.j(new oo0(this, i10));
        addView(lo0Var, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.e = frameLayout;
        frameLayout.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        View view = new View(getContext());
        this.d = view;
        view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d7));
        view.setAlpha(0.0f);
        frameLayout.addView(view, i7.f6.d(-1, 0.66f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        boolean z10 = yo0Var.a;
        String string = LocaleController.getString(z10 ? R.string.ChannelColorApply : R.string.UserColorApply);
        this.F = string;
        SpannableStringBuilder append = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.E = append;
        String string2 = LocaleController.getString(R.string.UserColorApplyCollectible);
        this.G = string2;
        nh.d dVar = new nh.d(getContext(), yo0Var.getResourceProvider(), true);
        this.f = dVar;
        dVar.e();
        dVar.d.o(true, true, false);
        if (!z10) {
            if (!yo0Var.getUserConfig().isPremium()) {
                string = append;
            } else if (this.s != null) {
                string = string2;
            }
        }
        dVar.g(string, false, true);
        dVar.setOnClickListener(new t50(this, 17));
        frameLayout.addView(dVar, i7.f6.d(-1, 48.0f, 119, 14.0f, 14.66f, 14.0f, 14.0f));
        addView(frameLayout, i7.f6.e(-1, -2, 80));
        lo0Var.j(new m3(this, 23));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.m = false;
        lo0Var.setItemAnimator(lVar);
        if (i10 == 0) {
            Context context2 = getContext();
            i11 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
            c6Var2 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
            xo0 xo0Var = new xo0(i11, 0L, context2, c6Var2);
            this.a = xo0Var;
            i(false);
            addView(xo0Var, i7.f6.e(-1, -2, 55));
        } else {
            Context context3 = getContext();
            b5Var = ((org.telegram.ui.ActionBar.o2) yo0Var).parentLayout;
            c6Var = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context3, b5Var, 3, 0L, c6Var);
            this.w = caVar;
            caVar.setImportantForAccessibility(4);
            caVar.r = yo0Var;
            addView(caVar, i7.f6.e(-1, -2, 55));
        }
        g();
        j();
        setWillNotDraw(false);
    }

    public static void a(to0 to0Var) {
        lo0 lo0Var = to0Var.b;
        FrameLayout frameLayout = to0Var.e;
        if (frameLayout == null) {
            return;
        }
        int i10 = to0Var.c.e.a0 - 1;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < lo0Var.getChildCount(); i12++) {
            View childAt = lo0Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && R <= i10) {
                i11 = Math.max(i11, childAt.getTop());
                if (R == i10) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            i11 = lo0Var.getMeasuredHeight();
        }
        float max = Math.max(0, i11 - (lo0Var.getMeasuredHeight() - AndroidUtilities.dp(76.66f)));
        int i13 = to0Var.c0;
        if (i13 == 0 || i13 == 1) {
            to0Var.d.animate().alpha(max > 0.0f ? 0.0f : 1.0f).start();
            max = 0.0f;
        }
        frameLayout.setTranslationY(max);
    }

    public final boolean b() {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        yo0 yo0Var = this.f0;
        boolean z10 = yo0Var.a;
        int i10 = this.c0;
        if (z10) {
            TLRPC.Chat chat = yo0Var.getMessagesController().getChat(0L);
            if (chat == null) {
                return false;
            }
            if (i10 != 1) {
                if (this.n == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                    if (this.r == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) && yo0.x0(chat.emoji_status, this.s)) {
                        return false;
                    }
                }
            } else if (this.n == ChatObject.getColorId(chat) && this.r == ChatObject.getEmojiId(chat)) {
                TLRPC.PeerColor peerColor = chat.color;
                tL_peerColorCollectible = peerColor instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.v;
                if (tL_peerColorCollectible == tL_peerColorCollectible2) {
                    return false;
                }
                if (tL_peerColorCollectible == null && tL_peerColorCollectible2 == null) {
                    return false;
                }
                if (tL_peerColorCollectible != null && tL_peerColorCollectible2 != null && tL_peerColorCollectible.collectible_id == tL_peerColorCollectible2.collectible_id) {
                    return false;
                }
            }
        } else {
            TLRPC.User currentUser = yo0Var.getUserConfig().getCurrentUser();
            if (currentUser == null) {
                return false;
            }
            if (i10 == 1) {
                if (this.n == (currentUser.color instanceof TLRPC.TL_peerColorCollectible ? -1 : UserObject.getColorId(currentUser)) && this.r == UserObject.getEmojiId(currentUser)) {
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    tL_peerColorCollectible = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = this.v;
                    if (tL_peerColorCollectible == tL_peerColorCollectible3) {
                        return false;
                    }
                    if (tL_peerColorCollectible == null && tL_peerColorCollectible3 == null) {
                        return false;
                    }
                    if (tL_peerColorCollectible != null && tL_peerColorCollectible3 != null && tL_peerColorCollectible.collectible_id == tL_peerColorCollectible3.collectible_id) {
                        return false;
                    }
                }
            } else {
                if (this.n == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : UserObject.getProfileColorId(currentUser))) {
                    if (this.r == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : UserObject.getOnlyProfileEmojiId(currentUser)) && yo0.x0(currentUser.emoji_status, this.s)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean c() {
        lo0 lo0Var = this.b;
        if (lo0Var != null) {
            for (int i10 = 0; i10 < lo0Var.getChildCount(); i10++) {
                if (lo0Var.getChildAt(i10) instanceof org.telegram.ui.Components.p00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.c0;
        yo0 yo0Var = this.f0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = yo0Var.getUserConfig().getCurrentUser();
            this.n = UserObject.getProfileColorId(currentUser);
            this.r = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.s = tL_emojiStatusCollectible;
                    this.v = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.s = tL_emojiStatusCollectible;
            this.v = null;
        } else {
            TLRPC.User currentUser2 = yo0Var.getUserConfig().getCurrentUser();
            this.n = UserObject.getColorId(currentUser2);
            this.r = UserObject.getEmojiId(currentUser2);
            this.s = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.v = tL_peerColorCollectible;
        }
        if (this.s == null && this.v == null) {
            return;
        }
        this.n = -1;
        this.r = 0L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yo0 yo0Var = this.f0;
        if (yo0Var.getParentLayout() != null) {
            ((ActionBarLayout) yo0Var.getParentLayout()).q(canvas, this.d0);
        }
    }

    public final void e() {
        j();
        this.c.l();
    }

    public final void f() {
        nh.d dVar = this.f;
        if (dVar == null) {
            return;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.y;
        if (tL_starGiftUnique == null) {
            yo0 yo0Var = this.f0;
            dVar.g((yo0Var.getUserConfig().isPremium() || yo0Var.a) ? this.s != null ? this.G : this.F : this.E, true, true);
            dVar.f(null, true);
            return;
        }
        kf.a resellAmount = tL_starGiftUnique.getResellAmount(kf.b.a);
        if (tL_starGiftUnique.resale_ton_only) {
            dVar.g(jh.ia.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(kf.b.b).d()), true), true, true);
            dVar.f(jh.ia.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), true);
        } else {
            dVar.g(jh.ia.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), true, true);
            dVar.f(null, true);
        }
    }

    public final void g() {
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        yo0 yo0Var = this.f0;
        int themedColor = yo0Var.getThemedColor(i10);
        lo0 lo0Var = this.b;
        lo0Var.setBackgroundColor(themedColor);
        nh.d dVar = this.f;
        if (dVar != null) {
            dVar.j();
        }
        org.telegram.ui.Cells.ca caVar = this.w;
        if (caVar != null) {
            caVar.invalidate();
        }
        i(true);
        this.e.setBackgroundColor(yo0Var.getThemedColor(i10));
        this.d.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d7));
        AndroidUtilities.forEachViews((RecyclerView) lo0Var, (f5.d) new rb(this, 3));
    }

    public final void h() {
        MessageObject messageObject;
        org.telegram.ui.Cells.ca caVar = this.w;
        if (caVar != null) {
            org.telegram.ui.Cells.s1[] cells = caVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    wo0 wo0Var = this.h;
                    if (wo0Var != null) {
                        messageObject.overrideLinkColor = wo0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.r;
                    messageObject.overrideLinkPeerColor = this.v;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void i(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        int i10;
        yo0 yo0Var;
        eo0 eo0Var;
        int i11;
        wo0 wo0Var = this.h;
        if (wo0Var != null) {
            wo0Var.a(this.n, z10);
        }
        xo0 xo0Var = this.a;
        if (xo0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.s;
            if (tL_emojiStatusCollectible != null) {
                xo0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                xo0Var.c(MessagesController.PeerColor.fromCollectible(this.s), z10);
                xo0Var.d(this.s.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    xo0Var.e(0L, false, z10);
                } else {
                    xo0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                xo0Var.b(this.n, z10);
                xo0Var.d(this.r, false, z10);
            }
        }
        int i12 = this.c0;
        if (i12 == 0 && (eo0Var = (yo0Var = this.f0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.s;
            if (tL_emojiStatusCollectible2 != null) {
                eo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                i11 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                eo0Var.b(i11, this.n, z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.M;
            j();
            no0 no0Var = this.c;
            if (i13 >= 0 && this.M < 0) {
                no0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.M) >= 0) {
                no0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            lo0 lo0Var = this.b;
            if (i14 >= lo0Var.getChildCount()) {
                return;
            }
            View childAt = lo0Var.getChildAt(i14);
            if (childAt instanceof jo0) {
                jo0 jo0Var = (jo0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.s;
                jo0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == jo0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.v) != null && tL_peerColorCollectible2.collectible_id == jo0Var.getGiftId()), true);
            } else if (childAt instanceof ih.y1) {
                ih.y1 y1Var = (ih.y1) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.s;
                y1Var.e((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == y1Var.getGiftId()) || ((tL_peerColorCollectible = this.v) != null && tL_peerColorCollectible.collectible_id == y1Var.getGiftId()), true);
            }
            i14++;
        }
    }

    public final void j() {
        int i10;
        yo0 yo0Var = this.f0;
        jh.k7 k7Var = yo0Var.b;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.R = -1;
        this.S = -1;
        this.Q = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.T = 0;
        ArrayList arrayList = this.b0;
        arrayList.clear();
        this.H = 0;
        this.J = 1;
        int i11 = 3;
        this.a0 = 3;
        this.I = 2;
        int i12 = this.c0;
        if (i12 == 0 && (this.n >= 0 || this.s != null || this.v != null)) {
            this.M = 3;
            this.a0 = 5;
            this.N = 4;
        }
        jh.k7 k7Var2 = i12 == 1 ? yo0Var.c : k7Var;
        if ((i12 == 0 || i12 == 1) && k7Var2 != null) {
            ArrayList arrayList2 = k7Var2.l;
            int i13 = this.a0;
            this.a0 = i13 + 1;
            this.V = i13;
            if (this.B == null) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i14)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i15 = this.a0;
                this.P = i15;
                this.a0 = arrayList.size() + i15;
                int size = arrayList.size() + this.T;
                this.T = size;
                int i16 = this.a0;
                this.Q = i16;
                if (k7Var.i || !k7Var.j) {
                    this.R = i16;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i11 = 9;
                    } else if (i17 > 0) {
                        i11 = i17;
                    }
                    int i18 = i16 + i11;
                    this.a0 = i18;
                    this.T = size + i11;
                    this.S = i18;
                } else if (arrayList.isEmpty()) {
                    int i19 = this.a0;
                    this.a0 = i19 + 1;
                    this.W = i19;
                }
                if (c()) {
                    k7Var2.a();
                }
            } else if (this.A != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                for (int i20 = 0; i20 < this.A.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.A.d.get(i20);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i21 = this.a0;
                this.P = i21;
                this.a0 = arrayList.size() + i21;
                int size2 = arrayList.size() + this.T;
                this.T = size2;
                int i22 = this.a0;
                this.Q = i22;
                ih.b5 b5Var = this.A;
                if (b5Var.t || !b5Var.u) {
                    this.R = i22;
                    int i23 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i11 = 9;
                    } else if (i23 > 0) {
                        i11 = i23;
                    }
                    int i24 = i22 + i11;
                    this.a0 = i24;
                    this.T = size2 + i11;
                    this.S = i24;
                }
                if (c()) {
                    this.A.g(false);
                }
            }
            int i25 = this.a0;
            this.a0 = i25 + 1;
            this.U = i25;
        }
        int i26 = this.a0;
        this.a0 = i26 + 1;
        this.L = i26;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.c0;
        lo0 lo0Var = this.b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            org.telegram.ui.Cells.ca caVar = this.w;
            this.d0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + caVar.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) caVar.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) lo0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            lo0Var.setPadding(0, caVar.getMeasuredHeight(), 0, 0);
        } else {
            this.d0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) lo0Var.getLayoutParams()).topMargin = this.d0;
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.d0;
        }
        super.onMeasure(i10, i11);
    }
}
