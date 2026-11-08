package q6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new q4.x(6);
    public final int a;
    public final IBinder b;
    public final n6.a c;
    public final boolean d;
    public final boolean e;

    public x(int i7, IBinder iBinder, n6.a aVar, boolean z9, boolean z10) {
        this.a = i7;
        this.b = iBinder;
        this.c = aVar;
        this.d = z9;
        this.e = z10;
    }

    public final boolean equals(Object obj) {
        Object m0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.c.equals(xVar.c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            m0Var = null;
        } else {
            int i7 = a.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            m0Var = queryLocalInterface instanceof i ? (i) queryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 9);
        }
        IBinder iBinder2 = xVar.b;
        if (iBinder2 != null) {
            int i10 = a.b;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof i ? (i) queryLocalInterface2 : new m0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 9);
        }
        return m.k(m0Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.f(parcel, 2, this.b);
        xb.k(parcel, 3, this.c, i7);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        xb.s(parcel, r10);
    }
}
