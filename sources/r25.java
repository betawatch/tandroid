// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
