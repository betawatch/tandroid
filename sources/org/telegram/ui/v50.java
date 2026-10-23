package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class v50 extends s4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ w50 c;

    public v50(w50 w50Var, ArrayList arrayList) {
        this.c = w50Var;
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
        w50 w50Var = this.c;
        if (i11 < w50Var.e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(w50Var.e.get(i11));
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
