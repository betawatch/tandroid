// default package

import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pt4 extends fy0 {
    public final TLRPC.TL_payments_checkedGiftCode S1;
    public final boolean T1;
    public ot4 U1;
    public final String V1;

    public pt4(d dVar, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(dVar, true);
        this.T1 = tL_payments_checkedGiftCode.used_date == 0;
        this.S1 = tL_payments_checkedGiftCode;
        this.V1 = str;
        this.v0 = false;
        this.w0 = false;
        K();
        W0();
        ot4 ot4Var = this.U1;
        ww0 ww0Var = this.c;
        ot4Var.getClass();
        ot4Var.d = tL_payments_checkedGiftCode.used_date == 0;
        ot4Var.e = dVar;
        ot4Var.f = tL_payments_checkedGiftCode;
        ot4Var.h = str;
        ot4Var.n = ww0Var;
    }

    public static boolean Y0(Intent intent, c01 c01Var) {
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
            Z0(LaunchActivity.Q(), lastPathSegment, c01Var);
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
        Z0(LaunchActivity.Q(), lastPathSegment2, c01Var);
        return true;
    }

    public static void Z0(d dVar, String str, c01 c01Var) {
        if (dVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        byte b = 1;
        if (c01Var != null) {
            c01Var.d();
            c01Var.b = new tm0(atomicBoolean, (byte) 1);
        }
        au0 au0Var = new au0((Object) atomicBoolean, (Object) dVar, (Object) str, (Object) c01Var, (byte) 10);
        vm0 vm0Var = new vm0(atomicBoolean, c01Var, b);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
        na7 q1 = na7.q1(y6c.t0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new en0(q1, au0Var, vm0Var));
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        ot4 ot4Var = new ot4(this, this.J0);
        this.U1 = ot4Var;
        return ot4Var;
    }

    @Override // fy0
    public final CharSequence J0() {
        return this.T1 ? k96.M0(2131753497, null) : k96.M0(2131753170, null);
    }

    @Override // fy0
    public final void P0(cja cjaVar) {
        m21.a(this.c, new oy((byte) 7));
    }
}
