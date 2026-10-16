package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class z31 implements e41 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.zc c;

    public z31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.zc zcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = zcVar;
    }

    @Override // org.telegram.ui.e41
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new tz0(this.c, 8), 200L);
    }

    @Override // org.telegram.ui.e41
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.e41
    public final /* synthetic */ void c() {
    }
}
