// default package

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
