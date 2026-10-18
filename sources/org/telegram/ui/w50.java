package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
