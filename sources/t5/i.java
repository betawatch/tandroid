package t5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import s5.p;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class i {
    public static final u5.b a = new u5.b("MediaSessionUtils", null);

    public static ArrayList a(p pVar) {
        try {
            Parcel O0 = pVar.O0(pVar.M0(), 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(s5.d.CREATOR);
            O0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", p.class.getSimpleName()};
            u5.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] b(p pVar) {
        try {
            Parcel O0 = pVar.O0(pVar.M0(), 4);
            int[] createIntArray = O0.createIntArray();
            O0.recycle();
            return createIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", p.class.getSimpleName()};
            u5.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
