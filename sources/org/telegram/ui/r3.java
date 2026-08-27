package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r3 extends URLSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(s3 s3Var, String str, int i10) {
        super(str);
        this.a = i10;
        this.b = s3Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10 = this.a;
        s3 s3Var = this.b;
        switch (i10) {
            case 0:
                m4 m4Var = s3Var.c;
                String url = getURL();
                org.telegram.ui.Components.q80 q80Var = m4Var.b;
                f3 f3Var = m4Var.d;
                HashSet hashSet = m4.X0;
                m4Var.Q(url, null, q80Var == null ? null : new m0(m4Var, f3Var, q80Var));
                break;
            default:
                s3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
