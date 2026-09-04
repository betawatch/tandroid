package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class m4 extends o6.a {
    public static final Parcelable.Creator<m4> CREATOR = new n5(0);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public m4(float f7, int i10, String str, String str2) {
        this.b = str2;
        this.c = f7;
        this.a = str;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        w7.e0.l(parcel, 4, this.a);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.e0.r(parcel, q6);
    }
}
