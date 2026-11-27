// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vg7 extends c4 {
    public static final Parcelable.Creator<vg7> CREATOR = new mx6((byte) 29);
    public final boolean a;
    public final int b;

    public vg7(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.s(parcel, r);
    }
}
