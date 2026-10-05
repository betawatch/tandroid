package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class tq0 implements org.telegram.ui.Cells.s5 {
    public final /* synthetic */ uq0 a;

    public tq0(uq0 uq0Var) {
        this.a = uq0Var;
    }

    @Override // org.telegram.ui.Cells.s5
    public final void a(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        wq0 wq0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = wq0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && wq0Var.H > 0 && wq0Var.b.size() >= wq0Var.H) {
                b();
                return;
            }
            if (wq0Var.e && !containsKey) {
                i10 = wq0Var.c.size();
            }
            t5Var.b(i10, z10, true);
            wq0Var.X(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(wq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) wq0Var.f.get(intValue);
            boolean containsKey2 = wq0Var.b.containsKey(searchImage.id);
            z10 = !containsKey2;
            if (!containsKey2 && wq0Var.H > 0 && wq0Var.b.size() >= wq0Var.H) {
                b();
                return;
            }
            if (wq0Var.e && !containsKey2) {
                i10 = wq0Var.c.size();
            }
            t5Var.b(i10, z10, true);
            wq0Var.X(intValue, searchImage);
        }
        wq0Var.i0(z10 ? 1 : 2);
        wq0Var.s0.a();
    }

    public final void b() {
        yn ynVar;
        TLRPC.Chat chat;
        wq0 wq0Var = this.a.d;
        if (!wq0Var.I || (ynVar = wq0Var.U) == null || (chat = ynVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || wq0Var.W == 2) {
            return;
        }
        org.telegram.ui.Components.e5.u0(wq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (wq0Var.W == 1) {
            wq0Var.W = 2;
        }
    }
}
