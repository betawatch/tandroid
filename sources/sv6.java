// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sv6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k44 b;
    public final /* synthetic */ zu6 c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ uv6 e;

    public /* synthetic */ sv6(uv6 uv6Var, k44 k44Var, zu6 zu6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.e = uv6Var;
        this.b = k44Var;
        this.c = zu6Var;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        zu6 zu6Var = this.c;
        uv6 uv6Var = this.e;
        k44 k44Var = this.b;
        switch (b) {
            case 0:
                k44Var.M(uv6Var, zu6Var, arrayList);
                break;
            default:
                k44Var.M(uv6Var, zu6Var, arrayList);
                break;
        }
    }
}
