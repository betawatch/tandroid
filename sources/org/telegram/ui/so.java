package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class so extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ro f;
    public final /* synthetic */ to h;

    public so(to toVar, Context context) {
        this.h = toVar;
        this.c = context;
    }

    public static void E(so soVar, ArrayList arrayList, ArrayList arrayList2) {
        to toVar = soVar.h;
        if (toVar.O) {
            soVar.d = arrayList;
            soVar.e = arrayList2;
            if (toVar.b.getAdapter() == toVar.e) {
                toVar.d.c();
            }
            super.f();
        }
    }

    @Override // v4.h0
    public final void A(v4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f != 1;
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.f();
        } else {
            org.telegram.messenger.p5 p5Var = Utilities.g;
            ro roVar = new ro(this, str, 0);
            this.f = roVar;
            p5Var.d(roVar, 300L);
        }
    }

    @Override // v4.h0
    public final int b() {
        return this.d.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i7);
        String K = org.telegram.messenger.t3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.e.get(i7);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) e1Var.a;
        a5Var.setTag(Integer.valueOf(i7));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 6, 2, false, null);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, a5Var, null);
        return new org.telegram.ui.Components.cj0(a5Var);
    }
}
