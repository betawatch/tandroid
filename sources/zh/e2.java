package zh;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ e2(m3 m3Var, int i7) {
        this.a = i7;
        this.b = m3Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.k0(((Boolean) obj).booleanValue());
                break;
            default:
                this.b.simpleActionBar.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                break;
        }
    }
}
