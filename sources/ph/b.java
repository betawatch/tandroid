package ph;

import android.graphics.RectF;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.wg;
import org.telegram.ui.web.s0;
import qh.aa;
import qh.ba;
import qh.f8;
import qh.m9;
import qh.r6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class b implements ki {
    public final /* synthetic */ mi a;
    public final /* synthetic */ String b;
    public final /* synthetic */ p c;

    public b(p pVar, mi miVar, String str) {
        this.c = pVar;
        this.a = miVar;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.ki
    public final void B0(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ki
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        aa aaVar;
        p pVar = this.c;
        long j12 = pVar.d;
        mi miVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.g0;
        if (chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            return;
        }
        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
        chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
        if (selectedPhotos.size() != 1) {
            return;
        }
        Object next = selectedPhotos.values().iterator().next();
        if (next instanceof MediaController.PhotoEntry) {
            r6 l10 = r6.l((MediaController.PhotoEntry) next);
            l10.J0 = j12;
            String str = this.b;
            l10.K0 = str;
            l10.A();
            ba E = ba.E(pVar.a.getParentActivity(), pVar.b);
            RectF rectF = E.E;
            WindowManager.LayoutParams layoutParams = E.h;
            int i13 = E.c;
            WindowManager windowManager = E.f;
            if (!E.d) {
                if (MessagesController.getInstance(i13).isFrozen()) {
                    org.telegram.ui.c.b(i13);
                } else {
                    E.s0 = j12;
                    E.t0 = str;
                    E.r0 = false;
                    E.e = false;
                    E.y2 = false;
                    if (windowManager != null && (aaVar = E.n) != null && aaVar.getParent() == null) {
                        AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                        windowManager.addView(E.n, layoutParams);
                        E.g0();
                    }
                    E.H1 = l10;
                    l10.J0 = j12;
                    l10.K0 = str;
                    E.L1 = l10.K ? 1 : 0;
                    E.p0.g = false;
                    E.G = 0;
                    rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                    E.D = AndroidUtilities.dp(8.0f);
                    E.r.c();
                    m9 m9Var = E.e0;
                    int i14 = E.G;
                    m9Var.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    E.r.setTranslationX(0.0f);
                    E.r.setTranslationY(0.0f);
                    E.r.b(0.0f);
                    E.r.setScaleX(1.0f);
                    E.r.setScaleY(1.0f);
                    E.H = 0.0f;
                    AndroidUtilities.lockOrientation(E.b, 1);
                    r6 r6Var = E.H1;
                    if (r6Var != null) {
                        E.Z0.setText(r6Var.C0);
                    }
                    E.K(1, false);
                    E.l0(-1, false, false);
                    E.Y0.b(false, false);
                    E.Y0.b(true, true);
                    E.g(1.0f, true, new f8(E, 6));
                    E.e();
                }
            }
            AndroidUtilities.runOnUIThread(new s0(miVar, 6), 400L);
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean b2() {
        return true;
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void Z0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void o1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
