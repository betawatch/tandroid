// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w99 extends c4 {
    public static final Parcelable.Creator<w99> CREATOR = new mx6((byte) 17);
    public final Bundle a;
    public qs b;

    public w99(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.b(parcel, 2, this.a);
        bye.s(parcel, r);
    }
}
