package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x00 extends f2.b1 {
    public final /* synthetic */ i10 a;

    public x00(i10 i10Var) {
        this.a = i10Var;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.G.getCurrentFocus());
        }
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        i10 i10Var = this.a;
        jh.a3 a3Var = i10Var.i0;
        f2.k0 k0Var = i10Var.f0;
        ud.a aVar = i10Var.a;
        r00 r00Var = i10Var.j0;
        if (recyclerView.getAdapter() == null || i10Var.d == null) {
            return;
        }
        int L0 = k0Var.L0();
        int N0 = k0Var.N0();
        int abs = Math.abs(N0 - L0) + 1;
        int h = recyclerView.getAdapter().h();
        if (!i10Var.I && abs > 0 && N0 >= h - 10 && !i10Var.J) {
            AndroidUtilities.runOnUIThread(new r00(this, 1));
        }
        if (i10Var.d != i10Var.Q) {
            View pinnedHeader = i10Var.b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.s3) {
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) pinnedHeader;
                CharSequence text = s3Var.getText();
                if (!TextUtils.isEmpty(text) && s3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) a3Var.d, charSequence)) {
                        a3Var.d = charSequence;
                        ((org.telegram.ui.Components.i6) a3Var.b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(r00Var);
                        AndroidUtilities.runOnUIThread(r00Var, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(r00Var);
            aVar.a(false, true);
            return;
        }
        if (i11 != 0 && !i10Var.f.isEmpty() && TextUtils.isEmpty(i10Var.M)) {
            AndroidUtilities.cancelRunOnUIThread(r00Var);
            AndroidUtilities.runOnUIThread(r00Var, 1650L);
            aVar.a(true, true);
        }
        f2.o1 K = recyclerView.K(L0);
        if (K == null || K.f != 0) {
            return;
        }
        View view = K.a;
        if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            MessageObject messageObject = p7Var.e <= 0 ? null : p7Var.b[0];
            if (messageObject != null) {
                int i12 = messageObject.messageOwner.date;
                a3Var.getClass();
                String formatDateChat = LocaleController.formatDateChat(i12);
                if (TextUtils.equals((String) a3Var.d, formatDateChat)) {
                    return;
                }
                a3Var.d = formatDateChat;
                ((org.telegram.ui.Components.i6) a3Var.b).q(formatDateChat, true, true);
            }
        }
    }
}
