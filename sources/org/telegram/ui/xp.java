package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xp extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList E;
    public TLRPC.Chat a;
    public TLRPC.ChatFull b;
    public final long c;
    public ArrayList d;
    public FrameLayout e;
    public org.telegram.ui.Components.nm0 f;
    public wp h;
    public final ArrayList n;
    public LinearLayout r;
    public int s;
    public int v;
    public org.telegram.ui.Cells.o6 w;
    public org.telegram.ui.Cells.o6 x;
    public org.telegram.ui.Cells.o6 y;

    public xp(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.E = new ArrayList();
        this.c = bundle.getLong("chat_id", 0L);
    }

    public final void W(int i10, boolean z10) {
        if (this.s == i10) {
            return;
        }
        this.s = i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) arrayList.get(i11);
            if (i10 != i11) {
                z11 = false;
            }
            o6Var.a(z11, z10);
            i11++;
        }
        ArrayList arrayList2 = this.n;
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
            wp wpVar = this.h;
            if (wpVar != null && z10) {
                wpVar.s(2, arrayList2.size() + 1);
            }
        } else if (!this.d.isEmpty()) {
            this.d.clear();
            wp wpVar2 = this.h;
            if (wpVar2 != null && z10) {
                wpVar2.t(2, arrayList2.size() + 1);
            }
        }
        wp wpVar3 = this.h;
        if (wpVar3 != null && z10) {
            wpVar3.m(1);
        }
        wp wpVar4 = this.h;
        if (wpVar4 == null || z10) {
            return;
        }
        wpVar4.l();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n.addAll(getMediaDataController().getEnabledReactionsList());
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
        q4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout = new LinearLayout(context);
        this.r = linearLayout;
        linearLayout.setOrientation(1);
        this.r.setClickable(true);
        org.telegram.ui.Cells.o6 o6Var = new org.telegram.ui.Cells.o6(context, null);
        this.w = o6Var;
        o6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.o6 o6Var2 = new org.telegram.ui.Cells.o6(context, null);
        this.x = o6Var2;
        o6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.o6 o6Var3 = new org.telegram.ui.Cells.o6(context, null);
        this.y = o6Var3;
        o6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.r.addView(q4Var, org.telegram.ui.Components.kb1.r(-1, -2));
        this.r.addView(this.w, org.telegram.ui.Components.kb1.r(-1, -2));
        this.r.addView(this.x, org.telegram.ui.Components.kb1.r(-1, -2));
        this.r.addView(this.y, org.telegram.ui.Components.kb1.r(-1, -2));
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.add(this.w);
        arrayList.add(this.x);
        arrayList.add(this.y);
        final int i10 = 0;
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.up
            public final /* synthetic */ xp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        final int i11 = 2;
                        final xp xpVar = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        xpVar.W(2, true);
                                        break;
                                    case 1:
                                        xpVar.W(1, true);
                                        break;
                                    default:
                                        xpVar.W(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final int i12 = 1;
                        final xp xpVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        xpVar2.W(2, true);
                                        break;
                                    case 1:
                                        xpVar2.W(1, true);
                                        break;
                                    default:
                                        xpVar2.W(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 0;
                        final xp xpVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        xpVar3.W(2, true);
                                        break;
                                    case 1:
                                        xpVar3.W(1, true);
                                        break;
                                    default:
                                        xpVar3.W(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i11 = 1;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.up
            public final /* synthetic */ xp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        final int i112 = 2;
                        final xp xpVar = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        xpVar.W(2, true);
                                        break;
                                    case 1:
                                        xpVar.W(1, true);
                                        break;
                                    default:
                                        xpVar.W(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final int i12 = 1;
                        final xp xpVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        xpVar2.W(2, true);
                                        break;
                                    case 1:
                                        xpVar2.W(1, true);
                                        break;
                                    default:
                                        xpVar2.W(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 0;
                        final xp xpVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        xpVar3.W(2, true);
                                        break;
                                    case 1:
                                        xpVar3.W(1, true);
                                        break;
                                    default:
                                        xpVar3.W(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i12 = 2;
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.up
            public final /* synthetic */ xp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        final int i112 = 2;
                        final xp xpVar = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        xpVar.W(2, true);
                                        break;
                                    case 1:
                                        xpVar.W(1, true);
                                        break;
                                    default:
                                        xpVar.W(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final int i122 = 1;
                        final xp xpVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i122) {
                                    case 0:
                                        xpVar2.W(2, true);
                                        break;
                                    case 1:
                                        xpVar2.W(1, true);
                                        break;
                                    default:
                                        xpVar2.W(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 0;
                        final xp xpVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        xpVar3.W(2, true);
                                        break;
                                    case 1:
                                        xpVar3.W(1, true);
                                        break;
                                    default:
                                        xpVar3.W(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        org.telegram.ui.Cells.o6 o6Var4 = this.w;
        int i13 = org.telegram.ui.ActionBar.y6.d6;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i13, false);
        int i14 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.ActionBar.f7.R(o6Var4, org.telegram.ui.ActionBar.y6.h0(x02, org.telegram.ui.ActionBar.y6.x0(null, i14, false)), org.telegram.ui.ActionBar.f7.N(i13), org.telegram.ui.ActionBar.f7.N(i14), null);
        org.telegram.ui.ActionBar.f7.R(this.x, org.telegram.ui.ActionBar.y6.h0(org.telegram.ui.ActionBar.y6.x0(null, i13, false), org.telegram.ui.ActionBar.y6.x0(null, i14, false)), org.telegram.ui.ActionBar.f7.N(i13), org.telegram.ui.ActionBar.f7.N(i14), null);
        org.telegram.ui.ActionBar.f7.R(this.y, org.telegram.ui.ActionBar.y6.h0(org.telegram.ui.ActionBar.y6.x0(null, i13, false), org.telegram.ui.ActionBar.y6.x0(null, i14, false)), org.telegram.ui.ActionBar.f7.N(i13), org.telegram.ui.ActionBar.f7.N(i14), null);
        W(this.v, false);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f = nm0Var;
        nm0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var2 = this.f;
        wp wpVar = new wp(this, context);
        this.h = wpVar;
        nm0Var2.setAdapter(wpVar);
        this.f.setOnItemClickListener(new h(this, 5));
        frameLayout.addView(this.f, org.telegram.ui.Components.kb1.k());
        this.f.u1();
        this.f.setSectionsDrawBackground(true);
        this.e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.l();
        return this.e;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.reactionsDidLoad) {
            ArrayList arrayList = this.n;
            arrayList.clear();
            arrayList.addAll(getMediaDataController().getEnabledReactionsList());
            this.h.l();
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.c)) {
            org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
            if (j5Var == null || j5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        return org.telegram.ui.Components.kb1.C(new j6(3, this), org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.z6, org.telegram.ui.ActionBar.y6.i6, org.telegram.ui.ActionBar.y6.a7, org.telegram.ui.ActionBar.y6.B6, org.telegram.ui.ActionBar.y6.p7, org.telegram.ui.ActionBar.y6.f6, org.telegram.ui.ActionBar.y6.g6, org.telegram.ui.ActionBar.y6.O6, org.telegram.ui.ActionBar.y6.P6, org.telegram.ui.ActionBar.y6.Q6, org.telegram.ui.ActionBar.y6.R6);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.r2
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
        getNotificationCenter().addWeakObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.c, this.s, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
