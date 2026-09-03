package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xd0 extends as {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.as
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
                if (passcodeActivity.B != 0) {
                    passcodeActivity.g0();
                    break;
                } else {
                    postDelayed(new gl0(this, 0), 260L);
                    break;
                }
            default:
                ((wg1) this.n).C0();
                break;
        }
    }
}
