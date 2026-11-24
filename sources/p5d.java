// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p5d extends zz4 {
    @Override // hh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof s4d ? (s4d) queryLocalInterface : new s4d(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", (byte) 1);
    }

    @Override // hh0
    public final o94[] f() {
        return xfd.b;
    }

    @Override // hh0
    public final int i() {
        return 17895000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // hh0
    public final boolean p() {
        return true;
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
