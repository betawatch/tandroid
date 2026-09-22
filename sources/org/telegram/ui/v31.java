package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v31 implements y31 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.vc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ai.a1 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public v31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = vcVar;
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
        AndroidUtilities.runOnUIThread(new iy0(19, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void c() {
        this.e.run();
    }
}
