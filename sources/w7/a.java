package w7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import q7.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new j(27);
    public final String a;
    public final byte[] b;
    public final int c;

    public a(String str, byte[] bArr, int i9) {
        this.a = str;
        this.b = bArr;
        this.c = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.c(parcel, 3, this.b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        p8.r(parcel, q10);
    }
}
