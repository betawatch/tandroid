package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rx0 implements GenericProvider, org.telegram.ui.Components.cm0, p60 {
    public final /* synthetic */ ux0 a;

    public /* synthetic */ rx0(ux0 ux0Var) {
        this.a = ux0Var;
    }

    @Override // org.telegram.ui.p60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.W();
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        ux0 ux0Var = this.a;
        if (i10 < ux0Var.r || i10 >= ux0Var.s) {
            return false;
        }
        if (ux0Var.y != 1) {
            throw null;
        }
        ux0Var.V(Long.valueOf(ux0Var.getMessagesController().blockePeers.keyAt(i10 - ux0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        ux0 ux0Var = this.a;
        ux0Var.getClass();
        if (((Integer) obj).intValue() == ux0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.p7, false)));
        }
        return null;
    }
}
