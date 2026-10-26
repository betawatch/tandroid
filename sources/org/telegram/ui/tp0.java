package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tp0 implements qq0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ aq0 c;

    public tp0(aq0 aq0Var, HashMap hashMap, ArrayList arrayList) {
        this.c = aq0Var;
        this.a = hashMap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.qq0
    public final void b(Editable editable) {
        aq0 aq0Var = this.c;
        org.telegram.ui.Components.ru ruVar = aq0Var.M;
        aq0Var.a = editable;
        ruVar.setText(editable);
    }

    @Override // org.telegram.ui.qq0
    public final void d(int i10, boolean z10, boolean z11) {
        aq0 aq0Var = this.c;
        aq0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        aq0Var.W(this.a, this.b, z11, i10);
    }

    @Override // org.telegram.ui.qq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.qq0
    public final void a() {
    }

    @Override // org.telegram.ui.qq0
    public final /* synthetic */ void c() {
    }
}
