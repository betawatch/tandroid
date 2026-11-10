package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v91 extends org.telegram.ui.Components.v61 implements a00 {
    public final FrameLayout V;
    public final org.telegram.ui.Components.pj0 W;
    public final v4.b0 a0;
    public final t91 b0;
    public rw0 c0;
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
    public final org.telegram.ui.Components.bv0 p0;
    public final org.telegram.ui.Components.si0 q0;
    public boolean r0;
    public final bi.g5 s0;
    public final zr0 t0;
    public final ArrayList u0;
    public final /* synthetic */ z91 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v91(z91 z91Var, Context context) {
        super(context, null);
        this.v0 = z91Var;
        this.d0 = "empty";
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.t0 = new zr0(this, 6);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.W = pj0Var;
        t91 t91Var = new t91(this);
        this.b0 = t91Var;
        pj0Var.setAdapter(t91Var);
        v4.b0 b0Var = new v4.b0();
        this.a0 = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setOnItemClickListener(new ay0(this, 10));
        pj0Var.setOnScrollListener(new e21(this, 5));
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        lzVar.setViewType(7);
        lzVar.x = false;
        lzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, lzVar, 1, null);
        this.p0 = bv0Var;
        bv0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        bv0Var.e.setVisibility(8);
        bv0Var.setVisibility(8);
        bv0Var.addView(lzVar, 0);
        bv0Var.setAnimateLayoutChange(true);
        pj0Var.setEmptyView(bv0Var);
        pj0Var.W1 = true;
        pj0Var.X1 = 0;
        frameLayout.addView(bv0Var);
        frameLayout.addView(pj0Var);
        N();
        org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(pj0Var, true);
        this.q0 = si0Var;
        pj0Var.setItemsEnterAnimator(si0Var);
        bi.g5 g5Var = new bi.g5(this);
        this.s0 = g5Var;
        setAdapter(g5Var);
    }

    public final void L(String str) {
        int i7;
        if (this.r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        z91 z91Var = this.v0;
        tL_messages_search.peer = z91Var.getMessagesController().j1(-z91Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList)).e1();
        }
        this.r0 = true;
        i7 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new p41(3, this, str));
    }

    public final void M(View view, int i7, String str, boolean z9) {
        this.d0 = str;
        FrameLayout frameLayout = this.V;
        z91 z91Var = this.v0;
        int i10 = 0;
        if (view != frameLayout) {
            if (view instanceof b00) {
                b00 b00Var = (b00) view;
                b00Var.c.b(0, false);
                b00Var.h(-z91Var.a, 0L, 0L, 0L, jg.q0.j3[((s91) ((ArrayList) this.s0.b).get(i7)).b], false, str, z9);
                return;
            }
            if (view instanceof org.telegram.ui.Components.dl0) {
                org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) view;
                dl0Var.a.b(0, false);
                dl0Var.K = str;
                dl0Var.d(false);
                return;
            }
            return;
        }
        rw0 rw0Var = this.c0;
        if (rw0Var != null) {
            org.telegram.messenger.g0.r(rw0Var);
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
            rw0 rw0Var2 = new rw0(22, this, str);
            this.c0 = rw0Var2;
            org.telegram.messenger.g0.i3(rw0Var2, 200L);
            return;
        }
        this.n0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = z91Var.b;
            if (i10 >= arrayList2.size()) {
                N();
                return;
            }
            if (((r91) arrayList2.get(i10)).c != null) {
                arrayList.add(((r91) arrayList2.get(i10)).c);
                ((r91) arrayList2.get(i10)).c.searchQuery = null;
            }
            i10++;
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
            int i7 = this.m0;
            int i10 = i7 + 1;
            this.m0 = i10;
            this.g0 = i7;
            this.h0 = i10;
            int size = arrayList.size() + i10;
            this.m0 = size;
            this.i0 = size;
        }
        ArrayList arrayList2 = this.f0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.m0;
            int i12 = i11 + 1;
            this.m0 = i12;
            this.j0 = i11;
            this.k0 = i12;
            int size2 = arrayList2.size() + i12;
            this.m0 = size2;
            this.l0 = size2;
        }
        this.b0.f();
    }

    @Override // org.telegram.ui.a00
    public final void e() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.f2) this.v0).actionBar;
        lVar.Q(null, null);
    }

    @Override // org.telegram.ui.a00
    public final boolean f(uz uzVar) {
        if (uzVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.u0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
            if (ijVar != null && ijVar.e1() == uzVar.b && org.telegram.messenger.ij.B0(ijVar.k) == uzVar.a) {
                return true;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.a00
    public final void g(org.telegram.messenger.ij ijVar) {
        int i7;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        boolean C = org.telegram.messenger.m5.C(B0);
        z91 z91Var = this.v0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", ijVar.e1());
        z91Var.presentFragment(new cn(bundle));
    }

    @Override // org.telegram.ui.a00
    public final void h(org.telegram.messenger.ij ijVar, View view, int i7) {
        org.telegram.ui.ActionBar.l lVar;
        ArrayList arrayList = this.u0;
        if (!arrayList.remove(ijVar)) {
            arrayList.add(ijVar);
        }
        if (arrayList.isEmpty()) {
            lVar = ((org.telegram.ui.ActionBar.f2) this.v0).actionBar;
            lVar.w();
        }
    }

    @Override // org.telegram.ui.a00
    public final boolean i() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.f2) this.v0).actionBar;
        return lVar.x();
    }
}
