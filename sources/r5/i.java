package r5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import q5.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class i {
    public static final s5.b a = new s5.b("MediaSessionUtils", null);

    public static ArrayList a(o oVar) {
        try {
            Parcel O0 = oVar.O0(oVar.M0(), 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(q5.d.CREATOR);
            O0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e10) {
            Object[] objArr = {"getNotificationActions", o.class.getSimpleName()};
            s5.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }

    public static int[] b(o oVar) {
        try {
            Parcel O0 = oVar.O0(oVar.M0(), 4);
            int[] createIntArray = O0.createIntArray();
            O0.recycle();
            return createIntArray;
        } catch (RemoteException e10) {
            Object[] objArr = {"getCompactViewActionIndices", o.class.getSimpleName()};
            s5.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }
}
