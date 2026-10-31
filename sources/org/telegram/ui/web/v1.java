package org.telegram.ui.web;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Wallet.k3;
import org.telegram.ui.f11;
import org.telegram.ui.yn0;
import org.telegram.ui.zh;
import ph.f2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.b;
        v1 v1Var = (v1) this.c;
        cVar.c.x();
        r2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            v1Var.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.b;
        qa.b bVar = (qa.b) this.c;
        if (pVar.b != r9.p.d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (pVar) {
            aVar = pVar.a;
            pVar.a = null;
            pVar.b = bVar;
        }
        aVar.i(bVar);
    }

    private final void c() {
        r9.o oVar = (r9.o) this.b;
        qa.b bVar = (qa.b) this.c;
        synchronized (oVar) {
            try {
                if (oVar.b == null) {
                    oVar.a.add(bVar);
                } else {
                    oVar.b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x02c2, code lost:
    
        if (r9 == null) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        ArrayList arrayList;
        String str2;
        org.telegram.utils.twidget.w wVar;
        RLottieNative rLottieNative;
        qh.f fVar;
        SQLiteCursor sQLiteCursor = null;
        r3 = null;
        r3 = null;
        Bitmap bitmap = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        sQLiteCursor = null;
        int i10 = 2;
        final int i11 = 0;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ((w1) this.b).m.remove((k3) this.c);
                return;
            case 1:
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) this.b;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) this.c;
                mVar.s = tL_messageMediaWidget;
                mVar.r = tL_messageMediaWidget.public_data_hash;
                org.telegram.utils.twidget.p.c(mVar, org.telegram.utils.twidget.p.A(tL_messageMediaWidget.chat_data), org.telegram.utils.twidget.p.A(tL_messageMediaWidget.public_data));
                return;
            case 2:
                ((org.telegram.utils.twidget.i) this.b).a(null, (TLRPC.TL_error) this.c);
                return;
            case 3:
                hs hsVar = (hs) this.b;
                org.telegram.utils.twidget.m mVar2 = (org.telegram.utils.twidget.m) this.c;
                long j10 = mVar2.c;
                int i12 = mVar2.d;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = hsVar.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT local FROM widget_state WHERE uid = " + j10 + " AND mid = " + i12, new Object[0]);
                        try {
                            if (queryFinalized.next() && !queryFinalized.isNull(0)) {
                                str3 = queryFinalized.stringValue(0);
                            }
                            queryFinalized.dispose();
                            SQLiteCursor queryFinalized2 = hsVar.b.queryFinalized("SELECT width, height, anchor FROM widget_heights WHERE uid = " + j10 + " AND mid = " + i12 + " ORDER BY date DESC", new Object[0]);
                            while (queryFinalized2.next()) {
                                try {
                                    arrayList2.add(new int[]{queryFinalized2.intValue(0), queryFinalized2.intValue(1), queryFinalized2.intValue(2)});
                                } catch (Exception e) {
                                    e = e;
                                    str = str3;
                                    sQLiteCursor = queryFinalized2;
                                    hsVar.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    str3 = str;
                                    Object[] objArr = {str3, arrayList2};
                                    arrayList = (ArrayList) objArr[1];
                                    int i13 = 4;
                                    if (!arrayList.isEmpty()) {
                                    }
                                    org.telegram.messenger.i0.g3(new v1(i13, mVar2, objArr));
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteCursor = queryFinalized2;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            }
                            queryFinalized2.dispose();
                        } catch (Exception e7) {
                            e = e7;
                            str = str3;
                            sQLiteCursor = queryFinalized;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        str = null;
                    }
                    Object[] objArr2 = {str3, arrayList2};
                    arrayList = (ArrayList) objArr2[1];
                    int i132 = 4;
                    if (!arrayList.isEmpty()) {
                        org.telegram.utils.twidget.n l4 = org.telegram.utils.twidget.p.l(mVar2.a());
                        synchronized (l4) {
                            if (l4.a.isEmpty()) {
                                while (i11 < arrayList.size() && i11 < 4) {
                                    l4.a.add((int[]) arrayList.get(i11));
                                    i11++;
                                }
                            }
                        }
                    }
                    org.telegram.messenger.i0.g3(new v1(i132, mVar2, objArr2));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            case 4:
                org.telegram.utils.twidget.m mVar3 = (org.telegram.utils.twidget.m) this.b;
                String str4 = (String) ((Object[]) this.c)[0];
                HashMap hashMap = org.telegram.utils.twidget.p.c;
                mVar3.A = true;
                String a2 = mVar3.a();
                if (str4 != null && !hashMap.containsKey(a2)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str4));
                        hashMap.put(a2, jSONObject);
                    } catch (Exception e11) {
                        f8.g(e11, true);
                    }
                }
                org.telegram.utils.twidget.w wVar2 = mVar3.u;
                if (wVar2 != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap.get(a2);
                    try {
                        str2 = cd.D0().y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    wVar2.t = str2;
                    wVar2.u = jSONObject3;
                }
                gl0 gl0Var = mVar3.v;
                if (gl0Var != null && (wVar2 == null || wVar2.i <= 0)) {
                    gl0Var.p0("cached heights read");
                }
                if (mVar3.B) {
                    mVar3.B = false;
                    if (mVar3.y > 0 && wVar2 != null) {
                        org.telegram.utils.twidget.p.y(mVar3);
                    }
                }
                org.telegram.utils.twidget.p.o();
                return;
            case 5:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.b;
                k0Var.M = ((Exception) this.c).toString();
                if (k0Var.u || (wVar = k0Var.J) == null) {
                    return;
                }
                String str5 = k0Var.M;
                if (wVar.e != null) {
                    f8.d("widget " + wVar.a + ": " + str5);
                }
                q81 q81Var = wVar.h;
                if (q81Var != null) {
                    q81Var.a.h();
                    return;
                }
                return;
            case 6:
                p2.b bVar = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri);
                return;
            case 7:
                ph.b bVar2 = (ph.b) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                bVar2.getClass();
                onClickListener.onClick(bVar2);
                return;
            case 8:
                ((ph.w0) this.b).k().f0((TLRPC.TL_error) this.c, false);
                return;
            case 9:
                ph.c1 c1Var = (ph.c1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                c1Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                c1Var.F.setVisibility(8);
                return;
            case 10:
                vq0 vq0Var = (vq0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                vq0Var.h(tL_starGiftCollection.title, new f11(23, vq0Var, tL_starGiftCollection));
                return;
            case 11:
                f2 f2Var = (f2) this.b;
                org.telegram.messenger.i0.g((String) this.c);
                cc.a0(f2Var.a.a).k(false).j();
                return;
            case 12:
                qh.r rVar = (qh.r) this.b;
                if (((TLRPC.Document) this.c) != null) {
                    rVar.e();
                    return;
                } else {
                    rVar.getClass();
                    return;
                }
            case 13:
                qh.s sVar = (qh.s) this.b;
                File file = (File) this.c;
                int i14 = sVar.c;
                try {
                    rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                    if (rLottieNative != null) {
                        try {
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap createBitmap = Bitmap.createBitmap(i14, i14, config);
                            rLottieNative.c(0, createBitmap, true);
                            Bitmap createBitmap2 = Bitmap.createBitmap(i14, i14, config);
                            Paint paint = new Paint(2);
                            paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                            createBitmap.recycle();
                            createBitmap2.setHasMipMap(true);
                            rLottieNative.d();
                            bitmap = createBitmap2;
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                f8.g(th, true);
                                break;
                            } finally {
                                if (rLottieNative != null) {
                                    rLottieNative.d();
                                }
                            }
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    rLottieNative = null;
                }
                org.telegram.messenger.i0.g3(new v1(14, sVar, bitmap));
                return;
            case 14:
                qh.s sVar2 = (qh.s) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                sVar2.h = true;
                if (sVar2.e) {
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        return;
                    }
                    return;
                } else {
                    if (bitmap2 != null) {
                        sVar2.d.a(bitmap2);
                        return;
                    }
                    return;
                }
            case 15:
                qh.y yVar = (qh.y) this.b;
                m4.c cVar = (m4.c) this.c;
                if (yVar.V) {
                    return;
                }
                yVar.e();
                yVar.a.c((String) cVar.b);
                return;
            case 16:
                ew ewVar = (ew) this.b;
                m4.c cVar2 = (m4.c) this.c;
                qh.y yVar2 = (qh.y) ewVar.b;
                if (yVar2.l0 || yVar2.V || yVar2.U) {
                    return;
                }
                yVar2.l0 = true;
                yVar2.h0 = false;
                yVar2.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) cVar2.c;
                r5 = pointFArr.length < 3 ? 0 : 1;
                if (r5 != 0) {
                    yVar2.m0 = pointFArr;
                    yVar2.invalidate();
                }
                org.telegram.messenger.i0.h3(new v1(15, yVar2, cVar2), r5 != 0 ? 450L : 0L);
                return;
            case 17:
                qh.i0.Y((qh.i0) this.b, (AnimatorSet) this.c);
                return;
            case 18:
                qh.i0 i0Var = (qh.i0) this.b;
                Bitmap bitmap3 = (Bitmap) this.c;
                File file2 = new File(org.telegram.messenger.i0.E0(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        z10 = bitmap3.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Exception e12) {
                    f8.g(e12, true);
                }
                bitmap3.recycle();
                if (z10) {
                    org.telegram.messenger.i0.g3(new v1(20, i0Var, file2));
                    return;
                }
                return;
            case 19:
                final qh.i0 i0Var2 = (qh.i0) this.b;
                qh.y yVar3 = (qh.y) this.c;
                if (qh.y.d(i0Var2.getParentActivity())) {
                    yVar3.e();
                    zh zhVar = new zh(12);
                    q20 q20Var = new q20() { // from class: qh.c0
                        @Override // org.telegram.messenger.q20
                        public final void a(Object obj) {
                            int i15 = i11;
                            i0 i0Var3 = i0Var2;
                            switch (i15) {
                                case 0:
                                    String str6 = (String) obj;
                                    if (i0Var3.getParentActivity() != null) {
                                        gf.f.r(i0Var3.getParentActivity(), str6);
                                        break;
                                    }
                                    break;
                                default:
                                    x0 x0Var = i0Var3.d;
                                    if (x0Var != null && !i0Var3.isFinished) {
                                        x0Var.d1(R.drawable.msg_download, cd.L0(2131746486, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    yn0 yn0Var = new yn0(10, false, false, null);
                    yn0Var.G = 1;
                    yn0Var.H = false;
                    yn0Var.y = false;
                    yn0Var.V = new q5.d(zhVar, i0Var2, q20Var, i10);
                    i0Var2.presentFragment(yn0Var);
                    return;
                }
                return;
            case 20:
                final qh.i0 i0Var3 = (qh.i0) this.b;
                File file3 = (File) this.c;
                Activity parentActivity = i0Var3.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                MediaController.d0(file3.getAbsolutePath(), parentActivity, 0, file3.getName(), "image/png", new q20() { // from class: qh.c0
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        int i15 = r2;
                        i0 i0Var32 = i0Var3;
                        switch (i15) {
                            case 0:
                                String str6 = (String) obj;
                                if (i0Var32.getParentActivity() != null) {
                                    gf.f.r(i0Var32.getParentActivity(), str6);
                                    break;
                                }
                                break;
                            default:
                                x0 x0Var = i0Var32.d;
                                if (x0Var != null && !i0Var32.isFinished) {
                                    x0Var.d1(R.drawable.msg_download, cd.L0(2131746486, null), null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            case 21:
                qh.x0 x0Var = (qh.x0) this.b;
                qh.f fVar2 = (qh.f) this.c;
                qh.g gVar = x0Var.s0;
                if (gVar.q == 2 && gVar.o < 1.0f) {
                    gVar.m = fVar2;
                    x0Var.invalidate();
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                x0Var.p2 = qh.x0.j(x0Var.n2, 0.03f, 0.005f);
                x0Var.n2 = currentAnimationTimeMillis;
                qh.f fVar3 = gVar.m;
                if (fVar3 == null) {
                    gVar.m = fVar2;
                    gVar.n = null;
                    gVar.o = 1.0f;
                    return;
                }
                int i15 = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                if (gVar.o < 1.0f && (fVar = gVar.n) != null) {
                    fVar3 = fVar;
                }
                gVar.n = fVar3;
                gVar.m = fVar2;
                gVar.o = 0.0f;
                gVar.q = i15;
                gVar.p = System.currentTimeMillis();
                boolean[] zArr = gVar.s;
                if (zArr != null) {
                    int length = zArr.length;
                    int i16 = gVar.n.e;
                    if (length >= i16 * i16) {
                        Arrays.fill(zArr, false);
                        gVar.G = i15 == 1;
                        return;
                    }
                }
                int i17 = gVar.n.e;
                gVar.s = new boolean[i17 * i17];
                gVar.G = i15 == 1;
                return;
            case 22:
                ((q20) this.b).a((qh.f) this.c);
                return;
            case 23:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 24:
                a();
                return;
            case 25:
                r2.r rVar2 = (r2.r) this.b;
                rVar2.T.set(rVar2.w((hf.b) this.c, rVar2.N, 0));
                return;
            case 26:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i18 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                rh.n nVar = (rh.n) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i19 = nVar.a;
                ArrayList arrayList3 = nVar.e;
                nVar.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    vp.r1(i19).V3(connectedstarrefbots.users, false);
                    if (nVar.c <= 0) {
                        arrayList3.clear();
                    }
                    nVar.c = connectedstarrefbots.count;
                    arrayList3.addAll(connectedstarrefbots.connected_bots);
                    nVar.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList3.size() >= nVar.c;
                } else {
                    nVar.h = true;
                    nVar.d = true;
                }
                nVar.g = false;
                zs.f(i19).k(zs.L3, Long.valueOf(nVar.b));
                return;
        }
    }
}
