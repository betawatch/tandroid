package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uc0 extends zr {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.zr
    public final void a() {
        switch (this.h) {
            case 0:
                ((wc0) this.n).h(null);
                break;
            case 1:
                ((od0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.t0();
                    break;
                } else {
                    postDelayed(new mg0(this, 3), 260L);
                    break;
                }
            default:
                ((tc1) this.n).G0();
                break;
        }
    }
}
