package zh;

import org.telegram.messenger.w10;
import org.telegram.ui.Components.up0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements te.b, w10 {
    public final /* synthetic */ up0 a;

    public /* synthetic */ j1(up0 up0Var) {
        this.a = up0Var;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.a.l();
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        up0 up0Var = this.a;
        up0Var.i();
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        up0Var.h(null, new k1(up0Var, 1));
        return Boolean.TRUE;
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
