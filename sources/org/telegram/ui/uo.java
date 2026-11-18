package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class uo extends org.telegram.ui.Components.bk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public to f;
    public final /* synthetic */ vo h;

    public uo(vo voVar, Context context) {
        this.h = voVar;
        this.c = context;
    }

    public static void E(uo uoVar, ArrayList arrayList, ArrayList arrayList2) {
        vo voVar = uoVar.h;
        if (voVar.O) {
            uoVar.d = arrayList;
            uoVar.e = arrayList2;
            if (voVar.b.getAdapter() == voVar.e) {
                voVar.d.c();
            }
            super.f();
        }
    }

    @Override // v4.i0
    public final void A(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f != 1;
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
            org.telegram.messenger.q5 q5Var = Utilities.g;
            to toVar = new to(this, str, 0);
            this.f = toVar;
            q5Var.d(toVar, 300L);
        }
    }

    @Override // v4.i0
    public final int b() {
        return this.d.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i7);
        String K = org.telegram.messenger.v3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.e.get(i7);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) f1Var.a;
        a5Var.setTag(Integer.valueOf(i7));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 6, 2, false, null);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, a5Var, null);
        return new org.telegram.ui.Components.kj0(a5Var);
    }
}
