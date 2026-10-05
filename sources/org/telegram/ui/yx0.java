package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yx0 implements GenericProvider, org.telegram.ui.Components.ol0, z60 {
    public final /* synthetic */ by0 a;

    public /* synthetic */ yx0(by0 by0Var) {
        this.a = by0Var;
    }

    @Override // org.telegram.ui.z60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.T();
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        by0 by0Var = this.a;
        if (i10 < by0Var.r || i10 >= by0Var.s) {
            return false;
        }
        if (by0Var.y != 1) {
            throw null;
        }
        by0Var.S(Long.valueOf(by0Var.getMessagesController().blockePeers.keyAt(i10 - by0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        by0 by0Var = this.a;
        by0Var.getClass();
        if (((Integer) obj).intValue() == by0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.p7, false)));
        }
        return null;
    }
}
