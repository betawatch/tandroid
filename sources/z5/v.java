package z5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v extends a6.a {
    public static final Parcelable.Creator<v> CREATOR = new w5.k(18);
    public final int a;
    public final IBinder b;
    public final w5.a c;
    public final boolean d;
    public final boolean e;

    public v(int i10, IBinder iBinder, w5.a aVar, boolean z10, boolean z11) {
        this.a = i10;
        this.b = iBinder;
        this.c = aVar;
        this.d = z10;
        this.e = z11;
    }

    public final boolean equals(Object obj) {
        Object l0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.c.equals(vVar.c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            l0Var = null;
        } else {
            int i10 = a.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            l0Var = queryLocalInterface instanceof h ? (h) queryLocalInterface : new l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 11);
        }
        IBinder iBinder2 = vVar.b;
        if (iBinder2 != null) {
            int i11 = a.b;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof h ? (h) queryLocalInterface2 : new l0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 11);
        }
        return l.l(l0Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.internal.cast.o.f(parcel, 2, this.b);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.c, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
