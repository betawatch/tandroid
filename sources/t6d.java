// default package

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class t6d {
    public static final dc6 a = new dc6("CastDynamiteModule", null);

    public static m7d a(Context context, dd1 dd1Var, ocd ocdVar, HashMap hashMap) {
        m7d c7dVar;
        o7d b = b(context);
        bo7 bo7Var = new bo7(context.getApplicationContext());
        Parcel R = b.R();
        jgd.d(R, bo7Var);
        jgd.c(R, dd1Var);
        jgd.d(R, ocdVar);
        R.writeMap(hashMap);
        Parcel T = b.T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = i7d.b;
        if (readStrongBinder == null) {
            c7dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            c7dVar = queryLocalInterface instanceof m7d ? (m7d) queryLocalInterface : new c7d(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", (byte) 3);
        }
        T.recycle();
        return c7dVar;
    }

    public static o7d b(Context context) {
        try {
            IBinder b = ds3.c(context, ds3.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b == null) {
                return null;
            }
            IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof o7d ? (o7d) queryLocalInterface : new o7d(b, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", (byte) 3);
        } catch (as3 e) {
            throw new qe7(e);
        }
    }
}
