// default package

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class se2 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ se2(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                af2 af2Var = (af2) this.c;
                ResultCallback resultCallback = (ResultCallback) this.d;
                boolean z = this.b;
                TL_account.Themes themes = (TL_account.Themes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (themes instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes = (TL_account.TL_themes) themes;
                    af2Var.c = tL_themes.hash;
                    af2Var.d = System.currentTimeMillis();
                    SharedPreferences.Editor edit = af2Var.f().edit();
                    edit.clear();
                    edit.putLong("hash", af2Var.c);
                    edit.putLong("lastReload", af2Var.d);
                    edit.putInt("count", tL_themes.themes.size());
                    ArrayList arrayList2 = new ArrayList(tL_themes.themes.size());
                    for (int i = 0; i < tL_themes.themes.size(); i++) {
                        TLRPC.TL_theme tL_theme = tL_themes.themes.get(i);
                        pv3.k(tL_theme.emoticon);
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        tL_theme.serializeToStream(serializedData);
                        edit.putString("theme_" + i, Utilities.f(serializedData.toByteArray()));
                        ez3 ez3Var = new ez3(af2Var.currentAccount, tL_theme);
                        ez3Var.p(0, null);
                        ez3Var.p(1, null);
                        ez3Var.n(0, null);
                        ez3Var.n(1, null);
                        arrayList2.add(ez3Var);
                    }
                    edit.apply();
                    arrayList = arrayList2;
                } else if (!(themes instanceof TL_account.TL_themesNotModified)) {
                    hl.c3(new ea2(resultCallback, tL_error, (byte) 11));
                    arrayList = null;
                    if (r2) {
                        hl.c3(new lg((Object) af2Var, (Object) arrayList, (Object) resultCallback, z, (byte) 13));
                        break;
                    }
                } else {
                    arrayList = af2Var.b();
                }
                r2 = false;
                if (r2) {
                }
                break;
            case 1:
                bg2 bg2Var = (bg2) this.c;
                skb skbVar = (skb) this.d;
                boolean z2 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    bg2Var.getMessagesController().Y3(updates, false);
                    break;
                } else {
                    bg2Var.getClass();
                    if (tL_error2 != null) {
                        skbVar.setChecked(z2);
                        d31.b0(bg2Var).g0(tL_error2, false);
                        break;
                    }
                }
                break;
            default:
                vz8 vz8Var = (vz8) this.c;
                int[] iArr = (int[]) this.d;
                boolean z3 = this.b;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                f09 f09Var = vz8Var.b;
                if (vz8Var.n == iArr[0] && !vz8Var.F) {
                    vz8Var.n = 0;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str = tL_error3 != null ? tL_error3.text : null;
                        cc4.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = vz8Var.f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if ((tL_exportedNoPaidMessagesToken2.expires != 0) == z3) {
                                if (str != null) {
                                    f09Var.getClass();
                                    f09Var.d1(R.drawable.msg_warning, ob6.M0(2131751070, null), null);
                                    break;
                                }
                            }
                        }
                        vz8Var.d = (byte) 0;
                        vz8Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (f09Var.w0) {
                            f09Var.U0(str != null ? ob6.M0(2131751070, null) : null);
                            break;
                        } else if (str != null) {
                            f09Var.d1(R.drawable.msg_warning, ob6.M0(2131751070, null), null);
                            break;
                        }
                    } else {
                        byte b = vz8Var.d;
                        if (b != 0) {
                            if (z3 == (b == 1)) {
                                if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                    vz8Var.f().edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                                }
                                vz8Var.f = tL_exportedNoPaidMessagesToken;
                                vz8Var.h = SystemClock.elapsedRealtime();
                                f09Var.setFreeLink(vz8Var.d(tL_exportedNoPaidMessagesToken));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
