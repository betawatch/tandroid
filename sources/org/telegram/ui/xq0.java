package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xq0 implements org.telegram.ui.Cells.s5 {
    public final /* synthetic */ yq0 a;

    public xq0(yq0 yq0Var) {
        this.a = yq0Var;
    }

    public final void a() {
        bo boVar;
        TLRPC.Chat chat;
        ar0 ar0Var = this.a.d;
        if (!ar0Var.I || (boVar = ar0Var.U) == null || (chat = boVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || ar0Var.W == 2) {
            return;
        }
        org.telegram.ui.Components.c5.u0(ar0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (ar0Var.W == 1) {
            ar0Var.W = 2;
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public final void b(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        ar0 ar0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = ar0Var.J;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = ar0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && ar0Var.H > 0 && ar0Var.b.size() >= ar0Var.H) {
                a();
                return;
            }
            if (ar0Var.e && !containsKey) {
                i10 = ar0Var.c.size();
            }
            t5Var.b(i10, z10, true);
            ar0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(ar0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) ar0Var.f.get(intValue);
            boolean containsKey2 = ar0Var.b.containsKey(searchImage.id);
            z10 = !containsKey2;
            if (!containsKey2 && ar0Var.H > 0 && ar0Var.b.size() >= ar0Var.H) {
                a();
                return;
            }
            if (ar0Var.e && !containsKey2) {
                i10 = ar0Var.c.size();
            }
            t5Var.b(i10, z10, true);
            ar0Var.Y(intValue, searchImage);
        }
        ar0Var.i0(z10 ? 1 : 2);
        ar0Var.s0.a();
    }
}
