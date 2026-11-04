package z9;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i {
    public final s a;
    public final h b;

    public i(s sVar, fa.f fVar) {
        this.a = sVar;
        this.b = new h(fVar);
    }

    public final String a(String str) {
        String substring;
        h hVar = this.b;
        synchronized (hVar) {
            if (Objects.equals(hVar.b, str)) {
                return hVar.c;
            }
            fa.f fVar = hVar.a;
            fa.a aVar = h.d;
            File file = new File((File) fVar.e, str);
            file.mkdirs();
            List i3 = fa.f.i(file.listFiles(aVar));
            if (i3.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(i3, h.e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        h hVar = this.b;
        synchronized (hVar) {
            if (!Objects.equals(hVar.b, str)) {
                h.a(hVar.a, str, hVar.c);
                hVar.b = str;
            }
        }
    }
}
