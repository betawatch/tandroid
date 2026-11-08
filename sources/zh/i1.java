package zh;

import org.telegram.messenger.w10;
import org.telegram.ui.Components.up0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements te.b, w10 {
    public final /* synthetic */ up0 a;

    public /* synthetic */ i1(up0 up0Var) {
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
        up0Var.h(null, new j1(up0Var, 1));
        return Boolean.TRUE;
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
