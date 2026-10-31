package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ org.telegram.messenger.q20 c;

    public /* synthetic */ qz0(int i10, org.telegram.messenger.q20 q20Var, boolean[] zArr) {
        this.a = i10;
        this.b = zArr;
        this.c = q20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.q20 q20Var;
        org.telegram.messenger.q20 q20Var2;
        org.telegram.messenger.q20 q20Var3;
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0] && (q20Var = this.c) != null) {
                    zArr[0] = true;
                    q20Var.a(Boolean.TRUE);
                }
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.m0(14), 220L);
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0] && (q20Var2 = this.c) != null) {
                    zArr2[0] = true;
                    q20Var2.a(Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0] && (q20Var3 = this.c) != null) {
                    q20Var3.a("cancelled");
                    zArr3[0] = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qz0(rh.e6 e6Var, boolean[] zArr, org.telegram.messenger.q20 q20Var) {
        this.a = 2;
        this.b = zArr;
        this.c = q20Var;
    }
}
