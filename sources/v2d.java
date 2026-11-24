// default package

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v2d extends c2d {
    public final bgb b;
    public final TaskCompletionSource c;
    public final eef d;

    public v2d(int i, bgb bgbVar, TaskCompletionSource taskCompletionSource, eef eefVar) {
        super(i);
        this.c = taskCompletionSource;
        this.b = bgbVar;
        this.d = eefVar;
        if (i == 2 && bgbVar.b) {
            w26.j("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // x2d
    public final void a(Status status) {
        Exception a;
        switch (this.d.a) {
            case 13:
                a = bmd.a(status);
                break;
            default:
                int i = status.a;
                int i2 = status.a;
                String str = status.b;
                if (i != 8) {
                    if (str == null) {
                        str = asd.a(i2);
                    }
                    a = new fg4(str);
                    break;
                } else {
                    if (str == null) {
                        str = asd.a(i2);
                    }
                    a = new v30(str);
                    break;
                }
        }
        this.c.trySetException(a);
    }

    @Override // x2d
    public final void b(RuntimeException runtimeException) {
        this.c.trySetException(runtimeException);
    }

    @Override // x2d
    public final void c(aec aecVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) aecVar.c;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new v8b(aecVar, taskCompletionSource));
    }

    @Override // x2d
    public final void d(u1d u1dVar) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.b.c(u1dVar.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(x2d.e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    @Override // c2d
    public final f84[] f(u1d u1dVar) {
        return this.b.a;
    }

    @Override // c2d
    public final boolean g(u1d u1dVar) {
        return this.b.b;
    }

    @Override // c2d
    public final int h(u1d u1dVar) {
        return this.b.c;
    }
}
