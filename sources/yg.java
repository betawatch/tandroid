// default package

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yg implements i8c {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yg(int i, long j, f53 f53Var, Context context, TLRPC.Photo photo) {
        this.c = i;
        this.d = j;
        this.e = photo;
        this.b = context;
        this.f = f53Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.d;
        int i = this.c;
        byte b2 = 0;
        Object obj3 = this.f;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj5;
                Context context = (Context) obj4;
                f53 f53Var = (f53) obj3;
                Integer num = (Integer) obj;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = na7.q1(i).h1(j);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputPhoto.access_hash = photo.access_hash;
                reportprofilephoto.photo_id = tL_inputPhoto;
                reportprofilephoto.message = "";
                if (num.intValue() == 0) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonSpam();
                } else if (num.intValue() == 1) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonViolence();
                } else if (num.intValue() == 2) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonChildAbuse();
                } else if (num.intValue() == 5) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPornography();
                } else if (num.intValue() == 3) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonIllegalDrugs();
                } else if (num.intValue() == 4) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPersonalDetails();
                }
                ConnectionsManager.getInstance(i).sendRequest(reportprofilephoto, null);
                new u21(f11.a(context), f53Var).E(f53Var).j();
                break;
            case 1:
                Context context2 = (Context) obj4;
                wjb wjbVar = (wjb) obj5;
                av4 av4Var = (av4) obj3;
                gt4 gt4Var = (gt4) obj;
                if (gt4Var != null) {
                    int i2 = this.c;
                    y6c.h(i2);
                    long n = cf3.n(gt4Var.e.peer);
                    long j2 = this.d;
                    if (j2 != n && j2 != 0 && n != 0) {
                        wy wyVar = new wy(context2, i2, gt4Var, j2, av4Var);
                        TLObject V1 = n >= 0 ? na7.q1(i2).V1(Long.valueOf(n)) : na7.q1(i2).K0(Long.valueOf(-n));
                        TLObject V12 = j2 >= 0 ? na7.q1(i2).V1(Long.valueOf(j2)) : na7.q1(i2).K0(Long.valueOf(-j2));
                        LinearLayout j3 = de9.j(context2, 1);
                        j3.addView(new uqa(context2, V1, V12), nme.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        kk7.i(textView);
                        textView.setText(k96.M0(2131750289, null));
                        int i3 = bkb.i5;
                        tb4.w(textView, i3, wjbVar, 1, 20.0f);
                        textView.setGravity(k96.a0 ? 5 : 3);
                        j3.addView(textView, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context2);
                        zkb.X(textView2, i3, wjbVar);
                        textView2.setTextSize(1, 16.0f);
                        de9.r(null, null, 2131750288, new Object[]{cf3.s(n), cf3.s(j2)}, textView2);
                        j3.addView(textView2, nme.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context2);
                        alertDialog$Builder.n(j3);
                        alertDialog$Builder.j(k96.M0(2131751759, null), new l0(wyVar, (byte) 22));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.a.show();
                        break;
                    } else if (gt4Var.e.bid_date > 0 && !gt4Var.f()) {
                        ty tyVar = new ty(context2, wjbVar, null, gt4Var);
                        tyVar.i2 = av4Var;
                        tyVar.show();
                        break;
                    } else {
                        new ez(context2, wjbVar, j2, gt4Var.d, av4Var).show();
                        break;
                    }
                }
                break;
            case 2:
                w25 w25Var = (w25) obj5;
                p8c p8cVar = (p8c) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null || !(bool instanceof TLRPC.TL_boolTrue)) {
                    p8cVar.a(w25.z(tL_error, "submitResponse"));
                    break;
                } else {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j4 = this.d;
                    int i4 = this.c;
                    if (!optBoolean) {
                        w25Var.d(i4, j4, p8cVar);
                        break;
                    } else {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j4;
                        w25Var.f.sendRequestTyped(tonconnectclosesession, new hc(b2), new g25(w25Var, p8cVar, j4, i4, (byte) 1));
                        break;
                    }
                }
                break;
            default:
                kw8 kw8Var = (kw8) obj5;
                jw8 jw8Var = (jw8) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (kw8Var.x == ((int[]) obj4)[0]) {
                    kw8Var.x = 0;
                }
                if (jw8Var != null && kw8.h(i).get(j) == jw8Var) {
                    if (tL_error2 == null) {
                        jw8Var.b = SystemClock.elapsedRealtime();
                    } else {
                        kw8.h(i).remove(j);
                    }
                }
                if (tL_error2 != null) {
                    fa4.d("QrShare: setShareTheme " + tL_error2.text);
                    if (!kw8Var.F) {
                        vw8 vw8Var = kw8Var.b;
                        vw8Var.getClass();
                        vw8Var.d1(R.drawable.msg_warning, k96.M0(2131751093, null), null);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ yg(w25 w25Var, p8c p8cVar, JSONObject jSONObject, long j, int i) {
        this.e = w25Var;
        this.b = p8cVar;
        this.f = jSONObject;
        this.d = j;
        this.c = i;
    }

    public /* synthetic */ yg(kw8 kw8Var, int[] iArr, jw8 jw8Var, int i, long j) {
        this.e = kw8Var;
        this.b = iArr;
        this.f = jw8Var;
        this.c = i;
        this.d = j;
    }

    public /* synthetic */ yg(Context context, wjb wjbVar, int i, long j, av4 av4Var) {
        this.b = context;
        this.e = wjbVar;
        this.c = i;
        this.d = j;
        this.f = av4Var;
    }
}
