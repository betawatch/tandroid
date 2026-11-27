// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
