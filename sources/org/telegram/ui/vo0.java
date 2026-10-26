package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vo0 extends org.telegram.ui.Components.m91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vo0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (view instanceof org.telegram.ui.Wallet.g2) {
                    ((org.telegram.ui.Wallet.g2) view).getClass();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        switch (this.a) {
            case 0:
                rp0 rp0Var = (rp0) this.b;
                if (i10 == 1) {
                    return rp0Var.h;
                }
                if (i10 == 0) {
                    return rp0Var.n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.i2) this.b).c.get(i10);
        }
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.i2) this.b).c.size();
        }
    }

    @Override // org.telegram.ui.Components.m91
    public final int h(int i10) {
        int i11 = this.a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
