// default package

import java.io.File;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ryb implements gk7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ kk7 b;
    public final /* synthetic */ k27 c;

    public ryb(String str, kk7 kk7Var, k27 k27Var, bb2 bb2Var) {
        this.a = str;
        this.b = kk7Var;
        this.c = k27Var;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.a.equals(objArr[0])) {
            kk7 kk7Var = this.b;
            int i3 = kk7.X1;
            kk7Var.n(this, i3);
            kk7Var.n(this, kk7.Y1);
            k27 k27Var = this.c;
            if (i == i3 && objArr.length > 1) {
                Object obj = objArr[1];
                if (obj instanceof File) {
                    uyb.y(k27Var, ((File) obj).getAbsolutePath());
                    return;
                }
            }
            uyb.n(k27Var);
        }
    }
}
