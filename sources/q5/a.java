package q5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import o6.w0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends a6.a {
    public final String a;
    public final String b;
    public final k c;
    public final f d;
    public final boolean e;
    public final boolean f;
    public static final s5.b h = new s5.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new w0(10);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        k kVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            kVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 0);
        }
        this.c = kVar;
        this.d = fVar;
        this.e = z10;
        this.f = z11;
    }

    public final void b() {
        k kVar = this.c;
        if (kVar != null) {
            try {
                Parcel O0 = kVar.O0(kVar.M0(), 2);
                j6.a J0 = j6.b.J0(O0.readStrongBinder());
                O0.recycle();
                if (j6.b.K0(J0) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e10) {
                h.a(e10, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.b);
        k kVar = this.c;
        com.google.android.gms.internal.cast.o.f(parcel, 4, kVar == null ? null : kVar.b);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.d, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
