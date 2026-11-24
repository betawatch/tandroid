// default package

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u4d extends e4d {
    public final TaskCompletionSource b;
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u4d(u76 u76Var, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = (byte) 1;
        this.d = u76Var;
    }

    @Override // z4d
    public final void a(Status status) {
        this.b.trySetException(new ap(status));
    }

    @Override // z4d
    public final void b(RuntimeException runtimeException) {
        this.b.trySetException(runtimeException);
    }

    @Override // z4d
    public final /* bridge */ /* synthetic */ void c(rhb rhbVar, boolean z) {
        byte b = this.c;
    }

    @Override // z4d
    public final void d(w3d w3dVar) {
        try {
            k(w3dVar);
        } catch (DeadObjectException e) {
            a(z4d.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(z4d.e(e2));
        } catch (RuntimeException e3) {
            this.b.trySetException(e3);
        }
    }

    @Override // e4d
    public final o94[] f(w3d w3dVar) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((i4d) obj).a.b;
            default:
                i4d i4dVar = (i4d) w3dVar.f.get((u76) obj);
                if (i4dVar == null) {
                    return null;
                }
                return i4dVar.a.b;
        }
    }

    @Override // e4d
    public final boolean g(w3d w3dVar) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((i4d) obj).a.c;
            default:
                i4d i4dVar = (i4d) w3dVar.f.get((u76) obj);
                return i4dVar != null && i4dVar.a.c;
        }
    }

    @Override // e4d
    public final int h(w3d w3dVar) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((i4d) obj).a.d;
            default:
                i4d i4dVar = (i4d) w3dVar.f.get((u76) obj);
                if (i4dVar != null) {
                    return i4dVar.a.d;
                }
                return -1;
        }
    }

    public final void k(w3d w3dVar) {
        switch (this.c) {
            case 0:
                i4d i4dVar = (i4d) this.d;
                j4d j4dVar = i4dVar.a;
                j4dVar.e.a.accept(w3dVar.b, this.b);
                u76 u76Var = j4dVar.a.b;
                if (u76Var != null) {
                    w3dVar.f.put(u76Var, i4dVar);
                    break;
                }
                break;
            default:
                i4d i4dVar2 = (i4d) w3dVar.f.remove((u76) this.d);
                if (i4dVar2 == null) {
                    this.b.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    ((v79) i4dVar2.b.c).b.accept(w3dVar.b, this.b);
                    i4dVar2.a.a.b = null;
                    break;
                }
        }
    }

    public u4d(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u4d(i4d i4dVar, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = (byte) 0;
        this.d = i4dVar;
    }

    private final /* bridge */ /* synthetic */ void i(rhb rhbVar, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(rhb rhbVar, boolean z) {
    }
}
