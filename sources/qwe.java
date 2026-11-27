// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qwe extends c4 {
    public static final Parcelable.Creator<qwe> CREATOR = new ime((byte) 5);
    public int a;
    public boolean b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.b;
        bye.q(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.s(parcel, r);
    }
}
