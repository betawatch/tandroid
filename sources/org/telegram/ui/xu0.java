package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xu0 implements org.telegram.messenger.l9, org.telegram.ui.Components.ik0, r50 {
    public final /* synthetic */ av0 a;

    public /* synthetic */ xu0(av0 av0Var) {
        this.a = av0Var;
    }

    @Override // org.telegram.ui.r50
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.Z();
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        av0 av0Var = this.a;
        if (i10 < av0Var.r || i10 >= av0Var.s) {
            return false;
        }
        if (av0Var.D != 1) {
            throw null;
        }
        av0Var.Y(Long.valueOf(av0Var.getMessagesController().G0.keyAt(i10 - av0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        av0 av0Var = this.a;
        av0Var.getClass();
        if (((Integer) obj).intValue() == av0Var.x) {
            return Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.p7, false)));
        }
        return null;
    }
}
