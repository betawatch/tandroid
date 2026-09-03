package t5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import s5.p;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class i {
    public static final u5.b a = new u5.b("MediaSessionUtils", null);

    public static ArrayList a(p pVar) {
        try {
            Parcel O0 = pVar.O0(pVar.M0(), 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(s5.d.CREATOR);
            O0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e6) {
            Object[] objArr = {"getNotificationActions", p.class.getSimpleName()};
            u5.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e6);
            return null;
        }
    }

    public static int[] b(p pVar) {
        try {
            Parcel O0 = pVar.O0(pVar.M0(), 4);
            int[] createIntArray = O0.createIntArray();
            O0.recycle();
            return createIntArray;
        } catch (RemoteException e6) {
            Object[] objArr = {"getCompactViewActionIndices", p.class.getSimpleName()};
            u5.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e6);
            return null;
        }
    }
}
