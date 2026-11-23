package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class tq extends org.telegram.ui.Components.d51 {
    public final eb1 e;
    public final long f;
    public final cb1 h;
    public String n;
    public org.telegram.ui.ActionBar.g5 r;
    public boolean s = false;

    public tq(eb1 eb1Var, long j3, cb1 cb1Var) {
        this.e = eb1Var;
        this.f = j3;
        this.h = cb1Var;
        sq sqVar = new sq(this, 0);
        if (eb1Var.c) {
            sqVar.run();
        } else {
            eb1Var.f.add(sqVar);
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.b51 b51Var) {
        boolean isEmpty = TextUtils.isEmpty(this.n);
        long j3 = this.f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.n41 c10 = org.telegram.ui.Components.n41.c(1, R.drawable.msg_archive_hide, org.telegram.messenger.gd.N0(2131751223, null));
            c10.s = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            i5.c.s(2131751222, null, arrayList);
        }
        ArrayList arrayList2 = this.e.e;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.v3.n0(chat)) {
                i7++;
                if (!TextUtils.isEmpty(this.n)) {
                    String lowerCase = this.n.toLowerCase();
                    String M3 = org.telegram.messenger.g0.M3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !i5.c.B(" ", lowerCase, lowerCase2) && !M32.startsWith(M3) && !M32.contains(" ".concat(M3))) {
                    }
                }
                long j10 = chat.id;
                org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(11);
                n41Var.x = true;
                n41Var.y = -j10;
                n41Var.L(j3 == j10);
                arrayList.add(n41Var);
            }
        }
        if (TextUtils.isEmpty(this.n) && i7 == 0) {
            org.telegram.ui.Components.n41 c11 = org.telegram.ui.Components.n41.c(2, R.drawable.msg_channel_create, org.telegram.messenger.gd.N0(2131751220, null));
            c11.r = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.n41.C(null));
        org.telegram.ui.ActionBar.g5 g5Var = this.r;
        if (g5Var != null) {
            g5Var.setVisibility(i7 > 5 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final CharSequence a0() {
        return org.telegram.messenger.gd.N0(2131751219, null);
    }

    @Override // org.telegram.ui.Components.d51
    public final void b0(org.telegram.ui.Components.n41 n41Var, View view) {
        int i7 = n41Var.d;
        cb1 cb1Var = this.h;
        if (i7 == 1) {
            cb1Var.a(null);
            finishFragment();
            return;
        }
        if (i7 != 2) {
            if (n41Var.a == 12) {
                finishFragment();
                cb1Var.a(getMessagesController().O0(Long.valueOf(-n41Var.y)));
                return;
            }
            return;
        }
        this.s = true;
        SharedPreferences g12 = org.telegram.messenger.mp.g1();
        boolean z10 = org.telegram.messenger.s2.a;
        presentFragment(new g(0));
        g12.edit().putBoolean("channel_intro", true).apply();
    }

    @Override // org.telegram.ui.Components.d51
    public final boolean c0(org.telegram.ui.Components.n41 n41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.d51, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        getResourceProvider();
        org.telegram.ui.ActionBar.g5 b10 = t6.b(0, R.drawable.outline_header_search);
        b10.O();
        b10.C0 = new bi.x1(this, 5);
        this.r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        this.r.setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        if (this.s) {
            eb1 eb1Var = this.e;
            eb1Var.c = false;
            eb1Var.f.add(new sq(this, 1));
            this.s = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
