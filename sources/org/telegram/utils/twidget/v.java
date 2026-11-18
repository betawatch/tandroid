package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
