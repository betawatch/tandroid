package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class wx0 implements GenericProvider, org.telegram.ui.Components.cl0, x60 {
    public final /* synthetic */ zx0 a;

    public /* synthetic */ wx0(zx0 zx0Var) {
        this.a = zx0Var;
    }

    @Override // org.telegram.ui.x60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        zx0 zx0Var = this.a;
        if (i10 < zx0Var.r || i10 >= zx0Var.s) {
            return false;
        }
        if (zx0Var.y != 1) {
            throw null;
        }
        zx0Var.U(Long.valueOf(zx0Var.getMessagesController().blockePeers.keyAt(i10 - zx0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        zx0 zx0Var = this.a;
        zx0Var.getClass();
        if (((Integer) obj).intValue() == zx0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p7, false)));
        }
        return null;
    }
}
