package qh;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class r2 extends y2 {
    public final /* synthetic */ z2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(z2 z2Var) {
        super(z2Var);
        this.x = z2Var;
    }

    @Override // qh.y2
    public final void F(boolean z4) {
        z2 z2Var = this.x;
        org.telegram.ui.ActionBar.w0 w0Var = z2Var.D;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
        z2Var.s.e(z4, true);
    }

    @Override // f2.p0
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
