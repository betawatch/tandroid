// default package

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q4d extends z4d {
    public final jh0 b;

    public q4d(int i, jh0 jh0Var) {
        super(i);
        this.b = jh0Var;
    }

    @Override // z4d
    public final void a(Status status) {
        try {
            this.b.o(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // z4d
    public final void b(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        try {
            this.b.o(new Status(10, kt6.p(simpleName, ": ", localizedMessage, new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length())), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // z4d
    public final void c(rhb rhbVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) rhbVar.b;
        jh0 jh0Var = this.b;
        map.put(jh0Var, valueOf);
        jh0Var.b(new o5d(rhbVar, jh0Var));
    }

    @Override // z4d
    public final void d(w3d w3dVar) {
        try {
            jh0 jh0Var = this.b;
            try {
                try {
                    jh0Var.n(w3dVar.b);
                } catch (DeadObjectException e) {
                    jh0Var.o(new Status(8, e.getLocalizedMessage(), null, null));
                    throw e;
                }
            } catch (RemoteException e2) {
                jh0Var.o(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
