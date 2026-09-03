package sa;

import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class a1 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (aVar.x() != 9) {
            return Boolean.valueOf(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        Boolean bool = (Boolean) obj;
        bVar.r(bool == null ? BuildConfig.BETA_URL : bool.toString());
    }
}
