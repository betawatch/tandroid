package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class yp0 implements vq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ fq0 c;

    public yp0(fq0 fq0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = fq0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.vq0
    public final void b(Editable editable) {
        fq0 fq0Var = this.c;
        org.telegram.ui.Components.mu muVar = fq0Var.M;
        fq0Var.a = editable;
        muVar.setText(editable);
    }

    @Override // org.telegram.ui.vq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.vq0
    public final void h(int i10, boolean z10, boolean z11) {
        fq0 fq0Var = this.c;
        fq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        fq0Var.T(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.vq0
    public final void a() {
    }

    @Override // org.telegram.ui.vq0
    public final /* synthetic */ void g() {
    }
}
