package sg;

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
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eg1;
import org.telegram.ui.jp0;
import org.telegram.ui.oy;
import org.telegram.ui.ug1;
import org.telegram.ui.uy;
import org.telegram.ui.wo0;
import yh.e4;
import yh.f4;
import yh.m2;
import yh.p2;
import zh.j2;
import zh.w3;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements org.telegram.ui.ActionBar.a2, c3.r, wo0, oy, androidx.car.app.utils.d, q9.d, j2, Utilities.Callback5, al0, ug1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean B() {
        switch (this.a) {
        }
        return false;
    }

    @Override // q9.d
    public Object D(cf.c cVar) {
        String valueOf;
        String str = (String) this.b;
        j2.e eVar = (j2.e) this.c;
        Context context = (Context) cVar.a(Context.class);
        switch (eVar.a) {
            case 12:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 13:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 14:
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

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(uy uyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.wo0
    public void a(int i10) {
        switch (this.a) {
            case 4:
                ug.w wVar = (ug.w) this.b;
                ug.w wVar2 = (ug.w) this.c;
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

    @Override // zh.j2
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        m2 m2Var = (m2) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        nr0 nr0Var = m2Var.a;
        m2Var.e.l.remove(savedStarGift);
        m2Var.f(true);
        int i10 = m2Var.b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            yc a02 = yc.a0(nr0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            qc O = a02.O(document, string, LocaleController.formatString(i11, i2.g.k(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            qc O2 = yc.a0(nr0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.x0.c(true);
        }
    }

    @Override // c3.r
    public c3.o[] c(Uri uri, Map map) {
        u2.p pVar = (u2.p) this.b;
        b2.s sVar = (b2.s) this.c;
        return new c3.o[]{pVar.c.i0(sVar) ? new z3.h(pVar.c.v(sVar), null) : new k3.a(sVar)};
    }

    @Override // androidx.car.app.utils.d
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i10 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // org.telegram.ui.Components.al0
    public void d(float f7, float f10, int i10, View view) {
        f4.Q((f4) this.b, (e4) this.c, i10);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ug1
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 15:
                ((zh.g) this.b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
            default:
                ((w3) this.b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                k0.Q((k0) this.b, (ArrayList) this.c);
                break;
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                ug.u0 u0Var = (ug.u0) this.c;
                atomicBoolean.set(true);
                u0Var.run();
                break;
            case 3:
                ((ug.w) this.b).run((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
            case 10:
                yh.m mVar = (yh.m) this.b;
                b6 b6Var = (b6) this.c;
                try {
                    int parseInt = Integer.parseInt(b6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.c0.setValue(parseInt);
                    b2Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(b6Var);
                    FileLog.e(th2);
                    return;
                }
            case 11:
                yh.y1 y1Var = (yh.y1) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String obj = y1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    b2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(y1Var);
                    break;
                }
                break;
            default:
                w3 w3Var = (w3) this.b;
                ug.n1[] n1VarArr = (ug.n1[]) this.c;
                of.e g10 = b2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                x xVar = new x(17, w3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.b0 = xVar;
                twoStepVerificationActivity.a0 = w3Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new wh.n(w3Var, n1VarArr, g10, twoStepVerificationActivity, 11));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        p2 p2Var = (p2) this.b;
        di.d dVar = (di.d) this.c;
        View view = (View) obj2;
        p2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((h51) obj).G).gift.id;
        if (p2Var.b == j3) {
            p2Var.b = 0L;
        } else {
            p2Var.b = j3;
        }
        dVar.setEnabled(p2Var.b != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof jp0) {
                    jp0 jp0Var = (jp0) childAt;
                    jp0Var.b(p2Var.b == jp0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        switch (this.a) {
            case 6:
                ug.h0 h0Var = (ug.h0) this.b;
                String str = (String) this.c;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    h0Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                uyVar.finishFragment();
                ug.j.h(j3);
                break;
            default:
                vg.e eVar = (vg.e) this.b;
                String str2 = (String) this.c;
                long j10 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                uyVar.finishFragment();
                ug.j.h(j10);
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
