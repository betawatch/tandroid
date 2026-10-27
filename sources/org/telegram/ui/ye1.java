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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ye1 extends org.telegram.ui.Components.v91 implements i10 {
    public final FrameLayout V;
    public final org.telegram.ui.Components.nm0 W;
    public final s4.c0 a0;
    public final ve1 b0;
    public yc1 c0;
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
    public final org.telegram.ui.Components.fy0 p0;
    public final org.telegram.ui.Components.rl0 q0;
    public boolean r0;
    public final xe1 s0;
    public final wv0 t0;
    public final ArrayList u0;
    public final /* synthetic */ cf1 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye1(cf1 cf1Var, Context context) {
        super(context, null);
        this.v0 = cf1Var;
        this.d0 = "empty";
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.t0 = new wv0(this, 6);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.W = nm0Var;
        ve1 ve1Var = new ve1(this);
        this.b0 = ve1Var;
        nm0Var.setAdapter(ve1Var);
        s4.c0 c0Var = new s4.c0();
        this.a0 = c0Var;
        nm0Var.setLayoutManager(c0Var);
        nm0Var.setOnItemClickListener(new o11(this, 11));
        nm0Var.setOnScrollListener(new z81(this, 3));
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        c10Var.setViewType(7);
        c10Var.w = false;
        c10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(context, c10Var, 1, null);
        this.p0 = fy0Var;
        fy0Var.d.setText(LocaleController.getString(R.string.NoResult));
        fy0Var.e.setVisibility(8);
        fy0Var.setVisibility(8);
        fy0Var.addView(c10Var, 0);
        fy0Var.setAnimateLayoutChange(true);
        nm0Var.setEmptyView(fy0Var);
        nm0Var.W1 = true;
        nm0Var.X1 = 0;
        frameLayout.addView(fy0Var);
        frameLayout.addView(nm0Var);
        N();
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(nm0Var, true);
        this.q0 = rl0Var;
        nm0Var.setItemsEnterAnimator(rl0Var);
        xe1 xe1Var = new xe1(this);
        this.s0 = xe1Var;
        setAdapter(xe1Var);
    }

    public final void L(String str) {
        int i10;
        if (this.r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        cf1 cf1Var = this.v0;
        tL_messages_search.peer = cf1Var.getMessagesController().getInputPeer(-cf1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) ic.a.g(1, arrayList)).getId();
        }
        this.r0 = true;
        i10 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new n71(6, this, str));
    }

    public final void M(View view, int i10, String str, boolean z10) {
        this.d0 = str;
        FrameLayout frameLayout = this.V;
        cf1 cf1Var = this.v0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof j10) {
                j10 j10Var = (j10) view;
                j10Var.c.b(0, false);
                j10Var.h(-cf1Var.a, 0L, 0L, 0L, ig.r0.k3[((ue1) this.s0.a.get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.do0) {
                org.telegram.ui.Components.do0 do0Var = (org.telegram.ui.Components.do0) view;
                do0Var.a.b(0, false);
                do0Var.K = str;
                do0Var.d(false);
                return;
            }
            return;
        }
        yc1 yc1Var = this.c0;
        if (yc1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yc1Var);
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
            yc1 yc1Var2 = new yc1(4, this, str);
            this.c0 = yc1Var2;
            AndroidUtilities.runOnUIThread(yc1Var2, 200L);
            return;
        }
        this.n0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = cf1Var.b;
            if (i11 >= arrayList2.size()) {
                N();
                return;
            }
            if (((te1) arrayList2.get(i11)).c != null) {
                arrayList.add(((te1) arrayList2.get(i11)).c);
                ((te1) arrayList2.get(i11)).c.searchQuery = null;
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

    @Override // org.telegram.ui.i10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.r2) this.v0).actionBar;
        kVar.K(null, null);
    }

    @Override // org.telegram.ui.i10
    public final boolean c(b10 b10Var) {
        if (b10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.u0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == b10Var.b && messageObject.getDialogId() == b10Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.i10
    public final void d(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        cf1 cf1Var = this.v0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            i10 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        cf1Var.presentFragment(new wn(bundle));
    }

    @Override // org.telegram.ui.i10
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.u0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.r2) this.v0).actionBar;
            kVar.p();
        }
    }

    @Override // org.telegram.ui.i10
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.r2) this.v0).actionBar;
        return kVar.q();
    }
}
