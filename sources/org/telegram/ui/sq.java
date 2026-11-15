package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sq extends org.telegram.ui.Components.r41 {
    public final cb1 e;
    public final long f;
    public final ab1 h;
    public String n;
    public org.telegram.ui.ActionBar.d5 r;
    public boolean s = false;

    public sq(cb1 cb1Var, long j3, ab1 ab1Var) {
        this.e = cb1Var;
        this.f = j3;
        this.h = ab1Var;
        rq rqVar = new rq(this, 0);
        if (cb1Var.c) {
            rqVar.run();
        } else {
            cb1Var.f.add(rqVar);
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.p41 p41Var) {
        boolean isEmpty = TextUtils.isEmpty(this.n);
        long j3 = this.f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.b41 c10 = org.telegram.ui.Components.b41.c(1, R.drawable.msg_archive_hide, org.telegram.messenger.hd.M0(2131751235, null));
            c10.r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131751234, null)));
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
                    String N3 = org.telegram.messenger.g0.N3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !i5.c.A(" ", lowerCase, lowerCase2) && !N32.startsWith(N3) && !N32.contains(" ".concat(N3))) {
                    }
                }
                long j10 = chat.id;
                org.telegram.ui.Components.b41 b41Var = new org.telegram.ui.Components.b41(11);
                b41Var.w = true;
                b41Var.x = -j10;
                b41Var.L(j3 == j10);
                arrayList.add(b41Var);
            }
        }
        if (TextUtils.isEmpty(this.n) && i7 == 0) {
            org.telegram.ui.Components.b41 c11 = org.telegram.ui.Components.b41.c(2, R.drawable.msg_channel_create, org.telegram.messenger.hd.M0(2131751232, null));
            c11.q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.b41.C(null));
        org.telegram.ui.ActionBar.d5 d5Var = this.r;
        if (d5Var != null) {
            d5Var.setVisibility(i7 > 5 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return org.telegram.messenger.hd.M0(2131751231, null);
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(org.telegram.ui.Components.b41 b41Var, View view) {
        int i7 = b41Var.d;
        ab1 ab1Var = this.h;
        if (i7 == 1) {
            ab1Var.a(null);
            finishFragment();
            return;
        }
        if (i7 != 2) {
            if (b41Var.a == 12) {
                finishFragment();
                ab1Var.a(getMessagesController().M0(Long.valueOf(-b41Var.x)));
                return;
            }
            return;
        }
        this.s = true;
        SharedPreferences e12 = org.telegram.messenger.np.e1();
        boolean z10 = org.telegram.messenger.r2.a;
        presentFragment(new g(0));
        e12.edit().putBoolean("channel_intro", true).apply();
    }

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(org.telegram.ui.Components.b41 b41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.c5 r10 = this.simpleActionBar.r();
        getResourceProvider();
        org.telegram.ui.ActionBar.d5 b10 = r10.b(0, R.drawable.outline_header_search);
        b10.O();
        b10.C0 = new kg.x1(this, 4);
        this.r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        this.r.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        if (this.s) {
            cb1 cb1Var = this.e;
            cb1Var.c = false;
            cb1Var.f.add(new rq(this, 1));
            this.s = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
