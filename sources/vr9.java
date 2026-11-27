// default package

import android.app.ApplicationExitInfo;
import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpTransceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class vr9 implements NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativePointerRunnable, bs9, ot2, fd, vob, wob, zla, ama, Continuation, nu4, jcc {
    public final /* synthetic */ byte a;

    public /* synthetic */ vr9(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo a(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return ShortcutManager.class;
    }

    public static /* synthetic */ void k(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void l(Throwable th) {
        throw new IllegalStateException(th);
    }

    @Override // ot2
    public final void accept(Object obj) {
        ((ws9) obj).b.release();
    }

    @Override // bs9
    public final Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                rx6 a = ta0.a();
                a.o0(rawQuery.getString(1));
                a.d = qm8.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a.c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a.t());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        RtpTransceiver.RtpTransceiverDirection lambda$getDirection$3;
        MediaStreamTrack.MediaType lambda$getMediaType$0;
        switch (this.a) {
            case 0:
                lambda$getDirection$3 = RtpTransceiver.lambda$getDirection$3(j);
                return lambda$getDirection$3;
            default:
                lambda$getMediaType$0 = RtpTransceiver.lambda$getMediaType$0(j);
                return lambda$getMediaType$0;
        }
    }

    @Override // ama
    public final void d(Object obj, float f) {
        c8a c8aVar = (c8a) obj;
        c8aVar.n = f;
        c8aVar.invalidate();
    }

    @Override // wob
    public final void e(int i, View view) {
        switch (this.a) {
            case 9:
                int i2 = kx9.x;
                ((kx9) view).setTextColor(i);
                break;
            default:
                ((ixa) view).setColor(i);
                break;
        }
    }

    @Override // vob
    public final int f(View view) {
        switch (this.a) {
            case 8:
                return ((kx9) view).w;
            default:
                return ((ixa) view).y;
        }
    }

    @Override // jcc
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        return num.intValue() == 0 ? ob6.G(num2.intValue(), "MaximumReactionsValue", new Object[0]) : String.valueOf(num2);
    }

    @Override // zla
    public final float get(Object obj) {
        return ((c8a) obj).n;
    }

    @Override // nu4
    public final Object h(Object obj) {
        int i = kea.T2;
        return 0;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerRunnable
    public final void run(long j) {
        RtpTransceiver.lambda$stopStandard$9(j);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            d80 d80Var = (d80) task.getResult();
            sae saeVar = sae.b;
            saeVar.f("Crashlytics report successfully enqueued to DataTransport: " + d80Var.b);
            File file = d80Var.c;
            if (file.delete()) {
                saeVar.f("Deleted report file: " + file.getPath());
            } else {
                saeVar.l("Crashlytics could not delete report file: " + file.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 6:
                idVar.dismiss();
                break;
            case 7:
                idVar.dismiss();
                break;
            case 16:
                break;
            case 17:
                idVar.dismiss();
                break;
            case 18:
                idVar.dismiss();
                break;
            case 19:
                idVar.dismiss();
                break;
            default:
                wua.h2(new o7c(6, null));
                break;
        }
    }

    private final void m(id idVar, int i) {
    }
}
