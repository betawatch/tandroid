package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class wp extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public vp f;
    public final /* synthetic */ xp h;

    public wp(xp xpVar, Context context) {
        this.h = xpVar;
        this.c = context;
    }

    public static void E(wp wpVar, ArrayList arrayList, ArrayList arrayList2) {
        xp xpVar = wpVar.h;
        if (xpVar.N) {
            wpVar.d = arrayList;
            wpVar.e = arrayList2;
            if (xpVar.b.getAdapter() == xpVar.e) {
                xpVar.d.c();
            }
            super.l();
        }
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 1;
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
        } else {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            vp vpVar = new vp(this, str, 0);
            this.f = vpVar;
            dispatchQueue.postRunnable(vpVar, 300L);
        }
    }

    @Override // s4.h0
    public final int h() {
        return this.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) c1Var.a;
        a5Var.setTag(Integer.valueOf(i10));
        a5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.c, null, false);
        a5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        return new org.telegram.ui.Components.vk0(a5Var);
    }
}
