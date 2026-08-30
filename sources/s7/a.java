package s7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b6.m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends Binder implements j, IInterface {
    public final /* synthetic */ int a;
    public final TaskCompletionSource b;

    public a(int i10, TaskCompletionSource taskCompletionSource) {
        this.a = i10;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        this.b = taskCompletionSource;
    }

    @Override // s7.j
    public void A(int i10, boolean z4) {
        switch (this.a) {
            case 1:
                r5.a(new Status(i10, null, null, null), Boolean.valueOf(z4), this.b);
                break;
        }
    }

    @Override // s7.j
    public void h0(Status status, boolean z4) {
        switch (this.a) {
            case 1:
                r5.a(status, Boolean.valueOf(z4), this.b);
                break;
        }
    }

    @Override // s7.j
    public void l0(Status status, j8.i iVar) {
        switch (this.a) {
            case 0:
                int i10 = j8.a.c;
                boolean e = status.e();
                TaskCompletionSource taskCompletionSource = this.b;
                if (!e) {
                    taskCompletionSource.setException(m.m(status));
                    break;
                } else {
                    taskCompletionSource.setResult(iVar);
                    break;
                }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z4;
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        switch (i10) {
            case 1:
                parcel.readInt();
                return true;
            case 2:
                parcel.readInt();
                return true;
            case 3:
                int readInt = parcel.readInt();
                int i12 = c.a;
                z4 = parcel.readInt() != 0;
                A(readInt, z4);
                return true;
            case 4:
                parcel.readInt();
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                int i13 = c.a;
                parcel.readInt();
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                z4 = parcel.readInt() != 0;
                h0(status, z4);
                return true;
            case 10:
                return true;
            case 11:
                return true;
            case 12:
                return true;
            case 13:
                return true;
            case 14:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                j8.i iVar = (j8.i) c.a(parcel, j8.i.CREATOR);
                l0(status2, iVar);
                return true;
            case 15:
                return true;
            case 16:
                return true;
            case 17:
                return true;
            case 18:
                parcel.readInt();
                return true;
            case 19:
                return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void E0(Status status, boolean z4) {
    }

    public final void F0(Status status, j8.i iVar) {
    }

    public final void G0(int i10, boolean z4) {
    }
}
