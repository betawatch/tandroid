package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qw extends FragmentContextView {
    public final /* synthetic */ int J0;
    public final /* synthetic */ gy K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(gy gyVar, Context context, gy gyVar2, int i10) {
        super(context, gyVar2, true);
        this.J0 = i10;
        switch (i10) {
            case 1:
                this.K0 = gyVar;
                super(context, gyVar2, false);
                break;
            default:
                this.K0 = gyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.J0) {
            case 0:
                gy gyVar = this.K0;
                gyVar.F1.i(gyVar.C1, i10 == 0, true);
                break;
            default:
                gy gyVar2 = this.K0;
                gyVar2.F1.i(gyVar2.E1, i10 == 0, true);
                break;
        }
    }
}
