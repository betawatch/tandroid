package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ty extends az {
    public final /* synthetic */ uy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty(uy uyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.E = uyVar;
    }

    @Override // org.telegram.ui.az
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        uy uyVar = this.E;
        uyVar.d.R1.remove(tL_exportedChatlistInvite);
        uyVar.d.g1();
        uyVar.d.h1(true);
    }

    @Override // org.telegram.ui.az
    public final void c() {
        org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F(this.E.d.c, null, this);
        final int i7 = 0;
        F.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751762, null), new Runnable(this) { // from class: org.telegram.ui.sy
            public final /* synthetic */ ty b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        ty tyVar = this.b;
                        String str = tyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(tyVar.E.d.S1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        this.b.d();
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        }, false);
        final int i10 = 1;
        F.c(R.drawable.msg_qrcode, org.telegram.messenger.hd.M0(2131750471, null), new Runnable(this) { // from class: org.telegram.ui.sy
            public final /* synthetic */ ty b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        ty tyVar = this.b;
                        String str = tyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(tyVar.E.d.S1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        this.b.d();
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        }, false);
        final int i11 = 2;
        F.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751535, null), new Runnable(this) { // from class: org.telegram.ui.sy
            public final /* synthetic */ ty b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        ty tyVar = this.b;
                        String str = tyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(tyVar.E.d.S1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        this.b.d();
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        }, true);
        if (org.telegram.messenger.hd.a0) {
            F.i = 3;
        }
        F.Z();
    }
}
