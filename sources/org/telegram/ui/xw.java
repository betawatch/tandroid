package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xw {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;
    public final /* synthetic */ View c;

    public /* synthetic */ xw(yw ywVar, View view, int i10) {
        this.a = i10;
        this.b = ywVar;
        this.c = view;
    }

    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof jh.o) {
                    this.b.K0.A0.i((jh.o) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gc(19), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof jh.o) {
                    this.b.K0.A0.i((jh.o) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gc(19), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
