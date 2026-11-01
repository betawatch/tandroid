package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu0 implements org.telegram.messenger.m9, org.telegram.ui.Components.jk0, q50 {
    public final /* synthetic */ zu0 a;

    public /* synthetic */ wu0(zu0 zu0Var) {
        this.a = zu0Var;
    }

    @Override // org.telegram.ui.q50
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.a0();
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        zu0 zu0Var = this.a;
        if (i10 < zu0Var.r || i10 >= zu0Var.s) {
            return false;
        }
        if (zu0Var.D != 1) {
            throw null;
        }
        zu0Var.Z(Long.valueOf(zu0Var.getMessagesController().G0.keyAt(i10 - zu0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.m9
    public Object l(Object obj) {
        zu0 zu0Var = this.a;
        zu0Var.getClass();
        if (((Integer) obj).intValue() == zu0Var.x) {
            return Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.p7, false)));
        }
        return null;
    }
}
