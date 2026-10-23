package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class t00 extends s4.r0 {
    public final /* synthetic */ e10 a;

    public t00(e10 e10Var) {
        this.a = e10Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.K.getCurrentFocus());
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        e10 e10Var = this.a;
        ci.i3 i3Var = e10Var.m0;
        s4.b0 b0Var = e10Var.j0;
        ne.b bVar = e10Var.a;
        dz dzVar = e10Var.n0;
        if (recyclerView.getAdapter() == null || e10Var.d == null) {
            return;
        }
        int L0 = b0Var.L0();
        int N0 = b0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!e10Var.M && abs > 0 && N0 >= h - 10 && !e10Var.N) {
            AndroidUtilities.runOnUIThread(new dz(this, 2));
        }
        if (e10Var.d != e10Var.U) {
            View pinnedHeader = e10Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) i3Var.d, charSequence)) {
                        i3Var.d = charSequence;
                        ((org.telegram.ui.Components.p6) i3Var.b).t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(dzVar);
                        AndroidUtilities.runOnUIThread(dzVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(dzVar);
            bVar.a(false, true);
            return;
        }
        if (i11 != 0 && !e10Var.f.isEmpty() && TextUtils.isEmpty(e10Var.Q)) {
            AndroidUtilities.cancelRunOnUIThread(dzVar);
            AndroidUtilities.runOnUIThread(dzVar, 1650L);
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
                i3Var.getClass();
                String formatDateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals((String) i3Var.d, formatDateChat)) {
                    return;
                }
                i3Var.d = formatDateChat;
                ((org.telegram.ui.Components.p6) i3Var.b).t(formatDateChat, true, true);
            }
        }
    }
}
