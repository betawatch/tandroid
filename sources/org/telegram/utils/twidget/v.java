package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements x, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i7, Serializable serializable, Object obj) {
        this.a = i7;
        this.c = obj;
        this.b = serializable;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        vf.c.q((Context) this.c, Uri.parse((String) this.b), true, false);
    }

    @Override // org.telegram.utils.twidget.x
    public void run() {
        switch (this.a) {
            case 0:
                ((y) this.c).a((byte[]) this.b);
                break;
            default:
                ((WidgetEngineBackend) this.c).lambda$send$11((byte[]) this.b);
                break;
        }
    }
}
