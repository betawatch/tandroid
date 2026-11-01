package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tz extends b00 {
    public final /* synthetic */ uz E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz(uz uzVar, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = uzVar;
    }

    @Override // org.telegram.ui.b00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        uz uzVar = this.E;
        uzVar.d.R1.remove(tL_exportedChatlistInvite);
        uzVar.d.g1();
        uzVar.d.h1(true);
    }

    @Override // org.telegram.ui.b00
    public final void c() {
        org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(this.E.d.c, null, this);
        final int i10 = 0;
        F.c(R.drawable.msg_copy, org.telegram.messenger.dd.L0(2131751762, null), new Runnable(this) { // from class: org.telegram.ui.sz
            public final /* synthetic */ tz b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        tz tzVar = this.b;
                        String str = tzVar.y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(tzVar.E.d.S1, null).k(false).j();
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
        F.c(R.drawable.msg_qrcode, org.telegram.messenger.dd.L0(2131750481, null), new Runnable(this) { // from class: org.telegram.ui.sz
            public final /* synthetic */ tz b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        tz tzVar = this.b;
                        String str = tzVar.y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(tzVar.E.d.S1, null).k(false).j();
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
        F.c(R.drawable.msg_delete, org.telegram.messenger.dd.L0(2131751535, null), new Runnable(this) { // from class: org.telegram.ui.sz
            public final /* synthetic */ tz b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        tz tzVar = this.b;
                        String str = tzVar.y;
                        if (str != null && org.telegram.messenger.i0.g(str)) {
                            new org.telegram.ui.Components.cc(tzVar.E.d.S1, null).k(false).j();
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
        if (org.telegram.messenger.dd.X) {
            F.i = 3;
        }
        F.Z();
    }
}
