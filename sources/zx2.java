// default package

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zx2 {
    public final w53 a;
    public final mv6 b;

    public zx2(w53 w53Var, jb4 jb4Var) {
        this.a = w53Var;
        this.b = new mv6(jb4Var);
    }

    public final String a(String str) {
        String substring;
        mv6 mv6Var = this.b;
        synchronized (mv6Var) {
            if (Objects.equals((String) mv6Var.c, str)) {
                return (String) mv6Var.d;
            }
            jb4 jb4Var = (jb4) mv6Var.b;
            yx2 yx2Var = mv6.n;
            File file = new File((File) jb4Var.d, str);
            file.mkdirs();
            List e = jb4.e(file.listFiles(yx2Var));
            if (e.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e, mv6.r)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        mv6 mv6Var = this.b;
        synchronized (mv6Var) {
            if (!Objects.equals((String) mv6Var.c, str)) {
                mv6.a0((jb4) mv6Var.b, str, (String) mv6Var.d);
                mv6Var.c = str;
            }
        }
    }
}
