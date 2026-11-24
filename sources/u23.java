// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u23 implements mv8 {
    public final /* synthetic */ byte a;
    public final mq5 b;

    public /* synthetic */ u23(mq5 mq5Var, byte b) {
        this.a = b;
        this.b = mq5Var;
    }

    @Override // mv8
    public final Object get() {
        byte b = this.a;
        mq5 mq5Var = this.b;
        switch (b) {
            case 0:
                return new mx6((Context) mq5Var.a, new kg7((byte) 29), new k4f((byte) 28), false, (byte) 26);
            default:
                String packageName = ((Context) mq5Var.a).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                gxc.d("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }
}
