// default package

import android.content.Context;
import android.content.Intent;
import android.text.Spannable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class uk2 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ uk2(dl2 dl2Var, long j, al2 al2Var, int i, boolean z, wm4 wm4Var) {
        this.e = dl2Var;
        this.c = j;
        this.f = al2Var;
        this.b = i;
        this.d = z;
        this.h = wm4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x018a A[Catch: all -> 0x01aa, TryCatch #0 {, blocks: (B:62:0x0133, B:64:0x013d, B:66:0x0149, B:68:0x0151, B:71:0x0158, B:73:0x015e, B:75:0x0168, B:81:0x0172, B:82:0x0179, B:84:0x018a, B:86:0x0193, B:88:0x0199, B:89:0x01a4, B:93:0x01a6), top: B:61:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0199 A[Catch: all -> 0x01aa, TryCatch #0 {, blocks: (B:62:0x0133, B:64:0x013d, B:66:0x0149, B:68:0x0151, B:71:0x0158, B:73:0x015e, B:75:0x0168, B:81:0x0172, B:82:0x0179, B:84:0x018a, B:86:0x0193, B:88:0x0199, B:89:0x01a4, B:93:0x01a6), top: B:61:0x0133 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        cyc cycVar;
        TLRPC.User user;
        switch (this.a) {
            case 0:
                dl2 dl2Var = (dl2) this.e;
                long j = this.c;
                al2 al2Var = (al2) this.f;
                int i = this.b;
                boolean z2 = this.d;
                wm4 wm4Var = (wm4) this.h;
                synchronized (el2.d) {
                    Spannable spannable = (Spannable) dl2Var.a.get();
                    if (spannable == null || dl2Var.b.get(Long.valueOf(j)) != al2Var) {
                        return;
                    }
                    String str = al2Var.a;
                    if (i <= spannable.length() && i == str.length()) {
                        for (int i2 = 0; i2 < str.length(); i2++) {
                            if (spannable.charAt(i2) == str.charAt(i2)) {
                            }
                        }
                        z = true;
                        if (z && !z2) {
                            el2.a(spannable, i, (f26) wm4Var.b);
                        }
                        dl2Var.b.remove(Long.valueOf(j));
                        if (dl2Var.b.isEmpty()) {
                            el2.e.remove(dl2Var);
                            if (spannable instanceof yk2) {
                                ((yk2) spannable).a = true;
                            }
                        }
                        if (z) {
                            nm7.e().k(nm7.m4, new Object[0]);
                        }
                        return;
                    }
                    z = false;
                    if (z) {
                        el2.a(spannable, i, (f26) wm4Var.b);
                    }
                    dl2Var.b.remove(Long.valueOf(j));
                    if (dl2Var.b.isEmpty()) {
                    }
                    if (z) {
                    }
                    return;
                }
            case 1:
                VoIPPreNotificationService.lambda$show$1((Intent) this.e, (TL_phone.PhoneCall) this.f, (Context) this.h, this.b, this.c, this.d);
                return;
            default:
                z zVar = (z) this.e;
                int i3 = this.b;
                long j2 = this.c;
                JSONObject jSONObject = (JSONObject) this.f;
                String str2 = (String) this.h;
                boolean z3 = this.d;
                if (zVar.A || (cycVar = zVar.R) == null) {
                    return;
                }
                if (i3 != 19) {
                    f8e f8eVar = cycVar.d;
                    if (f8eVar == null) {
                        cycVar.b(3, null, j2);
                        return;
                    }
                    f8eVar.getClass();
                    txc g = wxc.g(cycVar);
                    if (g == null || !g.i || (z3 && !wxc.G(g))) {
                        cycVar.b(3, null, j2);
                        return;
                    }
                    TLRPC.TL_widgetQueryTypeData tL_widgetQueryTypeData = new TLRPC.TL_widgetQueryTypeData();
                    tL_widgetQueryTypeData.with_wallet = z3;
                    wxc.x(g, cycVar, j2, tL_widgetQueryTypeData, str2.getBytes(StandardCharsets.UTF_8));
                    return;
                }
                if (cycVar.d == null) {
                    cycVar.b(3, null, j2);
                    return;
                }
                txc g2 = wxc.g(cycVar);
                if (g2 != null) {
                    long j3 = g2.n;
                    if (j3 != 0) {
                        user = oc7.r1(g2.b).W1(Long.valueOf(j3));
                        d S = LaunchActivity.S();
                        if (g2 != null || !wxc.G(g2) || user == null || !user.bot) {
                            cycVar.b(5, null, j2);
                            return;
                        }
                        if (S == null || S.getContext() == null) {
                            cycVar.b(3, null, j2);
                            return;
                        }
                        byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                        Context context = S.getContext();
                        int i4 = g2.b;
                        ylb resourceProvider = S.getResourceProvider();
                        sxc sxcVar = new sxc(g2, cycVar, j2, bytes);
                        ArrayList arrayList = k55.a;
                        h55 h55Var = new h55(new boolean[]{false}, sxcVar);
                        c C = c.C(i4);
                        boolean[] zArr = {false};
                        qu quVar = new qu((Object) zArr, (Object) context, i4, (Object) user, (Object) jSONObject, (Object) resourceProvider, (Object) h55Var, (byte) 7);
                        if (C.M()) {
                            quVar.run();
                            return;
                        }
                        k55.a.add(quVar);
                        C.x0(quVar);
                        gm.d3(new if4((Object) quVar, (Object) zArr, (Object) h55Var, (byte) 17), 10000L);
                        return;
                    }
                }
                user = null;
                d S2 = LaunchActivity.S();
                if (g2 != null) {
                }
                cycVar.b(5, null, j2);
                return;
        }
    }

    public /* synthetic */ uk2(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i, long j, boolean z) {
        this.e = intent;
        this.f = phoneCall;
        this.h = context;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public /* synthetic */ uk2(z zVar, int i, long j, JSONObject jSONObject, String str, boolean z) {
        this.e = zVar;
        this.b = i;
        this.c = j;
        this.f = jSONObject;
        this.h = str;
        this.d = z;
    }
}
