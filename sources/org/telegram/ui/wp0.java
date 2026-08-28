package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wp0 implements org.telegram.ui.Cells.s5 {
    public final /* synthetic */ xp0 a;

    public wp0(xp0 xp0Var) {
        this.a = xp0Var;
    }

    public final void a() {
        qn qnVar;
        TLRPC.Chat chat;
        zp0 zp0Var = this.a.d;
        if (!zp0Var.E || (qnVar = zp0Var.Q) == null || (chat = qnVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || zp0Var.S == 2) {
            return;
        }
        org.telegram.ui.Components.y4.u0(zp0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (zp0Var.S == 1) {
            zp0Var.S = 2;
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public final void d(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        zp0 zp0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        int i9 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = zp0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && zp0Var.D > 0 && zp0Var.b.size() >= zp0Var.D) {
                a();
                return;
            }
            if (zp0Var.e && !containsKey) {
                i9 = zp0Var.c.size();
            }
            t5Var.b(i9, z10, true);
            zp0Var.X(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(zp0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) zp0Var.f.get(intValue);
            boolean containsKey2 = zp0Var.b.containsKey(searchImage.id);
            z10 = !containsKey2;
            if (!containsKey2 && zp0Var.D > 0 && zp0Var.b.size() >= zp0Var.D) {
                a();
                return;
            }
            if (zp0Var.e && !containsKey2) {
                i9 = zp0Var.c.size();
            }
            t5Var.b(i9, z10, true);
            zp0Var.X(intValue, searchImage);
        }
        zp0Var.h0(z10 ? 1 : 2);
        zp0Var.o0.a();
    }
}
