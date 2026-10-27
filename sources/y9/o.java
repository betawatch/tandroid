package y9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ o(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                try {
                    m4.c cVar = this.b.d;
                    da.c cVar2 = (da.c) cVar.c;
                    String str = (String) cVar.b;
                    cVar2.getClass();
                    boolean delete = new File(cVar2.b, str).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.b.f;
                m4.c cVar3 = nVar.c;
                da.c cVar4 = (da.c) cVar3.c;
                String str2 = (String) cVar3.b;
                cVar4.getClass();
                boolean z10 = true;
                if (new File(cVar4.b, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    da.c cVar5 = (da.c) cVar3.c;
                    cVar5.getClass();
                    new File(cVar5.b, str2).delete();
                } else {
                    String e10 = nVar.e();
                    if (e10 == null || !nVar.j.c(e10)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
