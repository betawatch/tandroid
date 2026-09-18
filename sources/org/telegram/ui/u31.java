package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class u31 implements x31 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.xc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ai.a1 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public u31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = xcVar;
        this.c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.x31
    public final void a() {
        AndroidUtilities.runOnUIThread(new q31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.x31
    public final void b() {
        AndroidUtilities.runOnUIThread(new cy0(23, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.x31
    public final void c() {
        this.e.run();
    }
}
