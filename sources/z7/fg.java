package z7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class fg extends a9.a implements hg {
    public final eg X0(x6.b bVar, kg kgVar) {
        eg egVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        kgVar.writeToParcel(obtain, 0);
        Parcel R0 = R0(obtain, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            egVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            egVar = queryLocalInterface instanceof eg ? (eg) queryLocalInterface : new eg(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 11);
        }
        R0.recycle();
        return egVar;
    }
}
