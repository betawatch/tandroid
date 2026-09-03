package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s5 extends org.telegram.ui.Cells.x4 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5(Context context, int i10) {
        super(context);
        this.f = i10;
    }

    @Override // org.telegram.ui.Cells.x4
    public final int getFullHeight() {
        switch (this.f) {
        }
        return AndroidUtilities.dp(50.0f);
    }
}
