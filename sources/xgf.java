// default package

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class xgf {
    public static final dc6 a = new dc6("MediaSessionUtils", null);

    public static ArrayList a(etd etdVar) {
        try {
            Parcel T = etdVar.T(etdVar.R(), 3);
            ArrayList createTypedArrayList = T.createTypedArrayList(wj7.CREATOR);
            T.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", etd.class.getSimpleName()};
            dc6 dc6Var = a;
            Log.e(dc6Var.a, dc6Var.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] b(etd etdVar) {
        try {
            Parcel T = etdVar.T(etdVar.R(), 4);
            int[] createIntArray = T.createIntArray();
            T.recycle();
            return createIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", etd.class.getSimpleName()};
            dc6 dc6Var = a;
            Log.e(dc6Var.a, dc6Var.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
