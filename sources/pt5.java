// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pt5 extends c4 {
    public static final Parcelable.Creator<pt5> CREATOR = new t4f((byte) 16);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.h(parcel, 2, this.a);
        bye.l(parcel, 4, this.b);
        bye.l(parcel, 5, this.c);
        bye.h(parcel, 6, this.d);
        boolean z = this.e;
        bye.q(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.l(parcel, 8, this.f);
        bye.s(parcel, r);
    }
}
