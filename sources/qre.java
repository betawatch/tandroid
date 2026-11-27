// default package

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class qre extends d05 {
    @Override // hg0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof aaf ? (aaf) queryLocalInterface : new aaf(iBinder);
    }

    @Override // hg0
    public final int i() {
        return 11925000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
