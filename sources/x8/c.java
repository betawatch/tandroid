package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(18);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.k(parcel, 3, this.b, i10);
        df.k(parcel, 5, this.c, i10);
        df.r(parcel, q5);
    }
}
