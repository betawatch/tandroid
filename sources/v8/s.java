package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import rg.p2;
import v7.f5;
import za.a0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements com.google.android.gms.common.api.internal.s, w2.d, Continuation {
    public Object a;

    public /* synthetic */ s(Object obj) {
        this.a = obj;
    }

    public void a(a0 a0Var) {
        ((l5.q) ((i5.f) ((pa.b) this.a).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new p2(this, 18)).a(new i5.a(null, a0Var, i5.d.a, null), new j2.e(17));
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        e eVar = (e) this.a;
        e8.b bVar = (e8.b) obj;
        bVar.getClass();
        e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.u();
            Bundle G = bVar.G();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            try {
                iVar.a.transact(14, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e7) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e7);
            Bundle bundle = Bundle.EMPTY;
            f5.a(Status.h, Boolean.FALSE, aVar.b);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.a).call();
    }
}
