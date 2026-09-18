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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class zf1 extends org.telegram.ui.Components.x81 implements w10 {
    public final FrameLayout U;
    public final org.telegram.ui.Components.wl0 V;
    public final s4.c0 W;
    public final wf1 a0;
    public x81 b0;
    public String c0;
    public final ArrayList d0;
    public final ArrayList e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public final org.telegram.ui.Components.kx0 o0;
    public final org.telegram.ui.Components.bl0 p0;
    public boolean q0;
    public final yf1 r0;
    public final jw0 s0;
    public final ArrayList t0;
    public final /* synthetic */ dg1 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf1(dg1 dg1Var, Context context) {
        super(context, null);
        this.u0 = dg1Var;
        this.c0 = "empty";
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.t0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        this.s0 = new jw0(this, 7);
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.V = wl0Var;
        wf1 wf1Var = new wf1(this);
        this.a0 = wf1Var;
        wl0Var.setAdapter(wf1Var);
        s4.c0 c0Var = new s4.c0();
        this.W = c0Var;
        wl0Var.setLayoutManager(c0Var);
        wl0Var.setOnItemClickListener(new z21(this, 10));
        wl0Var.setOnScrollListener(new ne1(this, 1));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(7);
        t00Var.w = false;
        t00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.kx0 kx0Var = new org.telegram.ui.Components.kx0(context, t00Var, 1, null);
        this.o0 = kx0Var;
        kx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        kx0Var.e.setVisibility(8);
        kx0Var.setVisibility(8);
        kx0Var.addView(t00Var, 0);
        kx0Var.setAnimateLayoutChange(true);
        wl0Var.setEmptyView(kx0Var);
        wl0Var.Y1 = true;
        wl0Var.Z1 = 0;
        frameLayout.addView(kx0Var);
        frameLayout.addView(wl0Var);
        M();
        org.telegram.ui.Components.bl0 bl0Var = new org.telegram.ui.Components.bl0(wl0Var, true);
        this.p0 = bl0Var;
        wl0Var.setItemsEnterAnimator(bl0Var);
        yf1 yf1Var = new yf1(this);
        this.r0 = yf1Var;
        setAdapter(yf1Var);
    }

    public final void K(String str) {
        int i10;
        if (this.q0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        dg1 dg1Var = this.u0;
        tL_messages_search.peer = dg1Var.getMessagesController().getInputPeer(-dg1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.e0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.g(1, arrayList)).getId();
        }
        this.q0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new cc0(27, this, str));
    }

    public final void L(View view, int i10, String str, boolean z10) {
        this.c0 = str;
        FrameLayout frameLayout = this.U;
        dg1 dg1Var = this.u0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof x10) {
                x10 x10Var = (x10) view;
                x10Var.c.b(0, false);
                x10Var.h(-dg1Var.a, 0L, 0L, 0L, gg.s0.c3[((vf1) this.r0.a.get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.jn0) {
                org.telegram.ui.Components.jn0 jn0Var = (org.telegram.ui.Components.jn0) view;
                jn0Var.a.b(0, false);
                jn0Var.K = str;
                jn0Var.d(false);
                return;
            }
            return;
        }
        x81 x81Var = this.b0;
        if (x81Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x81Var);
            this.b0 = null;
        }
        this.q0 = false;
        this.n0 = false;
        ArrayList arrayList = this.d0;
        arrayList.clear();
        this.e0.clear();
        M();
        if (!TextUtils.isEmpty(str)) {
            M();
            this.m0 = true;
            this.o0.e(true, true);
            x81 x81Var2 = new x81(11, this, str);
            this.b0 = x81Var2;
            AndroidUtilities.runOnUIThread(x81Var2, 200L);
            return;
        }
        this.m0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = dg1Var.b;
            if (i11 >= arrayList2.size()) {
                M();
                return;
            }
            if (((uf1) arrayList2.get(i11)).c != null) {
                arrayList.add(((uf1) arrayList2.get(i11)).c);
                ((uf1) arrayList2.get(i11)).c.searchQuery = null;
            }
            i11++;
        }
    }

    public final void M() {
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = 0;
        ArrayList arrayList = this.d0;
        if (!arrayList.isEmpty()) {
            int i10 = this.l0;
            int i11 = i10 + 1;
            this.l0 = i11;
            this.f0 = i10;
            this.g0 = i11;
            int size = arrayList.size() + i11;
            this.l0 = size;
            this.h0 = size;
        }
        ArrayList arrayList2 = this.e0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.l0;
            int i13 = i12 + 1;
            this.l0 = i13;
            this.i0 = i12;
            this.j0 = i13;
            int size2 = arrayList2.size() + i13;
            this.l0 = size2;
            this.k0 = size2;
        }
        this.a0.l();
    }

    @Override // org.telegram.ui.w10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.u0).actionBar;
        kVar.O(null, null);
    }

    @Override // org.telegram.ui.w10
    public final boolean c(p10 p10Var) {
        if (p10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.t0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == p10Var.b && messageObject.getDialogId() == p10Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.w10
    public final void d(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        dg1 dg1Var = this.u0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        dg1Var.presentFragment(new zn(bundle));
    }

    @Override // org.telegram.ui.w10
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.t0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.u0).actionBar;
            kVar.r();
        }
    }

    @Override // org.telegram.ui.w10
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.u0).actionBar;
        return kVar.s();
    }
}
