package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rq0 implements org.telegram.ui.Cells.s5 {
    public final /* synthetic */ sq0 a;

    public rq0(sq0 sq0Var) {
        this.a = sq0Var;
    }

    public final void a() {
        xn xnVar;
        TLRPC.Chat chat;
        uq0 uq0Var = this.a.d;
        if (!uq0Var.I || (xnVar = uq0Var.U) == null || (chat = xnVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || uq0Var.W == 2) {
            return;
        }
        org.telegram.ui.Components.e5.u0(uq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (uq0Var.W == 1) {
            uq0Var.W = 2;
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public final void b(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        uq0 uq0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = uq0Var.J;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = uq0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && uq0Var.H > 0 && uq0Var.b.size() >= uq0Var.H) {
                a();
                return;
            }
            if (uq0Var.e && !containsKey) {
                i10 = uq0Var.c.size();
            }
            t5Var.b(i10, z10, true);
            uq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(uq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) uq0Var.f.get(intValue);
            boolean containsKey2 = uq0Var.b.containsKey(searchImage.id);
            z10 = !containsKey2;
            if (!containsKey2 && uq0Var.H > 0 && uq0Var.b.size() >= uq0Var.H) {
                a();
                return;
            }
            if (uq0Var.e && !containsKey2) {
                i10 = uq0Var.c.size();
            }
            t5Var.b(i10, z10, true);
            uq0Var.Y(intValue, searchImage);
        }
        uq0Var.i0(z10 ? 1 : 2);
        uq0Var.s0.a();
    }
}
