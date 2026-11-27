// default package

import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class y84 extends os9 {
    public final HashMap e = new HashMap();

    @Override // os9
    public final ls9 h(Object obj) {
        return (ls9) this.e.get(obj);
    }

    @Override // os9
    public final Object i(Object obj) {
        Object i = super.i(obj);
        this.e.remove(obj);
        return i;
    }
}
