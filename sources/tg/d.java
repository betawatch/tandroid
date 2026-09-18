package tg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fg1;
import org.telegram.ui.i61;
import org.telegram.ui.kp0;
import org.telegram.ui.qy;
import org.telegram.ui.vg1;
import org.telegram.ui.wy;
import org.telegram.ui.xo0;
import xh.f4;
import xh.g4;
import xh.n2;
import xh.q2;
import xh.z1;
import yh.a4;
import yh.m2;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements b2, xo0, qy, c3.r, androidx.car.app.utils.b, q9.d, m2, Utilities.Callback5, bl0, vg1, i61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        switch (this.a) {
        }
        return false;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        String valueOf;
        String str = (String) this.b;
        j2.e eVar = (j2.e) this.c;
        Context context = (Context) cVar.a(Context.class);
        switch (eVar.a) {
            case 13:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 14:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 15:
                int i10 = Build.VERSION.SDK_INT;
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        if (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            valueOf = "auto";
                            break;
                        } else {
                            if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                valueOf = "embedded";
                                break;
                            }
                            valueOf = "";
                            break;
                        }
                    } else {
                        valueOf = "watch";
                        break;
                    }
                } else {
                    valueOf = "tv";
                    break;
                }
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                valueOf = "";
                break;
        }
        return new xa.a(str, valueOf);
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean K(wy wyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.xo0
    public void a(int i10) {
        switch (this.a) {
            case 2:
                w wVar = (w) this.b;
                w wVar2 = (w) this.c;
                if (i10 != 1) {
                    if (i10 != 3) {
                        wVar2.run(null);
                        break;
                    }
                } else {
                    wVar.run(null);
                    break;
                }
                break;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                if (i10 != 1) {
                    if (i10 != 3) {
                        callback2.run(null);
                        break;
                    }
                } else {
                    callback.run(null);
                    break;
                }
                break;
        }
    }

    @Override // yh.m2
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        n2 n2Var = (n2) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        or0 or0Var = n2Var.a;
        n2Var.e.l.remove(savedStarGift);
        n2Var.f(true);
        int i10 = n2Var.b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            vc a02 = vc.a0(or0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            oc O = a02.O(document, string, LocaleController.formatString(i11, hg.k0.k(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            oc O2 = vc.a0(or0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.x0.c(true);
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        g4.Q((g4) this.b, (f4) this.c, i10);
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i10 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // c3.r
    public c3.o[] d(Uri uri, Map map) {
        u2.p pVar = (u2.p) this.b;
        b2.s sVar = (b2.s) this.c;
        return new c3.o[]{pVar.c.W(sVar) ? new z3.h(pVar.c.x(sVar), null) : new k3.a(sVar)};
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.vg1
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 14:
                ((yh.g) this.b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
            default:
                ((a4) this.b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                u0 u0Var = (u0) this.c;
                atomicBoolean.set(true);
                u0Var.run();
                break;
            case 1:
                ((w) this.b).run((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
            case 9:
                xh.m mVar = (xh.m) this.b;
                b6 b6Var = (b6) this.c;
                try {
                    int parseInt = Integer.parseInt(b6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.c0.setValue(parseInt);
                    c2Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(b6Var);
                    FileLog.e(th2);
                    return;
                }
            case 10:
                z1 z1Var = (z1) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String obj = z1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    c2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(z1Var);
                    break;
                }
                break;
            default:
                a4 a4Var = (a4) this.b;
                n1[] n1VarArr = (n1[]) this.c;
                nf.e g10 = c2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                d dVar = new d(16, a4Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.b0 = dVar;
                twoStepVerificationActivity.a0 = a4Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new w9.v(a4Var, n1VarArr, g10, twoStepVerificationActivity, 11));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        q2 q2Var = (q2) this.b;
        ci.d dVar = (ci.d) this.c;
        View view = (View) obj2;
        q2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((j51) obj).G).gift.id;
        if (q2Var.b == j3) {
            q2Var.b = 0L;
        } else {
            q2Var.b = j3;
        }
        dVar.setEnabled(q2Var.b != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof kp0) {
                    kp0 kp0Var = (kp0) childAt;
                    kp0Var.b(q2Var.b == kp0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.ui.qy
    public boolean u(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        switch (this.a) {
            case 4:
                h0 h0Var = (h0) this.b;
                String str = (String) this.c;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    h0Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                wyVar.finishFragment();
                k.h(j3);
                break;
            default:
                ug.e eVar = (ug.e) this.b;
                String str2 = (String) this.c;
                long j10 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                wyVar.finishFragment();
                k.h(j10);
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
