package org.telegram.ui.web;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import bi.e5;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseCommonRegistrar;
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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.t8;
import org.telegram.ui.bh1;
import org.telegram.ui.bp0;
import org.telegram.ui.lg1;
import org.telegram.ui.op0;
import org.telegram.ui.sy;
import org.telegram.ui.yy;
import yh.e4;
import yh.f4;
import yh.p2;
import zh.r3;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements org.telegram.ui.ActionBar.z1, r2.v, t5.b, qa.a, OnFailureListener, s5.e, c3.r, e2.j, bp0, sy, androidx.car.app.utils.d, r9.d, zh.f2, Utilities.Callback5, bm0, bh1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean D() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.sy
    public /* synthetic */ boolean L(yy yyVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.bp0
    public void a(int i10) {
        switch (this.a) {
            case 13:
                ug.v vVar = (ug.v) this.b;
                ug.v vVar2 = (ug.v) this.c;
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

    @Override // e2.j
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.b;
        ((u2.k0) obj).e(aVar.b, (u2.g0) aVar.c, (u2.c0) this.c);
    }

    @Override // s5.e
    public Object apply(Object obj) {
        s5.g gVar = (s5.g) this.b;
        l5.i iVar = (l5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.c) {
                int size = aVar.b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).a);
            if (i10 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new s5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            s5.b bVar = (s5.b) listIterator.next();
            long j11 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                com.google.firebase.messaging.m c10 = bVar.c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.c(fVar.a, fVar.b);
                }
                listIterator.set(new s5.b(j11, bVar.b, c10.g()));
            }
        }
        return d;
    }

    @Override // zh.f2
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        yh.m2 m2Var = (yh.m2) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        ns0 ns0Var = m2Var.a;
        m2Var.e.l.remove(savedStarGift);
        m2Var.f(true);
        int i10 = m2Var.b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            zc a02 = zc.a0(ns0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            sc O = a02.O(document, string, LocaleController.formatString(i11, org.telegram.messenger.q.i(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            sc O2 = zc.a0(ns0Var.a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.x0.c(true);
        }
    }

    @Override // r2.v
    public int c(Object obj) {
        Context context = (Context) this.b;
        b2.x xVar = (b2.x) this.c;
        r2.o oVar = (r2.o) obj;
        String str = oVar.b;
        return ((str.equals(xVar.s) || str.equals(r2.w.c(xVar))) && oVar.c(context, xVar, false) && oVar.d(xVar)) ? 1 : 0;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // androidx.car.app.utils.d
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i10 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        f4.R((f4) this.b, (e4) this.c, i10);
    }

    @Override // c3.r
    public c3.o[] e(Uri uri, Map map) {
        u2.q qVar = (u2.q) this.b;
        b2.x xVar = (b2.x) this.c;
        return new c3.o[]{qVar.c.b0(xVar) ? new z3.i(qVar.c.p(xVar), null) : new k3.a(xVar)};
    }

    @Override // qa.a
    public void f(qa.b bVar) {
        qa.a aVar = (qa.a) this.b;
        qa.a aVar2 = (qa.a) this.c;
        aVar.f(bVar);
        aVar2.f(bVar);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(b1Var.M).getInputUser(b1Var.U);
                ConnectionsManager.getInstance(b1Var.M).sendRequest(allowsendmessage, new e5(b1Var, strArr, a2Var, 15));
                break;
            case 1:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 8:
                sg.j0.R((sg.j0) this.b, (ArrayList) this.c);
                break;
            case 11:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                ug.t0 t0Var = (ug.t0) this.c;
                atomicBoolean.set(true);
                t0Var.run();
                break;
            case 12:
                ((ug.v) this.b).run((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
            case 19:
                yh.n nVar = (yh.n) this.b;
                c6 c6Var = (c6) this.c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    nVar.Y(parseInt);
                    nVar.c0.setValue(parseInt);
                    a2Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            case 20:
                yh.y1 y1Var = (yh.y1) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                String obj = y1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    a2Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.shakeView(y1Var);
                    break;
                }
                break;
            default:
                r3 r3Var = (r3) this.b;
                ug.m1[] m1VarArr = (ug.m1[]) this.c;
                pf.c g10 = a2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                c0 c0Var = new c0(26, r3Var, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 2;
                twoStepVerificationActivity.b0 = c0Var;
                twoStepVerificationActivity.a0 = r3Var.D1();
                g10.d();
                twoStepVerificationActivity.s0(new org.webrtc.i(r3Var, m1VarArr, g10, twoStepVerificationActivity, 25));
                break;
        }
    }

    @Override // t5.b
    public Object h() {
        switch (this.a) {
            case 3:
                ea.b bVar = (ea.b) this.b;
                Iterable iterable = (Iterable) this.c;
                s5.g gVar = (s5.g) ((s5.d) bVar.c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    break;
                }
                break;
            default:
                ea.b bVar2 = (ea.b) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((s5.g) ((s5.c) bVar2.i)).e(((Integer) entry.getValue()).intValue(), o5.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // org.telegram.ui.bh1
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 24:
                ((zh.g) this.b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
            default:
                ((r3) this.b).N1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
                break;
        }
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        String valueOf;
        String str = (String) this.b;
        k2.y0 y0Var = (k2.y0) this.c;
        Context context = (Context) z5Var.a(Context.class);
        switch (y0Var.a) {
            case 3:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 4:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 5:
                int i10 = Build.VERSION.SDK_INT;
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                valueOf = "embedded";
                                break;
                            }
                            valueOf = "";
                            break;
                        } else {
                            valueOf = "auto";
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
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                valueOf = "";
                break;
        }
        return new ya.a(str, valueOf);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        rg.z1 z1Var = (rg.z1) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        z1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && z1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new t8(27, z1Var, bitmap), 2000L);
        } else {
            z1Var.C0 = true;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        p2 p2Var = (p2) this.b;
        di.d dVar = (di.d) this.c;
        View view = (View) obj2;
        p2Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((l61) obj).G).gift.id;
        if (p2Var.b == j10) {
            p2Var.b = 0L;
        } else {
            p2Var.b = j10;
        }
        dVar.setEnabled(p2Var.b != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof op0) {
                    op0 op0Var = (op0) childAt;
                    op0Var.b(p2Var.b == op0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.ui.sy
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        switch (this.a) {
            case 15:
                ug.g0 g0Var = (ug.g0) this.b;
                String str = (String) this.c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    g0Var.n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                yyVar.finishFragment();
                ug.j.h(j10);
                break;
            default:
                vg.e eVar = (vg.e) this.b;
                String str2 = (String) this.c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                yyVar.finishFragment();
                ug.j.h(j11);
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
