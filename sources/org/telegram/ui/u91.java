package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u91 extends org.telegram.ui.Components.g71 implements b00 {
    public final FrameLayout W;
    public final org.telegram.ui.Components.ck0 a0;
    public final v4.c0 b0;
    public final s91 c0;
    public b31 d0;
    public String e0;
    public final ArrayList f0;
    public final ArrayList g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public final org.telegram.ui.Components.kv0 q0;
    public final org.telegram.ui.Components.fj0 r0;
    public boolean s0;
    public final di.i4 t0;
    public final xr0 u0;
    public final ArrayList v0;
    public final /* synthetic */ y91 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u91(y91 y91Var, Context context) {
        super(context, null);
        this.w0 = y91Var;
        this.e0 = "empty";
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.v0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        this.u0 = new xr0(this, 6);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.a0 = ck0Var;
        s91 s91Var = new s91(this);
        this.c0 = s91Var;
        ck0Var.setAdapter(s91Var);
        v4.c0 c0Var = new v4.c0();
        this.b0 = c0Var;
        ck0Var.setLayoutManager(c0Var);
        ck0Var.setOnItemClickListener(new zx0(this, 10));
        ck0Var.setOnScrollListener(new c21(this, 5));
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
        wzVar.setViewType(7);
        wzVar.x = false;
        wzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.kv0 kv0Var = new org.telegram.ui.Components.kv0(context, wzVar, 1, null);
        this.q0 = kv0Var;
        kv0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        kv0Var.e.setVisibility(8);
        kv0Var.setVisibility(8);
        kv0Var.addView(wzVar, 0);
        kv0Var.setAnimateLayoutChange(true);
        ck0Var.setEmptyView(kv0Var);
        ck0Var.X1 = true;
        ck0Var.Y1 = 0;
        frameLayout.addView(kv0Var);
        frameLayout.addView(ck0Var);
        J();
        org.telegram.ui.Components.fj0 fj0Var = new org.telegram.ui.Components.fj0(ck0Var, true);
        this.r0 = fj0Var;
        ck0Var.setItemsEnterAnimator(fj0Var);
        di.i4 i4Var = new di.i4(this);
        this.t0 = i4Var;
        setAdapter(i4Var);
    }

    public final void H(String str) {
        int i7;
        if (this.s0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        y91 y91Var = this.w0;
        tL_messages_search.peer = y91Var.getMessagesController().l1(-y91Var.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.g0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.fj) i5.c.h(1, arrayList)).e1();
        }
        this.s0 = true;
        i7 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new e31(5, this, str));
    }

    public final void I(View view, int i7, String str, boolean z10) {
        this.e0 = str;
        FrameLayout frameLayout = this.W;
        y91 y91Var = this.w0;
        int i10 = 0;
        if (view != frameLayout) {
            if (view instanceof c00) {
                c00 c00Var = (c00) view;
                c00Var.c.b(0, false);
                c00Var.h(-y91Var.a, 0L, 0L, 0L, jg.q0.k3[((r91) ((ArrayList) this.t0.b).get(i7)).b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.ql0) {
                org.telegram.ui.Components.ql0 ql0Var = (org.telegram.ui.Components.ql0) view;
                ql0Var.a.b(0, false);
                ql0Var.L = str;
                ql0Var.d(false);
                return;
            }
            return;
        }
        b31 b31Var = this.d0;
        if (b31Var != null) {
            org.telegram.messenger.g0.r(b31Var);
            this.d0 = null;
        }
        this.s0 = false;
        this.p0 = false;
        ArrayList arrayList = this.f0;
        arrayList.clear();
        this.g0.clear();
        J();
        if (!TextUtils.isEmpty(str)) {
            J();
            this.o0 = true;
            this.q0.e(true, true);
            b31 b31Var2 = new b31(12, this, str);
            this.d0 = b31Var2;
            org.telegram.messenger.g0.h3(b31Var2, 200L);
            return;
        }
        this.o0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = y91Var.b;
            if (i10 >= arrayList2.size()) {
                J();
                return;
            }
            if (((q91) arrayList2.get(i10)).c != null) {
                arrayList.add(((q91) arrayList2.get(i10)).c);
                ((q91) arrayList2.get(i10)).c.searchQuery = null;
            }
            i10++;
        }
    }

    public final void J() {
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = 0;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            int i7 = this.n0;
            int i10 = i7 + 1;
            this.n0 = i10;
            this.h0 = i7;
            this.i0 = i10;
            int size = arrayList.size() + i10;
            this.n0 = size;
            this.j0 = size;
        }
        ArrayList arrayList2 = this.g0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.n0;
            int i12 = i11 + 1;
            this.n0 = i12;
            this.k0 = i11;
            this.l0 = i12;
            int size2 = arrayList2.size() + i12;
            this.n0 = size2;
            this.m0 = size2;
        }
        this.c0.f();
    }

    @Override // org.telegram.ui.b00
    public final boolean V1() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.h2) this.w0).actionBar;
        return kVar.y();
    }

    @Override // org.telegram.ui.b00
    public final void Z0(org.telegram.messenger.fj fjVar, View view, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.v0;
        if (!arrayList.remove(fjVar)) {
            arrayList.add(fjVar);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.h2) this.w0).actionBar;
            kVar.x();
        }
    }

    @Override // org.telegram.ui.b00
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.h2) this.w0).actionBar;
        kVar.S(null, null);
    }

    @Override // org.telegram.ui.b00
    public final boolean r0(vz vzVar) {
        if (vzVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.v0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
            if (fjVar != null && fjVar.e1() == vzVar.b && org.telegram.messenger.fj.B0(fjVar.k) == vzVar.a) {
                return true;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.b00
    public final void t0(org.telegram.messenger.fj fjVar) {
        int i7;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.fj.B0(fjVar.k);
        boolean C = org.telegram.messenger.n5.C(B0);
        y91 y91Var = this.w0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.n5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            i7 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i7).a).O0(Long.valueOf(-B0));
            if (O0 != null && O0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -O0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", fjVar.e1());
        y91Var.presentFragment(new bn(bundle));
    }
}
