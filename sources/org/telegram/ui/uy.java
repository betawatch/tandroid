package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class uy extends bz {
    public final /* synthetic */ vy F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy(vy vyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.F = vyVar;
    }

    @Override // org.telegram.ui.bz
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        vy vyVar = this.F;
        vyVar.d.V1.remove(tL_exportedChatlistInvite);
        vyVar.d.g1();
        vyVar.d.h1(true);
    }

    @Override // org.telegram.ui.bz
    public final void c() {
        org.telegram.ui.Components.m60 F = org.telegram.ui.Components.m60.F(this.F.d.c, null, this);
        final int i7 = 0;
        F.c(R.drawable.msg_copy, org.telegram.messenger.hd.M0(2131751762, null), new Runnable(this) { // from class: org.telegram.ui.ty
            public final /* synthetic */ uy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        uy uyVar = this.b;
                        String str = uyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.cc(uyVar.F.d.W1, null).k(false).j();
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
        F.c(R.drawable.msg_qrcode, org.telegram.messenger.hd.M0(2131750472, null), new Runnable(this) { // from class: org.telegram.ui.ty
            public final /* synthetic */ uy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        uy uyVar = this.b;
                        String str = uyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.cc(uyVar.F.d.W1, null).k(false).j();
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
        F.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751534, null), new Runnable(this) { // from class: org.telegram.ui.ty
            public final /* synthetic */ uy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        uy uyVar = this.b;
                        String str = uyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.cc(uyVar.F.d.W1, null).k(false).j();
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
