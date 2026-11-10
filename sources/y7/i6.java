package y7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class i6 implements com.google.android.gms.common.api.internal.p {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i6(int i7) {
        this.a = i7;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        y8.e eVar = (y8.e) this.b;
        h8.b bVar = (h8.b) obj;
        bVar.getClass();
        h8.a aVar = new h8.a(1, (TaskCompletionSource) obj2);
        try {
            h8.i iVar = (h8.i) bVar.n();
            Bundle B = bVar.B();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i7 = h8.c.a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            B.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            try {
                iVar.a.transact(14, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
            Bundle bundle = Bundle.EMPTY;
            a8.k8.a(Status.h, Boolean.FALSE, aVar.b);
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                ze.b bVar = ze.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ug.k0) this.b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
