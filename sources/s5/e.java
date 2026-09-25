package s5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import b2.s;
import c3.o;
import c3.r;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
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
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a61;
import org.telegram.ui.bp0;
import org.telegram.ui.ky;
import org.telegram.ui.mg1;
import org.telegram.ui.no0;
import org.telegram.ui.qy;
import org.telegram.ui.wf1;
import tg.g0;
import tg.m1;
import tg.t0;
import tg.v;
import u2.b0;
import u2.f0;
import u2.j0;
import u2.p;
import xh.g4;
import xh.h4;
import xh.m;
import xh.o2;
import xh.r2;
import yh.j2;
import yh.x3;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements f, z1, no0, ky, r, e2.h, androidx.car.app.utils.b, q9.d, j2, Utilities.Callback5, ll0, mg1, a61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ky
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

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean K(qy qyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.no0
    public void a(int i10) {
        switch (this.a) {
            case 3:
                v vVar = (v) this.b;
                v vVar2 = (v) this.c;
                if (i10 != 1) {
                    if (i10 != 3) {
                        vVar2.run(null);
                        break;
                    }
                } else {
                    vVar.run(null);
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
        ((j0) obj).d(aVar.b, (f0) aVar.c, (b0) this.c);
    }

    @Override // s5.f
    public Object apply(Object obj) {
        h hVar = (h) this.b;
        l5.i iVar = (l5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        a aVar = hVar.d;
        ArrayList d = hVar.d(sQLiteDatabase, iVar, aVar.b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.c) {
                int size = aVar.b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(hVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((b) d.get(i10)).a);
            if (i10 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new g(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            b bVar = (b) listIterator.next();
            long j10 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                n c10 = bVar.c.c();
                for (g gVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(gVar.a, gVar.b);
                }
                listIterator.set(new b(j10, bVar.b, c10.g()));
            }
        }
        return d;
    }

    @Override // yh.j2
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        o2 o2Var = (o2) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        zr0 zr0Var = o2Var.a;
        o2Var.e.l.remove(savedStarGift);
        o2Var.f(true);
        int i10 = o2Var.b;
        if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
            xc a02 = xc.a0(zr0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            qc O = a02.O(document, string, LocaleController.formatString(i11, org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            qc O2 = xc.a0(zr0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j3)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.x0.c(true);
        }
    }

    @Override // org.telegram.ui.Components.ll0
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
    public o[] d(Uri uri, Map map) {
        p pVar = (p) this.b;
        s sVar = (s) this.c;
        return new o[]{pVar.c.W(sVar) ? new z3.h(pVar.c.x(sVar), null) : new k3.a(sVar)};
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.mg1
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 16:
                ((yh.g) this.b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
            default:
                ((x3) this.b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
        switch (this.a) {
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                t0 t0Var = (t0) this.c;
                atomicBoolean.set(true);
                t0Var.run();
                break;
            case 2:
                ((v) this.b).run((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
            case 11:
                m mVar = (m) this.b;
                c6 c6Var = (c6) this.c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.c0.setValue(parseInt);
                    a2Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            case 12:
                xh.a2 a2Var2 = (xh.a2) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String obj = a2Var2.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    a2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(a2Var2);
                    break;
                }
                break;
            default:
                x3 x3Var = (x3) this.b;
                m1[] m1VarArr = (m1[]) this.c;
                nf.e g10 = a2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                e eVar = new e(18, x3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.b0 = eVar;
                twoStepVerificationActivity.a0 = x3Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new tg.r(x3Var, m1VarArr, g10, twoStepVerificationActivity, 14));
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        r2 r2Var = (r2) this.b;
        ci.d dVar = (ci.d) this.c;
        View view = (View) obj2;
        r2Var.getClass();
        long j3 = ((TL_stars.SavedStarGift) ((v51) obj).G).gift.id;
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
                if (childAt instanceof bp0) {
                    bp0 bp0Var = (bp0) childAt;
                    bp0Var.b(r2Var.b == bp0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ky
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        switch (this.a) {
            case 5:
                g0 g0Var = (g0) this.b;
                String str = (String) this.c;
                long j3 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j3 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    g0Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                qyVar.finishFragment();
                tg.i.h(j3);
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
                qyVar.finishFragment();
                tg.i.h(j10);
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
