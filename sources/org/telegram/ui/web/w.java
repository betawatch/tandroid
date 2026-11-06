package org.telegram.ui.web;

import a8.ia;
import a8.wa;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.LongSparseArray;
import android.widget.ImageView;
import androidx.car.app.hardware.common.CarResultStub;
import c8.xa;
import fi.u2;
import fi.w3;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.df;
import org.telegram.messenger.gl;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.xq;
import tg.c2;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x046e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        x0 x0Var;
        d0 d0Var;
        m5 m5Var;
        String str;
        ArrayList arrayList;
        String str2;
        org.telegram.utils.twidget.u uVar;
        p4.m1 m1Var;
        int i7 = 3;
        SQLiteCursor sQLiteCursor = null;
        SurfaceTexture surfaceTexture = null;
        r4 = null;
        r4 = null;
        String str3 = null;
        sQLiteCursor = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                if (botWebViewContainer$BotWebViewProxy == null || (x0Var = botWebViewContainer$BotWebViewProxy.a) == null || (d0Var = x0Var.c) == null) {
                    return;
                }
                d0Var.f(arrayList2);
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                xa.c.addAll(0, arrayList3);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    xa.d.put(longSparseArray.keyAt(i11), (y0) longSparseArray.valueAt(i11));
                }
                xa.b = true;
                xa.a = false;
                ArrayList arrayList4 = xa.e;
                if (arrayList4 != null) {
                    int size = arrayList4.size();
                    while (i10 < size) {
                        Object obj = arrayList4.get(i10);
                        i10++;
                        ((c20) obj).a(arrayList3);
                    }
                    xa.e = null;
                    return;
                }
                return;
            case 2:
                u2 u2Var = (u2) this.c;
                ArrayList arrayList5 = (ArrayList) this.b;
                z0 z0Var = (z0) u2Var.c;
                ArrayList arrayList6 = z0Var.h;
                arrayList6.clear();
                arrayList6.addAll(arrayList5);
                z0Var.n = false;
                w3 w3Var = z0Var.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) this.c;
                z0Var2.setEnabled(((u1) this.b).b() != null);
                z0Var2.animate().alpha(z0Var2.isEnabled() ? 1.0f : 0.5f);
                return;
            case 4:
                ((org.telegram.ui.l0) this.c).f0.a((Integer) this.b);
                return;
            case 5:
                o1 o1Var = (o1) this.c;
                String str4 = (String) this.b;
                qp messagesController = o1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = str4;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new gl(messagesController, i7));
                o1Var.a.f3.O(true);
                return;
            case 6:
                u1 u1Var = (u1) this.c;
                TLObject tLObject = (TLObject) this.b;
                int i12 = u1Var.a;
                u1Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    qp.s1(i12).Y3(tL_messages_webPage.users, false);
                    qp.s1(i12).S3(tL_messages_webPage.chats, false);
                    u1Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            u1Var.h = tL_webPage;
                        }
                    }
                    u1Var.h = null;
                }
                TLRPC.WebPage webPage = u1Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    u1Var.h = null;
                }
                if (!iz.w0 && u1Var.h != null && (m5Var = u1Var.l) != null) {
                    m5Var.run();
                }
                u1Var.c();
                return;
            case 7:
                ((u1) this.c).m.remove((w) this.b);
                return;
            case 8:
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) this.c;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) this.b;
                mVar.r = tL_messageMediaWidget;
                mVar.q = tL_messageMediaWidget.public_data_hash;
                org.telegram.utils.twidget.p.c(mVar, org.telegram.utils.twidget.p.A(tL_messageMediaWidget.chat_data), org.telegram.utils.twidget.p.A(tL_messageMediaWidget.public_data));
                return;
            case 9:
                ((org.telegram.utils.twidget.i) this.c).a(null, (TLRPC.TL_error) this.b);
                return;
            case 10:
                yr yrVar = (yr) this.c;
                org.telegram.utils.twidget.m mVar2 = (org.telegram.utils.twidget.m) this.b;
                long j3 = mVar2.c;
                int i13 = mVar2.d;
                ArrayList arrayList7 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = yrVar.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT local FROM widget_state WHERE uid = " + j3 + " AND mid = " + i13, new Object[0]);
                        try {
                            if (queryFinalized.next() && !queryFinalized.isNull(0)) {
                                str3 = queryFinalized.stringValue(0);
                            }
                            queryFinalized.dispose();
                            SQLiteCursor queryFinalized2 = yrVar.b.queryFinalized("SELECT width, height, anchor FROM widget_heights WHERE uid = " + j3 + " AND mid = " + i13 + " ORDER BY date DESC", new Object[0]);
                            while (queryFinalized2.next()) {
                                try {
                                    arrayList7.add(new int[]{queryFinalized2.intValue(0), queryFinalized2.intValue(1), queryFinalized2.intValue(2)});
                                } catch (Exception e10) {
                                    e = e10;
                                    str = str3;
                                    sQLiteCursor = queryFinalized2;
                                    yrVar.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    str3 = str;
                                    Object[] objArr = {str3, arrayList7};
                                    arrayList = (ArrayList) objArr[1];
                                    if (!arrayList.isEmpty()) {
                                    }
                                    org.telegram.messenger.g0.h3(new w(11, mVar2, objArr));
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
                        } catch (Exception e11) {
                            e = e11;
                            str = str3;
                            sQLiteCursor = queryFinalized;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str = null;
                    }
                    Object[] objArr2 = {str3, arrayList7};
                    arrayList = (ArrayList) objArr2[1];
                    if (!arrayList.isEmpty()) {
                        org.telegram.utils.twidget.n l10 = org.telegram.utils.twidget.p.l(mVar2.a());
                        synchronized (l10) {
                            if (l10.a.isEmpty()) {
                                for (int i14 = 0; i14 < arrayList.size() && i14 < 4; i14++) {
                                    l10.a.add((int[]) arrayList.get(i14));
                                }
                            }
                        }
                    }
                    org.telegram.messenger.g0.h3(new w(11, mVar2, objArr2));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            case 11:
                org.telegram.utils.twidget.m mVar3 = (org.telegram.utils.twidget.m) this.c;
                String str5 = (String) ((Object[]) this.b)[0];
                HashMap hashMap = org.telegram.utils.twidget.p.c;
                mVar3.z = true;
                String a10 = mVar3.a();
                if (str5 != null && !hashMap.containsKey(a10)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str5));
                        hashMap.put(a10, jSONObject);
                    } catch (Exception e13) {
                        a8.g(e13, true);
                    }
                }
                org.telegram.utils.twidget.u uVar2 = mVar3.t;
                if (uVar2 != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap.get(a10);
                    try {
                        str2 = hd.E0().y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    uVar2.t = str2;
                    uVar2.u = jSONObject3;
                }
                ck0 ck0Var = mVar3.u;
                if (ck0Var != null && (uVar2 == null || uVar2.i <= 0)) {
                    ck0Var.p0("cached heights read");
                }
                if (mVar3.A) {
                    mVar3.A = false;
                    if (mVar3.x > 0 && uVar2 != null) {
                        org.telegram.utils.twidget.p.y(mVar3);
                    }
                }
                org.telegram.utils.twidget.p.o();
                return;
            case 12:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.c;
                h0Var.L = ((Exception) this.b).toString();
                if (h0Var.u || (uVar = h0Var.J) == null) {
                    return;
                }
                String str6 = h0Var.L;
                if (uVar.e != null) {
                    a8.d("widget " + uVar.a + ": " + str6);
                }
                p71 p71Var = uVar.h;
                if (p71Var != null) {
                    p71Var.a.h();
                    return;
                }
                return;
            case 13:
                p4.d0 d0Var2 = (p4.d0) this.c;
                Runnable runnable = (Runnable) this.b;
                d0Var2.getClass();
                runnable.run();
                return;
            case 14:
                p4.d0 d0Var3 = (p4.d0) this.c;
                p4.g1 g1Var = (p4.g1) this.b;
                p4.m0 m0Var = d0Var3.h;
                d0Var3.t = g1Var;
                df dfVar = new df(d0Var3, g1Var);
                g1Var.I0(dfVar);
                d0Var3.u = dfVar;
                try {
                    m0Var.j.o(0, g1Var);
                } catch (RemoteException e14) {
                    h2.a.d("MediaSessionImpl", "Exception in using media1 API", e14);
                }
                ((q4.l) m0Var.n.b).a.setActive(true);
                d0Var3.s = new p4.e1(g1Var.W(), 0, g1Var.R0(), g1Var.Q0(), g1Var.Q0(), 0, g1Var.j(), g1Var.m(), g1Var.D0(), g1Var.C(), g1Var.T0(), 0, g1Var.p0(18) ? g1Var.k0() : e2.o0.L, g1Var.p0(22) ? g1Var.F() : 1.0f, 1.0f, g1Var.p0(21) ? g1Var.H() : e2.e.i, 0, g1Var.p0(28) ? g1Var.l0() : g2.d.d, g1Var.K(), g1Var.p0(23) ? g1Var.n() : 0, g1Var.p0(23) && g1Var.z0(), g1Var.u(), 1, g1Var.w0(), g1Var.i(), g1Var.h(), g1Var.g(), g1Var.U0(), g1Var.O0(), g1Var.Z(), g1Var.z(), g1Var.p0(30) ? g1Var.j0() : e2.s1.b, g1Var.E0());
                d0Var3.f(g1Var.t());
                return;
            case 15:
                ((c0.i) this.b).a(Boolean.valueOf(((p4.d0) this.c).o()));
                return;
            case 16:
                m9.w wVar = (m9.w) this.c;
                ResultReceiver resultReceiver = (ResultReceiver) this.b;
                try {
                    m1Var = (p4.m1) wVar.a;
                    ia.k(m1Var, "SessionResult must not be null");
                } catch (InterruptedException e15) {
                    e = e15;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    m1Var = new p4.m1(-1);
                } catch (CancellationException e16) {
                    h2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e16);
                    m1Var = new p4.m1(1);
                } catch (ExecutionException e17) {
                    e = e17;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    m1Var = new p4.m1(-1);
                }
                resultReceiver.send(m1Var.a, m1Var.b);
                return;
            case 17:
                p4.c1 c1Var = (p4.c1) this.c;
                p4.l lVar = (p4.l) this.b;
                ui.e eVar = c1Var.b;
                p4.v x10 = eVar.x(lVar.asBinder());
                if (x10 != null) {
                    eVar.T(x10);
                    return;
                }
                return;
            case 18:
                ((p4.c1) this.c).b.q((p4.v) this.b);
                return;
            case 19:
                q2.d dVar = (q2.d) this.c;
                e2.u uVar3 = (e2.u) this.b;
                q2.e eVar2 = dVar.d;
                if (eVar2.E == 0 || dVar.c) {
                    return;
                }
                Looper looper = eVar2.I;
                looper.getClass();
                dVar.b = eVar2.b(looper, dVar.a, uVar3, false);
                eVar2.y.add(dVar);
                return;
            case 20:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.c, this.b);
                return;
            case 21:
                r2.q qVar = (r2.q) this.c;
                r2.j jVar = (r2.j) this.b;
                qt qtVar = qVar.c;
                Uri uri = jVar.y;
                s2.c cVar = (s2.c) ((r2.k) qtVar.b).b.d.get(uri);
                if (cVar != null) {
                    s2.c.b(cVar, uri, true);
                    return;
                }
                return;
            case 22:
                s2.b bVar = (s2.b) this.c;
                Uri uri2 = (Uri) this.b;
                bVar.s = false;
                bVar.b(uri2);
                return;
            case 23:
                sg.j0 j0Var = (sg.j0) this.c;
                sg.q0 q0Var = (sg.q0) this.b;
                j0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) j0Var.h(j0Var.f(), true, false, false).c;
                RectF f10 = j0Var.f();
                Object obj2 = j0Var.a.b;
                j0Var.w = new wa(byteBuffer, 0, f10);
                j0Var.a(false);
                q0Var.run();
                return;
            case 24:
                sg.w0 w0Var = (sg.w0) this.c;
                Runnable runnable2 = (Runnable) this.b;
                sg.u0 u0Var = w0Var.d;
                if (u0Var == null || !u0Var.f) {
                    return;
                }
                sg.u0.a(u0Var);
                runnable2.run();
                return;
            case 25:
                tg.g0 g0Var = (tg.g0) this.c;
                tg.n1 n1Var = (tg.n1) this.b;
                n1Var.m();
                g0Var.r0(n1Var, true);
                return;
            case 26:
                ((tg.n1) this.c).s((Bitmap) this.b);
                return;
            case 27:
                c2 c2Var = (c2) this.c;
                ArrayList arrayList8 = (ArrayList) this.b;
                c2Var.G = false;
                tg.z1[] z1VarArr = (tg.z1[]) arrayList8.toArray(new tg.z1[0]);
                c2Var.H = z1VarArr;
                if (z1VarArr.length > 0) {
                    c2Var.b0.setScaleX(0.3f);
                    c2Var.b0.setScaleY(0.3f);
                    c2Var.b0.setAlpha(0.0f);
                    c2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(xq.f).start();
                    return;
                }
                return;
            case 28:
                ti.i iVar = (ti.i) this.c;
                ti.q qVar2 = (ti.q) this.b;
                ti.m mVar4 = iVar.b;
                if (iVar.j != qVar2) {
                    return;
                }
                ImageView imageView = iVar.l;
                if (imageView != null && imageView.getVisibility() == 0) {
                    qVar2.setFirstFrameCallback(new ti.b(iVar, i7));
                }
                if (mVar4.L()) {
                    mVar4.f();
                    return;
                } else {
                    if (mVar4.h()) {
                        return;
                    }
                    mVar4.c(mVar4.l());
                    return;
                }
            default:
                ti.i iVar2 = (ti.i) this.c;
                c20 c20Var = (c20) this.b;
                iVar2.l();
                ti.q qVar3 = iVar2.j;
                iVar2.j = null;
                if (qVar3 != null) {
                    org.telegram.messenger.g0.E2(qVar3);
                    SurfaceTexture surfaceTexture2 = qVar3.a;
                    qVar3.a = null;
                    surfaceTexture = surfaceTexture2;
                }
                c20Var.a(surfaceTexture);
                return;
        }
    }

    public /* synthetic */ w(ArrayList arrayList, LongSparseArray longSparseArray) {
        this.a = 1;
        this.b = arrayList;
        this.c = longSparseArray;
    }

    public /* synthetic */ w(p4.d0 d0Var, p4.v vVar, Runnable runnable) {
        this.a = 13;
        this.c = d0Var;
        this.b = runnable;
    }
}
