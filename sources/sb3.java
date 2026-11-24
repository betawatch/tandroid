// default package

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sb3 extends f8e {
    @Override // f8e
    public final Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
