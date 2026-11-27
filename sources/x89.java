// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class x89 extends c4 {
    public static final Parcelable.Creator<x89> CREATOR = new nkf((byte) 10);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;
    public final String h;

    public x89(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.h = "fcm-25.1.3";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.l(parcel, 2, this.b);
        bye.l(parcel, 3, this.c);
        bye.l(parcel, 4, this.d);
        bye.l(parcel, 5, this.e);
        int i2 = this.f;
        bye.q(parcel, 6, 4);
        parcel.writeInt(i2);
        bye.l(parcel, 7, this.h);
        bye.s(parcel, r);
    }

    public x89(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.h = str6;
    }
}
