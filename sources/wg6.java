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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wg6 extends kla {
    public final ImageView a;
    public final b61 b;
    public final z74[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final /* synthetic */ mh6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg6(mh6 mh6Var, Context context) {
        super(context);
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        ylb ylbVar4;
        this.w = mh6Var;
        z74[] z74VarArr = {r4, r4, r4};
        this.c = z74VarArr;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, gm.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, qoe.o(-1, nm7.d3));
        ub ubVar = new ub(context, (byte) 4);
        frameLayout.addView(ubVar, qoe.e(-1, nm7.d3, nm7.D1));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i = cmb.F6;
        ylbVar = ((d) mh6Var).resourceProvider;
        anb.s(imageView, i, ylbVar, PorterDuff.Mode.SRC_IN);
        int i2 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.w0(null, i2, false), 1, -1);
        wmb M = anb.M(i2);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, null);
        frameLayout.addView(imageView, qoe.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        w94 w94Var = new w94(context, 1, 1, (byte) 2);
        w94Var.setStarParticlesView(ubVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i3 = cmb.Ck;
        canvas.drawColor(on2.f(0.5f, cmb.w0(null, i3, false), cmb.w0(null, cmb.g5, false)));
        w94Var.setBackgroundBitmap(createBitmap);
        vs4 vs4Var = w94Var.b;
        vs4Var.z = i3;
        vs4Var.A = cmb.Bk;
        vs4Var.b();
        frameLayout.addView(w94Var, qoe.e(nm7.p2, nm7.p2, 1));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131745700, null));
        td4.x(textView, i, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, qoe.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        ylbVar2 = ((d) mh6Var).resourceProvider;
        z74 z74Var = new z74(1, ylbVar2, context);
        z74Var.a(R.drawable.menu_high_price, jb6.M0(2131745714, null), jb6.M0(2131745716, null));
        addView(z74VarArr[0], qoe.t(-1, -2, 55, 0, 0, 0, 6));
        ylbVar3 = ((d) mh6Var).resourceProvider;
        z74 z74Var2 = new z74(1, ylbVar3, context);
        z74Var2.a(R.drawable.menu_feature_code, jb6.M0(2131745712, null), jb6.M0(2131745713, null));
        addView(z74VarArr[1], qoe.t(-1, -2, 55, 0, 0, 0, 6));
        ylbVar4 = ((d) mh6Var).resourceProvider;
        z74 z74Var3 = new z74(1, ylbVar4, context);
        z74Var3.a(R.drawable.menu_feature_hands, gm.E2(gm.N2(jb6.M0(2131745707, null), -1, 0, new sg6(this, (byte) 1), null), true, gm.L(2.6666667f), gm.L(1.0f)), jb6.M0(2131745711, null));
        addView(z74VarArr[2], qoe.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), qoe.p(0, 0, 1.0f, nm7.D1));
        b61 i4 = mlb.i(24, null, context, true);
        this.b = i4;
        i4.setLoading(true);
        addView(i4, qoe.t(-1, 48, 7, 0, 16, 0, 16));
    }

    @Override // kla
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

    @Override // kla
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
        String i0 = jb6.i0(2131750453, bundle == null ? null : bundle.getString("country"));
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
        z74[] z74VarArr = this.c;
        if (isEmpty) {
            z74VarArr[0].c.setText(jb6.M0(2131745716, null));
            i2 = 0;
        } else {
            i2 = 0;
            z74VarArr[0].c.setText(jb6.a0(null, null, 2131745715, str));
        }
        z74VarArr[2].setSubtitle(i == 7 ? jb6.M0(2131745711, null) : jb6.H(',', "SMSFee3TextDays", i));
        this.a.setOnClickListener(new ef((Object) this, (Object) str2, (Object) str4, (Object) string, (byte) 12));
        b61 b61Var = this.b;
        b61Var.setEnabled(true);
        b61Var.setOnClickListener(null);
        if (!e21.b()) {
            int i3 = i2;
            int i4 = i;
            String str7 = str6;
            if (TextUtils.isEmpty(str3)) {
                b61Var.setVisibility(8);
                return;
            }
            b61Var.setVisibility(i3);
            b61Var.setLoading(true);
            i77 i77Var = new i77((Object) this, (Object) str3, (Object) str7, (Object) string, i4, (byte) 20);
            if (cj0.h().j()) {
                i77Var.run();
                return;
            } else {
                cj0.h().i.add(i77Var);
                return;
            }
        }
        if (TextUtils.isEmpty(str5) || j <= 0) {
            boolean z2 = i2;
            b61Var.setVisibility(z2 ? 1 : 0);
            b61Var.setLoading(z2);
            b61Var.setEnabled(z2);
            b61Var.i(jb6.M0(2131743600, null), z2, true);
            return;
        }
        boolean z3 = i2;
        b61Var.setVisibility(z3 ? 1 : 0);
        b61Var.setLoading(z3);
        Object[] objArr = new Object[1];
        objArr[z3 ? 1 : 0] = cj0.h().e(j, str5);
        b61Var.i(jb6.a0(null, null, 2131745701, objArr), z3, true);
        b61Var.g(i == 7 ? jb6.M0(2131745705, null) : jb6.H(',', "SMSFeePurchaseTextDays", i), z3);
        b61Var.setOnClickListener(new ys0(this, str5, j, str6, string, i));
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
                fc4.g(e, true);
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
                    fc4.g(e2, true);
                }
            } else {
                sb.append("Signal: unknown\n");
            }
            sb.append("Wi-Fi: ");
            Context context = getContext();
            Typeface typeface = gm.a;
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
                    sb.append((int) e21.d);
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
            sb.append((int) e21.d);
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
            this.w.z1(jb6.M0(R.string.AppName, null), jb6.M0(2131747933, "NoMailInstalled"));
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
            this.s = ConnectionsManager.getInstance(i).sendRequest(tL_checkPaidAuth, new r15(this, (byte) 9), 1096);
        }
    }
}
