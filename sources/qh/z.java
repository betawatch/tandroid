package qh;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements u1 {
    public final /* synthetic */ i0 a;

    public /* synthetic */ z(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        i0 i0Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
            i0Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
