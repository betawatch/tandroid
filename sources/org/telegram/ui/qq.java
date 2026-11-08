package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class qq extends org.telegram.ui.Components.n41 {
    public final eb1 e;
    public final long f;
    public final cb1 h;
    public String n;
    public org.telegram.ui.ActionBar.f5 r;
    public boolean s = false;

    public qq(eb1 eb1Var, long j3, cb1 cb1Var) {
        this.e = eb1Var;
        this.f = j3;
        this.h = cb1Var;
        pq pqVar = new pq(this, 0);
        if (eb1Var.c) {
            pqVar.run();
        } else {
            eb1Var.f.add(pqVar);
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.l41 l41Var) {
        boolean isEmpty = TextUtils.isEmpty(this.n);
        long j3 = this.f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.x31 c10 = org.telegram.ui.Components.x31.c(1, R.drawable.msg_archive_hide, org.telegram.messenger.id.M0(2131751236, null));
            c10.r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.x31.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131751235, null)));
        }
        ArrayList arrayList2 = this.e.e;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.t3.n0(chat)) {
                i7++;
                if (!TextUtils.isEmpty(this.n)) {
                    String lowerCase = this.n.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !jg.g.A(" ", lowerCase, lowerCase2) && !O32.startsWith(O3) && !O32.contains(" ".concat(O3))) {
                    }
                }
                long j10 = chat.id;
                org.telegram.ui.Components.x31 x31Var = new org.telegram.ui.Components.x31(11);
                x31Var.w = true;
                x31Var.x = -j10;
                x31Var.L(j3 == j10);
                arrayList.add(x31Var);
            }
        }
        if (TextUtils.isEmpty(this.n) && i7 == 0) {
            org.telegram.ui.Components.x31 c11 = org.telegram.ui.Components.x31.c(2, R.drawable.msg_channel_create, org.telegram.messenger.id.M0(2131751233, null));
            c11.q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.x31.C(null));
        org.telegram.ui.ActionBar.f5 f5Var = this.r;
        if (f5Var != null) {
            f5Var.setVisibility(i7 > 5 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final CharSequence a0() {
        return org.telegram.messenger.id.M0(2131751232, null);
    }

    @Override // org.telegram.ui.Components.n41
    public final void b0(org.telegram.ui.Components.x31 x31Var, View view) {
        int i7 = x31Var.d;
        cb1 cb1Var = this.h;
        if (i7 == 1) {
            cb1Var.a(null);
            finishFragment();
            return;
        }
        if (i7 != 2) {
            if (x31Var.a == 12) {
                finishFragment();
                cb1Var.a(getMessagesController().M0(Long.valueOf(-x31Var.x)));
                return;
            }
            return;
        }
        this.s = true;
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        boolean z9 = org.telegram.messenger.r2.a;
        presentFragment(new g(0));
        e12.edit().putBoolean("channel_intro", true).apply();
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c0(org.telegram.ui.Components.x31 x31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.n41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.e5 o4 = this.simpleActionBar.o();
        getResourceProvider();
        org.telegram.ui.ActionBar.f5 b10 = o4.b(0, R.drawable.outline_header_search);
        b10.N();
        b10.B0 = new kg.v1(this, 4);
        this.r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
        this.r.setContentDescription(org.telegram.messenger.id.M0(2131745839, null));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        if (this.s) {
            eb1 eb1Var = this.e;
            eb1Var.c = false;
            eb1Var.f.add(new pq(this, 1));
            this.s = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
