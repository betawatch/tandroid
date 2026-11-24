// default package

import android.content.SharedPreferences;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLObject b;

    public /* synthetic */ x57(TLObject tLObject, byte b) {
        this.a = b;
        this.b = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TLRPC.TL_auth_loggedOut) {
                    TLRPC.TL_auth_loggedOut tL_auth_loggedOut = (TLRPC.TL_auth_loggedOut) tLObject;
                    if (tL_auth_loggedOut.future_auth_token != null) {
                        SharedPreferences sharedPreferences = a.b.getSharedPreferences("saved_tokens", 0);
                        int i = sharedPreferences.getInt("count", 0);
                        SerializedData serializedData = new SerializedData(tL_auth_loggedOut.getObjectSize());
                        tL_auth_loggedOut.serializeToStream(serializedData);
                        sharedPreferences.edit().putString(de9.k(i, "log_out_token_"), Utilities.f(serializedData.toByteArray())).putInt("count", i + 1).apply();
                        BackupAgent.a();
                        break;
                    }
                }
                break;
            default:
                if (!(tLObject instanceof TLRPC.TL_help_passportConfig)) {
                    gba.n();
                    break;
                } else {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    String str = tL_help_passportConfig.countries_langs.data;
                    int i2 = tL_help_passportConfig.hash;
                    gba.g0 = null;
                    gba.f0 = str;
                    gba.h0 = i2;
                    gba.x();
                    gba.n();
                    break;
                }
        }
    }
}
