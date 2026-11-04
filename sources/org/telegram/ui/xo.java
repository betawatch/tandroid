package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xo extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public org.telegram.ui.Cells.h6 E;
    public final ArrayList F;
    public TLRPC.Chat a;
    public TLRPC.ChatFull b;
    public final long c;
    public ArrayList d;
    public FrameLayout e;
    public org.telegram.ui.Components.tj0 f;
    public wo h;
    public final ArrayList n;
    public LinearLayout r;
    public int s;
    public int w;
    public org.telegram.ui.Cells.h6 x;
    public org.telegram.ui.Cells.h6 y;

    public xo(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.F = new ArrayList();
        this.c = bundle.getLong("chat_id", 0L);
    }

    public final void a0(int i3, boolean z10) {
        if (this.s == i3) {
            return;
        }
        this.s = i3;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            boolean z11 = true;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) arrayList.get(i10);
            if (i3 != i10) {
                z11 = false;
            }
            h6Var.a(z11, z10);
            i10++;
        }
        ArrayList arrayList2 = this.n;
        if (i3 == 1) {
            if (z10) {
                this.d.clear();
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                    if (tL_availableReaction.reaction.equals("👍") || tL_availableReaction.reaction.equals("👎")) {
                        this.d.add(tL_availableReaction.reaction);
                    }
                }
                if (this.d.isEmpty() && arrayList2.size() >= 2) {
                    this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(0)).reaction);
                    this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(1)).reaction);
                }
            }
            wo woVar = this.h;
            if (woVar != null && z10) {
                woVar.o(2, arrayList2.size() + 1);
            }
        } else if (!this.d.isEmpty()) {
            this.d.clear();
            wo woVar2 = this.h;
            if (woVar2 != null && z10) {
                woVar2.p(2, arrayList2.size() + 1);
            }
        }
        wo woVar3 = this.h;
        if (woVar3 != null && z10) {
            woVar3.g(1);
        }
        wo woVar4 = this.h;
        if (woVar4 == null || z10) {
            return;
        }
        woVar4.f();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        final int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746395, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n.addAll(getMediaDataController().n);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        n4Var.setText(org.telegram.messenger.bd.M0(2131753759, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.r = linearLayout;
        linearLayout.setOrientation(1);
        this.r.setClickable(true);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.x = h6Var;
        final int i10 = 0;
        h6Var.c(org.telegram.messenger.bd.M0(2131754291, null), false, true);
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, null);
        this.y = h6Var2;
        h6Var2.c(org.telegram.messenger.bd.M0(2131745302, null), false, true);
        org.telegram.ui.Cells.h6 h6Var3 = new org.telegram.ui.Cells.h6(context, null);
        this.E = h6Var3;
        h6Var3.c(org.telegram.messenger.bd.M0(2131748183, null), false, false);
        this.r.addView(n4Var, b8.mf.o(-1, -2));
        this.r.addView(this.x, b8.mf.o(-1, -2));
        this.r.addView(this.y, b8.mf.o(-1, -2));
        this.r.addView(this.E, b8.mf.o(-1, -2));
        ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.add(this.x);
        arrayList.add(this.y);
        arrayList.add(this.E);
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.uo
            public final /* synthetic */ xo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        final int i11 = 2;
                        final xo xoVar = this.b;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vo
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        xoVar.a0(2, true);
                                        break;
                                    case 1:
                                        xoVar.a0(1, true);
                                        break;
                                    default:
                                        xoVar.a0(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final int i12 = 1;
                        final xo xoVar2 = this.b;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vo
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        xoVar2.a0(2, true);
                                        break;
                                    case 1:
                                        xoVar2.a0(1, true);
                                        break;
                                    default:
                                        xoVar2.a0(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 0;
                        final xo xoVar3 = this.b;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vo
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        xoVar3.a0(2, true);
                                        break;
                                    case 1:
                                        xoVar3.a0(1, true);
                                        break;
                                    default:
                                        xoVar3.a0(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.uo
            public final /* synthetic */ xo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        final int i11 = 2;
                        final xo xoVar = this.b;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vo
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        xoVar.a0(2, true);
                                        break;
                                    case 1:
                                        xoVar.a0(1, true);
                                        break;
                                    default:
                                        xoVar.a0(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final int i12 = 1;
                        final xo xoVar2 = this.b;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vo
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        xoVar2.a0(2, true);
                                        break;
                                    case 1:
                                        xoVar2.a0(1, true);
                                        break;
                                    default:
                                        xoVar2.a0(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 0;
                        final xo xoVar3 = this.b;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vo
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        xoVar3.a0(2, true);
                                        break;
                                    case 1:
                                        xoVar3.a0(1, true);
                                        break;
                                    default:
                                        xoVar3.a0(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i11 = 2;
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.uo
            public final /* synthetic */ xo b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        final int i112 = 2;
                        final xo xoVar = this.b;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vo
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        xoVar.a0(2, true);
                                        break;
                                    case 1:
                                        xoVar.a0(1, true);
                                        break;
                                    default:
                                        xoVar.a0(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final int i12 = 1;
                        final xo xoVar2 = this.b;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vo
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        xoVar2.a0(2, true);
                                        break;
                                    case 1:
                                        xoVar2.a0(1, true);
                                        break;
                                    default:
                                        xoVar2.a0(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 0;
                        final xo xoVar3 = this.b;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vo
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        xoVar3.a0(2, true);
                                        break;
                                    case 1:
                                        xoVar3.a0(1, true);
                                        break;
                                    default:
                                        xoVar3.a0(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        org.telegram.ui.Cells.h6 h6Var4 = this.x;
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(h6Var4, org.telegram.ui.ActionBar.k6.i0(x02, org.telegram.ui.ActionBar.k6.x0(null, i13, false)), org.telegram.ui.ActionBar.r6.N(i12), org.telegram.ui.ActionBar.r6.N(i13), null);
        org.telegram.ui.ActionBar.r6.R(this.y, org.telegram.ui.ActionBar.k6.i0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i13, false)), org.telegram.ui.ActionBar.r6.N(i12), org.telegram.ui.ActionBar.r6.N(i13), null);
        org.telegram.ui.ActionBar.r6.R(this.E, org.telegram.ui.ActionBar.k6.i0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i13, false)), org.telegram.ui.ActionBar.r6.N(i12), org.telegram.ui.ActionBar.r6.N(i13), null);
        a0(this.w, false);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f = tj0Var;
        tj0Var.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.f;
        wo woVar = new wo(this, context);
        this.h = woVar;
        tj0Var2.setAdapter(woVar);
        this.f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f, b8.mf.g());
        this.f.r1();
        this.f.setSectionsDrawBackground(true);
        this.e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.e;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i10 != this.currentAccount) {
            return;
        }
        if (i3 == org.telegram.messenger.hs.V4) {
            ArrayList arrayList = this.n;
            arrayList.clear();
            arrayList.addAll(getMediaDataController().n);
            this.h.f();
            return;
        }
        if (i3 == org.telegram.messenger.hs.y1 && ((Long) objArr[0]).longValue() == (-this.c)) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var == null || q4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return b8.qf.a(new h6(3, this), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.z6, org.telegram.ui.ActionBar.k6.i6, org.telegram.ui.ActionBar.k6.a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.p7, org.telegram.ui.ActionBar.k6.f6, org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.c;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        this.a = M0;
        if (M0 == null) {
            TLRPC.Chat P = org.telegram.messenger.qr.a0(this.currentAccount).P(j10);
            this.a = P;
            if (P == null) {
                return false;
            }
            getMessagesController().Q3(this.a, true);
            if (this.b == null) {
                TLRPC.ChatFull F0 = org.telegram.messenger.qr.a0(this.currentAccount).F0(this.c, org.telegram.messenger.t3.T(this.a), new CountDownLatch(1), false, false, 0);
                this.b = F0;
                if (F0 == null) {
                    return false;
                }
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.hs.V4);
        getNotificationCenter().c(this, org.telegram.messenger.hs.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hp messagesController = getMessagesController();
        int i3 = this.s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j10 = this.c;
        tL_messages_setChatAvailableReactions.peer = messagesController.j1(-j10);
        if (i3 == 2) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsNone();
        } else if (i3 == 0) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsAll();
        } else {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = new TLRPC.TL_chatReactionsSome();
            tL_messages_setChatAvailableReactions.available_reactions = tL_chatReactionsSome;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_reactionEmoji.emoticon = (String) arrayList.get(i10);
                tL_chatReactionsSome.reactions.add(tL_reactionEmoji);
            }
        }
        messagesController.getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new org.telegram.messenger.fj(messagesController, j10, tL_messages_setChatAvailableReactions, 4));
        getNotificationCenter().n(this, org.telegram.messenger.hs.V4);
        getNotificationCenter().n(this, org.telegram.messenger.hs.y1);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
