package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vx0 implements GenericProvider, org.telegram.ui.Components.ml0, v60 {
    public final /* synthetic */ yx0 a;

    public /* synthetic */ vx0(yx0 yx0Var) {
        this.a = yx0Var;
    }

    @Override // org.telegram.ui.v60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        yx0 yx0Var = this.a;
        if (i10 < yx0Var.r || i10 >= yx0Var.s) {
            return false;
        }
        if (yx0Var.y != 1) {
            throw null;
        }
        yx0Var.U(Long.valueOf(yx0Var.getMessagesController().blockePeers.keyAt(i10 - yx0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        yx0 yx0Var = this.a;
        yx0Var.getClass();
        if (((Integer) obj).intValue() == yx0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p7, false)));
        }
        return null;
    }
}
