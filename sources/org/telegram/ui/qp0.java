package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class qp0 implements kq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ up0 c;

    public qp0(up0 up0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = up0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.kq0
    public final void b(Editable editable) {
        up0 up0Var = this.c;
        org.telegram.ui.Components.qu quVar = up0Var.M;
        up0Var.a = editable;
        quVar.setText(editable);
    }

    @Override // org.telegram.ui.kq0
    public final void d(int i10, boolean z10, boolean z11) {
        up0 up0Var = this.c;
        up0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        up0Var.V(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.kq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.kq0
    public final void a() {
    }

    @Override // org.telegram.ui.kq0
    public final /* synthetic */ void c() {
    }
}
