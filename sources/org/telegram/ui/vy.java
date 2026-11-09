package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vy extends cz {
    public final /* synthetic */ wy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy(wy wyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.E = wyVar;
    }

    @Override // org.telegram.ui.cz
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        wy wyVar = this.E;
        wyVar.d.R1.remove(tL_exportedChatlistInvite);
        wyVar.d.g1();
        wyVar.d.h1(true);
    }

    @Override // org.telegram.ui.cz
    public final void c() {
        org.telegram.ui.Components.l60 F = org.telegram.ui.Components.l60.F(this.E.d.c, null, this);
        final int i7 = 0;
        F.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131751762, null), new Runnable(this) { // from class: org.telegram.ui.uy
            public final /* synthetic */ vy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        vy vyVar = this.b;
                        String str = vyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(vyVar.E.d.S1, null).k(false).j();
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
        F.c(R.drawable.msg_qrcode, org.telegram.messenger.id.M0(2131750472, null), new Runnable(this) { // from class: org.telegram.ui.uy
            public final /* synthetic */ vy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        vy vyVar = this.b;
                        String str = vyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(vyVar.E.d.S1, null).k(false).j();
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
        F.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751534, null), new Runnable(this) { // from class: org.telegram.ui.uy
            public final /* synthetic */ vy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        vy vyVar = this.b;
                        String str = vyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.hc(vyVar.E.d.S1, null).k(false).j();
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
        if (org.telegram.messenger.id.a0) {
            F.i = 3;
        }
        F.Z();
    }
}
