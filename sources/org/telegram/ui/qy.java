package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qy extends yy {
    public final /* synthetic */ ry F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy(ry ryVar, Context context, int i3, int i10) {
        super(context, null, i3, i10);
        this.F = ryVar;
    }

    @Override // org.telegram.ui.yy
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ry ryVar = this.F;
        ryVar.d.S1.remove(tL_exportedChatlistInvite);
        ryVar.d.g1();
        ryVar.d.h1(true);
    }

    @Override // org.telegram.ui.yy
    public final void c() {
        org.telegram.ui.Components.f60 F = org.telegram.ui.Components.f60.F(this.F.d.c, null, this);
        final int i3 = 0;
        F.c(R.drawable.msg_copy, org.telegram.messenger.bd.M0(2131751762, null), new Runnable(this) { // from class: org.telegram.ui.py
            public final /* synthetic */ qy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        qy qyVar = this.b;
                        String str = qyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.fc(qyVar.F.d.T1, null).k(false).j();
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
        F.c(R.drawable.msg_qrcode, org.telegram.messenger.bd.M0(2131750480, null), new Runnable(this) { // from class: org.telegram.ui.py
            public final /* synthetic */ qy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        qy qyVar = this.b;
                        String str = qyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.fc(qyVar.F.d.T1, null).k(false).j();
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
        F.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751535, null), new Runnable(this) { // from class: org.telegram.ui.py
            public final /* synthetic */ qy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        qy qyVar = this.b;
                        String str = qyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.fc(qyVar.F.d.T1, null).k(false).j();
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
        if (org.telegram.messenger.bd.a0) {
            F.i = 3;
        }
        F.Z();
    }
}
