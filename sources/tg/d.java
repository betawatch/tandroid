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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cp0;
import org.telegram.ui.ly;
import org.telegram.ui.mg1;
import org.telegram.ui.po0;
import org.telegram.ui.ry;
import org.telegram.ui.wf1;
import org.telegram.ui.z51;
import xh.g4;
import xh.h4;
import xh.o2;
import xh.r2;
import yh.k2;
import yh.y3;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements a2, po0, ly, c3.r, e2.h, androidx.car.app.utils.b, q9.d, k2, Utilities.Callback5, bl0, mg1, z51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ly
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

    @Override // org.telegram.ui.ly
    public /* synthetic */ boolean K(ry ryVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.po0
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

    @Override // e2.h
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.b;
        ((u2.j0) obj).d(aVar.b, (u2.f0) aVar.c, (u2.b0) this.c);
    }

    @Override // yh.k2
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        o2 o2Var = (o2) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        nr0 nr0Var = o2Var.a;
        o2Var.e.l.remove(savedStarGift);
        o2Var.f(true);
        int i10 = o2Var.b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            xc a02 = xc.a0(nr0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            qc O = a02.O(document, string, LocaleController.formatString(i11, hg.c.k(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            qc O2 = xc.a0(nr0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
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
        h4.Q((h4) this.b, (g4) this.c, i10);
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

    @Override // org.telegram.ui.mg1
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 15:
                ((yh.g) this.b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
            default:
                ((y3) this.b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
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
            case 10:
                xh.m mVar = (xh.m) this.b;
                c6 c6Var = (c6) this.c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.c0.setValue(parseInt);
                    b2Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            case 11:
                xh.a2 a2Var = (xh.a2) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String obj = a2Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    b2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(a2Var);
                    break;
                }
                break;
            default:
                y3 y3Var = (y3) this.b;
                n1[] n1VarArr = (n1[]) this.c;
                nf.e g10 = b2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                d dVar = new d(17, y3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.b0 = dVar;
                twoStepVerificationActivity.a0 = y3Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new w9.v(y3Var, n1VarArr, g10, twoStepVerificationActivity, 11));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        r2 r2Var = (r2) this.b;
        ci.d dVar = (ci.d) this.c;
        View view = (View) obj2;
        r2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((h51) obj).G).gift.id;
        if (r2Var.b == j3) {
            r2Var.b = 0L;
        } else {
            r2Var.b = j3;
        }
        dVar.setEnabled(r2Var.b != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof cp0) {
                    cp0 cp0Var = (cp0) childAt;
                    cp0Var.b(r2Var.b == cp0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ly
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        switch (this.a) {
            case 4:
                h0 h0Var = (h0) this.b;
                String str = (String) this.c;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    h0Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                ryVar.finishFragment();
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
                ryVar.finishFragment();
                k.h(j10);
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
