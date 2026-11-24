// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y2f implements q2f {
    public final ArrayList a;

    public y2f(Context context, l2f l2fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        l2fVar.getClass();
        arrayList.add(new v3f(context, l2fVar));
    }

    @Override // q2f
    public final void a(rhb rhbVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((q2f) obj).a(rhbVar);
        }
    }
}
