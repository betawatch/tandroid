package p6;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b7.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;
import kh.a2;
import x6.c;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b extends Binder implements IInterface {
    public final /* synthetic */ int a;
    public final Object b;

    public b(int i10, TaskCompletionSource taskCompletionSource) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                break;
            default:
                this.b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i10 = this.a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L7;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (this.a) {
            case 0:
                if (i10 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i12 = l.a;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(a2.j(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                r5.a(createFromParcel, pendingIntent, (TaskCompletionSource) this.b);
                return true;
            case 1:
                if (i10 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator2 = Status.CREATOR;
                int i13 = c.a;
                Status createFromParcel2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 > 0) {
                    throw new BadParcelableException(a2.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                r5.a(createFromParcel2, null, (TaskCompletionSource) this.b);
                return true;
            default:
                if (i10 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i10 == 1) {
                    ((b9.c) this.b).a((Status) d7.c.a(parcel, Status.CREATOR));
                } else if (i10 == 2) {
                } else {
                    if (i10 != 4) {
                        return false;
                    }
                }
                return true;
        }
    }

    public b(b9.c cVar) {
        this.a = 2;
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.b = cVar;
    }
}
