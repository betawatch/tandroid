// default package

import java.io.File;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s0c implements jm7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ nm7 b;
    public final /* synthetic */ k47 c;

    public s0c(String str, nm7 nm7Var, k47 k47Var, mc2 mc2Var) {
        this.a = str;
        this.b = nm7Var;
        this.c = k47Var;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.a.equals(objArr[0])) {
            nm7 nm7Var = this.b;
            int i3 = nm7.Y1;
            nm7Var.n(this, i3);
            nm7Var.n(this, nm7.Z1);
            k47 k47Var = this.c;
            if (i == i3 && objArr.length > 1) {
                Object obj = objArr[1];
                if (obj instanceof File) {
                    v0c.y(k47Var, ((File) obj).getAbsolutePath());
                    return;
                }
            }
            v0c.n(k47Var);
        }
    }
}
