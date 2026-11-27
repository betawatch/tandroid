// default package

import android.net.Uri;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r94 implements o66 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ r94(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if ((android.os.SystemClock.uptimeMillis() - r5.c) < 1000) goto L47;
     */
    @Override // o66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ClickableSpan clickableSpan) {
        r47 r47Var;
        String url;
        TLRPC.User user;
        String str;
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                v94 v94Var = (v94) callback;
                t94 t94Var = v94Var.I;
                if (t94Var != null && (r47Var = v94Var.J) != null) {
                    im7 im7Var = (im7) t94Var;
                    lm7 lm7Var = im7Var.z3;
                    na4 na4Var = lm7Var.a0;
                    boolean z = clickableSpan instanceof i8c;
                    TLRPC.User X1 = z ? lm7Var.getMessagesController().X1(Utilities.A(((i8c) clickableSpan).getURL())) : null;
                    if (!z) {
                        url = (!(clickableSpan instanceof URLSpan) || (clickableSpan instanceof no4)) ? null : ((URLSpan) clickableSpan).getURL();
                    } else if (X1 != null) {
                        url = "@";
                    }
                    boolean z2 = true;
                    String b2 = vke.b(url, url != null && m01.h(url));
                    if (b2 != null && na4Var.b != null && url.equals(lm7Var.b0)) {
                        user = X1;
                        break;
                    } else {
                        user = X1;
                    }
                    z2 = false;
                    if (b2 != null && !z2) {
                        boolean equals = b2.equals("iv");
                        int i = im7Var.n3;
                        if (equals) {
                            str = "open_iv";
                            b2 = null;
                        } else {
                            str = "open_link";
                        }
                        lm7Var.h0(lm7Var.n0(i, r47Var, str, b2), false, equals ? m01.C(Uri.parse(url)).toString() : null);
                        lm7Var.b0 = url;
                    }
                    if (z) {
                        if (!z2) {
                            lm7Var.getMessagesController().I3(user, null, lm7Var, 0);
                            break;
                        }
                    }
                }
                clickableSpan.onClick(v94Var.x);
                break;
            case 1:
                kl8 kl8Var = (kl8) callback;
                ArrayList arrayList = new ArrayList();
                arrayList.add(kl8Var.x2);
                qu0 qu0Var = new qu0(kl8Var, (byte) 10);
                e eVar = kl8Var.o2;
                if (eVar != null) {
                    qu0Var.setParentFragment(eVar);
                }
                new hl8(kl8Var, qu0Var, kl8Var.getContext(), kl8Var.J0, arrayList).show();
                break;
            default:
                b4c b4cVar = (b4c) callback;
                if (clickableSpan != null) {
                    clickableSpan.onClick(b4cVar.b);
                    break;
                }
                break;
        }
    }
}
