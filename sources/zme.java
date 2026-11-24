// default package

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class zme extends xx4 {
    @Override // gg0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof j5f ? (j5f) queryLocalInterface : new j5f(iBinder);
    }

    @Override // gg0
    public final int i() {
        return 11925000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
