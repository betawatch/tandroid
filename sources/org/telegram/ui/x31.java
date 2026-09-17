package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class x31 implements a41 {
    public final /* synthetic */ org.telegram.messenger.video.a a;
    public final /* synthetic */ org.telegram.ui.Components.yc b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ bi.s0 d;
    public final /* synthetic */ org.telegram.messenger.video.d e;

    public x31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, bi.s0 s0Var, org.telegram.messenger.video.d dVar) {
        this.a = aVar;
        this.b = ycVar;
        this.c = context;
        this.d = s0Var;
        this.e = dVar;
    }

    @Override // org.telegram.ui.a41
    public final void a() {
        AndroidUtilities.runOnUIThread(new t31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.a41
    public final void b() {
        AndroidUtilities.runOnUIThread(new rx0(25, this.a, this.b), 200L);
    }

    @Override // org.telegram.ui.a41
    public final void c() {
        this.e.run();
    }
}
