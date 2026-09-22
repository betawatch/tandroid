package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class v31 implements y31 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.xc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ai.a1 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public v31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = xcVar;
        this.c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.y31
    public final void a() {
        AndroidUtilities.runOnUIThread(new r31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(25, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void c() {
        this.e.run();
    }
}
