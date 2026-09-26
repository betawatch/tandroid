package z7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class eg extends a9.a implements gg {
    public final dg W0(x6.b bVar, jg jgVar) {
        dg dgVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        jgVar.writeToParcel(obtain, 0);
        Parcel Q0 = Q0(obtain, 1);
        IBinder readStrongBinder = Q0.readStrongBinder();
        if (readStrongBinder == null) {
            dgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            dgVar = queryLocalInterface instanceof dg ? (dg) queryLocalInterface : new dg(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 11);
        }
        Q0.recycle();
        return dgVar;
    }
}
