// default package

import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class vue {
    public static qbb a(qbb qbbVar) {
        return !(qbbVar instanceof sbb) ? qbbVar instanceof rbb ? qbbVar : qbbVar instanceof Serializable ? new rbb(qbbVar) : new sbb(qbbVar) : qbbVar;
    }
}
