package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements x, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i7, Serializable serializable, Object obj) {
        this.a = i7;
        this.c = obj;
        this.b = serializable;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
