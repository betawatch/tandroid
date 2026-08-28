package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t50 extends f2.s {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ u50 c;

    public t50(u50 u50Var, ArrayList arrayList) {
        this.c = u50Var;
        this.b = arrayList;
    }

    @Override // f2.s
    public final boolean a(int i9, int i10) {
        return true;
    }

    @Override // f2.s
    public final boolean b(int i9, int i10) {
        ArrayList arrayList = this.b;
        if (i9 >= arrayList.size()) {
            return false;
        }
        u50 u50Var = this.c;
        if (i10 < u50Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i9)).equals(u50Var.e.get(i10));
        }
        return false;
    }

    @Override // f2.s
    public final int d() {
        return this.c.e.size();
    }

    @Override // f2.s
    public final int e() {
        return this.b.size();
    }
}
