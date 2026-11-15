package z7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class la implements ka {
    public final ArrayList a;

    public la(Context context, ja jaVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        jaVar.getClass();
        arrayList.add(new na(context, jaVar));
    }

    @Override // z7.ka
    public final void a(sg.h0 h0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((ka) obj).a(h0Var);
        }
    }
}
