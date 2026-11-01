package yh;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.as;
import org.telegram.messenger.at;
import org.telegram.messenger.p20;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.b51;
import r0.j1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements p20, q20, r0.m, as {
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

    @Override // org.telegram.messenger.q20
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(l.Z(this.a, b51Var, view));
    }

    @Override // org.telegram.messenger.as
    public void i(boolean z10) {
        l lVar = this.a;
        lVar.finishFragment();
        lVar.getNotificationCenter().k(at.K2, Long.valueOf(-lVar.c), null, lVar.I, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        l.a0(this.a, (b51) obj);
    }
}
