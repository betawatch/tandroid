package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wf0 extends org.telegram.ui.Components.vv0 {
    public final ImageView a;
    public final ph.d b;
    public final lh.e0[] c;
    public Bundle d;
    public String e;
    public boolean f;
    public String h;
    public String n;
    public long r;
    public int s;
    public final /* synthetic */ ng0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf0(ng0 ng0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = ng0Var;
        lh.e0[] e0VarArr = {r4, r4, r4};
        this.c = e0VarArr;
        this.s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, AndroidUtilities.dp(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, k7.b6.n(-1, 200));
        eg.h hVar = new eg.h(context, 3);
        frameLayout.addView(hVar, k7.b6.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        f6Var = ((org.telegram.ui.ActionBar.p2) ng0Var).resourceProvider;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 1, -1));
        frameLayout.addView(imageView, k7.b6.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        eg.i iVar = new eg.i(context, 1, 1, 4);
        iVar.setStarParticlesView(hVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.j6.Mj;
        canvas.drawColor(i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false)));
        iVar.setBackgroundBitmap(createBitmap);
        fg.a aVar = iVar.b;
        aVar.w = i11;
        aVar.x = org.telegram.ui.ActionBar.j6.Lj;
        aVar.b();
        frameLayout.addView(iVar, k7.b6.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SMSFeeTitle));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        f6Var2 = ((org.telegram.ui.ActionBar.p2) ng0Var).resourceProvider;
        lh.e0 e0Var = new lh.e0(context, 1, f6Var2);
        e0Var.a(LocaleController.getString(R.string.SMSFee1Title), LocaleController.getString(R.string.SMSFee1Text), R.drawable.menu_high_price);
        addView(e0VarArr[0], k7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        f6Var3 = ((org.telegram.ui.ActionBar.p2) ng0Var).resourceProvider;
        lh.e0 e0Var2 = new lh.e0(context, 1, f6Var3);
        e0Var2.a(LocaleController.getString(R.string.SMSFee2Title), LocaleController.getString(R.string.SMSFee2Text), R.drawable.menu_feature_code);
        addView(e0VarArr[1], k7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        f6Var4 = ((org.telegram.ui.ActionBar.p2) ng0Var).resourceProvider;
        lh.e0 e0Var3 = new lh.e0(context, 1, f6Var4);
        e0Var3.a(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SMSFee3Title), new tf0(this, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(R.string.SMSFee3Text), R.drawable.menu_feature_hands);
        addView(e0VarArr[2], k7.b6.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), k7.b6.o(0, 0, 1.0f, 119));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, null, true);
        this.b = p10;
        p10.setLoading(true);
        addView(p10, k7.b6.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static /* synthetic */ void o(wf0 wf0Var, String str, String str2, String str3) {
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str4 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
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
            int i10 = Build.VERSION.SDK_INT;
            sb.append(i10);
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
                if (i10 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(wf0Var.getContext());
                    List<SubscriptionInfo> completeActiveSubscriptionInfoList = i10 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
                    if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i10 >= 28) {
                        completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
                    }
                    if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                        completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                    }
                    if (completeActiveSubscriptionInfoList != null) {
                        for (SubscriptionInfo subscriptionInfo : completeActiveSubscriptionInfoList) {
                            String number = subscriptionInfo.getNumber();
                            if (!TextUtils.isEmpty(number)) {
                                String str5 = "SIM" + subscriptionInfo.getSimSlotIndex();
                                sb.append(str5);
                                sb.append(".Phone: ");
                                sb.append(number);
                                sb.append("\n");
                                sb.append(str5);
                                sb.append(".MCC: ");
                                sb.append(subscriptionInfo.getMcc());
                                sb.append("\n");
                                sb.append(str5);
                                sb.append(".MNC: ");
                                sb.append(subscriptionInfo.getMnc());
                                sb.append("\n");
                                sb.append(str5);
                                sb.append(".Carrier: ");
                                sb.append(TextUtils.isEmpty(subscriptionInfo.getCarrierName()) ? "unknown" : subscriptionInfo.getCarrierName());
                                sb.append("\n\n");
                            }
                        }
                    }
                } else {
                    try {
                        String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                        if (!TextUtils.isEmpty(line1Number)) {
                            sb.append("SIM0.Phone: ");
                            sb.append(line1Number);
                            sb.append("\n");
                            sb.append("SIM0.MCC: unknown\n");
                            sb.append("SIM0.MNC: unknown\n");
                            sb.append("SIM0.Carrier: unknown\n\n");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) wf0Var.getContext().getSystemService(TelephonyManager.class);
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    if (signalStrength != null) {
                        sb.append("Signal: ");
                        sb.append(signalStrength.getLevel());
                        sb.append("/4\n");
                    } else {
                        sb.append("Signal: unknown\n");
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                sb.append("Signal: unknown\n");
            }
            sb.append("Wi-Fi: ");
            sb.append(AndroidUtilities.isWifiEnabled(wf0Var.getContext()));
            sb.append("\n");
            sb.append("Airplane Mode: ");
            sb.append(AndroidUtilities.isInAirplaneMode(wf0Var.getContext()));
            sb.append("\n");
            sb.append("\n");
            sb.append("App: ");
            sb.append(BuildVars.APP_ID);
            sb.append("\n");
            int i11 = packageInfo.versionCode % 10;
            String str6 = (i11 == 1 || i11 == 2) ? "store" : ApplicationLoader.isStandaloneBuild() ? "direct" : ApplicationLoader.isBetaBuild() ? "beta" : ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
            sb.append("App version: ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str6);
            sb.append("\n");
            sb.append("\n");
            sb.append("Issue: ");
            sb.append("billing_issue");
            sb.append("\n");
            if (!TextUtils.isEmpty(wf0Var.e)) {
                sb.append("Error: ");
                sb.append(wf0Var.e);
                sb.append("\n");
            }
            sb.append("\n\n================================================\n");
            sb.append("WRITE YOUR COMMENT HERE:\n");
            sb.append("\n");
            sb.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
            wf0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            wf0Var.v.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    @Override // org.telegram.ui.Components.vv0
    public final void g() {
        int i10;
        if (this.s >= 0) {
            i10 = ((org.telegram.ui.ActionBar.p2) this.v).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(this.s, true);
            this.s = -1;
        }
        this.f = false;
        this.b.setLoading(false);
    }

    @Override // org.telegram.ui.Components.vv0
    public final void m(Bundle bundle, boolean z4) {
        this.d = bundle;
        String countryName = LocaleController.getCountryName(bundle == null ? null : bundle.getString("country"));
        String string = bundle == null ? null : bundle.getString("product");
        String string2 = bundle == null ? null : bundle.getString("phoneFormated");
        String string3 = bundle == null ? null : bundle.getString("phoneHash");
        String string4 = bundle == null ? null : bundle.getString("support_email_email");
        String string5 = bundle == null ? null : bundle.getString("support_email_subject");
        String string6 = bundle == null ? null : bundle.getString("currency");
        long j10 = bundle == null ? 0L : bundle.getLong("amount");
        int i10 = bundle == null ? 0 : bundle.getInt("premium_days");
        boolean isEmpty = TextUtils.isEmpty(countryName);
        lh.e0[] e0VarArr = this.c;
        if (isEmpty) {
            e0VarArr[0].c.setText(LocaleController.getString(R.string.SMSFee1Text));
        } else {
            e0VarArr[0].c.setText(LocaleController.formatString(R.string.SMSFee1TextCountry, countryName));
        }
        e0VarArr[2].setSubtitle(i10 == 7 ? LocaleController.getString(R.string.SMSFee3Text) : LocaleController.formatPluralStringComma("SMSFee3TextDays", i10));
        this.a.setOnClickListener(new kh.u3(this, string4, string5, string2, 12));
        ph.d dVar = this.b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (BuildVars.useInvoiceBilling()) {
            if (TextUtils.isEmpty(string6) || j10 <= 0) {
                dVar.setVisibility(0);
                dVar.setLoading(false);
                dVar.setEnabled(false);
                dVar.g(LocaleController.getString(R.string.Unavailable), false, true);
                return;
            }
            dVar.setVisibility(0);
            dVar.setLoading(false);
            dVar.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, BillingController.getInstance().formatCurrency(j10, string6)), false, true);
            dVar.f(i10 == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i10), false);
            dVar.setOnClickListener(new lh.p0(this, string6, j10, string3, string2, i10));
            return;
        }
        String str = string3;
        int i11 = i10;
        if (TextUtils.isEmpty(string)) {
            dVar.setVisibility(8);
            return;
        }
        dVar.setVisibility(0);
        dVar.setLoading(true);
        dg.f3 f3Var = new dg.f3(this, string, str, string2, i11, 23);
        if (BillingController.getInstance().isReady()) {
            f3Var.run();
        } else {
            BillingController.getInstance().whenSetuped(f3Var);
        }
    }

    public final void p() {
        int i10;
        if (this.f) {
            TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
            tL_checkPaidAuth.form_id = this.r;
            tL_checkPaidAuth.phone_number = this.h;
            tL_checkPaidAuth.phone_code_hash = this.n;
            i10 = ((org.telegram.ui.ActionBar.p2) this.v).currentAccount;
            this.s = ConnectionsManager.getInstance(i10).sendRequest(tL_checkPaidAuth, new o(this, 14), 1096);
        }
    }
}
