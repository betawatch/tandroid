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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zp extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.i6 B;
    public ArrayList C;
    public boolean D;
    public TLRPC.Chat a;
    public TLRPC.ChatFull b;
    public long c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.rl0 f;
    public yp h;
    public org.telegram.ui.Cells.r8 n;
    public ArrayList r;
    public LinearLayout s;
    public int v;
    public int w;
    public org.telegram.ui.Cells.i6 x;
    public org.telegram.ui.Cells.i6 y;

    public final void V(int i10, boolean z4) {
        yp ypVar;
        ArrayList arrayList = this.C;
        ArrayList arrayList2 = this.r;
        if (this.v == i10) {
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = this.n;
        if (r8Var != null) {
            boolean z10 = i10 == 1 || i10 == 0;
            r8Var.setChecked(z10);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, z10 ? org.telegram.ui.ActionBar.j6.f6 : org.telegram.ui.ActionBar.j6.e6, false);
            if (z10) {
                this.n.b(w02, z10);
            } else {
                this.n.setBackgroundColorAnimatedReverse(w02);
            }
        }
        this.v = i10;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ((org.telegram.ui.Cells.i6) arrayList.get(i11)).a(i10 == i11, z4);
            i11++;
        }
        if (i10 == 1) {
            if (z4) {
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
            yp ypVar2 = this.h;
            if (ypVar2 != null && z4) {
                ypVar2.s(this.D ? 1 : 2, arrayList2.size() + 1);
            }
        } else if (!this.d.isEmpty()) {
            this.d.clear();
            yp ypVar3 = this.h;
            if (ypVar3 != null && z4) {
                ypVar3.t(this.D ? 1 : 2, arrayList2.size() + 1);
            }
        }
        if (!this.D && (ypVar = this.h) != null && z4) {
            ypVar.m(1);
        }
        yp ypVar4 = this.h;
        if (ypVar4 == null || z4) {
            return;
        }
        ypVar4.l();
    }

    public final void W() {
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        org.telegram.ui.Cells.r8 r8Var = this.n;
        if (r8Var != null) {
            r8Var.d(org.telegram.ui.ActionBar.j6.g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
        }
        this.h.l();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        ArrayList arrayList = this.C;
        this.D = ChatObject.isChannelAndNotMegaGroup(this.c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.D) {
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.n = r8Var;
            r8Var.setHeight(56);
            this.n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.r8 r8Var2 = this.n;
            r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, r8Var2.e.h ? org.telegram.ui.ActionBar.j6.f6 : org.telegram.ui.ActionBar.j6.e6, false));
            this.n.setTypeface(AndroidUtilities.bold());
            final int i10 = 0;
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wp
                public final /* synthetic */ zp b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            zp zpVar = this.b;
                            zpVar.V(zpVar.n.e.h ? 2 : 1, true);
                            break;
                        case 1:
                            final int i11 = 0;
                            final zp zpVar2 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            zpVar2.V(0, true);
                                            break;
                                        case 1:
                                            zpVar2.V(1, true);
                                            break;
                                        default:
                                            zpVar2.V(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 2:
                            final int i12 = 1;
                            final zp zpVar3 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            zpVar3.V(0, true);
                                            break;
                                        case 1:
                                            zpVar3.V(1, true);
                                            break;
                                        default:
                                            zpVar3.V(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i13 = 2;
                            final zp zpVar4 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            zpVar4.V(0, true);
                                            break;
                                        case 1:
                                            zpVar4.V(1, true);
                                            break;
                                        default:
                                            zpVar4.V(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            linearLayout.addView(this.n, k7.b6.n(-1, -2));
        }
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        l4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.x = i6Var;
        i6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, null);
        this.y = i6Var2;
        i6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.i6 i6Var3 = new org.telegram.ui.Cells.i6(context, null);
        this.B = i6Var3;
        i6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.s.addView(l4Var, k7.b6.n(-1, -2));
        this.s.addView(this.x, k7.b6.n(-1, -2));
        this.s.addView(this.y, k7.b6.n(-1, -2));
        this.s.addView(this.B, k7.b6.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.x);
        arrayList.add(this.y);
        arrayList.add(this.B);
        final int i11 = 1;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wp
            public final /* synthetic */ zp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        zp zpVar = this.b;
                        zpVar.V(zpVar.n.e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i112 = 0;
                        final zp zpVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        zpVar2.V(0, true);
                                        break;
                                    case 1:
                                        zpVar2.V(1, true);
                                        break;
                                    default:
                                        zpVar2.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i12 = 1;
                        final zp zpVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        zpVar3.V(0, true);
                                        break;
                                    case 1:
                                        zpVar3.V(1, true);
                                        break;
                                    default:
                                        zpVar3.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 2;
                        final zp zpVar4 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        zpVar4.V(0, true);
                                        break;
                                    case 1:
                                        zpVar4.V(1, true);
                                        break;
                                    default:
                                        zpVar4.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i12 = 2;
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wp
            public final /* synthetic */ zp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        zp zpVar = this.b;
                        zpVar.V(zpVar.n.e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i112 = 0;
                        final zp zpVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        zpVar2.V(0, true);
                                        break;
                                    case 1:
                                        zpVar2.V(1, true);
                                        break;
                                    default:
                                        zpVar2.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i122 = 1;
                        final zp zpVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i122) {
                                    case 0:
                                        zpVar3.V(0, true);
                                        break;
                                    case 1:
                                        zpVar3.V(1, true);
                                        break;
                                    default:
                                        zpVar3.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 2;
                        final zp zpVar4 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        zpVar4.V(0, true);
                                        break;
                                    case 1:
                                        zpVar4.V(1, true);
                                        break;
                                    default:
                                        zpVar4.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i13 = 3;
        this.B.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wp
            public final /* synthetic */ zp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        zp zpVar = this.b;
                        zpVar.V(zpVar.n.e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i112 = 0;
                        final zp zpVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        zpVar2.V(0, true);
                                        break;
                                    case 1:
                                        zpVar2.V(1, true);
                                        break;
                                    default:
                                        zpVar2.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i122 = 1;
                        final zp zpVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i122) {
                                    case 0:
                                        zpVar3.V(0, true);
                                        break;
                                    case 1:
                                        zpVar3.V(1, true);
                                        break;
                                    default:
                                        zpVar3.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i132 = 2;
                        final zp zpVar4 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i132) {
                                    case 0:
                                        zpVar4.V(0, true);
                                        break;
                                    case 1:
                                        zpVar4.V(1, true);
                                        break;
                                    default:
                                        zpVar4.V(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        int i14 = org.telegram.ui.ActionBar.j6.d6;
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        org.telegram.ui.Cells.i6 i6Var4 = this.x;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        int i15 = org.telegram.ui.ActionBar.j6.i6;
        i6Var4.setBackground(org.telegram.ui.ActionBar.j6.g0(w02, org.telegram.ui.ActionBar.j6.w0(null, i15, false)));
        this.y.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), org.telegram.ui.ActionBar.j6.w0(null, i15, false)));
        this.B.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i14, false), org.telegram.ui.ActionBar.j6.w0(null, i15, false)));
        V(this.w, false);
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.f = rl0Var;
        rl0Var.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.rl0 rl0Var2 = this.f;
        yp ypVar = new yp(this, context);
        this.h = ypVar;
        rl0Var2.setAdapter(ypVar);
        this.f.setOnItemClickListener(new j(this, 4));
        linearLayout.addView(this.f, k7.b6.l(1.0f, -1, 0));
        this.f.o1();
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
            org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
            if (e5Var == null || e5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        return k7.e6.a(new f(this, 8), org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.z6, org.telegram.ui.ActionBar.j6.i6, org.telegram.ui.ActionBar.j6.a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.p7, org.telegram.ui.ActionBar.j6.f6, org.telegram.ui.ActionBar.j6.g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.p2
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
