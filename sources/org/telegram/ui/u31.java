package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u31 implements z31 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.vc c;

    public u31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.vc vcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = vcVar;
    }

    @Override // org.telegram.ui.z31
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new g01(this.c, 7), 200L);
    }

    @Override // org.telegram.ui.z31
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.z31
    public final /* synthetic */ void c() {
    }
}
