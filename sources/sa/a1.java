package sa;

import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
