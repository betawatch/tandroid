// default package

import java.io.File;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class r2c implements fn7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ jn7 b;
    public final /* synthetic */ r47 c;

    public r2c(String str, jn7 jn7Var, r47 r47Var, rb2 rb2Var) {
        this.a = str;
        this.b = jn7Var;
        this.c = r47Var;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.a.equals(objArr[0])) {
            jn7 jn7Var = this.b;
            int i3 = jn7.Y1;
            jn7Var.n(this, i3);
            jn7Var.n(this, jn7.Z1);
            r47 r47Var = this.c;
            if (i == i3 && objArr.length > 1) {
                Object obj = objArr[1];
                if (obj instanceof File) {
                    u2c.y(r47Var, ((File) obj).getAbsolutePath());
                    return;
                }
            }
            u2c.n(r47Var);
        }
    }
}
