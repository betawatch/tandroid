// default package

import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class vue {
    public static qbb a(qbb qbbVar) {
        return !(qbbVar instanceof sbb) ? qbbVar instanceof rbb ? qbbVar : qbbVar instanceof Serializable ? new rbb(qbbVar) : new sbb(qbbVar) : qbbVar;
    }
}
