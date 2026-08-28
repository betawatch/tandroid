package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xz extends g00 {
    public final /* synthetic */ yz A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(yz yzVar, Context context, int i9, int i10) {
        super(context, null, i9, i10);
        this.A = yzVar;
    }

    @Override // org.telegram.ui.g00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        yz yzVar = this.A;
        yzVar.d.U.remove(tL_exportedChatlistInvite);
        yzVar.d.S();
        yzVar.d.T(true);
    }

    @Override // org.telegram.ui.g00
    public final void c() {
        org.telegram.ui.Components.x60 F = org.telegram.ui.Components.x60.F(this.A.d.container, null, this);
        final int i9 = 0;
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) { // from class: org.telegram.ui.wz
            public final /* synthetic */ xz b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        xz xzVar = this.b;
                        String str = xzVar.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.oc(xzVar.A.d.V, null).k(false).j();
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
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) { // from class: org.telegram.ui.wz
            public final /* synthetic */ xz b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        xz xzVar = this.b;
                        String str = xzVar.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.oc(xzVar.A.d.V, null).k(false).j();
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
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) { // from class: org.telegram.ui.wz
            public final /* synthetic */ xz b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        xz xzVar = this.b;
                        String str = xzVar.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.oc(xzVar.A.d.V, null).k(false).j();
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
        if (LocaleController.isRTL) {
            F.i = 3;
        }
        F.Z();
    }
}
