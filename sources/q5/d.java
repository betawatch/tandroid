package q5;

import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new w0(13);
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
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
