package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rr extends org.telegram.ui.Components.s51 {
    public final xc1 e;
    public final long f;
    public final vc1 h;
    public String n;
    public org.telegram.ui.ActionBar.p5 r;
    public boolean s = false;

    public rr(xc1 xc1Var, long j10, vc1 vc1Var) {
        this.e = xc1Var;
        this.f = j10;
        this.h = vc1Var;
        qr qrVar = new qr(this, 0);
        if (xc1Var.c) {
            qrVar.run();
        } else {
            xc1Var.f.add(qrVar);
        }
    }

    @Override // org.telegram.ui.Components.s51
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.q51 q51Var) {
        boolean isEmpty = TextUtils.isEmpty(this.n);
        long j10 = this.f;
        if (isEmpty && j10 != 0) {
            org.telegram.ui.Components.b51 c10 = org.telegram.ui.Components.b51.c(1, R.drawable.msg_archive_hide, org.telegram.messenger.dd.L0(2131751236, null));
            c10.r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.b51.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            arrayList.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(2131751235, null)));
        }
        ArrayList arrayList2 = this.e.e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.w3.n0(chat)) {
                i10++;
                if (!TextUtils.isEmpty(this.n)) {
                    String lowerCase = this.n.toLowerCase();
                    String N3 = org.telegram.messenger.i0.N3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !sc.e.y(" ", lowerCase, lowerCase2) && !N32.startsWith(N3) && !N32.contains(" ".concat(N3))) {
                    }
                }
                long j11 = chat.id;
                org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(11);
                b51Var.w = true;
                b51Var.x = -j11;
                b51Var.L(j10 == j11);
                arrayList.add(b51Var);
            }
        }
        if (TextUtils.isEmpty(this.n) && i10 == 0) {
            org.telegram.ui.Components.b51 c11 = org.telegram.ui.Components.b51.c(2, R.drawable.msg_channel_create, org.telegram.messenger.dd.L0(2131751233, null));
            c11.q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.b51.C(null));
        org.telegram.ui.ActionBar.p5 p5Var = this.r;
        if (p5Var != null) {
            p5Var.setVisibility(i10 > 5 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.Components.s51
    public final CharSequence a0() {
        return org.telegram.messenger.dd.L0(2131751232, null);
    }

    @Override // org.telegram.ui.Components.s51
    public final void b0(org.telegram.ui.Components.b51 b51Var, View view) {
        int i10 = b51Var.d;
        vc1 vc1Var = this.h;
        if (i10 == 1) {
            vc1Var.a(null);
            finishFragment();
            return;
        }
        if (i10 != 2) {
            if (b51Var.a == 12) {
                finishFragment();
                vc1Var.a(getMessagesController().L0(Long.valueOf(-b51Var.x)));
                return;
            }
            return;
        }
        this.s = true;
        SharedPreferences d12 = org.telegram.messenger.wp.d1();
        boolean z10 = org.telegram.messenger.v2.a;
        presentFragment(new f(0));
        d12.edit().putBoolean("channel_intro", true).apply();
    }

    @Override // org.telegram.ui.Components.s51
    public final boolean c0(org.telegram.ui.Components.b51 b51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.s51, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.o5 o10 = this.simpleActionBar.o();
        getResourceProvider();
        org.telegram.ui.ActionBar.p5 b10 = o10.b(0, R.drawable.outline_header_search);
        b10.N();
        b10.B0 = new ag.l3(this, 4);
        this.r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        this.r.setContentDescription(org.telegram.messenger.dd.L0(2131745853, null));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        if (this.s) {
            xc1 xc1Var = this.e;
            xc1Var.c = false;
            xc1Var.f.add(new qr(this, 1));
            this.s = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
