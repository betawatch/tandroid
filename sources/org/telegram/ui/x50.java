package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x50 extends f2.q {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ y50 c;

    public x50(y50 y50Var, ArrayList arrayList) {
        this.c = y50Var;
        this.b = arrayList;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.b;
        if (i10 >= arrayList.size()) {
            return false;
        }
        y50 y50Var = this.c;
        if (i11 < y50Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(y50Var.e.get(i11));
        }
        return false;
    }

    @Override // f2.q
    public final int d() {
        return this.c.e.size();
    }

    @Override // f2.q
    public final int e() {
        return this.b.size();
    }
}
