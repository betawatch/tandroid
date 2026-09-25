package s4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class w0 extends i1.c {
    public static final Parcelable.Creator<w0> CREATOR = new i1.b(3);
    public Parcelable c;

    public w0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? o0.class.getClassLoader() : classLoader);
    }

    @Override // i1.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.c, 0);
    }
}
