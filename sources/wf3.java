// default package

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wf3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;

    public /* synthetic */ wf3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0288  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        r7 r7Var;
        int i;
        int i2 = 0;
        switch (this.a) {
            case 0:
                this.b.presentFragment(new d8a(null));
                break;
            case 1:
                cj3 cj3Var = this.b;
                if (!cj3Var.b3.collapsed_in_dialogs) {
                    cj3Var.getMessagesController().k5(cj3Var.a3, true);
                    cj3Var.finishFragment();
                    break;
                }
                break;
            case 2:
                cj3 cj3Var2 = this.b;
                if (cj3Var2.b3.collapsed_in_dialogs) {
                    cj3Var2.getMessagesController().k5(cj3Var2.a3, false);
                    cj3Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                this.b.presentFragment(new cs());
                break;
            case 4:
                this.b.X4();
                break;
            case 5:
                cj3 cj3Var3 = this.b;
                if (!cj3.C4) {
                    cj3.C4 = true;
                    SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (bkb.O0(string) == null || bkb.O0(string).o()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (bkb.O0(string2) == null || !bkb.O0(string2).o()) {
                        string2 = "Dark Blue";
                    }
                    akb akbVar = bkb.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (akbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean equals = str.equals(akbVar.k());
                        akb O0 = !equals ? bkb.O0(str2) : bkb.O0(str);
                        r7Var = cj3Var3.l0;
                        if (r7Var != null) {
                            int[] iArr = {(cj3Var3.l0.getIconView().getMeasuredWidth() / 2) + r3, (cj3Var3.l0.getIconView().getMeasuredHeight() / 2) + r3};
                            r7Var.getLocationInWindow(iArr);
                            int i3 = iArr[0];
                            int i4 = iArr[1];
                            kk7.e().k(kk7.v4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        u21 b0 = u21.b0(cj3Var3);
                        wf3 wf3Var = new wf3(cj3Var3, (byte) 20);
                        i = bkb.o;
                        if (i == 0) {
                            if (b0 != null) {
                                try {
                                    b0.J(R.raw.auto_night_off, i == 3 ? k96.M0(2131753782, "AutoNightSystemModeOff") : k96.M0(2131753787, "AutoNightModeOff"), k96.M0(2131745303, "Settings"), 5000, false, wf3Var).j();
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                            }
                            bkb.o = 0;
                            bkb.u1();
                            bkb.A();
                            break;
                        }
                    }
                    str = string;
                    boolean equals2 = str.equals(akbVar.k());
                    if (!equals2) {
                    }
                    r7Var = cj3Var3.l0;
                    if (r7Var != null) {
                    }
                    u21 b02 = u21.b0(cj3Var3);
                    wf3 wf3Var2 = new wf3(cj3Var3, (byte) 20);
                    i = bkb.o;
                    if (i == 0) {
                    }
                }
                break;
            case 6:
                this.b.presentFragment(new ContactsActivity(null));
                break;
            case 7:
                this.b.presentFragment(new z81(null));
                break;
            case 8:
                this.b.presentFragment(new qa5(new Bundle()));
                break;
            case 9:
                this.b.X3();
                break;
            case 10:
                this.b.q4();
                break;
            case 11:
                this.b.m5();
                break;
            case 12:
                this.b.fragmentView.dispatchTouchEvent(gl.R());
                break;
            case 13:
                cj3 cj3Var4 = this.b;
                ArrayList arrayList = cj3Var4.K2;
                cj3Var4.O2 = true;
                if (cj3Var4.E2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i2 < arrayList.size()) {
                        arrayList2.add(zc7.a(((Long) arrayList.get(i2)).longValue(), 0L));
                        i2++;
                    }
                    cj3Var4.E2.r(cj3Var4, arrayList2, cj3Var4.D1.getFieldText(), false, cj3Var4.L2, cj3Var4.M2, cj3Var4.N2, null);
                    break;
                }
                break;
            case 14:
                cj3 cj3Var5 = this.b;
                ArrayList arrayList3 = cj3Var5.K2;
                cj3Var5.L2 = false;
                cj3Var5.O2 = false;
                if (cj3Var5.E2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i2 < arrayList3.size()) {
                        arrayList4.add(zc7.a(((Long) arrayList3.get(i2)).longValue(), 0L));
                        i2++;
                    }
                    cj3Var5.E2.r(cj3Var5, arrayList4, cj3Var5.D1.getFieldText(), false, cj3Var5.L2, cj3Var5.M2, cj3Var5.N2, null);
                    break;
                }
                break;
            case 15:
                cj3 cj3Var6 = this.b;
                if (LaunchActivity.Q() != null) {
                    cj3Var6.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 16:
                cj3 cj3Var7 = this.b;
                cj3Var7.Y.r.requestFocus();
                gl.E3(cj3Var7.Y.r);
                break;
            case 17:
                this.b.presentFragment(new FiltersSetupActivity());
                break;
            case 18:
                this.b.presentFragment(new cs());
                break;
            case 19:
                cj3 cj3Var8 = this.b;
                cj3Var8.getMessagesController().O4(cj3Var8.v3(), false);
                break;
            case 20:
                this.b.presentFragment(new ThemeActivity(1));
                break;
            case 21:
                this.b.Q4(false, true);
                break;
            case 22:
                cj3 cj3Var9 = this.b;
                bj3[] bj3VarArr = cj3Var9.f0;
                if (bj3VarArr != null) {
                    int length = bj3VarArr.length;
                    while (i2 < length) {
                        bj3VarArr[i2].a.requestLayout();
                        i2++;
                    }
                }
                cj3Var9.k5();
                View view = cj3Var9.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 23:
                cj3 cj3Var10 = this.b;
                ad7 messagesStorage = cj3Var10.getMessagesStorage();
                messagesStorage.a.c(new vb7(messagesStorage, (byte) 16));
                Toast.makeText(cj3Var10.getParentActivity(), k96.M0(2131751639, null), 0).show();
                break;
            case 24:
                na7 messagesController = this.b.getMessagesController();
                messagesController.u1.b();
                messagesController.v1.b();
                break;
            case 25:
                cj3 cj3Var11 = this.b;
                hi3 hi3Var = cj3Var11.D0;
                if (hi3Var != null && hi3Var.B0) {
                    hi3Var.R(false);
                    break;
                } else {
                    cj3Var11.Y.r.getText().clear();
                    gl.t1(cj3Var11.Y.r);
                    cj3Var11.Y.r.clearFocus();
                    cj3Var11.Z.b(false);
                    break;
                }
                break;
            case 26:
                cj3 cj3Var12 = this.b;
                if (cj3Var12.T0 != 10) {
                    cj3Var12.z3(false);
                }
                if (!cj3Var12.M || !cj3Var12.t3().H()) {
                    cj3Var12.N4(true, true);
                    break;
                } else {
                    cj3Var12.F0.h();
                    break;
                }
                break;
            case 27:
                cj3 cj3Var13 = this.b;
                j92 j92Var = cj3Var13.A1;
                if (j92Var != null) {
                    j92Var.d();
                }
                cj3Var13.M2();
                cj3Var13.N2();
                jh3 jh3Var = cj3Var13.E1;
                if (jh3Var != null) {
                    jh3Var.setTranslationY(-cj3Var13.w.d());
                    break;
                }
                break;
            case 28:
                this.b.R3();
                break;
            default:
                this.b.getNotificationCenter().k(24, new Object[0]);
                break;
        }
    }
}
