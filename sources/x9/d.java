package x9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import h8.i;
import y8.j;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class d implements q, z2.d {
    public Object a;

    public /* synthetic */ d(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        j jVar = (j) this.a;
        h8.b bVar = (h8.b) obj;
        Bundle B = bVar.B();
        B.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        h8.a aVar = new h8.a(0, (TaskCompletionSource) obj2);
        try {
            i iVar = (i) bVar.n();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i7 = h8.c.a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            B.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            try {
                iVar.a.transact(19, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
            Bundle bundle = Bundle.EMPTY;
            aVar.e0(Status.h, null);
        }
    }
}
