// default package

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p03 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ zd F;
    public final /* synthetic */ nx0 G;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ gp6 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ c51 e;
    public final /* synthetic */ zt3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ cv2 n;
    public final /* synthetic */ ilb r;
    public final /* synthetic */ vnb s;
    public final /* synthetic */ int[] w;
    public final /* synthetic */ Runnable[] x;
    public final /* synthetic */ int[] y;

    public /* synthetic */ p03(boolean[] zArr, int[] iArr, gp6 gp6Var, String[] strArr, c51 c51Var, zt3 zt3Var, TreeSet treeSet, cv2 cv2Var, ilb ilbVar, vnb vnbVar, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i, zd zdVar, nx0 nx0Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = gp6Var;
        this.d = strArr;
        this.e = c51Var;
        this.f = zt3Var;
        this.h = treeSet;
        this.n = cv2Var;
        this.r = ilbVar;
        this.s = vnbVar;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.E = i;
        this.F = zdVar;
        this.G = nx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean[] zArr = this.a;
        if (zArr[0] || this.b[0] >= 0) {
            return;
        }
        this.c.run();
        final String[] strArr = this.d;
        strArr[0] = null;
        final c51 c51Var = this.e;
        c51Var.setLoading(false);
        c51Var.setEnabled(false);
        String charSequence = this.f.getText().toString();
        StringBuilder r = qd4.r(charSequence);
        boolean a = t03.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        r.append((a || t03.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb = r.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final cv2 cv2Var = this.n;
        if (isEmpty) {
            cv2Var.run();
            return;
        }
        int length = sb.length();
        final ilb ilbVar = this.r;
        final vnb vnbVar = this.s;
        if (length < 4 || sb.length() > 32) {
            ilbVar.setText(ob6.M0(sb.length() < 4 ? 2131743309 : 2131743310, null));
            yob.X(ilbVar.getTextView(), aob.q7, vnbVar);
            return;
        }
        ilbVar.setText(ob6.M0(2131743321, null));
        yob.X(ilbVar.getTextView(), aob.B6, vnbVar);
        final int[] iArr = this.w;
        final int i = iArr[0];
        final Runnable[] runnableArr = this.x;
        final int[] iArr2 = this.y;
        final int i2 = this.E;
        final zd zdVar = this.F;
        final nx0 nx0Var = this.G;
        Runnable runnable = new Runnable() { // from class: l03
            @Override // java.lang.Runnable
            public final void run() {
                byte b = 0;
                runnableArr[0] = null;
                final boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                final int[] iArr3 = iArr;
                int i3 = iArr3[0];
                final int i4 = i;
                if (i4 == i3) {
                    TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                    final String str = sb;
                    checkusername.username = str;
                    final int i5 = i2;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
                    ic icVar = new ic(b);
                    final int[] iArr4 = iArr2;
                    final String[] strArr2 = strArr;
                    final c51 c51Var2 = c51Var;
                    final cv2 cv2Var2 = cv2Var;
                    final TreeSet treeSet2 = treeSet;
                    final zd zdVar2 = zdVar;
                    final vnb vnbVar2 = vnbVar;
                    final ilb ilbVar2 = ilbVar;
                    final nx0 nx0Var2 = nx0Var;
                    iArr4[0] = connectionsManager.sendRequestTyped(checkusername, icVar, new icc() { // from class: n03
                        @Override // icc
                        public final void a(Object obj, Object obj2) {
                            TLRPC.Bool bool = (TLRPC.Bool) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            if (zArr2[0]) {
                                return;
                            }
                            if (i4 == iArr3[0]) {
                                iArr4[0] = -1;
                                boolean z = bool instanceof TLRPC.TL_boolTrue;
                                String str2 = str;
                                c51 c51Var3 = c51Var2;
                                if (z) {
                                    strArr2[0] = str2;
                                    c51Var3.setEnabled(true);
                                    cv2Var2.run();
                                    return;
                                }
                                String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                                int i6 = i5;
                                TreeSet treeSet3 = treeSet2;
                                zd zdVar3 = zdVar2;
                                vnb vnbVar3 = vnbVar2;
                                CharSequence d = t03.d(i6, str2, treeSet3, str3, zdVar3, vnbVar3);
                                CharSequence M0 = d != null ? d : ob6.M0(2131751692, null);
                                ilb ilbVar3 = ilbVar2;
                                ilbVar3.setText(M0);
                                yob.X(ilbVar3.getTextView(), aob.q7, vnbVar3);
                                if (d != null || tL_error == null) {
                                    return;
                                }
                                c51Var3.setEnabled(true);
                                ik8.u(nx0Var2.F, vnbVar3, tL_error, false);
                            }
                        }
                    });
                }
            }
        };
        runnableArr[0] = runnable;
        hl.d3(runnable, 300L);
    }
}
