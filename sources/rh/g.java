package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g extends p71 {
    public final h[] a = new h[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ wk0 c;
    public final /* synthetic */ i d;

    public g(i iVar, Context context, wk0 wk0Var) {
        this.d = iVar;
        this.b = context;
        this.c = wk0Var;
    }

    @Override // org.telegram.ui.Components.p71
    public final void b(View view, int i10, int i11) {
        this.c.L(view);
    }

    @Override // org.telegram.ui.Components.p71
    public final View d(int i10) {
        h[] hVarArr = this.a;
        if (hVarArr[i10] == null) {
            hVarArr[i10] = new h(this.d, this.b, i10);
        }
        return hVarArr[i10];
    }

    @Override // org.telegram.ui.Components.p71
    public final int e() {
        return this.a.length;
    }

    @Override // org.telegram.ui.Components.p71
    public final CharSequence g(int i10) {
        return dd.L0(i10 == 1 ? 2131744937 : i10 == 2 ? 2131744936 : 2131744938, null);
    }

    @Override // org.telegram.ui.Components.p71
    public final int h(int i10) {
        return i10;
    }
}
