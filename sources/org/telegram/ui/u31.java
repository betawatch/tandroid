package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
