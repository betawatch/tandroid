package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u91 extends org.telegram.ui.Components.w61 implements zz {
    public final FrameLayout V;
    public final org.telegram.ui.Components.qj0 W;
    public final v4.b0 a0;
    public final s91 b0;
    public ax0 c0;
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
    public final org.telegram.ui.Components.cv0 p0;
    public final org.telegram.ui.Components.ti0 q0;
    public boolean r0;
    public final bi.g5 s0;
    public final yr0 t0;
    public final ArrayList u0;
    public final /* synthetic */ y91 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u91(y91 y91Var, Context context) {
        super(context, null);
        this.v0 = y91Var;
        this.d0 = "empty";
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.t0 = new yr0(this, 6);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.W = qj0Var;
        s91 s91Var = new s91(this);
        this.b0 = s91Var;
        qj0Var.setAdapter(s91Var);
        v4.b0 b0Var = new v4.b0();
        this.a0 = b0Var;
        qj0Var.setLayoutManager(b0Var);
        qj0Var.setOnItemClickListener(new zx0(this, 10));
        qj0Var.setOnScrollListener(new d21(this, 5));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        mzVar.setViewType(7);
        mzVar.x = false;
        mzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, mzVar, 1, null);
        this.p0 = cv0Var;
        cv0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        cv0Var.e.setVisibility(8);
        cv0Var.setVisibility(8);
        cv0Var.addView(mzVar, 0);
        cv0Var.setAnimateLayoutChange(true);
        qj0Var.setEmptyView(cv0Var);
        qj0Var.W1 = true;
        qj0Var.X1 = 0;
        frameLayout.addView(cv0Var);
        frameLayout.addView(qj0Var);
        N();
        org.telegram.ui.Components.ti0 ti0Var = new org.telegram.ui.Components.ti0(qj0Var, true);
        this.q0 = ti0Var;
        qj0Var.setItemsEnterAnimator(ti0Var);
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
        y91 y91Var = this.v0;
        tL_messages_search.peer = y91Var.getMessagesController().j1(-y91Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList)).e1();
        }
        this.r0 = true;
        i7 = ((org.telegram.ui.ActionBar.f2) y91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new o41(3, this, str));
    }

    public final void M(View view, int i7, String str, boolean z9) {
        this.d0 = str;
        FrameLayout frameLayout = this.V;
        y91 y91Var = this.v0;
        int i10 = 0;
        if (view != frameLayout) {
            if (view instanceof a00) {
                a00 a00Var = (a00) view;
                a00Var.c.b(0, false);
                a00Var.h(-y91Var.a, 0L, 0L, 0L, jg.q0.j3[((r91) ((ArrayList) this.s0.b).get(i7)).b], false, str, z9);
                return;
            }
            if (view instanceof org.telegram.ui.Components.el0) {
                org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) view;
                el0Var.a.b(0, false);
                el0Var.K = str;
                el0Var.d(false);
                return;
            }
            return;
        }
        ax0 ax0Var = this.c0;
        if (ax0Var != null) {
            org.telegram.messenger.g0.r(ax0Var);
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
            ax0 ax0Var2 = new ax0(21, this, str);
            this.c0 = ax0Var2;
            org.telegram.messenger.g0.i3(ax0Var2, 200L);
            return;
        }
        this.n0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = y91Var.b;
            if (i10 >= arrayList2.size()) {
                N();
                return;
            }
            if (((q91) arrayList2.get(i10)).c != null) {
                arrayList.add(((q91) arrayList2.get(i10)).c);
                ((q91) arrayList2.get(i10)).c.searchQuery = null;
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

    @Override // org.telegram.ui.zz
    public final void e() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.v0).actionBar;
        kVar.P(null, null);
    }

    @Override // org.telegram.ui.zz
    public final boolean f(tz tzVar) {
        if (tzVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.u0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
            if (ijVar != null && ijVar.e1() == tzVar.b && org.telegram.messenger.ij.B0(ijVar.k) == tzVar.a) {
                return true;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.zz
    public final void g(org.telegram.messenger.ij ijVar) {
        int i7;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        boolean C = org.telegram.messenger.m5.C(B0);
        y91 y91Var = this.v0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) y91Var).currentAccount;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", ijVar.e1());
        y91Var.presentFragment(new cn(bundle));
    }

    @Override // org.telegram.ui.zz
    public final void h(org.telegram.messenger.ij ijVar, View view, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.u0;
        if (!arrayList.remove(ijVar)) {
            arrayList.add(ijVar);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.f2) this.v0).actionBar;
            kVar.v();
        }
    }

    @Override // org.telegram.ui.zz
    public final boolean i() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.v0).actionBar;
        return kVar.w();
    }
}
