package p5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import o5.o;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class i {
    public static final r5.b a = new r5.b("MediaSessionUtils", null);

    public static ArrayList a(o oVar) {
        try {
            Parcel O0 = oVar.O0(oVar.M0(), 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(o5.d.CREATOR);
            O0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e9) {
            Object[] objArr = {"getNotificationActions", o.class.getSimpleName()};
            r5.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e9);
            return null;
        }
    }

    public static int[] b(o oVar) {
        try {
            Parcel O0 = oVar.O0(oVar.M0(), 4);
            int[] createIntArray = O0.createIntArray();
            O0.recycle();
            return createIntArray;
        } catch (RemoteException e9) {
            Object[] objArr = {"getCompactViewActionIndices", o.class.getSimpleName()};
            r5.b bVar = a;
            Log.e(bVar.a, bVar.d("Unable to call %s on %s.", objArr), e9);
            return null;
        }
    }
}
