package w9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class j {
    public final r a;
    public final i b;

    public j(r rVar, ba.c cVar) {
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
            ba.c cVar = iVar.a;
            ba.a aVar = i.d;
            File file = new File(cVar.c, str);
            file.mkdirs();
            List e7 = ba.c.e(file.listFiles(aVar));
            if (e7.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e7, i.e)).getName().substring(4);
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
