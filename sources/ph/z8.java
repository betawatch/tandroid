package ph;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ky;
import org.telegram.ui.qy;
import org.telegram.ui.sf1;
import ph.ga;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements CameraController.VideoTakeCallback, n2.a, org.telegram.ui.ActionBar.c2, Utilities.Callback5, t0.e, r3.c, st, vh.m0, ky, vh.k5, xd.b, r8.e, c9.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean I(qy qyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.st
    public void J() {
        switch (this.a) {
            case 12:
                vh.r0 r0Var = (vh.r0) this.b;
                vh.e1 e1Var = r0Var.d;
                vh.a aVar = r0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = e1Var.B;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = vh.y5.f(e1Var.getText());
                    }
                }
                vh.a3 a3Var = r0Var.h;
                if (a3Var != null && r0Var.f != null) {
                    vh.s3.N1(a3Var.a);
                    break;
                }
                break;
            case 17:
                ((vh.b5) this.b).h();
                break;
            default:
                vh.j5 j5Var = (vh.j5) this.b;
                vh.a aVar2 = j5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = j5Var.r.B;
                }
                j5Var.u();
                vh.z2 z2Var = j5Var.B;
                if (z2Var != null && j5Var.a != null) {
                    vh.s3.N1(z2Var.a);
                    break;
                }
                break;
        }
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((Switch) this.b).invalidate();
    }

    @Override // vh.m0
    public p70 a(vh.e1 e1Var) {
        return p70.H((vh.y1) ((zz) this.b).b, e1Var);
    }

    @Override // r8.e
    public Object apply(Object obj) {
        z3.o oVar = (z3.o) obj;
        ((z3.i) this.b).getClass();
        return oVar;
    }

    public o4.h0 b(s5.m mVar) {
        w2.b bVar = (w2.b) this.b;
        URL url = (URL) mVar.b;
        String c3 = j7.i0.c("CctTransportBackend");
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
                    tp0 tp0Var = bVar.a;
                    x2.i iVar = (x2.i) mVar.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    w9.d dVar = (w9.d) tp0Var.b;
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
                    String c10 = j7.i0.c("CctTransportBackend");
                    if (Log.isLoggable(c10, 4)) {
                        Log.i(c10, String.format("Status Code: %d", valueOf));
                    }
                    j7.i0.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    j7.i0.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new o4.h0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new o4.h0(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            o4.h0 h0Var = new o4.h0(responseCode, null, x2.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
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
        } catch (ConnectException e) {
            e = e;
            j7.i0.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new o4.h0(500, null, 0L);
        } catch (UnknownHostException e6) {
            e = e6;
            j7.i0.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new o4.h0(500, null, 0L);
        } catch (IOException e10) {
            e = e10;
            j7.i0.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new o4.h0(400, null, 0L);
        } catch (u9.b e11) {
            e = e11;
            j7.i0.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new o4.h0(400, null, 0L);
        }
    }

    public void c(int i10) {
        vh.z zVar = (vh.z) this.b;
        zVar.c = i10;
        zVar.f(i10);
    }

    @Override // c9.f
    public Object d0(c5.j jVar) {
        return new z9.c((Context) jVar.a(Context.class), ((w8.g) jVar.a(w8.g.class)).d(), jVar.x(z9.d.class), jVar.c(ja.b.class), (Executor) jVar.f((c9.u) this.b));
    }

    @Override // t0.e
    public boolean h(t0.i iVar, int i10, Bundle bundle) {
        r0.e eVar;
        m.s sVar = (m.s) this.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.a.b();
                Parcelable parcelable = (Parcelable) iVar.a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
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

    @Override // n2.a
    public void i(WebView webView, b4.e0 e0Var, Uri uri, boolean z4, o2.f fVar) {
        o2.f fVar2;
        rf.j jVar = (rf.j) this.b;
        if (webView == jVar.m && z4 && jVar.d.equals(uri.toString())) {
            int i10 = e0Var.b;
            if (i10 == 0) {
                e0Var.e(0);
                jVar.g((String) e0Var.c, fVar);
                return;
            }
            if (i10 == 1) {
                synchronized (jVar.a) {
                    if (!jVar.p && (fVar2 = jVar.n) != null && fVar2 == fVar) {
                        e0Var.e(1);
                        byte[] bArr = (byte[]) e0Var.d;
                        Objects.requireNonNull(bArr);
                        jVar.i.execute(new e6(11, jVar, bArr));
                    }
                }
            }
        }
    }

    @Override // r3.c
    public long k(long j10) {
        return h5.d0.i((j10 * r0.e) / 1000000, 0L, ((r3.o) this.b).j - 1);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        switch (this.a) {
            case 2:
                ((rh.d) this.b).run();
                break;
            case 3:
                rh.j jVar = (rh.j) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().getInputUser(jVar.M);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(jVar.getParentActivity(), 3, null);
                d2Var2.q(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new rh.b(jVar, d2Var2, 0));
                break;
            case 9:
                uf.m1 m1Var = ((uf.f1) this.b).a;
                i11 = ((org.telegram.ui.ActionBar.p2) m1Var).currentAccount;
                uf.p1 f10 = uf.p1.f(i11);
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
                        uf.o1 c3 = f10.c(((Integer) arrayList.get(i14)).intValue());
                        f10.b.remove(c3);
                        f10.a(c3.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c3.a;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new nh.p5(20));
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
                uf.m1.X(m1Var);
                break;
            default:
                ((cg.u0) this.b).run();
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        a9 a9Var = (a9) this.b;
        da daVar = a9Var.a;
        s5 s5Var = daVar.L0;
        int i10 = daVar.c;
        if (s5Var != null) {
            s5Var.g(true);
        }
        if (daVar.q0()) {
            daVar.s.d();
        }
        if (daVar.D1 == null || daVar.y0 == null) {
            return;
        }
        daVar.N1 = false;
        daVar.O1 = false;
        o5 o5Var = daVar.z0;
        if (o5Var != null) {
            o5Var.c(false);
        }
        if (j10 <= 800) {
            daVar.h(false, true);
            daVar.d0(false);
            daVar.G0.b(false, true);
            s5 s5Var2 = daVar.L0;
            if (s5Var2 != null) {
                s5Var2.g(true);
            }
            try {
                daVar.D1.delete();
                daVar.D1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            }
            return;
        }
        daVar.i0(false, true);
        t6 o10 = t6.o(daVar.D1, str, j10);
        o10.J0 = daVar.s0;
        o10.K0 = daVar.t0;
        o10.B();
        daVar.h(false, true);
        daVar.d0(false);
        daVar.G0.b(false, true);
        s5 s5Var3 = daVar.L0;
        if (s5Var3 != null) {
            s5Var3.g(true);
        }
        if (!daVar.x0.j()) {
            daVar.H1 = o10;
            f8.a(i10, o10);
            daVar.I1 = false;
            int videoWidth = daVar.y0.getVideoWidth();
            int videoHeight = daVar.y0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                t6 t6Var = daVar.H1;
                t6Var.k0 = videoWidth;
                t6Var.l0 = videoHeight;
                t6Var.A();
            }
            daVar.L(new x8(a9Var, 3), 0L);
            return;
        }
        daVar.D1 = null;
        o10.P = 1.0f;
        if (daVar.x0.l(o10)) {
            t6 a2 = t6.a(daVar.x0.getLayout(), daVar.x0.getContent());
            daVar.H1 = a2;
            f8.a(i10, a2);
            daVar.I1 = false;
            int videoWidth2 = daVar.y0.getVideoWidth();
            int videoHeight2 = daVar.y0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                t6 t6Var2 = daVar.H1;
                t6Var2.k0 = videoWidth2;
                t6Var2.l0 = videoHeight2;
                t6Var2.A();
            }
        }
        daVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        switch (this.a) {
            case 4:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((rh.x3) this.b).V((i51) obj);
                break;
            case 5:
            case 6:
            case 9:
            default:
                View view = (View) obj2;
                Integer num = (Integer) obj3;
                Float f10 = (Float) obj4;
                Float f11 = (Float) obj5;
                if (((vh.s3[]) this.b)[0] != null) {
                    num.intValue();
                    f10.floatValue();
                    f11.floatValue();
                    if (view instanceof vh.w5) {
                        ((vh.w5) view).B();
                        break;
                    }
                }
                break;
            case 7:
                uf.x0 x0Var = (uf.x0) this.b;
                i51 i51Var = (i51) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                float floatValue = ((Float) obj4).floatValue();
                ((Float) obj5).getClass();
                int i11 = i51Var.d;
                if (i11 == -1) {
                    boolean z4 = !x0Var.e;
                    x0Var.e = z4;
                    ((org.telegram.ui.Cells.r8) view2).setChecked(z4);
                    x0Var.a.V2.N(true);
                    x0Var.Y(true);
                    break;
                } else if (i11 == -2) {
                    uf.r1 r1Var = new uf.r1(null);
                    r1Var.n = x0Var.r;
                    r1Var.c = new s1(17, x0Var, view2);
                    x0Var.presentFragment(r1Var);
                    break;
                } else if (i51Var.a == 5 && i11 >= 0 && i11 < x0Var.h.length) {
                    if (!LocaleController.isRTL ? floatValue < view2.getMeasuredWidth() - AndroidUtilities.dp(76.0f) : floatValue > AndroidUtilities.dp(76.0f)) {
                        int i12 = (i51Var.d + 6) % 7;
                        int i13 = 0;
                        for (int i14 = 0; i14 < x0Var.h[i12].size(); i14++) {
                            if (((uf.w0) x0Var.h[i12].get(i14)).b > i13) {
                                i13 = ((uf.w0) x0Var.h[i12].get(i14)).b;
                            }
                        }
                        int max = Math.max(0, i13 - 1439);
                        int i15 = (i51Var.d + 1) % 7;
                        int i16 = 1440;
                        for (int i17 = 0; i17 < x0Var.h[i15].size(); i17++) {
                            if (((uf.w0) x0Var.h[i15].get(i17)).a < i16) {
                                i16 = ((uf.w0) x0Var.h[i15].get(i17)).a;
                            }
                        }
                        int i18 = i16 + 1439;
                        CharSequence charSequence = i51Var.l;
                        ArrayList arrayList = x0Var.h[i51Var.d];
                        int i19 = 0;
                        for (int i20 = 0; i20 < 7; i20++) {
                            ArrayList arrayList2 = x0Var.h[i20];
                            if (arrayList2 != null) {
                                i19 = Math.max(1, arrayList2.size()) + i19;
                            }
                        }
                        uf.z0 z0Var = new uf.z0(charSequence, arrayList, max, i18, 28 - i19);
                        z0Var.f = new ga(x0Var, 22);
                        z0Var.h = new uf.d0(2, x0Var, i51Var);
                        x0Var.presentFragment(z0Var);
                        break;
                    } else {
                        if (x0Var.h[i51Var.d].isEmpty()) {
                            ((org.telegram.ui.Cells.i5) view2).setChecked(true);
                            x0Var.h[i51Var.d].add(new uf.w0(0, 1439));
                            x0Var.X(i51Var.d);
                        } else {
                            x0Var.h[i51Var.d].clear();
                            ((org.telegram.ui.Cells.i5) view2).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.i5) view2).setValue(uf.x0.a0(x0Var.h[i51Var.d]));
                        x0Var.Y(true);
                        break;
                    }
                }
                break;
            case 8:
                final uf.z0 z0Var2 = (uf.z0) this.b;
                i51 i51Var2 = (i51) obj;
                final View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i21 = z0Var2.c;
                int i22 = z0Var2.d;
                ArrayList arrayList3 = z0Var2.b;
                int i23 = i51Var2.d;
                if (i23 == -1) {
                    z0Var2.r = !z0Var2.r;
                    arrayList3.clear();
                    if (z0Var2.r) {
                        arrayList3.add(new uf.w0(0, 1439));
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view3;
                    boolean z10 = z0Var2.r;
                    i51Var2.e = z10;
                    r8Var.setChecked(z10);
                    boolean z11 = z0Var2.r;
                    r8Var.b(org.telegram.ui.ActionBar.j6.w0(null, z11 ? org.telegram.ui.ActionBar.j6.f6 : org.telegram.ui.ActionBar.j6.e6, false), z11);
                    z0Var2.n.V2.N(true);
                    ga gaVar = z0Var2.f;
                    if (gaVar != null) {
                        gaVar.run();
                        break;
                    }
                } else if (i23 == -2) {
                    if (arrayList3.isEmpty() || z0Var2.U()) {
                        if (z0Var2.U()) {
                            arrayList3.clear();
                        }
                        int clamp = Utilities.clamp(480, i22 - 1, i21);
                        arrayList3.add(new uf.w0(clamp, Utilities.clamp(1200, i22, clamp + 1)));
                    } else {
                        int i24 = ((uf.w0) kf.k0.i(1, arrayList3)).b;
                        int clamp2 = Utilities.clamp(i24 + 30, i22 - 1, i21);
                        arrayList3.add(new uf.w0(clamp2, Utilities.clamp((i24 + 1560) / 2, i22, clamp2 + 1)));
                    }
                    ga gaVar2 = z0Var2.f;
                    if (gaVar2 != null) {
                        gaVar2.run();
                    }
                    z0Var2.n.V2.N(true);
                    break;
                } else if (i51Var2.a == 3 && (i10 = i23 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i25 = i10 - 1;
                    uf.w0 w0Var = i25 >= 0 ? (uf.w0) arrayList3.get(i25) : null;
                    final uf.w0 w0Var2 = (uf.w0) arrayList3.get(i10);
                    int i26 = i10 + 1;
                    uf.w0 w0Var3 = i26 < arrayList3.size() ? (uf.w0) arrayList3.get(i26) : null;
                    int i27 = i51Var2.d % 3;
                    if (i27 == 0) {
                        Activity parentActivity = z0Var2.getParentActivity();
                        String string = LocaleController.getString(R.string.BusinessHoursDayOpenHourPicker);
                        int i28 = w0Var2.a;
                        if (w0Var != null) {
                            i21 = w0Var.b + 1;
                        }
                        final int i29 = 0;
                        org.telegram.ui.Components.z4.X(parentActivity, string, i28, i21, w0Var2.b - 1, new Utilities.Callback() { // from class: uf.y0
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (i29) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        n8 n8Var = (n8) view3;
                                        int intValue = num2.intValue();
                                        w0Var2.a = intValue;
                                        n8Var.u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.n.V2.N(true);
                                        }
                                        ga gaVar3 = z0Var3.f;
                                        if (gaVar3 != null) {
                                            gaVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        n8 n8Var2 = (n8) view3;
                                        int intValue2 = num2.intValue();
                                        w0Var2.b = intValue2;
                                        n8Var2.u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.n.V2.N(true);
                                        }
                                        ga gaVar4 = z0Var4.f;
                                        if (gaVar4 != null) {
                                            gaVar4.run();
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
                        org.telegram.ui.Components.z4.X(parentActivity2, string2, i30, i31, i22, new Utilities.Callback() { // from class: uf.y0
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj6) {
                                Integer num2 = (Integer) obj6;
                                switch (i32) {
                                    case 0:
                                        z0 z0Var3 = z0Var2;
                                        boolean V = z0Var3.V();
                                        n8 n8Var = (n8) view3;
                                        int intValue = num2.intValue();
                                        w0Var2.a = intValue;
                                        n8Var.u(w0.a(intValue), true);
                                        if (V != z0Var3.V()) {
                                            z0Var3.n.V2.N(true);
                                        }
                                        ga gaVar3 = z0Var3.f;
                                        if (gaVar3 != null) {
                                            gaVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        z0 z0Var4 = z0Var2;
                                        boolean V2 = z0Var4.V();
                                        n8 n8Var2 = (n8) view3;
                                        int intValue2 = num2.intValue();
                                        w0Var2.b = intValue2;
                                        n8Var2.u(w0.a(intValue2), true);
                                        if (V2 != z0Var4.V()) {
                                            z0Var4.n.V2.N(true);
                                        }
                                        ga gaVar4 = z0Var4.f;
                                        if (gaVar4 != null) {
                                            gaVar4.run();
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
                            arrayList3.add(new uf.w0(0, 1439));
                        }
                        z0Var2.n.V2.N(true);
                        ga gaVar3 = z0Var2.f;
                        if (gaVar3 != null) {
                            gaVar3.run();
                            break;
                        }
                    }
                }
                break;
            case 10:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                uf.r1.U((uf.r1) this.b, (i51) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.ui.ky
    public boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        vh.d4 d4Var = (vh.d4) this.b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        d4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        qyVar.finishFragment();
        return true;
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
