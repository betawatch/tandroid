package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class se1 extends org.telegram.ui.Components.p71 implements h10 {
    public final FrameLayout P;
    public final org.telegram.ui.Components.zk0 Q;
    public final f2.k0 R;
    public final pe1 S;
    public m21 T;
    public String U;
    public final ArrayList V;
    public final ArrayList W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public boolean h0;
    public boolean i0;
    public final org.telegram.ui.Components.iw0 j0;
    public final org.telegram.ui.Components.gk0 k0;
    public boolean l0;
    public final re1 m0;
    public final gv0 n0;
    public final ArrayList o0;
    public final /* synthetic */ we1 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se1(we1 we1Var, Context context) {
        super(context, null);
        this.p0 = we1Var;
        this.U = "empty";
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.o0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        this.n0 = new gv0(this, 7);
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.Q = zk0Var;
        pe1 pe1Var = new pe1(this);
        this.S = pe1Var;
        zk0Var.setAdapter(pe1Var);
        f2.k0 k0Var = new f2.k0();
        this.R = k0Var;
        zk0Var.setLayoutManager(k0Var);
        zk0Var.setOnItemClickListener(new b21(this, 9));
        zk0Var.setOnScrollListener(new ib1(this, 2));
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
        h00Var.setViewType(7);
        h00Var.w = false;
        h00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(context, h00Var, 1, null);
        this.j0 = iw0Var;
        iw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        iw0Var.e.setVisibility(8);
        iw0Var.setVisibility(8);
        iw0Var.addView(h00Var, 0);
        iw0Var.setAnimateLayoutChange(true);
        zk0Var.setEmptyView(iw0Var);
        zk0Var.U1 = true;
        zk0Var.V1 = 0;
        frameLayout.addView(iw0Var);
        frameLayout.addView(zk0Var);
        L();
        org.telegram.ui.Components.gk0 gk0Var = new org.telegram.ui.Components.gk0(zk0Var, true);
        this.k0 = gk0Var;
        zk0Var.setItemsEnterAnimator(gk0Var);
        re1 re1Var = new re1(this);
        this.m0 = re1Var;
        setAdapter(re1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.l0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        we1 we1Var = this.p0;
        tL_messages_search.peer = we1Var.getMessagesController().getInputPeer(-we1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.W;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) i0.a.i(1, arrayList)).getId();
        }
        this.l0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) we1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new rc1(1, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.U = str;
        FrameLayout frameLayout = this.P;
        we1 we1Var = this.p0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof i10) {
                i10 i10Var = (i10) view;
                i10Var.c.b(0, false);
                i10Var.h(-we1Var.a, 0L, 0L, 0L, pf.g0.Y2[((oe1) this.m0.a.get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.jm0) {
                org.telegram.ui.Components.jm0 jm0Var = (org.telegram.ui.Components.jm0) view;
                jm0Var.a.b(0, false);
                jm0Var.G = str;
                jm0Var.d(false);
                return;
            }
            return;
        }
        m21 m21Var = this.T;
        if (m21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m21Var);
            this.T = null;
        }
        this.l0 = false;
        this.i0 = false;
        ArrayList arrayList = this.V;
        arrayList.clear();
        this.W.clear();
        L();
        if (!TextUtils.isEmpty(str)) {
            L();
            this.h0 = true;
            this.j0.e(true, true);
            m21 m21Var2 = new m21(19, this, str);
            this.T = m21Var2;
            AndroidUtilities.runOnUIThread(m21Var2, 200L);
            return;
        }
        this.h0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = we1Var.b;
            if (i11 >= arrayList2.size()) {
                L();
                return;
            }
            if (((ne1) arrayList2.get(i11)).c != null) {
                arrayList.add(((ne1) arrayList2.get(i11)).c);
                ((ne1) arrayList2.get(i11)).c.searchQuery = null;
            }
            i11++;
        }
    }

    public final void L() {
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = 0;
        ArrayList arrayList = this.V;
        if (!arrayList.isEmpty()) {
            int i10 = this.g0;
            int i11 = i10 + 1;
            this.g0 = i11;
            this.a0 = i10;
            this.b0 = i11;
            int size = arrayList.size() + i11;
            this.g0 = size;
            this.c0 = size;
        }
        ArrayList arrayList2 = this.W;
        if (!arrayList2.isEmpty()) {
            int i12 = this.g0;
            int i13 = i12 + 1;
            this.g0 = i13;
            this.d0 = i12;
            this.e0 = i13;
            int size2 = arrayList2.size() + i13;
            this.g0 = size2;
            this.f0 = size2;
        }
        this.S.l();
    }

    @Override // org.telegram.ui.h10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.p0).actionBar;
        kVar.O(null, null);
    }

    @Override // org.telegram.ui.h10
    public final boolean b(a10 a10Var) {
        if (a10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.o0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == a10Var.b && messageObject.getDialogId() == a10Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.h10
    public final void c(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        we1 we1Var = this.p0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) we1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        we1Var.presentFragment(new rn(bundle));
    }

    @Override // org.telegram.ui.h10
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.o0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.p0).actionBar;
            kVar.s();
        }
    }

    @Override // org.telegram.ui.h10
    public final boolean f() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.p0).actionBar;
        return kVar.t();
    }
}
