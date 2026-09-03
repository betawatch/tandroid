package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s3 extends URLSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(t3 t3Var, String str, int i10) {
        super(str);
        this.a = i10;
        this.b = t3Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10 = this.a;
        t3 t3Var = this.b;
        switch (i10) {
            case 0:
                n4 n4Var = t3Var.c;
                String url = getURL();
                org.telegram.ui.Components.g90 g90Var = n4Var.b;
                f3 f3Var = n4Var.d;
                HashSet hashSet = n4.Y0;
                n4Var.Q(url, null, g90Var == null ? null : new m0(n4Var, f3Var, g90Var));
                break;
            default:
                t3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
