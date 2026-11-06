package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class up0 extends tg.g0 {
    public final /* synthetic */ PhotoViewer X1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up0(PhotoViewer photoViewer, Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, org.telegram.messenger.ye yeVar, cn0 cn0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, activity, i7, bitmap, bitmap2, i10, arrayList, yeVar, cn0Var, f6Var);
        this.X1 = photoViewer;
    }

    @Override // tg.g0
    public final int getPKeyboardHeight() {
        fi.q3 q3Var = this.X1.K1;
        if (q3Var != null) {
            return q3Var.l;
        }
        return 0;
    }

    @Override // tg.g0
    public final void o0(boolean z9) {
        PhotoViewer photoViewer = this.X1;
        if (photoViewer.F2 == null) {
            return;
        }
        photoViewer.G2 = false;
        photoViewer.n0();
        if (z9) {
            photoViewer.F2.g0();
        } else {
            if (photoViewer.I4 && photoViewer.O1() && photoViewer.c2 != 1) {
                return;
            }
            photoViewer.F2.h0();
        }
    }
}
