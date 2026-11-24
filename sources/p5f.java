// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p5f implements z5f {
    public final ArrayList a;

    public p5f(Context context, i5f i5fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        i5fVar.getClass();
        arrayList.add(new s6f(context, i5fVar));
    }

    @Override // z5f
    public final void a(ry ryVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((z5f) obj).a(ryVar);
        }
    }
}
