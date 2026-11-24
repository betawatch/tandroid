// default package

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class rrd {
    protected int zza;

    public final byte[] a() {
        try {
            c2e c2eVar = (c2e) this;
            int e = c2eVar.e();
            byte[] bArr = new byte[e];
            cwd cwdVar = new cwd(e, bArr);
            bbe a = jae.c.a(c2eVar.getClass());
            xdd xddVar = cwdVar.a;
            if (xddVar == null) {
                xddVar = new xdd();
                Charset charset = h3e.a;
                xddVar.a = cwdVar;
                cwdVar.a = xddVar;
            }
            a.f(c2eVar, xddVar);
            if (e - cwdVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            fyb.j(tb4.y("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    public abstract int b(bbe bbeVar);
}
