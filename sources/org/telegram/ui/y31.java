package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y31 implements d41 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.wc c;

    public y31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = wcVar;
    }

    @Override // org.telegram.ui.d41
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new k01(this.c, 7), 200L);
    }

    @Override // org.telegram.ui.d41
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.d41
    public final /* synthetic */ void c() {
    }
}
