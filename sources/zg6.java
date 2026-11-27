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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zg6 extends cna {
    public final ImageView a;
    public final c51 b;
    public final k74[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final /* synthetic */ qh6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg6(qh6 qh6Var, Context context) {
        super(context);
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        vnb vnbVar4;
        this.w = qh6Var;
        k74[] k74VarArr = {r4, r4, r4};
        this.c = k74VarArr;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, hl.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, tre.o(-1, jn7.d3));
        vb vbVar = new vb(context, (byte) 4);
        frameLayout.addView(vbVar, tre.e(-1, jn7.d3, jn7.D1));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i = aob.G6;
        vnbVar = ((e) qh6Var).resourceProvider;
        yob.s(imageView, i, vnbVar, PorterDuff.Mode.SRC_IN);
        int i2 = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i2, false), 1, -1);
        uob M = yob.M(i2);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        frameLayout.addView(imageView, tre.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        i94 i94Var = new i94(context, 1, 1, (byte) 2);
        i94Var.setStarParticlesView(vbVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i3 = aob.Dk;
        canvas.drawColor(vm2.f(0.5f, aob.w0(null, i3, false), aob.w0(null, aob.h5, false)));
        i94Var.setBackgroundBitmap(createBitmap);
        ys4 ys4Var = i94Var.b;
        ys4Var.z = i3;
        ys4Var.A = aob.Ck;
        ys4Var.b();
        frameLayout.addView(i94Var, tre.e(jn7.p2, jn7.p2, 1));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131745694, null));
        qd4.w(textView, i, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, tre.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        vnbVar2 = ((e) qh6Var).resourceProvider;
        k74 k74Var = new k74(1, vnbVar2, context);
        k74Var.a(R.drawable.menu_high_price, ob6.M0(2131745708, null), ob6.M0(2131745710, null));
        addView(k74VarArr[0], tre.t(-1, -2, 55, 0, 0, 0, 6));
        vnbVar3 = ((e) qh6Var).resourceProvider;
        k74 k74Var2 = new k74(1, vnbVar3, context);
        k74Var2.a(R.drawable.menu_feature_code, ob6.M0(2131745706, null), ob6.M0(2131745707, null));
        addView(k74VarArr[1], tre.t(-1, -2, 55, 0, 0, 0, 6));
        vnbVar4 = ((e) qh6Var).resourceProvider;
        k74 k74Var3 = new k74(1, vnbVar4, context);
        k74Var3.a(R.drawable.menu_feature_hands, hl.E2(hl.N2(ob6.M0(2131745701, null), -1, 0, new ug6(this, (byte) 1), null), true, hl.L(2.6666667f), hl.L(1.0f)), ob6.M0(2131745705, null));
        addView(k74VarArr[2], tre.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), tre.p(0, 0, 1.0f, jn7.D1));
        c51 i4 = xnb.i(24, null, context, true);
        this.b = i4;
        i4.setLoading(true);
        addView(i4, tre.t(-1, 48, 7, 0, 16, 0, 16));
    }

    @Override // cna
    public final void g() {
        int i;
        if (this.s >= 0) {
            i = ((e) this.w).currentAccount;
            ConnectionsManager.getInstance(i).cancelRequest(this.s, true);
            this.s = -1;
        }
        this.f = false;
        this.b.setLoading(false);
    }

    @Override // cna
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
        String i0 = ob6.i0(2131750481, bundle == null ? null : bundle.getString("country"));
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
        k74[] k74VarArr = this.c;
        if (isEmpty) {
            k74VarArr[0].c.setText(ob6.M0(2131745710, null));
            i2 = 0;
        } else {
            i2 = 0;
            k74VarArr[0].c.setText(ob6.a0(null, null, 2131745709, str));
        }
        k74VarArr[2].setSubtitle(i == 7 ? ob6.M0(2131745705, null) : ob6.H(',', "SMSFee3TextDays", i));
        this.a.setOnClickListener(new cg((Object) this, (Object) str2, (Object) str4, (Object) string, (byte) 12));
        c51 c51Var = this.b;
        c51Var.setEnabled(true);
        c51Var.setOnClickListener(null);
        if (!f11.b()) {
            int i3 = i2;
            int i4 = i;
            String str7 = str6;
            if (TextUtils.isEmpty(str3)) {
                c51Var.setVisibility(8);
                return;
            }
            c51Var.setVisibility(i3);
            c51Var.setLoading(true);
            l77 l77Var = new l77((Object) this, (Object) str3, (Object) str7, (Object) string, i4, (byte) 20);
            if (di0.h().j()) {
                l77Var.run();
                return;
            } else {
                di0.h().i.add(l77Var);
                return;
            }
        }
        if (TextUtils.isEmpty(str5) || j <= 0) {
            boolean z2 = i2;
            c51Var.setVisibility(z2 ? 1 : 0);
            c51Var.setLoading(z2);
            c51Var.setEnabled(z2);
            c51Var.i(ob6.M0(2131743568, null), z2, true);
            return;
        }
        boolean z3 = i2;
        c51Var.setVisibility(z3 ? 1 : 0);
        c51Var.setLoading(z3);
        Object[] objArr = new Object[1];
        objArr[z3 ? 1 : 0] = di0.h().e(j, str5);
        c51Var.i(ob6.a0(null, null, 2131745695, objArr), z3, true);
        c51Var.g(i == 7 ? ob6.M0(2131745699, null) : ob6.H(',', "SMSFeePurchaseTextDays", i), z3);
        c51Var.setOnClickListener(new yr0(this, str5, j, str6, string, i));
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
                cc4.g(e, true);
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
                    cc4.g(e2, true);
                }
            } else {
                sb.append("Signal: unknown\n");
            }
            sb.append("Wi-Fi: ");
            Context context = getContext();
            Typeface typeface = hl.a;
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
                    sb.append((int) f11.d);
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
            sb.append((int) f11.d);
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
            this.w.z1(ob6.M0(R.string.AppName, null), ob6.M0(2131747930, "NoMailInstalled"));
        }
    }

    public final void o() {
        int i;
        if (this.f) {
            TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
            tL_checkPaidAuth.form_id = this.r;
            tL_checkPaidAuth.phone_number = this.h;
            tL_checkPaidAuth.phone_code_hash = this.n;
            i = ((e) this.w).currentAccount;
            this.s = ConnectionsManager.getInstance(i).sendRequest(tL_checkPaidAuth, new w15(this, (byte) 9), 1096);
        }
    }
}
