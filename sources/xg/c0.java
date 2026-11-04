package xg;

import ai.r6;
import ai.v1;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c0 extends ma {
    public final TLRPC.TL_payments_checkedGiftCode Q1;
    public final boolean R1;
    public b0 S1;
    public final String T1;

    public c0(d2 d2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(d2Var, true);
        this.R1 = tL_payments_checkedGiftCode.used_date == 0;
        this.Q1 = tL_payments_checkedGiftCode;
        this.T1 = str;
        this.v0 = false;
        this.w0 = false;
        N();
        b1();
        b0 b0Var = this.S1;
        j2 j2Var = this.c;
        b0Var.getClass();
        b0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        b0Var.e = d2Var;
        b0Var.f = tL_payments_checkedGiftCode;
        b0Var.h = str;
        b0Var.n = j2Var;
    }

    public static boolean d1(Intent intent, sf.b bVar) {
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
            e1(LaunchActivity.Q(), lastPathSegment, bVar);
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
        e1(LaunchActivity.Q(), lastPathSegment2, bVar);
        return true;
    }

    public static void e1(d2 d2Var, String str, sf.b bVar) {
        if (d2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (bVar != null) {
            bVar.d();
            bVar.b = new e(atomicBoolean, 1);
        }
        v1 v1Var = new v1(atomicBoolean, d2Var, str, bVar);
        g gVar = new g(atomicBoolean, bVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.t0);
        hp s12 = hp.s1(h10.t0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new r6(s12, v1Var, gVar, 23));
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        b0 b0Var = new b0(this, this.J0);
        this.S1 = b0Var;
        return b0Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return this.R1 ? bd.M0(2131753500, null) : bd.M0(2131753173, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final void U0(qt0 qt0Var) {
        ac.a(this.c, new ai.y(15));
    }
}
