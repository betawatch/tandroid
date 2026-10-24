package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class w00 extends s4.r0 {
    public final /* synthetic */ i10 a;

    public w00(i10 i10Var) {
        this.a = i10Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        i10 i10Var = this.a;
        z00 z00Var = i10Var.m0;
        s4.b0 b0Var = i10Var.j0;
        ne.b bVar = i10Var.a;
        fz fzVar = i10Var.n0;
        if (recyclerView.getAdapter() == null || i10Var.d == null) {
            return;
        }
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!i10Var.M && abs > 0 && N0 >= h - 10 && !i10Var.N) {
            AndroidUtilities.runOnUIThread(new fz(this, 2));
        }
        if (i10Var.d != i10Var.U) {
            View pinnedHeader = i10Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(z00Var.c, charSequence)) {
                        z00Var.c = charSequence;
                        z00Var.a.t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(fzVar);
                        AndroidUtilities.runOnUIThread(fzVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(fzVar);
            bVar.a(false, true);
            return;
        }
        if (i11 != 0 && !i10Var.f.isEmpty() && TextUtils.isEmpty(i10Var.Q)) {
            AndroidUtilities.cancelRunOnUIThread(fzVar);
            AndroidUtilities.runOnUIThread(fzVar, 1650L);
            bVar.a(true, true);
        }
        s4.b1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            MessageObject messageObject = t7Var.e <= 0 ? null : t7Var.b[0];
            if (messageObject != null) {
                int i12 = messageObject.messageOwner.date;
                z00Var.getClass();
                String formatDateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals(z00Var.c, formatDateChat)) {
                    return;
                }
                z00Var.c = formatDateChat;
                z00Var.a.t(formatDateChat, true, true);
            }
        }
    }
}
