package tg;

import ai.e4;
import ai.t5;
import android.content.Intent;
import android.net.Uri;
import ci.d9;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d0 extends za {
    public final TLRPC.TL_payments_checkedGiftCode X;
    public final boolean Y;
    public c0 Z;
    public final String a0;

    public d0(o2 o2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(o2Var, true);
        this.Y = tL_payments_checkedGiftCode.used_date == 0;
        this.X = tL_payments_checkedGiftCode;
        this.a0 = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        N();
        c0 c0Var = this.Z;
        e3 e3Var = this.container;
        c0Var.getClass();
        c0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        c0Var.e = o2Var;
        c0Var.f = tL_payments_checkedGiftCode;
        c0Var.h = str;
        c0Var.n = e3Var;
    }

    public static boolean S(Intent intent, nf.e eVar) {
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
            T(LaunchActivity.R(), lastPathSegment, eVar);
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
        T(LaunchActivity.R(), lastPathSegment2, eVar);
        return true;
    }

    public static void T(o2 o2Var, String str, nf.e eVar) {
        if (o2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (eVar != null) {
            eVar.d();
            eVar.b = new f(atomicBoolean, 1);
        }
        e4 e4Var = new e4(atomicBoolean, o2Var, str, eVar, 15);
        h hVar = new h(atomicBoolean, eVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new t5(messagesController, e4Var, hVar, 19));
    }

    @Override // org.telegram.ui.Components.za
    public final void G(qv0 qv0Var) {
        oc.a(this.container, new d9(14));
    }

    @Override // org.telegram.ui.Components.za
    public final ll0 v(ml0 ml0Var) {
        c0 c0Var = new c0(this, this.resourcesProvider);
        this.Z = c0Var;
        return c0Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return this.Y ? LocaleController.getString(R.string.BoostingGiftLink) : LocaleController.getString(R.string.BoostingUsedGiftLink);
    }
}
