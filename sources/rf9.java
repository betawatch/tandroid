// default package

import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xk9 b;

    public /* synthetic */ rf9(xk9 xk9Var, byte b) {
        this.a = b;
        this.b = xk9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w();
                break;
            default:
                xk9 xk9Var = this.b;
                xk9Var.H = null;
                ll0 ll0Var = xk9Var.y;
                if (ll0Var != null) {
                    TL_iv.PageBlock pageBlock = ll0Var.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = xk9Var.f.getText().toString();
                        if (!obj.equals(xk9Var.I)) {
                            ll0 ll0Var2 = xk9Var.y;
                            String str = ((TL_iv.pageBlockPreformatted) ll0Var2.b).language;
                            int i = xk9Var.J + 1;
                            xk9Var.J = i;
                            rp2 rp2Var = new rp2(xk9Var, i, ll0Var2, obj, (byte) 5);
                            ml8 ml8Var = el2.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b = ml8.b(str);
                            if (!b.isEmpty() && spannableString.length() != 0) {
                                el2.a.d(spannableString.toString(), b, new x92((Object) spannableString, (Object) rp2Var, (byte) 7));
                                break;
                            } else {
                                gm.c3(new ra2(rp2Var, spannableString, (byte) 22));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
