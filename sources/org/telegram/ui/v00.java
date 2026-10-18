package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class v00 extends s4.r0 {
    public final /* synthetic */ g10 a;

    public v00(g10 g10Var) {
        this.a = g10Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        g10 g10Var = this.a;
        ci.h3 h3Var = g10Var.m0;
        s4.b0 b0Var = g10Var.j0;
        ne.b bVar = g10Var.a;
        fz fzVar = g10Var.n0;
        if (recyclerView.getAdapter() == null || g10Var.d == null) {
            return;
        }
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!g10Var.M && abs > 0 && N0 >= h - 10 && !g10Var.N) {
            AndroidUtilities.runOnUIThread(new fz(this, 2));
        }
        if (g10Var.d != g10Var.U) {
            View pinnedHeader = g10Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) h3Var.d, charSequence)) {
                        h3Var.d = charSequence;
                        ((org.telegram.ui.Components.p6) h3Var.b).t(charSequence, true, true);
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
        if (i11 != 0 && !g10Var.f.isEmpty() && TextUtils.isEmpty(g10Var.Q)) {
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
                h3Var.getClass();
                String formatDateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals((String) h3Var.d, formatDateChat)) {
                    return;
                }
                h3Var.d = formatDateChat;
                ((org.telegram.ui.Components.p6) h3Var.b).t(formatDateChat, true, true);
            }
        }
    }
}
