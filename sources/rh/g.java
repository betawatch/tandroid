package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g extends o71 {
    public final h[] a = new h[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ vk0 c;
    public final /* synthetic */ i d;

    public g(i iVar, Context context, vk0 vk0Var) {
        this.d = iVar;
        this.b = context;
        this.c = vk0Var;
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(View view, int i10, int i11) {
        this.c.L(view);
    }

    @Override // org.telegram.ui.Components.o71
    public final View d(int i10) {
        h[] hVarArr = this.a;
        if (hVarArr[i10] == null) {
            hVarArr[i10] = new h(this.d, this.b, i10);
        }
        return hVarArr[i10];
    }

    @Override // org.telegram.ui.Components.o71
    public final int e() {
        return this.a.length;
    }

    @Override // org.telegram.ui.Components.o71
    public final CharSequence g(int i10) {
        return cd.L0(i10 == 1 ? 2131744937 : i10 == 2 ? 2131744936 : 2131744938, null);
    }

    @Override // org.telegram.ui.Components.o71
    public final int h(int i10) {
        return i10;
    }
}
