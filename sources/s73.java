// default package

import java.io.File;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class s73 extends vw5 implements qp4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s73(Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = obj;
    }

    @Override // qp4
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                v73 v73Var = (v73) this.c;
                if (th != null) {
                    v73Var.h.L(new uf4(th));
                }
                if (v73Var.j.b != pd5.d) {
                    ((hb4) v73Var.j.getValue()).close();
                }
                return g5c.a;
            default:
                File file = (File) obj;
                file.getClass();
                return new rg7(((dw2) this.c).a, file);
        }
    }
}
