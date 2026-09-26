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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class qp extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public pp f;
    public final /* synthetic */ rp h;

    public qp(rp rpVar, Context context) {
        this.h = rpVar;
        this.c = context;
    }

    public static void E(qp qpVar, ArrayList arrayList, ArrayList arrayList2) {
        rp rpVar = qpVar.h;
        if (rpVar.N) {
            qpVar.d = arrayList;
            qpVar.e = arrayList2;
            if (rpVar.b.getAdapter() == rpVar.e) {
                rpVar.d.c();
            }
            super.l();
        }
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.vl0
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
            pp ppVar = new pp(this, str, 0);
            this.f = ppVar;
            dispatchQueue.postRunnable(ppVar, 300L);
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
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) c1Var.a;
        b5Var.setTag(Integer.valueOf(i10));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
        return new org.telegram.ui.Components.gl0(b5Var);
    }
}
