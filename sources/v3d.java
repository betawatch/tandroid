// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v3d implements ne0 {
    public final /* synthetic */ i05 a;

    public v3d(i05 i05Var) {
        this.a = i05Var;
    }

    @Override // ne0
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        q79 q79Var = this.a.y;
        q79Var.sendMessage(q79Var.obtainMessage(1, valueOf));
    }
}
