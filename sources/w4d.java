// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w4d extends c4 {
    public static final Parcelable.Creator<w4d> CREATOR = new mx6((byte) 24);
    public final ArrayList a;

    public w4d(ArrayList arrayList) {
        arrayList.getClass();
        this.a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.p(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
