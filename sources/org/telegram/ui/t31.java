package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class t31 implements y31 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.ad c;

    public t31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.ad adVar) {
        this.a = zArr;
        this.b = callback;
        this.c = adVar;
    }

    @Override // org.telegram.ui.y31
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new nz0(this.c, 8), 200L);
    }

    @Override // org.telegram.ui.y31
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.y31
    public final /* synthetic */ void c() {
    }
}
