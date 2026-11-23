package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class xy extends ez {
    public final /* synthetic */ yy F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy(yy yyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.F = yyVar;
    }

    @Override // org.telegram.ui.ez
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        yy yyVar = this.F;
        yyVar.d.V1.remove(tL_exportedChatlistInvite);
        yyVar.d.h1();
        yyVar.d.i1(true);
    }

    @Override // org.telegram.ui.ez
    public final void c() {
        org.telegram.ui.Components.a70 G = org.telegram.ui.Components.a70.G(this.F.d.c, null, this);
        final int i7 = 0;
        G.c(R.drawable.msg_copy, org.telegram.messenger.hd.N0(2131751750, null), new Runnable(this) { // from class: org.telegram.ui.wy
            public final /* synthetic */ xy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        xy xyVar = this.b;
                        String str = xyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.lc(xyVar.F.d.W1, null).k(false).j();
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
        G.c(R.drawable.msg_qrcode, org.telegram.messenger.hd.N0(2131750455, null), new Runnable(this) { // from class: org.telegram.ui.wy
            public final /* synthetic */ xy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        xy xyVar = this.b;
                        String str = xyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.lc(xyVar.F.d.W1, null).k(false).j();
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
        G.c(R.drawable.msg_delete, org.telegram.messenger.hd.N0(2131751522, null), new Runnable(this) { // from class: org.telegram.ui.wy
            public final /* synthetic */ xy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        xy xyVar = this.b;
                        String str = xyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.lc(xyVar.F.d.W1, null).k(false).j();
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
            G.i = 3;
        }
        G.a0();
    }
}
