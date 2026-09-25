package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class xd0 extends yr {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.yr
    public final void a() {
        switch (this.h) {
            case 0:
                ((ae0) this.n).h(null);
                break;
            case 1:
                ((ue0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.g0();
                    break;
                } else {
                    postDelayed(new il0(this, 0), 260L);
                    break;
                }
            default:
                ((zg1) this.n).C0();
                break;
        }
    }
}
