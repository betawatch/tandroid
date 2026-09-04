package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new r(4);
    public int a;
    public String b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.a;
        e0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 2, this.b);
        e0.l(parcel, 3, this.c);
        e0.r(parcel, q6);
    }
}
