package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements w, r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(int i7, Serializable serializable, Object obj) {
        this.a = i7;
        this.c = obj;
        this.b = serializable;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        vf.c.q((Context) this.c, Uri.parse((String) this.b), true, false);
    }

    @Override // org.telegram.utils.twidget.w
    public void run() {
        switch (this.a) {
            case 0:
                ((x) this.c).a((byte[]) this.b);
                break;
            default:
                ((WidgetEngineBackend) this.c).lambda$send$10((byte[]) this.b);
                break;
        }
    }
}
