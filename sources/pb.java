// default package

import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pb implements rac {
    public final /* synthetic */ byte a;

    public /* synthetic */ pb(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        if (l11.h(r4) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (l11.h(r4) != false) goto L46;
     */
    @Override // rac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 1:
                return jb6.G(((Integer) obj).intValue(), "Hours", new Object[0]);
            case 2:
                return jb6.G(((Integer) obj).intValue(), "Minutes", new Object[0]);
            case 3:
                k47 k47Var = (k47) obj;
                return Boolean.valueOf((k47Var == null || k47Var.R0() == null) ? false : true);
            case 4:
                k47 k47Var2 = (k47) obj;
                return Boolean.valueOf((k47Var2 == null || k47Var2.M0() == null) ? false : true);
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
                    return Boolean.valueOf(r1);
                }
                r1 = false;
                return Boolean.valueOf(r1);
            case 9:
                String str2 = (String) obj;
                d53 d53Var = zx8.A0;
                if (!TextUtils.isEmpty(str2)) {
                    if (!str2.startsWith("tg:")) {
                        break;
                    }
                    return Boolean.valueOf(r1);
                }
                r1 = false;
                return Boolean.valueOf(r1);
            case 10:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof njb) || (view instanceof bba) || (view instanceof ih4) || (view instanceof l55) || (view instanceof dm2) || Objects.equals(view.getTag(), -33024)) ? false : true);
            case 11:
                return TLRPC.TL_textWithEntities.TLJsonDeserialize((TLJsonParser) obj);
            case 12:
                return TLRPC.MessageEntity.TLJsonDeserialize((TLJsonParser) obj);
            case 13:
                return Boolean.valueOf(l7c.K(((Integer) obj).intValue()));
            case 14:
                return Boolean.valueOf(goc.x0(goc.i1((String) obj)));
            default:
                return Boolean.valueOf(asc.l0((String) obj) != null);
        }
    }
}
