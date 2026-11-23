package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wy extends dz {
    public final /* synthetic */ xy F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(xy xyVar, Context context, int i7, int i10) {
        super(context, null, i7, i10);
        this.F = xyVar;
    }

    @Override // org.telegram.ui.dz
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        xy xyVar = this.F;
        xyVar.d.V1.remove(tL_exportedChatlistInvite);
        xyVar.d.h1();
        xyVar.d.i1(true);
    }

    @Override // org.telegram.ui.dz
    public final void c() {
        org.telegram.ui.Components.x60 G = org.telegram.ui.Components.x60.G(this.F.d.c, null, this);
        final int i7 = 0;
        G.c(R.drawable.msg_copy, org.telegram.messenger.gd.N0(2131751750, null), new Runnable(this) { // from class: org.telegram.ui.vy
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
                            new org.telegram.ui.Components.kc(wyVar.F.d.W1, null).k(false).j();
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
        G.c(R.drawable.msg_qrcode, org.telegram.messenger.gd.N0(2131750455, null), new Runnable(this) { // from class: org.telegram.ui.vy
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
                            new org.telegram.ui.Components.kc(wyVar.F.d.W1, null).k(false).j();
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
        G.c(R.drawable.msg_delete, org.telegram.messenger.gd.N0(2131751522, null), new Runnable(this) { // from class: org.telegram.ui.vy
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
                            new org.telegram.ui.Components.kc(wyVar.F.d.W1, null).k(false).j();
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
        if (org.telegram.messenger.gd.a0) {
            G.i = 3;
        }
        G.a0();
    }
}
