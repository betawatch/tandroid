package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class w31 implements z31 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.vc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ai.a1 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public w31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = vcVar;
        this.c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.z31
    public final void a() {
        AndroidUtilities.runOnUIThread(new s31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.z31
    public final void b() {
        AndroidUtilities.runOnUIThread(new ky0(19, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.z31
    public final void c() {
        this.e.run();
    }
}
