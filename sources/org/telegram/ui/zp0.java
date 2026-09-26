package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class zp0 implements sq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ cq0 c;

    public zp0(cq0 cq0Var, HashMap hashMap, ArrayList arrayList) {
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
