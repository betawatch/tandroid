// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xdf extends c4 {
    public static final Parcelable.Creator<xdf> CREATOR = new t4f((byte) 18);
    public final int a;
    public final ArrayList b;
    public final qqe c;

    public xdf(int i, ArrayList arrayList, qqe qqeVar) {
        this.a = i;
        this.b = arrayList;
        this.c = qqeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.p(parcel, 2, this.b);
        bye.k(parcel, 3, this.c, i);
        bye.s(parcel, r);
    }
}
