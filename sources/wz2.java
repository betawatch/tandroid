// default package

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wz2 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ eg F;
    public final /* synthetic */ fx0 G;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ tn6 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ u41 e;
    public final /* synthetic */ it3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ jn1 n;
    public final /* synthetic */ mhb r;
    public final /* synthetic */ wjb s;
    public final /* synthetic */ int[] w;
    public final /* synthetic */ Runnable[] x;
    public final /* synthetic */ int[] y;

    public /* synthetic */ wz2(boolean[] zArr, int[] iArr, tn6 tn6Var, String[] strArr, u41 u41Var, it3 it3Var, TreeSet treeSet, jn1 jn1Var, mhb mhbVar, wjb wjbVar, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i, eg egVar, fx0 fx0Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = tn6Var;
        this.d = strArr;
        this.e = u41Var;
        this.f = it3Var;
        this.h = treeSet;
        this.n = jn1Var;
        this.r = mhbVar;
        this.s = wjbVar;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.E = i;
        this.F = egVar;
        this.G = fx0Var;
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
        final u41 u41Var = this.e;
        u41Var.setLoading(false);
        u41Var.setEnabled(false);
        String charSequence = this.f.getText().toString();
        StringBuilder r = tb4.r(charSequence);
        boolean a = a03.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        r.append((a || a03.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb = r.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final jn1 jn1Var = this.n;
        if (isEmpty) {
            jn1Var.run();
            return;
        }
        int length = sb.length();
        final mhb mhbVar = this.r;
        final wjb wjbVar = this.s;
        if (length < 4 || sb.length() > 32) {
            mhbVar.setText(k96.M0(sb.length() < 4 ? 2131743415 : 2131743416, null));
            zkb.X(mhbVar.getTextView(), bkb.p7, wjbVar);
            return;
        }
        mhbVar.setText(k96.M0(2131743427, null));
        zkb.X(mhbVar.getTextView(), bkb.A6, wjbVar);
        final int[] iArr = this.w;
        final int i = iArr[0];
        final Runnable[] runnableArr = this.x;
        final int[] iArr2 = this.y;
        final int i2 = this.E;
        final eg egVar = this.F;
        final fx0 fx0Var = this.G;
        Runnable runnable = new Runnable() { // from class: sz2
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
                    hc hcVar = new hc(b);
                    final int[] iArr4 = iArr2;
                    final String[] strArr2 = strArr;
                    final u41 u41Var2 = u41Var;
                    final jn1 jn1Var2 = jn1Var;
                    final TreeSet treeSet2 = treeSet;
                    final eg egVar2 = egVar;
                    final wjb wjbVar2 = wjbVar;
                    final mhb mhbVar2 = mhbVar;
                    final fx0 fx0Var2 = fx0Var;
                    iArr4[0] = connectionsManager.sendRequestTyped(checkusername, hcVar, new i8c() { // from class: uz2
                        @Override // i8c
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
                                u41 u41Var3 = u41Var2;
                                if (z) {
                                    strArr2[0] = str2;
                                    u41Var3.setEnabled(true);
                                    jn1Var2.run();
                                    return;
                                }
                                String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                                int i6 = i5;
                                TreeSet treeSet3 = treeSet2;
                                eg egVar3 = egVar2;
                                wjb wjbVar3 = wjbVar2;
                                CharSequence d = a03.d(i6, str2, treeSet3, str3, egVar3, wjbVar3);
                                CharSequence M0 = d != null ? d : k96.M0(2131751715, null);
                                mhb mhbVar3 = mhbVar2;
                                mhbVar3.setText(M0);
                                zkb.X(mhbVar3.getTextView(), bkb.p7, wjbVar3);
                                if (d != null || tL_error == null) {
                                    return;
                                }
                                u41Var3.setEnabled(true);
                                ug8.u(fx0Var2.F, wjbVar3, tL_error, false);
                            }
                        }
                    });
                }
            }
        };
        runnableArr[0] = runnable;
        gl.d3(runnable, 300L);
    }
}
