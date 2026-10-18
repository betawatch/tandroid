package ug;

import ai.k2;
import android.content.Intent;
import android.net.Uri;
import ci.y2;
import ei.o8;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class b0 extends bb {
    public final TLRPC.TL_payments_checkedGiftCode X;
    public final boolean Y;
    public a0 Z;
    public final String a0;

    public b0(n2 n2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(n2Var, true);
        this.Y = tL_payments_checkedGiftCode.used_date == 0;
        this.X = tL_payments_checkedGiftCode;
        this.a0 = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        O();
        a0 a0Var = this.Z;
        d3 d3Var = this.container;
        a0Var.getClass();
        a0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        a0Var.e = n2Var;
        a0Var.f = tL_payments_checkedGiftCode;
        a0Var.h = str;
        a0Var.n = d3Var;
    }

    public static boolean T(Intent intent, pf.c cVar) {
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
            U(LaunchActivity.R(), lastPathSegment, cVar);
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
        U(LaunchActivity.R(), lastPathSegment2, cVar);
        return true;
    }

    public static void U(n2 n2Var, String str, pf.c cVar) {
        if (n2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (cVar != null) {
            cVar.d();
            cVar.b = new d(atomicBoolean, 1);
        }
        y2 y2Var = new y2(atomicBoolean, n2Var, str, cVar, 16);
        f fVar = new f(atomicBoolean, cVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new k2(messagesController, y2Var, fVar, 24));
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return this.Y ? LocaleController.getString(R.string.BoostingGiftLink) : LocaleController.getString(R.string.BoostingUsedGiftLink);
    }

    @Override // org.telegram.ui.Components.bb
    public final void H(jw0 jw0Var) {
        qc.a(this.container, new o8(14));
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        a0 a0Var = new a0(this, this.resourcesProvider);
        this.Z = a0Var;
        return a0Var;
    }
}
