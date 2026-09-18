package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zq0 implements org.telegram.ui.Cells.r5 {
    public final /* synthetic */ ar0 a;

    public zq0(ar0 ar0Var) {
        this.a = ar0Var;
    }

    public final void a() {
        bo boVar;
        TLRPC.Chat chat;
        cr0 cr0Var = this.a.d;
        if (!cr0Var.I || (boVar = cr0Var.U) == null || (chat = boVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || cr0Var.W == 2) {
            return;
        }
        org.telegram.ui.Components.c5.u0(cr0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (cr0Var.W == 1) {
            cr0Var.W = 2;
        }
    }

    @Override // org.telegram.ui.Cells.r5
    public final void b(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        cr0 cr0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = cr0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && cr0Var.H > 0 && cr0Var.b.size() >= cr0Var.H) {
                a();
                return;
            }
            if (cr0Var.e && !containsKey) {
                i10 = cr0Var.c.size();
            }
            s5Var.b(i10, z10, true);
            cr0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(cr0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) cr0Var.f.get(intValue);
            boolean containsKey2 = cr0Var.b.containsKey(searchImage.id);
            z10 = !containsKey2;
            if (!containsKey2 && cr0Var.H > 0 && cr0Var.b.size() >= cr0Var.H) {
                a();
                return;
            }
            if (cr0Var.e && !containsKey2) {
                i10 = cr0Var.c.size();
            }
            s5Var.b(i10, z10, true);
            cr0Var.Y(intValue, searchImage);
        }
        cr0Var.i0(z10 ? 1 : 2);
        cr0Var.s0.a();
    }
}
