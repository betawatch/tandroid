package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tc0 extends zr {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.zr
    public final void a() {
        switch (this.h) {
            case 0:
                ((vc0) this.n).h(null);
                break;
            case 1:
                ((nd0) this.n).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.n;
                if (passcodeActivity.E != 0) {
                    passcodeActivity.u0();
                    break;
                } else {
                    postDelayed(new kg0(this, 3), 260L);
                    break;
                }
            default:
                ((rc1) this.n).H0();
                break;
        }
    }
}
