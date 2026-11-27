// default package

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class z6c extends o7c {
    public final /* synthetic */ TwoStepVerificationActivity l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6c(TwoStepVerificationActivity twoStepVerificationActivity, int i, TL_account.Password password) {
        super(i, 4, password);
        this.l0 = twoStepVerificationActivity;
    }

    @Override // o7c
    public final void G0() {
        this.l0.O = true;
    }
}
