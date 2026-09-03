package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wd0 extends zr {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd0(Object obj, Context context, int i10) {
        super(context);
        this.h = i10;
        this.n = obj;
    }

    @Override // org.telegram.ui.zr
    public final void a() {
        switch (this.h) {
            case 0:
                ((zd0) this.n).h(null);
                break;
            case 1:
                ((se0) this.n).h(null);
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
                ((vg1) this.n).C0();
                break;
        }
    }
}
