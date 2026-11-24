// default package

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class s04 implements Runnable {
    public final /* synthetic */ t04 a;

    public s04(t04 t04Var) {
        this.a = t04Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        eu3 eu3Var = new eu3(this, str, (byte) 7);
        if (vu3.d(str)) {
            tya.G3.c(y6c.t0, str, new pz1((Object) linkedHashSet, (Object) eu3Var, (byte) 16));
        } else {
            eu3Var.run();
        }
    }
}
