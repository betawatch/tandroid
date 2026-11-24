// default package

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vy3 extends g6c {
    public final /* synthetic */ wy3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy3(wy3 wy3Var, String str) {
        super(str, (wkb) null);
        this.e = wy3Var;
    }

    @Override // g6c, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        wy3 wy3Var = this.e;
        az3 az3Var = wy3Var.y;
        Pattern pattern = az3.P1;
        oc7 r1 = oc7.r1(az3Var.a);
        String url = getURL();
        az3 az3Var2 = wy3Var.y;
        r1.C3(url, az3Var2.m1, 1, null);
        az3Var2.G0();
        az3Var2.dismiss();
    }
}
