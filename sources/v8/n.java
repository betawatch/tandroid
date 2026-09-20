package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new r(4);
    public int a;
    public String b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.a;
        f0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 2, this.b);
        f0.l(parcel, 3, this.c);
        f0.r(parcel, q6);
    }
}
