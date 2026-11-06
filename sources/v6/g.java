package v6;

import android.os.IBinder;
import android.os.IInterface;
import q6.h;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class g extends h {
    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 17895000;
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 8);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return n7.b.e;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // q6.d
    public final boolean r() {
        return true;
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
