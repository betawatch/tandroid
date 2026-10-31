package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uz extends c00 {
    public final /* synthetic */ vz E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz(vz vzVar, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = vzVar;
    }

    @Override // org.telegram.ui.c00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        vz vzVar = this.E;
        vzVar.d.R1.remove(tL_exportedChatlistInvite);
        vzVar.d.g1();
        vzVar.d.h1(true);
    }

    @Override // org.telegram.ui.c00
    public final void c() {
        org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(this.E.d.c, null, this);
        final int i10 = 0;
        F.c(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131751762, null), new Runnable(this) { // from class: org.telegram.ui.tz
            public final /* synthetic */ uz b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        uz uzVar = this.b;
                        String str = uzVar.y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(uzVar.E.d.S1, null).k(false).j();
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
        final int i11 = 1;
        F.c(R.drawable.msg_qrcode, org.telegram.messenger.cd.L0(2131750481, null), new Runnable(this) { // from class: org.telegram.ui.tz
            public final /* synthetic */ uz b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        uz uzVar = this.b;
                        String str = uzVar.y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(uzVar.E.d.S1, null).k(false).j();
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
        final int i12 = 2;
        F.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751535, null), new Runnable(this) { // from class: org.telegram.ui.tz
            public final /* synthetic */ uz b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        uz uzVar = this.b;
                        String str = uzVar.y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(uzVar.E.d.S1, null).k(false).j();
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
        if (org.telegram.messenger.cd.X) {
            F.i = 3;
        }
        F.Z();
    }
}
