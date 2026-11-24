// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xz2 implements Runnable {
    public final /* synthetic */ boolean[] E;
    public final /* synthetic */ p8c F;
    public final /* synthetic */ fx0 G;
    public final /* synthetic */ eg H;
    public final /* synthetic */ wjb I;
    public final /* synthetic */ mhb J;
    public final /* synthetic */ Context K;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ it3 c;
    public final /* synthetic */ TreeSet d;
    public final /* synthetic */ String[] e;
    public final /* synthetic */ wz2 f;
    public final /* synthetic */ it3 h;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ tn6 r;
    public final /* synthetic */ u41 s;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ TLRPC.User y;

    public /* synthetic */ xz2(boolean[] zArr, int[] iArr, it3 it3Var, TreeSet treeSet, String[] strArr, wz2 wz2Var, it3 it3Var2, int[] iArr2, tn6 tn6Var, u41 u41Var, boolean z, int i, TLRPC.User user, boolean[] zArr2, p8c p8cVar, fx0 fx0Var, eg egVar, wjb wjbVar, mhb mhbVar, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = it3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = wz2Var;
        this.h = it3Var2;
        this.n = iArr2;
        this.r = tn6Var;
        this.s = u41Var;
        this.w = z;
        this.x = i;
        this.y = user;
        this.E = zArr2;
        this.F = p8cVar;
        this.G = fx0Var;
        this.H = egVar;
        this.I = wjbVar;
        this.J = mhbVar;
        this.K = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final it3 it3Var = this.h;
        ht3 ht3Var = it3Var.d;
        final boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        final int[] iArr = this.b;
        if (iArr[0] < 0) {
            final it3 it3Var2 = this.c;
            String charSequence = it3Var2.getText().toString();
            StringBuilder r = tb4.r(charSequence);
            boolean a = a03.a(charSequence, "bot");
            final TreeSet treeSet = this.d;
            r.append((a || a03.c(charSequence, treeSet) != null) ? "" : "bot");
            String sb = r.toString();
            final String[] strArr = this.e;
            if (!TextUtils.equals(strArr[0], sb)) {
                this.f.run();
                return;
            }
            String trim = ht3Var.getText().toString().trim();
            boolean isEmpty = TextUtils.isEmpty(trim);
            final int[] iArr2 = this.n;
            if (isEmpty) {
                int i = -iArr2[0];
                iArr2[0] = i;
                gl.A3(i, it3Var, null);
                return;
            }
            this.r.run();
            final u41 u41Var = this.s;
            u41Var.setLoading(true);
            u41Var.setEnabled(false);
            ht3Var.setEnabled(false);
            it3Var2.d.setEnabled(false);
            final TL_bots.createBot createbot = new TL_bots.createBot();
            createbot.via_deeplink = this.w;
            createbot.username = strArr[0];
            createbot.name = trim;
            final int i2 = this.x;
            na7 q1 = na7.q1(i2);
            final TLRPC.User user = this.y;
            createbot.manager_id = q1.o1(user);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
            hc hcVar = new hc((byte) 0);
            final boolean[] zArr2 = this.E;
            final p8c p8cVar = this.F;
            final fx0 fx0Var = this.G;
            final eg egVar = this.H;
            final wjb wjbVar = this.I;
            final mhb mhbVar = this.J;
            final Context context = this.K;
            iArr[0] = connectionsManager.sendRequestTyped(createbot, hcVar, new i8c() { // from class: tz2
                @Override // i8c
                public final void a(Object obj, Object obj2) {
                    String r2;
                    TLRPC.User user2 = (TLRPC.User) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    if (zArr[0]) {
                        return;
                    }
                    iArr[0] = -1;
                    u41 u41Var2 = u41Var;
                    u41Var2.setLoading(false);
                    u41Var2.setEnabled(true);
                    it3Var.d.setEnabled(true);
                    it3Var2.d.setEnabled(true);
                    int i3 = i2;
                    fx0 fx0Var2 = fx0Var;
                    if (user2 != null) {
                        zArr2[0] = true;
                        na7.q1(i3).a4(user2, false, false);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(user2);
                        ad7.Y(i3).j1(arrayList, null, false, false);
                        p8cVar.a(user2);
                        fx0Var2.dismiss();
                        return;
                    }
                    if (tL_error != null) {
                        String str = createbot.username;
                        String str2 = tL_error.text;
                        TreeSet treeSet2 = treeSet;
                        eg egVar2 = egVar;
                        wjb wjbVar2 = wjbVar;
                        CharSequence d = a03.d(i3, str, treeSet2, str2, egVar2, wjbVar2);
                        if (d != null) {
                            strArr[0] = null;
                            u41Var2.setEnabled(false);
                            mhb mhbVar2 = mhbVar;
                            mhbVar2.setText(d);
                            zkb.X(mhbVar2.getTextView(), bkb.p7, wjbVar2);
                            int[] iArr3 = iArr2;
                            int i4 = -iArr3[0];
                            iArr3[0] = i4;
                            gl.A3(i4, mhbVar2, null);
                        } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                            gr grVar = na7.q1(i3).k4;
                            boolean p = y6c.h(i3).p();
                            u21 u21Var = new u21(fx0Var2.F, wjbVar2);
                            String M0 = k96.M0(2131751723, null);
                            SpannableStringBuilder K2 = gl.K2(p ? k96.a0(null, null, 2131751726, Integer.valueOf(grVar.Q.f())) : k96.a0(null, null, 2131751725, Integer.valueOf(grVar.Q.f()), Integer.valueOf(grVar.P.f())), bkb.v0(bkb.wj, wjbVar2), new rw0(fx0Var2, (byte) 3));
                            gu2 gu2Var = new gu2(fx0Var2, context, (byte) 9);
                            int t = gl.t(K2, "@BotFather");
                            if (t >= 0) {
                                K2.setSpan(new q1((Object) wjbVar2, (Runnable) gu2Var, (byte) 6), t, t + 10, 33);
                            }
                            m21 I = u21Var.I(R.raw.error, M0, K2);
                            I.j = 8000;
                            I.j();
                        } else {
                            String str3 = tL_error.text;
                            if (str3 != null && str3.startsWith("FLOOD_WAIT_")) {
                                new u21(fx0Var2.F, wjbVar2).I(R.raw.error, k96.M0(2131751723, null), k96.a0(null, null, 2131751724, k96.z(Integer.parseInt(tL_error.text.substring(11))))).j();
                            } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                TLRPC.User user3 = user;
                                if (TextUtils.isEmpty(l7c.p(user3))) {
                                    r2 = l7c.r(user3);
                                } else {
                                    r2 = "@" + l7c.p(user3);
                                }
                                new u21(fx0Var2.F, wjbVar2).Q(R.raw.error, 36, gl.L2(bkb.v0(bkb.wj, wjbVar2), k96.a0(null, null, 2131751718, r2))).j();
                            } else {
                                ug8.u(fx0Var2.F, wjbVar2, tL_error, false);
                            }
                        }
                        gl.t1(fx0Var2.getCurrentFocus());
                    }
                }
            }, 1024);
        }
    }
}
