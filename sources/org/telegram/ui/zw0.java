package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zw0 implements GenericProvider, org.telegram.ui.Components.rk0, k60 {
    public final /* synthetic */ cx0 a;

    public /* synthetic */ zw0(cx0 cx0Var) {
        this.a = cx0Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        cx0 cx0Var = this.a;
        if (i10 < cx0Var.r || i10 >= cx0Var.s) {
            return false;
        }
        if (cx0Var.y != 1) {
            throw null;
        }
        cx0Var.U(Long.valueOf(cx0Var.getMessagesController().blockePeers.keyAt(i10 - cx0Var.r)), view);
        return true;
    }

    @Override // org.telegram.ui.k60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        cx0 cx0Var = this.a;
        cx0Var.getClass();
        if (((Integer) obj).intValue() == cx0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false)));
        }
        return null;
    }
}
