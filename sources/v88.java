// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v88 extends i98 {
    public final jl5 a;
    public final /* synthetic */ o98 b;
    public final /* synthetic */ k27 c;
    public final /* synthetic */ jm6 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public v88(PhotoViewer photoViewer, o98 o98Var, k27 k27Var, jm6 jm6Var, boolean z, boolean z2) {
        this.g = photoViewer;
        this.b = o98Var;
        this.c = k27Var;
        this.d = jm6Var;
        this.e = z;
        this.f = z2;
        this.a = photoViewer.B4.p();
    }

    @Override // i98, o98
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        d0(oacVar, z, i2, false, z2);
    }

    @Override // i98, o98
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        o98 o98Var = this.b;
        if (o98Var != null) {
            return o98Var.M(this.c, null, 0, z, false);
        }
        return null;
    }

    @Override // i98, o98
    public final k27 V() {
        return this.c;
    }

    @Override // i98, o98
    public final void c(oac oacVar) {
        jm6 jm6Var = this.d;
        if (jm6Var.w || jm6Var.v || jm6Var.u || oacVar != null || !TextUtils.isEmpty(jm6Var.a)) {
            d0(oacVar, false, 0, true, false);
        }
    }

    public final void d0(oac oacVar, boolean z, int i, boolean z2, boolean z3) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.k4 != null) {
            bu1 bu1Var = null;
            k27 k27Var = this.c;
            k27 k27Var2 = z2 ? k27Var : null;
            jm6 jm6Var = this.d;
            if (k27Var2 != null && !TextUtils.isEmpty(jm6Var.a)) {
                k27Var2.y1 = jm6Var.a;
                k27Var2.z1 = jm6Var.n;
            }
            if (z2 || k27Var == null) {
                mu1 mu1Var = photoViewer.k4;
                k27Var = mu1Var.F5;
                bu1Var = mu1Var.D5;
            }
            bu1 bu1Var2 = bu1Var;
            k27 k27Var3 = k27Var;
            if (!jm6Var.b) {
                k27 k27Var4 = k27Var2;
                if (jm6Var.h != null) {
                    j5 accountInstance = photoViewer.k4.getAccountInstance();
                    String str = jm6Var.h;
                    String str2 = jm6Var.c;
                    long a = photoViewer.k4.a();
                    mu1 mu1Var2 = photoViewer.k4;
                    z3a.Y(accountInstance, str, str2, null, a, k27Var3, mu1Var2.m4, bu1Var2, jm6Var.n, jm6Var.r, null, jm6Var.x, k27Var4, oacVar, z, i, z3, jm6Var.a, mu1Var2.Q6(), 0L, 0L, photoViewer.k4.c7(), photoViewer.k4.y5);
                    return;
                }
                if (jm6Var.I != null) {
                    j5 accountInstance2 = photoViewer.k4.getAccountInstance();
                    String str3 = jm6Var.I;
                    String str4 = jm6Var.c;
                    long a2 = photoViewer.k4.a();
                    mu1 mu1Var3 = photoViewer.k4;
                    z3a.Y(accountInstance2, str3, str4, null, a2, k27Var3, mu1Var3.m4, bu1Var2, jm6Var.n, jm6Var.r, null, jm6Var.x, k27Var4, oacVar, z, i, z3, jm6Var.a, mu1Var3.Q6(), 0L, 0L, photoViewer.k4.c7(), photoViewer.k4.y5);
                    return;
                }
                return;
            }
            mu1 mu1Var4 = photoViewer.k4;
            if (oacVar != null) {
                j5 accountInstance3 = mu1Var4.getAccountInstance();
                String str5 = jm6Var.I;
                long a3 = photoViewer.k4.a();
                mu1 mu1Var5 = photoViewer.k4;
                k27 k27Var5 = mu1Var5.m4;
                ArrayList arrayList = jm6Var.n;
                k27 k27Var6 = k27Var2;
                int i2 = jm6Var.x;
                boolean z4 = jm6Var.M;
                z3a.a0(i2, i, a3, 0L, 0L, photoViewer.k4.c7(), accountInstance3, bu1Var2, k27Var3, k27Var5, k27Var6, photoViewer.k4.y5, mu1Var5.Q6(), oacVar, jm6Var.a, str5, null, arrayList, null, null, z, z3, z4);
                return;
            }
            k27 k27Var7 = k27Var2;
            j5 accountInstance4 = mu1Var4.getAccountInstance();
            String str6 = jm6Var.I;
            long a4 = photoViewer.k4.a();
            mu1 mu1Var6 = photoViewer.k4;
            k27 k27Var8 = mu1Var6.m4;
            ArrayList arrayList2 = jm6Var.n;
            int i3 = jm6Var.x;
            boolean z5 = jm6Var.M;
            z3a.a0(i3, i, a4, 0L, 0L, photoViewer.k4.c7(), accountInstance4, bu1Var2, k27Var3, k27Var8, k27Var7, photoViewer.k4.y5, mu1Var6.Q6(), null, jm6Var.a, str6, null, arrayList2, null, null, z, z3, z5);
        }
    }

    @Override // i98, o98
    public final boolean h() {
        return false;
    }

    @Override // i98, o98
    public final jl5 k(int i) {
        return this.a;
    }

    @Override // i98, o98
    public final boolean o() {
        return this.b != null && this.e;
    }

    @Override // i98, o98
    public final boolean q() {
        return this.b != null && this.f;
    }
}
