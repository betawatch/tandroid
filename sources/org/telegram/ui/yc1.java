package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yc1 extends org.telegram.ui.Cells.m3 {
    public final /* synthetic */ int E;
    public final /* synthetic */ UserInfoActivity F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, str, false, false, -1, p6Var);
        this.E = i10;
        this.F = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.m3
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                this.F.f0(true);
                break;
            case 1:
                this.F.f0(true);
                break;
            default:
                UserInfoActivity userInfoActivity = this.F;
                userInfoActivity.f0(true);
                userInfoActivity.i0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, str, true, false, i10, p6Var);
        this.E = 2;
        this.F = userInfoActivity;
    }
}
