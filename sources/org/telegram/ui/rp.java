package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rp extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.h6 A;
    public ArrayList B;
    public boolean C;
    public TLRPC.Chat a;
    public TLRPC.ChatFull b;
    public long c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.jl0 f;
    public qp h;
    public org.telegram.ui.Cells.q8 n;
    public ArrayList r;
    public LinearLayout s;
    public int v;
    public int w;
    public org.telegram.ui.Cells.h6 x;
    public org.telegram.ui.Cells.h6 y;

    public final void V(int i10, boolean z10) {
        qp qpVar;
        ArrayList arrayList = this.B;
        ArrayList arrayList2 = this.r;
        if (this.v == i10) {
            return;
        }
        org.telegram.ui.Cells.q8 q8Var = this.n;
        if (q8Var != null) {
            boolean z11 = i10 == 1 || i10 == 0;
            q8Var.setChecked(z11);
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, z11 ? org.telegram.ui.ActionBar.g6.f6 : org.telegram.ui.ActionBar.g6.e6, false);
            if (z11) {
                this.n.b(w02, z11);
            } else {
                this.n.setBackgroundColorAnimatedReverse(w02);
            }
        }
        this.v = i10;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ((org.telegram.ui.Cells.h6) arrayList.get(i11)).a(i10 == i11, z10);
            i11++;
        }
        if (i10 == 1) {
            if (z10) {
                this.d.clear();
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
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
            qp qpVar2 = this.h;
            if (qpVar2 != null && z10) {
                qpVar2.s(this.C ? 1 : 2, arrayList2.size() + 1);
            }
        } else if (!this.d.isEmpty()) {
            this.d.clear();
            qp qpVar3 = this.h;
            if (qpVar3 != null && z10) {
                qpVar3.t(this.C ? 1 : 2, arrayList2.size() + 1);
            }
        }
        if (!this.C && (qpVar = this.h) != null && z10) {
            qpVar.m(1);
        }
        qp qpVar4 = this.h;
        if (qpVar4 == null || z10) {
            return;
        }
        qpVar4.l();
    }

    public final void W() {
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        org.telegram.ui.Cells.q8 q8Var = this.n;
        if (q8Var != null) {
            q8Var.d(org.telegram.ui.ActionBar.g6.g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
        }
        this.h.l();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        ArrayList arrayList = this.B;
        this.C = ChatObject.isChannelAndNotMegaGroup(this.c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.C) {
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            this.n = q8Var;
            q8Var.setHeight(56);
            this.n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.q8 q8Var2 = this.n;
            q8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, q8Var2.e.h ? org.telegram.ui.ActionBar.g6.f6 : org.telegram.ui.ActionBar.g6.e6, false));
            this.n.setTypeface(AndroidUtilities.bold());
            final int i10 = 0;
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.op
                public final /* synthetic */ rp b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            rp rpVar = this.b;
                            rpVar.V(rpVar.n.e.h ? 2 : 1, true);
                            break;
                        case 1:
                            final int i11 = 0;
                            final rp rpVar2 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            rpVar2.V(0, true);
                                            break;
                                        case 1:
                                            rpVar2.V(1, true);
                                            break;
                                        default:
                                            rpVar2.V(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 2:
                            final int i12 = 1;
                            final rp rpVar3 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            rpVar3.V(0, true);
                                            break;
                                        case 1:
                                            rpVar3.V(1, true);
                                            break;
                                        default:
                                            rpVar3.V(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i13 = 2;
                            final rp rpVar4 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            rpVar4.V(0, true);
                                            break;
                                        case 1:
                                            rpVar4.V(1, true);
                                            break;
                                        default:
                                            rpVar4.V(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            linearLayout.addView(this.n, i7.f6.n(-1, -2));
        }
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
        k4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.x = h6Var;
        h6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, null);
        this.y = h6Var2;
        h6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.h6 h6Var3 = new org.telegram.ui.Cells.h6(context, null);
        this.A = h6Var3;
        h6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.s.addView(k4Var, i7.f6.n(-1, -2));
        this.s.addView(this.x, i7.f6.n(-1, -2));
        this.s.addView(this.y, i7.f6.n(-1, -2));
        this.s.addView(this.A, i7.f6.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.x);
        arrayList.add(this.y);
        arrayList.add(this.A);
        final int i11 = 1;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.op
            public final /* synthetic */ rp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        rp rpVar = this.b;
                        rpVar.V(rpVar.n.e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i112 = 0;
                        final rp rpVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        rpVar2.V(0, true);
                                        break;
                                    case 1:
                                        rpVar2.V(1, true);
                                        break;
                                    default:
                                        rpVar2.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i12 = 1;
                        final rp rpVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        rpVar3.V(0, true);
                                        break;
                                    case 1:
                                        rpVar3.V(1, true);
                                        break;
                                    default:
                                        rpVar3.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 2;
                        final rp rpVar4 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        rpVar4.V(0, true);
                                        break;
                                    case 1:
                                        rpVar4.V(1, true);
                                        break;
                                    default:
                                        rpVar4.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i12 = 2;
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.op
            public final /* synthetic */ rp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        rp rpVar = this.b;
                        rpVar.V(rpVar.n.e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i112 = 0;
                        final rp rpVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        rpVar2.V(0, true);
                                        break;
                                    case 1:
                                        rpVar2.V(1, true);
                                        break;
                                    default:
                                        rpVar2.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i122 = 1;
                        final rp rpVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i122) {
                                    case 0:
                                        rpVar3.V(0, true);
                                        break;
                                    case 1:
                                        rpVar3.V(1, true);
                                        break;
                                    default:
                                        rpVar3.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 2;
                        final rp rpVar4 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        rpVar4.V(0, true);
                                        break;
                                    case 1:
                                        rpVar4.V(1, true);
                                        break;
                                    default:
                                        rpVar4.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i13 = 3;
        this.A.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.op
            public final /* synthetic */ rp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        rp rpVar = this.b;
                        rpVar.V(rpVar.n.e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i112 = 0;
                        final rp rpVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        rpVar2.V(0, true);
                                        break;
                                    case 1:
                                        rpVar2.V(1, true);
                                        break;
                                    default:
                                        rpVar2.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i122 = 1;
                        final rp rpVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i122) {
                                    case 0:
                                        rpVar3.V(0, true);
                                        break;
                                    case 1:
                                        rpVar3.V(1, true);
                                        break;
                                    default:
                                        rpVar3.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i132 = 2;
                        final rp rpVar4 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i132) {
                                    case 0:
                                        rpVar4.V(0, true);
                                        break;
                                    case 1:
                                        rpVar4.V(1, true);
                                        break;
                                    default:
                                        rpVar4.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        int i14 = org.telegram.ui.ActionBar.g6.d6;
        k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        org.telegram.ui.Cells.h6 h6Var4 = this.x;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        int i15 = org.telegram.ui.ActionBar.g6.i6;
        h6Var4.setBackground(org.telegram.ui.ActionBar.g6.g0(w02, org.telegram.ui.ActionBar.g6.w0(null, i15, false)));
        this.y.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), org.telegram.ui.ActionBar.g6.w0(null, i15, false)));
        this.A.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, i14, false), org.telegram.ui.ActionBar.g6.w0(null, i15, false)));
        V(this.w, false);
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f = jl0Var;
        jl0Var.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.jl0 jl0Var2 = this.f;
        qp qpVar = new qp(this, context);
        this.h = qpVar;
        jl0Var2.setAdapter(qpVar);
        this.f.setOnItemClickListener(new j(this, 4));
        linearLayout.addView(this.f, i7.f6.l(1.0f, -1, 0));
        this.f.p1();
        this.actionBar.setAdaptiveBackground(this.f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.e;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.r;
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.reactionsDidLoad) {
            arrayList.clear();
            arrayList.addAll(getMediaDataController().getEnabledReactionsList());
            this.h.l();
        } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.c)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return i7.i6.a(new f(this, 8), org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.z6, org.telegram.ui.ActionBar.g6.i6, org.telegram.ui.ActionBar.g6.a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.p7, org.telegram.ui.ActionBar.g6.f6, org.telegram.ui.ActionBar.g6.g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.c;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        this.a = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j10);
            this.a = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.a, true);
                if (this.b == null) {
                    TLRPC.ChatFull loadChatInfo = MessagesStorage.getInstance(this.currentAccount).loadChatInfo(this.c, ChatObject.isChannel(this.a), new CountDownLatch(1), false, false);
                    this.b = loadChatInfo;
                }
            }
            return false;
        }
        getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
