// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class td2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wd2 b;

    public /* synthetic */ td2(wd2 wd2Var, byte b) {
        this.a = b;
        this.b = wd2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wd2 wd2Var = this.b;
        switch (b) {
            case 0:
                wd2Var.c(true);
                break;
            default:
                wd2Var.e = wd2Var.b();
                byte b2 = wd2Var.f;
                byte b3 = wd2Var.h;
                zu1 zu1Var = wd2Var.a;
                if (wd2Var.b == null) {
                    ud2 ud2Var = new ud2((zu1Var.getUserConfig().e() > zu1Var.a() ? 1 : (zu1Var.getUserConfig().e() == zu1Var.a() ? 0 : -1)) == 0 ? 3 : 0, zu1Var.getCurrentAccount(), zu1Var.getResourceProvider(), wd2Var.getContext(), wd2Var.a);
                    ud2Var.n1 = 1.0f;
                    ud2Var.setWillNotDraw(false);
                    wd2Var.b = ud2Var;
                    int L = hl.L(4.0f) + (ob6.a0 ? (byte) 0 : b3);
                    int L2 = hl.L(4.0f);
                    int L3 = hl.L(4.0f);
                    if (!ob6.a0) {
                        b3 = 0;
                    }
                    ud2Var.setPadding(L, L2, L3 + b3, hl.L(b2));
                    wd2Var.b.setDelegate(new ri6(wd2Var, (byte) 19));
                    wd2Var.b.setClipChildren(false);
                    wd2Var.b.setClipToPadding(false);
                    wd2Var.addView(wd2Var.b, tre.e(-2, b2 + 70, 5));
                }
                wd2Var.c(false);
                if (!wd2Var.b.isEnabled()) {
                    wd2Var.y = false;
                    wd2Var.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    wd2Var.y = true;
                    wd2Var.b.m(wd2Var.e, zu1Var.r8, true);
                    wd2Var.b.p(false);
                    break;
                }
        }
    }
}
