package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sq extends org.telegram.ui.Components.o41 {
    public final gb1 e;
    public final long f;
    public final eb1 h;
    public String n;
    public org.telegram.ui.ActionBar.f5 r;
    public boolean s = false;

    public sq(gb1 gb1Var, long j3, eb1 eb1Var) {
        this.e = gb1Var;
        this.f = j3;
        this.h = eb1Var;
        rq rqVar = new rq(this, 0);
        if (gb1Var.c) {
            rqVar.run();
        } else {
            gb1Var.f.add(rqVar);
        }
    }

    @Override // org.telegram.ui.Components.o41
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.m41 m41Var) {
        boolean isEmpty = TextUtils.isEmpty(this.n);
        long j3 = this.f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.y31 c10 = org.telegram.ui.Components.y31.c(1, R.drawable.msg_archive_hide, org.telegram.messenger.id.M0(2131751235, null));
            c10.r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.y31.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131751234, null)));
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
                org.telegram.ui.Components.y31 y31Var = new org.telegram.ui.Components.y31(11);
                y31Var.w = true;
                y31Var.x = -j10;
                y31Var.L(j3 == j10);
                arrayList.add(y31Var);
            }
        }
        if (TextUtils.isEmpty(this.n) && i7 == 0) {
            org.telegram.ui.Components.y31 c11 = org.telegram.ui.Components.y31.c(2, R.drawable.msg_channel_create, org.telegram.messenger.id.M0(2131751232, null));
            c11.q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.y31.C(null));
        org.telegram.ui.ActionBar.f5 f5Var = this.r;
        if (f5Var != null) {
            f5Var.setVisibility(i7 > 5 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.Components.o41
    public final CharSequence a0() {
        return org.telegram.messenger.id.M0(2131751231, null);
    }

    @Override // org.telegram.ui.Components.o41
    public final void b0(org.telegram.ui.Components.y31 y31Var, View view) {
        int i7 = y31Var.d;
        eb1 eb1Var = this.h;
        if (i7 == 1) {
            eb1Var.a(null);
            finishFragment();
            return;
        }
        if (i7 != 2) {
            if (y31Var.a == 12) {
                finishFragment();
                eb1Var.a(getMessagesController().M0(Long.valueOf(-y31Var.x)));
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

    @Override // org.telegram.ui.Components.o41
    public final boolean c0(org.telegram.ui.Components.y31 y31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.o41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.e5 p10 = this.simpleActionBar.p();
        getResourceProvider();
        org.telegram.ui.ActionBar.f5 b10 = p10.b(0, R.drawable.outline_header_search);
        b10.N();
        b10.B0 = new kg.v1(this, 4);
        this.r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        this.r.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
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
            gb1 gb1Var = this.e;
            gb1Var.c = false;
            gb1Var.f.add(new rq(this, 1));
            this.s = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
