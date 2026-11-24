// default package

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class yif {
    public static final ce6 a = new ce6("MediaSessionUtils", null);

    public static ArrayList a(hvd hvdVar) {
        try {
            Parcel T = hvdVar.T(hvdVar.R(), 3);
            ArrayList createTypedArrayList = T.createTypedArrayList(zl7.CREATOR);
            T.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", hvd.class.getSimpleName()};
            ce6 ce6Var = a;
            Log.e(ce6Var.a, ce6Var.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] b(hvd hvdVar) {
        try {
            Parcel T = hvdVar.T(hvdVar.R(), 4);
            int[] createIntArray = T.createIntArray();
            T.recycle();
            return createIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", hvd.class.getSimpleName()};
            ce6 ce6Var = a;
            Log.e(ce6Var.a, ce6Var.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
