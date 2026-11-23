package v4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class z0 extends j1.b {
    public static final Parcelable.Creator<z0> CREATOR = new c5.j(4);
    public Parcelable c;

    public z0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? p0.class.getClassLoader() : classLoader);
    }

    @Override // j1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.c, 0);
    }
}
