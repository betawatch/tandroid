package p6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x extends q6.a {
    public static final Parcelable.Creator<x> CREATOR = new n8.g(21);
    public final int a;
    public final IBinder b;
    public final m6.a c;
    public final boolean d;
    public final boolean e;

    public x(int i3, IBinder iBinder, m6.a aVar, boolean z10, boolean z11) {
        this.a = i3;
        this.b = iBinder;
        this.c = aVar;
        this.d = z10;
        this.e = z11;
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
            int i3 = a.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            m0Var = queryLocalInterface instanceof i ? (i) queryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 8);
        }
        IBinder iBinder2 = xVar.b;
        if (iBinder2 != null) {
            int i10 = a.b;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof i ? (i) queryLocalInterface2 : new m0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 8);
        }
        return m.k(m0Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.g(parcel, 2, this.b);
        j8.a.l(parcel, 3, this.c, i3);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
