package s5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(4);
    public final String a;
    public final int b;
    public final String c;

    public d(String str, int i10, String str2) {
        this.a = str;
        this.b = i10;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        g5.l(parcel, 4, this.c);
        g5.r(parcel, q10);
    }
}
