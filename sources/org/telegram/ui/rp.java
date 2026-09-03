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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rp extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public qp f;
    public final /* synthetic */ sp h;

    public rp(sp spVar, Context context) {
        this.h = spVar;
        this.c = context;
    }

    public static void E(rp rpVar, ArrayList arrayList, ArrayList arrayList2) {
        sp spVar = rpVar.h;
        if (spVar.K) {
            rpVar.d = arrayList;
            rpVar.e = arrayList2;
            if (spVar.b.getAdapter() == spVar.e) {
                spVar.d.c();
            }
            super.l();
        }
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f != 1;
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
            qp qpVar = new qp(this, str, 0);
            this.f = qpVar;
            dispatchQueue.postRunnable(qpVar, 300L);
        }
    }

    @Override // f2.o0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
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
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) l1Var.a;
        a5Var.setTag(Integer.valueOf(i10));
        a5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.c, null, false);
        a5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        return new org.telegram.ui.Components.dl0(a5Var);
    }
}
