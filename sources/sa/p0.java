package sa;

import java.net.InetAddress;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class p0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (aVar.x() != 9) {
            return InetAddress.getByName(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        bVar.r(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
