package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yw0 implements GenericProvider, org.telegram.ui.Components.bl0, i60 {
    public final /* synthetic */ bx0 a;

    public /* synthetic */ yw0(bx0 bx0Var) {
        this.a = bx0Var;
    }

    @Override // org.telegram.ui.i60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        bx0 bx0Var = this.a;
        if (i10 < bx0Var.r || i10 >= bx0Var.s) {
            return false;
        }
        if (bx0Var.y != 1) {
            throw null;
        }
        bx0Var.U(Long.valueOf(bx0Var.getMessagesController().blockePeers.keyAt(i10 - bx0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        bx0 bx0Var = this.a;
        bx0Var.getClass();
        if (((Integer) obj).intValue() == bx0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false)));
        }
        return null;
    }
}
