package yh;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.messenger.p20;
import org.telegram.messenger.zr;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.a51;
import r0.j1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements o20, p20, r0.m, zr {
    public final /* synthetic */ l a;

    public /* synthetic */ i(l lVar) {
        this.a = lVar;
    }

    @Override // r0.m
    public j1 R0(View view, j1 j1Var) {
        i0.c f7 = j1Var.a.f(519);
        this.a.e.setPadding(0, f7.b, 0, f7.d);
        return j1.b;
    }

    @Override // org.telegram.messenger.p20
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(l.Y(this.a, a51Var, view));
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        l lVar = this.a;
        lVar.finishFragment();
        lVar.getNotificationCenter().k(zs.K2, Long.valueOf(-lVar.c), null, lVar.I, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        l.Z(this.a, (a51) obj);
    }
}
