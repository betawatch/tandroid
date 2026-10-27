package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xo0 extends org.telegram.ui.Components.n91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xo0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.n91
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

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        switch (this.a) {
            case 0:
                tp0 tp0Var = (tp0) this.b;
                if (i10 == 1) {
                    return tp0Var.h;
                }
                if (i10 == 0) {
                    return tp0Var.n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.i2) this.b).c.get(i10);
        }
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.i2) this.b).c.size();
        }
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        int i11 = this.a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
