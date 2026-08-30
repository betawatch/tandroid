package s5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        f5.l(parcel, 4, this.c);
        f5.r(parcel, q10);
    }
}
