package z8;

import a8.df;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s extends p6.a {
    public static final Parcelable.Creator<s> CREATOR = new d(13);
    public final int a;
    public final ParcelFileDescriptor b;

    public s(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i10;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        df.k(parcel, 3, this.b, i10);
        df.r(parcel, q5);
    }
}
