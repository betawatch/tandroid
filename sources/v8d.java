// default package

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class v8d {
    public static final ce6 a = new ce6("CastDynamiteModule", null);

    public static o9d a(Context context, le1 le1Var, qed qedVar, HashMap hashMap) {
        o9d e9dVar;
        q9d b = b(context);
        eq7 eq7Var = new eq7(context.getApplicationContext());
        Parcel R = b.R();
        kid.d(R, eq7Var);
        kid.c(R, le1Var);
        kid.d(R, qedVar);
        R.writeMap(hashMap);
        Parcel T = b.T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = k9d.b;
        if (readStrongBinder == null) {
            e9dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            e9dVar = queryLocalInterface instanceof o9d ? (o9d) queryLocalInterface : new e9d(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", (byte) 3);
        }
        T.recycle();
        return e9dVar;
    }

    public static q9d b(Context context) {
        try {
            IBinder b = nt3.c(context, nt3.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b == null) {
                return null;
            }
            IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof q9d ? (q9d) queryLocalInterface : new q9d(b, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", (byte) 3);
        } catch (kt3 e) {
            throw new sg7(e);
        }
    }
}
