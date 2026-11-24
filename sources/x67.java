// default package

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x67 implements Consumer {
    public final /* synthetic */ na7 a;
    public final /* synthetic */ long b;

    public /* synthetic */ x67(na7 na7Var, long j) {
        this.a = na7Var;
        this.b = j;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        na7 na7Var = this.a;
        na7Var.getClass();
        gl.d3(new m57(na7Var, (ArrayList) obj, this.b, (byte) 2));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
