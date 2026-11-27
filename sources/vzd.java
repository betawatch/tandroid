// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vzd extends c4 {
    public static final Parcelable.Creator<vzd> CREATOR = new hud((byte) 23);
    public final int a;
    public final ArrayList b;

    public vzd(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.p(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
