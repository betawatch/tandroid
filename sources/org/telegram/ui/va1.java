package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class va1 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ int F;
    public final /* synthetic */ UserInfoActivity G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, str, false, false, -1, e6Var);
        this.F = i3;
        this.G = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        switch (this.F) {
            case 0:
                this.G.g0(true);
                break;
            case 1:
                this.G.g0(true);
                break;
            default:
                UserInfoActivity userInfoActivity = this.G;
                userInfoActivity.g0(true);
                userInfoActivity.j0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va1(UserInfoActivity userInfoActivity, Context context, String str, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, str, true, false, i3, e6Var);
        this.F = 2;
        this.G = userInfoActivity;
    }
}
