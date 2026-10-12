package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class r10 extends s4.r0 {
    public final /* synthetic */ c20 a;

    public r10(c20 c20Var) {
        this.a = c20Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        c20 c20Var = this.a;
        bi.d4 d4Var = c20Var.m0;
        s4.b0 b0Var = c20Var.j0;
        ne.b bVar = c20Var.a;
        zz zzVar = c20Var.n0;
        if (recyclerView.getAdapter() == null || c20Var.d == null) {
            return;
        }
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!c20Var.M && abs > 0 && N0 >= h - 10 && !c20Var.N) {
            AndroidUtilities.runOnUIThread(new zz(this, 2));
        }
        if (c20Var.d != c20Var.U) {
            View pinnedHeader = c20Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) pinnedHeader;
                CharSequence text = v3Var.getText();
                if (!TextUtils.isEmpty(text) && v3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) d4Var.d, charSequence)) {
                        d4Var.d = charSequence;
                        ((org.telegram.ui.Components.r6) d4Var.b).t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(zzVar);
                        AndroidUtilities.runOnUIThread(zzVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(zzVar);
            bVar.a(false, true);
            return;
        }
        if (i11 != 0 && !c20Var.f.isEmpty() && TextUtils.isEmpty(c20Var.Q)) {
            AndroidUtilities.cancelRunOnUIThread(zzVar);
            AndroidUtilities.runOnUIThread(zzVar, 1650L);
            bVar.a(true, true);
        }
        s4.b1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.u7) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            MessageObject messageObject = u7Var.e <= 0 ? null : u7Var.b[0];
            if (messageObject != null) {
                int i12 = messageObject.messageOwner.date;
                d4Var.getClass();
                String formatDateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals((String) d4Var.d, formatDateChat)) {
                    return;
                }
                d4Var.d = formatDateChat;
                ((org.telegram.ui.Components.r6) d4Var.b).t(formatDateChat, true, true);
            }
        }
    }
}
