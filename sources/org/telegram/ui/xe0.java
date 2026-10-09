package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze0 b;

    public /* synthetic */ xe0(ze0 ze0Var, int i10) {
        this.a = i10;
        this.b = ze0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ze0 ze0Var = this.b;
                org.telegram.ui.Components.fk0 fk0Var = ze0Var.e;
                fk0Var.getAnimatedDrawable().N(0, false, false);
                fk0Var.d();
                ce0 ce0Var = ze0Var.a;
                if (ce0Var != null) {
                    ce0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                ze0 ze0Var2 = this.b;
                int i10 = 0;
                ze0Var2.w = false;
                while (true) {
                    es[] esVarArr = ze0Var2.a.f;
                    if (i10 >= esVarArr.length) {
                        break;
                    } else {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                ze0 ze0Var3 = this.b;
                ze0Var3.postDelayed(new xe0(ze0Var3, 3), 150L);
                xe0 xe0Var = ze0Var3.x;
                ze0Var3.removeCallbacks(xe0Var);
                ze0Var3.postDelayed(xe0Var, 3000L);
                ze0Var3.w = true;
                break;
            default:
                ce0 ce0Var2 = this.b.a;
                int i11 = 0;
                ce0Var2.e = false;
                ce0Var2.f[0].requestFocus();
                while (true) {
                    es[] esVarArr2 = ce0Var2.f;
                    if (i11 >= esVarArr2.length) {
                        break;
                    } else {
                        esVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
