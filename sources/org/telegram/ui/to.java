package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class to extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public so f;
    public final /* synthetic */ uo h;

    public to(uo uoVar, Context context) {
        this.h = uoVar;
        this.c = context;
    }

    public static void E(to toVar, ArrayList arrayList, ArrayList arrayList2) {
        uo uoVar = toVar.h;
        if (uoVar.N) {
            toVar.d = arrayList;
            toVar.e = arrayList2;
            if (uoVar.b.getAdapter() == uoVar.e) {
                uoVar.d.c();
            }
            super.f();
        }
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f != 1;
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
            so soVar = new so(this, str, 0);
            this.f = soVar;
            p5Var.d(soVar, 300L);
        }
    }

    @Override // v4.g0
    public final int b() {
        return this.d.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
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
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) d1Var.a;
        a5Var.setTag(Integer.valueOf(i7));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 6, 2, false, null);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, a5Var, null);
        return new org.telegram.ui.Components.xi0(a5Var);
    }
}
