package x5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v extends y5.a {
    public static final Parcelable.Creator<v> CREATOR = new w7.i(6);
    public final int a;
    public final IBinder b;
    public final u5.a c;
    public final boolean d;
    public final boolean e;

    public v(int i9, IBinder iBinder, u5.a aVar, boolean z10, boolean z11) {
        this.a = i9;
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
            int i9 = a.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            l0Var = queryLocalInterface instanceof h ? (h) queryLocalInterface : new l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 11);
        }
        IBinder iBinder2 = vVar.b;
        if (iBinder2 != null) {
            int i10 = a.b;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof h ? (h) queryLocalInterface2 : new l0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 11);
        }
        return l.l(l0Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.f(parcel, 2, this.b);
        p8.k(parcel, 3, this.c, i9);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        p8.r(parcel, q10);
    }
}
