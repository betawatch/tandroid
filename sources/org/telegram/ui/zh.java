package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zh implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;

    public /* synthetic */ zh(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.r20
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                return Boolean.valueOf((jjVar == null || jjVar.R0() == null) ? false : true);
            case 1:
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) obj;
                return Boolean.valueOf((jjVar2 == null || jjVar2.M0() == null) ? false : true);
            case 2:
                return org.telegram.messenger.cd.G(((Integer) obj).intValue(), "Hours", new Object[0]);
            case 3:
                return org.telegram.messenger.cd.G(((Integer) obj).intValue(), "Minutes", new Object[0]);
            case 4:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof org.telegram.ui.Cells.b9) || (view instanceof org.telegram.ui.Cells.c7) || (view instanceof c10) || (view instanceof org.telegram.ui.Cells.z3) || (view instanceof org.telegram.ui.Cells.d2) || Objects.equals(view.getTag(), -33024)) ? false : true);
            case 5:
                return Boolean.valueOf(org.telegram.ui.Components.p51.K(((Integer) obj).intValue()));
            case 6:
                TL_wallet.exportSecretPhrase exportsecretphrase = new TL_wallet.exportSecretPhrase();
                exportsecretphrase.password = (TLRPC.InputCheckPasswordSRP) obj;
                return exportsecretphrase;
            case 7:
                TL_wallet.replaceWallet replacewallet = new TL_wallet.replaceWallet();
                replacewallet.wallet = new TL_wallet.inputWalletNew();
                replacewallet.password = (TLRPC.InputCheckPasswordSRP) obj;
                return replacewallet;
            case 8:
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.password = (TLRPC.InputCheckPasswordSRP) obj;
                return disablebackup;
            case 9:
                return Boolean.valueOf(org.telegram.ui.Wallet.b6.B0(org.telegram.ui.Wallet.b6.a1((String) obj)));
            case 10:
                return Boolean.valueOf(org.telegram.ui.Wallet.ba.k0((String) obj) != null);
            case 11:
                String str = (String) obj;
                if (TextUtils.isEmpty(str) || (!str.startsWith("tg:") && !gf.f.e(Uri.parse(str), false, null))) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 12:
                String str2 = (String) obj;
                org.telegram.ui.Components.gr grVar = qh.y.z0;
                if (TextUtils.isEmpty(str2) || (!str2.startsWith("tg:") && !gf.f.e(Uri.parse(str2), false, null))) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            default:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
        }
    }
}
