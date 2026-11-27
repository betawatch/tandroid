// default package

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
