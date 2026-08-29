package sf;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import h7.j5;
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
import lh.o5;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.w41;
import org.telegram.ui.fy;
import org.telegram.ui.yx;
import org.telegram.ui.ze1;
import th.a4;
import th.g5;
import th.h5;
import th.p3;
import th.t5;
import th.v5;
import th.w2;
import th.x1;
import th.x2;
import th.y4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements b2, Utilities.Callback5, t0.e, qt, th.l0, yx, h5, m3.j, vd.b, p8.e, a9.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // a9.e
    public Object I0(a5.j jVar) {
        return new x9.c((Context) jVar.a(Context.class), ((u8.g) jVar.a(u8.g.class)).d(), jVar.r(x9.d.class), jVar.c(ha.b.class), (Executor) jVar.d((a9.v) this.b));
    }

    @Override // org.telegram.ui.yx
    public /* synthetic */ boolean J(fy fyVar) {
        return false;
    }

    @Override // vd.b
    public void N(int i10, float f9, float f10, vd.c cVar) {
        ((Switch) this.b).invalidate();
    }

    @Override // m3.j
    public void a(m3.k kVar) {
        u4.i iVar = (u4.i) this.b;
        u4.h hVar = (u4.h) kVar;
        hVar.clear();
        iVar.b.add(hVar);
    }

    @Override // p8.e
    public Object apply(Object obj) {
        w3.o oVar = (w3.o) obj;
        ((w3.i) this.b).getClass();
        return oVar;
    }

    @Override // th.l0
    public j70 b(th.d1 d1Var) {
        return j70.H((x1) ((o1.a) this.b).b, d1Var);
    }

    public l4.y0 c(v5.c cVar) {
        w2.b bVar = (w2.b) this.b;
        URL url = (URL) cVar.b;
        String c3 = j5.c("CctTransportBackend");
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
        String str = (String) cVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    o1.a aVar = bVar.a;
                    x2.i iVar = (x2.i) cVar.d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    u9.d dVar = (u9.d) aVar.b;
                    u9.e eVar = new u9.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar.h(iVar);
                    eVar.j();
                    eVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c6 = j5.c("CctTransportBackend");
                    if (Log.isLoggable(c6, 4)) {
                        Log.i(c6, String.format("Status Code: %d", valueOf));
                    }
                    j5.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    j5.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new l4.y0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new l4.y0(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            l4.y0 y0Var = new l4.y0(responseCode, null, x2.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return y0Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e10) {
            e = e10;
            j5.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new l4.y0(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            j5.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new l4.y0(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            j5.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new l4.y0(400, null, 0L);
        } catch (s9.b e13) {
            e = e13;
            j5.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new l4.y0(400, null, 0L);
        }
    }

    public void d(int i10) {
        th.y yVar = (th.y) this.b;
        yVar.c = i10;
        yVar.f(i10);
    }

    @Override // org.telegram.ui.Components.qt
    public void e1() {
        switch (this.a) {
            case 4:
                th.q0 q0Var = (th.q0) this.b;
                th.d1 d1Var = q0Var.d;
                th.a aVar = q0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = d1Var.A;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = v5.f(d1Var.getText());
                    }
                }
                x2 x2Var = q0Var.h;
                if (x2Var != null && q0Var.f != null) {
                    p3.O1(x2Var.a);
                    break;
                }
                break;
            case 9:
                ((y4) this.b).h();
                break;
            default:
                g5 g5Var = (g5) this.b;
                th.a aVar2 = g5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = g5Var.r.A;
                }
                g5Var.u();
                w2 w2Var = g5Var.A;
                if (w2Var != null && g5Var.a != null) {
                    p3.O1(w2Var.a);
                    break;
                }
                break;
        }
    }

    @Override // t0.e
    public boolean f(t0.i iVar, int i10, Bundle bundle) {
        r0.e eVar;
        m.t tVar = (m.t) this.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.a.d();
                Parcelable parcelable = (Parcelable) iVar.a.k();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        t0.h hVar = iVar.a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i11 >= 31) {
            eVar = new r0.d(clipData, 2);
        } else {
            r0.f fVar = new r0.f();
            fVar.b = clipData;
            fVar.c = 2;
            eVar = fVar;
        }
        eVar.b(hVar.f());
        eVar.setExtras(bundle);
        return r0.j0.i(tVar, eVar.build()) == null;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        int i11;
        switch (this.a) {
            case 0:
                n1 n1Var = ((g1) this.b).a;
                i11 = ((o2) n1Var).currentAccount;
                s1 f9 = s1.f(i11);
                ArrayList arrayList = n1Var.b;
                int i12 = f9.a;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    if (f9.c(((Integer) arrayList.get(i13)).intValue()) == null) {
                        arrayList.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        r1 c3 = f9.c(((Integer) arrayList.get(i14)).intValue());
                        f9.b.remove(c3);
                        f9.a(c3.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c3.a;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new o5(20));
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
                    f9.l();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                    messagesStorage.getStorageQueue().postRunnable(new nh.w0(2, arrayList, messagesStorage));
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
                n1.X(n1Var);
                break;
            default:
                ((ag.w0) this.b).run();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 1:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                u1.U((u1) this.b, (w41) obj, (View) obj2);
                break;
            default:
                View view = (View) obj2;
                Integer num = (Integer) obj3;
                Float f9 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (((p3[]) this.b)[0] != null) {
                    num.intValue();
                    f9.floatValue();
                    f10.floatValue();
                    if (view instanceof t5) {
                        ((t5) view).B();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.yx
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        a4 a4Var = (a4) this.b;
        if (arrayList.isEmpty() || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId <= 0) {
            return false;
        }
        a4Var.run(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        fyVar.finishFragment();
        return true;
    }

    @Override // vd.b
    public /* synthetic */ void z(float f9, int i10) {
    }
}
