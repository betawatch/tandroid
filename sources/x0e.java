// default package

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class x0e extends c4 {
    public static final Parcelable.Creator<x0e> CREATOR = new hud((byte) 26);
    public final int a;
    public final ParcelFileDescriptor b;

    public x0e(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 3, this.b, i | 1);
        bye.s(parcel, r);
    }
}
