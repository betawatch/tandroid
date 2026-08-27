package pa;

import java.net.InetAddress;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class p0 extends ma.u {
    @Override // ma.u
    public final Object read(ua.a aVar) {
        if (aVar.x() != 9) {
            return InetAddress.getByName(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        bVar.r(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
