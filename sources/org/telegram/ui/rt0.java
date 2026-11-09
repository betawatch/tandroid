package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rt0 implements org.telegram.messenger.k9, org.telegram.ui.Components.ej0, u40 {
    public final /* synthetic */ ut0 a;

    public /* synthetic */ rt0(ut0 ut0Var) {
        this.a = ut0Var;
    }

    @Override // org.telegram.ui.u40
    public void a(ArrayList arrayList, boolean z9, boolean z10) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.a0();
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        ut0 ut0Var = this.a;
        if (i7 < ut0Var.r || i7 >= ut0Var.s) {
            return false;
        }
        if (ut0Var.D != 1) {
            throw null;
        }
        ut0Var.Z(Long.valueOf(ut0Var.getMessagesController().G0.keyAt(i7 - ut0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        ut0 ut0Var = this.a;
        ut0Var.getClass();
        if (((Integer) obj).intValue() == ut0Var.x) {
            return Integer.valueOf(org.telegram.ui.ActionBar.l6.r1(0.12f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.p7, false)));
        }
        return null;
    }
}
