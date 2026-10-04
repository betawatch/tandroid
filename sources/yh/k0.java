package yh;

import android.os.Build;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ k0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31) {
                    s0 s0Var = this.b;
                    if (s0Var.s0 != null) {
                        s0Var.O(2);
                        break;
                    }
                }
                break;
            default:
                this.b.onBackPressed();
                break;
        }
    }
}
