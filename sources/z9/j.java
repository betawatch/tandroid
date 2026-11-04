package z9;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Continuation, k5.e {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i3) {
        this.a = i3;
    }

    @Override // k5.e
    public Object apply(Object obj) {
        ab.e eVar = (ab.e) obj;
        eVar.getClass();
        p7.d dVar = za.n.a;
        dVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            dVar.l(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        int i3;
        switch (this.a) {
            case 3:
                if (task.isSuccessful()) {
                    b bVar = (b) task.getResult();
                    String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
                    w9.c cVar = w9.c.a;
                    cVar.b(str);
                    File file = bVar.c;
                    z10 = true;
                    if (file.delete()) {
                        cVar.b("Deleted report file: " + file.getPath());
                    } else {
                        cVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 4:
            default:
                i3 = -1;
                break;
            case 5:
                i3 = 403;
                break;
        }
        return Integer.valueOf(i3);
    }

    public /* synthetic */ j(x xVar) {
        this.a = 3;
    }
}
