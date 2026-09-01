package qh;

import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ax0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class s2 extends z2 {
    public final /* synthetic */ a3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(a3 a3Var) {
        super(a3Var);
        this.x = a3Var;
    }

    @Override // qh.z2
    public final void F(boolean z4) {
        a3 a3Var = this.x;
        org.telegram.ui.ActionBar.w0 w0Var = a3Var.D;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
        a3Var.s.e(z4, true);
    }

    @Override // f2.p0
    public final void l() {
        ax0 ax0Var = this.x.s;
        super.l();
        if (TextUtils.isEmpty(this.f)) {
            ax0Var.setStickerType(11);
            ax0Var.d.setText(LocaleController.getString(R.string.SearchImagesType));
        } else {
            ax0Var.setStickerType(1);
            ax0Var.d.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.f));
        }
    }
}
