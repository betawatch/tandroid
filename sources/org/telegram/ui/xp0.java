package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xp0 implements org.telegram.ui.Cells.p5 {
    public final /* synthetic */ yp0 a;

    public xp0(yp0 yp0Var) {
        this.a = yp0Var;
    }

    public final void a() {
        rn rnVar;
        TLRPC.Chat chat;
        aq0 aq0Var = this.a.d;
        if (!aq0Var.E || (rnVar = aq0Var.Q) == null || (chat = rnVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || aq0Var.S == 2) {
            return;
        }
        org.telegram.ui.Components.y4.u0(aq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (aq0Var.S == 1) {
            aq0Var.S = 2;
        }
    }

    @Override // org.telegram.ui.Cells.p5
    public final void d(org.telegram.ui.Cells.q5 q5Var) {
        boolean z10;
        int intValue = ((Integer) q5Var.getTag()).intValue();
        aq0 aq0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = aq0Var.F;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = aq0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && aq0Var.D > 0 && aq0Var.b.size() >= aq0Var.D) {
                a();
                return;
            }
            if (aq0Var.e && !containsKey) {
                i10 = aq0Var.c.size();
            }
            q5Var.b(i10, z10, true);
            aq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(aq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) aq0Var.f.get(intValue);
            boolean containsKey2 = aq0Var.b.containsKey(searchImage.id);
            z10 = !containsKey2;
            if (!containsKey2 && aq0Var.D > 0 && aq0Var.b.size() >= aq0Var.D) {
                a();
                return;
            }
            if (aq0Var.e && !containsKey2) {
                i10 = aq0Var.c.size();
            }
            q5Var.b(i10, z10, true);
            aq0Var.Y(intValue, searchImage);
        }
        aq0Var.i0(z10 ? 1 : 2);
        aq0Var.o0.a();
    }
}
