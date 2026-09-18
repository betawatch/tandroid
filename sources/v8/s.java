package v8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.telegram.messenger.BuildConfig;
import org.telegram.ui.g71;
import v7.g5;
import y8.w0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements com.google.android.gms.common.api.internal.s, w2.d, Continuation, y2.h, g71 {
    public Object a;

    public /* synthetic */ s(Object obj) {
        this.a = obj;
    }

    public void a(IBinder iBinder) {
        synchronized (((HashMap) this.a)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new w0();
            for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + BuildConfig.BETA_URL);
                }
            }
        }
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
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            Bundle bundle = Bundle.EMPTY;
            g5.a(Status.h, Boolean.FALSE, aVar.b);
        }
    }

    @Override // y2.h
    public k4.d n(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.a).a.x(iOException);
        return y2.m.e;
    }

    @Override // y2.h
    public void q(y2.j jVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.a;
        synchronized (z2.b.b) {
            z10 = z2.b.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.x(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.a).call();
    }

    public s(int i10) {
        switch (i10) {
            case 4:
                this.a = new HashMap();
                break;
            default:
                this.a = new qb.b(28);
                break;
        }
    }

    @Override // y2.h
    public void V(y2.j jVar, long j3, long j10, boolean z10) {
    }

    @Override // y2.h
    public /* synthetic */ void o(y2.j jVar, long j3, long j10, int i10) {
    }
}
