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
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.is;
import org.telegram.messenger.r20;
import org.telegram.messenger.uz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Wallet.m2;
import org.telegram.ui.d01;
import org.telegram.ui.wn0;
import org.telegram.ui.zh;
import ph.f2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        ArrayList arrayList;
        is isVar = (is) this.b;
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) this.c;
        long j10 = mVar.c;
        int i10 = mVar.d;
        ArrayList arrayList2 = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        r13 = null;
        r13 = null;
        String str2 = null;
        sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = isVar.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT local FROM widget_state WHERE uid = " + j10 + " AND mid = " + i10, new Object[0]);
                try {
                    if (queryFinalized.next() && !queryFinalized.isNull(0)) {
                        str2 = queryFinalized.stringValue(0);
                    }
                    queryFinalized.dispose();
                    SQLiteCursor queryFinalized2 = isVar.b.queryFinalized("SELECT width, height, anchor FROM widget_heights WHERE uid = " + j10 + " AND mid = " + i10 + " ORDER BY date DESC", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            arrayList2.add(new int[]{queryFinalized2.intValue(0), queryFinalized2.intValue(1), queryFinalized2.intValue(2)});
                        } catch (Exception e) {
                            e = e;
                            String str3 = str2;
                            sQLiteCursor = queryFinalized2;
                            str = str3;
                            isVar.o(e, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            str2 = str;
                            Object[] objArr = {str2, arrayList2};
                            arrayList = (ArrayList) objArr[1];
                            if (!arrayList.isEmpty()) {
                            }
                            org.telegram.messenger.i0.g3(new v1(5, mVar, objArr));
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
                    str = str2;
                    sQLiteCursor = queryFinalized;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                }
            } catch (Exception e10) {
                e = e10;
                str = null;
            }
            Object[] objArr2 = {str2, arrayList2};
            arrayList = (ArrayList) objArr2[1];
            if (!arrayList.isEmpty()) {
                org.telegram.utils.twidget.n l4 = org.telegram.utils.twidget.p.l(mVar.a());
                synchronized (l4) {
                    if (l4.a.isEmpty()) {
                        for (int i11 = 0; i11 < arrayList.size() && i11 < 4; i11++) {
                            l4.a.add((int[]) arrayList.get(i11));
                        }
                    }
                }
            }
            org.telegram.messenger.i0.g3(new v1(5, mVar, objArr2));
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final void b() {
        r2.c cVar = (r2.c) this.b;
        v1 v1Var = (v1) this.c;
        cVar.c.x();
        r2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            v1Var.run();
        }
    }

    private final void c() {
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

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0281, code lost:
    
        if (r8 == null) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        w5 w5Var;
        String str;
        org.telegram.utils.twidget.w wVar;
        RLottieNative rLottieNative;
        qh.f fVar;
        int i10 = 2;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        switch (this.a) {
            case 0:
                w1 w1Var = (w1) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i11 = w1Var.a;
                w1Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    wp.r1(i11).V3(tL_messages_webPage.users, false);
                    wp.r1(i11).P3(tL_messages_webPage.chats, false);
                    w1Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            w1Var.h = tL_webPage;
                        }
                    }
                    w1Var.h = null;
                }
                TLRPC.WebPage webPage = w1Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    w1Var.h = null;
                }
                if (!uz.w0 && w1Var.h != null && (w5Var = w1Var.l) != null) {
                    w5Var.run();
                }
                w1Var.c();
                return;
            case 1:
                ((w1) this.b).m.remove((m2) this.c);
                return;
            case 2:
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) this.b;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) this.c;
                mVar.s = tL_messageMediaWidget;
                mVar.r = tL_messageMediaWidget.public_data_hash;
                org.telegram.utils.twidget.p.c(mVar, org.telegram.utils.twidget.p.A(tL_messageMediaWidget.chat_data), org.telegram.utils.twidget.p.A(tL_messageMediaWidget.public_data));
                return;
            case 3:
                ((org.telegram.utils.twidget.i) this.b).a(null, (TLRPC.TL_error) this.c);
                return;
            case 4:
                a();
                return;
            case 5:
                org.telegram.utils.twidget.m mVar2 = (org.telegram.utils.twidget.m) this.b;
                String str2 = (String) ((Object[]) this.c)[0];
                HashMap hashMap = org.telegram.utils.twidget.p.c;
                mVar2.A = true;
                String a2 = mVar2.a();
                if (str2 != null && !hashMap.containsKey(a2)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str2));
                        hashMap.put(a2, jSONObject);
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
                org.telegram.utils.twidget.w wVar2 = mVar2.u;
                if (wVar2 != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap.get(a2);
                    try {
                        str = dd.D0().y.toLanguageTag();
                    } catch (Exception unused) {
                        str = null;
                    }
                    r3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    wVar2.t = str;
                    wVar2.u = r3;
                }
                hl0 hl0Var = mVar2.v;
                if (hl0Var != null && (wVar2 == null || wVar2.i <= 0)) {
                    hl0Var.p0("cached heights read");
                }
                if (mVar2.B) {
                    mVar2.B = false;
                    if (mVar2.y > 0 && wVar2 != null) {
                        org.telegram.utils.twidget.p.y(mVar2);
                    }
                }
                org.telegram.utils.twidget.p.o();
                return;
            case 6:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.b;
                k0Var.M = ((Exception) this.c).toString();
                if (k0Var.u || (wVar = k0Var.J) == null) {
                    return;
                }
                String str3 = k0Var.M;
                if (wVar.e != null) {
                    f8.d("widget " + wVar.a + ": " + str3);
                }
                r81 r81Var = wVar.h;
                if (r81Var != null) {
                    r81Var.a.h();
                    return;
                }
                return;
            case 7:
                p2.b bVar = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri);
                return;
            case 8:
                ph.b bVar2 = (ph.b) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                bVar2.getClass();
                onClickListener.onClick(bVar2);
                return;
            case 9:
                ((ph.w0) this.b).k().f0((TLRPC.TL_error) this.c, false);
                return;
            case 10:
                ph.c1 c1Var = (ph.c1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                c1Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                c1Var.F.setVisibility(8);
                return;
            case 11:
                wq0 wq0Var = (wq0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                wq0Var.h(tL_starGiftCollection.title, new d01(24, wq0Var, tL_starGiftCollection));
                return;
            case 12:
                f2 f2Var = (f2) this.b;
                org.telegram.messenger.i0.g((String) this.c);
                cc.a0(f2Var.a.a).k(false).j();
                return;
            case 13:
                qh.r rVar = (qh.r) this.b;
                if (((TLRPC.Document) this.c) != null) {
                    rVar.e();
                    return;
                } else {
                    rVar.getClass();
                    return;
                }
            case 14:
                qh.s sVar = (qh.s) this.b;
                File file = (File) this.c;
                int i12 = sVar.c;
                try {
                    rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                    if (rLottieNative != null) {
                        try {
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap createBitmap = Bitmap.createBitmap(i12, i12, config);
                            rLottieNative.c(0, createBitmap, true);
                            Bitmap createBitmap2 = Bitmap.createBitmap(i12, i12, config);
                            Paint paint = new Paint(2);
                            paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                            createBitmap.recycle();
                            createBitmap2.setHasMipMap(true);
                            rLottieNative.d();
                            r3 = createBitmap2;
                        } catch (Throwable th2) {
                            th = th2;
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
                } catch (Throwable th3) {
                    th = th3;
                    rLottieNative = null;
                }
                org.telegram.messenger.i0.g3(new v1(15, sVar, r3));
                return;
            case 15:
                qh.s sVar2 = (qh.s) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                sVar2.h = true;
                if (sVar2.e) {
                    if (bitmap != null) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                } else {
                    if (bitmap != null) {
                        sVar2.d.a(bitmap);
                        return;
                    }
                    return;
                }
            case 16:
                qh.y yVar = (qh.y) this.b;
                m4.c cVar = (m4.c) this.c;
                if (yVar.V) {
                    return;
                }
                yVar.e();
                yVar.a.c((String) cVar.b);
                return;
            case 17:
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
                r4 = pointFArr.length < 3 ? 0 : 1;
                if (r4 != 0) {
                    yVar2.m0 = pointFArr;
                    yVar2.invalidate();
                }
                org.telegram.messenger.i0.h3(new v1(16, yVar2, cVar2), r4 != 0 ? 450L : 0L);
                return;
            case 18:
                qh.i0.Z((qh.i0) this.b, (AnimatorSet) this.c);
                return;
            case 19:
                qh.i0 i0Var = (qh.i0) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                File file2 = new File(org.telegram.messenger.i0.E0(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        z10 = bitmap2.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                bitmap2.recycle();
                if (z10) {
                    org.telegram.messenger.i0.g3(new v1(21, i0Var, file2));
                    return;
                }
                return;
            case 20:
                final qh.i0 i0Var2 = (qh.i0) this.b;
                qh.y yVar3 = (qh.y) this.c;
                if (qh.y.d(i0Var2.getParentActivity())) {
                    yVar3.e();
                    zh zhVar = new zh(12);
                    final int i13 = z10 ? 1 : 0;
                    r20 r20Var = new r20() { // from class: qh.c0
                        @Override // org.telegram.messenger.r20
                        public final void a(Object obj) {
                            int i14 = i13;
                            i0 i0Var3 = i0Var2;
                            switch (i14) {
                                case 0:
                                    String str4 = (String) obj;
                                    if (i0Var3.getParentActivity() != null) {
                                        gf.f.r(i0Var3.getParentActivity(), str4);
                                        break;
                                    }
                                    break;
                                default:
                                    x0 x0Var = i0Var3.d;
                                    if (x0Var != null && !i0Var3.isFinished) {
                                        x0Var.d1(R.drawable.msg_download, dd.L0(2131746486, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    wn0 wn0Var = new wn0(10, false, false, null);
                    wn0Var.G = 1;
                    wn0Var.H = false;
                    wn0Var.y = false;
                    wn0Var.V = new q5.d(zhVar, i0Var2, r20Var, i10);
                    i0Var2.presentFragment(wn0Var);
                    return;
                }
                return;
            case 21:
                final qh.i0 i0Var3 = (qh.i0) this.b;
                File file3 = (File) this.c;
                Activity parentActivity = i0Var3.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                MediaController.d0(file3.getAbsolutePath(), parentActivity, 0, file3.getName(), "image/png", new r20() { // from class: qh.c0
                    @Override // org.telegram.messenger.r20
                    public final void a(Object obj) {
                        int i14 = r2;
                        i0 i0Var32 = i0Var3;
                        switch (i14) {
                            case 0:
                                String str4 = (String) obj;
                                if (i0Var32.getParentActivity() != null) {
                                    gf.f.r(i0Var32.getParentActivity(), str4);
                                    break;
                                }
                                break;
                            default:
                                x0 x0Var = i0Var32.d;
                                if (x0Var != null && !i0Var32.isFinished) {
                                    x0Var.d1(R.drawable.msg_download, dd.L0(2131746486, null), null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            case 22:
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
                int i14 = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                if (gVar.o < 1.0f && (fVar = gVar.n) != null) {
                    fVar3 = fVar;
                }
                gVar.n = fVar3;
                gVar.m = fVar2;
                gVar.o = 0.0f;
                gVar.q = i14;
                gVar.p = System.currentTimeMillis();
                boolean[] zArr = gVar.s;
                if (zArr != null) {
                    int length = zArr.length;
                    int i15 = gVar.n.e;
                    if (length >= i15 * i15) {
                        Arrays.fill(zArr, false);
                        gVar.G = i14 == 1;
                        return;
                    }
                }
                int i16 = gVar.n.e;
                gVar.s = new boolean[i16 * i16];
                gVar.G = i14 == 1;
                return;
            case 23:
                ((r20) this.b).a((qh.f) this.c);
                return;
            case 24:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 25:
                b();
                return;
            case 26:
                r2.r rVar2 = (r2.r) this.b;
                rVar2.T.set(rVar2.w((hf.b) this.c, rVar2.N, 0));
                return;
            case 27:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i17 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 28:
                c();
                return;
            default:
                r9.o oVar = (r9.o) this.b;
                qa.b bVar3 = (qa.b) this.c;
                synchronized (oVar) {
                    try {
                        if (oVar.b == null) {
                            oVar.a.add(bVar3);
                        } else {
                            oVar.b.add(bVar3.get());
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
