// default package

import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonParser;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sb implements qcc {
    public final /* synthetic */ byte a;

    public /* synthetic */ sb(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        if (m01.h(r4) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (m01.h(r4) != false) goto L46;
     */
    @Override // qcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
            case 1:
                return ob6.G(((Integer) obj).intValue(), "Hours", new Object[0]);
            case 2:
                return ob6.G(((Integer) obj).intValue(), "Minutes", new Object[0]);
            case 3:
                r47 r47Var = (r47) obj;
                return Boolean.valueOf((r47Var == null || r47Var.R0() == null) ? false : true);
            case 4:
                r47 r47Var2 = (r47) obj;
                return Boolean.valueOf((r47Var2 == null || r47Var2.M0() == null) ? false : true);
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
                k43 k43Var = jz8.A0;
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
                return Boolean.valueOf(((view instanceof ilb) || (view instanceof rca) || (view instanceof fh4) || (view instanceof p55) || (view instanceof ll2) || Objects.equals(view.getTag(), -33024)) ? false : true);
            case 11:
                return TLRPC.TL_textWithEntities.TLJsonDeserialize((TLJsonParser) obj);
            case 12:
                return TLRPC.MessageEntity.TLJsonDeserialize((TLJsonParser) obj);
            case 13:
                return Boolean.valueOf(l9c.K(((Integer) obj).intValue()));
            case 14:
                return Boolean.valueOf(uqc.x0(uqc.h1((String) obj)));
            default:
                return Boolean.valueOf(muc.k0((String) obj) != null);
        }
    }
}
