package sa;

import java.net.URI;
import java.net.URISyntaxException;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class o0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            String v = aVar.v();
            if (v.equals(BuildConfig.BETA_URL)) {
                return null;
            }
            return new URI(v);
        } catch (URISyntaxException e6) {
            throw new pa.j(e6);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        URI uri = (URI) obj;
        bVar.r(uri == null ? null : uri.toASCIIString());
    }
}
