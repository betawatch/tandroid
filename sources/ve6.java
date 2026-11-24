// default package

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ve6 extends jja {
    public final ImageView a;
    public final u41 b;
    public final q64[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final /* synthetic */ mf6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve6(mf6 mf6Var, Context context) {
        super(context);
        wjb wjbVar;
        wjb wjbVar2;
        wjb wjbVar3;
        wjb wjbVar4;
        this.w = mf6Var;
        q64[] q64VarArr = {r4, r4, r4};
        this.c = q64VarArr;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, gl.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, nme.o(-1, kk7.d3));
        ub ubVar = new ub(context, (byte) 4);
        frameLayout.addView(ubVar, nme.e(-1, kk7.d3, kk7.D1));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i = bkb.F6;
        wjbVar = ((d) mf6Var).resourceProvider;
        zkb.s(imageView, i, wjbVar, PorterDuff.Mode.SRC_IN);
        int i2 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.w0(null, i2, false), 1, -1);
        vkb M = zkb.M(i2);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, null);
        frameLayout.addView(imageView, nme.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        n84 n84Var = new n84(context, 1, 1, (byte) 2);
        n84Var.setStarParticlesView(ubVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i3 = bkb.Ck;
        canvas.drawColor(bm2.f(0.5f, bkb.w0(null, i3, false), bkb.w0(null, bkb.g5, false)));
        n84Var.setBackgroundBitmap(createBitmap);
        uq4 uq4Var = n84Var.b;
        uq4Var.z = i3;
        uq4Var.A = bkb.Bk;
        uq4Var.b();
        frameLayout.addView(n84Var, nme.e(kk7.p2, kk7.p2, 1));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131745774, null));
        tb4.w(textView, i, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, nme.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        wjbVar2 = ((d) mf6Var).resourceProvider;
        q64 q64Var = new q64(1, wjbVar2, context);
        q64Var.a(R.drawable.menu_high_price, k96.M0(2131745788, null), k96.M0(2131745790, null));
        addView(q64VarArr[0], nme.t(-1, -2, 55, 0, 0, 0, 6));
        wjbVar3 = ((d) mf6Var).resourceProvider;
        q64 q64Var2 = new q64(1, wjbVar3, context);
        q64Var2.a(R.drawable.menu_feature_code, k96.M0(2131745786, null), k96.M0(2131745787, null));
        addView(q64VarArr[1], nme.t(-1, -2, 55, 0, 0, 0, 6));
        wjbVar4 = ((d) mf6Var).resourceProvider;
        q64 q64Var3 = new q64(1, wjbVar4, context);
        q64Var3.a(R.drawable.menu_feature_hands, gl.F2(gl.O2(k96.M0(2131745781, null), -1, 0, new re6(this, (byte) 1), null), true, gl.L(2.6666667f), gl.L(1.0f)), k96.M0(2131745785, null));
        addView(q64VarArr[2], nme.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), nme.p(0, 0, 1.0f, kk7.D1));
        u41 i4 = yjb.i(24, null, context, true);
        this.b = i4;
        i4.setLoading(true);
        addView(i4, nme.t(-1, 48, 7, 0, 16, 0, 16));
    }

    @Override // jja
    public final void g() {
        int i;
        if (this.s >= 0) {
            i = ((d) this.w).currentAccount;
            ConnectionsManager.getInstance(i).cancelRequest(this.s, true);
            this.s = -1;
        }
        this.f = false;
        this.b.setLoading(false);
    }

    @Override // jja
    public final void m(Bundle bundle, boolean z) {
        String string;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        String str5;
        String str6;
        int i2;
        this.d = bundle;
        String i0 = k96.i0(2131750504, bundle == null ? null : bundle.getString("country"));
        if (bundle == null) {
            str = i0;
            str2 = null;
            str4 = null;
            string = null;
            str3 = null;
            str6 = null;
            str5 = null;
            i = 0;
            j = 0;
        } else {
            String string2 = bundle.getString("product");
            string = bundle.getString("phoneFormated");
            String string3 = bundle.getString("phoneHash");
            String string4 = bundle.getString("support_email_email");
            String string5 = bundle.getString("support_email_subject");
            String string6 = bundle.getString("currency");
            long j2 = bundle.getLong("amount");
            i = bundle.getInt("premium_days");
            str = i0;
            str2 = string4;
            str3 = string2;
            str4 = string5;
            j = j2;
            str5 = string6;
            str6 = string3;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        q64[] q64VarArr = this.c;
        if (isEmpty) {
            q64VarArr[0].c.setText(k96.M0(2131745790, null));
            i2 = 0;
        } else {
            i2 = 0;
            q64VarArr[0].c.setText(k96.a0(null, null, 2131745789, str));
        }
        q64VarArr[2].setSubtitle(i == 7 ? k96.M0(2131745785, null) : k96.H(',', "SMSFee3TextDays", i));
        this.a.setOnClickListener(new ee((Object) this, (Object) str2, (Object) str4, (Object) string, (byte) 12));
        u41 u41Var = this.b;
        u41Var.setEnabled(true);
        u41Var.setOnClickListener(null);
        if (!w01.b()) {
            int i3 = i2;
            int i4 = i;
            String str7 = str6;
            if (TextUtils.isEmpty(str3)) {
                u41Var.setVisibility(8);
                return;
            }
            u41Var.setVisibility(i3);
            u41Var.setLoading(true);
            i57 i57Var = new i57((Object) this, (Object) str3, (Object) str7, (Object) string, i4, (byte) 19);
            if (ci0.h().j()) {
                i57Var.run();
                return;
            } else {
                ci0.h().i.add(i57Var);
                return;
            }
        }
        if (TextUtils.isEmpty(str5) || j <= 0) {
            boolean z2 = i2;
            u41Var.setVisibility(z2 ? 1 : 0);
            u41Var.setLoading(z2);
            u41Var.setEnabled(z2);
            u41Var.i(k96.M0(2131743674, null), z2, true);
            return;
        }
        boolean z3 = i2;
        u41Var.setVisibility(z3 ? 1 : 0);
        u41Var.setLoading(z3);
        Object[] objArr = new Object[1];
        objArr[z3 ? 1 : 0] = ci0.h().e(j, str5);
        u41Var.i(k96.a0(null, null, 2131745775, objArr), z3, true);
        u41Var.g(i == 7 ? k96.M0(2131745779, null) : k96.H(',', "SMSFeePurchaseTextDays", i), z3);
        u41Var.setOnClickListener(new qr0(this, str5, j, str6, string, i));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:0|1|2|3|4|(1:6)(1:91)|7|8|(1:10)(1:90)|11|12|13|14|(1:16)(1:87)|(1:86)|(1:83)|(3:24|(4:27|(5:29|30|(1:32)(1:36)|33|34)(1:37)|35|25)|38)|40|41|(4:74|75|(1:77)(1:80)|78)(1:43)|44|45|46|(2:48|(11:50|51|52|53|(1:55)|56|(1:68)(1:60)|61|(1:63)|64|66))|72|51|52|53|(0)|56|(1:58)|68|61|(0)|64|66|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0248 A[Catch: Exception -> 0x027c, TryCatch #2 {Exception -> 0x027c, blocks: (B:3:0x0005, B:6:0x004d, B:7:0x005e, B:10:0x0066, B:11:0x006f, B:40:0x0173, B:44:0x01b7, B:51:0x01d9, B:56:0x01f5, B:60:0x0214, B:61:0x021f, B:63:0x0248, B:64:0x0255, B:43:0x01b4, B:82:0x01b0, B:89:0x0170, B:90:0x006a, B:91:0x0055, B:75:0x017b, B:77:0x0199, B:80:0x01ab, B:14:0x00bc, B:16:0x00c8, B:18:0x00d0, B:21:0x00e0, B:24:0x00ec, B:25:0x00f0, B:27:0x00f6, B:30:0x0106, B:33:0x0166, B:36:0x0162, B:83:0x00e6, B:86:0x00da), top: B:2:0x0005, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(String str, String str2, String str3) {
        boolean z;
        int i;
        String str4;
        WifiManager wifiManager;
        try {
            boolean z2 = false;
            PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
            Locale locale = Locale.US;
            String str5 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            if (TextUtils.isEmpty(str)) {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            } else {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            }
            if (TextUtils.isEmpty(str2)) {
                intent.putExtra("android.intent.extra.SUBJECT", "Android Registration/Login Billing Issue #billing_issue");
            } else {
                intent.putExtra("android.intent.extra.SUBJECT", str2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb.append("Device: ");
            sb.append(Build.MANUFACTURER);
            sb.append(" ");
            sb.append(Build.MODEL);
            sb.append("\n");
            sb.append("OS version: SDK ");
            int i2 = Build.VERSION.SDK_INT;
            sb.append(i2);
            sb.append("\n");
            sb.append("Locale: ");
            sb.append(Locale.getDefault());
            sb.append("\n");
            sb.append("\n");
            sb.append("Target Phone: +");
            sb.append(str3);
            sb.append("\n");
            sb.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(getContext());
                List<SubscriptionInfo> completeActiveSubscriptionInfoList = i2 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i2 >= 28) {
                    completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                    completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList != null) {
                    for (SubscriptionInfo subscriptionInfo : completeActiveSubscriptionInfoList) {
                        String number = subscriptionInfo.getNumber();
                        if (!TextUtils.isEmpty(number)) {
                            String str6 = "SIM" + subscriptionInfo.getSimSlotIndex();
                            sb.append(str6);
                            sb.append(".Phone: ");
                            sb.append(number);
                            sb.append("\n");
                            sb.append(str6);
                            sb.append(".MCC: ");
                            sb.append(subscriptionInfo.getMcc());
                            sb.append("\n");
                            sb.append(str6);
                            sb.append(".MNC: ");
                            sb.append(subscriptionInfo.getMnc());
                            sb.append("\n");
                            sb.append(str6);
                            sb.append(".Carrier: ");
                            sb.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
                            sb.append("\n\n");
                        }
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) getContext().getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        sb.append("Signal: ");
                        sb.append(signalStrength.getLevel());
                        sb.append("/4\n");
                    } else {
                        sb.append("Signal: unknown\n");
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            } else {
                sb.append("Signal: unknown\n");
            }
            sb.append("Wi-Fi: ");
            Context context = getContext();
            Typeface typeface = gl.a;
            try {
                wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            } catch (Exception unused) {
            }
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    z = true;
                    sb.append(z);
                    sb.append("\n");
                    sb.append("Airplane Mode: ");
                    if (Settings.Global.getInt(getContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
                        z2 = true;
                    }
                    sb.append(z2);
                    sb.append("\n");
                    sb.append("\n");
                    sb.append("App: ");
                    sb.append((int) w01.d);
                    sb.append("\n");
                    i = packageInfo.versionCode % 10;
                    if (i != 1 || i == 2) {
                        str4 = "store";
                    } else {
                        a.t();
                        a.m();
                        str4 = "beta";
                    }
                    sb.append("App version: ");
                    sb.append(str5);
                    sb.append(" ");
                    sb.append(str4);
                    sb.append("\n");
                    sb.append("\n");
                    sb.append("Issue: ");
                    sb.append("billing_issue");
                    sb.append("\n");
                    if (!TextUtils.isEmpty(this.e)) {
                        sb.append("Error: ");
                        sb.append(this.e);
                        sb.append("\n");
                    }
                    sb.append("\n\n================================================\n");
                    sb.append("WRITE YOUR COMMENT HERE:\n");
                    sb.append("\n");
                    sb.append("\n");
                    intent.putExtra("android.intent.extra.TEXT", sb.toString());
                    getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                }
            }
            z = false;
            sb.append(z);
            sb.append("\n");
            sb.append("Airplane Mode: ");
            if (Settings.Global.getInt(getContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
            }
            sb.append(z2);
            sb.append("\n");
            sb.append("\n");
            sb.append("App: ");
            sb.append((int) w01.d);
            sb.append("\n");
            i = packageInfo.versionCode % 10;
            if (i != 1) {
            }
            str4 = "store";
            sb.append("App version: ");
            sb.append(str5);
            sb.append(" ");
            sb.append(str4);
            sb.append("\n");
            sb.append("\n");
            sb.append("Issue: ");
            sb.append("billing_issue");
            sb.append("\n");
            if (!TextUtils.isEmpty(this.e)) {
            }
            sb.append("\n\n================================================\n");
            sb.append("WRITE YOUR COMMENT HERE:\n");
            sb.append("\n");
            sb.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
            getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused2) {
            this.w.y1(k96.M0(R.string.AppName, null), k96.M0(2131748007, "NoMailInstalled"));
        }
    }

    public final void o() {
        int i;
        if (this.f) {
            TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
            tL_checkPaidAuth.form_id = this.r;
            tL_checkPaidAuth.phone_number = this.h;
            tL_checkPaidAuth.phone_code_hash = this.n;
            i = ((d) this.w).currentAccount;
            this.s = ConnectionsManager.getInstance(i).sendRequest(tL_checkPaidAuth, new n35(this, (byte) 8), 1096);
        }
    }
}
