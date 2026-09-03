package s5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import j7.g5;
import r5.c0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends c6.a {
    public final String a;
    public final String b;
    public final k c;
    public final f d;
    public final boolean e;
    public final boolean f;
    public static final u5.b h = new u5.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new c0(1);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z4, boolean z10) {
        k kVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            kVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 1);
        }
        this.c = kVar;
        this.d = fVar;
        this.e = z4;
        this.f = z10;
    }

    public final void e() {
        k kVar = this.c;
        if (kVar != null) {
            try {
                Parcel O0 = kVar.O0(kVar.M0(), 2);
                l6.a J0 = l6.b.J0(O0.readStrongBinder());
                O0.recycle();
                if (l6.b.K0(J0) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e6) {
                h.a(e6, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.l(parcel, 3, this.b);
        k kVar = this.c;
        g5.f(parcel, 4, kVar == null ? null : kVar.b);
        g5.k(parcel, 5, this.d, i10);
        g5.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        g5.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        g5.r(parcel, q10);
    }
}
