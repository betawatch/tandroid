package x9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class j {
    public final r a;
    public final i b;

    public j(r rVar, ca.c cVar) {
        this.a = rVar;
        this.b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.b;
        synchronized (iVar) {
            if (Objects.equals(iVar.b, str)) {
                return iVar.c;
            }
            ca.c cVar = iVar.a;
            ca.a aVar = i.d;
            File file = new File(cVar.c, str);
            file.mkdirs();
            List e = ca.c.e(file.listFiles(aVar));
            if (e.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e, i.e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        i iVar = this.b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.b, str)) {
                i.a(iVar.a, str, iVar.c);
                iVar.b = str;
            }
        }
    }
}
