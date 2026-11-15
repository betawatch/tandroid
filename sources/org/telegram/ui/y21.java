package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ y21(k31 k31Var, int i7) {
        this.a = i7;
        this.b = k31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        k31 k31Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.np.s1(k31Var.currentAccount).l0(null);
                break;
            case 1:
                vf.c.t(k31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131752154, null));
                break;
            default:
                k31Var.c.g3.O(true);
                break;
        }
    }
}
