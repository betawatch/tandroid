package xh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 c;

    public /* synthetic */ b(i iVar, org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.a = i10;
        this.b = iVar;
        this.c = x1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final i iVar = this.b;
                final org.telegram.ui.ActionBar.x1 x1Var = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: xh.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i.A0(iVar, x1Var, tLObject, tL_error);
                                break;
                            default:
                                i.B0(iVar, x1Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final i iVar2 = this.b;
                final org.telegram.ui.ActionBar.x1 x1Var2 = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: xh.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                i.A0(iVar2, x1Var2, tLObject, tL_error);
                                break;
                            default:
                                i.B0(iVar2, x1Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
