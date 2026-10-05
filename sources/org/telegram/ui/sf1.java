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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class sf1 extends org.telegram.ui.Components.h91 implements w10 {
    public final FrameLayout V;
    public final org.telegram.ui.Components.zl0 W;
    public final s4.c0 a0;
    public final pf1 b0;
    public e91 c0;
    public String d0;
    public final ArrayList e0;
    public final ArrayList f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public boolean n0;
    public boolean o0;
    public final org.telegram.ui.Components.ux0 p0;
    public final org.telegram.ui.Components.dl0 q0;
    public boolean r0;
    public final rf1 s0;
    public final dw0 t0;
    public final ArrayList u0;
    public final /* synthetic */ wf1 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf1(wf1 wf1Var, Context context) {
        super(context, null);
        this.v0 = wf1Var;
        this.d0 = "empty";
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.t0 = new dw0(this, 7);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.W = zl0Var;
        pf1 pf1Var = new pf1(this);
        this.b0 = pf1Var;
        zl0Var.setAdapter(pf1Var);
        s4.c0 c0Var = new s4.c0();
        this.a0 = c0Var;
        zl0Var.setLayoutManager(c0Var);
        zl0Var.setOnItemClickListener(new t21(this, 11));
        zl0Var.setOnScrollListener(new u91(this, 3));
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
        w00Var.setViewType(7);
        w00Var.w = false;
        w00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(context, w00Var, 1, null);
        this.p0 = ux0Var;
        ux0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ux0Var.e.setVisibility(8);
        ux0Var.setVisibility(8);
        ux0Var.addView(w00Var, 0);
        ux0Var.setAnimateLayoutChange(true);
        zl0Var.setEmptyView(ux0Var);
        zl0Var.Y1 = true;
        zl0Var.Z1 = 0;
        frameLayout.addView(ux0Var);
        frameLayout.addView(zl0Var);
        N();
        org.telegram.ui.Components.dl0 dl0Var = new org.telegram.ui.Components.dl0(zl0Var, true);
        this.q0 = dl0Var;
        zl0Var.setItemsEnterAnimator(dl0Var);
        rf1 rf1Var = new rf1(this);
        this.s0 = rf1Var;
        setAdapter(rf1Var);
    }

    public final void L(String str) {
        int i10;
        if (this.r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        wf1 wf1Var = this.v0;
        tL_messages_search.peer = wf1Var.getMessagesController().getInputPeer(-wf1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        this.r0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new zb0(27, this, str));
    }

    public final void M(View view, int i10, String str, boolean z10) {
        this.d0 = str;
        FrameLayout frameLayout = this.V;
        wf1 wf1Var = this.v0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof x10) {
                x10 x10Var = (x10) view;
                x10Var.c.b(0, false);
                x10Var.h(-wf1Var.a, 0L, 0L, 0L, gg.s0.j3[((of1) this.s0.a.get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.on0) {
                org.telegram.ui.Components.on0 on0Var = (org.telegram.ui.Components.on0) view;
                on0Var.a.b(0, false);
                on0Var.K = str;
                on0Var.d(false);
                return;
            }
            return;
        }
        e91 e91Var = this.c0;
        if (e91Var != null) {
            AndroidUtilities.cancelRunOnUIThread(e91Var);
            this.c0 = null;
        }
        this.r0 = false;
        this.o0 = false;
        ArrayList arrayList = this.e0;
        arrayList.clear();
        this.f0.clear();
        N();
        if (!TextUtils.isEmpty(str)) {
            N();
            this.n0 = true;
            this.p0.e(true, true);
            e91 e91Var2 = new e91(10, this, str);
            this.c0 = e91Var2;
            AndroidUtilities.runOnUIThread(e91Var2, 200L);
            return;
        }
        this.n0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = wf1Var.b;
            if (i11 >= arrayList2.size()) {
                N();
                return;
            }
            if (((nf1) arrayList2.get(i11)).c != null) {
                arrayList.add(((nf1) arrayList2.get(i11)).c);
                ((nf1) arrayList2.get(i11)).c.searchQuery = null;
            }
            i11++;
        }
    }

    public final void N() {
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = 0;
        ArrayList arrayList = this.e0;
        if (!arrayList.isEmpty()) {
            int i10 = this.m0;
            int i11 = i10 + 1;
            this.m0 = i11;
            this.g0 = i10;
            this.h0 = i11;
            int size = arrayList.size() + i11;
            this.m0 = size;
            this.i0 = size;
        }
        ArrayList arrayList2 = this.f0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.m0;
            int i13 = i12 + 1;
            this.m0 = i13;
            this.j0 = i12;
            this.k0 = i13;
            int size2 = arrayList2.size() + i13;
            this.m0 = size2;
            this.l0 = size2;
        }
        this.b0.l();
    }

    @Override // org.telegram.ui.w10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.v0).actionBar;
        kVar.L(null, null);
    }

    @Override // org.telegram.ui.w10
    public final boolean c(p10 p10Var) {
        if (p10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.u0;
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
        wf1 wf1Var = this.v0;
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
        wf1Var.presentFragment(new yn(bundle));
    }

    @Override // org.telegram.ui.w10
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.u0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.v0).actionBar;
            kVar.r();
        }
    }

    @Override // org.telegram.ui.w10
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.v0).actionBar;
        return kVar.s();
    }
}
