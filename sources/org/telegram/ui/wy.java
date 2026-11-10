package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wy extends dz {
    public final /* synthetic */ xy E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(xy xyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.E = xyVar;
    }

    @Override // org.telegram.ui.dz
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        xy xyVar = this.E;
        xyVar.d.U1.remove(tL_exportedChatlistInvite);
        xyVar.d.g1();
        xyVar.d.h1(true);
    }

    @Override // org.telegram.ui.dz
    public final void c() {
        org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F(this.E.d.c, null, this);
        final int i7 = 0;
        F.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131751762, null), new Runnable(this) { // from class: org.telegram.ui.vy
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        wy wyVar = this.b;
                        String str = wyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.gc(wyVar.E.d.V1, null).k(false).j();
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
        F.c(R.drawable.msg_qrcode, org.telegram.messenger.id.M0(2131750472, null), new Runnable(this) { // from class: org.telegram.ui.vy
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        wy wyVar = this.b;
                        String str = wyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.gc(wyVar.E.d.V1, null).k(false).j();
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
        F.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751534, null), new Runnable(this) { // from class: org.telegram.ui.vy
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        wy wyVar = this.b;
                        String str = wyVar.y;
                        if (str != null && org.telegram.messenger.g0.g(str)) {
                            new org.telegram.ui.Components.gc(wyVar.E.d.V1, null).k(false).j();
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
