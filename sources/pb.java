// default package

import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pb implements q8c {
    public final /* synthetic */ byte a;

    public /* synthetic */ pb(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (d01.g(android.net.Uri.parse(r5), false, null) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (d01.g(android.net.Uri.parse(r5), false, null) != false) goto L46;
     */
    @Override // q8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 1:
                return k96.G(((Integer) obj).intValue(), "Hours", new Object[0]);
            case 2:
                return k96.G(((Integer) obj).intValue(), "Minutes", new Object[0]);
            case 3:
                k27 k27Var = (k27) obj;
                return Boolean.valueOf((k27Var == null || k27Var.R0() == null) ? false : true);
            case 4:
                k27 k27Var2 = (k27) obj;
                return Boolean.valueOf((k27Var2 == null || k27Var2.M0() == null) ? false : true);
            case 5:
                TL_wallet.exportSecretPhrase exportsecretphrase = new TL_wallet.exportSecretPhrase();
                exportsecretphrase.password = (TLRPC.InputCheckPasswordSRP) obj;
                return exportsecretphrase;
            case 6:
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.password = (TLRPC.InputCheckPasswordSRP) obj;
                return disablebackup;
            case 7:
                TL_wallet.replaceWallet replacewallet = new TL_wallet.replaceWallet();
                replacewallet.wallet = new TL_wallet.inputWalletNew();
                replacewallet.password = (TLRPC.InputCheckPasswordSRP) obj;
                return replacewallet;
            case 8:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    if (!str.startsWith("tg:")) {
                        break;
                    }
                    return Boolean.valueOf(r2);
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 9:
                String str2 = (String) obj;
                s33 s33Var = yv8.A0;
                if (!TextUtils.isEmpty(str2)) {
                    if (!str2.startsWith("tg:")) {
                        break;
                    }
                    return Boolean.valueOf(r2);
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 10:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof mhb) || (view instanceof b9a) || (view instanceof gf4) || (view instanceof l35) || (view instanceof rk2) || Objects.equals(view.getTag(), -33024)) ? false : true);
            case 11:
                return TLRPC.TL_textWithEntities.TLJsonDeserialize((TLJsonParser) obj);
            case 12:
                return TLRPC.MessageEntity.TLJsonDeserialize((TLJsonParser) obj);
            case 13:
                return Boolean.valueOf(l5c.K(((Integer) obj).intValue()));
            case 14:
                return Boolean.valueOf(hmc.w0(hmc.h1((String) obj)));
            default:
                return Boolean.valueOf(ypc.k0((String) obj) != null);
        }
    }
}
