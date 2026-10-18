package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class w50 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ x50 c;

    public w50(x50 x50Var, ArrayList arrayList) {
        this.c = x50Var;
        this.b = arrayList;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.b;
        if (i10 >= arrayList.size()) {
            return false;
        }
        x50 x50Var = this.c;
        if (i11 < x50Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(x50Var.e.get(i11));
        }
        return false;
    }

    @Override // s4.o
    public final int d() {
        return this.c.e.size();
    }

    @Override // s4.o
    public final int e() {
        return this.b.size();
    }
}
