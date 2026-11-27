// default package

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class z9a {
    public final srb a;
    public final vcc b;

    public z9a(srb srbVar, vcc vccVar) {
        srbVar.getClass();
        vccVar.getClass();
        this.a = srbVar;
        this.b = vccVar;
    }

    public final s9a a(s9a s9aVar) {
        String str;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        String lowerCase = ldb.c(uuid, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (s9aVar == null || (str = s9aVar.b) == null) ? lowerCase : str;
        int i = s9aVar != null ? s9aVar.c + 1 : 0;
        this.a.getClass();
        return new s9a(srb.a().b, lowerCase, str2, i);
    }
}
