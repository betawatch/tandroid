package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wp0 implements org.telegram.ui.Cells.q5 {
    public final /* synthetic */ xp0 a;

    public wp0(xp0 xp0Var) {
        this.a = xp0Var;
    }

    public final void a() {
        tn tnVar;
        TLRPC.Chat chat;
        zp0 zp0Var = this.a.d;
        if (!zp0Var.E || (tnVar = zp0Var.Q) == null || (chat = tnVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || zp0Var.S == 2) {
            return;
        }
        org.telegram.ui.Components.c5.u0(zp0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (zp0Var.S == 1) {
            zp0Var.S = 2;
        }
    }

    @Override // org.telegram.ui.Cells.q5
    public final void d(org.telegram.ui.Cells.r5 r5Var) {
        boolean z10;
        int intValue = ((Integer) r5Var.getTag()).intValue();
        zp0 zp0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = zp0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && zp0Var.D > 0 && zp0Var.b.size() >= zp0Var.D) {
                a();
                return;
            }
            if (zp0Var.e && !containsKey) {
                i10 = zp0Var.c.size();
            }
            r5Var.b(i10, z10, true);
            zp0Var.Y(intValue, photoEntry);
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
                i10 = zp0Var.c.size();
            }
            r5Var.b(i10, z10, true);
            zp0Var.Y(intValue, searchImage);
        }
        zp0Var.i0(z10 ? 1 : 2);
        zp0Var.o0.a();
    }
}
