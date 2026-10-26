package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v00 extends s4.u0 {
    public final /* synthetic */ h10 a;

    public v00(h10 h10Var) {
        this.a = h10Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        h10 h10Var = this.a;
        y00 y00Var = h10Var.m0;
        s4.c0 c0Var = h10Var.j0;
        oe.b bVar = h10Var.a;
        p00 p00Var = h10Var.n0;
        if (recyclerView.getAdapter() == null || h10Var.d == null) {
            return;
        }
        int L0 = c0Var.L0();
        int N0 = c0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!h10Var.M && abs > 0 && N0 >= h - 10 && !h10Var.N) {
            AndroidUtilities.runOnUIThread(new p00(this, 1));
        }
        if (h10Var.d != h10Var.U) {
            View pinnedHeader = h10Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) pinnedHeader;
                CharSequence text = z3Var.getText();
                if (!TextUtils.isEmpty(text) && z3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals(y00Var.c, charSequence)) {
                        y00Var.c = charSequence;
                        y00Var.a.t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(p00Var);
                        AndroidUtilities.runOnUIThread(p00Var, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(p00Var);
            bVar.a(false, true);
            return;
        }
        if (i11 != 0 && !h10Var.f.isEmpty() && TextUtils.isEmpty(h10Var.Q)) {
            AndroidUtilities.cancelRunOnUIThread(p00Var);
            AndroidUtilities.runOnUIThread(p00Var, 1650L);
            bVar.a(true, true);
        }
        s4.e1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.x7) {
            org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
            MessageObject messageObject = x7Var.e <= 0 ? null : x7Var.b[0];
            if (messageObject != null) {
                int i12 = messageObject.messageOwner.date;
                y00Var.getClass();
                String formatDateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals(y00Var.c, formatDateChat)) {
                    return;
                }
                y00Var.c = formatDateChat;
                y00Var.a.t(formatDateChat, true, true);
            }
        }
    }
}
