package s7;

import a8.df;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o extends p6.a {
    public static final Parcelable.Creator<o> CREATOR = new m(2);
    public final int a;
    public final n b;
    public final h8.q c;
    public final h8.n d;
    public final PendingIntent e;
    public final y f;
    public final String h;

    public o(int i10, n nVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        h8.q qVar;
        h8.n nVar2;
        this.a = i10;
        this.b = nVar;
        y yVar = null;
        if (iBinder != null) {
            int i11 = h8.p.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            qVar = queryLocalInterface instanceof h8.q ? (h8.q) queryLocalInterface : new h8.o(iBinder, "com.google.android.gms.location.ILocationListener", 9);
        } else {
            qVar = null;
        }
        this.c = qVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = i.c;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            nVar2 = queryLocalInterface2 instanceof h8.n ? (h8.n) queryLocalInterface2 : new h8.m(iBinder2, "com.google.android.gms.location.ILocationCallback", 9);
        } else {
            nVar2 = null;
        }
        this.d = nVar2;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            yVar = queryLocalInterface3 instanceof y ? (y) queryLocalInterface3 : new w(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
        }
        this.f = yVar;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.k(parcel, 2, this.b, i10);
        h8.q qVar = this.c;
        df.f(parcel, 3, qVar == null ? null : qVar.asBinder());
        df.k(parcel, 4, this.e, i10);
        h8.n nVar = this.d;
        df.f(parcel, 5, nVar == null ? null : nVar.asBinder());
        y yVar = this.f;
        df.f(parcel, 6, yVar != null ? yVar.asBinder() : null);
        df.l(parcel, 8, this.h);
        df.r(parcel, q5);
    }
}
