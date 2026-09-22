package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class t31 implements y31 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.vc c;

    public t31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.vc vcVar) {
        this.a = zArr;
        this.b = callback;
        this.c = vcVar;
    }

    @Override // org.telegram.ui.y31
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new f01(this.c, 7), 200L);
    }

    @Override // org.telegram.ui.y31
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.y31
    public final /* synthetic */ void c() {
    }
}
