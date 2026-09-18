package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class s31 implements x31 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.xc c;

    public s31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = xcVar;
    }

    @Override // org.telegram.ui.x31
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new e01(this.c, 7), 200L);
    }

    @Override // org.telegram.ui.x31
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.x31
    public final /* synthetic */ void c() {
    }
}
