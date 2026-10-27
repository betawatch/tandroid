package t6;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i extends o6.g {
    @Override // o6.g
    public final boolean C() {
        return true;
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 17895000;
    }

    @Override // o6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 7);
    }

    @Override // o6.g
    public final l6.c[] r() {
        return l7.b.d;
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // o6.g
    public final boolean y() {
        return true;
    }
}
