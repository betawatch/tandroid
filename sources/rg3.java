// default package

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rg3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;

    public /* synthetic */ rg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01aa  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        s7 s7Var;
        int i;
        byte b = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                this.b.f0[0].d.f();
                break;
            case 1:
                uj3 uj3Var = this.b;
                SharedPreferences e1 = uc7.e1();
                long j = e1.getLong("cache_hint_period", 604800000L);
                if (j <= 604800000) {
                    j = 2592000000L;
                }
                e1.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j).putLong("cache_hint_period", j).apply();
                uj3Var.q5();
                break;
            case 2:
                uj3 uj3Var2 = this.b;
                UndoView w3 = uj3Var2.w3();
                if (w3 != null) {
                    w3.l(0L, 15, null, new rg3(uj3Var2, (byte) 25));
                    break;
                }
                break;
            case 3:
                this.b.u4();
                break;
            case 4:
                uj3 uj3Var3 = this.b;
                uj3Var3.getClass();
                uj3Var3.presentFragment(new UserInfoActivity());
                break;
            case 5:
                this.b.W3();
                break;
            case 6:
                uj3 uj3Var4 = this.b;
                bg0 bg0Var = new bg0();
                bg0Var.a = true;
                uj3Var4.showAsSheet(new PrivacyControlActivity(11, false), bg0Var);
                break;
            case 7:
                uj3 uj3Var5 = this.b;
                uj3Var5.U4(false, true);
                if (uj3Var5.f0 != null) {
                    int i3 = 0;
                    while (true) {
                        tj3[] tj3VarArr = uj3Var5.f0;
                        if (i3 >= tj3VarArr.length) {
                            break;
                        } else {
                            if (tj3VarArr[i3].getVisibility() == 0) {
                                tj3 tj3Var = uj3Var5.f0[i3];
                                if (!tj3Var.d.H) {
                                    tj3Var.b(false);
                                }
                            }
                            i3++;
                        }
                    }
                }
                break;
            case 8:
                uj3 uj3Var6 = this.b;
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", uj3Var6.a3);
                uj3Var6.presentFragment(new xn2(bundle));
                break;
            case 9:
                this.b.presentFragment(new uqc());
                break;
            case 10:
                this.b.presentFragment(new uba(null));
                break;
            case 11:
                uj3 uj3Var7 = this.b;
                if (!uj3Var7.b3.collapsed_in_dialogs) {
                    uj3Var7.getMessagesController().s5(uj3Var7.a3, true);
                    uj3Var7.finishFragment();
                    break;
                }
                break;
            case 12:
                uj3 uj3Var8 = this.b;
                if (uj3Var8.b3.collapsed_in_dialogs) {
                    uj3Var8.getMessagesController().s5(uj3Var8.a3, false);
                    uj3Var8.finishFragment();
                    break;
                }
                break;
            case 13:
                this.b.presentFragment(new ds());
                break;
            case 14:
                this.b.b5();
                break;
            case 15:
                uj3 uj3Var9 = this.b;
                if (!uj3.E4) {
                    uj3.E4 = true;
                    SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (aob.O0(string) == null || aob.O0(string).o()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (aob.O0(string2) == null || !aob.O0(string2).o()) {
                        string2 = "Dark Blue";
                    }
                    znb znbVar = aob.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (znbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean equals = str.equals(znbVar.k());
                        znb O0 = !equals ? aob.O0(str2) : aob.O0(str);
                        s7Var = uj3Var9.l0;
                        if (s7Var != null) {
                            int[] iArr = {(uj3Var9.l0.getIconView().getMeasuredWidth() / 2) + r3, (uj3Var9.l0.getIconView().getMeasuredHeight() / 2) + r3};
                            s7Var.getLocationInWindow(iArr);
                            int i4 = iArr[0];
                            int i5 = iArr[1];
                            jn7.e().k(jn7.w4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        d31 b0 = d31.b0(uj3Var9);
                        ch3 ch3Var = new ch3(uj3Var9, b);
                        i = aob.o;
                        if (i == 0) {
                            if (b0 != null) {
                                try {
                                    b0.J(R.raw.auto_night_off, i == 3 ? ob6.M0(2131753778, "AutoNightSystemModeOff") : ob6.M0(2131753783, "AutoNightModeOff"), ob6.M0(2131745223, "Settings"), 5000, false, ch3Var).j();
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                            }
                            aob.o = 0;
                            aob.u1();
                            aob.A();
                            break;
                        }
                    }
                    str = string;
                    boolean equals2 = str.equals(znbVar.k());
                    if (!equals2) {
                    }
                    s7Var = uj3Var9.l0;
                    if (s7Var != null) {
                    }
                    d31 b02 = d31.b0(uj3Var9);
                    ch3 ch3Var2 = new ch3(uj3Var9, b);
                    i = aob.o;
                    if (i == 0) {
                    }
                }
                break;
            case 16:
                this.b.presentFragment(new ContactsActivity(null));
                break;
            case 17:
                this.b.presentFragment(new i91(null));
                break;
            case 18:
                this.b.presentFragment(new rc5(new Bundle()));
                break;
            case 19:
                this.b.a4();
                break;
            case 20:
                this.b.t4();
                break;
            case 21:
                this.b.q5();
                break;
            case 22:
                uj3 uj3Var10 = this.b;
                ArrayList arrayList = uj3Var10.K2;
                uj3Var10.O2 = true;
                if (uj3Var10.E2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i2 < arrayList.size()) {
                        arrayList2.add(jf7.a(((Long) arrayList.get(i2)).longValue(), 0L));
                        i2++;
                    }
                    uj3Var10.E2.q(uj3Var10, arrayList2, uj3Var10.D1.getFieldText(), false, uj3Var10.L2, uj3Var10.M2, uj3Var10.N2, null);
                    break;
                }
                break;
            case 23:
                uj3 uj3Var11 = this.b;
                ArrayList arrayList3 = uj3Var11.K2;
                uj3Var11.L2 = false;
                uj3Var11.O2 = false;
                if (uj3Var11.E2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i2 < arrayList3.size()) {
                        arrayList4.add(jf7.a(((Long) arrayList3.get(i2)).longValue(), 0L));
                        i2++;
                    }
                    uj3Var11.E2.q(uj3Var11, arrayList4, uj3Var11.D1.getFieldText(), false, uj3Var11.L2, uj3Var11.M2, uj3Var11.N2, null);
                    break;
                }
                break;
            case 24:
                uj3 uj3Var12 = this.b;
                uj3Var12.Y.r.requestFocus();
                hl.E3(uj3Var12.Y.r);
                break;
            case 25:
                this.b.presentFragment(new FiltersSetupActivity());
                break;
            case 26:
                this.b.U4(false, true);
                break;
            case 27:
                this.b.presentFragment(new ds());
                break;
            case 28:
                uj3 uj3Var13 = this.b;
                kf7 messagesStorage = uj3Var13.getMessagesStorage();
                messagesStorage.a.c(new hd7(messagesStorage, (byte) 21));
                Toast.makeText(uj3Var13.getParentActivity(), ob6.M0(2131751616, null), 0).show();
                break;
            default:
                uc7 messagesController = this.b.getMessagesController();
                messagesController.u1.b();
                messagesController.v1.b();
                break;
        }
    }
}
