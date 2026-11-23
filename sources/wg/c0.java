package wg;

import android.content.Intent;
import android.net.Uri;
import bi.q1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c0 extends sa {
    public final TLRPC.TL_payments_checkedGiftCode T1;
    public final boolean U1;
    public b0 V1;
    public final String W1;

    public c0(g2 g2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(g2Var, true);
        this.U1 = tL_payments_checkedGiftCode.used_date == 0;
        this.T1 = tL_payments_checkedGiftCode;
        this.W1 = str;
        this.v0 = false;
        this.w0 = false;
        O();
        c1();
        b0 b0Var = this.V1;
        m2 m2Var = this.c;
        b0Var.getClass();
        b0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        b0Var.e = g2Var;
        b0Var.f = tL_payments_checkedGiftCode;
        b0Var.h = str;
        b0Var.n = m2Var;
    }

    public static boolean e1(Intent intent, vf.b bVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data == null || (scheme = data.getScheme()) == null) {
            return false;
        }
        if (!scheme.equals("http") && !scheme.equals("https")) {
            if (!scheme.equals("tg")) {
                return false;
            }
            String uri = data.toString();
            String lastPathSegment = data.getLastPathSegment();
            if ((!uri.startsWith("tg:giftcode") && !uri.startsWith("tg://giftcode")) || lastPathSegment == null) {
                return false;
            }
            f1(LaunchActivity.Q(), lastPathSegment, bVar);
            return true;
        }
        String lowerCase = data.getHost().toLowerCase();
        if ((!lowerCase.equals("telegram.me") && !lowerCase.equals("t.me") && !lowerCase.equals("telegram.dog")) || (path = data.getPath()) == null) {
            return false;
        }
        String lastPathSegment2 = data.getLastPathSegment();
        if (!path.startsWith("/giftcode") || lastPathSegment2 == null) {
            return false;
        }
        f1(LaunchActivity.Q(), lastPathSegment2, bVar);
        return true;
    }

    public static void f1(g2 g2Var, String str, vf.b bVar) {
        if (g2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (bVar != null) {
            bVar.d();
            bVar.b = new c(atomicBoolean, 1);
        }
        bi.m2 m2Var = new bi.m2(atomicBoolean, g2Var, str, bVar);
        e eVar = new e(atomicBoolean, bVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k10.t0);
        np u12 = np.u1(k10.t0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new q1(u12, m2Var, eVar, 25));
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        b0 b0Var = new b0(this, this.J0);
        this.V1 = b0Var;
        return b0Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return this.U1 ? hd.N0(2131753497, null) : hd.N0(2131753170, null);
    }

    @Override // org.telegram.ui.Components.sa
    public final void V0(du0 du0Var) {
        gc.a(this.c, new bi.t(15));
    }
}
