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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class re1 extends org.telegram.ui.Components.n71 implements e10 {
    public final FrameLayout P;
    public final org.telegram.ui.Components.wk0 Q;
    public final f2.m0 R;
    public final oe1 S;
    public n21 T;
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
    public final org.telegram.ui.Components.gw0 j0;
    public final org.telegram.ui.Components.dk0 k0;
    public boolean l0;
    public final qe1 m0;
    public final fv0 n0;
    public final ArrayList o0;
    public final /* synthetic */ we1 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re1(we1 we1Var, Context context) {
        super(context, null);
        this.p0 = we1Var;
        this.U = "empty";
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.o0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        this.n0 = new fv0(this, 7);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.Q = wk0Var;
        oe1 oe1Var = new oe1(this);
        this.S = oe1Var;
        wk0Var.setAdapter(oe1Var);
        f2.m0 m0Var = new f2.m0();
        this.R = m0Var;
        wk0Var.setLayoutManager(m0Var);
        wk0Var.setOnItemClickListener(new c21(this, 9));
        wk0Var.setOnScrollListener(new kb1(this, 2));
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        e00Var.setViewType(7);
        e00Var.w = false;
        e00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, e00Var, 1, null);
        this.j0 = gw0Var;
        gw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        gw0Var.e.setVisibility(8);
        gw0Var.setVisibility(8);
        gw0Var.addView(e00Var, 0);
        gw0Var.setAnimateLayoutChange(true);
        wk0Var.setEmptyView(gw0Var);
        wk0Var.U1 = true;
        wk0Var.V1 = 0;
        frameLayout.addView(gw0Var);
        frameLayout.addView(wk0Var);
        L();
        org.telegram.ui.Components.dk0 dk0Var = new org.telegram.ui.Components.dk0(wk0Var, true);
        this.k0 = dk0Var;
        wk0Var.setItemsEnterAnimator(dk0Var);
        qe1 qe1Var = new qe1(this);
        this.m0 = qe1Var;
        setAdapter(qe1Var);
    }

    public final void J(String str) {
        int i9;
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
            tL_messages_search.offset_id = ((MessageObject) j3.r0.j(1, arrayList)).getId();
        }
        this.l0 = true;
        i9 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_search, new o71(4, this, str));
    }

    public final void K(View view, int i9, String str, boolean z10) {
        this.U = str;
        FrameLayout frameLayout = this.P;
        we1 we1Var = this.p0;
        int i10 = 0;
        if (view != frameLayout) {
            if (view instanceof f10) {
                f10 f10Var = (f10) view;
                f10Var.c.b(0, false);
                f10Var.h(-we1Var.a, 0L, 0L, 0L, of.o0.Y2[((ne1) this.m0.a.get(i9)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.gm0) {
                org.telegram.ui.Components.gm0 gm0Var = (org.telegram.ui.Components.gm0) view;
                gm0Var.a.b(0, false);
                gm0Var.G = str;
                gm0Var.d(false);
                return;
            }
            return;
        }
        n21 n21Var = this.T;
        if (n21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n21Var);
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
            n21 n21Var2 = new n21(19, this, str);
            this.T = n21Var2;
            AndroidUtilities.runOnUIThread(n21Var2, 200L);
            return;
        }
        this.h0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = we1Var.b;
            if (i10 >= arrayList2.size()) {
                L();
                return;
            }
            if (((me1) arrayList2.get(i10)).c != null) {
                arrayList.add(((me1) arrayList2.get(i10)).c);
                ((me1) arrayList2.get(i10)).c.searchQuery = null;
            }
            i10++;
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
            int i9 = this.g0;
            int i10 = i9 + 1;
            this.g0 = i10;
            this.a0 = i9;
            this.b0 = i10;
            int size = arrayList.size() + i10;
            this.g0 = size;
            this.c0 = size;
        }
        ArrayList arrayList2 = this.W;
        if (!arrayList2.isEmpty()) {
            int i11 = this.g0;
            int i12 = i11 + 1;
            this.g0 = i12;
            this.d0 = i11;
            this.e0 = i12;
            int size2 = arrayList2.size() + i12;
            this.g0 = size2;
            this.f0 = size2;
        }
        this.S.l();
    }

    @Override // org.telegram.ui.e10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.p0).actionBar;
        kVar.N(null, null);
    }

    @Override // org.telegram.ui.e10
    public final boolean b(x00 x00Var) {
        if (x00Var == null) {
            return false;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.o0;
            if (i9 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i9);
            if (messageObject != null && messageObject.getId() == x00Var.b && messageObject.getDialogId() == x00Var.a) {
                return true;
            }
            i9++;
        }
    }

    @Override // org.telegram.ui.e10
    public final void c(MessageObject messageObject) {
        int i9;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        we1 we1Var = this.p0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            i9 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i9).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        we1Var.presentFragment(new qn(bundle));
    }

    @Override // org.telegram.ui.e10
    public final void d(MessageObject messageObject, View view, int i9) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.o0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.o2) this.p0).actionBar;
            kVar.r();
        }
    }

    @Override // org.telegram.ui.e10
    public final boolean f() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.p0).actionBar;
        return kVar.s();
    }
}
