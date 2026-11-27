// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xm3 implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ xm3(c51 c51Var, boolean z, int i, q61 q61Var, Runnable runnable, Context context, vnb vnbVar) {
        this.d = c51Var;
        this.b = z;
        this.c = i;
        this.e = q61Var;
        this.f = runnable;
        this.h = context;
        this.n = vnbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = false;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        boolean z2 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                bn3 bn3Var = (bn3) obj5;
                String str = (String) obj3;
                String[] strArr = (String[]) obj2;
                zv4 zv4Var = (zv4) obj;
                bn3Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String i0 = DictationAsr.i0((nm3) obj4, str);
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    arrayList.add(new l7(bn3Var.h, bn3.R(str2), null, this.c, (z2 && str2.equals(i0)) ? true : z));
                    arrayList2.add(new cv2(bn3Var, str, str2, (byte) 11));
                    i++;
                    z = false;
                }
                zv4Var.h(arrayList, arrayList2);
                break;
            default:
                c51 c51Var = (c51) obj5;
                q61 q61Var = (q61) obj4;
                Runnable runnable = (Runnable) obj3;
                Context context = (Context) obj2;
                vnb vnbVar = (vnb) obj;
                c51Var.setLoading(true);
                int i2 = this.c;
                if (!z2) {
                    TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                    TLRPC.GlobalPrivacySettings globalPrivacySettings = lv2.r(i2).Y;
                    setglobalprivacysettings.settings = globalPrivacySettings;
                    if (globalPrivacySettings == null) {
                        globalPrivacySettings = new TLRPC.TL_globalPrivacySettings();
                        setglobalprivacysettings.settings = globalPrivacySettings;
                    }
                    globalPrivacySettings.hide_read_marks = false;
                    ConnectionsManager.getInstance(i2).sendRequest(setglobalprivacysettings, new in0(context, vnbVar, c51Var, q61Var, runnable, (byte) 9));
                    break;
                } else {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i2).sendRequest(setprivacy, new m65(c51Var, q61Var, runnable, (byte) 13));
                    break;
                }
        }
    }

    public /* synthetic */ xm3(bn3 bn3Var, nm3 nm3Var, String str, String[] strArr, int i, boolean z, zv4 zv4Var) {
        this.d = bn3Var;
        this.e = nm3Var;
        this.f = str;
        this.h = strArr;
        this.c = i;
        this.b = z;
        this.n = zv4Var;
    }
}
