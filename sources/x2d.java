// default package

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class x2d {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public x2d(int i) {
        this.a = i;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(aec aecVar, boolean z);

    public abstract void d(u1d u1dVar);
}
