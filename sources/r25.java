// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class r25 extends PasscodeActivity {
    public final /* synthetic */ boolean[] X;
    public final /* synthetic */ pcc Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r25(boolean[] zArr, pcc pccVar) {
        super(3);
        this.X = zArr;
        this.Y = pccVar;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.X[0]) {
            return;
        }
        this.Y.a("PASSCODE_FAILED");
    }
}
