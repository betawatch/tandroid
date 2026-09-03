package ph;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class s2 extends z2 {
    public final /* synthetic */ a3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(a3 a3Var) {
        super(a3Var);
        this.x = a3Var;
    }

    @Override // ph.z2
    public final void F(boolean z4) {
        a3 a3Var = this.x;
        org.telegram.ui.ActionBar.w0 w0Var = a3Var.D;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
        a3Var.s.e(z4, true);
    }

    @Override // f2.o0
    public final void l() {
        zw0 zw0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            zw0Var.setStickerType(11);
            zw0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            zw0Var.setStickerType(1);
            zw0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
