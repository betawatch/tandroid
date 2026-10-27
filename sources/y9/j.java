package y9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j {
    public final s a;
    public final i b;

    public j(s sVar, da.c cVar) {
        this.a = sVar;
        this.b = new i(cVar);
    }

    public final String a(String str) {
        String substring;
        i iVar = this.b;
        synchronized (iVar) {
            if (Objects.equals(iVar.b, str)) {
                return iVar.c;
            }
            da.c cVar = iVar.a;
            da.a aVar = i.d;
            File file = new File(cVar.c, str);
            file.mkdirs();
            List e = da.c.e(file.listFiles(aVar));
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
