package sa;

import java.net.URL;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class n0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.equals(BuildConfig.BETA_URL)) {
            return null;
        }
        return new URL(v);
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        URL url = (URL) obj;
        bVar.r(url == null ? null : url.toExternalForm());
    }
}
