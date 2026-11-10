package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class st0 implements org.telegram.messenger.k9, org.telegram.ui.Components.dj0, v40 {
    public final /* synthetic */ vt0 a;

    public /* synthetic */ st0(vt0 vt0Var) {
        this.a = vt0Var;
    }

    @Override // org.telegram.ui.v40
    public void a(ArrayList arrayList, boolean z9, boolean z10) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.a0();
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        vt0 vt0Var = this.a;
        if (i7 < vt0Var.r || i7 >= vt0Var.s) {
            return false;
        }
        if (vt0Var.D != 1) {
            throw null;
        }
        vt0Var.Z(Long.valueOf(vt0Var.getMessagesController().G0.keyAt(i7 - vt0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        vt0 vt0Var = this.a;
        vt0Var.getClass();
        if (((Integer) obj).intValue() == vt0Var.x) {
            return Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.p7, false)));
        }
        return null;
    }
}
