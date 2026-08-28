package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zw0 implements GenericProvider, org.telegram.ui.Components.ok0, g60 {
    public final /* synthetic */ cx0 a;

    public /* synthetic */ zw0(cx0 cx0Var) {
        this.a = cx0Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        cx0 cx0Var = this.a;
        if (i9 < cx0Var.r || i9 >= cx0Var.s) {
            return false;
        }
        if (cx0Var.y != 1) {
            throw null;
        }
        cx0Var.T(Long.valueOf(cx0Var.getMessagesController().blockePeers.keyAt(i9 - cx0Var.r)), view);
        return true;
    }

    @Override // org.telegram.ui.g60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.U();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        cx0 cx0Var = this.a;
        cx0Var.getClass();
        if (((Integer) obj).intValue() == cx0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false)));
        }
        return null;
    }
}
