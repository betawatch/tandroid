package r7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m(2);
    public final int a;
    public final n b;
    public final g8.q c;
    public final g8.n d;
    public final PendingIntent e;
    public final y f;
    public final String h;

    public o(int i10, n nVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        g8.q qVar;
        g8.n nVar2;
        this.a = i10;
        this.b = nVar;
        y yVar = null;
        if (iBinder != null) {
            int i11 = g8.p.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            qVar = queryLocalInterface instanceof g8.q ? (g8.q) queryLocalInterface : new g8.o(iBinder, "com.google.android.gms.location.ILocationListener", 8);
        } else {
            qVar = null;
        }
        this.c = qVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = i.c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            nVar2 = queryLocalInterface2 instanceof g8.n ? (g8.n) queryLocalInterface2 : new g8.m(iBinder2, "com.google.android.gms.location.ILocationCallback", 8);
        } else {
            nVar2 = null;
        }
        this.d = nVar2;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            yVar = queryLocalInterface3 instanceof y ? (y) queryLocalInterface3 : new w(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 8);
        }
        this.f = yVar;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        e0.k(parcel, 2, this.b, i10);
        g8.q qVar = this.c;
        e0.f(parcel, 3, qVar == null ? null : qVar.asBinder());
        e0.k(parcel, 4, this.e, i10);
        g8.n nVar = this.d;
        e0.f(parcel, 5, nVar == null ? null : nVar.asBinder());
        y yVar = this.f;
        e0.f(parcel, 6, yVar != null ? yVar.asBinder() : null);
        e0.l(parcel, 8, this.h);
        e0.r(parcel, q6);
    }
}
