package org.telegram.ui;

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class se0 extends org.telegram.ui.Components.zu0 {
    public final ImageView a;
    public final vh.d b;
    public final rh.v[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final /* synthetic */ hf0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se0(hf0 hf0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        org.telegram.ui.ActionBar.p6 p6Var4;
        this.w = hf0Var;
        rh.v[] vVarArr = {r3, r3, r3};
        this.c = vVarArr;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, org.telegram.messenger.i0.L(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.b6.o(-1, org.telegram.messenger.zs.e3));
        kg.g gVar = new kg.g(context, 3);
        frameLayout.addView(gVar, w7.b6.e(-1, org.telegram.messenger.zs.e3, org.telegram.messenger.zs.E1));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        p6Var = ((org.telegram.ui.ActionBar.k2) hf0Var).resourceProvider;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        frameLayout.addView(imageView, w7.b6.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        kg.h hVar = new kg.h(context, 1, 1, 3);
        hVar.setStarParticlesView(gVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i12 = org.telegram.ui.ActionBar.t6.Ak;
        canvas.drawColor(i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, i12, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false)));
        hVar.setBackgroundBitmap(createBitmap);
        lg.h hVar2 = hVar.b;
        hVar2.z = i12;
        hVar2.A = org.telegram.ui.ActionBar.t6.zk;
        hVar2.b();
        frameLayout.addView(hVar, w7.b6.e(org.telegram.messenger.zs.q2, org.telegram.messenger.zs.q2, 1));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.cd.L0(2131745983, null));
        org.telegram.messenger.m5.m(textView, i10, null, 1, 20.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        p6Var2 = ((org.telegram.ui.ActionBar.k2) hf0Var).resourceProvider;
        rh.v vVar = new rh.v(1, context, p6Var2);
        vVar.a(R.drawable.menu_high_price, org.telegram.messenger.cd.L0(2131745997, null), org.telegram.messenger.cd.L0(2131745999, null));
        addView(vVarArr[0], w7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        p6Var3 = ((org.telegram.ui.ActionBar.k2) hf0Var).resourceProvider;
        rh.v vVar2 = new rh.v(1, context, p6Var3);
        vVar2.a(R.drawable.menu_feature_code, org.telegram.messenger.cd.L0(2131745995, null), org.telegram.messenger.cd.L0(2131745996, null));
        addView(vVarArr[1], w7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        p6Var4 = ((org.telegram.ui.ActionBar.k2) hf0Var).resourceProvider;
        rh.v vVar3 = new rh.v(1, context, p6Var4);
        vVar3.a(R.drawable.menu_feature_hands, org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131745990, null), new ne0(this, 1)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)), org.telegram.messenger.cd.L0(2131745994, null));
        addView(vVarArr[2], w7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), w7.b6.p(0, 0, 1.0f, org.telegram.messenger.zs.E1));
        vh.d i13 = org.telegram.messenger.z20.i(24, context, null, true);
        this.b = i13;
        i13.setLoading(true);
        addView(i13, w7.b6.t(-1, 48, 7, 0, 16, 0, 16));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:0|1|2|3|4|(1:6)(1:93)|7|8|(1:10)(1:92)|11|12|13|14|(1:16)(1:88)|(1:87)|(1:84)|(3:24|(4:27|(5:29|30|(1:32)(1:36)|33|34)(1:37)|35|25)|38)|40|41|(4:74|75|(1:77)(1:80)|78)(1:43)|44|45|46|(2:48|(11:50|51|52|53|(1:55)|56|(1:68)(1:60)|61|(1:63)|64|66))|72|51|52|53|(0)|56|(1:58)|68|61|(0)|64|66|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024b A[Catch: Exception -> 0x027f, TryCatch #0 {Exception -> 0x027f, blocks: (B:3:0x0005, B:6:0x004d, B:7:0x005e, B:10:0x0066, B:11:0x006f, B:40:0x0175, B:44:0x01ba, B:51:0x01dc, B:56:0x01f8, B:60:0x0217, B:61:0x0222, B:63:0x024b, B:64:0x0258, B:43:0x01b7, B:83:0x01b3, B:91:0x0172, B:92:0x006a, B:93:0x0055, B:75:0x017d, B:77:0x019b, B:80:0x01af, B:14:0x00bc, B:16:0x00c8, B:18:0x00d3, B:21:0x00e3, B:24:0x00ef, B:25:0x00f3, B:27:0x00f9, B:30:0x0109, B:33:0x0169, B:36:0x0165, B:84:0x00e9, B:87:0x00dd), top: B:2:0x0005, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(se0 se0Var, String str, String str2, String str3) {
        boolean z10;
        int i10;
        String str4;
        WifiManager wifiManager;
        try {
            boolean z11 = false;
            PackageInfo packageInfo = org.telegram.messenger.w0.b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.b.getPackageName(), 0);
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
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb2.append("Device: ");
            sb2.append(Build.MANUFACTURER);
            sb2.append(" ");
            sb2.append(Build.MODEL);
            sb2.append("\n");
            sb2.append("OS version: SDK ");
            int i11 = Build.VERSION.SDK_INT;
            sb2.append(i11);
            sb2.append("\n");
            sb2.append("Locale: ");
            sb2.append(Locale.getDefault());
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Target Phone: +");
            sb2.append(str3);
            sb2.append("\n");
            sb2.append("\n");
            try {
                SubscriptionManager from = SubscriptionManager.from(se0Var.getContext());
                List<SubscriptionInfo> completeActiveSubscriptionInfoList = i11 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i11 >= 28) {
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
                            sb2.append(str6);
                            sb2.append(".Phone: ");
                            sb2.append(number);
                            sb2.append("\n");
                            sb2.append(str6);
                            sb2.append(".MCC: ");
                            sb2.append(subscriptionInfo.getMcc());
                            sb2.append("\n");
                            sb2.append(str6);
                            sb2.append(".MNC: ");
                            sb2.append(subscriptionInfo.getMnc());
                            sb2.append("\n");
                            sb2.append(str6);
                            sb2.append(".Carrier: ");
                            sb2.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
                            sb2.append("\n\n");
                        }
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) se0Var.getContext().getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        sb2.append("Signal: ");
                        sb2.append(signalStrength.getLevel());
                        sb2.append("/4\n");
                    } else {
                        sb2.append("Signal: unknown\n");
                    }
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            } else {
                sb2.append("Signal: unknown\n");
            }
            sb2.append("Wi-Fi: ");
            Context context = se0Var.getContext();
            Typeface typeface = org.telegram.messenger.i0.a;
            try {
                wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            } catch (Exception unused) {
            }
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    z10 = true;
                    sb2.append(z10);
                    sb2.append("\n");
                    sb2.append("Airplane Mode: ");
                    if (Settings.Global.getInt(se0Var.getContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
                        z11 = true;
                    }
                    sb2.append(z11);
                    sb2.append("\n");
                    sb2.append("\n");
                    sb2.append("App: ");
                    sb2.append(org.telegram.messenger.v2.d);
                    sb2.append("\n");
                    i10 = packageInfo.versionCode % 10;
                    if (i10 != 1 || i10 == 2) {
                        str4 = "store";
                    } else {
                        org.telegram.messenger.w0.u();
                        org.telegram.messenger.w0.n();
                        str4 = "beta";
                    }
                    sb2.append("App version: ");
                    sb2.append(str5);
                    sb2.append(" ");
                    sb2.append(str4);
                    sb2.append("\n");
                    sb2.append("\n");
                    sb2.append("Issue: ");
                    sb2.append("billing_issue");
                    sb2.append("\n");
                    if (!TextUtils.isEmpty(se0Var.e)) {
                        sb2.append("Error: ");
                        sb2.append(se0Var.e);
                        sb2.append("\n");
                    }
                    sb2.append("\n\n================================================\n");
                    sb2.append("WRITE YOUR COMMENT HERE:\n");
                    sb2.append("\n");
                    sb2.append("\n");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    se0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                }
            }
            z10 = false;
            sb2.append(z10);
            sb2.append("\n");
            sb2.append("Airplane Mode: ");
            if (Settings.Global.getInt(se0Var.getContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
            }
            sb2.append(z11);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("App: ");
            sb2.append(org.telegram.messenger.v2.d);
            sb2.append("\n");
            i10 = packageInfo.versionCode % 10;
            if (i10 != 1) {
            }
            str4 = "store";
            sb2.append("App version: ");
            sb2.append(str5);
            sb2.append(" ");
            sb2.append(str4);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Issue: ");
            sb2.append("billing_issue");
            sb2.append("\n");
            if (!TextUtils.isEmpty(se0Var.e)) {
            }
            sb2.append("\n\n================================================\n");
            sb2.append("WRITE YOUR COMMENT HERE:\n");
            sb2.append("\n");
            sb2.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            se0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused2) {
            se0Var.w.t1(org.telegram.messenger.cd.L0(R.string.AppName, null), org.telegram.messenger.cd.L0(2131748216, "NoMailInstalled"));
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void g() {
        int i10;
        if (this.s >= 0) {
            i10 = ((org.telegram.ui.ActionBar.k2) this.w).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(this.s, true);
            this.s = -1;
        }
        this.f = false;
        this.b.setLoading(false);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        this.d = bundle;
        String i02 = org.telegram.messenger.cd.i0(2131750530, bundle == null ? null : bundle.getString("country"));
        String string = bundle == null ? null : bundle.getString("product");
        String string2 = bundle == null ? null : bundle.getString("phoneFormated");
        String string3 = bundle == null ? null : bundle.getString("phoneHash");
        String string4 = bundle == null ? null : bundle.getString("support_email_email");
        String string5 = bundle == null ? null : bundle.getString("support_email_subject");
        String string6 = bundle == null ? null : bundle.getString("currency");
        long j10 = bundle == null ? 0L : bundle.getLong("amount");
        int i11 = bundle == null ? 0 : bundle.getInt("premium_days");
        boolean isEmpty = TextUtils.isEmpty(i02);
        rh.v[] vVarArr = this.c;
        if (isEmpty) {
            vVarArr[0].c.setText(org.telegram.messenger.cd.L0(2131745999, null));
            i10 = 0;
        } else {
            i10 = 0;
            vVarArr[0].c.setText(org.telegram.messenger.cd.a0(null, null, 2131745998, i02));
        }
        vVarArr[2].setSubtitle(i11 == 7 ? org.telegram.messenger.cd.L0(2131745994, null) : org.telegram.messenger.cd.H(',', "SMSFee3TextDays", i11));
        this.a.setOnClickListener(new org.telegram.messenger.video.h(this, string4, string5, string2, 10));
        vh.d dVar = this.b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (!org.telegram.messenger.v2.b()) {
            int i12 = i10;
            String str = string3;
            int i13 = i11;
            if (TextUtils.isEmpty(string)) {
                dVar.setVisibility(8);
                return;
            }
            dVar.setVisibility(i12);
            dVar.setLoading(true);
            i2.g1 g1Var = new i2.g1(this, string, str, string2, i13, 18);
            if (org.telegram.messenger.u1.i().k()) {
                g1Var.run();
                return;
            } else {
                org.telegram.messenger.u1.i().i.add(g1Var);
                return;
            }
        }
        if (TextUtils.isEmpty(string6) || j10 <= 0) {
            boolean z11 = i10;
            dVar.setVisibility(z11 ? 1 : 0);
            dVar.setLoading(z11);
            dVar.setEnabled(z11);
            dVar.i(org.telegram.messenger.cd.L0(2131743938, null), z11, true);
            return;
        }
        boolean z12 = i10;
        dVar.setVisibility(z12 ? 1 : 0);
        dVar.setLoading(z12);
        Object[] objArr = new Object[1];
        objArr[z12 ? 1 : 0] = org.telegram.messenger.u1.i().f(j10, string6);
        dVar.i(org.telegram.messenger.cd.a0(null, null, 2131745984, objArr), z12, true);
        dVar.g(i11 == 7 ? org.telegram.messenger.cd.L0(2131745988, null) : org.telegram.messenger.cd.H(',', "SMSFeePurchaseTextDays", i11), z12);
        dVar.setOnClickListener(new oe0(this, string6, j10, string3, string2, i11));
    }

    public final void o() {
        int i10;
        if (this.f) {
            TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
            tL_checkPaidAuth.form_id = this.r;
            tL_checkPaidAuth.phone_number = this.h;
            tL_checkPaidAuth.phone_code_hash = this.n;
            i10 = ((org.telegram.ui.ActionBar.k2) this.w).currentAccount;
            this.s = ConnectionsManager.getInstance(i10).sendRequest(tL_checkPaidAuth, new k(this, 15), 1096);
        }
    }
}
