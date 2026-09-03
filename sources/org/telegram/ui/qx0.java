package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements GenericProvider, org.telegram.ui.Components.jl0, w60 {
    public final /* synthetic */ tx0 a;

    public /* synthetic */ qx0(tx0 tx0Var) {
        this.a = tx0Var;
    }

    @Override // org.telegram.ui.w60
    public void b(ArrayList arrayList, boolean z4, boolean z10) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        tx0 tx0Var = this.a;
        if (i10 < tx0Var.r || i10 >= tx0Var.s) {
            return false;
        }
        if (tx0Var.y != 1) {
            throw null;
        }
        tx0Var.U(Long.valueOf(tx0Var.getMessagesController().blockePeers.keyAt(i10 - tx0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        tx0 tx0Var = this.a;
        tx0Var.getClass();
        if (((Integer) obj).intValue() == tx0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false)));
        }
        return null;
    }
}
