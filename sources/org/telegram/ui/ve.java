package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.xo, ll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ ve(int i7, Runnable runnable) {
        this.a = i7;
        this.b = runnable;
    }

    @Override // org.telegram.ui.ll0
    public void d(int i7) {
        int i10 = this.a;
        Runnable runnable = this.b;
        switch (i10) {
            case 9:
                String str = LaunchActivity.C1;
                if (i7 == 1) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (i7 == 1) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.xo
    public boolean e(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 3:
                this.b.run();
                break;
            case 4:
                this.b.run();
                break;
            case 5:
                this.b.run();
                break;
            case 6:
                this.b.run();
                break;
            case 7:
                this.b.run();
                break;
            default:
                this.b.run();
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            case 1:
                this.b.run();
                break;
            default:
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
