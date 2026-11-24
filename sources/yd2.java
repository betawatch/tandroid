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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yd2 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yd2(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    @Override // i8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                je2 je2Var = (je2) this.c;
                ResultCallback resultCallback = (ResultCallback) this.d;
                boolean z = this.b;
                TL_account.Themes themes = (TL_account.Themes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (themes instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes = (TL_account.TL_themes) themes;
                    je2Var.c = tL_themes.hash;
                    je2Var.d = System.currentTimeMillis();
                    SharedPreferences.Editor edit = je2Var.f().edit();
                    edit.clear();
                    edit.putLong("hash", je2Var.c);
                    edit.putLong("lastReload", je2Var.d);
                    edit.putInt("count", tL_themes.themes.size());
                    ArrayList arrayList2 = new ArrayList(tL_themes.themes.size());
                    for (int i = 0; i < tL_themes.themes.size(); i++) {
                        TLRPC.TL_theme tL_theme = tL_themes.themes.get(i);
                        vu3.k(tL_theme.emoticon);
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        tL_theme.serializeToStream(serializedData);
                        edit.putString("theme_" + i, Utilities.f(serializedData.toByteArray()));
                        jy3 jy3Var = new jy3(je2Var.currentAccount, tL_theme);
                        jy3Var.p(0, null);
                        jy3Var.p(1, null);
                        jy3Var.n(0, null);
                        jy3Var.n(1, null);
                        arrayList2.add(jy3Var);
                    }
                    edit.apply();
                    arrayList = arrayList2;
                } else if (!(themes instanceof TL_account.TL_themesNotModified)) {
                    gl.c3(new n92(resultCallback, tL_error, (byte) 13));
                    arrayList = null;
                    if (r2) {
                        gl.c3(new rg((Object) je2Var, (Object) arrayList, (Object) resultCallback, z, (byte) 13));
                        break;
                    }
                } else {
                    arrayList = je2Var.b();
                }
                r2 = false;
                if (r2) {
                }
                break;
            case 1:
                kf2 kf2Var = (kf2) this.c;
                wgb wgbVar = (wgb) this.d;
                boolean z2 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    kf2Var.getMessagesController().R3(updates, false);
                    break;
                } else {
                    kf2Var.getClass();
                    if (tL_error2 != null) {
                        wgbVar.setChecked(z2);
                        u21.b0(kf2Var).g0(tL_error2, false);
                        break;
                    }
                }
                break;
            default:
                kw8 kw8Var = (kw8) this.c;
                int[] iArr = (int[]) this.d;
                boolean z3 = this.b;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                vw8 vw8Var = kw8Var.b;
                if (kw8Var.n == iArr[0] && !kw8Var.F) {
                    kw8Var.n = 0;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str = tL_error3 != null ? tL_error3.text : null;
                        fa4.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = kw8Var.f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if ((tL_exportedNoPaidMessagesToken2.expires != 0) == z3) {
                                if (str != null) {
                                    vw8Var.getClass();
                                    vw8Var.d1(R.drawable.msg_warning, k96.M0(2131751093, null), null);
                                    break;
                                }
                            }
                        }
                        kw8Var.d = (byte) 0;
                        kw8Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (vw8Var.w0) {
                            vw8Var.U0(str != null ? k96.M0(2131751093, null) : null);
                            break;
                        } else if (str != null) {
                            vw8Var.d1(R.drawable.msg_warning, k96.M0(2131751093, null), null);
                            break;
                        }
                    } else {
                        byte b = kw8Var.d;
                        if (b != 0) {
                            if (z3 == (b == 1)) {
                                if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                    kw8Var.f().edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                                }
                                kw8Var.f = tL_exportedNoPaidMessagesToken;
                                kw8Var.h = SystemClock.elapsedRealtime();
                                vw8Var.setFreeLink(kw8Var.d(tL_exportedNoPaidMessagesToken));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
