package r7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;
    public final String f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.a = i10;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g0.f(parcel, 2, this.b);
        g0.f(parcel, 3, this.c);
        g0.k(parcel, 4, this.d, i10);
        g0.l(parcel, 5, this.e);
        g0.l(parcel, 6, this.f);
        g0.r(parcel, q6);
    }
}
