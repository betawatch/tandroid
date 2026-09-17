package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements org.telegram.ui.ActionBar.a2, r0.n {
    public final /* synthetic */ g31 a;

    public /* synthetic */ r21(g31 g31Var) {
        this.a = g31Var;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        g31 g31Var = this.a;
        g31Var.Q = defaultWindowInsets;
        g31Var.fragmentView.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        g31 g31Var = this.a;
        g31Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            g31Var.getParentActivity().startActivity(intent);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
