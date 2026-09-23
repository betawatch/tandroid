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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sf1 extends org.telegram.ui.Components.h81 implements t10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.ml0 U;
    public final s4.c0 V;
    public final pf1 W;
    public hb1 a0;
    public String b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public final org.telegram.ui.Components.xw0 n0;
    public final org.telegram.ui.Components.rk0 o0;
    public boolean p0;
    public final rf1 q0;
    public final cw0 r0;
    public final ArrayList s0;
    public final /* synthetic */ wf1 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf1(wf1 wf1Var, Context context) {
        super(context, null);
        this.t0 = wf1Var;
        this.b0 = "empty";
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.r0 = new cw0(this, 7);
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.U = ml0Var;
        pf1 pf1Var = new pf1(this);
        this.W = pf1Var;
        ml0Var.setAdapter(pf1Var);
        s4.c0 c0Var = new s4.c0();
        this.V = c0Var;
        ml0Var.setLayoutManager(c0Var);
        ml0Var.setOnItemClickListener(new s21(this, 10));
        ml0Var.setOnScrollListener(new ge1(this, 1));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(7);
        u00Var.w = false;
        u00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(context, u00Var, 1, null);
        this.n0 = xw0Var;
        xw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        xw0Var.e.setVisibility(8);
        xw0Var.setVisibility(8);
        xw0Var.addView(u00Var, 0);
        xw0Var.setAnimateLayoutChange(true);
        ml0Var.setEmptyView(xw0Var);
        ml0Var.Y1 = true;
        ml0Var.Z1 = 0;
        frameLayout.addView(xw0Var);
        frameLayout.addView(ml0Var);
        L();
        org.telegram.ui.Components.rk0 rk0Var = new org.telegram.ui.Components.rk0(ml0Var, true);
        this.o0 = rk0Var;
        ml0Var.setItemsEnterAnimator(rk0Var);
        rf1 rf1Var = new rf1(this);
        this.q0 = rf1Var;
        setAdapter(rf1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        wf1 wf1Var = this.t0;
        tL_messages_search.peer = wf1Var.getMessagesController().getInputPeer(-wf1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.h(1, arrayList)).getId();
        }
        this.p0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new wb0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.b0 = str;
        FrameLayout frameLayout = this.T;
        wf1 wf1Var = this.t0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof u10) {
                u10 u10Var = (u10) view;
                u10Var.c.b(0, false);
                u10Var.h(-wf1Var.a, 0L, 0L, 0L, gg.s0.c3[((of1) this.q0.a.get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.wm0) {
                org.telegram.ui.Components.wm0 wm0Var = (org.telegram.ui.Components.wm0) view;
                wm0Var.a.b(0, false);
                wm0Var.K = str;
                wm0Var.d(false);
                return;
            }
            return;
        }
        hb1 hb1Var = this.a0;
        if (hb1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(hb1Var);
            this.a0 = null;
        }
        this.p0 = false;
        this.m0 = false;
        ArrayList arrayList = this.c0;
        arrayList.clear();
        this.d0.clear();
        L();
        if (!TextUtils.isEmpty(str)) {
            L();
            this.l0 = true;
            this.n0.e(true, true);
            hb1 hb1Var2 = new hb1(7, this, str);
            this.a0 = hb1Var2;
            AndroidUtilities.runOnUIThread(hb1Var2, 200L);
            return;
        }
        this.l0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = wf1Var.b;
            if (i11 >= arrayList2.size()) {
                L();
                return;
            }
            if (((nf1) arrayList2.get(i11)).c != null) {
                arrayList.add(((nf1) arrayList2.get(i11)).c);
                ((nf1) arrayList2.get(i11)).c.searchQuery = null;
            }
            i11++;
        }
    }

    public final void L() {
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = 0;
        ArrayList arrayList = this.c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.k0;
            int i11 = i10 + 1;
            this.k0 = i11;
            this.e0 = i10;
            this.f0 = i11;
            int size = arrayList.size() + i11;
            this.k0 = size;
            this.g0 = size;
        }
        ArrayList arrayList2 = this.d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.k0;
            int i13 = i12 + 1;
            this.k0 = i13;
            this.h0 = i12;
            this.i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.k0 = size2;
            this.j0 = size2;
        }
        this.W.l();
    }

    @Override // org.telegram.ui.t10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.t0).actionBar;
        kVar.O(null, null);
    }

    @Override // org.telegram.ui.t10
    public final boolean c(m10 m10Var) {
        if (m10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == m10Var.b && messageObject.getDialogId() == m10Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.t10
    public final void d(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        wf1 wf1Var = this.t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        wf1Var.presentFragment(new xn(bundle));
    }

    @Override // org.telegram.ui.t10
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.t0).actionBar;
            kVar.r();
        }
    }

    @Override // org.telegram.ui.t10
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.t0).actionBar;
        return kVar.s();
    }
}
