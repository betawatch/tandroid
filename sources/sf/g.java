package sf;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import c9.t;
import dg.t0;
import h5.d0;
import j7.j0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import m.s;
import o4.h0;
import oh.p5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.z4;
import org.telegram.ui.jy;
import org.telegram.ui.mf1;
import org.telegram.ui.py;
import org.telegram.ui.web.v1;
import qh.p0;
import qh.v9;
import r3.o;
import s5.m;
import sh.x3;
import vf.m1;
import vf.o1;
import vf.p1;
import vf.r1;
import vf.w0;
import vf.x0;
import vf.z0;
import wh.a5;
import wh.c4;
import wh.e1;
import wh.i5;
import wh.j5;
import wh.m0;
import wh.r0;
import wh.r3;
import wh.v5;
import wh.x5;
import wh.y2;
import wh.z;
import wh.z1;
import wh.z2;
import z3.p;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements c2, Utilities.Callback5, t0.e, r3.c, vt, m0, jy, j5, xd.b, r8.e, c9.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.jy
    public /* synthetic */ boolean J(py pyVar) {
        return false;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((Switch) this.b).invalidate();
    }

    @Override // wh.m0
    public q70 a(e1 e1Var) {
        return q70.H((z1) ((f1) this.b).b, e1Var);
    }

    @Override // r8.e
    public Object apply(Object obj) {
        p pVar = (p) obj;
        ((z3.i) this.b).getClass();
        return pVar;
    }

    public h0 b(m mVar) {
        w2.b bVar = (w2.b) this.b;
        URL url = (URL) mVar.b;
        String c3 = j0.c("CctTransportBackend");
        if (Log.isLoggable(c3, 4)) {
            Log.i(c3, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) mVar.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ai aiVar = bVar.a;
                    x2.i iVar = (x2.i) mVar.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    w9.d dVar = (w9.d) aiVar.b;
                    w9.e eVar = new w9.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar.h(iVar);
                    eVar.j();
                    eVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c10 = j0.c("CctTransportBackend");
                    if (Log.isLoggable(c10, 4)) {
                        Log.i(c10, String.format("Status Code: %d", valueOf));
                    }
                    j0.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    j0.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new h0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new h0(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            h0 h0Var = new h0(responseCode, null, x2.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return h0Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e6) {
            e = e6;
            j0.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new h0(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            j0.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new h0(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            j0.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new h0(400, null, 0L);
        } catch (u9.b e12) {
            e = e12;
            j0.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new h0(400, null, 0L);
        }
    }

    @Override // org.telegram.ui.Components.vt
    public void b0() {
        switch (this.a) {
            case 13:
                r0 r0Var = (r0) this.b;
                e1 e1Var = r0Var.d;
                wh.a aVar = r0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = e1Var.B;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = x5.f(e1Var.getText());
                    }
                }
                z2 z2Var = r0Var.h;
                if (z2Var != null && r0Var.f != null) {
                    r3.O1(z2Var.a);
                    break;
                }
                break;
            case 18:
                ((a5) this.b).h();
                break;
            default:
                i5 i5Var = (i5) this.b;
                wh.a aVar2 = i5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = i5Var.r.B;
                }
                i5Var.u();
                y2 y2Var = i5Var.B;
                if (y2Var != null && i5Var.a != null) {
                    r3.O1(y2Var.a);
                    break;
                }
                break;
        }
    }

    public void c(int i10) {
        z zVar = (z) this.b;
        zVar.c = i10;
        zVar.f(i10);
    }

    @Override // t0.e
    public boolean d(t0.i iVar, int i10, Bundle bundle) {
        r0.e eVar;
        s sVar = (s) this.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.a.b();
                Parcelable parcelable = (Parcelable) iVar.a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e6) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e6);
                return false;
            }
        }
        t0.h hVar = iVar.a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.a()));
        if (i11 >= 31) {
            eVar = new r0.d(clipData, 2);
        } else {
            r0.f fVar = new r0.f();
            fVar.b = clipData;
            fVar.c = 2;
            eVar = fVar;
        }
        eVar.b(hVar.c());
        eVar.setExtras(bundle);
        return r0.j0.i(sVar, eVar.build()) == null;
    }

    @Override // c9.e
    public Object e0(c5.j jVar) {
        return new z9.c((Context) jVar.a(Context.class), ((w8.g) jVar.a(w8.g.class)).d(), jVar.w(z9.d.class), jVar.c(ja.b.class), (Executor) jVar.f((t) this.b));
    }

    @Override // r3.c
    public long f(long j10) {
        return d0.i((j10 * r0.e) / 1000000, 0L, ((o) this.b).j - 1);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        int i11;
        switch (this.a) {
            case 1:
                ((sh.d) this.b).run();
                break;
            case 2:
                sh.j jVar = (sh.j) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().getInputUser(jVar.M);
                updatestarrefprogram.commission_permille = 0;
                d2 d2Var2 = new d2(jVar.getParentActivity(), 3, null);
                d2Var2.q(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new sh.b(jVar, d2Var2, 0));
                break;
            case 8:
                m1 m1Var = ((vf.f1) this.b).a;
                i11 = ((p2) m1Var).currentAccount;
                p1 f10 = p1.f(i11);
                ArrayList arrayList = m1Var.b;
                int i12 = f10.a;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    if (f10.c(((Integer) arrayList.get(i13)).intValue()) == null) {
                        arrayList.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        o1 c3 = f10.c(((Integer) arrayList.get(i14)).intValue());
                        f10.b.remove(c3);
                        f10.a(c3.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c3.a;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new p5(20));
                        if ("hello".equals(c3.b)) {
                            ConnectionsManager.getInstance(i12).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                            if (userFull != null) {
                                userFull.flags2 &= -5;
                                userFull.business_greeting_message = null;
                                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                            }
                        } else if ("away".equals(c3.b)) {
                            ConnectionsManager.getInstance(i12).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull userFull2 = MessagesController.getInstance(i12).getUserFull(UserConfig.getInstance(i12).getClientUserId());
                            if (userFull2 != null) {
                                userFull2.flags2 &= -9;
                                userFull2.business_away_message = null;
                                MessagesStorage.getInstance(i12).updateUserInfo(userFull2, true);
                            }
                        }
                    }
                    f10.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                    messagesStorage.getStorageQueue().postRunnable(new p0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                m1.X(m1Var);
                break;
            default:
                ((t0) this.b).run();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.a) {
            case 3:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((x3) this.b).V((j51) obj);
                break;
            case 4:
            case 5:
            case 8:
            default:
                View view = (View) obj2;
                Integer num = (Integer) obj3;
                Float f10 = (Float) obj4;
                Float f11 = (Float) obj5;
                if (((r3[]) this.b)[0] != null) {
                    num.intValue();
                    f10.floatValue();
                    f11.floatValue();
                    if (view instanceof v5) {
                        ((v5) view).B();
                        break;
                    }
                }
                break;
            case 6:
                x0 x0Var = (x0) this.b;
                j51 j51Var = (j51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i11 = j51Var.d;
                if (i11 == -1) {
                    boolean z4 = !x0Var.e;
                    x0Var.e = z4;
                    ((s8) view2).setChecked(z4);
                    x0Var.a.V2.N(true);
                    x0Var.Y(true);
                    break;
                } else if (i11 == -2) {
                    r1 r1Var = new r1(null);
                    r1Var.n = x0Var.r;
                    r1Var.c = new v1(19, x0Var, view2);
                    x0Var.presentFragment(r1Var);
                    break;
                } else if (j51Var.a == 5 && i11 >= 0 && i11 < x0Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue < view2.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i12 = (j51Var.d + 6) % 7;
                        int i13 = 0;
                        for (int i14 = 0; i14 < x0Var.h[i12].size(); i14++) {
                            if (((w0) x0Var.h[i12].get(i14)).b > i13) {
                                i13 = ((w0) x0Var.h[i12].get(i14)).b;
                            }
                        }
                        int max = Math.max(0, i13 - 1439);
                        int i15 = (j51Var.d + 1) % 7;
                        int i16 = 1440;
                        for (int i17 = 0; i17 < x0Var.h[i15].size(); i17++) {
                            if (((w0) x0Var.h[i15].get(i17)).a < i16) {
                                i16 = ((w0) x0Var.h[i15].get(i17)).a;
                            }
                        }
                        int i18 = i16 + 1439;
                        CharSequence charSequence = j51Var.l;
                        ArrayList arrayList = x0Var.h[j51Var.d];
                        int i19 = 0;
                        for (int i20 = 0; i20 < 7; i20++) {
                            ArrayList arrayList2 = x0Var.h[i20];
                            if (arrayList2 != null) {
                                i19 = Math.max(1, arrayList2.size()) + i19;
                            }
                        }
                        z0 z0Var = new z0(charSequence, arrayList, max, i18, 28 - i19);
                        z0Var.f = new v9(x0Var, 23);
                        z0Var.h = new vf.d0(2, x0Var, j51Var);
                        x0Var.presentFragment(z0Var);
                        break;
                    } else {
                        if (x0Var.h[j51Var.d].isEmpty()) {
                            ((org.telegram.ui.Cells.j5) view2).setChecked(true);
                            x0Var.h[j51Var.d].add(new w0(0, 1439));
                            x0Var.X(j51Var.d);
                        } else {
                            x0Var.h[j51Var.d].clear();
                            ((org.telegram.ui.Cells.j5) view2).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.j5) view2).setValue(x0.a0(x0Var.h[j51Var.d]));
                        x0Var.Y(true);
                        break;
                    }
                }
                break;
            case 7:
                final z0 z0Var2 = (z0) this.b;
                j51 j51Var2 = (j51) obj;
                final View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i21 = z0Var2.c;
                int i22 = z0Var2.d;
                ArrayList arrayList3 = z0Var2.b;
                int i23 = j51Var2.d;
                if (i23 == -1) {
                    z0Var2.r = !z0Var2.r;
                    arrayList3.clear();
                    if (z0Var2.r) {
                        arrayList3.add(new w0(0, 1439));
                    }
                    s8 s8Var = (s8) view3;
                    boolean z10 = z0Var2.r;
                    j51Var2.e = z10;
                    s8Var.setChecked(z10);
                    boolean z11 = z0Var2.r;
                    s8Var.b(k6.w0(null, z11 ? k6.f6 : k6.e6, false), z11);
                    z0Var2.n.V2.N(true);
                    v9 v9Var = z0Var2.f;
                    if (v9Var != null) {
                        v9Var.run();
                        break;
                    }
                } else if (i23 == -2) {
                    if (arrayList3.isEmpty() || z0Var2.U()) {
                        if (z0Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp = Utilities.clamp(480, i22 - 1, i21);
                        arrayList3.add(new w0(clamp, Utilities.clamp(1200, i22, clamp + 1)));
                    } else {
                        int i24 = ((w0) l.d.i(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i24 + 30, i22 - 1, i21);
                        arrayList3.add(new w0(clamp2, Utilities.clamp((i24 + 1560) / 2, i22, clamp2 + 1)));
                    }
                    v9 v9Var2 = z0Var2.f;
                    if (v9Var2 != null) {
                        v9Var2.run();
                    }
                    z0Var2.n.V2.N(true);
                    break;
                } else if (j51Var2.a == 3 && (i10 = i23 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i25 = i10 - 1;
                    w0 w0Var = i25 >= 0 ? (w0) arrayList3.get(i25) : null;
                    final w0 w0Var2 = (w0) arrayList3.get(i10);
                    int i26 = i10 + 1;
                    w0 w0Var3 = i26 < arrayList3.size() ? (w0) arrayList3.get(i26) : null;
                    int i27 = j51Var2.d % 3;
                    if (i27 == 0) {
                        Activity parentActivity = z0Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i28 = w0Var2.a;
                        if (w0Var != null) {
                            i21 = w0Var.b + 1;
                        }
                        final int i29 = 0;
                        z4.X(parentActivity, string, i28, i21, w0Var2.b - 1, new Utilities.Callback() { // from class: vf.y0
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (i29) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        o8 o8Var = (o8) view3;
                                        int intValue = num2.intValue();
                                        w0Var2.a = intValue;
                                        o8Var.u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.n.V2.N(true);
                                        }
                                        v9 v9Var3 = z0Var3.f;
                                        if (v9Var3 != null) {
                                            v9Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        o8 o8Var2 = (o8) view3;
                                        int intValue2 = num2.intValue();
                                        w0Var2.b = intValue2;
                                        o8Var2.u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.n.V2.N(true);
                                        }
                                        v9 v9Var4 = z0Var4.f;
                                        if (v9Var4 != null) {
                                            v9Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i27 == 1) {
                        Activity parentActivity2 = z0Var2.getParentActivity();
                        String string2 = LocaleController.getString(R.string.BusinessHoursDayCloseHourPicker);
                        int i30 = w0Var2.b;
                        int i31 = w0Var2.a + 1;
                        if (w0Var3 != null) {
                            i22 = w0Var3.a - 1;
                        }
                        final int i32 = 1;
                        z4.X(parentActivity2, string2, i30, i31, i22, new Utilities.Callback() { // from class: vf.y0
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (i32) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        o8 o8Var = (o8) view3;
                                        int intValue = num2.intValue();
                                        w0Var2.a = intValue;
                                        o8Var.u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.n.V2.N(true);
                                        }
                                        v9 v9Var3 = z0Var3.f;
                                        if (v9Var3 != null) {
                                            v9Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        o8 o8Var2 = (o8) view3;
                                        int intValue2 = num2.intValue();
                                        w0Var2.b = intValue2;
                                        o8Var2.u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.n.V2.N(true);
                                        }
                                        v9 v9Var4 = z0Var4.f;
                                        if (v9Var4 != null) {
                                            v9Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i27 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new w0(0, 1439));
                        }
                        z0Var2.n.V2.N(true);
                        v9 v9Var3 = z0Var2.f;
                        if (v9Var3 != null) {
                            v9Var3.run();
                            break;
                        }
                    }
                }
                break;
            case 9:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                r1.U((r1) this.b, (j51) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.ui.jy
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, mf1 mf1Var) {
        c4 c4Var = (c4) this.b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        c4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        pyVar.finishFragment();
        return true;
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
