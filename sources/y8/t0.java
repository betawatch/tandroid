package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class t0 extends o6.a {
    public static final Parcelable.Creator<t0> CREATOR = new n0(6);
    public final int a;
    public final int b;

    public t0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        w7.f0.r(parcel, q6);
    }
}
