// default package

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class z4d {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public z4d(int i) {
        this.a = i;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(rhb rhbVar, boolean z);

    public abstract void d(w3d w3dVar);
}
