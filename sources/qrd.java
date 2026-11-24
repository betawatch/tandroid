// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class qrd {
    public static List a(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
