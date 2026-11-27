// default package

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class u3d extends Binder implements IInterface {
    public final /* synthetic */ byte a;

    public u3d(String str, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
            case 5:
            case 7:
            case 10:
            case 11:
            default:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 6:
                attachInterface(this, str);
                break;
            case 8:
                attachInterface(this, str);
                break;
            case 9:
                attachInterface(this, str);
                break;
            case 12:
                attachInterface(this, str);
                break;
        }
    }

    public static void a(Parcel parcel) {
        int i = hld.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new BadParcelableException(sb.toString());
    }

    public abstract void P(Status status, qp5 qp5Var);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.a;
        return this;
    }

    public abstract boolean b(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean c(int i, Parcel parcel, Parcel parcel2);

    public boolean d(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean e(Parcel parcel, int i);

    public abstract void f(Status status, n54 n54Var);

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        io createFromParcel;
        boolean z2;
        boolean z3;
        boolean z4;
        switch (this.a) {
            case 0:
                if (i > 16777215) {
                    z = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z = false;
                }
                if (z) {
                    return true;
                }
                o5d o5dVar = (o5d) this;
                if (i == 3) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i3 = j4d.a;
                    Status createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                    w4d createFromParcel3 = parcel.readInt() == 0 ? null : w4d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? io.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail > 0) {
                        throw new BadParcelableException(uh9.k(dataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    createFromParcel2.getClass();
                    if (!createFromParcel2.b() || createFromParcel3 == null) {
                        mh0 mh0Var = t3d.l;
                        Log.w(mh0Var.b, mh0Var.b("Failed to get verification support info. Status: " + createFromParcel2, new Object[0]));
                    } else {
                        mh0 mh0Var2 = t3d.l;
                        Log.i(mh0Var2.b, mh0Var2.b("Verification support info received.", new Object[0]));
                        mh0Var2.a("result: " + createFromParcel3, new Object[0]);
                    }
                    vze.a(createFromParcel2, createFromParcel3, o5dVar.b);
                    return true;
                }
                if (i == 4) {
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i4 = j4d.a;
                    Status createFromParcel4 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                    o4d createFromParcel5 = parcel.readInt() == 0 ? null : o4d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? io.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail2 = parcel.dataAvail();
                    if (dataAvail2 > 0) {
                        throw new BadParcelableException(uh9.k(dataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    createFromParcel4.getClass();
                    p3d.a();
                } else if (i == 5) {
                    Parcelable.Creator<Status> creator3 = Status.CREATOR;
                    int i5 = j4d.a;
                    Status createFromParcel6 = parcel.readInt() == 0 ? null : creator3.createFromParcel(parcel);
                    a5d createFromParcel7 = parcel.readInt() == 0 ? null : a5d.CREATOR.createFromParcel(parcel);
                    createFromParcel = parcel.readInt() != 0 ? io.CREATOR.createFromParcel(parcel) : null;
                    int dataAvail3 = parcel.dataAvail();
                    if (dataAvail3 > 0) {
                        throw new BadParcelableException(uh9.k(dataAvail3, "Parcel data not fully consumed, unread size: "));
                    }
                    createFromParcel6.getClass();
                    p3d.a();
                }
                return false;
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return b(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return c(i, parcel, parcel2);
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                mmd mmdVar = (mmd) this;
                if (i != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                int i6 = udd.a;
                int dataAvail4 = parcel.dataAvail();
                if (dataAvail4 > 0) {
                    throw new BadParcelableException(uh9.k(dataAvail4, "Parcel data not fully consumed, unread size: "));
                }
                mmdVar.b.a(Integer.valueOf(readInt));
                return true;
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return d(i, parcel, parcel2);
            case 5:
                if (i > 16777215) {
                    z2 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
                lme lmeVar = (lme) this;
                switch (i) {
                    case 1:
                        lmeVar.b.a((Status) bld.a(parcel, Status.CREATOR));
                        return true;
                    case 2:
                        p3d.a();
                        break;
                    case 3:
                        parcel.readLong();
                        p3d.a();
                        break;
                    case 4:
                        p3d.a();
                        break;
                    case 5:
                        parcel.readLong();
                        p3d.a();
                        break;
                    case 6:
                        p3d.a();
                        break;
                    case 7:
                        p3d.a();
                        break;
                    case 8:
                        p3d.a();
                        break;
                    case 9:
                        p3d.a();
                        break;
                }
                return false;
            case 6:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return d(i, parcel, parcel2);
            case 7:
                if (i > 16777215) {
                    z3 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z3 = false;
                }
                if (z3) {
                    return true;
                }
                sr5 sr5Var = (sr5) this;
                TaskCompletionSource taskCompletionSource = sr5Var.c;
                byte b = sr5Var.b;
                switch (i) {
                    case 1:
                        Status status = (Status) hld.a(parcel, Status.CREATOR);
                        p68 p68Var = (p68) hld.a(parcel, p68.CREATOR);
                        a(parcel);
                        status.getClass();
                        switch (b) {
                            case 1:
                                vze.a(status, p68Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 2:
                        Status status2 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status2.getClass();
                        p3d.a();
                        break;
                    case 3:
                        Status status3 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status3.getClass();
                        p3d.a();
                        break;
                    case 4:
                        Status status4 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status4.getClass();
                        p3d.a();
                        break;
                    case 5:
                        Status status5 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status5.getClass();
                        p3d.a();
                        break;
                    case 6:
                        Status status6 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status6.getClass();
                        p3d.a();
                        break;
                    case 7:
                        Status status7 = (Status) hld.a(parcel, Status.CREATOR);
                        x03 x03Var = (x03) hld.a(parcel, x03.CREATOR);
                        a(parcel);
                        status7.getClass();
                        switch (b) {
                            case 0:
                                vze.a(status7, x03Var, taskCompletionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 8:
                        Status status8 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status8.getClass();
                        p3d.a();
                        break;
                    case 9:
                        Status status9 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status9.getClass();
                        throw new UnsupportedOperationException();
                    case 10:
                        Status status10 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status10.getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        Status status11 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status11.getClass();
                        p3d.a();
                        break;
                    case 12:
                        Status status12 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status12.getClass();
                        p3d.a();
                        break;
                    case 13:
                        Status status13 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status13.getClass();
                        p3d.a();
                        break;
                    case 14:
                        Status status14 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status14.getClass();
                        p3d.a();
                        break;
                    case 15:
                        Status status15 = (Status) hld.a(parcel, Status.CREATOR);
                        a(parcel);
                        status15.getClass();
                        p3d.a();
                        break;
                }
                return false;
            case 8:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return e(parcel, i);
            case 9:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return d(i, parcel, parcel2);
            case 10:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 11:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                vdf vdfVar = (vdf) this;
                if (i == 1) {
                    vdfVar.b.a(new zbf((Status) qld.a(parcel, Status.CREATOR), (l9d) qld.a(parcel, l9d.CREATOR)));
                    return true;
                }
                if (i == 2) {
                    parcel.readString();
                    p3d.a();
                } else if (i == 3) {
                    p3d.a();
                } else if (i == 4) {
                    parcel.readInt();
                    p3d.a();
                } else if (i == 6) {
                    p3d.a();
                } else if (i == 8) {
                    p3d.a();
                } else if (i == 10) {
                    parcel.readInt();
                    p3d.a();
                } else if (i == 11) {
                    p3d.a();
                } else if (i == 15) {
                    p3d.a();
                } else if (i == 16) {
                    parcel.readString();
                    parcel.readInt();
                    p3d.a();
                }
                return false;
            case 12:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return d(i, parcel, parcel2);
            case 13:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                if (i == 1) {
                    Status status16 = (Status) pld.a(parcel, Status.CREATOR);
                    qp5 qp5Var = (qp5) pld.a(parcel, qp5.CREATOR);
                    int dataAvail5 = parcel.dataAvail();
                    if (dataAvail5 > 0) {
                        throw new BadParcelableException(uh9.k(dataAvail5, "Parcel data not fully consumed, unread size: "));
                    }
                    P(status16, qp5Var);
                    return true;
                }
                if (i != 2) {
                    return false;
                }
                Status status17 = (Status) pld.a(parcel, Status.CREATOR);
                n54 n54Var = (n54) pld.a(parcel, n54.CREATOR);
                int dataAvail6 = parcel.dataAvail();
                if (dataAvail6 > 0) {
                    throw new BadParcelableException(uh9.k(dataAvail6, "Parcel data not fully consumed, unread size: "));
                }
                f(status17, n54Var);
                return true;
            case 14:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                switch (i) {
                    case 1:
                        parcel.readInt();
                        return true;
                    case 2:
                        parcel.readInt();
                        return true;
                    case 3:
                        int readInt2 = parcel.readInt();
                        int i7 = rld.a;
                        z4 = parcel.readInt() != 0;
                        S(readInt2, z4);
                        return true;
                    case 4:
                        parcel.readInt();
                        return true;
                    case 5:
                    default:
                        return false;
                    case 6:
                        parcel.readInt();
                        int i8 = rld.a;
                        parcel.readInt();
                        return true;
                    case 7:
                        return true;
                    case 8:
                        return true;
                    case 9:
                        Status status18 = (Status) rld.a(parcel, Status.CREATOR);
                        z4 = parcel.readInt() != 0;
                        Q(status18, z4);
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
                        Status status19 = (Status) rld.a(parcel, Status.CREATOR);
                        u18 u18Var = (u18) rld.a(parcel, u18.CREATOR);
                        R(status19, u18Var);
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
    }

    public void Q(Status status, boolean z) {
    }

    public void R(Status status, u18 u18Var) {
    }

    public void S(int i, boolean z) {
    }

    public u3d(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                break;
            default:
                attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
                break;
        }
    }
}
