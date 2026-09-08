package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class v31 implements a41 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.Components.yc c;

    public v31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.yc ycVar) {
        this.a = zArr;
        this.b = callback;
        this.c = ycVar;
    }

    @Override // org.telegram.ui.a41
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.a;
        if (!zArr[0] && (callback = this.b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new f01(this.c, 7), 200L);
    }

    @Override // org.telegram.ui.a41
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.a41
    public final /* synthetic */ void c() {
    }
}
