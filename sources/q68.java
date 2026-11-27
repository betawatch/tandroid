// default package

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class q68 extends c4 {
    public static final Parcelable.Creator<q68> CREATOR = new mx6((byte) 8);
    public final PendingIntent a;

    public q68(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.s(parcel, r);
    }
}
