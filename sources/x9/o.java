package x9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                    u9.b bVar = this.b.d;
                    ca.c cVar = (ca.c) bVar.c;
                    String str = (String) bVar.b;
                    cVar.getClass();
                    boolean delete = new File(cVar.b, str).delete();
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
                u9.b bVar2 = nVar.c;
                ca.c cVar2 = (ca.c) bVar2.c;
                String str2 = (String) bVar2.b;
                cVar2.getClass();
                boolean z10 = true;
                if (new File(cVar2.b, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ca.c cVar3 = (ca.c) bVar2.c;
                    cVar3.getClass();
                    new File(cVar3.b, str2).delete();
                } else {
                    String e7 = nVar.e();
                    if (e7 == null || !nVar.j.c(e7)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
