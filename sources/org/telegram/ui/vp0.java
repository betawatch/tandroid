package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class vp0 implements sq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ cq0 c;

    public vp0(cq0 cq0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = cq0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.sq0
    public final void b(Editable editable) {
        cq0 cq0Var = this.c;
        org.telegram.ui.Components.ku kuVar = cq0Var.M;
        cq0Var.a = editable;
        kuVar.setText(editable);
    }

    @Override // org.telegram.ui.sq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.sq0
    public final void i(int i10, boolean z10, boolean z11) {
        cq0 cq0Var = this.c;
        cq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        cq0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.sq0
    public final void a() {
    }

    @Override // org.telegram.ui.sq0
    public final /* synthetic */ void g() {
    }
}
