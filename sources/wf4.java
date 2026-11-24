// default package

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wf4 implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((vf4) obj).c, ((vf4) obj2).c);
    }
}
