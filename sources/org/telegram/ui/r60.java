package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class r60 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ s60 c;

    public r60(s60 s60Var, ArrayList arrayList) {
        this.c = s60Var;
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
        s60 s60Var = this.c;
        if (i11 < s60Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(s60Var.e.get(i11));
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
