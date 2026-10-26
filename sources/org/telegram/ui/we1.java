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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class we1 extends org.telegram.ui.Components.u91 implements g10 {
    public final FrameLayout V;
    public final org.telegram.ui.Components.mm0 W;
    public final s4.c0 a0;
    public final te1 b0;
    public zc1 c0;
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
    public final org.telegram.ui.Components.ey0 p0;
    public final org.telegram.ui.Components.ql0 q0;
    public boolean r0;
    public final ve1 s0;
    public final uv0 t0;
    public final ArrayList u0;
    public final /* synthetic */ af1 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we1(af1 af1Var, Context context) {
        super(context, null);
        this.v0 = af1Var;
        this.d0 = "empty";
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.t0 = new uv0(this, 6);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.W = mm0Var;
        te1 te1Var = new te1(this);
        this.b0 = te1Var;
        mm0Var.setAdapter(te1Var);
        s4.c0 c0Var = new s4.c0();
        this.a0 = c0Var;
        mm0Var.setLayoutManager(c0Var);
        mm0Var.setOnItemClickListener(new m11(this, 11));
        mm0Var.setOnScrollListener(new x81(this, 3));
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        c10Var.setViewType(7);
        c10Var.w = false;
        c10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0(context, c10Var, 1, null);
        this.p0 = ey0Var;
        ey0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ey0Var.e.setVisibility(8);
        ey0Var.setVisibility(8);
        ey0Var.addView(c10Var, 0);
        ey0Var.setAnimateLayoutChange(true);
        mm0Var.setEmptyView(ey0Var);
        mm0Var.W1 = true;
        mm0Var.X1 = 0;
        frameLayout.addView(ey0Var);
        frameLayout.addView(mm0Var);
        N();
        org.telegram.ui.Components.ql0 ql0Var = new org.telegram.ui.Components.ql0(mm0Var, true);
        this.q0 = ql0Var;
        mm0Var.setItemsEnterAnimator(ql0Var);
        ve1 ve1Var = new ve1(this);
        this.s0 = ve1Var;
        setAdapter(ve1Var);
    }

    public final void L(String str) {
        int i10;
        if (this.r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        af1 af1Var = this.v0;
        tL_messages_search.peer = af1Var.getMessagesController().getInputPeer(-af1Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) ic.a.g(1, arrayList)).getId();
        }
        this.r0 = true;
        i10 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new l71(6, this, str));
    }

    public final void M(View view, int i10, String str, boolean z10) {
        this.d0 = str;
        FrameLayout frameLayout = this.V;
        af1 af1Var = this.v0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof h10) {
                h10 h10Var = (h10) view;
                h10Var.c.b(0, false);
                h10Var.h(-af1Var.a, 0L, 0L, 0L, ig.r0.k3[((se1) this.s0.a.get(i10)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.co0) {
                org.telegram.ui.Components.co0 co0Var = (org.telegram.ui.Components.co0) view;
                co0Var.a.b(0, false);
                co0Var.K = str;
                co0Var.d(false);
                return;
            }
            return;
        }
        zc1 zc1Var = this.c0;
        if (zc1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zc1Var);
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
            zc1 zc1Var2 = new zc1(3, this, str);
            this.c0 = zc1Var2;
            AndroidUtilities.runOnUIThread(zc1Var2, 200L);
            return;
        }
        this.n0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = af1Var.b;
            if (i11 >= arrayList2.size()) {
                N();
                return;
            }
            if (((re1) arrayList2.get(i11)).c != null) {
                arrayList.add(((re1) arrayList2.get(i11)).c);
                ((re1) arrayList2.get(i11)).c.searchQuery = null;
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

    @Override // org.telegram.ui.g10
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.r2) this.v0).actionBar;
        kVar.K(null, null);
    }

    @Override // org.telegram.ui.g10
    public final boolean c(z00 z00Var) {
        if (z00Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.u0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == z00Var.b && messageObject.getDialogId() == z00Var.a) {
                return true;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.g10
    public final void d(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        af1 af1Var = this.v0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            i10 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        af1Var.presentFragment(new un(bundle));
    }

    @Override // org.telegram.ui.g10
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

    @Override // org.telegram.ui.g10
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.r2) this.v0).actionBar;
        return kVar.q();
    }
}
