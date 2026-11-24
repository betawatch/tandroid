// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class w0f {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a2d a2dVar = (a2d) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", a2dVar.a);
            bundle.putLong("event_timestamp", a2dVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
